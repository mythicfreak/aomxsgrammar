package aom.scripting.xs.scoping;

import static aom.scripting.xs.scoping.XSTypeChecker.Type.*;

import java.util.Arrays;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import aom.scripting.xs.validation.XSValidator;
import aom.scripting.xs.xs.AndExpression;
import aom.scripting.xs.xs.Assign;
import aom.scripting.xs.xs.BoolType;
import aom.scripting.xs.xs.Call;
import aom.scripting.xs.xs.ComparisonExpression;
import aom.scripting.xs.xs.Declaration;
import aom.scripting.xs.xs.EqualsExpression;
import aom.scripting.xs.xs.Expression;
import aom.scripting.xs.xs.Factor;
import aom.scripting.xs.xs.FloatType;
import aom.scripting.xs.xs.ForStatement;
import aom.scripting.xs.xs.ForVarDeclaration;
import aom.scripting.xs.xs.FunctionDeclaration;
import aom.scripting.xs.xs.GlobalVarDeclaration;
import aom.scripting.xs.xs.IfElseStatement;
import aom.scripting.xs.xs.IntType;
import aom.scripting.xs.xs.LiteralBool;
import aom.scripting.xs.xs.LiteralFloat;
import aom.scripting.xs.xs.LiteralInt;
import aom.scripting.xs.xs.LiteralString;
import aom.scripting.xs.xs.LocalVarDeclaration;
import aom.scripting.xs.xs.OrExpression;
import aom.scripting.xs.xs.ParameterDeclaration;
import aom.scripting.xs.xs.PostfixStatement;
import aom.scripting.xs.xs.ReturnStatement;
import aom.scripting.xs.xs.RuleDeclaration;
import aom.scripting.xs.xs.StringType;
import aom.scripting.xs.xs.SwitchCase;
import aom.scripting.xs.xs.SwitchStatement;
import aom.scripting.xs.xs.Term;
import aom.scripting.xs.xs.Var;
import aom.scripting.xs.xs.VectorLiteral;
import aom.scripting.xs.xs.VectorType;
import aom.scripting.xs.xs.VoidType;
import aom.scripting.xs.xs.WhileStatement;
import aom.scripting.xs.xs.XsPackage;
import aom.scripting.xs.xs.util.XsSwitch;

public class XSTypeChecker {
	
	private final XSValidator validator;
	
	public XSTypeChecker(final XSValidator validator) {
		this.validator = validator;
	}
	
	public static enum Type {
		VOID, NUMBER, VECTOR, STRING;
		@Override
		public String toString() {
			return name().toLowerCase();
		}
	}
	
	private final static class XSTypeSwitch extends XsSwitch<Type> {
		@Override
		public Type caseAndExpression(final AndExpression object) {
			return NUMBER;
		}
		
		@Override
		public Type caseAssign(final Assign object) {
			return doSwitch(object.getVar());
		}
		
		@Override
		public Type caseBoolType(final BoolType object) {
			return NUMBER;
		}
		
		@Override
		public Type caseCall(final Call object) {
			return doSwitch(object.getFunction());
		}
		
		@Override
		public Type caseComparisonExpression(final ComparisonExpression object) {
			return NUMBER;
		}
		
		@Override
		public Type caseEqualsExpression(final EqualsExpression object) {
			return NUMBER;
		}
		
		@Override
		public Type caseFactor(final Factor object) {
			// '*' and '/' are either numeric or vector depending on the type of the left argument
			// '%' is always numeric
			return doSwitch(object.getLeft());
		}
		
		@Override
		public Type caseFloatType(final FloatType object) {
			return NUMBER;
		}
		
		@Override
		public Type caseForVarDeclaration(final ForVarDeclaration object) {
			return NUMBER;
		}
		
		@Override
		public Type caseFunctionDeclaration(final FunctionDeclaration object) {
			return doSwitch(object.getType());
		}
		
