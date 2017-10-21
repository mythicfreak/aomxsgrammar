package aom.scripting.xs.scoping;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

import com.google.inject.Inject;

import aom.scripting.xs.xs.FunctionDeclaration;
import aom.scripting.xs.xs.GlobalVarDeclaration;
import aom.scripting.xs.xs.IncludeDeclaration;

public class XSResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	
//	@Inject
//	private IResourceDescriptionsProvider resourceDescriptionsProvider;
	
	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;
	
	@Override
	public boolean createEObjectDescriptions(final EObject eObject, final IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof IncludeDeclaration) {
			acceptor.accept(EObjectDescription.create(QualifiedName.create("include", ((IncludeDeclaration) eObject).getFilePath()), eObject));
			return false;
			// this results in ClassCastExceptions in xtext as it somehow thinks all exported objects are this include statement
//			final Iterable<IEObjectDescription> imported = XSScopeProvider.getExportedObjects(resourceDescriptionsProvider, eObject.eResource(), ((IncludeStatement) eObject).getFilePath());
//			if (imported != null) {
//				for (final IEObjectDescription od : imported)
//					acceptor.accept(od);
//			}
//			return false;
		}
		final QualifiedName name = qualifiedNameProvider.getFullyQualifiedName(eObject);
		if (name == null || name.getSegmentCount() != 1)
			return true; // only export top-level stuff
			
		if (eObject instanceof GlobalVarDeclaration && !((GlobalVarDeclaration) eObject).isExtern())
			return false; // only export 'extern' global variables
			
		Map<String, String> userData = null;
		if (eObject instanceof FunctionDeclaration) {
			userData = new HashMap<>();
			userData.put("mutable", "" + ((FunctionDeclaration) eObject).isMutable());
		}
		
		acceptor.accept(EObjectDescription.create(name, eObject, userData));
		return false;
	}
	
}
