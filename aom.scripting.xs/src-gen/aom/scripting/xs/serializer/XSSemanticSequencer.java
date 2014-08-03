package aom.scripting.xs.serializer;

import aom.scripting.xs.services.XSGrammarAccess;
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
import aom.scripting.xs.xs.SwitchCase;
import aom.scripting.xs.xs.SwitchDefault;
import aom.scripting.xs.xs.SwitchStatement;
import aom.scripting.xs.xs.Var;
import aom.scripting.xs.xs.VarDeclaration;
import aom.scripting.xs.xs.VarModifier;
import aom.scripting.xs.xs.Vector;
import aom.scripting.xs.xs.WhileStatement;
import aom.scripting.xs.xs.XsPackage;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class XSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XSGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == XsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XsPackage.ADDITIVE_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualsExpressionRule() ||
				   context == grammarAccess.getEqualsExpressionAccess().getEqualsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getSimpleExpressionLeftAction_1_0()) {
					sequence_AdditiveExpression(context, (AdditiveExpression) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.AND_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getSimpleExpressionLeftAction_1_0()) {
					sequence_AndExpression(context, (AndExpression) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.ARGUMENTS:
				if(context == grammarAccess.getArgumentsRule()) {
					sequence_Arguments(context, (Arguments) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (AssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.BREAK_STATEMENT:
				if(context == grammarAccess.getBreakStatementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarDeclarationOrStatementRule()) {
					sequence_BreakStatement(context, (BreakStatement) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.CALL:
				if(context == grammarAccess.getCallRule()) {
					sequence_Call(context, (Call) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.COMPARISON_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getEqualsExpressionRule() ||
				   context == grammarAccess.getEqualsExpressionAccess().getEqualsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getSimpleExpressionLeftAction_1_0()) {
					sequence_ComparisonExpression(context, (ComparisonExpression) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.COMPOUND_STATEMENT:
				if(context == grammarAccess.getCompoundStatementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarDeclarationOrStatementRule()) {
					sequence_CompoundStatement(context, (CompoundStatement) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.CONSTANT_NUM:
				if(context == grammarAccess.getConstantNumRule() ||
				   context == grammarAccess.getLiteralOrConstantNumRule()) {
					sequence_ConstantNum(context, (ConstantNum) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.CONTINUE_STATEMENT:
				if(context == grammarAccess.getContinueStatementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarDeclarationOrStatementRule()) {
					sequence_ContinueStatement(context, (ContinueStatement) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.EMPTY_EXPRESSION_STATEMENT:
				if(context == grammarAccess.getExpressionStatementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarDeclarationOrStatementRule()) {
					sequence_ExpressionStatement(context, (EmptyExpressionStatement) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.EQUALS_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualsExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getSimpleExpressionLeftAction_1_0()) {
					sequence_EqualsExpression(context, (EqualsExpression) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualsExpressionRule() ||
				   context == grammarAccess.getEqualsExpressionAccess().getEqualsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getSimpleExpressionLeftAction_1_0()) {
					sequence_Atom(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.EXPRESSION_STATEMENT:
				if(context == grammarAccess.getExpressionStatementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarDeclarationOrStatementRule()) {
					sequence_ExpressionStatement(context, (ExpressionStatement) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.FOR_STATEMENT:
				if(context == grammarAccess.getForStatementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarDeclarationOrStatementRule()) {
					sequence_ForStatement(context, (ForStatement) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.FUN_DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getFunDeclarationRule()) {
					sequence_FunDeclaration(context, (FunDeclaration) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.FUN_MODIFIER:
				if(context == grammarAccess.getFunModifierRule()) {
					sequence_FunModifier(context, (FunModifier) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.IF_ELSE_STATEMENT:
				if(context == grammarAccess.getIfElseStatementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarDeclarationOrStatementRule()) {
					sequence_IfElseStatement(context, (IfElseStatement) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.INCLUDE_STATEMENT:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getIncludeStatementRule()) {
					sequence_IncludeStatement(context, (IncludeStatement) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.LITERAL_BOOL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualsExpressionRule() ||
				   context == grammarAccess.getEqualsExpressionAccess().getEqualsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getSimpleExpressionLeftAction_1_0()) {
					sequence_Atom(context, (LiteralBool) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.LITERAL_FLOAT:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualsExpressionRule() ||
				   context == grammarAccess.getEqualsExpressionAccess().getEqualsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getSimpleExpressionLeftAction_1_0()) {
					sequence_Atom(context, (LiteralFloat) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.LITERAL_INT:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualsExpressionRule() ||
				   context == grammarAccess.getEqualsExpressionAccess().getEqualsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getSimpleExpressionLeftAction_1_0()) {
					sequence_Atom(context, (LiteralInt) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.LITERAL_STRING:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualsExpressionRule() ||
				   context == grammarAccess.getEqualsExpressionAccess().getEqualsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getSimpleExpressionLeftAction_1_0()) {
					sequence_Atom(context, (LiteralString) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.LITERAL_VECTOR:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualsExpressionRule() ||
				   context == grammarAccess.getEqualsExpressionAccess().getEqualsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getSimpleExpressionLeftAction_1_0()) {
					sequence_Atom(context, (LiteralVector) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.MULTIPLICATIVE_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualsExpressionRule() ||
				   context == grammarAccess.getEqualsExpressionAccess().getEqualsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getSimpleExpressionLeftAction_1_0()) {
					sequence_MultiplicativeExpression(context, (MultiplicativeExpression) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.PARAMS:
				if(context == grammarAccess.getParamsRule()) {
					sequence_Params(context, (Params) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.POSTFIX_EXPRESSION:
				if(context == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (PostfixExpression) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.PRIMARY_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAtomRule() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEqualsExpressionRule() ||
				   context == grammarAccess.getEqualsExpressionAccess().getEqualsExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getSimpleExpressionLeftAction_1_0()) {
					sequence_Atom(context, (PrimaryExpression) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.RETURN_STATEMENT:
				if(context == grammarAccess.getReturnStatementRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarDeclarationOrStatementRule()) {
					sequence_ReturnStatement(context, (ReturnStatement) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.RULE_DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getRuleDeclarationRule()) {
					sequence_RuleDeclaration(context, (RuleDeclaration) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.SIGNED_NUM:
				if(context == grammarAccess.getLiteralOrConstantNumRule()) {
					sequence_LiteralOrConstantNum(context, (SignedNum) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.SIMPLE_EXPRESSION:
				if(context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getSimpleExpressionLeftAction_1_0()) {
					sequence_SimpleExpression(context, (SimpleExpression) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.SWITCH_CASE:
				if(context == grammarAccess.getSwitchCaseRule()) {
					sequence_SwitchCase(context, (SwitchCase) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.SWITCH_DEFAULT:
				if(context == grammarAccess.getSwitchDefaultRule()) {
					sequence_SwitchDefault(context, (SwitchDefault) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.SWITCH_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getSwitchStatementRule() ||
				   context == grammarAccess.getVarDeclarationOrStatementRule()) {
					sequence_SwitchStatement(context, (SwitchStatement) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.VAR:
				if(context == grammarAccess.getVarRule()) {
					sequence_Var(context, (Var) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.VAR_DECLARATION:
				if(context == grammarAccess.getForVarDeclarationRule()) {
					sequence_ForVarDeclaration(context, (VarDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getVarDeclarationRule() ||
				   context == grammarAccess.getVarDeclarationOrStatementRule()) {
					sequence_VarDeclaration(context, (VarDeclaration) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.VAR_MODIFIER:
				if(context == grammarAccess.getVarModifierRule()) {
					sequence_VarModifier(context, (VarModifier) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.VECTOR:
				if(context == grammarAccess.getVectorRule()) {
					sequence_Vector(context, (Vector) semanticObject); 
					return; 
				}
				else break;
			case XsPackage.WHILE_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarDeclarationOrStatementRule() ||
				   context == grammarAccess.getWhileStatementRule()) {
					sequence_WhileStatement(context, (WhileStatement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=AdditiveExpression_AdditiveExpression_1_0 op=AddOp right=MultiplicativeExpression)
	 */
	protected void sequence_AdditiveExpression(EObject context, AdditiveExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=AndExpression_AndExpression_1_0 op='&&' right=EqualsExpression)
	 */
	protected void sequence_AndExpression(EObject context, AndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=Expression expressions+=Expression*)
	 */
	protected void sequence_Arguments(EObject context, Arguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Var | expression=Call)
	 */
	protected void sequence_Atom(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Bool
	 */
	protected void sequence_Atom(EObject context, LiteralBool semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=SignedFloat
	 */
	protected void sequence_Atom(EObject context, LiteralFloat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=SignedInt
	 */
	protected void sequence_Atom(EObject context, LiteralInt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Atom(EObject context, LiteralString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Vector
	 */
	protected void sequence_Atom(EObject context, LiteralVector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_Atom(EObject context, PrimaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomAccess().getExpressionExpressionParserRuleCall_0_1_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {BreakStatement}
	 */
	protected void sequence_BreakStatement(EObject context, BreakStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (function=[FunDeclaration|ID] args=Arguments?)
	 */
	protected void sequence_Call(EObject context, Call semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ComparisonExpression_ComparisonExpression_1_0 op=RelOp right=AdditiveExpression)
	 */
	protected void sequence_ComparisonExpression(EObject context, ComparisonExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (contents+=VarDeclarationOrStatement*)
	 */
	protected void sequence_CompoundStatement(EObject context, CompoundStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     var=[VarDeclaration|ID]
	 */
	protected void sequence_ConstantNum(EObject context, ConstantNum semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.CONSTANT_NUM__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.CONSTANT_NUM__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantNumAccess().getVarVarDeclarationIDTerminalRuleCall_0_1(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {ContinueStatement}
	 */
	protected void sequence_ContinueStatement(EObject context, ContinueStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=EqualsExpression_EqualsExpression_1_0 op=EqOp right=ComparisonExpression)
	 */
	protected void sequence_EqualsExpression(EObject context, EqualsExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EmptyExpressionStatement}
	 */
	protected void sequence_ExpressionStatement(EObject context, EmptyExpressionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_ExpressionStatement(EObject context, ExpressionStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.EXPRESSION_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.EXPRESSION_STATEMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionStatementAccess().getExpressionExpressionParserRuleCall_0_0_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var=Var expression=Expression)
	 */
	protected void sequence_Expression(EObject context, AssignmentExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.EXPRESSION__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.ASSIGNMENT_EXPRESSION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.ASSIGNMENT_EXPRESSION__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getVarVarParserRuleCall_0_1_0_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_0_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=SimpleExpression
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getExpressionSimpleExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (postfixVar=[VarDeclaration|ID] op=PostFixOp)
	 */
	protected void sequence_Expression(EObject context, PostfixExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=ForVarDeclaration op=RelOp expression=Expression statement=Statement)
	 */
	protected void sequence_ForStatement(EObject context, ForStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.FOR_STATEMENT__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.FOR_STATEMENT__VAR));
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.FOR_STATEMENT__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.FOR_STATEMENT__OP));
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.FOR_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.FOR_STATEMENT__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.FOR_STATEMENT__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.FOR_STATEMENT__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForStatementAccess().getVarForVarDeclarationParserRuleCall_2_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getForStatementAccess().getOpRelOpParserRuleCall_4_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getForStatementAccess().getExpressionExpressionParserRuleCall_5_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getForStatementAccess().getStatementStatementParserRuleCall_7_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=Expression)
	 */
	protected void sequence_ForVarDeclaration(EObject context, VarDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifier=FunModifier type=FunTypeSpecifier name=ID paramlist=Params? statements=CompoundStatement)
	 */
	protected void sequence_FunDeclaration(EObject context, FunDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (static?='static'? mutable?='mutable'?)
	 */
	protected void sequence_FunModifier(EObject context, FunModifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expression ifStatement=Statement elseStatement=Statement?)
	 */
	protected void sequence_IfElseStatement(EObject context, IfElseStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_IncludeStatement(EObject context, IncludeStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIncludeStatementAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {SignedNum}
	 */
	protected void sequence_LiteralOrConstantNum(EObject context, SignedNum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicativeExpression_MultiplicativeExpression_1_0 op=MulOp right=Atom)
	 */
	protected void sequence_MultiplicativeExpression(EObject context, MultiplicativeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (param='void' | (params+=VarDeclaration params+=VarDeclaration*))
	 */
	protected void sequence_Params(EObject context, Params semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     declarations+=Declaration*
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression?)
	 */
	protected void sequence_ReturnStatement(EObject context, ReturnStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         active?='active'? 
	 *         runImmediately?='runImmediately'? 
	 *         highFrequency?='highFrequency'? 
	 *         group=ID? 
	 *         minInterval=INT? 
	 *         maxInterval=INT? 
	 *         statements=CompoundStatement
	 *     )
	 */
	protected void sequence_RuleDeclaration(EObject context, RuleDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SimpleExpression_SimpleExpression_1_0 op='||' right=AndExpression)
	 */
	protected void sequence_SimpleExpression(EObject context, SimpleExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=SignedInt statement=Statement)
	 */
	protected void sequence_SwitchCase(EObject context, SwitchCase semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.SWITCH_CASE__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.SWITCH_CASE__VAR));
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.SWITCH_CASE__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.SWITCH_CASE__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSwitchCaseAccess().getVarSignedIntParserRuleCall_1_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getSwitchCaseAccess().getStatementStatementParserRuleCall_4_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     statement=Statement
	 */
	protected void sequence_SwitchDefault(EObject context, SwitchDefault semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.SWITCH_DEFAULT__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.SWITCH_DEFAULT__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSwitchDefaultAccess().getStatementStatementParserRuleCall_3_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var=[VarDeclaration|ID] cases+=SwitchCase* default=SwitchDefault?)
	 */
	protected void sequence_SwitchStatement(EObject context, SwitchStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifier=VarModifier type=VarTypeSpecifier name=ID value=Expression)
	 */
	protected void sequence_VarDeclaration(EObject context, VarDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.VAR_DECLARATION__MODIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.VAR_DECLARATION__MODIFIER));
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.VAR_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.VAR_DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.VAR_DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.VAR_DECLARATION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarDeclarationAccess().getModifierVarModifierParserRuleCall_0_0(), semanticObject.getModifier());
		feeder.accept(grammarAccess.getVarDeclarationAccess().getTypeVarTypeSpecifierParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVarDeclarationAccess().getValueExpressionParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (static?='static'? const?='const'? extern?='extern'?)
	 */
	protected void sequence_VarModifier(EObject context, VarModifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=[VarDeclaration|ID]
	 */
	protected void sequence_Var(EObject context, Var semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.VAR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.VAR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarAccess().getNameVarDeclarationIDTerminalRuleCall_0_1(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (x=LiteralOrConstantNum y=LiteralOrConstantNum z=LiteralOrConstantNum)
	 */
	protected void sequence_Vector(EObject context, Vector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.VECTOR__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.VECTOR__X));
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.VECTOR__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.VECTOR__Y));
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.VECTOR__Z) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.VECTOR__Z));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVectorAccess().getXLiteralOrConstantNumParserRuleCall_2_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getVectorAccess().getYLiteralOrConstantNumParserRuleCall_4_0(), semanticObject.getY());
		feeder.accept(grammarAccess.getVectorAccess().getZLiteralOrConstantNumParserRuleCall_6_0(), semanticObject.getZ());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expression statement=Statement)
	 */
	protected void sequence_WhileStatement(EObject context, WhileStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.WHILE_STATEMENT__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.WHILE_STATEMENT__CONDITION));
			if(transientValues.isValueTransient(semanticObject, XsPackage.Literals.WHILE_STATEMENT__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XsPackage.Literals.WHILE_STATEMENT__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getWhileStatementAccess().getStatementStatementParserRuleCall_4_0(), semanticObject.getStatement());
		feeder.finish();
	}
}
