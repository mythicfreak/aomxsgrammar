/*
 * generated by Xtext
 */
package aom.scripting.xs.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import aom.scripting.xs.services.XSGrammarAccess;

public class XSParser extends AbstractContentAssistParser {
	
	@Inject
	private XSGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected aom.scripting.xs.ui.contentassist.antlr.internal.InternalXSParser createParser() {
		aom.scripting.xs.ui.contentassist.antlr.internal.InternalXSParser result = new aom.scripting.xs.ui.contentassist.antlr.internal.InternalXSParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
					put(grammarAccess.getVarDeclarationAccess().getAlternatives(), "rule__VarDeclaration__Alternatives");
					put(grammarAccess.getFunctionDeclarationAccess().getAlternatives_5(), "rule__FunctionDeclaration__Alternatives_5");
					put(grammarAccess.getFunctionTypeSpecifierAccess().getAlternatives(), "rule__FunctionTypeSpecifier__Alternatives");
					put(grammarAccess.getRuleDeclarationAccess().getAlternatives_3_0(), "rule__RuleDeclaration__Alternatives_3_0");
					put(grammarAccess.getVarTypeSpecifierAccess().getAlternatives(), "rule__VarTypeSpecifier__Alternatives");
					put(grammarAccess.getVarDeclarationOrStatementAccess().getAlternatives(), "rule__VarDeclarationOrStatement__Alternatives");
					put(grammarAccess.getStatementOrBlockAccess().getAlternatives(), "rule__StatementOrBlock__Alternatives");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getExpressionStatementAccess().getAlternatives(), "rule__ExpressionStatement__Alternatives");
					put(grammarAccess.getSwitchCaseAccess().getAlternatives_2(), "rule__SwitchCase__Alternatives_2");
					put(grammarAccess.getPostFixOpAccess().getAlternatives(), "rule__PostFixOp__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getEqOpAccess().getAlternatives(), "rule__EqOp__Alternatives");
					put(grammarAccess.getRelOpAccess().getAlternatives(), "rule__RelOp__Alternatives");
					put(grammarAccess.getAddOpAccess().getAlternatives(), "rule__AddOp__Alternatives");
					put(grammarAccess.getMulOpAccess().getAlternatives(), "rule__MulOp__Alternatives");
					put(grammarAccess.getAtomAccess().getAlternatives(), "rule__Atom__Alternatives");
					put(grammarAccess.getLiteralOrVarAccess().getAlternatives(), "rule__LiteralOrVar__Alternatives");
					put(grammarAccess.getLiteralNumOrVarAccess().getAlternatives(), "rule__LiteralNumOrVar__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getLiteralNumAccess().getAlternatives(), "rule__LiteralNum__Alternatives");
					put(grammarAccess.getBoolAccess().getAlternatives(), "rule__Bool__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getIncludeDeclarationAccess().getGroup(), "rule__IncludeDeclaration__Group__0");
					put(grammarAccess.getPseudoIncludeDeclarationAccess().getGroup(), "rule__PseudoIncludeDeclaration__Group__0");
					put(grammarAccess.getLocalVarDeclarationAccess().getGroup(), "rule__LocalVarDeclaration__Group__0");
					put(grammarAccess.getGlobalVarDeclarationAccess().getGroup(), "rule__GlobalVarDeclaration__Group__0");
					put(grammarAccess.getParameterDeclarationAccess().getGroup(), "rule__ParameterDeclaration__Group__0");
					put(grammarAccess.getForVarDeclarationAccess().getGroup(), "rule__ForVarDeclaration__Group__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup(), "rule__FunctionDeclaration__Group__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup_5_1(), "rule__FunctionDeclaration__Group_5_1__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup_5_1_1(), "rule__FunctionDeclaration__Group_5_1_1__0");
					put(grammarAccess.getRuleDeclarationAccess().getGroup(), "rule__RuleDeclaration__Group__0");
					put(grammarAccess.getRuleDeclarationAccess().getGroup_3_3(), "rule__RuleDeclaration__Group_3_3__0");
					put(grammarAccess.getRuleDeclarationAccess().getGroup_3_4(), "rule__RuleDeclaration__Group_3_4__0");
					put(grammarAccess.getRuleDeclarationAccess().getGroup_3_5(), "rule__RuleDeclaration__Group_3_5__0");
					put(grammarAccess.getRuleDeclarationAccess().getGroup_3_6(), "rule__RuleDeclaration__Group_3_6__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getExpressionStatementAccess().getGroup_0(), "rule__ExpressionStatement__Group_0__0");
					put(grammarAccess.getExpressionStatementAccess().getGroup_1(), "rule__ExpressionStatement__Group_1__0");
					put(grammarAccess.getPostfixStatementAccess().getGroup(), "rule__PostfixStatement__Group__0");
					put(grammarAccess.getIfElseStatementAccess().getGroup(), "rule__IfElseStatement__Group__0");
					put(grammarAccess.getIfElseStatementAccess().getGroup_6(), "rule__IfElseStatement__Group_6__0");
					put(grammarAccess.getWhileStatementAccess().getGroup(), "rule__WhileStatement__Group__0");
					put(grammarAccess.getForStatementAccess().getGroup(), "rule__ForStatement__Group__0");
					put(grammarAccess.getSwitchStatementAccess().getGroup(), "rule__SwitchStatement__Group__0");
					put(grammarAccess.getSwitchCaseAccess().getGroup(), "rule__SwitchCase__Group__0");
					put(grammarAccess.getSwitchCaseAccess().getGroup_2_1(), "rule__SwitchCase__Group_2_1__0");
					put(grammarAccess.getSwitchDefaultAccess().getGroup(), "rule__SwitchDefault__Group__0");
					put(grammarAccess.getReturnStatementAccess().getGroup(), "rule__ReturnStatement__Group__0");
					put(grammarAccess.getReturnStatementAccess().getGroup_2(), "rule__ReturnStatement__Group_2__0");
					put(grammarAccess.getContinueStatementAccess().getGroup(), "rule__ContinueStatement__Group__0");
					put(grammarAccess.getBreakStatementAccess().getGroup(), "rule__BreakStatement__Group__0");
					put(grammarAccess.getAssignAccess().getGroup(), "rule__Assign__Group__0");
					put(grammarAccess.getAssignAccess().getGroup_1(), "rule__Assign__Group_1__0");
					put(grammarAccess.getSimpleExpressionAccess().getGroup(), "rule__SimpleExpression__Group__0");
					put(grammarAccess.getSimpleExpressionAccess().getGroup_1(), "rule__SimpleExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getEqualsExpressionAccess().getGroup(), "rule__EqualsExpression__Group__0");
					put(grammarAccess.getEqualsExpressionAccess().getGroup_1(), "rule__EqualsExpression__Group_1__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup(), "rule__ComparisonExpression__Group__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup_1(), "rule__ComparisonExpression__Group_1__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1(), "rule__AdditiveExpression__Group_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
					put(grammarAccess.getAtomAccess().getGroup_0(), "rule__Atom__Group_0__0");
					put(grammarAccess.getCallAccess().getGroup(), "rule__Call__Group__0");
					put(grammarAccess.getCallAccess().getGroup_3(), "rule__Call__Group_3__0");
					put(grammarAccess.getCallAccess().getGroup_3_1(), "rule__Call__Group_3_1__0");
					put(grammarAccess.getVarAccess().getGroup(), "rule__Var__Group__0");
					put(grammarAccess.getLiteralAccess().getGroup_2(), "rule__Literal__Group_2__0");
					put(grammarAccess.getLiteralNumAccess().getGroup_0(), "rule__LiteralNum__Group_0__0");
					put(grammarAccess.getLiteralNumAccess().getGroup_1(), "rule__LiteralNum__Group_1__0");
					put(grammarAccess.getLiteralNumAccess().getGroup_2(), "rule__LiteralNum__Group_2__0");
					put(grammarAccess.getVectorAccess().getGroup(), "rule__Vector__Group__0");
					put(grammarAccess.getIntTypeAccess().getGroup(), "rule__IntType__Group__0");
					put(grammarAccess.getFloatTypeAccess().getGroup(), "rule__FloatType__Group__0");
					put(grammarAccess.getBoolTypeAccess().getGroup(), "rule__BoolType__Group__0");
					put(grammarAccess.getVectorTypeAccess().getGroup(), "rule__VectorType__Group__0");
					put(grammarAccess.getStringTypeAccess().getGroup(), "rule__StringType__Group__0");
					put(grammarAccess.getVoidTypeAccess().getGroup(), "rule__VoidType__Group__0");
					put(grammarAccess.getSignedIntAccess().getGroup(), "rule__SignedInt__Group__0");
					put(grammarAccess.getSignedFloatAccess().getGroup(), "rule__SignedFloat__Group__0");
					put(grammarAccess.getProgramAccess().getDeclarationsAssignment_1(), "rule__Program__DeclarationsAssignment_1");
					put(grammarAccess.getIncludeDeclarationAccess().getFilePathAssignment_2(), "rule__IncludeDeclaration__FilePathAssignment_2");
					put(grammarAccess.getPseudoIncludeDeclarationAccess().getFilePathAssignment_3(), "rule__PseudoIncludeDeclaration__FilePathAssignment_3");
					put(grammarAccess.getLocalVarDeclarationAccess().getTypeAssignment_1(), "rule__LocalVarDeclaration__TypeAssignment_1");
					put(grammarAccess.getLocalVarDeclarationAccess().getNameAssignment_2(), "rule__LocalVarDeclaration__NameAssignment_2");
					put(grammarAccess.getLocalVarDeclarationAccess().getValueAssignment_4(), "rule__LocalVarDeclaration__ValueAssignment_4");
					put(grammarAccess.getGlobalVarDeclarationAccess().getConstAssignment_1_0(), "rule__GlobalVarDeclaration__ConstAssignment_1_0");
					put(grammarAccess.getGlobalVarDeclarationAccess().getExternAssignment_1_1(), "rule__GlobalVarDeclaration__ExternAssignment_1_1");
					put(grammarAccess.getGlobalVarDeclarationAccess().getTypeAssignment_2(), "rule__GlobalVarDeclaration__TypeAssignment_2");
					put(grammarAccess.getGlobalVarDeclarationAccess().getNameAssignment_3(), "rule__GlobalVarDeclaration__NameAssignment_3");
					put(grammarAccess.getGlobalVarDeclarationAccess().getValueAssignment_5(), "rule__GlobalVarDeclaration__ValueAssignment_5");
					put(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_1(), "rule__ParameterDeclaration__TypeAssignment_1");
					put(grammarAccess.getParameterDeclarationAccess().getNameAssignment_2(), "rule__ParameterDeclaration__NameAssignment_2");
					put(grammarAccess.getParameterDeclarationAccess().getValueAssignment_4(), "rule__ParameterDeclaration__ValueAssignment_4");
					put(grammarAccess.getForVarDeclarationAccess().getNameAssignment_1(), "rule__ForVarDeclaration__NameAssignment_1");
					put(grammarAccess.getForVarDeclarationAccess().getValueAssignment_3(), "rule__ForVarDeclaration__ValueAssignment_3");
					put(grammarAccess.getFunctionDeclarationAccess().getMutableAssignment_1(), "rule__FunctionDeclaration__MutableAssignment_1");
					put(grammarAccess.getFunctionDeclarationAccess().getTypeAssignment_2(), "rule__FunctionDeclaration__TypeAssignment_2");
					put(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_3(), "rule__FunctionDeclaration__NameAssignment_3");
					put(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_5_1_0(), "rule__FunctionDeclaration__ParametersAssignment_5_1_0");
					put(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_5_1_1_1(), "rule__FunctionDeclaration__ParametersAssignment_5_1_1_1");
					put(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_7(), "rule__FunctionDeclaration__BodyAssignment_7");
					put(grammarAccess.getRuleDeclarationAccess().getNameAssignment_2(), "rule__RuleDeclaration__NameAssignment_2");
					put(grammarAccess.getRuleDeclarationAccess().getActiveAssignment_3_0_0(), "rule__RuleDeclaration__ActiveAssignment_3_0_0");
					put(grammarAccess.getRuleDeclarationAccess().getRunImmediatelyAssignment_3_1(), "rule__RuleDeclaration__RunImmediatelyAssignment_3_1");
					put(grammarAccess.getRuleDeclarationAccess().getHighFrequencyAssignment_3_2(), "rule__RuleDeclaration__HighFrequencyAssignment_3_2");
					put(grammarAccess.getRuleDeclarationAccess().getGroupAssignment_3_3_1(), "rule__RuleDeclaration__GroupAssignment_3_3_1");
					put(grammarAccess.getRuleDeclarationAccess().getMinIntervalAssignment_3_4_1(), "rule__RuleDeclaration__MinIntervalAssignment_3_4_1");
					put(grammarAccess.getRuleDeclarationAccess().getMaxIntervalAssignment_3_5_1(), "rule__RuleDeclaration__MaxIntervalAssignment_3_5_1");
					put(grammarAccess.getRuleDeclarationAccess().getPriorityAssignment_3_6_1(), "rule__RuleDeclaration__PriorityAssignment_3_6_1");
					put(grammarAccess.getRuleDeclarationAccess().getBodyAssignment_4(), "rule__RuleDeclaration__BodyAssignment_4");
					put(grammarAccess.getBlockAccess().getContentsAssignment_2(), "rule__Block__ContentsAssignment_2");
					put(grammarAccess.getPostfixStatementAccess().getVarAssignment_1(), "rule__PostfixStatement__VarAssignment_1");
					put(grammarAccess.getPostfixStatementAccess().getOpAssignment_2(), "rule__PostfixStatement__OpAssignment_2");
					put(grammarAccess.getIfElseStatementAccess().getConditionAssignment_3(), "rule__IfElseStatement__ConditionAssignment_3");
					put(grammarAccess.getIfElseStatementAccess().getThenStatementAssignment_5(), "rule__IfElseStatement__ThenStatementAssignment_5");
					put(grammarAccess.getIfElseStatementAccess().getElseStatementAssignment_6_1(), "rule__IfElseStatement__ElseStatementAssignment_6_1");
					put(grammarAccess.getWhileStatementAccess().getConditionAssignment_3(), "rule__WhileStatement__ConditionAssignment_3");
					put(grammarAccess.getWhileStatementAccess().getStatementAssignment_5(), "rule__WhileStatement__StatementAssignment_5");
					put(grammarAccess.getForStatementAccess().getVarAssignment_3(), "rule__ForStatement__VarAssignment_3");
					put(grammarAccess.getForStatementAccess().getOpAssignment_5(), "rule__ForStatement__OpAssignment_5");
					put(grammarAccess.getForStatementAccess().getEndAssignment_6(), "rule__ForStatement__EndAssignment_6");
					put(grammarAccess.getForStatementAccess().getStatementAssignment_8(), "rule__ForStatement__StatementAssignment_8");
					put(grammarAccess.getSwitchStatementAccess().getExpressionAssignment_3(), "rule__SwitchStatement__ExpressionAssignment_3");
					put(grammarAccess.getSwitchStatementAccess().getCasesAssignment_6(), "rule__SwitchStatement__CasesAssignment_6");
					put(grammarAccess.getSwitchStatementAccess().getDefaultAssignment_7(), "rule__SwitchStatement__DefaultAssignment_7");
					put(grammarAccess.getSwitchCaseAccess().getValueAssignment_2_0(), "rule__SwitchCase__ValueAssignment_2_0");
					put(grammarAccess.getSwitchCaseAccess().getValueAssignment_2_1_1(), "rule__SwitchCase__ValueAssignment_2_1_1");
					put(grammarAccess.getSwitchCaseAccess().getStatementAssignment_4(), "rule__SwitchCase__StatementAssignment_4");
					put(grammarAccess.getSwitchDefaultAccess().getStatementAssignment_3(), "rule__SwitchDefault__StatementAssignment_3");
					put(grammarAccess.getReturnStatementAccess().getExpressionAssignment_2_1(), "rule__ReturnStatement__ExpressionAssignment_2_1");
					put(grammarAccess.getAssignAccess().getVarAssignment_1_0(), "rule__Assign__VarAssignment_1_0");
					put(grammarAccess.getAssignAccess().getExpressionAssignment_1_2(), "rule__Assign__ExpressionAssignment_1_2");
					put(grammarAccess.getSimpleExpressionAccess().getOpAssignment_1_1(), "rule__SimpleExpression__OpAssignment_1_1");
					put(grammarAccess.getSimpleExpressionAccess().getRightAssignment_1_2(), "rule__SimpleExpression__RightAssignment_1_2");
					put(grammarAccess.getAndExpressionAccess().getOpAssignment_1_1(), "rule__AndExpression__OpAssignment_1_1");
					put(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2(), "rule__AndExpression__RightAssignment_1_2");
					put(grammarAccess.getEqualsExpressionAccess().getOpAssignment_1_1(), "rule__EqualsExpression__OpAssignment_1_1");
					put(grammarAccess.getEqualsExpressionAccess().getRightAssignment_1_2(), "rule__EqualsExpression__RightAssignment_1_2");
					put(grammarAccess.getComparisonExpressionAccess().getOpAssignment_1_1(), "rule__ComparisonExpression__OpAssignment_1_1");
					put(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2(), "rule__ComparisonExpression__RightAssignment_1_2");
					put(grammarAccess.getAdditiveExpressionAccess().getOpAssignment_1_1(), "rule__AdditiveExpression__OpAssignment_1_1");
					put(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1_2(), "rule__AdditiveExpression__RightAssignment_1_2");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_1(), "rule__MultiplicativeExpression__OpAssignment_1_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_2(), "rule__MultiplicativeExpression__RightAssignment_1_2");
					put(grammarAccess.getCallAccess().getFunctionAssignment_1(), "rule__Call__FunctionAssignment_1");
					put(grammarAccess.getCallAccess().getArgumentsAssignment_3_0(), "rule__Call__ArgumentsAssignment_3_0");
					put(grammarAccess.getCallAccess().getArgumentsAssignment_3_1_1(), "rule__Call__ArgumentsAssignment_3_1_1");
					put(grammarAccess.getVarAccess().getDeclarationAssignment_1(), "rule__Var__DeclarationAssignment_1");
					put(grammarAccess.getLiteralAccess().getValueAssignment_2_1(), "rule__Literal__ValueAssignment_2_1");
					put(grammarAccess.getLiteralNumAccess().getValueAssignment_0_1(), "rule__LiteralNum__ValueAssignment_0_1");
					put(grammarAccess.getLiteralNumAccess().getValueAssignment_1_1(), "rule__LiteralNum__ValueAssignment_1_1");
					put(grammarAccess.getLiteralNumAccess().getValueAssignment_2_1(), "rule__LiteralNum__ValueAssignment_2_1");
					put(grammarAccess.getVectorAccess().getXAssignment_3(), "rule__Vector__XAssignment_3");
					put(grammarAccess.getVectorAccess().getYAssignment_5(), "rule__Vector__YAssignment_5");
					put(grammarAccess.getVectorAccess().getZAssignment_7(), "rule__Vector__ZAssignment_7");
					put(grammarAccess.getGlobalVarDeclarationAccess().getUnorderedGroup_1(), "rule__GlobalVarDeclaration__UnorderedGroup_1");
					put(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), "rule__RuleDeclaration__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			aom.scripting.xs.ui.contentassist.antlr.internal.InternalXSParser typedParser = (aom.scripting.xs.ui.contentassist.antlr.internal.InternalXSParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public XSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