		@Override
		public Type caseGlobalVarDeclaration(final GlobalVarDeclaration object) {
			return doSwitch(object.getType());
		}
		
		@Override
		public Type caseIntType(final IntType object) {
			return NUMBER;
		}
		
		@Override
		public Type caseLiteralBool(final LiteralBool object) {
			return NUMBER;
		}
		
		@Override
		public Type caseLiteralFloat(final LiteralFloat object) {
			return NUMBER;
		}
		
		@Override
		public Type caseLiteralInt(final LiteralInt object) {
			return NUMBER;
		}
		
		@Override
		public Type caseLiteralString(final LiteralString object) {
			return STRING;
		}
		
		@Override
		public Type caseLocalVarDeclaration(final LocalVarDeclaration object) {
			return doSwitch(object.getType());
		}
		
		@Override
		public Type caseOrExpression(final OrExpression object) {
			return NUMBER;
		}
		
		@Override
		public Type caseParameterDeclaration(final ParameterDeclaration object) {
			return doSwitch(object.getType());
		}
		
		@Override
		public Type caseRuleDeclaration(final RuleDeclaration object) {
			return VOID;
		}
		
		@Override
		public Type caseStringType(final StringType object) {
			return STRING;
		}
		
		@Override
		public Type caseTerm(final Term object) {
			// '+' and '-' are either numeric, string (only '+'), or vector
			final Type left = doSwitch(object.getLeft()), right = doSwitch(object.getRight());
			if (left == STRING || right == STRING)
				return STRING;
			else
				return left;
		}
		
		@Override
		public Type caseVar(final Var object) {
			return doSwitch(object.getDeclaration());
		}
		
		@Override
		public Type caseVectorLiteral(final VectorLiteral object) {
			return VECTOR;
		}
		
		@Override
		public Type caseVectorType(final VectorType object) {
			return VECTOR;
		}
		
		@Override
		public Type caseVoidType(final VoidType object) {
			return VOID;
		}
	}
	
	private final static XSTypeSwitch typingSwitch = new XSTypeSwitch();
	
	private static Type type(final EObject o) {
		if (o == null) // e.g. 'return' without a value
			return VOID;
		return typingSwitch.doSwitch(o);
	}
	
	private final class XSTypeCheckingSwitch extends XsSwitch<Void> {
		
		private EObject currentObject = null;
		
		@Override
		public Void doSwitch(final EObject eObject) {
			currentObject = eObject;
			return super.doSwitch(eObject);
		}
		
		private void error(final String error, final EStructuralFeature feature) {
			error(error, currentObject, feature);
		}
		
		private void error(final String error, final EObject object, final EStructuralFeature feature) {
			validator.acceptError(error, object, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, null);
		}
		
		private void checkEqualTypes(final EObject o1, final EObject o2, final String errorFormat, final EStructuralFeature feature) {
			checkEqualTypes(type(o1), type(o2), errorFormat, feature);
		}
		
		private void checkEqualTypes(final Type t1, final Type t2, final String errorFormat, final EStructuralFeature feature) {
			if (t1 != null && t2 != null && t1 != t2)
				error(String.format(errorFormat, t1, t2), feature);
		}
		
		private void checkType(final EObject o, final Type t, final String errorFormat, final EStructuralFeature feature) {
			checkEqualTypes(type(o), t, errorFormat, feature);
		}
		
		@Override
		public Void caseAndExpression(final AndExpression and) {
			checkType(and.getLeft(), NUMBER, "'and' operand must be a boolean", XsPackage.Literals.AND_EXPRESSION__LEFT);
			checkType(and.getRight(), NUMBER, "'and' operand must be a boolean", XsPackage.Literals.AND_EXPRESSION__RIGHT);
			return null;
		}
		
		@Override
		public Void caseAssign(final Assign assign) {
			checkEqualTypes(assign.getVar(), assign.getExpression(), "Invalid types in variable assignment: Expected %1$s, got %2$s", XsPackage.Literals.ASSIGN__EXPRESSION);
			return null;
		}
		
