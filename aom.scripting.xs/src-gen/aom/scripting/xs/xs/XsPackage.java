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
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.IncludeDeclarationImpl <em>Include Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.IncludeDeclarationImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getIncludeDeclaration()
   * @generated
   */
  int INCLUDE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DECLARATION__FILE_PATH = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Include Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.VarDeclarationImpl <em>Var Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.VarDeclarationImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVarDeclaration()
   * @generated
   */
  int VAR_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Var Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.LocalVarDeclarationImpl <em>Local Var Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.LocalVarDeclarationImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLocalVarDeclaration()
   * @generated
   */
  int LOCAL_VAR_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VAR_DECLARATION__NAME = VAR_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VAR_DECLARATION__VALUE = VAR_DECLARATION__VALUE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VAR_DECLARATION__TYPE = VAR_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Var Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VAR_DECLARATION_FEATURE_COUNT = VAR_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.GlobalVarDeclarationImpl <em>Global Var Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.GlobalVarDeclarationImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getGlobalVarDeclaration()
   * @generated
   */
  int GLOBAL_VAR_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECLARATION__VALUE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECLARATION__CONST = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Extern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECLARATION__EXTERN = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECLARATION__TYPE = DECLARATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Global Var Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VAR_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.ParameterDeclarationImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getParameterDeclaration()
   * @generated
   */
  int PARAMETER_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__NAME = VAR_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__VALUE = VAR_DECLARATION__VALUE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__TYPE = VAR_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION_FEATURE_COUNT = VAR_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.ForVarDeclarationImpl <em>For Var Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.ForVarDeclarationImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getForVarDeclaration()
   * @generated
   */
  int FOR_VAR_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_VAR_DECLARATION__NAME = VAR_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_VAR_DECLARATION__VALUE = VAR_DECLARATION__VALUE;

  /**
   * The number of structural features of the '<em>For Var Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_VAR_DECLARATION_FEATURE_COUNT = VAR_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.FunctionDeclarationImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getFunctionDeclaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Mutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__MUTABLE = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__TYPE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__PARAMETERS = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__BODY = DECLARATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Function Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.TypeImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getType()
   * @generated
   */
  int TYPE = 9;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl <em>Rule Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.RuleDeclarationImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getRuleDeclaration()
   * @generated
   */
  int RULE_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__ACTIVE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Run Immediately</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__RUN_IMMEDIATELY = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>High Frequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__HIGH_FREQUENCY = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__GROUP = DECLARATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Min Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__MIN_INTERVAL = DECLARATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Max Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__MAX_INTERVAL = DECLARATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__PRIORITY = DECLARATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__BODY = DECLARATION_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Rule Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.StatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 12;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.BlockImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 11;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__CONTENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.SwitchCaseImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getSwitchCase()
   * @generated
   */
  int SWITCH_CASE = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE__VALUE = 0;

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
  int SWITCH_DEFAULT = 14;

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
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.ExpressionImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 15;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.VarImpl <em>Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.VarImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVar()
   * @generated
   */
  int VAR = 16;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__DECLARATION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.LiteralImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 17;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.PostfixStatementImpl <em>Postfix Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.PostfixStatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getPostfixStatement()
   * @generated
   */
  int POSTFIX_STATEMENT = 18;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_STATEMENT__VAR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_STATEMENT__OP = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Postfix Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.IfElseStatementImpl <em>If Else Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.IfElseStatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getIfElseStatement()
   * @generated
   */
  int IF_ELSE_STATEMENT = 19;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_ELSE_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_ELSE_STATEMENT__THEN_STATEMENT = STATEMENT_FEATURE_COUNT + 1;

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
  int WHILE_STATEMENT = 20;

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
  int FOR_STATEMENT = 21;

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
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__END = STATEMENT_FEATURE_COUNT + 2;

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
  int SWITCH_STATEMENT = 22;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.ReturnStatementImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getReturnStatement()
   * @generated
   */
  int RETURN_STATEMENT = 23;

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
  int CONTINUE_STATEMENT = 24;

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
  int BREAK_STATEMENT = 25;

  /**
   * The number of structural features of the '<em>Break Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.AssignImpl <em>Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.AssignImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getAssign()
   * @generated
   */
  int ASSIGN = 26;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__VAR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.OrExpressionImpl <em>Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.OrExpressionImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getOrExpression()
   * @generated
   */
  int OR_EXPRESSION = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.AndExpressionImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.EqualsExpressionImpl <em>Equals Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.EqualsExpressionImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getEqualsExpression()
   * @generated
   */
  int EQUALS_EXPRESSION = 29;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Equals Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.ComparisonExpressionImpl <em>Comparison Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.ComparisonExpressionImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getComparisonExpression()
   * @generated
   */
  int COMPARISON_EXPRESSION = 30;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Comparison Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.TermImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getTerm()
   * @generated
   */
  int TERM = 31;

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
  int FACTOR = 32;

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
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.CallImpl <em>Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.CallImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getCall()
   * @generated
   */
  int CALL = 33;

  /**
   * The feature id for the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.LiteralStringImpl <em>Literal String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.LiteralStringImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteralString()
   * @generated
   */
  int LITERAL_STRING = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_STRING__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_STRING_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.LiteralIntImpl <em>Literal Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.LiteralIntImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteralInt()
   * @generated
   */
  int LITERAL_INT = 35;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_INT__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_INT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.LiteralFloatImpl <em>Literal Float</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.LiteralFloatImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteralFloat()
   * @generated
   */
  int LITERAL_FLOAT = 36;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FLOAT__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Float</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FLOAT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.LiteralBoolImpl <em>Literal Bool</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.LiteralBoolImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteralBool()
   * @generated
   */
  int LITERAL_BOOL = 37;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_BOOL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Bool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_BOOL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.VectorLiteralImpl <em>Vector Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.VectorLiteralImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVectorLiteral()
   * @generated
   */
  int VECTOR_LITERAL = 38;

  /**
   * The feature id for the '<em><b>X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_LITERAL__X = LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_LITERAL__Y = LITERAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Z</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_LITERAL__Z = LITERAL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Vector Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.IntTypeImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 39;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.FloatTypeImpl <em>Float Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.FloatTypeImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getFloatType()
   * @generated
   */
  int FLOAT_TYPE = 40;

  /**
   * The number of structural features of the '<em>Float Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.BoolTypeImpl <em>Bool Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.BoolTypeImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getBoolType()
   * @generated
   */
  int BOOL_TYPE = 41;

  /**
   * The number of structural features of the '<em>Bool Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.VectorTypeImpl <em>Vector Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.VectorTypeImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVectorType()
   * @generated
   */
  int VECTOR_TYPE = 42;

  /**
   * The number of structural features of the '<em>Vector Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.StringTypeImpl <em>String Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.StringTypeImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getStringType()
   * @generated
   */
  int STRING_TYPE = 43;

  /**
   * The number of structural features of the '<em>String Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link aom.scripting.xs.xs.impl.VoidTypeImpl <em>Void Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see aom.scripting.xs.xs.impl.VoidTypeImpl
   * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVoidType()
   * @generated
   */
  int VOID_TYPE = 44;

  /**
   * The number of structural features of the '<em>Void Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;


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
   * Returns the meta object for class '{@link aom.scripting.xs.xs.IncludeDeclaration <em>Include Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Declaration</em>'.
   * @see aom.scripting.xs.xs.IncludeDeclaration
   * @generated
   */
  EClass getIncludeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.IncludeDeclaration#getFilePath <em>File Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Path</em>'.
   * @see aom.scripting.xs.xs.IncludeDeclaration#getFilePath()
   * @see #getIncludeDeclaration()
   * @generated
   */
  EAttribute getIncludeDeclaration_FilePath();

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
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.VarDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see aom.scripting.xs.xs.VarDeclaration#getName()
   * @see #getVarDeclaration()
   * @generated
   */
  EAttribute getVarDeclaration_Name();

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
   * Returns the meta object for class '{@link aom.scripting.xs.xs.LocalVarDeclaration <em>Local Var Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Var Declaration</em>'.
   * @see aom.scripting.xs.xs.LocalVarDeclaration
   * @generated
   */
  EClass getLocalVarDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.LocalVarDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see aom.scripting.xs.xs.LocalVarDeclaration#getType()
   * @see #getLocalVarDeclaration()
   * @generated
   */
  EReference getLocalVarDeclaration_Type();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.GlobalVarDeclaration <em>Global Var Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Var Declaration</em>'.
   * @see aom.scripting.xs.xs.GlobalVarDeclaration
   * @generated
   */
  EClass getGlobalVarDeclaration();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.GlobalVarDeclaration#isConst <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Const</em>'.
   * @see aom.scripting.xs.xs.GlobalVarDeclaration#isConst()
   * @see #getGlobalVarDeclaration()
   * @generated
   */
  EAttribute getGlobalVarDeclaration_Const();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.GlobalVarDeclaration#isExtern <em>Extern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extern</em>'.
   * @see aom.scripting.xs.xs.GlobalVarDeclaration#isExtern()
   * @see #getGlobalVarDeclaration()
   * @generated
   */
  EAttribute getGlobalVarDeclaration_Extern();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.GlobalVarDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see aom.scripting.xs.xs.GlobalVarDeclaration#getType()
   * @see #getGlobalVarDeclaration()
   * @generated
   */
  EReference getGlobalVarDeclaration_Type();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.ParameterDeclaration <em>Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Declaration</em>'.
   * @see aom.scripting.xs.xs.ParameterDeclaration
   * @generated
   */
  EClass getParameterDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.ParameterDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see aom.scripting.xs.xs.ParameterDeclaration#getType()
   * @see #getParameterDeclaration()
   * @generated
   */
  EReference getParameterDeclaration_Type();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.ForVarDeclaration <em>For Var Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Var Declaration</em>'.
   * @see aom.scripting.xs.xs.ForVarDeclaration
   * @generated
   */
  EClass getForVarDeclaration();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.FunctionDeclaration <em>Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Declaration</em>'.
   * @see aom.scripting.xs.xs.FunctionDeclaration
   * @generated
   */
  EClass getFunctionDeclaration();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.FunctionDeclaration#isMutable <em>Mutable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mutable</em>'.
   * @see aom.scripting.xs.xs.FunctionDeclaration#isMutable()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EAttribute getFunctionDeclaration_Mutable();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.FunctionDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see aom.scripting.xs.xs.FunctionDeclaration#getType()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.FunctionDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see aom.scripting.xs.xs.FunctionDeclaration#getName()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EAttribute getFunctionDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link aom.scripting.xs.xs.FunctionDeclaration#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see aom.scripting.xs.xs.FunctionDeclaration#getParameters()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.FunctionDeclaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see aom.scripting.xs.xs.FunctionDeclaration#getBody()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Body();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see aom.scripting.xs.xs.Type
   * @generated
   */
  EClass getType();

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
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.RuleDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see aom.scripting.xs.xs.RuleDeclaration#getName()
   * @see #getRuleDeclaration()
   * @generated
   */
  EAttribute getRuleDeclaration_Name();

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
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.RuleDeclaration#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see aom.scripting.xs.xs.RuleDeclaration#getPriority()
   * @see #getRuleDeclaration()
   * @generated
   */
  EAttribute getRuleDeclaration_Priority();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.RuleDeclaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see aom.scripting.xs.xs.RuleDeclaration#getBody()
   * @see #getRuleDeclaration()
   * @generated
   */
  EReference getRuleDeclaration_Body();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see aom.scripting.xs.xs.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link aom.scripting.xs.xs.Block#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see aom.scripting.xs.xs.Block#getContents()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Contents();

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
   * Returns the meta object for class '{@link aom.scripting.xs.xs.SwitchCase <em>Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Case</em>'.
   * @see aom.scripting.xs.xs.SwitchCase
   * @generated
   */
  EClass getSwitchCase();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.SwitchCase#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see aom.scripting.xs.xs.SwitchCase#getValue()
   * @see #getSwitchCase()
   * @generated
   */
  EReference getSwitchCase_Value();

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
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see aom.scripting.xs.xs.Expression
   * @generated
   */
  EClass getExpression();

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
   * Returns the meta object for the reference '{@link aom.scripting.xs.xs.Var#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Declaration</em>'.
   * @see aom.scripting.xs.xs.Var#getDeclaration()
   * @see #getVar()
   * @generated
   */
  EReference getVar_Declaration();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see aom.scripting.xs.xs.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.PostfixStatement <em>Postfix Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Postfix Statement</em>'.
   * @see aom.scripting.xs.xs.PostfixStatement
   * @generated
   */
  EClass getPostfixStatement();

  /**
   * Returns the meta object for the reference '{@link aom.scripting.xs.xs.PostfixStatement#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see aom.scripting.xs.xs.PostfixStatement#getVar()
   * @see #getPostfixStatement()
   * @generated
   */
  EReference getPostfixStatement_Var();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.PostfixStatement#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see aom.scripting.xs.xs.PostfixStatement#getOp()
   * @see #getPostfixStatement()
   * @generated
   */
  EAttribute getPostfixStatement_Op();

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
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.IfElseStatement#getThenStatement <em>Then Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Statement</em>'.
   * @see aom.scripting.xs.xs.IfElseStatement#getThenStatement()
   * @see #getIfElseStatement()
   * @generated
   */
  EReference getIfElseStatement_ThenStatement();

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
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.ForStatement#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see aom.scripting.xs.xs.ForStatement#getEnd()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_End();

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
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.SwitchStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see aom.scripting.xs.xs.SwitchStatement#getExpression()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_Expression();

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
   * Returns the meta object for class '{@link aom.scripting.xs.xs.Assign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign</em>'.
   * @see aom.scripting.xs.xs.Assign
   * @generated
   */
  EClass getAssign();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Assign#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see aom.scripting.xs.xs.Assign#getVar()
   * @see #getAssign()
   * @generated
   */
  EReference getAssign_Var();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.Assign#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see aom.scripting.xs.xs.Assign#getExpression()
   * @see #getAssign()
   * @generated
   */
  EReference getAssign_Expression();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression</em>'.
   * @see aom.scripting.xs.xs.OrExpression
   * @generated
   */
  EClass getOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.OrExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see aom.scripting.xs.xs.OrExpression#getLeft()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.OrExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see aom.scripting.xs.xs.OrExpression#getOp()
   * @see #getOrExpression()
   * @generated
   */
  EAttribute getOrExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.OrExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see aom.scripting.xs.xs.OrExpression#getRight()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Right();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see aom.scripting.xs.xs.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.AndExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see aom.scripting.xs.xs.AndExpression#getLeft()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.AndExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see aom.scripting.xs.xs.AndExpression#getOp()
   * @see #getAndExpression()
   * @generated
   */
  EAttribute getAndExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.AndExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see aom.scripting.xs.xs.AndExpression#getRight()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Right();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.EqualsExpression <em>Equals Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equals Expression</em>'.
   * @see aom.scripting.xs.xs.EqualsExpression
   * @generated
   */
  EClass getEqualsExpression();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.EqualsExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see aom.scripting.xs.xs.EqualsExpression#getLeft()
   * @see #getEqualsExpression()
   * @generated
   */
  EReference getEqualsExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.EqualsExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see aom.scripting.xs.xs.EqualsExpression#getOp()
   * @see #getEqualsExpression()
   * @generated
   */
  EAttribute getEqualsExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.EqualsExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see aom.scripting.xs.xs.EqualsExpression#getRight()
   * @see #getEqualsExpression()
   * @generated
   */
  EReference getEqualsExpression_Right();

  /**
   * Returns the meta object for class '{@link aom.scripting.xs.xs.ComparisonExpression <em>Comparison Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison Expression</em>'.
   * @see aom.scripting.xs.xs.ComparisonExpression
   * @generated
   */
  EClass getComparisonExpression();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.ComparisonExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see aom.scripting.xs.xs.ComparisonExpression#getLeft()
   * @see #getComparisonExpression()
   * @generated
   */
  EReference getComparisonExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link aom.scripting.xs.xs.ComparisonExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see aom.scripting.xs.xs.ComparisonExpression#getOp()
   * @see #getComparisonExpression()
   * @generated
   */
  EAttribute getComparisonExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.ComparisonExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see aom.scripting.xs.xs.ComparisonExpression#getRight()
   * @see #getComparisonExpression()
   * @generated
   */
  EReference getComparisonExpression_Right();

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
   * Returns the meta object for the containment reference list '{@link aom.scripting.xs.xs.Call#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see aom.scripting.xs.xs.Call#getArguments()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Arguments();

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
   * Returns the meta object for class '{@link aom.scripting.xs.xs.VectorLiteral <em>Vector Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector Literal</em>'.
   * @see aom.scripting.xs.xs.VectorLiteral
   * @generated
   */
  EClass getVectorLiteral();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.VectorLiteral#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>X</em>'.
   * @see aom.scripting.xs.xs.VectorLiteral#getX()
   * @see #getVectorLiteral()
   * @generated
   */
  EReference getVectorLiteral_X();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.VectorLiteral#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Y</em>'.
   * @see aom.scripting.xs.xs.VectorLiteral#getY()
   * @see #getVectorLiteral()
   * @generated
   */
  EReference getVectorLiteral_Y();

  /**
   * Returns the meta object for the containment reference '{@link aom.scripting.xs.xs.VectorLiteral#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Z</em>'.
   * @see aom.scripting.xs.xs.VectorLiteral#getZ()
   * @see #getVectorLiteral()
   * @generated
   */
  EReference getVectorLiteral_Z();

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
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.IncludeDeclarationImpl <em>Include Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.IncludeDeclarationImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getIncludeDeclaration()
     * @generated
     */
    EClass INCLUDE_DECLARATION = eINSTANCE.getIncludeDeclaration();

    /**
     * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE_DECLARATION__FILE_PATH = eINSTANCE.getIncludeDeclaration_FilePath();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECLARATION__NAME = eINSTANCE.getVarDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECLARATION__VALUE = eINSTANCE.getVarDeclaration_Value();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.LocalVarDeclarationImpl <em>Local Var Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.LocalVarDeclarationImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLocalVarDeclaration()
     * @generated
     */
    EClass LOCAL_VAR_DECLARATION = eINSTANCE.getLocalVarDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_VAR_DECLARATION__TYPE = eINSTANCE.getLocalVarDeclaration_Type();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.GlobalVarDeclarationImpl <em>Global Var Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.GlobalVarDeclarationImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getGlobalVarDeclaration()
     * @generated
     */
    EClass GLOBAL_VAR_DECLARATION = eINSTANCE.getGlobalVarDeclaration();

    /**
     * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_VAR_DECLARATION__CONST = eINSTANCE.getGlobalVarDeclaration_Const();

    /**
     * The meta object literal for the '<em><b>Extern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_VAR_DECLARATION__EXTERN = eINSTANCE.getGlobalVarDeclaration_Extern();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_VAR_DECLARATION__TYPE = eINSTANCE.getGlobalVarDeclaration_Type();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.ParameterDeclarationImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getParameterDeclaration()
     * @generated
     */
    EClass PARAMETER_DECLARATION = eINSTANCE.getParameterDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DECLARATION__TYPE = eINSTANCE.getParameterDeclaration_Type();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.ForVarDeclarationImpl <em>For Var Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.ForVarDeclarationImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getForVarDeclaration()
     * @generated
     */
    EClass FOR_VAR_DECLARATION = eINSTANCE.getForVarDeclaration();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.FunctionDeclarationImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getFunctionDeclaration()
     * @generated
     */
    EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

    /**
     * The meta object literal for the '<em><b>Mutable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__MUTABLE = eINSTANCE.getFunctionDeclaration_Mutable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__TYPE = eINSTANCE.getFunctionDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__NAME = eINSTANCE.getFunctionDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__PARAMETERS = eINSTANCE.getFunctionDeclaration_Parameters();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__BODY = eINSTANCE.getFunctionDeclaration_Body();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.TypeImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_DECLARATION__NAME = eINSTANCE.getRuleDeclaration_Name();

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
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_DECLARATION__PRIORITY = eINSTANCE.getRuleDeclaration_Priority();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_DECLARATION__BODY = eINSTANCE.getRuleDeclaration_Body();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.BlockImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__CONTENTS = eINSTANCE.getBlock_Contents();

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
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.SwitchCaseImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getSwitchCase()
     * @generated
     */
    EClass SWITCH_CASE = eINSTANCE.getSwitchCase();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_CASE__VALUE = eINSTANCE.getSwitchCase_Value();

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
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.ExpressionImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

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
     * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR__DECLARATION = eINSTANCE.getVar_Declaration();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.LiteralImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.PostfixStatementImpl <em>Postfix Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.PostfixStatementImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getPostfixStatement()
     * @generated
     */
    EClass POSTFIX_STATEMENT = eINSTANCE.getPostfixStatement();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POSTFIX_STATEMENT__VAR = eINSTANCE.getPostfixStatement_Var();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POSTFIX_STATEMENT__OP = eINSTANCE.getPostfixStatement_Op();

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
     * The meta object literal for the '<em><b>Then Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_ELSE_STATEMENT__THEN_STATEMENT = eINSTANCE.getIfElseStatement_ThenStatement();

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
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__END = eINSTANCE.getForStatement_End();

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
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__EXPRESSION = eINSTANCE.getSwitchStatement_Expression();

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
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.AssignImpl <em>Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.AssignImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getAssign()
     * @generated
     */
    EClass ASSIGN = eINSTANCE.getAssign();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__VAR = eINSTANCE.getAssign_Var();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__EXPRESSION = eINSTANCE.getAssign_Expression();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.OrExpressionImpl <em>Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.OrExpressionImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getOrExpression()
     * @generated
     */
    EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__LEFT = eINSTANCE.getOrExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OR_EXPRESSION__OP = eINSTANCE.getOrExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__RIGHT = eINSTANCE.getOrExpression_Right();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.AndExpressionImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getAndExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__LEFT = eINSTANCE.getAndExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AND_EXPRESSION__OP = eINSTANCE.getAndExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__RIGHT = eINSTANCE.getAndExpression_Right();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.EqualsExpressionImpl <em>Equals Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.EqualsExpressionImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getEqualsExpression()
     * @generated
     */
    EClass EQUALS_EXPRESSION = eINSTANCE.getEqualsExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS_EXPRESSION__LEFT = eINSTANCE.getEqualsExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALS_EXPRESSION__OP = eINSTANCE.getEqualsExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS_EXPRESSION__RIGHT = eINSTANCE.getEqualsExpression_Right();

    /**
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.ComparisonExpressionImpl <em>Comparison Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.ComparisonExpressionImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getComparisonExpression()
     * @generated
     */
    EClass COMPARISON_EXPRESSION = eINSTANCE.getComparisonExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON_EXPRESSION__LEFT = eINSTANCE.getComparisonExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON_EXPRESSION__OP = eINSTANCE.getComparisonExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON_EXPRESSION__RIGHT = eINSTANCE.getComparisonExpression_Right();

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
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__ARGUMENTS = eINSTANCE.getCall_Arguments();

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
     * The meta object literal for the '{@link aom.scripting.xs.xs.impl.VectorLiteralImpl <em>Vector Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see aom.scripting.xs.xs.impl.VectorLiteralImpl
     * @see aom.scripting.xs.xs.impl.XsPackageImpl#getVectorLiteral()
     * @generated
     */
    EClass VECTOR_LITERAL = eINSTANCE.getVectorLiteral();

    /**
     * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR_LITERAL__X = eINSTANCE.getVectorLiteral_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR_LITERAL__Y = eINSTANCE.getVectorLiteral_Y();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR_LITERAL__Z = eINSTANCE.getVectorLiteral_Z();

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

  }

} //XsPackage
