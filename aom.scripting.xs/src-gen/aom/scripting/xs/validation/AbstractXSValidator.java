/*
 * generated by Xtext
 */
package aom.scripting.xs.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractXSValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(aom.scripting.xs.xs.XsPackage.eINSTANCE);
		return result;
	}
}