		@Override
		public Void caseCall(final Call object) {
			final EList<Expression> args = object.getArguments();
			final FunctionDeclaration func = object.getFunction();
			for (int i = 0; i < args.size() && i < func.getParameters().size(); i++) {
				final Expression arg = args.get(i);
				final ParameterDeclaration param = func.getParameters().get(i);
				final Type ta = type(arg), tp = type(param);
				if (ta != null && tp != null & ta != tp)
					error("Parameter '" + param.getName() + "' requires a value of type " + tp + ", but a " + ta + " is given here", arg, null);
			}
			return null;
		}
		
		@Override
		public Void caseComparisonExpression(final ComparisonExpression comparison) {
			final Type left = type(comparison.getLeft()), right = type(comparison.getRight());
			if (left != STRING && left != NUMBER && left != null)
				error("Can only compare numbers and strings, but found " + left, XsPackage.Literals.COMPARISON_EXPRESSION__LEFT);
			else
				checkEqualTypes(left, right, "Compared values must be of the same type, but found %1$s and %2$s", null);
			return null;
		}
		
		@Override
		public Void caseEqualsExpression(final EqualsExpression comparison) {
			checkEqualTypes(comparison.getLeft(), comparison.getRight(), "Compared values must be of the same type, but found %1$s and %2$s", null);
			return null;
		}
		
		@Override
		public Void caseFactor(final Factor factor) {
			final Type left = type(factor.getLeft()), right = type(factor.getRight());
			if (factor.getOp().equals("%")) {
				checkEqualTypes(left, NUMBER, "Modulo operand must be a number", XsPackage.Literals.FACTOR__LEFT);
				checkEqualTypes(right, NUMBER, "Modulo operand must be a number", XsPackage.Literals.FACTOR__RIGHT);
			} else {
				if (left != NUMBER && left != VECTOR && left != null)
					error("Left multiplication or division operand must be a number or vector", XsPackage.Literals.FACTOR__LEFT);
				checkEqualTypes(right, NUMBER, "Right multiplication or division operand must be a number", XsPackage.Literals.FACTOR__RIGHT);
			}
			return null;
		}
		
		@Override
		public Void caseIfElseStatement(final IfElseStatement object) {
			checkType(object.getCondition(), NUMBER, "Condition must be a boolean", XsPackage.Literals.IF_ELSE_STATEMENT__CONDITION);
			return null;
		}
		
		@Override
		public Void caseOrExpression(final OrExpression object) {
			checkType(object.getLeft(), NUMBER, "'or' operand must be a boolean", XsPackage.Literals.OR_EXPRESSION__LEFT);
			checkType(object.getRight(), NUMBER, "'or' operand must be a boolean", XsPackage.Literals.OR_EXPRESSION__RIGHT);
			return null;
		}
		
		@Override
		public Void caseForStatement(final ForStatement object) {
			checkType(object.getEnd(), NUMBER, "End value of a 'for' loop must be a number, but got a %1$s", XsPackage.Literals.VAR_DECLARATION__VALUE);
			return null;
		}
		
		@Override
		public Void caseForVarDeclaration(final ForVarDeclaration object) {
			checkType(object.getValue(), NUMBER, "Invalid initial value of type %2$s for loop variable (of type int)", XsPackage.Literals.VAR_DECLARATION__VALUE);
			return null;
		}
		
		@Override
		public Void caseGlobalVarDeclaration(final GlobalVarDeclaration object) {
			checkEqualTypes(object.getValue(), object.getType(), "Invalid initial value of type %1$s for variable of type %2$s", XsPackage.Literals.VAR_DECLARATION__VALUE);
			return null;
		}
		
		@Override
		public Void caseLocalVarDeclaration(final LocalVarDeclaration object) {
			checkEqualTypes(object.getValue(), object.getType(), "Invalid initial value of type %1$s for variable of type %2$s", XsPackage.Literals.VAR_DECLARATION__VALUE);
			return null;
		}
		
