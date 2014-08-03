package aom.scripting.xs.serializer;

import aom.scripting.xs.services.XSGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class XSSyntacticSequencer extends AbstractSyntacticSequencer {

	protected XSGrammarAccess grammarAccess;
	protected AbstractElementAlias match_RuleDeclaration_InactiveKeyword_2_0_1_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XSGrammarAccess) access;
		match_RuleDeclaration_InactiveKeyword_2_0_1_a = new TokenAlias(true, true, grammarAccess.getRuleDeclarationAccess().getInactiveKeyword_2_0_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSignedNumRule())
			return getSignedNumToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * SignedNum
	 * 	: SignedInt
	 * 	| SignedFloat
	 * 	;
	 */
	protected String getSignedNumToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_RuleDeclaration_InactiveKeyword_2_0_1_a.equals(syntax))
				emit_RuleDeclaration_InactiveKeyword_2_0_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'inactive'*
	 */
	protected void emit_RuleDeclaration_InactiveKeyword_2_0_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
