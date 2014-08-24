/**
 */
package aom.scripting.xs.xs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see aom.scripting.xs.xs.XsFactory
 * @model kind="package"
 * @generated
 */
public interface XsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "xs";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://aom.eso.com/xs";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "xs";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XsPackage eINSTANCE = aom.scripting.xs.xs.impl.XsPackageImpl.init();

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.ProgramImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.DeclarationImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.LiteralOrConstantNumImpl <em>Literal Or Constant Num</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.LiteralOrConstantNumImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteralOrConstantNum()
   * @generated
   */
  int LITERAL_OR_CONSTANT_NUM = 3;

  /**
   * The number of structural features of the '<em>Literal Or Constant Num</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_OR_CONSTANT_NUM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.ConstantNumImpl <em>Constant Num</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.ConstantNumImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getConstantNum()
   * @generated
   */
  int CONSTANT_NUM = 2;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_NUM__VAR = LITERAL_OR_CONSTANT_NUM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant Num</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_NUM_FEATURE_COUNT = LITERAL_OR_CONSTANT_NUM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.VectorImpl <em>Vector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.VectorImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVector()
   * @generated
   */
  int VECTOR = 4;

  /**
   * The feature id for the '<em><b>X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__Y = 1;

  /**
   * The feature id for the '<em><b>Z</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__Z = 2;

  /**
   * The number of structural features of the '<em>Vector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.VarDeclarationImpl <em>Var Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.VarDeclarationImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVarDeclaration()
   * @generated
   */
  int VAR_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION__MODIFIER = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION__TYPE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION__VALUE = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Var Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.FunDeclarationImpl <em>Fun Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.FunDeclarationImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getFunDeclaration()
   * @generated
   */
  int FUN_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_DECLARATION__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_DECLARATION__MODIFIER = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_DECLARATION__TYPE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Paramlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_DECLARATION__PARAMLIST = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_DECLARATION__STATEMENTS = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Fun Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.IncludeStatementImpl <em>Include Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.IncludeStatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getIncludeStatement()
   * @generated
   */
  int INCLUDE_STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_STATEMENT__NAME = DECLARATION__NAME;

  /**
   * The number of structural features of the '<em>Include Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_STATEMENT_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl <em>Rule Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.RuleDeclarationImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getRuleDeclaration()
   * @generated
   */
  int RULE_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__ACTIVE = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Run Immediately</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__RUN_IMMEDIATELY = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>High Frequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__HIGH_FREQUENCY = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__GROUP = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Min Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__MIN_INTERVAL = DECLARATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Max Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__MAX_INTERVAL = DECLARATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__STATEMENTS = DECLARATION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Rule Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.VarModifierImpl <em>Var Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.VarModifierImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVarModifier()
   * @generated
   */
  int VAR_MODIFIER = 9;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_MODIFIER__STATIC = 0;

  /**
   * The feature id for the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_MODIFIER__CONST = 1;

  /**
   * The feature id for the '<em><b>Extern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_MODIFIER__EXTERN = 2;

  /**
   * The number of structural features of the '<em>Var Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_MODIFIER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.FunModifierImpl <em>Fun Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.FunModifierImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getFunModifier()
   * @generated
   */
  int FUN_MODIFIER = 10;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_MODIFIER__STATIC = 0;

  /**
   * The feature id for the '<em><b>Mutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_MODIFIER__MUTABLE = 1;

  /**
   * The number of structural features of the '<em>Fun Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_MODIFIER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.FunTypeSpecifierImpl <em>Fun Type Specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.FunTypeSpecifierImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getFunTypeSpecifier()
   * @generated
   */
  int FUN_TYPE_SPECIFIER = 18;

  /**
   * The number of structural features of the '<em>Fun Type Specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_TYPE_SPECIFIER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.VarTypeSpecifierImpl <em>Var Type Specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.VarTypeSpecifierImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVarTypeSpecifier()
   * @generated
   */
  int VAR_TYPE_SPECIFIER = 17;

  /**
   * The number of structural features of the '<em>Var Type Specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_TYPE_SPECIFIER_FEATURE_COUNT = FUN_TYPE_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.IntTypeImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 11;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = VAR_TYPE_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.FloatTypeImpl <em>Float Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.FloatTypeImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getFloatType()
   * @generated
   */
  int FLOAT_TYPE = 12;

  /**
   * The number of structural features of the '<em>Float Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_TYPE_FEATURE_COUNT = VAR_TYPE_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.BoolTypeImpl <em>Bool Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.BoolTypeImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getBoolType()
   * @generated
   */
  int BOOL_TYPE = 13;

  /**
   * The number of structural features of the '<em>Bool Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_TYPE_FEATURE_COUNT = VAR_TYPE_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.VectorTypeImpl <em>Vector Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.VectorTypeImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVectorType()
   * @generated
   */
  int VECTOR_TYPE = 14;

  /**
   * The number of structural features of the '<em>Vector Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_TYPE_FEATURE_COUNT = VAR_TYPE_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.StringTypeImpl <em>String Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.StringTypeImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getStringType()
   * @generated
   */
  int STRING_TYPE = 15;

  /**
   * The number of structural features of the '<em>String Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE_FEATURE_COUNT = VAR_TYPE_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.VoidTypeImpl <em>Void Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.VoidTypeImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVoidType()
   * @generated
   */
  int VOID_TYPE = 16;

  /**
   * The number of structural features of the '<em>Void Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID_TYPE_FEATURE_COUNT = FUN_TYPE_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.ParamsImpl <em>Params</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.ParamsImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getParams()
   * @generated
   */
  int PARAMS = 19;

  /**
   * The feature id for the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS__PARAM = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Params</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.VarDeclarationOrStatementImpl <em>Var Declaration Or Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.VarDeclarationOrStatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVarDeclarationOrStatement()
   * @generated
   */
  int VAR_DECLARATION_OR_STATEMENT = 21;

  /**
   * The number of structural features of the '<em>Var Declaration Or Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION_OR_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.StatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 22;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = VAR_DECLARATION_OR_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.CompoundStatementImpl <em>Compound Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.CompoundStatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getCompoundStatement()
   * @generated
   */
  int COMPOUND_STATEMENT = 20;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATEMENT__CONTENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Compound Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.ExpressionStatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getExpressionStatement()
   * @generated
   */
  int EXPRESSION_STATEMENT = 23;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.IfElseStatementImpl <em>If Else Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.IfElseStatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getIfElseStatement()
   * @generated
   */
  int IF_ELSE_STATEMENT = 24;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_ELSE_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>If Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_ELSE_STATEMENT__IF_STATEMENT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_ELSE_STATEMENT__ELSE_STATEMENT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Else Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_ELSE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.WhileStatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.WhileStatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getWhileStatement()
   * @generated
   */
  int WHILE_STATEMENT = 25;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.ForStatementImpl <em>For Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.ForStatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getForStatement()
   * @generated
   */
  int FOR_STATEMENT = 26;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__VAR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__OP = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>For Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.SwitchStatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getSwitchStatement()
   * @generated
   */
  int SWITCH_STATEMENT = 27;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__VAR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__CASES = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__DEFAULT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Switch Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.SwitchCaseImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getSwitchCase()
   * @generated
   */
  int SWITCH_CASE = 28;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE__VAR = 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE__STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Switch Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.SwitchDefaultImpl <em>Switch Default</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.SwitchDefaultImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getSwitchDefault()
   * @generated
   */
  int SWITCH_DEFAULT = 29;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_DEFAULT__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>Switch Default</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_DEFAULT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.ReturnStatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getReturnStatement()
   * @generated
   */
  int RETURN_STATEMENT = 30;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.ContinueStatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getContinueStatement()
   * @generated
   */
  int CONTINUE_STATEMENT = 31;

  /**
   * The number of structural features of the '<em>Continue Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.BreakStatementImpl <em>Break Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.BreakStatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getBreakStatement()
   * @generated
   */
  int BREAK_STATEMENT = 32;

  /**
   * The number of structural features of the '<em>Break Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.ExpressionImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.VarImpl <em>Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.VarImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVar()
   * @generated
   */
  int VAR = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__NAME = 0;

  /**
   * The number of structural features of the '<em>Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.CallImpl <em>Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.CallImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getCall()
   * @generated
   */
  int CALL = 35;

  /**
   * The feature id for the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__FUNCTION = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__ARGS = 1;

  /**
   * The number of structural features of the '<em>Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.ArgumentsImpl <em>Arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.ArgumentsImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getArguments()
   * @generated
   */
  int ARGUMENTS = 36;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.SignedNumImpl <em>Signed Num</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.SignedNumImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getSignedNum()
   * @generated
   */
  int SIGNED_NUM = 37;

  /**
   * The number of structural features of the '<em>Signed Num</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_NUM_FEATURE_COUNT = LITERAL_OR_CONSTANT_NUM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.EmptyExpressionStatementImpl <em>Empty Expression Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.EmptyExpressionStatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getEmptyExpressionStatement()
   * @generated
   */
  int EMPTY_EXPRESSION_STATEMENT = 38;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_EXPRESSION_STATEMENT__EXPRESSION = EXPRESSION_STATEMENT__EXPRESSION;

  /**
   * The number of structural features of the '<em>Empty Expression Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_EXPRESSION_STATEMENT_FEATURE_COUNT = EXPRESSION_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.AssignmentExpressionImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getAssignmentExpression()
   * @generated
   */
  int ASSIGNMENT_EXPRESSION = 39;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__VAR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.PostfixExpressionImpl <em>Postfix Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.PostfixExpressionImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getPostfixExpression()
   * @generated
   */
  int POSTFIX_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPRESSION__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Postfix Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPRESSION__POSTFIX_VAR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Postfix Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.OrImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getOr()
   * @generated
   */
  int OR = 41;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.AndImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getAnd()
   * @generated
   */
  int AND = 42;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.EqualsImpl <em>Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.EqualsImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getEquals()
   * @generated
   */
  int EQUALS = 43;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.ComparisonImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 44;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.TermImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getTerm()
   * @generated
   */
  int TERM = 45;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.FactorImpl <em>Factor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.FactorImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getFactor()
   * @generated
   */
  int FACTOR = 46;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Factor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.PrimaryExpressionImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getPrimaryExpression()
   * @generated
   */
  int PRIMARY_EXPRESSION = 47;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.LiteralIntImpl <em>Literal Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.LiteralIntImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteralInt()
   * @generated
   */
  int LITERAL_INT = 48;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_INT__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_INT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_INT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.LiteralFloatImpl <em>Literal Float</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.LiteralFloatImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteralFloat()
   * @generated
   */
  int LITERAL_FLOAT = 49;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FLOAT__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FLOAT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Float</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FLOAT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.LiteralBoolImpl <em>Literal Bool</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.LiteralBoolImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteralBool()
   * @generated
   */
  int LITERAL_BOOL = 50;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_BOOL__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_BOOL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Bool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_BOOL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.LiteralVectorImpl <em>Literal Vector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.LiteralVectorImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteralVector()
   * @generated
   */
  int LITERAL_VECTOR = 51;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_VECTOR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_VECTOR__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Vector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_VECTOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.LiteralStringImpl <em>Literal String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.LiteralStringImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteralString()
   * @generated
   */
  int LITERAL_STRING = 52;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_STRING__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_STRING__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_STRING_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see aom.scripting.xs.xs.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link aom.scripting.xs.xs.Program#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see aom.scripting.xs.xs.Program#getDeclarations()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Declarations();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see aom.scripting.xs.xs.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.Declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see aom.scripting.xs.xs.Declaration#getName()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Name();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.ConstantNum <em>Constant Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Num</em>'.
   * @see aom.scripting.xs.xs.ConstantNum
   * @generated
   */
  EClass getConstantNum();

  /**
   * Returns the meta object for the reference '{@link aom.scripting.xs.xs.ConstantNum#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see aom.scripting.xs.xs.ConstantNum#getVar()
   * @see #getConstantNum()
   * @generated
   */
  EReference getConstantNum_Var();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.LiteralOrConstantNum <em>Literal Or Constant Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Or Constant Num</em>'.
   * @see aom.scripting.xs.xs.LiteralOrConstantNum
   * @generated
   */
  EClass getLiteralOrConstantNum();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Vector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector</em>'.
   * @see aom.scripting.xs.xs.Vector
   * @generated
   */
  EClass getVector();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Vector#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>X</em>'.
   * @see aom.scripting.xs.xs.Vector#getX()
   * @see #getVector()
   * @generated
   */
  EReference getVector_X();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Vector#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Y</em>'.
   * @see aom.scripting.xs.xs.Vector#getY()
   * @see #getVector()
   * @generated
   */
  EReference getVector_Y();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Vector#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Z</em>'.
   * @see aom.scripting.xs.xs.Vector#getZ()
   * @see #getVector()
   * @generated
   */
  EReference getVector_Z();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.VarDeclaration <em>Var Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Declaration</em>'.
   * @see aom.scripting.xs.xs.VarDeclaration
   * @generated
   */
  EClass getVarDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.VarDeclaration#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifier</em>'.
   * @see aom.scripting.xs.xs.VarDeclaration#getModifier()
   * @see #getVarDeclaration()
   * @generated
   */
  EReference getVarDeclaration_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.VarDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see aom.scripting.xs.xs.VarDeclaration#getType()
   * @see #getVarDeclaration()
   * @generated
   */
  EReference getVarDeclaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.VarDeclaration#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see aom.scripting.xs.xs.VarDeclaration#getValue()
   * @see #getVarDeclaration()
   * @generated
   */
  EReference getVarDeclaration_Value();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.FunDeclaration <em>Fun Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fun Declaration</em>'.
   * @see aom.scripting.xs.xs.FunDeclaration
   * @generated
   */
  EClass getFunDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.FunDeclaration#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifier</em>'.
   * @see aom.scripting.xs.xs.FunDeclaration#getModifier()
   * @see #getFunDeclaration()
   * @generated
   */
  EReference getFunDeclaration_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.FunDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see aom.scripting.xs.xs.FunDeclaration#getType()
   * @see #getFunDeclaration()
   * @generated
   */
  EReference getFunDeclaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.FunDeclaration#getParamlist <em>Paramlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Paramlist</em>'.
   * @see aom.scripting.xs.xs.FunDeclaration#getParamlist()
   * @see #getFunDeclaration()
   * @generated
   */
  EReference getFunDeclaration_Paramlist();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.FunDeclaration#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see aom.scripting.xs.xs.FunDeclaration#getStatements()
   * @see #getFunDeclaration()
   * @generated
   */
  EReference getFunDeclaration_Statements();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.IncludeStatement <em>Include Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Statement</em>'.
   * @see aom.scripting.xs.xs.IncludeStatement
   * @generated
   */
  EClass getIncludeStatement();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.RuleDeclaration <em>Rule Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Declaration</em>'.
   * @see aom.scripting.xs.xs.RuleDeclaration
   * @generated
   */
  EClass getRuleDeclaration();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.RuleDeclaration#isActive <em>Active</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Active</em>'.
   * @see aom.scripting.xs.xs.RuleDeclaration#isActive()
   * @see #getRuleDeclaration()
   * @generated
   */
  EAttribute getRuleDeclaration_Active();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.RuleDeclaration#isRunImmediately <em>Run Immediately</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Run Immediately</em>'.
   * @see aom.scripting.xs.xs.RuleDeclaration#isRunImmediately()
   * @see #getRuleDeclaration()
   * @generated
   */
  EAttribute getRuleDeclaration_RunImmediately();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.RuleDeclaration#isHighFrequency <em>High Frequency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>High Frequency</em>'.
   * @see aom.scripting.xs.xs.RuleDeclaration#isHighFrequency()
   * @see #getRuleDeclaration()
   * @generated
   */
  EAttribute getRuleDeclaration_HighFrequency();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.RuleDeclaration#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group</em>'.
   * @see aom.scripting.xs.xs.RuleDeclaration#getGroup()
   * @see #getRuleDeclaration()
   * @generated
   */
  EAttribute getRuleDeclaration_Group();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.RuleDeclaration#getMinInterval <em>Min Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Interval</em>'.
   * @see aom.scripting.xs.xs.RuleDeclaration#getMinInterval()
   * @see #getRuleDeclaration()
   * @generated
   */
  EAttribute getRuleDeclaration_MinInterval();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.RuleDeclaration#getMaxInterval <em>Max Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Interval</em>'.
   * @see aom.scripting.xs.xs.RuleDeclaration#getMaxInterval()
   * @see #getRuleDeclaration()
   * @generated
   */
  EAttribute getRuleDeclaration_MaxInterval();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.RuleDeclaration#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statements</em>'.
   * @see aom.scripting.xs.xs.RuleDeclaration#getStatements()
   * @see #getRuleDeclaration()
   * @generated
   */
  EReference getRuleDeclaration_Statements();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.VarModifier <em>Var Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Modifier</em>'.
   * @see aom.scripting.xs.xs.VarModifier
   * @generated
   */
  EClass getVarModifier();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.VarModifier#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see aom.scripting.xs.xs.VarModifier#isStatic()
   * @see #getVarModifier()
   * @generated
   */
  EAttribute getVarModifier_Static();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.VarModifier#isConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const</em>'.
   * @see aom.scripting.xs.xs.VarModifier#isConst()
   * @see #getVarModifier()
   * @generated
   */
  EAttribute getVarModifier_Const();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.VarModifier#isExtern <em>Extern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extern</em>'.
   * @see aom.scripting.xs.xs.VarModifier#isExtern()
   * @see #getVarModifier()
   * @generated
   */
  EAttribute getVarModifier_Extern();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.FunModifier <em>Fun Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fun Modifier</em>'.
   * @see aom.scripting.xs.xs.FunModifier
   * @generated
   */
  EClass getFunModifier();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.FunModifier#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see aom.scripting.xs.xs.FunModifier#isStatic()
   * @see #getFunModifier()
   * @generated
   */
  EAttribute getFunModifier_Static();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.FunModifier#isMutable <em>Mutable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mutable</em>'.
   * @see aom.scripting.xs.xs.FunModifier#isMutable()
   * @see #getFunModifier()
   * @generated
   */
  EAttribute getFunModifier_Mutable();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Type</em>'.
   * @see aom.scripting.xs.xs.IntType
   * @generated
   */
  EClass getIntType();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.FloatType <em>Float Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Type</em>'.
   * @see aom.scripting.xs.xs.FloatType
   * @generated
   */
  EClass getFloatType();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.BoolType <em>Bool Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Type</em>'.
   * @see aom.scripting.xs.xs.BoolType
   * @generated
   */
  EClass getBoolType();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.VectorType <em>Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector Type</em>'.
   * @see aom.scripting.xs.xs.VectorType
   * @generated
   */
  EClass getVectorType();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Type</em>'.
   * @see aom.scripting.xs.xs.StringType
   * @generated
   */
  EClass getStringType();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.VoidType <em>Void Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Void Type</em>'.
   * @see aom.scripting.xs.xs.VoidType
   * @generated
   */
  EClass getVoidType();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.VarTypeSpecifier <em>Var Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Type Specifier</em>'.
   * @see aom.scripting.xs.xs.VarTypeSpecifier
   * @generated
   */
  EClass getVarTypeSpecifier();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.FunTypeSpecifier <em>Fun Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fun Type Specifier</em>'.
   * @see aom.scripting.xs.xs.FunTypeSpecifier
   * @generated
   */
  EClass getFunTypeSpecifier();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Params <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Params</em>'.
   * @see aom.scripting.xs.xs.Params
   * @generated
   */
  EClass getParams();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.Params#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Param</em>'.
   * @see aom.scripting.xs.xs.Params#getParam()
   * @see #getParams()
   * @generated
   */
  EAttribute getParams_Param();

  /**
   * Returns the meta object for the containment reference list '{@link aom.scripting.xs.xs.Params#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see aom.scripting.xs.xs.Params#getParams()
   * @see #getParams()
   * @generated
   */
  EReference getParams_Params();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.CompoundStatement <em>Compound Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound Statement</em>'.
   * @see aom.scripting.xs.xs.CompoundStatement
   * @generated
   */
  EClass getCompoundStatement();

  /**
   * Returns the meta object for the containment reference list '{@link aom.scripting.xs.xs.CompoundStatement#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see aom.scripting.xs.xs.CompoundStatement#getContents()
   * @see #getCompoundStatement()
   * @generated
   */
  EReference getCompoundStatement_Contents();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.VarDeclarationOrStatement <em>Var Declaration Or Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Declaration Or Statement</em>'.
   * @see aom.scripting.xs.xs.VarDeclarationOrStatement
   * @generated
   */
  EClass getVarDeclarationOrStatement();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see aom.scripting.xs.xs.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.ExpressionStatement <em>Expression Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Statement</em>'.
   * @see aom.scripting.xs.xs.ExpressionStatement
   * @generated
   */
  EClass getExpressionStatement();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.ExpressionStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see aom.scripting.xs.xs.ExpressionStatement#getExpression()
   * @see #getExpressionStatement()
   * @generated
   */
  EReference getExpressionStatement_Expression();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.IfElseStatement <em>If Else Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Else Statement</em>'.
   * @see aom.scripting.xs.xs.IfElseStatement
   * @generated
   */
  EClass getIfElseStatement();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.IfElseStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see aom.scripting.xs.xs.IfElseStatement#getCondition()
   * @see #getIfElseStatement()
   * @generated
   */
  EReference getIfElseStatement_Condition();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.IfElseStatement#getIfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Statement</em>'.
   * @see aom.scripting.xs.xs.IfElseStatement#getIfStatement()
   * @see #getIfElseStatement()
   * @generated
   */
  EReference getIfElseStatement_IfStatement();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.IfElseStatement#getElseStatement <em>Else Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Statement</em>'.
   * @see aom.scripting.xs.xs.IfElseStatement#getElseStatement()
   * @see #getIfElseStatement()
   * @generated
   */
  EReference getIfElseStatement_ElseStatement();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Statement</em>'.
   * @see aom.scripting.xs.xs.WhileStatement
   * @generated
   */
  EClass getWhileStatement();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.WhileStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see aom.scripting.xs.xs.WhileStatement#getCondition()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_Condition();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.WhileStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see aom.scripting.xs.xs.WhileStatement#getStatement()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_Statement();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Statement</em>'.
   * @see aom.scripting.xs.xs.ForStatement
   * @generated
   */
  EClass getForStatement();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.ForStatement#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see aom.scripting.xs.xs.ForStatement#getVar()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Var();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.ForStatement#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see aom.scripting.xs.xs.ForStatement#getOp()
   * @see #getForStatement()
   * @generated
   */
  EAttribute getForStatement_Op();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.ForStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see aom.scripting.xs.xs.ForStatement#getExpression()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.ForStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see aom.scripting.xs.xs.ForStatement#getStatement()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Statement();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.SwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Statement</em>'.
   * @see aom.scripting.xs.xs.SwitchStatement
   * @generated
   */
  EClass getSwitchStatement();

  /**
   * Returns the meta object for the reference '{@link aom.scripting.xs.xs.SwitchStatement#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see aom.scripting.xs.xs.SwitchStatement#getVar()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_Var();

  /**
   * Returns the meta object for the containment reference list '{@link aom.scripting.xs.xs.SwitchStatement#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see aom.scripting.xs.xs.SwitchStatement#getCases()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_Cases();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.SwitchStatement#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see aom.scripting.xs.xs.SwitchStatement#getDefault()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_Default();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.SwitchCase <em>Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Case</em>'.
   * @see aom.scripting.xs.xs.SwitchCase
   * @generated
   */
  EClass getSwitchCase();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.SwitchCase#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see aom.scripting.xs.xs.SwitchCase#getVar()
   * @see #getSwitchCase()
   * @generated
   */
  EReference getSwitchCase_Var();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.SwitchCase#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see aom.scripting.xs.xs.SwitchCase#getStatement()
   * @see #getSwitchCase()
   * @generated
   */
  EReference getSwitchCase_Statement();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.SwitchDefault <em>Switch Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Default</em>'.
   * @see aom.scripting.xs.xs.SwitchDefault
   * @generated
   */
  EClass getSwitchDefault();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.SwitchDefault#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see aom.scripting.xs.xs.SwitchDefault#getStatement()
   * @see #getSwitchDefault()
   * @generated
   */
  EReference getSwitchDefault_Statement();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Statement</em>'.
   * @see aom.scripting.xs.xs.ReturnStatement
   * @generated
   */
  EClass getReturnStatement();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.ReturnStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see aom.scripting.xs.xs.ReturnStatement#getExpression()
   * @see #getReturnStatement()
   * @generated
   */
  EReference getReturnStatement_Expression();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.ContinueStatement <em>Continue Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Continue Statement</em>'.
   * @see aom.scripting.xs.xs.ContinueStatement
   * @generated
   */
  EClass getContinueStatement();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.BreakStatement <em>Break Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Break Statement</em>'.
   * @see aom.scripting.xs.xs.BreakStatement
   * @generated
   */
  EClass getBreakStatement();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see aom.scripting.xs.xs.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Expression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see aom.scripting.xs.xs.Expression#getExpression()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Expression();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var</em>'.
   * @see aom.scripting.xs.xs.Var
   * @generated
   */
  EClass getVar();

  /**
   * Returns the meta object for the reference '{@link aom.scripting.xs.xs.Var#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see aom.scripting.xs.xs.Var#getName()
   * @see #getVar()
   * @generated
   */
  EReference getVar_Name();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call</em>'.
   * @see aom.scripting.xs.xs.Call
   * @generated
   */
  EClass getCall();

  /**
   * Returns the meta object for the reference '{@link aom.scripting.xs.xs.Call#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function</em>'.
   * @see aom.scripting.xs.xs.Call#getFunction()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Function();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Call#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see aom.scripting.xs.xs.Call#getArgs()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Args();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Arguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arguments</em>'.
   * @see aom.scripting.xs.xs.Arguments
   * @generated
   */
  EClass getArguments();

  /**
   * Returns the meta object for the containment reference list '{@link aom.scripting.xs.xs.Arguments#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see aom.scripting.xs.xs.Arguments#getExpressions()
   * @see #getArguments()
   * @generated
   */
  EReference getArguments_Expressions();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.SignedNum <em>Signed Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signed Num</em>'.
   * @see aom.scripting.xs.xs.SignedNum
   * @generated
   */
  EClass getSignedNum();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.EmptyExpressionStatement <em>Empty Expression Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Expression Statement</em>'.
   * @see aom.scripting.xs.xs.EmptyExpressionStatement
   * @generated
   */
  EClass getEmptyExpressionStatement();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.AssignmentExpression <em>Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Expression</em>'.
   * @see aom.scripting.xs.xs.AssignmentExpression
   * @generated
   */
  EClass getAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.AssignmentExpression#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see aom.scripting.xs.xs.AssignmentExpression#getVar()
   * @see #getAssignmentExpression()
   * @generated
   */
  EReference getAssignmentExpression_Var();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.PostfixExpression <em>Postfix Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Postfix Expression</em>'.
   * @see aom.scripting.xs.xs.PostfixExpression
   * @generated
   */
  EClass getPostfixExpression();

  /**
   * Returns the meta object for the reference '{@link aom.scripting.xs.xs.PostfixExpression#getPostfixVar <em>Postfix Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Postfix Var</em>'.
   * @see aom.scripting.xs.xs.PostfixExpression#getPostfixVar()
   * @see #getPostfixExpression()
   * @generated
   */
  EReference getPostfixExpression_PostfixVar();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.PostfixExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see aom.scripting.xs.xs.PostfixExpression#getOp()
   * @see #getPostfixExpression()
   * @generated
   */
  EAttribute getPostfixExpression_Op();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see aom.scripting.xs.xs.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Or#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see aom.scripting.xs.xs.Or#getLeft()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Left();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.Or#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see aom.scripting.xs.xs.Or#getOp()
   * @see #getOr()
   * @generated
   */
  EAttribute getOr_Op();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Or#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see aom.scripting.xs.xs.Or#getRight()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Right();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see aom.scripting.xs.xs.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.And#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see aom.scripting.xs.xs.And#getLeft()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Left();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.And#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see aom.scripting.xs.xs.And#getOp()
   * @see #getAnd()
   * @generated
   */
  EAttribute getAnd_Op();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.And#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see aom.scripting.xs.xs.And#getRight()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Right();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Equals <em>Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equals</em>'.
   * @see aom.scripting.xs.xs.Equals
   * @generated
   */
  EClass getEquals();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Equals#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see aom.scripting.xs.xs.Equals#getLeft()
   * @see #getEquals()
   * @generated
   */
  EReference getEquals_Left();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.Equals#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see aom.scripting.xs.xs.Equals#getOp()
   * @see #getEquals()
   * @generated
   */
  EAttribute getEquals_Op();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Equals#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see aom.scripting.xs.xs.Equals#getRight()
   * @see #getEquals()
   * @generated
   */
  EReference getEquals_Right();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison</em>'.
   * @see aom.scripting.xs.xs.Comparison
   * @generated
   */
  EClass getComparison();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Comparison#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see aom.scripting.xs.xs.Comparison#getLeft()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Left();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.Comparison#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see aom.scripting.xs.xs.Comparison#getOp()
   * @see #getComparison()
   * @generated
   */
  EAttribute getComparison_Op();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Comparison#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see aom.scripting.xs.xs.Comparison#getRight()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Right();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see aom.scripting.xs.xs.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Term#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see aom.scripting.xs.xs.Term#getLeft()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Left();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.Term#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see aom.scripting.xs.xs.Term#getOp()
   * @see #getTerm()
   * @generated
   */
  EAttribute getTerm_Op();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Term#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see aom.scripting.xs.xs.Term#getRight()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Right();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Factor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factor</em>'.
   * @see aom.scripting.xs.xs.Factor
   * @generated
   */
  EClass getFactor();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Factor#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see aom.scripting.xs.xs.Factor#getLeft()
   * @see #getFactor()
   * @generated
   */
  EReference getFactor_Left();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.Factor#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see aom.scripting.xs.xs.Factor#getOp()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_Op();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Factor#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see aom.scripting.xs.xs.Factor#getRight()
   * @see #getFactor()
   * @generated
   */
  EReference getFactor_Right();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expression</em>'.
   * @see aom.scripting.xs.xs.PrimaryExpression
   * @generated
   */
  EClass getPrimaryExpression();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.LiteralInt <em>Literal Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Int</em>'.
   * @see aom.scripting.xs.xs.LiteralInt
   * @generated
   */
  EClass getLiteralInt();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.LiteralInt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see aom.scripting.xs.xs.LiteralInt#getValue()
   * @see #getLiteralInt()
   * @generated
   */
  EAttribute getLiteralInt_Value();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.LiteralFloat <em>Literal Float</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Float</em>'.
   * @see aom.scripting.xs.xs.LiteralFloat
   * @generated
   */
  EClass getLiteralFloat();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.LiteralFloat#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see aom.scripting.xs.xs.LiteralFloat#getValue()
   * @see #getLiteralFloat()
   * @generated
   */
  EAttribute getLiteralFloat_Value();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.LiteralBool <em>Literal Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Bool</em>'.
   * @see aom.scripting.xs.xs.LiteralBool
   * @generated
   */
  EClass getLiteralBool();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.LiteralBool#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see aom.scripting.xs.xs.LiteralBool#isValue()
   * @see #getLiteralBool()
   * @generated
   */
  EAttribute getLiteralBool_Value();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.LiteralVector <em>Literal Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Vector</em>'.
   * @see aom.scripting.xs.xs.LiteralVector
   * @generated
   */
  EClass getLiteralVector();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.LiteralVector#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see aom.scripting.xs.xs.LiteralVector#getValue()
   * @see #getLiteralVector()
   * @generated
   */
  EReference getLiteralVector_Value();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.LiteralString <em>Literal String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal String</em>'.
   * @see aom.scripting.xs.xs.LiteralString
   * @generated
   */
  EClass getLiteralString();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.LiteralString#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see aom.scripting.xs.xs.LiteralString#getValue()
   * @see #getLiteralString()
   * @generated
   */
  EAttribute getLiteralString_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XsFactory getXsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.ProgramImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__DECLARATIONS = eINSTANCE.getProgram_Declarations();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.DeclarationImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__NAME = eINSTANCE.getDeclaration_Name();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.ConstantNumImpl <em>Constant Num</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.ConstantNumImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getConstantNum()
     * @generated
     */
    EClass CONSTANT_NUM = eINSTANCE.getConstantNum();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_NUM__VAR = eINSTANCE.getConstantNum_Var();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.LiteralOrConstantNumImpl <em>Literal Or Constant Num</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.LiteralOrConstantNumImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteralOrConstantNum()
     * @generated
     */
    EClass LITERAL_OR_CONSTANT_NUM = eINSTANCE.getLiteralOrConstantNum();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.VectorImpl <em>Vector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.VectorImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVector()
     * @generated
     */
    EClass VECTOR = eINSTANCE.getVector();

    /**
     * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR__X = eINSTANCE.getVector_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR__Y = eINSTANCE.getVector_Y();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR__Z = eINSTANCE.getVector_Z();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.VarDeclarationImpl <em>Var Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.VarDeclarationImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVarDeclaration()
     * @generated
     */
    EClass VAR_DECLARATION = eINSTANCE.getVarDeclaration();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECLARATION__MODIFIER = eINSTANCE.getVarDeclaration_Modifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECLARATION__TYPE = eINSTANCE.getVarDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECLARATION__VALUE = eINSTANCE.getVarDeclaration_Value();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.FunDeclarationImpl <em>Fun Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.FunDeclarationImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getFunDeclaration()
     * @generated
     */
    EClass FUN_DECLARATION = eINSTANCE.getFunDeclaration();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUN_DECLARATION__MODIFIER = eINSTANCE.getFunDeclaration_Modifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUN_DECLARATION__TYPE = eINSTANCE.getFunDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Paramlist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUN_DECLARATION__PARAMLIST = eINSTANCE.getFunDeclaration_Paramlist();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUN_DECLARATION__STATEMENTS = eINSTANCE.getFunDeclaration_Statements();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.IncludeStatementImpl <em>Include Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.IncludeStatementImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getIncludeStatement()
     * @generated
     */
    EClass INCLUDE_STATEMENT = eINSTANCE.getIncludeStatement();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl <em>Rule Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.RuleDeclarationImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getRuleDeclaration()
     * @generated
     */
    EClass RULE_DECLARATION = eINSTANCE.getRuleDeclaration();

    /**
     * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_DECLARATION__ACTIVE = eINSTANCE.getRuleDeclaration_Active();

    /**
     * The meta object literal for the '<em><b>Run Immediately</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_DECLARATION__RUN_IMMEDIATELY = eINSTANCE.getRuleDeclaration_RunImmediately();

    /**
     * The meta object literal for the '<em><b>High Frequency</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_DECLARATION__HIGH_FREQUENCY = eINSTANCE.getRuleDeclaration_HighFrequency();

    /**
     * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_DECLARATION__GROUP = eINSTANCE.getRuleDeclaration_Group();

    /**
     * The meta object literal for the '<em><b>Min Interval</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_DECLARATION__MIN_INTERVAL = eINSTANCE.getRuleDeclaration_MinInterval();

    /**
     * The meta object literal for the '<em><b>Max Interval</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_DECLARATION__MAX_INTERVAL = eINSTANCE.getRuleDeclaration_MaxInterval();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_DECLARATION__STATEMENTS = eINSTANCE.getRuleDeclaration_Statements();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.VarModifierImpl <em>Var Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.VarModifierImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVarModifier()
     * @generated
     */
    EClass VAR_MODIFIER = eINSTANCE.getVarModifier();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_MODIFIER__STATIC = eINSTANCE.getVarModifier_Static();

    /**
     * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_MODIFIER__CONST = eINSTANCE.getVarModifier_Const();

    /**
     * The meta object literal for the '<em><b>Extern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_MODIFIER__EXTERN = eINSTANCE.getVarModifier_Extern();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.FunModifierImpl <em>Fun Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.FunModifierImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getFunModifier()
     * @generated
     */
    EClass FUN_MODIFIER = eINSTANCE.getFunModifier();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUN_MODIFIER__STATIC = eINSTANCE.getFunModifier_Static();

    /**
     * The meta object literal for the '<em><b>Mutable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUN_MODIFIER__MUTABLE = eINSTANCE.getFunModifier_Mutable();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.IntTypeImpl <em>Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.IntTypeImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getIntType()
     * @generated
     */
    EClass INT_TYPE = eINSTANCE.getIntType();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.FloatTypeImpl <em>Float Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.FloatTypeImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getFloatType()
     * @generated
     */
    EClass FLOAT_TYPE = eINSTANCE.getFloatType();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.BoolTypeImpl <em>Bool Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.BoolTypeImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getBoolType()
     * @generated
     */
    EClass BOOL_TYPE = eINSTANCE.getBoolType();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.VectorTypeImpl <em>Vector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.VectorTypeImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVectorType()
     * @generated
     */
    EClass VECTOR_TYPE = eINSTANCE.getVectorType();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.StringTypeImpl <em>String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.StringTypeImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getStringType()
     * @generated
     */
    EClass STRING_TYPE = eINSTANCE.getStringType();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.VoidTypeImpl <em>Void Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.VoidTypeImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVoidType()
     * @generated
     */
    EClass VOID_TYPE = eINSTANCE.getVoidType();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.VarTypeSpecifierImpl <em>Var Type Specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.VarTypeSpecifierImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVarTypeSpecifier()
     * @generated
     */
    EClass VAR_TYPE_SPECIFIER = eINSTANCE.getVarTypeSpecifier();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.FunTypeSpecifierImpl <em>Fun Type Specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.FunTypeSpecifierImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getFunTypeSpecifier()
     * @generated
     */
    EClass FUN_TYPE_SPECIFIER = eINSTANCE.getFunTypeSpecifier();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.ParamsImpl <em>Params</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.ParamsImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getParams()
     * @generated
     */
    EClass PARAMS = eINSTANCE.getParams();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMS__PARAM = eINSTANCE.getParams_Param();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMS__PARAMS = eINSTANCE.getParams_Params();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.CompoundStatementImpl <em>Compound Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.CompoundStatementImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getCompoundStatement()
     * @generated
     */
    EClass COMPOUND_STATEMENT = eINSTANCE.getCompoundStatement();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_STATEMENT__CONTENTS = eINSTANCE.getCompoundStatement_Contents();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.VarDeclarationOrStatementImpl <em>Var Declaration Or Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.VarDeclarationOrStatementImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVarDeclarationOrStatement()
     * @generated
     */
    EClass VAR_DECLARATION_OR_STATEMENT = eINSTANCE.getVarDeclarationOrStatement();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.StatementImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.ExpressionStatementImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getExpressionStatement()
     * @generated
     */
    EClass EXPRESSION_STATEMENT = eINSTANCE.getExpressionStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_STATEMENT__EXPRESSION = eINSTANCE.getExpressionStatement_Expression();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.IfElseStatementImpl <em>If Else Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.IfElseStatementImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getIfElseStatement()
     * @generated
     */
    EClass IF_ELSE_STATEMENT = eINSTANCE.getIfElseStatement();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_ELSE_STATEMENT__CONDITION = eINSTANCE.getIfElseStatement_Condition();

    /**
     * The meta object literal for the '<em><b>If Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_ELSE_STATEMENT__IF_STATEMENT = eINSTANCE.getIfElseStatement_IfStatement();

    /**
     * The meta object literal for the '<em><b>Else Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_ELSE_STATEMENT__ELSE_STATEMENT = eINSTANCE.getIfElseStatement_ElseStatement();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.WhileStatementImpl <em>While Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.WhileStatementImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getWhileStatement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__CONDITION = eINSTANCE.getWhileStatement_Condition();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__STATEMENT = eINSTANCE.getWhileStatement_Statement();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.ForStatementImpl <em>For Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.ForStatementImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getForStatement()
     * @generated
     */
    EClass FOR_STATEMENT = eINSTANCE.getForStatement();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__VAR = eINSTANCE.getForStatement_Var();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_STATEMENT__OP = eINSTANCE.getForStatement_Op();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__EXPRESSION = eINSTANCE.getForStatement_Expression();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__STATEMENT = eINSTANCE.getForStatement_Statement();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.SwitchStatementImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getSwitchStatement()
     * @generated
     */
    EClass SWITCH_STATEMENT = eINSTANCE.getSwitchStatement();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__VAR = eINSTANCE.getSwitchStatement_Var();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__CASES = eINSTANCE.getSwitchStatement_Cases();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__DEFAULT = eINSTANCE.getSwitchStatement_Default();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.SwitchCaseImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getSwitchCase()
     * @generated
     */
    EClass SWITCH_CASE = eINSTANCE.getSwitchCase();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_CASE__VAR = eINSTANCE.getSwitchCase_Var();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_CASE__STATEMENT = eINSTANCE.getSwitchCase_Statement();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.SwitchDefaultImpl <em>Switch Default</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.SwitchDefaultImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getSwitchDefault()
     * @generated
     */
    EClass SWITCH_DEFAULT = eINSTANCE.getSwitchDefault();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_DEFAULT__STATEMENT = eINSTANCE.getSwitchDefault_Statement();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.ReturnStatementImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getReturnStatement()
     * @generated
     */
    EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_STATEMENT__EXPRESSION = eINSTANCE.getReturnStatement_Expression();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.ContinueStatementImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getContinueStatement()
     * @generated
     */
    EClass CONTINUE_STATEMENT = eINSTANCE.getContinueStatement();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.BreakStatementImpl <em>Break Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.BreakStatementImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getBreakStatement()
     * @generated
     */
    EClass BREAK_STATEMENT = eINSTANCE.getBreakStatement();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.ExpressionImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXPRESSION = eINSTANCE.getExpression_Expression();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.VarImpl <em>Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.VarImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVar()
     * @generated
     */
    EClass VAR = eINSTANCE.getVar();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR__NAME = eINSTANCE.getVar_Name();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.CallImpl <em>Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.CallImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getCall()
     * @generated
     */
    EClass CALL = eINSTANCE.getCall();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__FUNCTION = eINSTANCE.getCall_Function();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__ARGS = eINSTANCE.getCall_Args();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.ArgumentsImpl <em>Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.ArgumentsImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getArguments()
     * @generated
     */
    EClass ARGUMENTS = eINSTANCE.getArguments();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENTS__EXPRESSIONS = eINSTANCE.getArguments_Expressions();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.SignedNumImpl <em>Signed Num</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.SignedNumImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getSignedNum()
     * @generated
     */
    EClass SIGNED_NUM = eINSTANCE.getSignedNum();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.EmptyExpressionStatementImpl <em>Empty Expression Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.EmptyExpressionStatementImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getEmptyExpressionStatement()
     * @generated
     */
    EClass EMPTY_EXPRESSION_STATEMENT = eINSTANCE.getEmptyExpressionStatement();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.AssignmentExpressionImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getAssignmentExpression()
     * @generated
     */
    EClass ASSIGNMENT_EXPRESSION = eINSTANCE.getAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_EXPRESSION__VAR = eINSTANCE.getAssignmentExpression_Var();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.PostfixExpressionImpl <em>Postfix Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.PostfixExpressionImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getPostfixExpression()
     * @generated
     */
    EClass POSTFIX_EXPRESSION = eINSTANCE.getPostfixExpression();

    /**
     * The meta object literal for the '<em><b>Postfix Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POSTFIX_EXPRESSION__POSTFIX_VAR = eINSTANCE.getPostfixExpression_PostfixVar();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POSTFIX_EXPRESSION__OP = eINSTANCE.getPostfixExpression_Op();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.OrImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__LEFT = eINSTANCE.getOr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OR__OP = eINSTANCE.getOr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__RIGHT = eINSTANCE.getOr_Right();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.AndImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__LEFT = eINSTANCE.getAnd_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AND__OP = eINSTANCE.getAnd_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__RIGHT = eINSTANCE.getAnd_Right();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.EqualsImpl <em>Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.EqualsImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getEquals()
     * @generated
     */
    EClass EQUALS = eINSTANCE.getEquals();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS__LEFT = eINSTANCE.getEquals_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALS__OP = eINSTANCE.getEquals_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS__RIGHT = eINSTANCE.getEquals_Right();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.ComparisonImpl <em>Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.ComparisonImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getComparison()
     * @generated
     */
    EClass COMPARISON = eINSTANCE.getComparison();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__LEFT = eINSTANCE.getComparison_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON__OP = eINSTANCE.getComparison_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__RIGHT = eINSTANCE.getComparison_Right();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.TermImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__LEFT = eINSTANCE.getTerm_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__OP = eINSTANCE.getTerm_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__RIGHT = eINSTANCE.getTerm_Right();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.FactorImpl <em>Factor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.FactorImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getFactor()
     * @generated
     */
    EClass FACTOR = eINSTANCE.getFactor();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__LEFT = eINSTANCE.getFactor_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__OP = eINSTANCE.getFactor_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__RIGHT = eINSTANCE.getFactor_Right();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.PrimaryExpressionImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getPrimaryExpression()
     * @generated
     */
    EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.LiteralIntImpl <em>Literal Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.LiteralIntImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteralInt()
     * @generated
     */
    EClass LITERAL_INT = eINSTANCE.getLiteralInt();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_INT__VALUE = eINSTANCE.getLiteralInt_Value();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.LiteralFloatImpl <em>Literal Float</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.LiteralFloatImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteralFloat()
     * @generated
     */
    EClass LITERAL_FLOAT = eINSTANCE.getLiteralFloat();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_FLOAT__VALUE = eINSTANCE.getLiteralFloat_Value();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.LiteralBoolImpl <em>Literal Bool</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.LiteralBoolImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteralBool()
     * @generated
     */
    EClass LITERAL_BOOL = eINSTANCE.getLiteralBool();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_BOOL__VALUE = eINSTANCE.getLiteralBool_Value();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.LiteralVectorImpl <em>Literal Vector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.LiteralVectorImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteralVector()
     * @generated
     */
    EClass LITERAL_VECTOR = eINSTANCE.getLiteralVector();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL_VECTOR__VALUE = eINSTANCE.getLiteralVector_Value();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.LiteralStringImpl <em>Literal String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.LiteralStringImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteralString()
     * @generated
     */
    EClass LITERAL_STRING = eINSTANCE.getLiteralString();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_STRING__VALUE = eINSTANCE.getLiteralString_Value();

  }

} //XsPackage
