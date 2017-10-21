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
      case XsPackage.INCLUDE_DECLARATION: return createIncludeDeclaration();
      case XsPackage.VAR_DECLARATION: return createVarDeclaration();
      case XsPackage.LOCAL_VAR_DECLARATION: return createLocalVarDeclaration();
      case XsPackage.GLOBAL_VAR_DECLARATION: return createGlobalVarDeclaration();
      case XsPackage.PARAMETER_DECLARATION: return createParameterDeclaration();
      case XsPackage.FOR_VAR_DECLARATION: return createForVarDeclaration();
      case XsPackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
      case XsPackage.TYPE: return createType();
      case XsPackage.RULE_DECLARATION: return createRuleDeclaration();
      case XsPackage.BLOCK: return createBlock();
      case XsPackage.STATEMENT: return createStatement();
      case XsPackage.SWITCH_CASE: return createSwitchCase();
      case XsPackage.SWITCH_DEFAULT: return createSwitchDefault();
      case XsPackage.EXPRESSION: return createExpression();
      case XsPackage.VAR: return createVar();
      case XsPackage.LITERAL: return createLiteral();
      case XsPackage.POSTFIX_STATEMENT: return createPostfixStatement();
      case XsPackage.IF_ELSE_STATEMENT: return createIfElseStatement();
      case XsPackage.WHILE_STATEMENT: return createWhileStatement();
      case XsPackage.FOR_STATEMENT: return createForStatement();
      case XsPackage.SWITCH_STATEMENT: return createSwitchStatement();
      case XsPackage.RETURN_STATEMENT: return createReturnStatement();
      case XsPackage.CONTINUE_STATEMENT: return createContinueStatement();
      case XsPackage.BREAK_STATEMENT: return createBreakStatement();
      case XsPackage.ASSIGN: return createAssign();
      case XsPackage.OR_EXPRESSION: return createOrExpression();
      case XsPackage.AND_EXPRESSION: return createAndExpression();
      case XsPackage.EQUALS_EXPRESSION: return createEqualsExpression();
      case XsPackage.COMPARISON_EXPRESSION: return createComparisonExpression();
      case XsPackage.TERM: return createTerm();
      case XsPackage.FACTOR: return createFactor();
      case XsPackage.CALL: return createCall();
      case XsPackage.LITERAL_STRING: return createLiteralString();
      case XsPackage.LITERAL_INT: return createLiteralInt();
      case XsPackage.LITERAL_FLOAT: return createLiteralFloat();
      case XsPackage.LITERAL_BOOL: return createLiteralBool();
      case XsPackage.VECTOR_LITERAL: return createVectorLiteral();
      case XsPackage.INT_TYPE: return createIntType();
      case XsPackage.FLOAT_TYPE: return createFloatType();
      case XsPackage.BOOL_TYPE: return createBoolType();
      case XsPackage.VECTOR_TYPE: return createVectorType();
      case XsPackage.STRING_TYPE: return createStringType();
      case XsPackage.VOID_TYPE: return createVoidType();
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
  public IncludeDeclaration createIncludeDeclaration()
  {
    IncludeDeclarationImpl includeDeclaration = new IncludeDeclarationImpl();
    return includeDeclaration;
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
  public LocalVarDeclaration createLocalVarDeclaration()
  {
    LocalVarDeclarationImpl localVarDeclaration = new LocalVarDeclarationImpl();
    return localVarDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalVarDeclaration createGlobalVarDeclaration()
  {
    GlobalVarDeclarationImpl globalVarDeclaration = new GlobalVarDeclarationImpl();
    return globalVarDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDeclaration createParameterDeclaration()
  {
    ParameterDeclarationImpl parameterDeclaration = new ParameterDeclarationImpl();
    return parameterDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForVarDeclaration createForVarDeclaration()
  {
    ForVarDeclarationImpl forVarDeclaration = new ForVarDeclarationImpl();
    return forVarDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDeclaration createFunctionDeclaration()
  {
    FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
    return functionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
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
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
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
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostfixStatement createPostfixStatement()
  {
    PostfixStatementImpl postfixStatement = new PostfixStatementImpl();
    return postfixStatement;
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
  public Assign createAssign()
  {
    AssignImpl assign = new AssignImpl();
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
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
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Factor createFactor()
  {
    FactorImpl factor = new FactorImpl();
    return factor;
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
  public VectorLiteral createVectorLiteral()
  {
    VectorLiteralImpl vectorLiteral = new VectorLiteralImpl();
    return vectorLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntType createIntType()
  {
    IntTypeImpl intType = new IntTypeImpl();
    return intType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatType createFloatType()
  {
    FloatTypeImpl floatType = new FloatTypeImpl();
    return floatType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolType createBoolType()
  {
    BoolTypeImpl boolType = new BoolTypeImpl();
    return boolType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VectorType createVectorType()
  {
    VectorTypeImpl vectorType = new VectorTypeImpl();
    return vectorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringType createStringType()
  {
    StringTypeImpl stringType = new StringTypeImpl();
    return stringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VoidType createVoidType()
  {
    VoidTypeImpl voidType = new VoidTypeImpl();
    return voidType;
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
