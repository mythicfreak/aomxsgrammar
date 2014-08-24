package aom.scripting.xs.typesystem;

import aom.scripting.xs.xs.XsPackage;
import de.itemis.xtext.typesystem.DefaultTypesystem;
import de.itemis.xtext.typesystem.exceptions.TypesystemConfigurationException;

public class XsTypesystem extends DefaultTypesystem {
	@Override
	protected void initialize() {
		XsPackage lang = XsPackage.eINSTANCE;
		try {
			useCloneAsType(lang.getIntType());
			useCloneAsType(lang.getBoolType());
			useCloneAsType(lang.getFloatType());
			useCloneAsType(lang.getStringType());
			useCloneAsType(lang.getVectorType());
			useCloneAsType(lang.getVoidType());
			
			useFixedType(lang.getLiteralInt(), lang.getIntType());
			useFixedType(lang.getLiteralBool(), lang.getBoolType());
			useFixedType(lang.getLiteralFloat(), lang.getFloatType());
			useFixedType(lang.getLiteralString(), lang.getStringType());
			useFixedType(lang.getLiteralVector(), lang.getVectorType());
			
			useFixedType(lang.getOr(), lang.getBoolType());
			useFixedType(lang.getAnd(), lang.getBoolType());
			useFixedType(lang.getEquals(), lang.getBoolType());
			useFixedType(lang.getComparison(), lang.getBoolType());
			useFixedType(lang.getTerm(), lang.getIntType()); //or float or string...
			useFixedType(lang.getFactor(), lang.getIntType()); //or float
			
			useTypeOfFeature(lang.getVarDeclaration(), lang.getVarDeclaration_Type());
			useTypeOfFeature(lang.getVar(), lang.getVar_Name()); //reference to VarDeclaration
			useTypeOfFeature(lang.getFunDeclaration(), lang.getFunDeclaration_Type());
			useTypeOfFeature(lang.getCall(), lang.getCall_Function()); //reference to FunDeclaration
		} catch (TypesystemConfigurationException e) {
			e.printStackTrace();
		}
	}
}
