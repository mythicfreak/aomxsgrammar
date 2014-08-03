package aom.scripting.xs.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import aom.scripting.xs.services.XSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalXSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'+'", "'-'", "'.'", "'true'", "'false'", "'vector'", "'('", "','", "')'", "'='", "'include'", "'rule'", "'active'", "'inactive'", "'runImmediately'", "'highFrequency'", "'group'", "'minInterval'", "'maxInterval'", "'static'", "'const'", "'extern'", "'mutable'", "'int'", "'float'", "'bool'", "'string'", "'void'", "'{'", "'}'", "'if'", "'else'", "'while'", "'for'", "'switch'", "'case'", "':'", "'default'", "'return'", "'continue'", "'break'", "'++'", "'--'", "'||'", "'&&'", "'=='", "'!='", "'<='", "'<'", "'>'", "'>='", "'*'", "'/'", "'%'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalXSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXSParser.tokenNames; }
    public String getGrammarFileName() { return "../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g"; }



     	private XSGrammarAccess grammarAccess;
     	
        public InternalXSParser(TokenStream input, XSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected XSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:76:1: ruleProgram returns [EObject current=null] : ( (lv_declarations_0_0= ruleDeclaration ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:79:28: ( ( (lv_declarations_0_0= ruleDeclaration ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:80:1: ( (lv_declarations_0_0= ruleDeclaration ) )*
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:80:1: ( (lv_declarations_0_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||(LA1_0>=22 && LA1_0<=23)||(LA1_0>=31 && LA1_0<=39)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:81:1: (lv_declarations_0_0= ruleDeclaration )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:81:1: (lv_declarations_0_0= ruleDeclaration )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:82:3: lv_declarations_0_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getDeclarationsDeclarationParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleProgram130);
            	    lv_declarations_0_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_0_0, 
            	              		"Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleDeclaration"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:106:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:107:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:108:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration166);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:115:1: ruleDeclaration returns [EObject current=null] : ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_FunDeclaration_2= ruleFunDeclaration | (this_IncludeStatement_3= ruleIncludeStatement otherlv_4= ';' ) | this_RuleDeclaration_5= ruleRuleDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_VarDeclaration_0 = null;

        EObject this_FunDeclaration_2 = null;

        EObject this_IncludeStatement_3 = null;

        EObject this_RuleDeclaration_5 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:118:28: ( ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_FunDeclaration_2= ruleFunDeclaration | (this_IncludeStatement_3= ruleIncludeStatement otherlv_4= ';' ) | this_RuleDeclaration_5= ruleRuleDeclaration ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:119:1: ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_FunDeclaration_2= ruleFunDeclaration | (this_IncludeStatement_3= ruleIncludeStatement otherlv_4= ';' ) | this_RuleDeclaration_5= ruleRuleDeclaration )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:119:1: ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_FunDeclaration_2= ruleFunDeclaration | (this_IncludeStatement_3= ruleIncludeStatement otherlv_4= ';' ) | this_RuleDeclaration_5= ruleRuleDeclaration )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:119:2: (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:119:2: (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:120:5: this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getVarDeclarationParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarDeclaration_in_ruleDeclaration224);
                    this_VarDeclaration_0=ruleVarDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VarDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleDeclaration235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:134:5: this_FunDeclaration_2= ruleFunDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getFunDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunDeclaration_in_ruleDeclaration264);
                    this_FunDeclaration_2=ruleFunDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:143:6: (this_IncludeStatement_3= ruleIncludeStatement otherlv_4= ';' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:143:6: (this_IncludeStatement_3= ruleIncludeStatement otherlv_4= ';' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:144:5: this_IncludeStatement_3= ruleIncludeStatement otherlv_4= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getIncludeStatementParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIncludeStatement_in_ruleDeclaration292);
                    this_IncludeStatement_3=ruleIncludeStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IncludeStatement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleDeclaration303); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:158:5: this_RuleDeclaration_5= ruleRuleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getRuleDeclarationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRuleDeclaration_in_ruleDeclaration332);
                    this_RuleDeclaration_5=ruleRuleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RuleDeclaration_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleSign"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:174:1: entryRuleSign returns [String current=null] : iv_ruleSign= ruleSign EOF ;
    public final String entryRuleSign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSign = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:175:2: (iv_ruleSign= ruleSign EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:176:2: iv_ruleSign= ruleSign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignRule()); 
            }
            pushFollow(FOLLOW_ruleSign_in_entryRuleSign368);
            iv_ruleSign=ruleSign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSign379); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSign"


    // $ANTLR start "ruleSign"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:183:1: ruleSign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleSign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:186:28: ( (kw= '+' | kw= '-' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:187:1: (kw= '+' | kw= '-' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:187:1: (kw= '+' | kw= '-' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:188:2: kw= '+'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleSign417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:195:2: kw= '-'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleSign436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSign"


    // $ANTLR start "entryRuleSignedInt"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:208:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:209:2: (iv_ruleSignedInt= ruleSignedInt EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:210:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedIntRule()); 
            }
            pushFollow(FOLLOW_ruleSignedInt_in_entryRuleSignedInt477);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedInt.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInt488); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedInt"


    // $ANTLR start "ruleSignedInt"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:217:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_Sign_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:220:28: ( ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:221:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:221:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:221:2: (this_Sign_0= ruleSign )? this_INT_1= RULE_INT
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:221:2: (this_Sign_0= ruleSign )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=12 && LA4_0<=13)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:222:5: this_Sign_0= ruleSign
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSignedIntAccess().getSignParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSign_in_ruleSignedInt536);
                    this_Sign_0=ruleSign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Sign_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedInt558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getSignedIntAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedInt"


    // $ANTLR start "entryRuleSignedFloat"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:247:1: entryRuleSignedFloat returns [String current=null] : iv_ruleSignedFloat= ruleSignedFloat EOF ;
    public final String entryRuleSignedFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedFloat = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:248:2: (iv_ruleSignedFloat= ruleSignedFloat EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:249:2: iv_ruleSignedFloat= ruleSignedFloat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedFloatRule()); 
            }
            pushFollow(FOLLOW_ruleSignedFloat_in_entryRuleSignedFloat604);
            iv_ruleSignedFloat=ruleSignedFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedFloat.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedFloat615); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedFloat"


    // $ANTLR start "ruleSignedFloat"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:256:1: ruleSignedFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;
        AntlrDatatypeRuleToken this_Sign_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:259:28: ( ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:260:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:260:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:260:2: (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:260:2: (this_Sign_0= ruleSign )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=12 && LA5_0<=13)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:261:5: this_Sign_0= ruleSign
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSignedFloatAccess().getSignParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSign_in_ruleSignedFloat663);
                    this_Sign_0=ruleSign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Sign_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedFloat685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getSignedFloatAccess().getINTTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,14,FOLLOW_14_in_ruleSignedFloat703); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSignedFloatAccess().getFullStopKeyword_2()); 
                  
            }
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedFloat718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_3, grammarAccess.getSignedFloatAccess().getINTTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedFloat"


    // $ANTLR start "entryRuleSignedNum"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:299:1: entryRuleSignedNum returns [String current=null] : iv_ruleSignedNum= ruleSignedNum EOF ;
    public final String entryRuleSignedNum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNum = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:300:2: (iv_ruleSignedNum= ruleSignedNum EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:301:2: iv_ruleSignedNum= ruleSignedNum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedNumRule()); 
            }
            pushFollow(FOLLOW_ruleSignedNum_in_entryRuleSignedNum764);
            iv_ruleSignedNum=ruleSignedNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedNum.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNum775); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedNum"


    // $ANTLR start "ruleSignedNum"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:308:1: ruleSignedNum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SignedInt_0= ruleSignedInt | this_SignedFloat_1= ruleSignedFloat ) ;
    public final AntlrDatatypeRuleToken ruleSignedNum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SignedInt_0 = null;

        AntlrDatatypeRuleToken this_SignedFloat_1 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:311:28: ( (this_SignedInt_0= ruleSignedInt | this_SignedFloat_1= ruleSignedFloat ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:312:1: (this_SignedInt_0= ruleSignedInt | this_SignedFloat_1= ruleSignedFloat )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:312:1: (this_SignedInt_0= ruleSignedInt | this_SignedFloat_1= ruleSignedFloat )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 12:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_INT) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==14) ) {
                        alt6=2;
                    }
                    else if ( (LA6_3==EOF||(LA6_3>=19 && LA6_3<=20)) ) {
                        alt6=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_INT) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==14) ) {
                        alt6=2;
                    }
                    else if ( (LA6_3==EOF||(LA6_3>=19 && LA6_3<=20)) ) {
                        alt6=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==14) ) {
                    alt6=2;
                }
                else if ( (LA6_3==EOF||(LA6_3>=19 && LA6_3<=20)) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:313:5: this_SignedInt_0= ruleSignedInt
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSignedNumAccess().getSignedIntParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignedInt_in_ruleSignedNum822);
                    this_SignedInt_0=ruleSignedInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SignedInt_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:325:5: this_SignedFloat_1= ruleSignedFloat
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSignedNumAccess().getSignedFloatParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignedFloat_in_ruleSignedNum855);
                    this_SignedFloat_1=ruleSignedFloat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SignedFloat_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedNum"


    // $ANTLR start "entryRuleConstantNum"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:343:1: entryRuleConstantNum returns [EObject current=null] : iv_ruleConstantNum= ruleConstantNum EOF ;
    public final EObject entryRuleConstantNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantNum = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:344:2: (iv_ruleConstantNum= ruleConstantNum EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:345:2: iv_ruleConstantNum= ruleConstantNum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantNumRule()); 
            }
            pushFollow(FOLLOW_ruleConstantNum_in_entryRuleConstantNum900);
            iv_ruleConstantNum=ruleConstantNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantNum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantNum910); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantNum"


    // $ANTLR start "ruleConstantNum"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:352:1: ruleConstantNum returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConstantNum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:355:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:356:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:356:1: ( (otherlv_0= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:357:1: (otherlv_0= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:357:1: (otherlv_0= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:358:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantNumRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantNum954); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getConstantNumAccess().getVarVarDeclarationCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantNum"


    // $ANTLR start "entryRuleLiteralOrConstantNum"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:377:1: entryRuleLiteralOrConstantNum returns [EObject current=null] : iv_ruleLiteralOrConstantNum= ruleLiteralOrConstantNum EOF ;
    public final EObject entryRuleLiteralOrConstantNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralOrConstantNum = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:378:2: (iv_ruleLiteralOrConstantNum= ruleLiteralOrConstantNum EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:379:2: iv_ruleLiteralOrConstantNum= ruleLiteralOrConstantNum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralOrConstantNumRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralOrConstantNum_in_entryRuleLiteralOrConstantNum989);
            iv_ruleLiteralOrConstantNum=ruleLiteralOrConstantNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralOrConstantNum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralOrConstantNum999); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralOrConstantNum"


    // $ANTLR start "ruleLiteralOrConstantNum"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:386:1: ruleLiteralOrConstantNum returns [EObject current=null] : ( ( () ruleSignedNum ) | this_ConstantNum_2= ruleConstantNum ) ;
    public final EObject ruleLiteralOrConstantNum() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantNum_2 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:389:28: ( ( ( () ruleSignedNum ) | this_ConstantNum_2= ruleConstantNum ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:390:1: ( ( () ruleSignedNum ) | this_ConstantNum_2= ruleConstantNum )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:390:1: ( ( () ruleSignedNum ) | this_ConstantNum_2= ruleConstantNum )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||(LA7_0>=12 && LA7_0<=13)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:390:2: ( () ruleSignedNum )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:390:2: ( () ruleSignedNum )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:390:3: () ruleSignedNum
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:390:3: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:391:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralOrConstantNumAccess().getSignedNumAction_0_0(),
                                  current);
                          
                    }

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralOrConstantNumAccess().getSignedNumParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignedNum_in_ruleLiteralOrConstantNum1050);
                    ruleSignedNum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:406:5: this_ConstantNum_2= ruleConstantNum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralOrConstantNumAccess().getConstantNumParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantNum_in_ruleLiteralOrConstantNum1078);
                    this_ConstantNum_2=ruleConstantNum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantNum_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralOrConstantNum"


    // $ANTLR start "entryRuleBool"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:422:1: entryRuleBool returns [String current=null] : iv_ruleBool= ruleBool EOF ;
    public final String entryRuleBool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBool = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:423:2: (iv_ruleBool= ruleBool EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:424:2: iv_ruleBool= ruleBool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolRule()); 
            }
            pushFollow(FOLLOW_ruleBool_in_entryRuleBool1114);
            iv_ruleBool=ruleBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBool.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool1125); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:431:1: ruleBool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:434:28: ( (kw= 'true' | kw= 'false' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:435:1: (kw= 'true' | kw= 'false' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:435:1: (kw= 'true' | kw= 'false' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:436:2: kw= 'true'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleBool1163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBoolAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:443:2: kw= 'false'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleBool1182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBoolAccess().getFalseKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleVector"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:456:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:457:2: (iv_ruleVector= ruleVector EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:458:2: iv_ruleVector= ruleVector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVectorRule()); 
            }
            pushFollow(FOLLOW_ruleVector_in_entryRuleVector1222);
            iv_ruleVector=ruleVector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector1232); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVector"


    // $ANTLR start "ruleVector"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:465:1: ruleVector returns [EObject current=null] : (otherlv_0= 'vector' otherlv_1= '(' ( (lv_x_2_0= ruleLiteralOrConstantNum ) ) otherlv_3= ',' ( (lv_y_4_0= ruleLiteralOrConstantNum ) ) otherlv_5= ',' ( (lv_z_6_0= ruleLiteralOrConstantNum ) ) otherlv_7= ')' ) ;
    public final EObject ruleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_x_2_0 = null;

        EObject lv_y_4_0 = null;

        EObject lv_z_6_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:468:28: ( (otherlv_0= 'vector' otherlv_1= '(' ( (lv_x_2_0= ruleLiteralOrConstantNum ) ) otherlv_3= ',' ( (lv_y_4_0= ruleLiteralOrConstantNum ) ) otherlv_5= ',' ( (lv_z_6_0= ruleLiteralOrConstantNum ) ) otherlv_7= ')' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:469:1: (otherlv_0= 'vector' otherlv_1= '(' ( (lv_x_2_0= ruleLiteralOrConstantNum ) ) otherlv_3= ',' ( (lv_y_4_0= ruleLiteralOrConstantNum ) ) otherlv_5= ',' ( (lv_z_6_0= ruleLiteralOrConstantNum ) ) otherlv_7= ')' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:469:1: (otherlv_0= 'vector' otherlv_1= '(' ( (lv_x_2_0= ruleLiteralOrConstantNum ) ) otherlv_3= ',' ( (lv_y_4_0= ruleLiteralOrConstantNum ) ) otherlv_5= ',' ( (lv_z_6_0= ruleLiteralOrConstantNum ) ) otherlv_7= ')' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:469:3: otherlv_0= 'vector' otherlv_1= '(' ( (lv_x_2_0= ruleLiteralOrConstantNum ) ) otherlv_3= ',' ( (lv_y_4_0= ruleLiteralOrConstantNum ) ) otherlv_5= ',' ( (lv_z_6_0= ruleLiteralOrConstantNum ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleVector1269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVectorKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleVector1281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVectorAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:477:1: ( (lv_x_2_0= ruleLiteralOrConstantNum ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:478:1: (lv_x_2_0= ruleLiteralOrConstantNum )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:478:1: (lv_x_2_0= ruleLiteralOrConstantNum )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:479:3: lv_x_2_0= ruleLiteralOrConstantNum
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVectorAccess().getXLiteralOrConstantNumParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteralOrConstantNum_in_ruleVector1302);
            lv_x_2_0=ruleLiteralOrConstantNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVectorRule());
              	        }
                     		set(
                     			current, 
                     			"x",
                      		lv_x_2_0, 
                      		"LiteralOrConstantNum");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleVector1314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVectorAccess().getCommaKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:499:1: ( (lv_y_4_0= ruleLiteralOrConstantNum ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:500:1: (lv_y_4_0= ruleLiteralOrConstantNum )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:500:1: (lv_y_4_0= ruleLiteralOrConstantNum )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:501:3: lv_y_4_0= ruleLiteralOrConstantNum
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVectorAccess().getYLiteralOrConstantNumParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteralOrConstantNum_in_ruleVector1335);
            lv_y_4_0=ruleLiteralOrConstantNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVectorRule());
              	        }
                     		set(
                     			current, 
                     			"y",
                      		lv_y_4_0, 
                      		"LiteralOrConstantNum");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleVector1347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getVectorAccess().getCommaKeyword_5());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:521:1: ( (lv_z_6_0= ruleLiteralOrConstantNum ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:522:1: (lv_z_6_0= ruleLiteralOrConstantNum )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:522:1: (lv_z_6_0= ruleLiteralOrConstantNum )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:523:3: lv_z_6_0= ruleLiteralOrConstantNum
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVectorAccess().getZLiteralOrConstantNumParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteralOrConstantNum_in_ruleVector1368);
            lv_z_6_0=ruleLiteralOrConstantNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVectorRule());
              	        }
                     		set(
                     			current, 
                     			"z",
                      		lv_z_6_0, 
                      		"LiteralOrConstantNum");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleVector1380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getVectorAccess().getRightParenthesisKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVector"


    // $ANTLR start "entryRuleVarDeclaration"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:551:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:552:2: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:553:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration1416);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclaration1426); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:560:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleVarModifier ) ) ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_modifier_0_0 = null;

        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:563:28: ( ( ( (lv_modifier_0_0= ruleVarModifier ) ) ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:564:1: ( ( (lv_modifier_0_0= ruleVarModifier ) ) ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:564:1: ( ( (lv_modifier_0_0= ruleVarModifier ) ) ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:564:2: ( (lv_modifier_0_0= ruleVarModifier ) ) ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:564:2: ( (lv_modifier_0_0= ruleVarModifier ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:565:1: (lv_modifier_0_0= ruleVarModifier )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:565:1: (lv_modifier_0_0= ruleVarModifier )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:566:3: lv_modifier_0_0= ruleVarModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarDeclarationAccess().getModifierVarModifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVarModifier_in_ruleVarDeclaration1472);
            lv_modifier_0_0=ruleVarModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"modifier",
                      		lv_modifier_0_0, 
                      		"VarModifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:582:2: ( (lv_type_1_0= ruleVarTypeSpecifier ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:583:1: (lv_type_1_0= ruleVarTypeSpecifier )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:583:1: (lv_type_1_0= ruleVarTypeSpecifier )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:584:3: lv_type_1_0= ruleVarTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeVarTypeSpecifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVarTypeSpecifier_in_ruleVarDeclaration1493);
            lv_type_1_0=ruleVarTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"VarTypeSpecifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:600:2: ( (lv_name_2_0= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:601:1: (lv_name_2_0= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:601:1: (lv_name_2_0= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:602:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDeclaration1510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVarDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleVarDeclaration1527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVarDeclarationAccess().getEqualsSignKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:622:1: ( (lv_value_4_0= ruleExpression ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:623:1: (lv_value_4_0= ruleExpression )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:623:1: (lv_value_4_0= ruleExpression )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:624:3: lv_value_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarDeclarationAccess().getValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleVarDeclaration1548);
            lv_value_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleForVarDeclaration"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:648:1: entryRuleForVarDeclaration returns [EObject current=null] : iv_ruleForVarDeclaration= ruleForVarDeclaration EOF ;
    public final EObject entryRuleForVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForVarDeclaration = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:649:2: (iv_ruleForVarDeclaration= ruleForVarDeclaration EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:650:2: iv_ruleForVarDeclaration= ruleForVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleForVarDeclaration_in_entryRuleForVarDeclaration1584);
            iv_ruleForVarDeclaration=ruleForVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForVarDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForVarDeclaration1594); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForVarDeclaration"


    // $ANTLR start "ruleForVarDeclaration"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:657:1: ruleForVarDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleForVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:660:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:661:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:661:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:661:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:661:2: ( (lv_name_0_0= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:662:1: (lv_name_0_0= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:662:1: (lv_name_0_0= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:663:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForVarDeclaration1636); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getForVarDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getForVarDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleForVarDeclaration1653); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForVarDeclarationAccess().getEqualsSignKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:683:1: ( (lv_value_2_0= ruleExpression ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:684:1: (lv_value_2_0= ruleExpression )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:684:1: (lv_value_2_0= ruleExpression )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:685:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForVarDeclarationAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleForVarDeclaration1674);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForVarDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForVarDeclaration"


    // $ANTLR start "entryRuleFunDeclaration"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:709:1: entryRuleFunDeclaration returns [EObject current=null] : iv_ruleFunDeclaration= ruleFunDeclaration EOF ;
    public final EObject entryRuleFunDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunDeclaration = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:710:2: (iv_ruleFunDeclaration= ruleFunDeclaration EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:711:2: iv_ruleFunDeclaration= ruleFunDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFunDeclaration_in_entryRuleFunDeclaration1710);
            iv_ruleFunDeclaration=ruleFunDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunDeclaration1720); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunDeclaration"


    // $ANTLR start "ruleFunDeclaration"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:718:1: ruleFunDeclaration returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleFunModifier ) ) ( (lv_type_1_0= ruleFunTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_paramlist_4_0= ruleParams ) )? otherlv_5= ')' ( (lv_statements_6_0= ruleCompoundStatement ) ) ) ;
    public final EObject ruleFunDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_modifier_0_0 = null;

        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_paramlist_4_0 = null;

        EObject lv_statements_6_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:721:28: ( ( ( (lv_modifier_0_0= ruleFunModifier ) ) ( (lv_type_1_0= ruleFunTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_paramlist_4_0= ruleParams ) )? otherlv_5= ')' ( (lv_statements_6_0= ruleCompoundStatement ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:722:1: ( ( (lv_modifier_0_0= ruleFunModifier ) ) ( (lv_type_1_0= ruleFunTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_paramlist_4_0= ruleParams ) )? otherlv_5= ')' ( (lv_statements_6_0= ruleCompoundStatement ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:722:1: ( ( (lv_modifier_0_0= ruleFunModifier ) ) ( (lv_type_1_0= ruleFunTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_paramlist_4_0= ruleParams ) )? otherlv_5= ')' ( (lv_statements_6_0= ruleCompoundStatement ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:722:2: ( (lv_modifier_0_0= ruleFunModifier ) ) ( (lv_type_1_0= ruleFunTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_paramlist_4_0= ruleParams ) )? otherlv_5= ')' ( (lv_statements_6_0= ruleCompoundStatement ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:722:2: ( (lv_modifier_0_0= ruleFunModifier ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:723:1: (lv_modifier_0_0= ruleFunModifier )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:723:1: (lv_modifier_0_0= ruleFunModifier )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:724:3: lv_modifier_0_0= ruleFunModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunDeclarationAccess().getModifierFunModifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFunModifier_in_ruleFunDeclaration1766);
            lv_modifier_0_0=ruleFunModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"modifier",
                      		lv_modifier_0_0, 
                      		"FunModifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:740:2: ( (lv_type_1_0= ruleFunTypeSpecifier ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:741:1: (lv_type_1_0= ruleFunTypeSpecifier )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:741:1: (lv_type_1_0= ruleFunTypeSpecifier )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:742:3: lv_type_1_0= ruleFunTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunDeclarationAccess().getTypeFunTypeSpecifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFunTypeSpecifier_in_ruleFunDeclaration1787);
            lv_type_1_0=ruleFunTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"FunTypeSpecifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:758:2: ( (lv_name_2_0= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:759:1: (lv_name_2_0= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:759:1: (lv_name_2_0= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:760:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunDeclaration1804); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getFunDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleFunDeclaration1821); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunDeclarationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:780:1: ( (lv_paramlist_4_0= ruleParams ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17||(LA9_0>=31 && LA9_0<=33)||(LA9_0>=35 && LA9_0<=39)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:781:1: (lv_paramlist_4_0= ruleParams )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:781:1: (lv_paramlist_4_0= ruleParams )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:782:3: lv_paramlist_4_0= ruleParams
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunDeclarationAccess().getParamlistParamsParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParams_in_ruleFunDeclaration1842);
                    lv_paramlist_4_0=ruleParams();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"paramlist",
                              		lv_paramlist_4_0, 
                              		"Params");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleFunDeclaration1855); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFunDeclarationAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:802:1: ( (lv_statements_6_0= ruleCompoundStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:803:1: (lv_statements_6_0= ruleCompoundStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:803:1: (lv_statements_6_0= ruleCompoundStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:804:3: lv_statements_6_0= ruleCompoundStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunDeclarationAccess().getStatementsCompoundStatementParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCompoundStatement_in_ruleFunDeclaration1876);
            lv_statements_6_0=ruleCompoundStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"statements",
                      		lv_statements_6_0, 
                      		"CompoundStatement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunDeclaration"


    // $ANTLR start "entryRuleIncludeStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:828:1: entryRuleIncludeStatement returns [EObject current=null] : iv_ruleIncludeStatement= ruleIncludeStatement EOF ;
    public final EObject entryRuleIncludeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:829:2: (iv_ruleIncludeStatement= ruleIncludeStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:830:2: iv_ruleIncludeStatement= ruleIncludeStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIncludeStatement_in_entryRuleIncludeStatement1912);
            iv_ruleIncludeStatement=ruleIncludeStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIncludeStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeStatement1922); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIncludeStatement"


    // $ANTLR start "ruleIncludeStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:837:1: ruleIncludeStatement returns [EObject current=null] : (otherlv_0= 'include' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleIncludeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:840:28: ( (otherlv_0= 'include' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:841:1: (otherlv_0= 'include' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:841:1: (otherlv_0= 'include' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:841:3: otherlv_0= 'include' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleIncludeStatement1959); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIncludeStatementAccess().getIncludeKeyword_0());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:845:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:846:1: (lv_name_1_0= RULE_STRING )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:846:1: (lv_name_1_0= RULE_STRING )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:847:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIncludeStatement1976); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getIncludeStatementAccess().getNameSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIncludeStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncludeStatement"


    // $ANTLR start "entryRuleRuleDeclaration"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:871:1: entryRuleRuleDeclaration returns [EObject current=null] : iv_ruleRuleDeclaration= ruleRuleDeclaration EOF ;
    public final EObject entryRuleRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDeclaration = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:872:2: (iv_ruleRuleDeclaration= ruleRuleDeclaration EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:873:2: iv_ruleRuleDeclaration= ruleRuleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleRuleDeclaration_in_entryRuleRuleDeclaration2017);
            iv_ruleRuleDeclaration=ruleRuleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleDeclaration2027); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleDeclaration"


    // $ANTLR start "ruleRuleDeclaration"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:880:1: ruleRuleDeclaration returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_12_0= ruleCompoundStatement ) ) ) ;
    public final EObject ruleRuleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_status_3_1=null;
        Token lv_status_3_2=null;
        Token lv_runImmediately_4_0=null;
        Token lv_highFrequency_5_0=null;
        Token otherlv_6=null;
        Token lv_group_7_0=null;
        Token otherlv_8=null;
        Token lv_minInterval_9_0=null;
        Token otherlv_10=null;
        Token lv_maxInterval_11_0=null;
        EObject lv_statements_12_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:883:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_12_0= ruleCompoundStatement ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:884:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_12_0= ruleCompoundStatement ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:884:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_12_0= ruleCompoundStatement ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:884:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_12_0= ruleCompoundStatement ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleRuleDeclaration2064); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRuleDeclarationAccess().getRuleKeyword_0());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:888:1: ( (lv_name_1_0= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:889:1: (lv_name_1_0= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:889:1: (lv_name_1_0= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:890:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleDeclaration2081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRuleDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:906:2: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:908:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:908:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:909:2: ( ( ({...}? => ( ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2());
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:912:2: ( ( ({...}? => ( ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:913:3: ( ({...}? => ( ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:913:3: ( ({...}? => ( ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=7;
                int LA11_0 = input.LA(1);

                if ( LA11_0 >=24 && LA11_0<=25 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 3) ) {
                    alt11=4;
                }
                else if ( LA11_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 4) ) {
                    alt11=5;
                }
                else if ( LA11_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 5) ) {
                    alt11=6;
                }


                switch (alt11) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:915:4: ({...}? => ( ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:915:4: ({...}? => ( ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:916:5: {...}? => ( ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:916:112: ( ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:917:6: ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 0);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:920:6: ({...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:920:7: {...}? => ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:920:16: ( ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:921:1: ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:921:1: ( (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:922:1: (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:922:1: (lv_status_3_1= 'active' | lv_status_3_2= 'inactive' )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==24) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==25) ) {
            	        alt10=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:923:3: lv_status_3_1= 'active'
            	            {
            	            lv_status_3_1=(Token)match(input,24,FOLLOW_24_in_ruleRuleDeclaration2151); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_status_3_1, grammarAccess.getRuleDeclarationAccess().getStatusActiveKeyword_2_0_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
            	              	        }
            	                     		setWithLastConsumed(current, "status", lv_status_3_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:935:8: lv_status_3_2= 'inactive'
            	            {
            	            lv_status_3_2=(Token)match(input,25,FOLLOW_25_in_ruleRuleDeclaration2180); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_status_3_2, grammarAccess.getRuleDeclarationAccess().getStatusInactiveKeyword_2_0_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
            	              	        }
            	                     		setWithLastConsumed(current, "status", lv_status_3_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:957:4: ({...}? => ( ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:957:4: ({...}? => ( ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:958:5: {...}? => ( ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:958:112: ( ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:959:6: ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 1);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:962:6: ({...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:962:7: {...}? => ( (lv_runImmediately_4_0= 'runImmediately' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:962:16: ( (lv_runImmediately_4_0= 'runImmediately' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:963:1: (lv_runImmediately_4_0= 'runImmediately' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:963:1: (lv_runImmediately_4_0= 'runImmediately' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:964:3: lv_runImmediately_4_0= 'runImmediately'
            	    {
            	    lv_runImmediately_4_0=(Token)match(input,26,FOLLOW_26_in_ruleRuleDeclaration2268); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_runImmediately_4_0, grammarAccess.getRuleDeclarationAccess().getRunImmediatelyRunImmediatelyKeyword_2_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
            	      	        }
            	             		setWithLastConsumed(current, "runImmediately", true, "runImmediately");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:984:4: ({...}? => ( ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:984:4: ({...}? => ( ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:985:5: {...}? => ( ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:985:112: ( ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:986:6: ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 2);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:989:6: ({...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:989:7: {...}? => ( (lv_highFrequency_5_0= 'highFrequency' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:989:16: ( (lv_highFrequency_5_0= 'highFrequency' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:990:1: (lv_highFrequency_5_0= 'highFrequency' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:990:1: (lv_highFrequency_5_0= 'highFrequency' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:991:3: lv_highFrequency_5_0= 'highFrequency'
            	    {
            	    lv_highFrequency_5_0=(Token)match(input,27,FOLLOW_27_in_ruleRuleDeclaration2353); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_highFrequency_5_0, grammarAccess.getRuleDeclarationAccess().getHighFrequencyHighFrequencyKeyword_2_2_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
            	      	        }
            	             		setWithLastConsumed(current, "highFrequency", true, "highFrequency");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1011:4: ({...}? => ( ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1011:4: ({...}? => ( ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1012:5: {...}? => ( ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1012:112: ( ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1013:6: ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 3);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1016:6: ({...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1016:7: {...}? => (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1016:16: (otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1016:18: otherlv_6= 'group' ( (lv_group_7_0= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleRuleDeclaration2433); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getRuleDeclarationAccess().getGroupKeyword_2_3_0());
            	          
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1020:1: ( (lv_group_7_0= RULE_ID ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1021:1: (lv_group_7_0= RULE_ID )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1021:1: (lv_group_7_0= RULE_ID )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1022:3: lv_group_7_0= RULE_ID
            	    {
            	    lv_group_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleDeclaration2450); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_group_7_0, grammarAccess.getRuleDeclarationAccess().getGroupIDTerminalRuleCall_2_3_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"group",
            	              		lv_group_7_0, 
            	              		"ID");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1045:4: ({...}? => ( ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1045:4: ({...}? => ( ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1046:5: {...}? => ( ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1046:112: ( ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1047:6: ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 4);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1050:6: ({...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1050:7: {...}? => (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1050:16: (otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1050:18: otherlv_8= 'minInterval' ( (lv_minInterval_9_0= RULE_INT ) )
            	    {
            	    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleRuleDeclaration2523); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getRuleDeclarationAccess().getMinIntervalKeyword_2_4_0());
            	          
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1054:1: ( (lv_minInterval_9_0= RULE_INT ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1055:1: (lv_minInterval_9_0= RULE_INT )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1055:1: (lv_minInterval_9_0= RULE_INT )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1056:3: lv_minInterval_9_0= RULE_INT
            	    {
            	    lv_minInterval_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRuleDeclaration2540); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_minInterval_9_0, grammarAccess.getRuleDeclarationAccess().getMinIntervalINTTerminalRuleCall_2_4_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"minInterval",
            	              		lv_minInterval_9_0, 
            	              		"INT");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1079:4: ({...}? => ( ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1079:4: ({...}? => ( ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1080:5: {...}? => ( ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1080:112: ( ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1081:6: ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 5);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1084:6: ({...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1084:7: {...}? => (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1084:16: (otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1084:18: otherlv_10= 'maxInterval' ( (lv_maxInterval_11_0= RULE_INT ) )
            	    {
            	    otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleRuleDeclaration2613); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getRuleDeclarationAccess().getMaxIntervalKeyword_2_5_0());
            	          
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1088:1: ( (lv_maxInterval_11_0= RULE_INT ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1089:1: (lv_maxInterval_11_0= RULE_INT )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1089:1: (lv_maxInterval_11_0= RULE_INT )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1090:3: lv_maxInterval_11_0= RULE_INT
            	    {
            	    lv_maxInterval_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRuleDeclaration2630); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_maxInterval_11_0, grammarAccess.getRuleDeclarationAccess().getMaxIntervalINTTerminalRuleCall_2_5_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"maxInterval",
            	              		lv_maxInterval_11_0, 
            	              		"INT");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canLeave(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2());

            }

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1121:2: ( (lv_statements_12_0= ruleCompoundStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1122:1: (lv_statements_12_0= ruleCompoundStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1122:1: (lv_statements_12_0= ruleCompoundStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1123:3: lv_statements_12_0= ruleCompoundStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleDeclarationAccess().getStatementsCompoundStatementParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCompoundStatement_in_ruleRuleDeclaration2703);
            lv_statements_12_0=ruleCompoundStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRuleDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"statements",
                      		lv_statements_12_0, 
                      		"CompoundStatement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleDeclaration"


    // $ANTLR start "entryRuleVarModifier"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1147:1: entryRuleVarModifier returns [EObject current=null] : iv_ruleVarModifier= ruleVarModifier EOF ;
    public final EObject entryRuleVarModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarModifier = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1148:2: (iv_ruleVarModifier= ruleVarModifier EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1149:2: iv_ruleVarModifier= ruleVarModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarModifierRule()); 
            }
            pushFollow(FOLLOW_ruleVarModifier_in_entryRuleVarModifier2739);
            iv_ruleVarModifier=ruleVarModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarModifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarModifier2749); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarModifier"


    // $ANTLR start "ruleVarModifier"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1156:1: ruleVarModifier returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleVarModifier() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_const_2_0=null;
        Token lv_extern_3_0=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1159:28: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1160:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1160:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1162:1: ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1162:1: ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1163:2: ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getVarModifierAccess().getUnorderedGroup());
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1166:2: ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1167:3: ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )*
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1167:3: ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )*
            loop12:
            do {
                int alt12=4;
                int LA12_0 = input.LA(1);

                if ( LA12_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 2) ) {
                    alt12=3;
                }


                switch (alt12) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1169:4: ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1169:4: ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1170:5: {...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1170:106: ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1171:6: ({...}? => ( (lv_static_1_0= 'static' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 0);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1174:6: ({...}? => ( (lv_static_1_0= 'static' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1174:7: {...}? => ( (lv_static_1_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1174:16: ( (lv_static_1_0= 'static' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1175:1: (lv_static_1_0= 'static' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1175:1: (lv_static_1_0= 'static' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1176:3: lv_static_1_0= 'static'
            	    {
            	    lv_static_1_0=(Token)match(input,31,FOLLOW_31_in_ruleVarModifier2836); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_static_1_0, grammarAccess.getVarModifierAccess().getStaticStaticKeyword_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVarModifierRule());
            	      	        }
            	             		setWithLastConsumed(current, "static", true, "static");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVarModifierAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1196:4: ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1196:4: ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1197:5: {...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1197:106: ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1198:6: ({...}? => ( (lv_const_2_0= 'const' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 1);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1201:6: ({...}? => ( (lv_const_2_0= 'const' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1201:7: {...}? => ( (lv_const_2_0= 'const' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1201:16: ( (lv_const_2_0= 'const' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1202:1: (lv_const_2_0= 'const' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1202:1: (lv_const_2_0= 'const' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1203:3: lv_const_2_0= 'const'
            	    {
            	    lv_const_2_0=(Token)match(input,32,FOLLOW_32_in_ruleVarModifier2921); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_const_2_0, grammarAccess.getVarModifierAccess().getConstConstKeyword_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVarModifierRule());
            	      	        }
            	             		setWithLastConsumed(current, "const", true, "const");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVarModifierAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1223:4: ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1223:4: ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1224:5: {...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1224:106: ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1225:6: ({...}? => ( (lv_extern_3_0= 'extern' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 2);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1228:6: ({...}? => ( (lv_extern_3_0= 'extern' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1228:7: {...}? => ( (lv_extern_3_0= 'extern' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1228:16: ( (lv_extern_3_0= 'extern' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1229:1: (lv_extern_3_0= 'extern' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1229:1: (lv_extern_3_0= 'extern' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1230:3: lv_extern_3_0= 'extern'
            	    {
            	    lv_extern_3_0=(Token)match(input,33,FOLLOW_33_in_ruleVarModifier3006); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_extern_3_0, grammarAccess.getVarModifierAccess().getExternExternKeyword_2_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVarModifierRule());
            	      	        }
            	             		setWithLastConsumed(current, "extern", true, "extern");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVarModifierAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getVarModifierAccess().getUnorderedGroup());

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarModifier"


    // $ANTLR start "entryRuleFunModifier"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1265:1: entryRuleFunModifier returns [EObject current=null] : iv_ruleFunModifier= ruleFunModifier EOF ;
    public final EObject entryRuleFunModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunModifier = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1266:2: (iv_ruleFunModifier= ruleFunModifier EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1267:2: iv_ruleFunModifier= ruleFunModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunModifierRule()); 
            }
            pushFollow(FOLLOW_ruleFunModifier_in_entryRuleFunModifier3094);
            iv_ruleFunModifier=ruleFunModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunModifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunModifier3104); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunModifier"


    // $ANTLR start "ruleFunModifier"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1274:1: ruleFunModifier returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleFunModifier() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_mutable_2_0=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1277:28: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1278:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1278:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1280:1: ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1280:1: ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1281:2: ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getFunModifierAccess().getUnorderedGroup());
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1284:2: ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1285:3: ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )*
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1285:3: ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( LA13_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 1) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1287:4: ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1287:4: ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1288:5: {...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleFunModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1288:106: ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1289:6: ({...}? => ( (lv_static_1_0= 'static' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 0);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1292:6: ({...}? => ( (lv_static_1_0= 'static' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1292:7: {...}? => ( (lv_static_1_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleFunModifier", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1292:16: ( (lv_static_1_0= 'static' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1293:1: (lv_static_1_0= 'static' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1293:1: (lv_static_1_0= 'static' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1294:3: lv_static_1_0= 'static'
            	    {
            	    lv_static_1_0=(Token)match(input,31,FOLLOW_31_in_ruleFunModifier3191); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_static_1_0, grammarAccess.getFunModifierAccess().getStaticStaticKeyword_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFunModifierRule());
            	      	        }
            	             		setWithLastConsumed(current, "static", true, "static");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFunModifierAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1314:4: ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1314:4: ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1315:5: {...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleFunModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1315:106: ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1316:6: ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 1);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1319:6: ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1319:7: {...}? => ( (lv_mutable_2_0= 'mutable' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleFunModifier", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1319:16: ( (lv_mutable_2_0= 'mutable' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1320:1: (lv_mutable_2_0= 'mutable' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1320:1: (lv_mutable_2_0= 'mutable' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1321:3: lv_mutable_2_0= 'mutable'
            	    {
            	    lv_mutable_2_0=(Token)match(input,34,FOLLOW_34_in_ruleFunModifier3276); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_mutable_2_0, grammarAccess.getFunModifierAccess().getMutableMutableKeyword_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFunModifierRule());
            	      	        }
            	             		setWithLastConsumed(current, "mutable", true, "mutable");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFunModifierAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getFunModifierAccess().getUnorderedGroup());

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunModifier"


    // $ANTLR start "entryRuleVarTypeSpecifier"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1356:1: entryRuleVarTypeSpecifier returns [String current=null] : iv_ruleVarTypeSpecifier= ruleVarTypeSpecifier EOF ;
    public final String entryRuleVarTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarTypeSpecifier = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1357:2: (iv_ruleVarTypeSpecifier= ruleVarTypeSpecifier EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1358:2: iv_ruleVarTypeSpecifier= ruleVarTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleVarTypeSpecifier_in_entryRuleVarTypeSpecifier3365);
            iv_ruleVarTypeSpecifier=ruleVarTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarTypeSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarTypeSpecifier3376); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarTypeSpecifier"


    // $ANTLR start "ruleVarTypeSpecifier"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1365:1: ruleVarTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'float' | kw= 'bool' | kw= 'vector' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken ruleVarTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1368:28: ( (kw= 'int' | kw= 'float' | kw= 'bool' | kw= 'vector' | kw= 'string' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1369:1: (kw= 'int' | kw= 'float' | kw= 'bool' | kw= 'vector' | kw= 'string' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1369:1: (kw= 'int' | kw= 'float' | kw= 'bool' | kw= 'vector' | kw= 'string' )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt14=1;
                }
                break;
            case 36:
                {
                alt14=2;
                }
                break;
            case 37:
                {
                alt14=3;
                }
                break;
            case 17:
                {
                alt14=4;
                }
                break;
            case 38:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1370:2: kw= 'int'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleVarTypeSpecifier3414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarTypeSpecifierAccess().getIntKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1377:2: kw= 'float'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleVarTypeSpecifier3433); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarTypeSpecifierAccess().getFloatKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1384:2: kw= 'bool'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleVarTypeSpecifier3452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarTypeSpecifierAccess().getBoolKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1391:2: kw= 'vector'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleVarTypeSpecifier3471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarTypeSpecifierAccess().getVectorKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1398:2: kw= 'string'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleVarTypeSpecifier3490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarTypeSpecifierAccess().getStringKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarTypeSpecifier"


    // $ANTLR start "entryRuleFunTypeSpecifier"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1411:1: entryRuleFunTypeSpecifier returns [String current=null] : iv_ruleFunTypeSpecifier= ruleFunTypeSpecifier EOF ;
    public final String entryRuleFunTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunTypeSpecifier = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1412:2: (iv_ruleFunTypeSpecifier= ruleFunTypeSpecifier EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1413:2: iv_ruleFunTypeSpecifier= ruleFunTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleFunTypeSpecifier_in_entryRuleFunTypeSpecifier3531);
            iv_ruleFunTypeSpecifier=ruleFunTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunTypeSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunTypeSpecifier3542); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunTypeSpecifier"


    // $ANTLR start "ruleFunTypeSpecifier"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1420:1: ruleFunTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | this_VarTypeSpecifier_1= ruleVarTypeSpecifier ) ;
    public final AntlrDatatypeRuleToken ruleFunTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_VarTypeSpecifier_1 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1423:28: ( (kw= 'void' | this_VarTypeSpecifier_1= ruleVarTypeSpecifier ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1424:1: (kw= 'void' | this_VarTypeSpecifier_1= ruleVarTypeSpecifier )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1424:1: (kw= 'void' | this_VarTypeSpecifier_1= ruleVarTypeSpecifier )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            else if ( (LA15_0==17||(LA15_0>=35 && LA15_0<=38)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1425:2: kw= 'void'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleFunTypeSpecifier3580); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunTypeSpecifierAccess().getVoidKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1432:5: this_VarTypeSpecifier_1= ruleVarTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunTypeSpecifierAccess().getVarTypeSpecifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarTypeSpecifier_in_ruleFunTypeSpecifier3608);
                    this_VarTypeSpecifier_1=ruleVarTypeSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VarTypeSpecifier_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunTypeSpecifier"


    // $ANTLR start "entryRuleParams"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1450:1: entryRuleParams returns [EObject current=null] : iv_ruleParams= ruleParams EOF ;
    public final EObject entryRuleParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParams = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1451:2: (iv_ruleParams= ruleParams EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1452:2: iv_ruleParams= ruleParams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamsRule()); 
            }
            pushFollow(FOLLOW_ruleParams_in_entryRuleParams3653);
            iv_ruleParams=ruleParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParams; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParams3663); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParams"


    // $ANTLR start "ruleParams"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1459:1: ruleParams returns [EObject current=null] : ( ( (lv_param_0_0= 'void' ) ) | ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* ) ) ;
    public final EObject ruleParams() throws RecognitionException {
        EObject current = null;

        Token lv_param_0_0=null;
        Token otherlv_2=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1462:28: ( ( ( (lv_param_0_0= 'void' ) ) | ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1463:1: ( ( (lv_param_0_0= 'void' ) ) | ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1463:1: ( ( (lv_param_0_0= 'void' ) ) | ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            else if ( (LA17_0==17||(LA17_0>=31 && LA17_0<=33)||(LA17_0>=35 && LA17_0<=38)) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1463:2: ( (lv_param_0_0= 'void' ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1463:2: ( (lv_param_0_0= 'void' ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1464:1: (lv_param_0_0= 'void' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1464:1: (lv_param_0_0= 'void' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1465:3: lv_param_0_0= 'void'
                    {
                    lv_param_0_0=(Token)match(input,39,FOLLOW_39_in_ruleParams3706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_param_0_0, grammarAccess.getParamsAccess().getParamVoidKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParamsRule());
                      	        }
                             		setWithLastConsumed(current, "param", lv_param_0_0, "void");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1479:6: ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1479:6: ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1479:7: ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )*
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1479:7: ( (lv_params_1_0= ruleVarDeclaration ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1480:1: (lv_params_1_0= ruleVarDeclaration )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1480:1: (lv_params_1_0= ruleVarDeclaration )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1481:3: lv_params_1_0= ruleVarDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParamsAccess().getParamsVarDeclarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarDeclaration_in_ruleParams3747);
                    lv_params_1_0=ruleVarDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParamsRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_1_0, 
                              		"VarDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1497:2: (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==19) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1497:4: otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) )
                    	    {
                    	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleParams3760); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getParamsAccess().getCommaKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1501:1: ( (lv_params_3_0= ruleVarDeclaration ) )
                    	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1502:1: (lv_params_3_0= ruleVarDeclaration )
                    	    {
                    	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1502:1: (lv_params_3_0= ruleVarDeclaration )
                    	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1503:3: lv_params_3_0= ruleVarDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getParamsAccess().getParamsVarDeclarationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVarDeclaration_in_ruleParams3781);
                    	    lv_params_3_0=ruleVarDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getParamsRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_3_0, 
                    	              		"VarDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParams"


    // $ANTLR start "entryRuleCompoundStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1527:1: entryRuleCompoundStatement returns [EObject current=null] : iv_ruleCompoundStatement= ruleCompoundStatement EOF ;
    public final EObject entryRuleCompoundStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1528:2: (iv_ruleCompoundStatement= ruleCompoundStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1529:2: iv_ruleCompoundStatement= ruleCompoundStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompoundStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement3820);
            iv_ruleCompoundStatement=ruleCompoundStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompoundStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStatement3830); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompoundStatement"


    // $ANTLR start "ruleCompoundStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1536:1: ruleCompoundStatement returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleCompoundStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_contents_2_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1539:28: ( ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1540:1: ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1540:1: ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1540:2: () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1540:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1541:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCompoundStatementAccess().getCompoundStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleCompoundStatement3876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCompoundStatementAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1550:1: ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_INT && LA18_0<=RULE_STRING)||(LA18_0>=11 && LA18_0<=13)||(LA18_0>=15 && LA18_0<=18)||(LA18_0>=31 && LA18_0<=33)||(LA18_0>=35 && LA18_0<=38)||LA18_0==40||LA18_0==42||(LA18_0>=44 && LA18_0<=46)||(LA18_0>=50 && LA18_0<=52)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1551:1: (lv_contents_2_0= ruleVarDeclarationOrStatement )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1551:1: (lv_contents_2_0= ruleVarDeclarationOrStatement )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1552:3: lv_contents_2_0= ruleVarDeclarationOrStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompoundStatementAccess().getContentsVarDeclarationOrStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVarDeclarationOrStatement_in_ruleCompoundStatement3897);
            	    lv_contents_2_0=ruleVarDeclarationOrStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompoundStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"contents",
            	              		lv_contents_2_0, 
            	              		"VarDeclarationOrStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleCompoundStatement3910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCompoundStatementAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompoundStatement"


    // $ANTLR start "entryRuleVarDeclarationOrStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1580:1: entryRuleVarDeclarationOrStatement returns [EObject current=null] : iv_ruleVarDeclarationOrStatement= ruleVarDeclarationOrStatement EOF ;
    public final EObject entryRuleVarDeclarationOrStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclarationOrStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1581:2: (iv_ruleVarDeclarationOrStatement= ruleVarDeclarationOrStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1582:2: iv_ruleVarDeclarationOrStatement= ruleVarDeclarationOrStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclarationOrStatementRule()); 
            }
            pushFollow(FOLLOW_ruleVarDeclarationOrStatement_in_entryRuleVarDeclarationOrStatement3946);
            iv_ruleVarDeclarationOrStatement=ruleVarDeclarationOrStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDeclarationOrStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclarationOrStatement3956); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDeclarationOrStatement"


    // $ANTLR start "ruleVarDeclarationOrStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1589:1: ruleVarDeclarationOrStatement returns [EObject current=null] : ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_Statement_2= ruleStatement ) ;
    public final EObject ruleVarDeclarationOrStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_VarDeclaration_0 = null;

        EObject this_Statement_2 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1592:28: ( ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_Statement_2= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1593:1: ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_Statement_2= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1593:1: ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_Statement_2= ruleStatement )
            int alt19=2;
            switch ( input.LA(1) ) {
            case 31:
            case 32:
            case 33:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt19=1;
                }
                break;
            case 17:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==18) ) {
                    alt19=2;
                }
                else if ( (LA19_2==RULE_ID) ) {
                    alt19=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case RULE_STRING:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 18:
            case 40:
            case 42:
            case 44:
            case 45:
            case 46:
            case 50:
            case 51:
            case 52:
                {
                alt19=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1593:2: (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1593:2: (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1594:5: this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarDeclarationOrStatementAccess().getVarDeclarationParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarDeclaration_in_ruleVarDeclarationOrStatement4004);
                    this_VarDeclaration_0=ruleVarDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VarDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleVarDeclarationOrStatement4015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVarDeclarationOrStatementAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1608:5: this_Statement_2= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarDeclarationOrStatementAccess().getStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleVarDeclarationOrStatement4044);
                    this_Statement_2=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDeclarationOrStatement"


    // $ANTLR start "entryRuleStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1624:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1625:2: (iv_ruleStatement= ruleStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1626:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement4079);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement4089); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1633:1: ruleStatement returns [EObject current=null] : (this_ExpressionStatement_0= ruleExpressionStatement | this_CompoundStatement_1= ruleCompoundStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionStatement_0 = null;

        EObject this_CompoundStatement_1 = null;

        EObject this_IfElseStatement_2 = null;

        EObject this_WhileStatement_3 = null;

        EObject this_ForStatement_4 = null;

        EObject this_SwitchStatement_5 = null;

        EObject this_ReturnStatement_6 = null;

        EObject this_ContinueStatement_7 = null;

        EObject this_BreakStatement_8 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1636:28: ( (this_ExpressionStatement_0= ruleExpressionStatement | this_CompoundStatement_1= ruleCompoundStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1637:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_CompoundStatement_1= ruleCompoundStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1637:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_CompoundStatement_1= ruleCompoundStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement )
            int alt20=9;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_ID:
            case RULE_STRING:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
                {
                alt20=1;
                }
                break;
            case 40:
                {
                alt20=2;
                }
                break;
            case 42:
                {
                alt20=3;
                }
                break;
            case 44:
                {
                alt20=4;
                }
                break;
            case 45:
                {
                alt20=5;
                }
                break;
            case 46:
                {
                alt20=6;
                }
                break;
            case 50:
                {
                alt20=7;
                }
                break;
            case 51:
                {
                alt20=8;
                }
                break;
            case 52:
                {
                alt20=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1638:5: this_ExpressionStatement_0= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExpressionStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionStatement_in_ruleStatement4136);
                    this_ExpressionStatement_0=ruleExpressionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionStatement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1648:5: this_CompoundStatement_1= ruleCompoundStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getCompoundStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompoundStatement_in_ruleStatement4163);
                    this_CompoundStatement_1=ruleCompoundStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompoundStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1658:5: this_IfElseStatement_2= ruleIfElseStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfElseStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfElseStatement_in_ruleStatement4190);
                    this_IfElseStatement_2=ruleIfElseStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfElseStatement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1668:5: this_WhileStatement_3= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhileStatement_in_ruleStatement4217);
                    this_WhileStatement_3=ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WhileStatement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1678:5: this_ForStatement_4= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForStatement_in_ruleStatement4244);
                    this_ForStatement_4=ruleForStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ForStatement_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1688:5: this_SwitchStatement_5= ruleSwitchStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSwitchStatement_in_ruleStatement4271);
                    this_SwitchStatement_5=ruleSwitchStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SwitchStatement_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1698:5: this_ReturnStatement_6= ruleReturnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturnStatement_in_ruleStatement4298);
                    this_ReturnStatement_6=ruleReturnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReturnStatement_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1708:5: this_ContinueStatement_7= ruleContinueStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getContinueStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContinueStatement_in_ruleStatement4325);
                    this_ContinueStatement_7=ruleContinueStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ContinueStatement_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1718:5: this_BreakStatement_8= ruleBreakStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getBreakStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBreakStatement_in_ruleStatement4352);
                    this_BreakStatement_8=ruleBreakStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BreakStatement_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpressionStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1734:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1735:2: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1736:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionStatementRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionStatement_in_entryRuleExpressionStatement4387);
            iv_ruleExpressionStatement=ruleExpressionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionStatement4397); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionStatement"


    // $ANTLR start "ruleExpressionStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1743:1: ruleExpressionStatement returns [EObject current=null] : ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) | ( () otherlv_3= ';' ) ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1746:28: ( ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) | ( () otherlv_3= ';' ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1747:1: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) | ( () otherlv_3= ';' ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1747:1: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) | ( () otherlv_3= ';' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_INT && LA21_0<=RULE_STRING)||(LA21_0>=12 && LA21_0<=13)||(LA21_0>=15 && LA21_0<=18)) ) {
                alt21=1;
            }
            else if ( (LA21_0==11) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1747:2: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1747:2: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1747:3: ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';'
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1747:3: ( (lv_expression_0_0= ruleExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1748:1: (lv_expression_0_0= ruleExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1748:1: (lv_expression_0_0= ruleExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1749:3: lv_expression_0_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionStatementAccess().getExpressionExpressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionStatement4444);
                    lv_expression_0_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_0_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleExpressionStatement4456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1770:6: ( () otherlv_3= ';' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1770:6: ( () otherlv_3= ';' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1770:7: () otherlv_3= ';'
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1770:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1771:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionStatementAccess().getEmptyExpressionStatementAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleExpressionStatement4485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionStatement"


    // $ANTLR start "entryRuleIfElseStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1788:1: entryRuleIfElseStatement returns [EObject current=null] : iv_ruleIfElseStatement= ruleIfElseStatement EOF ;
    public final EObject entryRuleIfElseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1789:2: (iv_ruleIfElseStatement= ruleIfElseStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1790:2: iv_ruleIfElseStatement= ruleIfElseStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfElseStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIfElseStatement_in_entryRuleIfElseStatement4522);
            iv_ruleIfElseStatement=ruleIfElseStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfElseStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfElseStatement4532); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfElseStatement"


    // $ANTLR start "ruleIfElseStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1797:1: ruleIfElseStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) ;
    public final EObject ruleIfElseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_ifStatement_4_0 = null;

        EObject lv_elseStatement_6_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1800:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1801:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1801:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1801:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleIfElseStatement4569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfElseStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleIfElseStatement4581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfElseStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1809:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1810:1: (lv_condition_2_0= ruleExpression )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1810:1: (lv_condition_2_0= ruleExpression )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1811:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfElseStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfElseStatement4602);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleIfElseStatement4614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfElseStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1831:1: ( (lv_ifStatement_4_0= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1832:1: (lv_ifStatement_4_0= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1832:1: (lv_ifStatement_4_0= ruleStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1833:3: lv_ifStatement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfElseStatementAccess().getIfStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleIfElseStatement4635);
            lv_ifStatement_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
              	        }
                     		set(
                     			current, 
                     			"ifStatement",
                      		lv_ifStatement_4_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1849:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                int LA22_1 = input.LA(2);

                if ( (synpred1_InternalXS()) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1849:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1849:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1849:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleIfElseStatement4656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfElseStatementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1854:2: ( (lv_elseStatement_6_0= ruleStatement ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1855:1: (lv_elseStatement_6_0= ruleStatement )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1855:1: (lv_elseStatement_6_0= ruleStatement )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1856:3: lv_elseStatement_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfElseStatementAccess().getElseStatementStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIfElseStatement4678);
                    lv_elseStatement_6_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_6_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfElseStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1880:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1881:2: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1882:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement4716);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileStatement4726); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1889:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statement_4_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1892:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1893:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1893:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1893:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleWhileStatement4763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleWhileStatement4775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1901:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1902:1: (lv_condition_2_0= ruleExpression )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1902:1: (lv_condition_2_0= ruleExpression )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1903:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleWhileStatement4796);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleWhileStatement4808); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1923:1: ( (lv_statement_4_0= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1924:1: (lv_statement_4_0= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1924:1: (lv_statement_4_0= ruleStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1925:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleWhileStatement4829);
            lv_statement_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_4_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleForStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1949:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1950:2: (iv_ruleForStatement= ruleForStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1951:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_ruleForStatement_in_entryRuleForStatement4865);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForStatement4875); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1958:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_var_2_0 = null;

        AntlrDatatypeRuleToken lv_op_4_0 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_statement_7_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1961:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1962:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1962:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1962:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleForStatement4912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleForStatement4924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1970:1: ( (lv_var_2_0= ruleForVarDeclaration ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1971:1: (lv_var_2_0= ruleForVarDeclaration )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1971:1: (lv_var_2_0= ruleForVarDeclaration )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1972:3: lv_var_2_0= ruleForVarDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getVarForVarDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForVarDeclaration_in_ruleForStatement4945);
            lv_var_2_0=ruleForVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForStatementRule());
              	        }
                     		set(
                     			current, 
                     			"var",
                      		lv_var_2_0, 
                      		"ForVarDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleForStatement4957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1992:1: ( (lv_op_4_0= ruleRelOp ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1993:1: (lv_op_4_0= ruleRelOp )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1993:1: (lv_op_4_0= ruleRelOp )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1994:3: lv_op_4_0= ruleRelOp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getOpRelOpParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRelOp_in_ruleForStatement4978);
            lv_op_4_0=ruleRelOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForStatementRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_4_0, 
                      		"RelOp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2010:2: ( (lv_expression_5_0= ruleExpression ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2011:1: (lv_expression_5_0= ruleExpression )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2011:1: (lv_expression_5_0= ruleExpression )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2012:3: lv_expression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getExpressionExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleForStatement4999);
            lv_expression_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleForStatement5011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2032:1: ( (lv_statement_7_0= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2033:1: (lv_statement_7_0= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2033:1: (lv_statement_7_0= ruleStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2034:3: lv_statement_7_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getStatementStatementParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleForStatement5032);
            lv_statement_7_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForStatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_7_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleSwitchStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2058:1: entryRuleSwitchStatement returns [EObject current=null] : iv_ruleSwitchStatement= ruleSwitchStatement EOF ;
    public final EObject entryRuleSwitchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2059:2: (iv_ruleSwitchStatement= ruleSwitchStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2060:2: iv_ruleSwitchStatement= ruleSwitchStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement5068);
            iv_ruleSwitchStatement=ruleSwitchStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchStatement5078); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchStatement"


    // $ANTLR start "ruleSwitchStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2067:1: ruleSwitchStatement returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}' ) ;
    public final EObject ruleSwitchStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_cases_5_0 = null;

        EObject lv_default_6_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2070:28: ( (otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2071:1: (otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2071:1: (otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2071:3: otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleSwitchStatement5115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchStatementAccess().getSwitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSwitchStatement5127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2079:1: ( (otherlv_2= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2080:1: (otherlv_2= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2080:1: (otherlv_2= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2081:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSwitchStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSwitchStatement5147); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getSwitchStatementAccess().getVarVarDeclarationCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSwitchStatement5159); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleSwitchStatement5171); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitchStatementAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2100:1: ( (lv_cases_5_0= ruleSwitchCase ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==47) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2101:1: (lv_cases_5_0= ruleSwitchCase )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2101:1: (lv_cases_5_0= ruleSwitchCase )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2102:3: lv_cases_5_0= ruleSwitchCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getCasesSwitchCaseParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSwitchCase_in_ruleSwitchStatement5192);
            	    lv_cases_5_0=ruleSwitchCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_5_0, 
            	              		"SwitchCase");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2118:3: ( (lv_default_6_0= ruleSwitchDefault ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2119:1: (lv_default_6_0= ruleSwitchDefault )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2119:1: (lv_default_6_0= ruleSwitchDefault )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2120:3: lv_default_6_0= ruleSwitchDefault
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getDefaultSwitchDefaultParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSwitchDefault_in_ruleSwitchStatement5214);
                    lv_default_6_0=ruleSwitchDefault();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_6_0, 
                              		"SwitchDefault");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleSwitchStatement5227); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getSwitchStatementAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchStatement"


    // $ANTLR start "entryRuleSwitchCase"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2148:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2149:2: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2150:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase5263);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchCase5273); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchCase"


    // $ANTLR start "ruleSwitchCase"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2157:1: ruleSwitchCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_var_1_0= ruleSignedInt ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) ) otherlv_5= '}' ) ;
    public final EObject ruleSwitchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_var_1_0 = null;

        EObject lv_statement_4_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2160:28: ( (otherlv_0= 'case' ( (lv_var_1_0= ruleSignedInt ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) ) otherlv_5= '}' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2161:1: (otherlv_0= 'case' ( (lv_var_1_0= ruleSignedInt ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) ) otherlv_5= '}' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2161:1: (otherlv_0= 'case' ( (lv_var_1_0= ruleSignedInt ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) ) otherlv_5= '}' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2161:3: otherlv_0= 'case' ( (lv_var_1_0= ruleSignedInt ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleSwitchCase5310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchCaseAccess().getCaseKeyword_0());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2165:1: ( (lv_var_1_0= ruleSignedInt ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2166:1: (lv_var_1_0= ruleSignedInt )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2166:1: (lv_var_1_0= ruleSignedInt )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2167:3: lv_var_1_0= ruleSignedInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getVarSignedIntParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignedInt_in_ruleSwitchCase5331);
            lv_var_1_0=ruleSignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
              	        }
                     		set(
                     			current, 
                     			"var",
                      		lv_var_1_0, 
                      		"SignedInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleSwitchCase5343); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSwitchCaseAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleSwitchCase5355); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchCaseAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2191:1: ( (lv_statement_4_0= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2192:1: (lv_statement_4_0= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2192:1: (lv_statement_4_0= ruleStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2193:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleSwitchCase5376);
            lv_statement_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_4_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleSwitchCase5388); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSwitchCaseAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchCase"


    // $ANTLR start "entryRuleSwitchDefault"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2221:1: entryRuleSwitchDefault returns [EObject current=null] : iv_ruleSwitchDefault= ruleSwitchDefault EOF ;
    public final EObject entryRuleSwitchDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchDefault = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2222:2: (iv_ruleSwitchDefault= ruleSwitchDefault EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2223:2: iv_ruleSwitchDefault= ruleSwitchDefault EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchDefaultRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchDefault_in_entryRuleSwitchDefault5424);
            iv_ruleSwitchDefault=ruleSwitchDefault();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchDefault; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchDefault5434); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchDefault"


    // $ANTLR start "ruleSwitchDefault"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2230:1: ruleSwitchDefault returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= ':' otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) ) otherlv_4= '}' ) ;
    public final EObject ruleSwitchDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statement_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2233:28: ( (otherlv_0= 'default' otherlv_1= ':' otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) ) otherlv_4= '}' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2234:1: (otherlv_0= 'default' otherlv_1= ':' otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) ) otherlv_4= '}' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2234:1: (otherlv_0= 'default' otherlv_1= ':' otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) ) otherlv_4= '}' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2234:3: otherlv_0= 'default' otherlv_1= ':' otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleSwitchDefault5471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchDefaultAccess().getDefaultKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleSwitchDefault5483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchDefaultAccess().getColonKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleSwitchDefault5495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSwitchDefaultAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2246:1: ( (lv_statement_3_0= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2247:1: (lv_statement_3_0= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2247:1: (lv_statement_3_0= ruleStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2248:3: lv_statement_3_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchDefaultAccess().getStatementStatementParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleSwitchDefault5516);
            lv_statement_3_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchDefaultRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_3_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleSwitchDefault5528); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitchDefaultAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchDefault"


    // $ANTLR start "entryRuleReturnStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2276:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2277:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2278:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement5564);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStatement5574); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2285:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2288:28: ( ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2289:1: ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2289:1: ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2289:2: () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2289:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2290:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleReturnStatement5620); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getReturnKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2299:1: (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2299:3: otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleReturnStatement5633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getReturnStatementAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2303:1: ( (lv_expression_3_0= ruleExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2304:1: (lv_expression_3_0= ruleExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2304:1: (lv_expression_3_0= ruleExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2305:3: lv_expression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReturnStatement5654);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReturnStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleReturnStatement5666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReturnStatementAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleReturnStatement5680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getReturnStatementAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleContinueStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2337:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2338:2: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2339:2: iv_ruleContinueStatement= ruleContinueStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContinueStatementRule()); 
            }
            pushFollow(FOLLOW_ruleContinueStatement_in_entryRuleContinueStatement5716);
            iv_ruleContinueStatement=ruleContinueStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContinueStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContinueStatement5726); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContinueStatement"


    // $ANTLR start "ruleContinueStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2346:1: ruleContinueStatement returns [EObject current=null] : ( () otherlv_1= 'continue' otherlv_2= ';' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2349:28: ( ( () otherlv_1= 'continue' otherlv_2= ';' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2350:1: ( () otherlv_1= 'continue' otherlv_2= ';' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2350:1: ( () otherlv_1= 'continue' otherlv_2= ';' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2350:2: () otherlv_1= 'continue' otherlv_2= ';'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2350:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2351:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContinueStatementAccess().getContinueStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleContinueStatement5772); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContinueStatementAccess().getContinueKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleContinueStatement5784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getContinueStatementAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContinueStatement"


    // $ANTLR start "entryRuleBreakStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2372:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2373:2: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2374:2: iv_ruleBreakStatement= ruleBreakStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBreakStatement_in_entryRuleBreakStatement5820);
            iv_ruleBreakStatement=ruleBreakStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakStatement5830); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBreakStatement"


    // $ANTLR start "ruleBreakStatement"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2381:1: ruleBreakStatement returns [EObject current=null] : ( () otherlv_1= 'break' otherlv_2= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2384:28: ( ( () otherlv_1= 'break' otherlv_2= ';' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2385:1: ( () otherlv_1= 'break' otherlv_2= ';' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2385:1: ( () otherlv_1= 'break' otherlv_2= ';' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2385:2: () otherlv_1= 'break' otherlv_2= ';'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2385:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2386:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBreakStatementAccess().getBreakStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleBreakStatement5876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBreakStatementAccess().getBreakKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleBreakStatement5888); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBreakStatementAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreakStatement"


    // $ANTLR start "entryRulePostFixOp"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2407:1: entryRulePostFixOp returns [String current=null] : iv_rulePostFixOp= rulePostFixOp EOF ;
    public final String entryRulePostFixOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePostFixOp = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2408:2: (iv_rulePostFixOp= rulePostFixOp EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2409:2: iv_rulePostFixOp= rulePostFixOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostFixOpRule()); 
            }
            pushFollow(FOLLOW_rulePostFixOp_in_entryRulePostFixOp5925);
            iv_rulePostFixOp=rulePostFixOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostFixOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostFixOp5936); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostFixOp"


    // $ANTLR start "rulePostFixOp"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2416:1: rulePostFixOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' ) ;
    public final AntlrDatatypeRuleToken rulePostFixOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2419:28: ( (kw= '++' | kw= '--' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2420:1: (kw= '++' | kw= '--' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2420:1: (kw= '++' | kw= '--' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==53) ) {
                alt26=1;
            }
            else if ( (LA26_0==54) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2421:2: kw= '++'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_rulePostFixOp5974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPostFixOpAccess().getPlusSignPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2428:2: kw= '--'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_rulePostFixOp5993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPostFixOpAccess().getHyphenMinusHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostFixOp"


    // $ANTLR start "entryRuleExpression"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2441:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2442:2: (iv_ruleExpression= ruleExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2443:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6033);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6043); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2450:1: ruleExpression returns [EObject current=null] : ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) | ( (lv_expression_4_0= ruleSimpleExpression ) ) | ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_var_1_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_expression_4_0 = null;

        AntlrDatatypeRuleToken lv_op_7_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2453:28: ( ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) | ( (lv_expression_4_0= ruleSimpleExpression ) ) | ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2454:1: ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) | ( (lv_expression_4_0= ruleSimpleExpression ) ) | ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2454:1: ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) | ( (lv_expression_4_0= ruleSimpleExpression ) ) | ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) ) )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 21:
                    {
                    alt27=1;
                    }
                    break;
                case EOF:
                case 11:
                case 12:
                case 13:
                case 18:
                case 19:
                case 20:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                    {
                    alt27=2;
                    }
                    break;
                case 53:
                case 54:
                    {
                    alt27=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA27_0==RULE_INT||LA27_0==RULE_STRING||(LA27_0>=12 && LA27_0<=13)||(LA27_0>=15 && LA27_0<=18)) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2454:2: ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2454:2: ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2454:3: () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2454:3: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2455:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionAccess().getAssignmentExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2460:2: ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2460:3: ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2460:3: ( (lv_var_1_0= ruleVar ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2461:1: (lv_var_1_0= ruleVar )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2461:1: (lv_var_1_0= ruleVar )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2462:3: lv_var_1_0= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getVarVarParserRuleCall_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVar_in_ruleExpression6100);
                    lv_var_1_0=ruleVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"var",
                              		lv_var_1_0, 
                              		"Var");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleExpression6112); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getEqualsSignKeyword_0_1_1());
                          
                    }
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2482:1: ( (lv_expression_3_0= ruleExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2483:1: (lv_expression_3_0= ruleExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2483:1: (lv_expression_3_0= ruleExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2484:3: lv_expression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_0_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression6133);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2501:6: ( (lv_expression_4_0= ruleSimpleExpression ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2501:6: ( (lv_expression_4_0= ruleSimpleExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2502:1: (lv_expression_4_0= ruleSimpleExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2502:1: (lv_expression_4_0= ruleSimpleExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2503:3: lv_expression_4_0= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionSimpleExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleExpression6162);
                    lv_expression_4_0=ruleSimpleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"SimpleExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2520:6: ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2520:6: ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2520:7: () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2520:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2521:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionAccess().getPostfixExpressionAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2526:2: ( (otherlv_6= RULE_ID ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2527:1: (otherlv_6= RULE_ID )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2527:1: (otherlv_6= RULE_ID )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2528:3: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                              
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression6198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getPostfixVarVarDeclarationCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2539:2: ( (lv_op_7_0= rulePostFixOp ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2540:1: (lv_op_7_0= rulePostFixOp )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2540:1: (lv_op_7_0= rulePostFixOp )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2541:3: lv_op_7_0= rulePostFixOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getOpPostFixOpParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePostFixOp_in_ruleExpression6219);
                    lv_op_7_0=rulePostFixOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_7_0, 
                              		"PostFixOp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleVar"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2565:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2566:2: (iv_ruleVar= ruleVar EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2567:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar6256);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar6266); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2574:1: ruleVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2577:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2578:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2578:1: ( (otherlv_0= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2579:1: (otherlv_0= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2579:1: (otherlv_0= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2580:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVarRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar6310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVarAccess().getNameVarDeclarationCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleSimpleExpression"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2599:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2600:2: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2601:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression6345);
            iv_ruleSimpleExpression=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpression6355); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleExpression"


    // $ANTLR start "ruleSimpleExpression"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2608:1: ruleSimpleExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2611:28: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2612:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2612:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2613:5: this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSimpleExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleSimpleExpression6402);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2621:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==55) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2621:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2621:2: ()
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2622:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSimpleExpressionAccess().getSimpleExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2627:2: ( (lv_op_2_0= '||' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2628:1: (lv_op_2_0= '||' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2628:1: (lv_op_2_0= '||' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2629:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,55,FOLLOW_55_in_ruleSimpleExpression6429); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getSimpleExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getSimpleExpressionRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	      	    
            	    }

            	    }


            	    }

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2642:2: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2643:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2643:1: (lv_right_3_0= ruleAndExpression )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2644:3: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleSimpleExpression6463);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"AndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2668:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2669:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2670:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression6501);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression6511); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2677:1: ruleAndExpression returns [EObject current=null] : (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_EqualsExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2680:28: ( (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2681:1: (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2681:1: (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2682:5: this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualsExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEqualsExpression_in_ruleAndExpression6558);
            this_EqualsExpression_0=ruleEqualsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EqualsExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2690:1: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==56) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2690:2: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2690:2: ()
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2691:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2696:2: ( (lv_op_2_0= '&&' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2697:1: (lv_op_2_0= '&&' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2697:1: (lv_op_2_0= '&&' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2698:3: lv_op_2_0= '&&'
            	    {
            	    lv_op_2_0=(Token)match(input,56,FOLLOW_56_in_ruleAndExpression6585); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getAndExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAndExpressionRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "&&");
            	      	    
            	    }

            	    }


            	    }

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2711:2: ( (lv_right_3_0= ruleEqualsExpression ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2712:1: (lv_right_3_0= ruleEqualsExpression )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2712:1: (lv_right_3_0= ruleEqualsExpression )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2713:3: lv_right_3_0= ruleEqualsExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualsExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEqualsExpression_in_ruleAndExpression6619);
            	    lv_right_3_0=ruleEqualsExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"EqualsExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualsExpression"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2737:1: entryRuleEqualsExpression returns [EObject current=null] : iv_ruleEqualsExpression= ruleEqualsExpression EOF ;
    public final EObject entryRuleEqualsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2738:2: (iv_ruleEqualsExpression= ruleEqualsExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2739:2: iv_ruleEqualsExpression= ruleEqualsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsExpression_in_entryRuleEqualsExpression6657);
            iv_ruleEqualsExpression=ruleEqualsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsExpression6667); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualsExpression"


    // $ANTLR start "ruleEqualsExpression"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2746:1: ruleEqualsExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? ) ;
    public final EObject ruleEqualsExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2749:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2750:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2750:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2751:5: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEqualsExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparisonExpression_in_ruleEqualsExpression6714);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparisonExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2759:1: ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=57 && LA30_0<=58)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2759:2: () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2759:2: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2760:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEqualsExpressionAccess().getEqualsExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2765:2: ( (lv_op_2_0= ruleEqOp ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2766:1: (lv_op_2_0= ruleEqOp )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2766:1: (lv_op_2_0= ruleEqOp )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2767:3: lv_op_2_0= ruleEqOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualsExpressionAccess().getOpEqOpParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEqOp_in_ruleEqualsExpression6744);
                    lv_op_2_0=ruleEqOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEqualsExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_2_0, 
                              		"EqOp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2783:2: ( (lv_right_3_0= ruleComparisonExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2784:1: (lv_right_3_0= ruleComparisonExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2784:1: (lv_right_3_0= ruleComparisonExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2785:3: lv_right_3_0= ruleComparisonExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualsExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComparisonExpression_in_ruleEqualsExpression6765);
                    lv_right_3_0=ruleComparisonExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEqualsExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"ComparisonExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualsExpression"


    // $ANTLR start "entryRuleEqOp"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2809:1: entryRuleEqOp returns [String current=null] : iv_ruleEqOp= ruleEqOp EOF ;
    public final String entryRuleEqOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqOp = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2810:2: (iv_ruleEqOp= ruleEqOp EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2811:2: iv_ruleEqOp= ruleEqOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqOpRule()); 
            }
            pushFollow(FOLLOW_ruleEqOp_in_entryRuleEqOp6804);
            iv_ruleEqOp=ruleEqOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqOp6815); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqOp"


    // $ANTLR start "ruleEqOp"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2818:1: ruleEqOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2821:28: ( (kw= '==' | kw= '!=' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2822:1: (kw= '==' | kw= '!=' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2822:1: (kw= '==' | kw= '!=' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==57) ) {
                alt31=1;
            }
            else if ( (LA31_0==58) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2823:2: kw= '=='
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleEqOp6853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqOpAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2830:2: kw= '!='
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleEqOp6872); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqOpAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqOp"


    // $ANTLR start "entryRuleComparisonExpression"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2843:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2844:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2845:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression6912);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonExpression6922); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2852:1: ruleComparisonExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2855:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2856:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2856:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2857:5: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleComparisonExpression6969);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2865:1: ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=59 && LA32_0<=62)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2865:2: () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2865:2: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2866:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2871:2: ( (lv_op_2_0= ruleRelOp ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2872:1: (lv_op_2_0= ruleRelOp )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2872:1: (lv_op_2_0= ruleRelOp )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2873:3: lv_op_2_0= ruleRelOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOpRelOpParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRelOp_in_ruleComparisonExpression6999);
                    lv_op_2_0=ruleRelOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_2_0, 
                              		"RelOp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2889:2: ( (lv_right_3_0= ruleAdditiveExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2890:1: (lv_right_3_0= ruleAdditiveExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2890:1: (lv_right_3_0= ruleAdditiveExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2891:3: lv_right_3_0= ruleAdditiveExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleComparisonExpression7020);
                    lv_right_3_0=ruleAdditiveExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"AdditiveExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleRelOp"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2915:1: entryRuleRelOp returns [String current=null] : iv_ruleRelOp= ruleRelOp EOF ;
    public final String entryRuleRelOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelOp = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2916:2: (iv_ruleRelOp= ruleRelOp EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2917:2: iv_ruleRelOp= ruleRelOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelOpRule()); 
            }
            pushFollow(FOLLOW_ruleRelOp_in_entryRuleRelOp7059);
            iv_ruleRelOp=ruleRelOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelOp7070); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelOp"


    // $ANTLR start "ruleRelOp"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2924:1: ruleRelOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2927:28: ( (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2928:1: (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2928:1: (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt33=1;
                }
                break;
            case 60:
                {
                alt33=2;
                }
                break;
            case 61:
                {
                alt33=3;
                }
                break;
            case 62:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2929:2: kw= '<='
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleRelOp7108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2936:2: kw= '<'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleRelOp7127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2943:2: kw= '>'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleRelOp7146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2950:2: kw= '>='
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleRelOp7165); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpAccess().getGreaterThanSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelOp"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2963:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2964:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2965:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression7205);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression7215); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2972:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2975:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2976:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2976:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2977:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7262);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2985:1: ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=12 && LA34_0<=13)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2985:2: () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2985:2: ()
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2986:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2991:2: ( (lv_op_2_0= ruleAddOp ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2992:1: (lv_op_2_0= ruleAddOp )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2992:1: (lv_op_2_0= ruleAddOp )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2993:3: lv_op_2_0= ruleAddOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpAddOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddOp_in_ruleAdditiveExpression7292);
            	    lv_op_2_0=ruleAddOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"op",
            	              		lv_op_2_0, 
            	              		"AddOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3009:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3010:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3010:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3011:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7313);
            	    lv_right_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"MultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleAddOp"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3035:1: entryRuleAddOp returns [String current=null] : iv_ruleAddOp= ruleAddOp EOF ;
    public final String entryRuleAddOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddOp = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3036:2: (iv_ruleAddOp= ruleAddOp EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3037:2: iv_ruleAddOp= ruleAddOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddOpRule()); 
            }
            pushFollow(FOLLOW_ruleAddOp_in_entryRuleAddOp7352);
            iv_ruleAddOp=ruleAddOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddOp7363); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddOp"


    // $ANTLR start "ruleAddOp"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3044:1: ruleAddOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAddOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3047:28: ( (kw= '+' | kw= '-' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3048:1: (kw= '+' | kw= '-' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3048:1: (kw= '+' | kw= '-' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==12) ) {
                alt35=1;
            }
            else if ( (LA35_0==13) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3049:2: kw= '+'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleAddOp7401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAddOpAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3056:2: kw= '-'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleAddOp7420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAddOpAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddOp"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3069:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3070:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3071:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression7460);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression7470); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3078:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3081:28: ( (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3082:1: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3082:1: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3083:5: this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getAtomParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAtom_in_ruleMultiplicativeExpression7517);
            this_Atom_0=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Atom_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3091:1: ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=63 && LA36_0<=65)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3091:2: () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3091:2: ()
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3092:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3097:2: ( (lv_op_2_0= ruleMulOp ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3098:1: (lv_op_2_0= ruleMulOp )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3098:1: (lv_op_2_0= ruleMulOp )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3099:3: lv_op_2_0= ruleMulOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpMulOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMulOp_in_ruleMultiplicativeExpression7547);
            	    lv_op_2_0=ruleMulOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"op",
            	              		lv_op_2_0, 
            	              		"MulOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3115:2: ( (lv_right_3_0= ruleAtom ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3116:1: (lv_right_3_0= ruleAtom )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3116:1: (lv_right_3_0= ruleAtom )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3117:3: lv_right_3_0= ruleAtom
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightAtomParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAtom_in_ruleMultiplicativeExpression7568);
            	    lv_right_3_0=ruleAtom();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Atom");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleMulOp"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3141:1: entryRuleMulOp returns [String current=null] : iv_ruleMulOp= ruleMulOp EOF ;
    public final String entryRuleMulOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMulOp = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3142:2: (iv_ruleMulOp= ruleMulOp EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3143:2: iv_ruleMulOp= ruleMulOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOpRule()); 
            }
            pushFollow(FOLLOW_ruleMulOp_in_entryRuleMulOp7607);
            iv_ruleMulOp=ruleMulOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOp7618); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOp"


    // $ANTLR start "ruleMulOp"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3150:1: ruleMulOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMulOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3153:28: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3154:1: (kw= '*' | kw= '/' | kw= '%' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3154:1: (kw= '*' | kw= '/' | kw= '%' )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt37=1;
                }
                break;
            case 64:
                {
                alt37=2;
                }
                break;
            case 65:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3155:2: kw= '*'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleMulOp7656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMulOpAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3162:2: kw= '/'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleMulOp7675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMulOpAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3169:2: kw= '%'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleMulOp7694); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMulOpAccess().getPercentSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOp"


    // $ANTLR start "entryRuleAtom"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3182:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3183:2: (iv_ruleAtom= ruleAtom EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3184:2: iv_ruleAtom= ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom7734);
            iv_ruleAtom=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom7744); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3191:1: ruleAtom returns [EObject current=null] : ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | ( (lv_expression_4_0= ruleVar ) ) | ( (lv_expression_5_0= ruleCall ) ) | ( () ( (lv_value_7_0= ruleSignedInt ) ) ) | ( () ( (lv_value_9_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_11_0= ruleBool ) ) ) | ( () ( (lv_value_13_0= ruleVector ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_value_15_0=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_expression_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;

        AntlrDatatypeRuleToken lv_value_9_0 = null;

        AntlrDatatypeRuleToken lv_value_11_0 = null;

        EObject lv_value_13_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3194:28: ( ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | ( (lv_expression_4_0= ruleVar ) ) | ( (lv_expression_5_0= ruleCall ) ) | ( () ( (lv_value_7_0= ruleSignedInt ) ) ) | ( () ( (lv_value_9_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_11_0= ruleBool ) ) ) | ( () ( (lv_value_13_0= ruleVector ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3195:1: ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | ( (lv_expression_4_0= ruleVar ) ) | ( (lv_expression_5_0= ruleCall ) ) | ( () ( (lv_value_7_0= ruleSignedInt ) ) ) | ( () ( (lv_value_9_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_11_0= ruleBool ) ) ) | ( () ( (lv_value_13_0= ruleVector ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3195:1: ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | ( (lv_expression_4_0= ruleVar ) ) | ( (lv_expression_5_0= ruleCall ) ) | ( () ( (lv_value_7_0= ruleSignedInt ) ) ) | ( () ( (lv_value_9_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_11_0= ruleBool ) ) ) | ( () ( (lv_value_13_0= ruleVector ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) )
            int alt38=8;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3195:2: ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3195:2: ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3195:3: () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3195:3: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3196:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getPrimaryExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3201:2: (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3201:4: otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAtom7792); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_0_1_0());
                          
                    }
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3205:1: ( (lv_expression_2_0= ruleExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3206:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3206:1: (lv_expression_2_0= ruleExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3207:3: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getExpressionExpressionParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAtom7813);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleAtom7825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getRightParenthesisKeyword_0_1_2());
                          
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3228:6: ( (lv_expression_4_0= ruleVar ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3228:6: ( (lv_expression_4_0= ruleVar ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3229:1: (lv_expression_4_0= ruleVar )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3229:1: (lv_expression_4_0= ruleVar )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3230:3: lv_expression_4_0= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getExpressionVarParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVar_in_ruleAtom7854);
                    lv_expression_4_0=ruleVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"Var");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3247:6: ( (lv_expression_5_0= ruleCall ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3247:6: ( (lv_expression_5_0= ruleCall ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3248:1: (lv_expression_5_0= ruleCall )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3248:1: (lv_expression_5_0= ruleCall )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3249:3: lv_expression_5_0= ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getExpressionCallParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCall_in_ruleAtom7881);
                    lv_expression_5_0=ruleCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_5_0, 
                              		"Call");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3266:6: ( () ( (lv_value_7_0= ruleSignedInt ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3266:6: ( () ( (lv_value_7_0= ruleSignedInt ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3266:7: () ( (lv_value_7_0= ruleSignedInt ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3266:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3267:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getLiteralIntAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3272:2: ( (lv_value_7_0= ruleSignedInt ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3273:1: (lv_value_7_0= ruleSignedInt )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3273:1: (lv_value_7_0= ruleSignedInt )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3274:3: lv_value_7_0= ruleSignedInt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getValueSignedIntParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedInt_in_ruleAtom7918);
                    lv_value_7_0=ruleSignedInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_7_0, 
                              		"SignedInt");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3291:6: ( () ( (lv_value_9_0= ruleSignedFloat ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3291:6: ( () ( (lv_value_9_0= ruleSignedFloat ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3291:7: () ( (lv_value_9_0= ruleSignedFloat ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3291:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3292:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getLiteralFloatAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3297:2: ( (lv_value_9_0= ruleSignedFloat ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3298:1: (lv_value_9_0= ruleSignedFloat )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3298:1: (lv_value_9_0= ruleSignedFloat )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3299:3: lv_value_9_0= ruleSignedFloat
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getValueSignedFloatParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedFloat_in_ruleAtom7956);
                    lv_value_9_0=ruleSignedFloat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_9_0, 
                              		"SignedFloat");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3316:6: ( () ( (lv_value_11_0= ruleBool ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3316:6: ( () ( (lv_value_11_0= ruleBool ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3316:7: () ( (lv_value_11_0= ruleBool ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3316:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3317:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getLiteralBoolAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3322:2: ( (lv_value_11_0= ruleBool ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3323:1: (lv_value_11_0= ruleBool )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3323:1: (lv_value_11_0= ruleBool )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3324:3: lv_value_11_0= ruleBool
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getValueBoolParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBool_in_ruleAtom7994);
                    lv_value_11_0=ruleBool();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_11_0, 
                              		"Bool");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3341:6: ( () ( (lv_value_13_0= ruleVector ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3341:6: ( () ( (lv_value_13_0= ruleVector ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3341:7: () ( (lv_value_13_0= ruleVector ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3341:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3342:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getLiteralVectorAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3347:2: ( (lv_value_13_0= ruleVector ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3348:1: (lv_value_13_0= ruleVector )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3348:1: (lv_value_13_0= ruleVector )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3349:3: lv_value_13_0= ruleVector
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getValueVectorParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVector_in_ruleAtom8032);
                    lv_value_13_0=ruleVector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_13_0, 
                              		"Vector");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3366:6: ( () ( (lv_value_15_0= RULE_STRING ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3366:6: ( () ( (lv_value_15_0= RULE_STRING ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3366:7: () ( (lv_value_15_0= RULE_STRING ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3366:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3367:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getLiteralStringAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3372:2: ( (lv_value_15_0= RULE_STRING ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3373:1: (lv_value_15_0= RULE_STRING )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3373:1: (lv_value_15_0= RULE_STRING )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3374:3: lv_value_15_0= RULE_STRING
                    {
                    lv_value_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtom8066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_15_0, grammarAccess.getAtomAccess().getValueSTRINGTerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_15_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleCall"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3398:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3399:2: (iv_ruleCall= ruleCall EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3400:2: iv_ruleCall= ruleCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallRule()); 
            }
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall8108);
            iv_ruleCall=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall8118); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3407:1: ruleCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_args_2_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3410:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3411:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3411:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3411:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3411:2: ( (otherlv_0= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3412:1: (otherlv_0= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3412:1: (otherlv_0= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3413:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCall8163); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getCallAccess().getFunctionFunDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleCall8175); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3428:1: ( (lv_args_2_0= ruleArguments ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_INT && LA39_0<=RULE_STRING)||(LA39_0>=12 && LA39_0<=13)||(LA39_0>=15 && LA39_0<=18)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3429:1: (lv_args_2_0= ruleArguments )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3429:1: (lv_args_2_0= ruleArguments )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3430:3: lv_args_2_0= ruleArguments
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCallAccess().getArgsArgumentsParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArguments_in_ruleCall8196);
                    lv_args_2_0=ruleArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCallRule());
                      	        }
                             		set(
                             			current, 
                             			"args",
                              		lv_args_2_0, 
                              		"Arguments");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCall8209); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCallAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleArguments"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3458:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3459:2: (iv_ruleArguments= ruleArguments EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3460:2: iv_ruleArguments= ruleArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentsRule()); 
            }
            pushFollow(FOLLOW_ruleArguments_in_entryRuleArguments8245);
            iv_ruleArguments=ruleArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArguments; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArguments8255); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3467:1: ruleArguments returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3470:28: ( ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3471:1: ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3471:1: ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3471:2: ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3471:2: ( (lv_expressions_0_0= ruleExpression ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3472:1: (lv_expressions_0_0= ruleExpression )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3472:1: (lv_expressions_0_0= ruleExpression )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3473:3: lv_expressions_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleArguments8301);
            lv_expressions_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArgumentsRule());
              	        }
                     		add(
                     			current, 
                     			"expressions",
                      		lv_expressions_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3489:2: (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==19) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3489:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleArguments8314); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getArgumentsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3493:1: ( (lv_expressions_2_0= ruleExpression ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3494:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3494:1: (lv_expressions_2_0= ruleExpression )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3495:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleArguments8335);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArgumentsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArguments"

    // $ANTLR start synpred1_InternalXS
    public final void synpred1_InternalXS_fragment() throws RecognitionException {   
        // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1849:4: ( 'else' )
        // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1849:6: 'else'
        {
        match(input,43,FOLLOW_43_in_synpred1_InternalXS4648); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalXS

    // Delegated rules

    public final boolean synpred1_InternalXS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalXS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA38 dfa38 = new DFA38(this);
    static final String DFA2_eotS =
        "\14\uffff";
    static final String DFA2_eofS =
        "\14\uffff";
    static final String DFA2_minS =
        "\2\21\1\uffff\5\5\3\uffff\1\22";
    static final String DFA2_maxS =
        "\2\47\1\uffff\5\5\3\uffff\1\25";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\5\uffff\1\2\1\3\1\4\1\uffff";
    static final String DFA2_specialS =
        "\14\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\6\4\uffff\1\11\1\12\7\uffff\1\1\2\2\1\10\1\3\1\4\1\5\1\7"+
            "\1\10",
            "\1\6\15\uffff\1\1\2\2\1\10\1\3\1\4\1\5\1\7\1\10",
            "",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "",
            "",
            "",
            "\1\10\2\uffff\1\2"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "119:1: ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_FunDeclaration_2= ruleFunDeclaration | (this_IncludeStatement_3= ruleIncludeStatement otherlv_4= ';' ) | this_RuleDeclaration_5= ruleRuleDeclaration )";
        }
    }
    static final String DFA38_eotS =
        "\15\uffff";
    static final String DFA38_eofS =
        "\2\uffff\1\12\2\uffff\1\14\7\uffff";
    static final String DFA38_minS =
        "\1\4\1\uffff\1\13\2\4\1\13\7\uffff";
    static final String DFA38_maxS =
        "\1\22\1\uffff\1\101\2\4\1\101\7\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\4\uffff\1\6\1\7\1\10\1\3\1\2\1\5\1\4";
    static final String DFA38_specialS =
        "\15\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\5\1\2\1\10\5\uffff\1\3\1\4\1\uffff\2\6\1\7\1\1",
            "",
            "\3\12\4\uffff\1\11\2\12\42\uffff\13\12",
            "\1\5",
            "\1\5",
            "\3\14\1\13\4\uffff\2\14\42\uffff\13\14",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "3195:1: ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | ( (lv_expression_4_0= ruleVar ) ) | ( (lv_expression_5_0= ruleCall ) ) | ( () ( (lv_value_7_0= ruleSignedInt ) ) ) | ( () ( (lv_value_9_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_11_0= ruleBool ) ) ) | ( () ( (lv_value_13_0= ruleVector ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleProgram130 = new BitSet(new long[]{0x000000FF80C20002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleDeclaration224 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDeclaration235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunDeclaration_in_ruleDeclaration264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeStatement_in_ruleDeclaration292 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDeclaration303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDeclaration_in_ruleDeclaration332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSign_in_entryRuleSign368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSign379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSign417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSign436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_entryRuleSignedInt477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInt488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSign_in_ruleSignedInt536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedInt558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedFloat_in_entryRuleSignedFloat604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedFloat615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSign_in_ruleSignedFloat663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedFloat685 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSignedFloat703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedFloat718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNum_in_entryRuleSignedNum764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNum775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_ruleSignedNum822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedFloat_in_ruleSignedNum855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantNum_in_entryRuleConstantNum900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantNum910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantNum954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralOrConstantNum_in_entryRuleLiteralOrConstantNum989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralOrConstantNum999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNum_in_ruleLiteralOrConstantNum1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantNum_in_ruleLiteralOrConstantNum1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_entryRuleBool1114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBool1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBool1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_entryRuleVector1222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVector1269 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVector1281 = new BitSet(new long[]{0x0000000000003030L});
    public static final BitSet FOLLOW_ruleLiteralOrConstantNum_in_ruleVector1302 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVector1314 = new BitSet(new long[]{0x0000000000003030L});
    public static final BitSet FOLLOW_ruleLiteralOrConstantNum_in_ruleVector1335 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVector1347 = new BitSet(new long[]{0x0000000000003030L});
    public static final BitSet FOLLOW_ruleLiteralOrConstantNum_in_ruleVector1368 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVector1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration1416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclaration1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarModifier_in_ruleVarDeclaration1472 = new BitSet(new long[]{0x0000007B80020000L});
    public static final BitSet FOLLOW_ruleVarTypeSpecifier_in_ruleVarDeclaration1493 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDeclaration1510 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVarDeclaration1527 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVarDeclaration1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForVarDeclaration_in_entryRuleForVarDeclaration1584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForVarDeclaration1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForVarDeclaration1636 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleForVarDeclaration1653 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForVarDeclaration1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunDeclaration_in_entryRuleFunDeclaration1710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunDeclaration1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunModifier_in_ruleFunDeclaration1766 = new BitSet(new long[]{0x000000FF80020000L});
    public static final BitSet FOLLOW_ruleFunTypeSpecifier_in_ruleFunDeclaration1787 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunDeclaration1804 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunDeclaration1821 = new BitSet(new long[]{0x000000FB80120000L});
    public static final BitSet FOLLOW_ruleParams_in_ruleFunDeclaration1842 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFunDeclaration1855 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleFunDeclaration1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeStatement_in_entryRuleIncludeStatement1912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeStatement1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleIncludeStatement1959 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludeStatement1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDeclaration_in_entryRuleRuleDeclaration2017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleDeclaration2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleRuleDeclaration2064 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleDeclaration2081 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_24_in_ruleRuleDeclaration2151 = new BitSet(new long[]{0x000001007F000000L});
    public static final BitSet FOLLOW_25_in_ruleRuleDeclaration2180 = new BitSet(new long[]{0x000001007F000000L});
    public static final BitSet FOLLOW_26_in_ruleRuleDeclaration2268 = new BitSet(new long[]{0x000001007F000000L});
    public static final BitSet FOLLOW_27_in_ruleRuleDeclaration2353 = new BitSet(new long[]{0x000001007F000000L});
    public static final BitSet FOLLOW_28_in_ruleRuleDeclaration2433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleDeclaration2450 = new BitSet(new long[]{0x000001007F000000L});
    public static final BitSet FOLLOW_29_in_ruleRuleDeclaration2523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRuleDeclaration2540 = new BitSet(new long[]{0x000001007F000000L});
    public static final BitSet FOLLOW_30_in_ruleRuleDeclaration2613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRuleDeclaration2630 = new BitSet(new long[]{0x000001007F000000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleRuleDeclaration2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarModifier_in_entryRuleVarModifier2739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarModifier2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleVarModifier2836 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_32_in_ruleVarModifier2921 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_33_in_ruleVarModifier3006 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_ruleFunModifier_in_entryRuleFunModifier3094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunModifier3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFunModifier3191 = new BitSet(new long[]{0x0000000480000002L});
    public static final BitSet FOLLOW_34_in_ruleFunModifier3276 = new BitSet(new long[]{0x0000000480000002L});
    public static final BitSet FOLLOW_ruleVarTypeSpecifier_in_entryRuleVarTypeSpecifier3365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarTypeSpecifier3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleVarTypeSpecifier3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVarTypeSpecifier3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleVarTypeSpecifier3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVarTypeSpecifier3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVarTypeSpecifier3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunTypeSpecifier_in_entryRuleFunTypeSpecifier3531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunTypeSpecifier3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFunTypeSpecifier3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarTypeSpecifier_in_ruleFunTypeSpecifier3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParams_in_entryRuleParams3653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParams3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleParams3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleParams3747 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleParams3760 = new BitSet(new long[]{0x0000007B80020000L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleParams3781 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement3820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStatement3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCompoundStatement3876 = new BitSet(new long[]{0x001C777B8007B870L});
    public static final BitSet FOLLOW_ruleVarDeclarationOrStatement_in_ruleCompoundStatement3897 = new BitSet(new long[]{0x001C777B8007B870L});
    public static final BitSet FOLLOW_41_in_ruleCompoundStatement3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclarationOrStatement_in_entryRuleVarDeclarationOrStatement3946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclarationOrStatement3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleVarDeclarationOrStatement4004 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleVarDeclarationOrStatement4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleVarDeclarationOrStatement4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement4079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionStatement_in_ruleStatement4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleStatement4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseStatement_in_ruleStatement4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_ruleStatement4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_ruleStatement4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_ruleStatement4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_ruleStatement4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinueStatement_in_ruleStatement4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakStatement_in_ruleStatement4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionStatement_in_entryRuleExpressionStatement4387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionStatement4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionStatement4444 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleExpressionStatement4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleExpressionStatement4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseStatement_in_entryRuleIfElseStatement4522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfElseStatement4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleIfElseStatement4569 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIfElseStatement4581 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfElseStatement4602 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIfElseStatement4614 = new BitSet(new long[]{0x001C757B8007B870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfElseStatement4635 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleIfElseStatement4656 = new BitSet(new long[]{0x001C757B8007B870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfElseStatement4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement4716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileStatement4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleWhileStatement4763 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleWhileStatement4775 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhileStatement4796 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleWhileStatement4808 = new BitSet(new long[]{0x001C757B8007B870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhileStatement4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_entryRuleForStatement4865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForStatement4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleForStatement4912 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleForStatement4924 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleForVarDeclaration_in_ruleForStatement4945 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleForStatement4957 = new BitSet(new long[]{0x7800000000000000L});
    public static final BitSet FOLLOW_ruleRelOp_in_ruleForStatement4978 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForStatement4999 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleForStatement5011 = new BitSet(new long[]{0x001C757B8007B870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleForStatement5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement5068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchStatement5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSwitchStatement5115 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSwitchStatement5127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSwitchStatement5147 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSwitchStatement5159 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSwitchStatement5171 = new BitSet(new long[]{0x0002820000000000L});
    public static final BitSet FOLLOW_ruleSwitchCase_in_ruleSwitchStatement5192 = new BitSet(new long[]{0x0002820000000000L});
    public static final BitSet FOLLOW_ruleSwitchDefault_in_ruleSwitchStatement5214 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSwitchStatement5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase5263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchCase5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleSwitchCase5310 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_ruleSignedInt_in_ruleSwitchCase5331 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleSwitchCase5343 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSwitchCase5355 = new BitSet(new long[]{0x001C757B8007B870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSwitchCase5376 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSwitchCase5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchDefault_in_entryRuleSwitchDefault5424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchDefault5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleSwitchDefault5471 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleSwitchDefault5483 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSwitchDefault5495 = new BitSet(new long[]{0x001C757B8007B870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSwitchDefault5516 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSwitchDefault5528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement5564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleReturnStatement5620 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_18_in_ruleReturnStatement5633 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStatement5654 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleReturnStatement5666 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleReturnStatement5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinueStatement_in_entryRuleContinueStatement5716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContinueStatement5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleContinueStatement5772 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleContinueStatement5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakStatement_in_entryRuleBreakStatement5820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakStatement5830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBreakStatement5876 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBreakStatement5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostFixOp_in_entryRulePostFixOp5925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostFixOp5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePostFixOp5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePostFixOp5993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleExpression6100 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExpression6112 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression6133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleExpression6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression6198 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_rulePostFixOp_in_ruleExpression6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar6256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar6310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression6345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpression6355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleSimpleExpression6402 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleSimpleExpression6429 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleSimpleExpression6463 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression6501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsExpression_in_ruleAndExpression6558 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleAndExpression6585 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleEqualsExpression_in_ruleAndExpression6619 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleEqualsExpression_in_entryRuleEqualsExpression6657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsExpression6667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualsExpression6714 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_ruleEqOp_in_ruleEqualsExpression6744 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualsExpression6765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqOp_in_entryRuleEqOp6804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqOp6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEqOp6853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleEqOp6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression6912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleComparisonExpression6969 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_ruleRelOp_in_ruleComparisonExpression6999 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleComparisonExpression7020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelOp_in_entryRuleRelOp7059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelOp7070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleRelOp7108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleRelOp7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleRelOp7146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRelOp7165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression7205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression7215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7262 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_ruleAddOp_in_ruleAdditiveExpression7292 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7313 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_ruleAddOp_in_entryRuleAddOp7352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddOp7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAddOp7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleAddOp7420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression7460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleMultiplicativeExpression7517 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMulOp_in_ruleMultiplicativeExpression7547 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleMultiplicativeExpression7568 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMulOp_in_entryRuleMulOp7607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOp7618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleMulOp7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleMulOp7675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleMulOp7694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom7734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom7744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAtom7792 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAtom7813 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAtom7825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleAtom7854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleAtom7881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_ruleAtom7918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedFloat_in_ruleAtom7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_ruleAtom7994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_ruleAtom8032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtom8066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall8108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall8118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCall8163 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCall8175 = new BitSet(new long[]{0x000000000017B070L});
    public static final BitSet FOLLOW_ruleArguments_in_ruleCall8196 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCall8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_entryRuleArguments8245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArguments8255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArguments8301 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleArguments8314 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArguments8335 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_43_in_synpred1_InternalXS4648 = new BitSet(new long[]{0x0000000000000002L});

}
