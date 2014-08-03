/**
 */
package aom.scripting.xs.xs.impl;

import aom.scripting.xs.xs.AdditiveExpression;
import aom.scripting.xs.xs.AndExpression;
import aom.scripting.xs.xs.Arguments;
import aom.scripting.xs.xs.AssignmentExpression;
import aom.scripting.xs.xs.BreakStatement;
import aom.scripting.xs.xs.Call;
import aom.scripting.xs.xs.ComparisonExpression;
import aom.scripting.xs.xs.CompoundStatement;
import aom.scripting.xs.xs.ConstantNum;
import aom.scripting.xs.xs.ContinueStatement;
import aom.scripting.xs.xs.Declaration;
import aom.scripting.xs.xs.EmptyExpressionStatement;
import aom.scripting.xs.xs.EqualsExpression;
import aom.scripting.xs.xs.Expression;
import aom.scripting.xs.xs.ExpressionStatement;
import aom.scripting.xs.xs.ForStatement;
import aom.scripting.xs.xs.FunDeclaration;
import aom.scripting.xs.xs.FunModifier;
import aom.scripting.xs.xs.IfElseStatement;
import aom.scripting.xs.xs.IncludeStatement;
import aom.scripting.xs.xs.LiteralBool;
import aom.scripting.xs.xs.LiteralFloat;
import aom.scripting.xs.xs.LiteralInt;
import aom.scripting.xs.xs.LiteralOrConstantNum;
import aom.scripting.xs.xs.LiteralString;
import aom.scripting.xs.xs.LiteralVector;
import aom.scripting.xs.xs.MultiplicativeExpression;
import aom.scripting.xs.xs.Params;
import aom.scripting.xs.xs.PostfixExpression;
import aom.scripting.xs.xs.PrimaryExpression;
import aom.scripting.xs.xs.Program;
import aom.scripting.xs.xs.ReturnStatement;
import aom.scripting.xs.xs.RuleDeclaration;
import aom.scripting.xs.xs.SignedNum;
import aom.scripting.xs.xs.SimpleExpression;
import aom.scripting.xs.xs.Statement;
import aom.scripting.xs.xs.SwitchCase;
import aom.scripting.xs.xs.SwitchDefault;
import aom.scripting.xs.xs.SwitchStatement;
import aom.scripting.xs.xs.Var;
import aom.scripting.xs.xs.VarDeclaration;
import aom.scripting.xs.xs.VarDeclarationOrStatement;
import aom.scripting.xs.xs.VarModifier;
import aom.scripting.xs.xs.Vector;
import aom.scripting.xs.xs.WhileStatement;
import aom.scripting.xs.xs.XsFactory;
import aom.scripting.xs.xs.XsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XsPackageImpl extends EPackageImpl implements XsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantNumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalOrConstantNumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass funDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass funModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compoundStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varDeclarationOrStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifElseStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchDefaultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass continueStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass breakStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signedNumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emptyExpressionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postfixExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalsExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparisonExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additiveExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicativeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalFloatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalBoolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalVectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalStringEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see aom.scripting.xs.xs.XsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private XsPackageImpl()
  {
    super(eNS_URI, XsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link XsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static XsPackage init()
  {
    if (isInited) return (XsPackage)EPackage.Registry.INSTANCE.getEPackage(XsPackage.eNS_URI);

    // Obtain or create and register package
    XsPackageImpl theXsPackage = (XsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theXsPackage.createPackageContents();

    // Initialize created meta-data
    theXsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theXsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(XsPackage.eNS_URI, theXsPackage);
    return theXsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Declarations()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeclaration_Name()
  {
    return (EAttribute)declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantNum()
  {
    return constantNumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantNum_Var()
  {
    return (EReference)constantNumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralOrConstantNum()
  {
    return literalOrConstantNumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVector()
  {
    return vectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVector_X()
  {
    return (EReference)vectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVector_Y()
  {
    return (EReference)vectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVector_Z()
  {
    return (EReference)vectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarDeclaration()
  {
    return varDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarDeclaration_Modifier()
  {
    return (EReference)varDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVarDeclaration_Type()
  {
    return (EAttribute)varDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarDeclaration_Value()
  {
    return (EReference)varDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunDeclaration()
  {
    return funDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunDeclaration_Modifier()
  {
    return (EReference)funDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunDeclaration_Type()
  {
    return (EAttribute)funDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunDeclaration_Paramlist()
  {
    return (EReference)funDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunDeclaration_Statements()
  {
    return (EReference)funDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIncludeStatement()
  {
    return includeStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuleDeclaration()
  {
    return ruleDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRuleDeclaration_Active()
  {
    return (EAttribute)ruleDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRuleDeclaration_RunImmediately()
  {
    return (EAttribute)ruleDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRuleDeclaration_HighFrequency()
  {
    return (EAttribute)ruleDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRuleDeclaration_Group()
  {
    return (EAttribute)ruleDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRuleDeclaration_MinInterval()
  {
    return (EAttribute)ruleDeclarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRuleDeclaration_MaxInterval()
  {
    return (EAttribute)ruleDeclarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleDeclaration_Statements()
  {
    return (EReference)ruleDeclarationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarModifier()
  {
    return varModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVarModifier_Static()
  {
    return (EAttribute)varModifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVarModifier_Const()
  {
    return (EAttribute)varModifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVarModifier_Extern()
  {
    return (EAttribute)varModifierEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunModifier()
  {
    return funModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunModifier_Static()
  {
    return (EAttribute)funModifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunModifier_Mutable()
  {
    return (EAttribute)funModifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParams()
  {
    return paramsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParams_Param()
  {
    return (EAttribute)paramsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParams_Params()
  {
    return (EReference)paramsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompoundStatement()
  {
    return compoundStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompoundStatement_Contents()
  {
    return (EReference)compoundStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarDeclarationOrStatement()
  {
    return varDeclarationOrStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionStatement()
  {
    return expressionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionStatement_Expression()
  {
    return (EReference)expressionStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfElseStatement()
  {
    return ifElseStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfElseStatement_Condition()
  {
    return (EReference)ifElseStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfElseStatement_IfStatement()
  {
    return (EReference)ifElseStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfElseStatement_ElseStatement()
  {
    return (EReference)ifElseStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhileStatement()
  {
    return whileStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileStatement_Condition()
  {
    return (EReference)whileStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileStatement_Statement()
  {
    return (EReference)whileStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForStatement()
  {
    return forStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_Var()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForStatement_Op()
  {
    return (EAttribute)forStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_Expression()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_Statement()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitchStatement()
  {
    return switchStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchStatement_Var()
  {
    return (EReference)switchStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchStatement_Cases()
  {
    return (EReference)switchStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchStatement_Default()
  {
    return (EReference)switchStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitchCase()
  {
    return switchCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitchCase_Var()
  {
    return (EAttribute)switchCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchCase_Statement()
  {
    return (EReference)switchCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitchDefault()
  {
    return switchDefaultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchDefault_Statement()
  {
    return (EReference)switchDefaultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturnStatement()
  {
    return returnStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReturnStatement_Expression()
  {
    return (EReference)returnStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContinueStatement()
  {
    return continueStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBreakStatement()
  {
    return breakStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Expression()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVar()
  {
    return varEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVar_Name()
  {
    return (EReference)varEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCall()
  {
    return callEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCall_Function()
  {
    return (EReference)callEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCall_Args()
  {
    return (EReference)callEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArguments()
  {
    return argumentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArguments_Expressions()
  {
    return (EReference)argumentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignedNum()
  {
    return signedNumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmptyExpressionStatement()
  {
    return emptyExpressionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignmentExpression()
  {
    return assignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignmentExpression_Var()
  {
    return (EReference)assignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPostfixExpression()
  {
    return postfixExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPostfixExpression_PostfixVar()
  {
    return (EReference)postfixExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPostfixExpression_Op()
  {
    return (EAttribute)postfixExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleExpression()
  {
    return simpleExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleExpression_Left()
  {
    return (EReference)simpleExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleExpression_Op()
  {
    return (EAttribute)simpleExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleExpression_Right()
  {
    return (EReference)simpleExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndExpression()
  {
    return andExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndExpression_Left()
  {
    return (EReference)andExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAndExpression_Op()
  {
    return (EAttribute)andExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndExpression_Right()
  {
    return (EReference)andExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqualsExpression()
  {
    return equalsExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEqualsExpression_Left()
  {
    return (EReference)equalsExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEqualsExpression_Op()
  {
    return (EAttribute)equalsExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEqualsExpression_Right()
  {
    return (EReference)equalsExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComparisonExpression()
  {
    return comparisonExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComparisonExpression_Left()
  {
    return (EReference)comparisonExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComparisonExpression_Op()
  {
    return (EAttribute)comparisonExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComparisonExpression_Right()
  {
    return (EReference)comparisonExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditiveExpression()
  {
    return additiveExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdditiveExpression_Left()
  {
    return (EReference)additiveExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdditiveExpression_Op()
  {
    return (EAttribute)additiveExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdditiveExpression_Right()
  {
    return (EReference)additiveExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicativeExpression()
  {
    return multiplicativeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicativeExpression_Left()
  {
    return (EReference)multiplicativeExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicativeExpression_Op()
  {
    return (EAttribute)multiplicativeExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicativeExpression_Right()
  {
    return (EReference)multiplicativeExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryExpression()
  {
    return primaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralInt()
  {
    return literalIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralInt_Value()
  {
    return (EAttribute)literalIntEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralFloat()
  {
    return literalFloatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralFloat_Value()
  {
    return (EAttribute)literalFloatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralBool()
  {
    return literalBoolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralBool_Value()
  {
    return (EAttribute)literalBoolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralVector()
  {
    return literalVectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteralVector_Value()
  {
    return (EReference)literalVectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralString()
  {
    return literalStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralString_Value()
  {
    return (EAttribute)literalStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XsFactory getXsFactory()
  {
    return (XsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    programEClass = createEClass(PROGRAM);
    createEReference(programEClass, PROGRAM__DECLARATIONS);

    declarationEClass = createEClass(DECLARATION);
    createEAttribute(declarationEClass, DECLARATION__NAME);

    constantNumEClass = createEClass(CONSTANT_NUM);
    createEReference(constantNumEClass, CONSTANT_NUM__VAR);

    literalOrConstantNumEClass = createEClass(LITERAL_OR_CONSTANT_NUM);

    vectorEClass = createEClass(VECTOR);
    createEReference(vectorEClass, VECTOR__X);
    createEReference(vectorEClass, VECTOR__Y);
    createEReference(vectorEClass, VECTOR__Z);

    varDeclarationEClass = createEClass(VAR_DECLARATION);
    createEReference(varDeclarationEClass, VAR_DECLARATION__MODIFIER);
    createEAttribute(varDeclarationEClass, VAR_DECLARATION__TYPE);
    createEReference(varDeclarationEClass, VAR_DECLARATION__VALUE);

    funDeclarationEClass = createEClass(FUN_DECLARATION);
    createEReference(funDeclarationEClass, FUN_DECLARATION__MODIFIER);
    createEAttribute(funDeclarationEClass, FUN_DECLARATION__TYPE);
    createEReference(funDeclarationEClass, FUN_DECLARATION__PARAMLIST);
    createEReference(funDeclarationEClass, FUN_DECLARATION__STATEMENTS);

    includeStatementEClass = createEClass(INCLUDE_STATEMENT);

    ruleDeclarationEClass = createEClass(RULE_DECLARATION);
    createEAttribute(ruleDeclarationEClass, RULE_DECLARATION__ACTIVE);
    createEAttribute(ruleDeclarationEClass, RULE_DECLARATION__RUN_IMMEDIATELY);
    createEAttribute(ruleDeclarationEClass, RULE_DECLARATION__HIGH_FREQUENCY);
    createEAttribute(ruleDeclarationEClass, RULE_DECLARATION__GROUP);
    createEAttribute(ruleDeclarationEClass, RULE_DECLARATION__MIN_INTERVAL);
    createEAttribute(ruleDeclarationEClass, RULE_DECLARATION__MAX_INTERVAL);
    createEReference(ruleDeclarationEClass, RULE_DECLARATION__STATEMENTS);

    varModifierEClass = createEClass(VAR_MODIFIER);
    createEAttribute(varModifierEClass, VAR_MODIFIER__STATIC);
    createEAttribute(varModifierEClass, VAR_MODIFIER__CONST);
    createEAttribute(varModifierEClass, VAR_MODIFIER__EXTERN);

    funModifierEClass = createEClass(FUN_MODIFIER);
    createEAttribute(funModifierEClass, FUN_MODIFIER__STATIC);
    createEAttribute(funModifierEClass, FUN_MODIFIER__MUTABLE);

    paramsEClass = createEClass(PARAMS);
    createEAttribute(paramsEClass, PARAMS__PARAM);
    createEReference(paramsEClass, PARAMS__PARAMS);

    compoundStatementEClass = createEClass(COMPOUND_STATEMENT);
    createEReference(compoundStatementEClass, COMPOUND_STATEMENT__CONTENTS);

    varDeclarationOrStatementEClass = createEClass(VAR_DECLARATION_OR_STATEMENT);

    statementEClass = createEClass(STATEMENT);

    expressionStatementEClass = createEClass(EXPRESSION_STATEMENT);
    createEReference(expressionStatementEClass, EXPRESSION_STATEMENT__EXPRESSION);

    ifElseStatementEClass = createEClass(IF_ELSE_STATEMENT);
    createEReference(ifElseStatementEClass, IF_ELSE_STATEMENT__CONDITION);
    createEReference(ifElseStatementEClass, IF_ELSE_STATEMENT__IF_STATEMENT);
    createEReference(ifElseStatementEClass, IF_ELSE_STATEMENT__ELSE_STATEMENT);

    whileStatementEClass = createEClass(WHILE_STATEMENT);
    createEReference(whileStatementEClass, WHILE_STATEMENT__CONDITION);
    createEReference(whileStatementEClass, WHILE_STATEMENT__STATEMENT);

    forStatementEClass = createEClass(FOR_STATEMENT);
    createEReference(forStatementEClass, FOR_STATEMENT__VAR);
    createEAttribute(forStatementEClass, FOR_STATEMENT__OP);
    createEReference(forStatementEClass, FOR_STATEMENT__EXPRESSION);
    createEReference(forStatementEClass, FOR_STATEMENT__STATEMENT);

    switchStatementEClass = createEClass(SWITCH_STATEMENT);
    createEReference(switchStatementEClass, SWITCH_STATEMENT__VAR);
    createEReference(switchStatementEClass, SWITCH_STATEMENT__CASES);
    createEReference(switchStatementEClass, SWITCH_STATEMENT__DEFAULT);

    switchCaseEClass = createEClass(SWITCH_CASE);
    createEAttribute(switchCaseEClass, SWITCH_CASE__VAR);
    createEReference(switchCaseEClass, SWITCH_CASE__STATEMENT);

    switchDefaultEClass = createEClass(SWITCH_DEFAULT);
    createEReference(switchDefaultEClass, SWITCH_DEFAULT__STATEMENT);

    returnStatementEClass = createEClass(RETURN_STATEMENT);
    createEReference(returnStatementEClass, RETURN_STATEMENT__EXPRESSION);

    continueStatementEClass = createEClass(CONTINUE_STATEMENT);

    breakStatementEClass = createEClass(BREAK_STATEMENT);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__EXPRESSION);

    varEClass = createEClass(VAR);
    createEReference(varEClass, VAR__NAME);

    callEClass = createEClass(CALL);
    createEReference(callEClass, CALL__FUNCTION);
    createEReference(callEClass, CALL__ARGS);

    argumentsEClass = createEClass(ARGUMENTS);
    createEReference(argumentsEClass, ARGUMENTS__EXPRESSIONS);

    signedNumEClass = createEClass(SIGNED_NUM);

    emptyExpressionStatementEClass = createEClass(EMPTY_EXPRESSION_STATEMENT);

    assignmentExpressionEClass = createEClass(ASSIGNMENT_EXPRESSION);
    createEReference(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__VAR);

    postfixExpressionEClass = createEClass(POSTFIX_EXPRESSION);
    createEReference(postfixExpressionEClass, POSTFIX_EXPRESSION__POSTFIX_VAR);
    createEAttribute(postfixExpressionEClass, POSTFIX_EXPRESSION__OP);

    simpleExpressionEClass = createEClass(SIMPLE_EXPRESSION);
    createEReference(simpleExpressionEClass, SIMPLE_EXPRESSION__LEFT);
    createEAttribute(simpleExpressionEClass, SIMPLE_EXPRESSION__OP);
    createEReference(simpleExpressionEClass, SIMPLE_EXPRESSION__RIGHT);

    andExpressionEClass = createEClass(AND_EXPRESSION);
    createEReference(andExpressionEClass, AND_EXPRESSION__LEFT);
    createEAttribute(andExpressionEClass, AND_EXPRESSION__OP);
    createEReference(andExpressionEClass, AND_EXPRESSION__RIGHT);

    equalsExpressionEClass = createEClass(EQUALS_EXPRESSION);
    createEReference(equalsExpressionEClass, EQUALS_EXPRESSION__LEFT);
    createEAttribute(equalsExpressionEClass, EQUALS_EXPRESSION__OP);
    createEReference(equalsExpressionEClass, EQUALS_EXPRESSION__RIGHT);

    comparisonExpressionEClass = createEClass(COMPARISON_EXPRESSION);
    createEReference(comparisonExpressionEClass, COMPARISON_EXPRESSION__LEFT);
    createEAttribute(comparisonExpressionEClass, COMPARISON_EXPRESSION__OP);
    createEReference(comparisonExpressionEClass, COMPARISON_EXPRESSION__RIGHT);

    additiveExpressionEClass = createEClass(ADDITIVE_EXPRESSION);
    createEReference(additiveExpressionEClass, ADDITIVE_EXPRESSION__LEFT);
    createEAttribute(additiveExpressionEClass, ADDITIVE_EXPRESSION__OP);
    createEReference(additiveExpressionEClass, ADDITIVE_EXPRESSION__RIGHT);

    multiplicativeExpressionEClass = createEClass(MULTIPLICATIVE_EXPRESSION);
    createEReference(multiplicativeExpressionEClass, MULTIPLICATIVE_EXPRESSION__LEFT);
    createEAttribute(multiplicativeExpressionEClass, MULTIPLICATIVE_EXPRESSION__OP);
    createEReference(multiplicativeExpressionEClass, MULTIPLICATIVE_EXPRESSION__RIGHT);

    primaryExpressionEClass = createEClass(PRIMARY_EXPRESSION);

    literalIntEClass = createEClass(LITERAL_INT);
    createEAttribute(literalIntEClass, LITERAL_INT__VALUE);

    literalFloatEClass = createEClass(LITERAL_FLOAT);
    createEAttribute(literalFloatEClass, LITERAL_FLOAT__VALUE);

    literalBoolEClass = createEClass(LITERAL_BOOL);
    createEAttribute(literalBoolEClass, LITERAL_BOOL__VALUE);

    literalVectorEClass = createEClass(LITERAL_VECTOR);
    createEReference(literalVectorEClass, LITERAL_VECTOR__VALUE);

    literalStringEClass = createEClass(LITERAL_STRING);
    createEAttribute(literalStringEClass, LITERAL_STRING__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    constantNumEClass.getESuperTypes().add(this.getLiteralOrConstantNum());
    varDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    varDeclarationEClass.getESuperTypes().add(this.getVarDeclarationOrStatement());
    funDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    includeStatementEClass.getESuperTypes().add(this.getDeclaration());
    ruleDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    compoundStatementEClass.getESuperTypes().add(this.getStatement());
    statementEClass.getESuperTypes().add(this.getVarDeclarationOrStatement());
    expressionStatementEClass.getESuperTypes().add(this.getStatement());
    ifElseStatementEClass.getESuperTypes().add(this.getStatement());
    whileStatementEClass.getESuperTypes().add(this.getStatement());
    forStatementEClass.getESuperTypes().add(this.getStatement());
    switchStatementEClass.getESuperTypes().add(this.getStatement());
    returnStatementEClass.getESuperTypes().add(this.getStatement());
    continueStatementEClass.getESuperTypes().add(this.getStatement());
    breakStatementEClass.getESuperTypes().add(this.getStatement());
    signedNumEClass.getESuperTypes().add(this.getLiteralOrConstantNum());
    emptyExpressionStatementEClass.getESuperTypes().add(this.getExpressionStatement());
    assignmentExpressionEClass.getESuperTypes().add(this.getExpression());
    postfixExpressionEClass.getESuperTypes().add(this.getExpression());
    simpleExpressionEClass.getESuperTypes().add(this.getExpression());
    andExpressionEClass.getESuperTypes().add(this.getExpression());
    equalsExpressionEClass.getESuperTypes().add(this.getExpression());
    comparisonExpressionEClass.getESuperTypes().add(this.getExpression());
    additiveExpressionEClass.getESuperTypes().add(this.getExpression());
    multiplicativeExpressionEClass.getESuperTypes().add(this.getExpression());
    primaryExpressionEClass.getESuperTypes().add(this.getExpression());
    literalIntEClass.getESuperTypes().add(this.getExpression());
    literalFloatEClass.getESuperTypes().add(this.getExpression());
    literalBoolEClass.getESuperTypes().add(this.getExpression());
    literalVectorEClass.getESuperTypes().add(this.getExpression());
    literalStringEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgram_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantNumEClass, ConstantNum.class, "ConstantNum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantNum_Var(), this.getVarDeclaration(), null, "var", null, 0, 1, ConstantNum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalOrConstantNumEClass, LiteralOrConstantNum.class, "LiteralOrConstantNum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(vectorEClass, Vector.class, "Vector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVector_X(), this.getLiteralOrConstantNum(), null, "x", null, 0, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVector_Y(), this.getLiteralOrConstantNum(), null, "y", null, 0, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVector_Z(), this.getLiteralOrConstantNum(), null, "z", null, 0, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varDeclarationEClass, VarDeclaration.class, "VarDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVarDeclaration_Modifier(), this.getVarModifier(), null, "modifier", null, 0, 1, VarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVarDeclaration_Type(), ecorePackage.getEString(), "type", null, 0, 1, VarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVarDeclaration_Value(), this.getExpression(), null, "value", null, 0, 1, VarDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(funDeclarationEClass, FunDeclaration.class, "FunDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunDeclaration_Modifier(), this.getFunModifier(), null, "modifier", null, 0, 1, FunDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunDeclaration_Type(), ecorePackage.getEString(), "type", null, 0, 1, FunDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunDeclaration_Paramlist(), this.getParams(), null, "paramlist", null, 0, 1, FunDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunDeclaration_Statements(), this.getCompoundStatement(), null, "statements", null, 0, 1, FunDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(includeStatementEClass, IncludeStatement.class, "IncludeStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ruleDeclarationEClass, RuleDeclaration.class, "RuleDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRuleDeclaration_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, RuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRuleDeclaration_RunImmediately(), ecorePackage.getEBoolean(), "runImmediately", null, 0, 1, RuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRuleDeclaration_HighFrequency(), ecorePackage.getEBoolean(), "highFrequency", null, 0, 1, RuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRuleDeclaration_Group(), ecorePackage.getEString(), "group", null, 0, 1, RuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRuleDeclaration_MinInterval(), ecorePackage.getEInt(), "minInterval", null, 0, 1, RuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRuleDeclaration_MaxInterval(), ecorePackage.getEInt(), "maxInterval", null, 0, 1, RuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRuleDeclaration_Statements(), this.getCompoundStatement(), null, "statements", null, 0, 1, RuleDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varModifierEClass, VarModifier.class, "VarModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVarModifier_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, VarModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVarModifier_Const(), ecorePackage.getEBoolean(), "const", null, 0, 1, VarModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVarModifier_Extern(), ecorePackage.getEBoolean(), "extern", null, 0, 1, VarModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(funModifierEClass, FunModifier.class, "FunModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunModifier_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, FunModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunModifier_Mutable(), ecorePackage.getEBoolean(), "mutable", null, 0, 1, FunModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramsEClass, Params.class, "Params", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParams_Param(), ecorePackage.getEString(), "param", null, 0, 1, Params.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParams_Params(), this.getVarDeclaration(), null, "params", null, 0, -1, Params.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compoundStatementEClass, CompoundStatement.class, "CompoundStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompoundStatement_Contents(), this.getVarDeclarationOrStatement(), null, "contents", null, 0, -1, CompoundStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varDeclarationOrStatementEClass, VarDeclarationOrStatement.class, "VarDeclarationOrStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionStatementEClass, ExpressionStatement.class, "ExpressionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, ExpressionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifElseStatementEClass, IfElseStatement.class, "IfElseStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfElseStatement_Condition(), this.getExpression(), null, "condition", null, 0, 1, IfElseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfElseStatement_IfStatement(), this.getStatement(), null, "ifStatement", null, 0, 1, IfElseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfElseStatement_ElseStatement(), this.getStatement(), null, "elseStatement", null, 0, 1, IfElseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whileStatementEClass, WhileStatement.class, "WhileStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhileStatement_Condition(), this.getExpression(), null, "condition", null, 0, 1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhileStatement_Statement(), this.getStatement(), null, "statement", null, 0, 1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forStatementEClass, ForStatement.class, "ForStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForStatement_Var(), this.getVarDeclaration(), null, "var", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getForStatement_Op(), ecorePackage.getEString(), "op", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_Statement(), this.getStatement(), null, "statement", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchStatementEClass, SwitchStatement.class, "SwitchStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSwitchStatement_Var(), this.getVarDeclaration(), null, "var", null, 0, 1, SwitchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitchStatement_Cases(), this.getSwitchCase(), null, "cases", null, 0, -1, SwitchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitchStatement_Default(), this.getSwitchDefault(), null, "default", null, 0, 1, SwitchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchCaseEClass, SwitchCase.class, "SwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSwitchCase_Var(), ecorePackage.getEInt(), "var", null, 0, 1, SwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitchCase_Statement(), this.getStatement(), null, "statement", null, 0, 1, SwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchDefaultEClass, SwitchDefault.class, "SwitchDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSwitchDefault_Statement(), this.getStatement(), null, "statement", null, 0, 1, SwitchDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(returnStatementEClass, ReturnStatement.class, "ReturnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReturnStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, ReturnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(continueStatementEClass, ContinueStatement.class, "ContinueStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(breakStatementEClass, BreakStatement.class, "BreakStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Expression(), ecorePackage.getEObject(), null, "expression", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varEClass, Var.class, "Var", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVar_Name(), this.getVarDeclaration(), null, "name", null, 0, 1, Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCall_Function(), this.getFunDeclaration(), null, "function", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCall_Args(), this.getArguments(), null, "args", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentsEClass, Arguments.class, "Arguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArguments_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, Arguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signedNumEClass, SignedNum.class, "SignedNum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(emptyExpressionStatementEClass, EmptyExpressionStatement.class, "EmptyExpressionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assignmentExpressionEClass, AssignmentExpression.class, "AssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignmentExpression_Var(), this.getVar(), null, "var", null, 0, 1, AssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(postfixExpressionEClass, PostfixExpression.class, "PostfixExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPostfixExpression_PostfixVar(), this.getVarDeclaration(), null, "postfixVar", null, 0, 1, PostfixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPostfixExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, PostfixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleExpressionEClass, SimpleExpression.class, "SimpleExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleExpression_Left(), this.getExpression(), null, "left", null, 0, 1, SimpleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, SimpleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleExpression_Right(), this.getExpression(), null, "right", null, 0, 1, SimpleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndExpression_Left(), this.getExpression(), null, "left", null, 0, 1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAndExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndExpression_Right(), this.getExpression(), null, "right", null, 0, 1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalsExpressionEClass, EqualsExpression.class, "EqualsExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEqualsExpression_Left(), this.getExpression(), null, "left", null, 0, 1, EqualsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEqualsExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, EqualsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEqualsExpression_Right(), this.getExpression(), null, "right", null, 0, 1, EqualsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comparisonExpressionEClass, ComparisonExpression.class, "ComparisonExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComparisonExpression_Left(), this.getExpression(), null, "left", null, 0, 1, ComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComparisonExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, ComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComparisonExpression_Right(), this.getExpression(), null, "right", null, 0, 1, ComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additiveExpressionEClass, AdditiveExpression.class, "AdditiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdditiveExpression_Left(), this.getExpression(), null, "left", null, 0, 1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdditiveExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdditiveExpression_Right(), this.getExpression(), null, "right", null, 0, 1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicativeExpressionEClass, MultiplicativeExpression.class, "MultiplicativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplicativeExpression_Left(), this.getExpression(), null, "left", null, 0, 1, MultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiplicativeExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, MultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplicativeExpression_Right(), this.getExpression(), null, "right", null, 0, 1, MultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryExpressionEClass, PrimaryExpression.class, "PrimaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(literalIntEClass, LiteralInt.class, "LiteralInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralInt_Value(), ecorePackage.getEInt(), "value", null, 0, 1, LiteralInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalFloatEClass, LiteralFloat.class, "LiteralFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralFloat_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, LiteralFloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalBoolEClass, LiteralBool.class, "LiteralBool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralBool_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, LiteralBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalVectorEClass, LiteralVector.class, "LiteralVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteralVector_Value(), this.getVector(), null, "value", null, 0, 1, LiteralVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalStringEClass, LiteralString.class, "LiteralString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralString_Value(), ecorePackage.getEString(), "value", null, 0, 1, LiteralString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //XsPackageImpl
