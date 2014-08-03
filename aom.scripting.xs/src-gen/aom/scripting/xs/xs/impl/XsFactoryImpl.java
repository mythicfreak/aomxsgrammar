/**
 */
package aom.scripting.xs.xs.impl;

import aom.scripting.xs.xs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XsFactoryImpl extends EFactoryImpl implements XsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XsFactory init()
  {
    try
    {
      XsFactory theXsFactory = (XsFactory)EPackage.Registry.INSTANCE.getEFactory(XsPackage.eNS_URI);
      if (theXsFactory != null)
      {
        return theXsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case XsPackage.PROGRAM: return createProgram();
      case XsPackage.DECLARATION: return createDeclaration();
      case XsPackage.CONSTANT_NUM: return createConstantNum();
      case XsPackage.LITERAL_OR_CONSTANT_NUM: return createLiteralOrConstantNum();
      case XsPackage.VECTOR: return createVector();
      case XsPackage.VAR_DECLARATION: return createVarDeclaration();
      case XsPackage.FUN_DECLARATION: return createFunDeclaration();
      case XsPackage.INCLUDE_STATEMENT: return createIncludeStatement();
      case XsPackage.RULE_DECLARATION: return createRuleDeclaration();
      case XsPackage.VAR_MODIFIER: return createVarModifier();
      case XsPackage.FUN_MODIFIER: return createFunModifier();
      case XsPackage.PARAMS: return createParams();
      case XsPackage.COMPOUND_STATEMENT: return createCompoundStatement();
      case XsPackage.VAR_DECLARATION_OR_STATEMENT: return createVarDeclarationOrStatement();
      case XsPackage.STATEMENT: return createStatement();
      case XsPackage.EXPRESSION_STATEMENT: return createExpressionStatement();
      case XsPackage.IF_ELSE_STATEMENT: return createIfElseStatement();
      case XsPackage.WHILE_STATEMENT: return createWhileStatement();
      case XsPackage.FOR_STATEMENT: return createForStatement();
      case XsPackage.SWITCH_STATEMENT: return createSwitchStatement();
      case XsPackage.SWITCH_CASE: return createSwitchCase();
      case XsPackage.SWITCH_DEFAULT: return createSwitchDefault();
      case XsPackage.RETURN_STATEMENT: return createReturnStatement();
      case XsPackage.CONTINUE_STATEMENT: return createContinueStatement();
      case XsPackage.BREAK_STATEMENT: return createBreakStatement();
      case XsPackage.EXPRESSION: return createExpression();
      case XsPackage.VAR: return createVar();
      case XsPackage.CALL: return createCall();
      case XsPackage.ARGUMENTS: return createArguments();
      case XsPackage.SIGNED_NUM: return createSignedNum();
      case XsPackage.EMPTY_EXPRESSION_STATEMENT: return createEmptyExpressionStatement();
      case XsPackage.ASSIGNMENT_EXPRESSION: return createAssignmentExpression();
      case XsPackage.POSTFIX_EXPRESSION: return createPostfixExpression();
      case XsPackage.SIMPLE_EXPRESSION: return createSimpleExpression();
      case XsPackage.AND_EXPRESSION: return createAndExpression();
      case XsPackage.EQUALS_EXPRESSION: return createEqualsExpression();
      case XsPackage.COMPARISON_EXPRESSION: return createComparisonExpression();
      case XsPackage.ADDITIVE_EXPRESSION: return createAdditiveExpression();
      case XsPackage.MULTIPLICATIVE_EXPRESSION: return createMultiplicativeExpression();
      case XsPackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
      case XsPackage.LITERAL_INT: return createLiteralInt();
      case XsPackage.LITERAL_FLOAT: return createLiteralFloat();
      case XsPackage.LITERAL_BOOL: return createLiteralBool();
      case XsPackage.LITERAL_VECTOR: return createLiteralVector();
      case XsPackage.LITERAL_STRING: return createLiteralString();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantNum createConstantNum()
  {
    ConstantNumImpl constantNum = new ConstantNumImpl();
    return constantNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralOrConstantNum createLiteralOrConstantNum()
  {
    LiteralOrConstantNumImpl literalOrConstantNum = new LiteralOrConstantNumImpl();
    return literalOrConstantNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vector createVector()
  {
    VectorImpl vector = new VectorImpl();
    return vector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDeclaration createVarDeclaration()
  {
    VarDeclarationImpl varDeclaration = new VarDeclarationImpl();
    return varDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunDeclaration createFunDeclaration()
  {
    FunDeclarationImpl funDeclaration = new FunDeclarationImpl();
    return funDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeStatement createIncludeStatement()
  {
    IncludeStatementImpl includeStatement = new IncludeStatementImpl();
    return includeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleDeclaration createRuleDeclaration()
  {
    RuleDeclarationImpl ruleDeclaration = new RuleDeclarationImpl();
    return ruleDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarModifier createVarModifier()
  {
    VarModifierImpl varModifier = new VarModifierImpl();
    return varModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunModifier createFunModifier()
  {
    FunModifierImpl funModifier = new FunModifierImpl();
    return funModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Params createParams()
  {
    ParamsImpl params = new ParamsImpl();
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompoundStatement createCompoundStatement()
  {
    CompoundStatementImpl compoundStatement = new CompoundStatementImpl();
    return compoundStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDeclarationOrStatement createVarDeclarationOrStatement()
  {
    VarDeclarationOrStatementImpl varDeclarationOrStatement = new VarDeclarationOrStatementImpl();
    return varDeclarationOrStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionStatement createExpressionStatement()
  {
    ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
    return expressionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfElseStatement createIfElseStatement()
  {
    IfElseStatementImpl ifElseStatement = new IfElseStatementImpl();
    return ifElseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileStatement createWhileStatement()
  {
    WhileStatementImpl whileStatement = new WhileStatementImpl();
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStatement createForStatement()
  {
    ForStatementImpl forStatement = new ForStatementImpl();
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchStatement createSwitchStatement()
  {
    SwitchStatementImpl switchStatement = new SwitchStatementImpl();
    return switchStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchCase createSwitchCase()
  {
    SwitchCaseImpl switchCase = new SwitchCaseImpl();
    return switchCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchDefault createSwitchDefault()
  {
    SwitchDefaultImpl switchDefault = new SwitchDefaultImpl();
    return switchDefault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement createReturnStatement()
  {
    ReturnStatementImpl returnStatement = new ReturnStatementImpl();
    return returnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContinueStatement createContinueStatement()
  {
    ContinueStatementImpl continueStatement = new ContinueStatementImpl();
    return continueStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreakStatement createBreakStatement()
  {
    BreakStatementImpl breakStatement = new BreakStatementImpl();
    return breakStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var createVar()
  {
    VarImpl var = new VarImpl();
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Call createCall()
  {
    CallImpl call = new CallImpl();
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arguments createArguments()
  {
    ArgumentsImpl arguments = new ArgumentsImpl();
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignedNum createSignedNum()
  {
    SignedNumImpl signedNum = new SignedNumImpl();
    return signedNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptyExpressionStatement createEmptyExpressionStatement()
  {
    EmptyExpressionStatementImpl emptyExpressionStatement = new EmptyExpressionStatementImpl();
    return emptyExpressionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentExpression createAssignmentExpression()
  {
    AssignmentExpressionImpl assignmentExpression = new AssignmentExpressionImpl();
    return assignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostfixExpression createPostfixExpression()
  {
    PostfixExpressionImpl postfixExpression = new PostfixExpressionImpl();
    return postfixExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression createSimpleExpression()
  {
    SimpleExpressionImpl simpleExpression = new SimpleExpressionImpl();
    return simpleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqualsExpression createEqualsExpression()
  {
    EqualsExpressionImpl equalsExpression = new EqualsExpressionImpl();
    return equalsExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparisonExpression createComparisonExpression()
  {
    ComparisonExpressionImpl comparisonExpression = new ComparisonExpressionImpl();
    return comparisonExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpression createAdditiveExpression()
  {
    AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
    return additiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeExpression createMultiplicativeExpression()
  {
    MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
    return multiplicativeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpression createPrimaryExpression()
  {
    PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralInt createLiteralInt()
  {
    LiteralIntImpl literalInt = new LiteralIntImpl();
    return literalInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralFloat createLiteralFloat()
  {
    LiteralFloatImpl literalFloat = new LiteralFloatImpl();
    return literalFloat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralBool createLiteralBool()
  {
    LiteralBoolImpl literalBool = new LiteralBoolImpl();
    return literalBool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralVector createLiteralVector()
  {
    LiteralVectorImpl literalVector = new LiteralVectorImpl();
    return literalVector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralString createLiteralString()
  {
    LiteralStringImpl literalString = new LiteralStringImpl();
    return literalString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XsPackage getXsPackage()
  {
    return (XsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XsPackage getPackage()
  {
    return XsPackage.eINSTANCE;
  }

} //XsFactoryImpl
