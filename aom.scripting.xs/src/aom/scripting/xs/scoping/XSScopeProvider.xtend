/*
 * generated by Xtext
 */
package aom.scripting.xs.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.naming.QualifiedName
import java.util.Arrays
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.naming.IQualifiedNameProvider
import aom.scripting.xs.xs.Program
import com.google.inject.Inject
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.IContainer
import com.google.inject.Provider
import org.eclipse.xtext.scoping.impl.LoadOnDemandResourceDescriptions
import org.eclipse.emf.common.util.URI
import aom.scripting.xs.xs.GlobalVarDeclaration
import aom.scripting.xs.xs.RuleDeclaration
import aom.scripting.xs.xs.Declaration
import aom.scripting.xs.xs.VarDeclaration
import org.eclipse.xtext.resource.IResourceDescriptionsProvider
import java.util.Collections
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.IEObjectDescription
import aom.scripting.xs.xs.XsPackage
import aom.scripting.xs.xs.impl.XsPackageImpl
import aom.scripting.xs.xs.IncludeDeclaration
import aom.scripting.xs.xs.FunctionDeclaration
import java.util.ArrayList

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 * 
 */
class XSScopeProvider extends org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider {

	override getScope(EObject context, EReference reference) {
		return new XSScope(this, context, reference)
	}

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	@Inject
	private IResourceDescriptionsProvider resourceDescriptionsProvider;

	public def static getFile(IResourceDescriptionsProvider resourceDescriptionsProvider, Resource eResource,
		String file) {
		if (file == null)
			return null;
		val f = file.split("/").map[s|URI.encodeSegment(s, false)];
		return resourceDescriptionsProvider.getResourceDescriptions(eResource.resourceSet).allResourceDescriptions.
			findFirst [ rd |
				rd.URI.segmentsList.drop(2).elementsEqual(f)
			];
	}

	public def static getExportedObjects(IResourceDescriptionsProvider resourceDescriptionsProvider, Resource eResource,
		String file) {
		getFile(resourceDescriptionsProvider, eResource, file)?.getExportedObjects();
	}

	static class XSScope implements IScope {
		XSScopeProvider p;
		EObject upToObject;
		// EReference upToReference;
		Program rootElement;

		new(XSScopeProvider p, EObject upToObject, EReference upToReference) {
			this.p = p;
			this.upToObject = upToObject;
			// this.upToReference = upToReference;
			rootElement = EcoreUtil2.getRootContainer(upToObject) as Program;
		}

		def EObjectDescription desc(EObject obj) {
			return new EObjectDescription(p.qualifiedNameProvider.getFullyQualifiedName(obj), obj, null);
		}

		def IEObjectDescription getFromFile(String file, QualifiedName name) {
			return getFromExportedObjects(getExportedObjects(p.resourceDescriptionsProvider, rootElement.eResource, file), name);
		}

		def IEObjectDescription getFromExportedObjects(Iterable<IEObjectDescription> exportedObjects, QualifiedName name) {
			if (exportedObjects != null) {
				for (eo : exportedObjects) {
					if (eo.EObjectOrProxy instanceof IncludeDeclaration) {
						val transitive = getFromFile(eo.name.getSegment(1), name); // second segment is the path
						if (transitive != null)
							return transitive;
					} else if (eo.name.equals(name)) {
						return eo;
					}
				}
			}
			return null;
		}

		// scoping rules:
		// - scoping is linear from the top of the file to the current object, i.e. declarations after the current objects are not visible
		// --- can make forward declarations of functions with 'mutable <header> {}'
		// - case sensitive
		override getSingleElement(QualifiedName name) {
			// check base library - here done via any project that has a file named __std__.xs
			val __std__ = getFile(p.resourceDescriptionsProvider, rootElement.eResource, "__std__.xs");
			// ignore base library in the base library itself
			if (__std__ != null && (__std__.URI.segmentsList.get(0) != rootElement.eResource.URI.segmentsList.get(0) ||
				__std__.URI.segmentsList.get(1) != rootElement.eResource.URI.segmentsList.get(1))) {
				val std = getFromExportedObjects(__std__.exportedObjects, name);
				if (std != null)
					return std;
			}

			val containingDeclaration = EcoreUtil2.getContainerOfType(upToObject, Declaration)
			for (decl : rootElement.declarations) {
				if (decl == upToObject)
					return null;
				switch (decl) {
					IncludeDeclaration: {
						val r = getFromFile(decl.filePath, name);
						if (r != null)
							return r;
					}
					GlobalVarDeclaration: {
						if (decl.name.equals(name.firstSegment))
							return desc(decl);
					}
					FunctionDeclaration: {
						if (decl.name.equals(name.firstSegment))
							return desc(decl);
					}
					RuleDeclaration: {
						if (decl.name.equals(name.firstSegment))
							return desc(decl);
					}
				}
				if (decl == containingDeclaration) { // i.e. current function or trigger
					val iter = decl.eAllContents;
					while (iter.hasNext) {
						val c = iter.next;
						if (c == upToObject)
							return null;
						if (c instanceof VarDeclaration &&
							(c as VarDeclaration).name.equals(name.firstSegment))
							return desc(c);
					};
					return null;
				}
			}
			return null;
		}

		override getSingleElement(EObject object) {
			return new EObjectDescription(p.qualifiedNameProvider.getFullyQualifiedName(object), object, null)
		}

		override getElements(QualifiedName name) {
			return Arrays.asList(getSingleElement(name))
		}

		override getElements(EObject object) {
			return Arrays.asList(getSingleElement(object))
		}

		override getAllElements() {
			var result = new ArrayList<IEObjectDescription>();

			val std = getExportedObjects(p.resourceDescriptionsProvider, rootElement.eResource, "__std__.xs");
			if (std != null)
				result.addAll(std);

			val containingDeclaration = EcoreUtil2.getContainerOfType(upToObject, Declaration)
			for (decl : rootElement.declarations) {
				if (decl == upToObject)
					return result;
				switch (decl) {
					IncludeDeclaration: {
						val r = getExportedObjects(p.resourceDescriptionsProvider, rootElement.eResource,
							decl.filePath);
						if (r != null)
							result.addAll(r);
					}
					GlobalVarDeclaration,
					FunctionDeclaration,
					RuleDeclaration: {
						result.add(desc(decl));
					}
				}
				if (decl == containingDeclaration) { // i.e. current function or trigger
					val iter = decl.eAllContents;
					while (iter.hasNext) {
						val c = iter.next;
						if (c == upToObject)
							return result;
						if (c instanceof VarDeclaration)
							result.add(desc(c));
					};
				}
			}
			// shouldn't even get here
			return result
		}

	}

}