		@Override
		public Void caseParameterDeclaration(final ParameterDeclaration object) {
			checkEqualTypes(object.getValue(), object.getType(), "Invalid initial value of type %1$s for variable of type %2$s", XsPackage.Literals.VAR_DECLARATION__VALUE);
			return null;
		}
		
		@Override
		public Void casePostfixStatement(final PostfixStatement object) {
			checkType(object.getVar(), NUMBER, "'++' and '--' require a numeric variable", XsPackage.Literals.POSTFIX_STATEMENT__VAR);
			return null;
		}
		
		@Override
		public Void caseReturnStatement(final ReturnStatement object) {
			final Type expected = type(EcoreUtil2.getContainerOfType(object, Declaration.class));
			checkType(object.getExpression(), expected, "Invalid result type", object.getExpression() == null ? null : XsPackage.Literals.RETURN_STATEMENT__EXPRESSION);
			return null;
		}
		
		@Override
		public Void caseSwitchCase(final SwitchCase object) {
			checkType(object.getValue(), NUMBER, "'case' requires a numeric value", XsPackage.Literals.SWITCH_CASE__VALUE);
			return null;
		}
		
		@Override
		public Void caseSwitchStatement(final SwitchStatement object) {
			checkType(object.getExpression(), NUMBER, "Switched value must be a number", XsPackage.Literals.SWITCH_STATEMENT__EXPRESSION);
			return null;
		}
		
		@Override
		public Void caseTerm(final Term object) {
			final Type left = type(object.getLeft());
			if (object.getOp().equals("+")) {
				final Type right = type(object.getRight());
				switch (left) {
					case NUMBER:
						if (right != NUMBER && right != STRING && right != null)
							error("'<number> +' requires a number or string as second operand", XsPackage.Literals.TERM__RIGHT);
						break;
					case STRING:
						if (right == VOID)
							error("'+' requires a non-void right operand", XsPackage.Literals.TERM__RIGHT);
						break;
					case VECTOR:
						if (right != VECTOR && right != STRING && right != null)
							error("'<vector> +' requires a vector or string as second operand", XsPackage.Literals.TERM__RIGHT);
						break;
					case VOID:
						error("'+' requires a non-void left operand", XsPackage.Literals.TERM__LEFT);
						break;
				}
			} else { // '-'
				switch (left) {
					case NUMBER:
						checkType(object.getRight(), NUMBER, "'<number> -' requires a number as second operand", XsPackage.Literals.TERM__RIGHT);
						break;
					case STRING:
						error("'-' does not take a string operand", XsPackage.Literals.TERM__LEFT);
						break;
					case VECTOR:
						checkType(object.getRight(), NUMBER, "'<vector> -' requires a vector as second operand", XsPackage.Literals.TERM__RIGHT);
						break;
					case VOID:
						error("'-' requires a non-void left operand", XsPackage.Literals.TERM__LEFT);
						break;
				}
			}
			return null;
		}
		
		@Override
		public Void caseVectorLiteral(final VectorLiteral object) {
			for (final EReference l : Arrays.asList(XsPackage.Literals.VECTOR_LITERAL__X, XsPackage.Literals.VECTOR_LITERAL__Y, XsPackage.Literals.VECTOR_LITERAL__Z)) {
				checkType((Expression) object.eGet(l), NUMBER, "vector() requires numeric arguments", l);
			}
			return null;
		}
		
		@Override
		public Void caseWhileStatement(final WhileStatement object) {
			checkType(object.getCondition(), NUMBER, "Condition must be a boolean", XsPackage.Literals.WHILE_STATEMENT__CONDITION);
			return null;
		}
	}
	
	private final XSTypeCheckingSwitch checkingSwitch = new XSTypeCheckingSwitch();
	
	public final void check(final EObject eo) {
		checkingSwitch.doSwitch(eo);
	}
	
}
