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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:880:1: ruleRuleDeclaration returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_13_0= ruleCompoundStatement ) ) ) ;
    public final EObject ruleRuleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_active_3_0=null;
        Token otherlv_4=null;
        Token lv_runImmediately_5_0=null;
        Token lv_highFrequency_6_0=null;
        Token otherlv_7=null;
        Token lv_group_8_0=null;
        Token otherlv_9=null;
        Token lv_minInterval_10_0=null;
        Token otherlv_11=null;
        Token lv_maxInterval_12_0=null;
        EObject lv_statements_13_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:883:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_13_0= ruleCompoundStatement ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:884:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_13_0= ruleCompoundStatement ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:884:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_13_0= ruleCompoundStatement ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:884:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_13_0= ruleCompoundStatement ) )
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

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:906:2: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:908:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:908:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:909:2: ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2());
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:912:2: ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:913:3: ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:913:3: ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:915:4: ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:915:4: ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:916:5: {...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:916:112: ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:917:6: ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 0);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:920:6: ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:920:7: {...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:920:16: ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' )
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
            	            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:920:17: ( (lv_active_3_0= 'active' ) )
            	            {
            	            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:920:17: ( (lv_active_3_0= 'active' ) )
            	            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:921:1: (lv_active_3_0= 'active' )
            	            {
            	            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:921:1: (lv_active_3_0= 'active' )
            	            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:922:3: lv_active_3_0= 'active'
            	            {
            	            lv_active_3_0=(Token)match(input,24,FOLLOW_24_in_ruleRuleDeclaration2150); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_active_3_0, grammarAccess.getRuleDeclarationAccess().getActiveActiveKeyword_2_0_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
            	              	        }
            	                     		setWithLastConsumed(current, "active", true, "active");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:936:7: otherlv_4= 'inactive'
            	            {
            	            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleRuleDeclaration2181); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getRuleDeclarationAccess().getInactiveKeyword_2_0_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:947:4: ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:947:4: ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:948:5: {...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:948:112: ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:949:6: ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 1);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:952:6: ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:952:7: {...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:952:16: ( (lv_runImmediately_5_0= 'runImmediately' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:953:1: (lv_runImmediately_5_0= 'runImmediately' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:953:1: (lv_runImmediately_5_0= 'runImmediately' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:954:3: lv_runImmediately_5_0= 'runImmediately'
            	    {
            	    lv_runImmediately_5_0=(Token)match(input,26,FOLLOW_26_in_ruleRuleDeclaration2254); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_runImmediately_5_0, grammarAccess.getRuleDeclarationAccess().getRunImmediatelyRunImmediatelyKeyword_2_1_0());
            	          
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:974:4: ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:974:4: ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:975:5: {...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:975:112: ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:976:6: ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 2);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:979:6: ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:979:7: {...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:979:16: ( (lv_highFrequency_6_0= 'highFrequency' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:980:1: (lv_highFrequency_6_0= 'highFrequency' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:980:1: (lv_highFrequency_6_0= 'highFrequency' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:981:3: lv_highFrequency_6_0= 'highFrequency'
            	    {
            	    lv_highFrequency_6_0=(Token)match(input,27,FOLLOW_27_in_ruleRuleDeclaration2339); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_highFrequency_6_0, grammarAccess.getRuleDeclarationAccess().getHighFrequencyHighFrequencyKeyword_2_2_0());
            	          
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1001:4: ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1001:4: ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1002:5: {...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1002:112: ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1003:6: ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 3);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1006:6: ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1006:7: {...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1006:16: (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1006:18: otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleRuleDeclaration2419); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getRuleDeclarationAccess().getGroupKeyword_2_3_0());
            	          
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1010:1: ( (lv_group_8_0= RULE_ID ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1011:1: (lv_group_8_0= RULE_ID )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1011:1: (lv_group_8_0= RULE_ID )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1012:3: lv_group_8_0= RULE_ID
            	    {
            	    lv_group_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleDeclaration2436); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_group_8_0, grammarAccess.getRuleDeclarationAccess().getGroupIDTerminalRuleCall_2_3_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"group",
            	              		lv_group_8_0, 
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1035:4: ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1035:4: ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1036:5: {...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1036:112: ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1037:6: ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 4);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1040:6: ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1040:7: {...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1040:16: (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1040:18: otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) )
            	    {
            	    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleRuleDeclaration2509); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getRuleDeclarationAccess().getMinIntervalKeyword_2_4_0());
            	          
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1044:1: ( (lv_minInterval_10_0= RULE_INT ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1045:1: (lv_minInterval_10_0= RULE_INT )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1045:1: (lv_minInterval_10_0= RULE_INT )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1046:3: lv_minInterval_10_0= RULE_INT
            	    {
            	    lv_minInterval_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRuleDeclaration2526); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_minInterval_10_0, grammarAccess.getRuleDeclarationAccess().getMinIntervalINTTerminalRuleCall_2_4_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"minInterval",
            	              		lv_minInterval_10_0, 
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1069:4: ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1069:4: ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1070:5: {...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1070:112: ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1071:6: ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 5);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1074:6: ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1074:7: {...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1074:16: (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1074:18: otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) )
            	    {
            	    otherlv_11=(Token)match(input,30,FOLLOW_30_in_ruleRuleDeclaration2599); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getRuleDeclarationAccess().getMaxIntervalKeyword_2_5_0());
            	          
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1078:1: ( (lv_maxInterval_12_0= RULE_INT ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1079:1: (lv_maxInterval_12_0= RULE_INT )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1079:1: (lv_maxInterval_12_0= RULE_INT )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1080:3: lv_maxInterval_12_0= RULE_INT
            	    {
            	    lv_maxInterval_12_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRuleDeclaration2616); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_maxInterval_12_0, grammarAccess.getRuleDeclarationAccess().getMaxIntervalINTTerminalRuleCall_2_5_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"maxInterval",
            	              		lv_maxInterval_12_0, 
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

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1111:2: ( (lv_statements_13_0= ruleCompoundStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1112:1: (lv_statements_13_0= ruleCompoundStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1112:1: (lv_statements_13_0= ruleCompoundStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1113:3: lv_statements_13_0= ruleCompoundStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleDeclarationAccess().getStatementsCompoundStatementParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCompoundStatement_in_ruleRuleDeclaration2689);
            lv_statements_13_0=ruleCompoundStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRuleDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"statements",
                      		lv_statements_13_0, 
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1137:1: entryRuleVarModifier returns [EObject current=null] : iv_ruleVarModifier= ruleVarModifier EOF ;
    public final EObject entryRuleVarModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarModifier = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1138:2: (iv_ruleVarModifier= ruleVarModifier EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1139:2: iv_ruleVarModifier= ruleVarModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarModifierRule()); 
            }
            pushFollow(FOLLOW_ruleVarModifier_in_entryRuleVarModifier2725);
            iv_ruleVarModifier=ruleVarModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarModifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarModifier2735); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1146:1: ruleVarModifier returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleVarModifier() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_const_2_0=null;
        Token lv_extern_3_0=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1149:28: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1150:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1150:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1152:1: ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1152:1: ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1153:2: ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getVarModifierAccess().getUnorderedGroup());
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1156:2: ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1157:3: ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )*
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1157:3: ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )*
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1159:4: ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1159:4: ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1160:5: {...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1160:106: ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1161:6: ({...}? => ( (lv_static_1_0= 'static' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 0);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1164:6: ({...}? => ( (lv_static_1_0= 'static' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1164:7: {...}? => ( (lv_static_1_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1164:16: ( (lv_static_1_0= 'static' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1165:1: (lv_static_1_0= 'static' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1165:1: (lv_static_1_0= 'static' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1166:3: lv_static_1_0= 'static'
            	    {
            	    lv_static_1_0=(Token)match(input,31,FOLLOW_31_in_ruleVarModifier2822); if (state.failed) return current;
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1186:4: ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1186:4: ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1187:5: {...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1187:106: ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1188:6: ({...}? => ( (lv_const_2_0= 'const' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 1);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1191:6: ({...}? => ( (lv_const_2_0= 'const' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1191:7: {...}? => ( (lv_const_2_0= 'const' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1191:16: ( (lv_const_2_0= 'const' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1192:1: (lv_const_2_0= 'const' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1192:1: (lv_const_2_0= 'const' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1193:3: lv_const_2_0= 'const'
            	    {
            	    lv_const_2_0=(Token)match(input,32,FOLLOW_32_in_ruleVarModifier2907); if (state.failed) return current;
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1213:4: ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1213:4: ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1214:5: {...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1214:106: ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1215:6: ({...}? => ( (lv_extern_3_0= 'extern' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 2);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1218:6: ({...}? => ( (lv_extern_3_0= 'extern' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1218:7: {...}? => ( (lv_extern_3_0= 'extern' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1218:16: ( (lv_extern_3_0= 'extern' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1219:1: (lv_extern_3_0= 'extern' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1219:1: (lv_extern_3_0= 'extern' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1220:3: lv_extern_3_0= 'extern'
            	    {
            	    lv_extern_3_0=(Token)match(input,33,FOLLOW_33_in_ruleVarModifier2992); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1255:1: entryRuleFunModifier returns [EObject current=null] : iv_ruleFunModifier= ruleFunModifier EOF ;
    public final EObject entryRuleFunModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunModifier = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1256:2: (iv_ruleFunModifier= ruleFunModifier EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1257:2: iv_ruleFunModifier= ruleFunModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunModifierRule()); 
            }
            pushFollow(FOLLOW_ruleFunModifier_in_entryRuleFunModifier3080);
            iv_ruleFunModifier=ruleFunModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunModifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunModifier3090); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1264:1: ruleFunModifier returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleFunModifier() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_mutable_2_0=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1267:28: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1268:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1268:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1270:1: ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1270:1: ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1271:2: ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getFunModifierAccess().getUnorderedGroup());
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1274:2: ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1275:3: ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )*
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1275:3: ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )*
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1277:4: ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1277:4: ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1278:5: {...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleFunModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1278:106: ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1279:6: ({...}? => ( (lv_static_1_0= 'static' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 0);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1282:6: ({...}? => ( (lv_static_1_0= 'static' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1282:7: {...}? => ( (lv_static_1_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleFunModifier", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1282:16: ( (lv_static_1_0= 'static' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1283:1: (lv_static_1_0= 'static' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1283:1: (lv_static_1_0= 'static' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1284:3: lv_static_1_0= 'static'
            	    {
            	    lv_static_1_0=(Token)match(input,31,FOLLOW_31_in_ruleFunModifier3177); if (state.failed) return current;
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1304:4: ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1304:4: ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1305:5: {...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleFunModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1305:106: ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1306:6: ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 1);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1309:6: ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1309:7: {...}? => ( (lv_mutable_2_0= 'mutable' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleFunModifier", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1309:16: ( (lv_mutable_2_0= 'mutable' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1310:1: (lv_mutable_2_0= 'mutable' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1310:1: (lv_mutable_2_0= 'mutable' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1311:3: lv_mutable_2_0= 'mutable'
            	    {
            	    lv_mutable_2_0=(Token)match(input,34,FOLLOW_34_in_ruleFunModifier3262); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1346:1: entryRuleVarTypeSpecifier returns [String current=null] : iv_ruleVarTypeSpecifier= ruleVarTypeSpecifier EOF ;
    public final String entryRuleVarTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarTypeSpecifier = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1347:2: (iv_ruleVarTypeSpecifier= ruleVarTypeSpecifier EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1348:2: iv_ruleVarTypeSpecifier= ruleVarTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleVarTypeSpecifier_in_entryRuleVarTypeSpecifier3351);
            iv_ruleVarTypeSpecifier=ruleVarTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarTypeSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarTypeSpecifier3362); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1355:1: ruleVarTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'float' | kw= 'bool' | kw= 'vector' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken ruleVarTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1358:28: ( (kw= 'int' | kw= 'float' | kw= 'bool' | kw= 'vector' | kw= 'string' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1359:1: (kw= 'int' | kw= 'float' | kw= 'bool' | kw= 'vector' | kw= 'string' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1359:1: (kw= 'int' | kw= 'float' | kw= 'bool' | kw= 'vector' | kw= 'string' )
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1360:2: kw= 'int'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleVarTypeSpecifier3400); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarTypeSpecifierAccess().getIntKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1367:2: kw= 'float'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleVarTypeSpecifier3419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarTypeSpecifierAccess().getFloatKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1374:2: kw= 'bool'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleVarTypeSpecifier3438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarTypeSpecifierAccess().getBoolKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1381:2: kw= 'vector'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleVarTypeSpecifier3457); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarTypeSpecifierAccess().getVectorKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1388:2: kw= 'string'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleVarTypeSpecifier3476); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1401:1: entryRuleFunTypeSpecifier returns [String current=null] : iv_ruleFunTypeSpecifier= ruleFunTypeSpecifier EOF ;
    public final String entryRuleFunTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunTypeSpecifier = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1402:2: (iv_ruleFunTypeSpecifier= ruleFunTypeSpecifier EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1403:2: iv_ruleFunTypeSpecifier= ruleFunTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleFunTypeSpecifier_in_entryRuleFunTypeSpecifier3517);
            iv_ruleFunTypeSpecifier=ruleFunTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunTypeSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunTypeSpecifier3528); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1410:1: ruleFunTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | this_VarTypeSpecifier_1= ruleVarTypeSpecifier ) ;
    public final AntlrDatatypeRuleToken ruleFunTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_VarTypeSpecifier_1 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1413:28: ( (kw= 'void' | this_VarTypeSpecifier_1= ruleVarTypeSpecifier ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1414:1: (kw= 'void' | this_VarTypeSpecifier_1= ruleVarTypeSpecifier )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1414:1: (kw= 'void' | this_VarTypeSpecifier_1= ruleVarTypeSpecifier )
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1415:2: kw= 'void'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleFunTypeSpecifier3566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunTypeSpecifierAccess().getVoidKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1422:5: this_VarTypeSpecifier_1= ruleVarTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunTypeSpecifierAccess().getVarTypeSpecifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarTypeSpecifier_in_ruleFunTypeSpecifier3594);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1440:1: entryRuleParams returns [EObject current=null] : iv_ruleParams= ruleParams EOF ;
    public final EObject entryRuleParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParams = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1441:2: (iv_ruleParams= ruleParams EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1442:2: iv_ruleParams= ruleParams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamsRule()); 
            }
            pushFollow(FOLLOW_ruleParams_in_entryRuleParams3639);
            iv_ruleParams=ruleParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParams; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParams3649); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1449:1: ruleParams returns [EObject current=null] : ( ( (lv_param_0_0= 'void' ) ) | ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* ) ) ;
    public final EObject ruleParams() throws RecognitionException {
        EObject current = null;

        Token lv_param_0_0=null;
        Token otherlv_2=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1452:28: ( ( ( (lv_param_0_0= 'void' ) ) | ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1453:1: ( ( (lv_param_0_0= 'void' ) ) | ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1453:1: ( ( (lv_param_0_0= 'void' ) ) | ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* ) )
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1453:2: ( (lv_param_0_0= 'void' ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1453:2: ( (lv_param_0_0= 'void' ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1454:1: (lv_param_0_0= 'void' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1454:1: (lv_param_0_0= 'void' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1455:3: lv_param_0_0= 'void'
                    {
                    lv_param_0_0=(Token)match(input,39,FOLLOW_39_in_ruleParams3692); if (state.failed) return current;
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1469:6: ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1469:6: ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1469:7: ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )*
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1469:7: ( (lv_params_1_0= ruleVarDeclaration ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1470:1: (lv_params_1_0= ruleVarDeclaration )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1470:1: (lv_params_1_0= ruleVarDeclaration )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1471:3: lv_params_1_0= ruleVarDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParamsAccess().getParamsVarDeclarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarDeclaration_in_ruleParams3733);
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

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1487:2: (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==19) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1487:4: otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) )
                    	    {
                    	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleParams3746); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getParamsAccess().getCommaKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1491:1: ( (lv_params_3_0= ruleVarDeclaration ) )
                    	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1492:1: (lv_params_3_0= ruleVarDeclaration )
                    	    {
                    	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1492:1: (lv_params_3_0= ruleVarDeclaration )
                    	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1493:3: lv_params_3_0= ruleVarDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getParamsAccess().getParamsVarDeclarationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVarDeclaration_in_ruleParams3767);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1517:1: entryRuleCompoundStatement returns [EObject current=null] : iv_ruleCompoundStatement= ruleCompoundStatement EOF ;
    public final EObject entryRuleCompoundStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1518:2: (iv_ruleCompoundStatement= ruleCompoundStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1519:2: iv_ruleCompoundStatement= ruleCompoundStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompoundStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement3806);
            iv_ruleCompoundStatement=ruleCompoundStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompoundStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStatement3816); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1526:1: ruleCompoundStatement returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleCompoundStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_contents_2_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1529:28: ( ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1530:1: ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1530:1: ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1530:2: () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1530:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1531:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCompoundStatementAccess().getCompoundStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleCompoundStatement3862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCompoundStatementAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1540:1: ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_INT && LA18_0<=RULE_STRING)||(LA18_0>=11 && LA18_0<=13)||(LA18_0>=15 && LA18_0<=18)||(LA18_0>=31 && LA18_0<=33)||(LA18_0>=35 && LA18_0<=38)||LA18_0==40||LA18_0==42||(LA18_0>=44 && LA18_0<=46)||(LA18_0>=50 && LA18_0<=52)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1541:1: (lv_contents_2_0= ruleVarDeclarationOrStatement )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1541:1: (lv_contents_2_0= ruleVarDeclarationOrStatement )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1542:3: lv_contents_2_0= ruleVarDeclarationOrStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompoundStatementAccess().getContentsVarDeclarationOrStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVarDeclarationOrStatement_in_ruleCompoundStatement3883);
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

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleCompoundStatement3896); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1570:1: entryRuleVarDeclarationOrStatement returns [EObject current=null] : iv_ruleVarDeclarationOrStatement= ruleVarDeclarationOrStatement EOF ;
    public final EObject entryRuleVarDeclarationOrStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclarationOrStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1571:2: (iv_ruleVarDeclarationOrStatement= ruleVarDeclarationOrStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1572:2: iv_ruleVarDeclarationOrStatement= ruleVarDeclarationOrStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclarationOrStatementRule()); 
            }
            pushFollow(FOLLOW_ruleVarDeclarationOrStatement_in_entryRuleVarDeclarationOrStatement3932);
            iv_ruleVarDeclarationOrStatement=ruleVarDeclarationOrStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDeclarationOrStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclarationOrStatement3942); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1579:1: ruleVarDeclarationOrStatement returns [EObject current=null] : ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_Statement_2= ruleStatement ) ;
    public final EObject ruleVarDeclarationOrStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_VarDeclaration_0 = null;

        EObject this_Statement_2 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1582:28: ( ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_Statement_2= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1583:1: ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_Statement_2= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1583:1: ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_Statement_2= ruleStatement )
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1583:2: (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1583:2: (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1584:5: this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarDeclarationOrStatementAccess().getVarDeclarationParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarDeclaration_in_ruleVarDeclarationOrStatement3990);
                    this_VarDeclaration_0=ruleVarDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VarDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleVarDeclarationOrStatement4001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVarDeclarationOrStatementAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1598:5: this_Statement_2= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarDeclarationOrStatementAccess().getStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleVarDeclarationOrStatement4030);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1614:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1615:2: (iv_ruleStatement= ruleStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1616:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement4065);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement4075); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1623:1: ruleStatement returns [EObject current=null] : (this_ExpressionStatement_0= ruleExpressionStatement | this_CompoundStatement_1= ruleCompoundStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement ) ;
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
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1626:28: ( (this_ExpressionStatement_0= ruleExpressionStatement | this_CompoundStatement_1= ruleCompoundStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1627:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_CompoundStatement_1= ruleCompoundStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1627:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_CompoundStatement_1= ruleCompoundStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement )
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1628:5: this_ExpressionStatement_0= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExpressionStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionStatement_in_ruleStatement4122);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1638:5: this_CompoundStatement_1= ruleCompoundStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getCompoundStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompoundStatement_in_ruleStatement4149);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1648:5: this_IfElseStatement_2= ruleIfElseStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfElseStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfElseStatement_in_ruleStatement4176);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1658:5: this_WhileStatement_3= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhileStatement_in_ruleStatement4203);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1668:5: this_ForStatement_4= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForStatement_in_ruleStatement4230);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1678:5: this_SwitchStatement_5= ruleSwitchStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSwitchStatement_in_ruleStatement4257);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1688:5: this_ReturnStatement_6= ruleReturnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturnStatement_in_ruleStatement4284);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1698:5: this_ContinueStatement_7= ruleContinueStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getContinueStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContinueStatement_in_ruleStatement4311);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1708:5: this_BreakStatement_8= ruleBreakStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getBreakStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBreakStatement_in_ruleStatement4338);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1724:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1725:2: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1726:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionStatementRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionStatement_in_entryRuleExpressionStatement4373);
            iv_ruleExpressionStatement=ruleExpressionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionStatement4383); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1733:1: ruleExpressionStatement returns [EObject current=null] : ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) | ( () otherlv_3= ';' ) ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1736:28: ( ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) | ( () otherlv_3= ';' ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1737:1: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) | ( () otherlv_3= ';' ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1737:1: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) | ( () otherlv_3= ';' ) )
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1737:2: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1737:2: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1737:3: ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';'
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1737:3: ( (lv_expression_0_0= ruleExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1738:1: (lv_expression_0_0= ruleExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1738:1: (lv_expression_0_0= ruleExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1739:3: lv_expression_0_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionStatementAccess().getExpressionExpressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionStatement4430);
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

                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleExpressionStatement4442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1760:6: ( () otherlv_3= ';' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1760:6: ( () otherlv_3= ';' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1760:7: () otherlv_3= ';'
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1760:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1761:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionStatementAccess().getEmptyExpressionStatementAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleExpressionStatement4471); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1778:1: entryRuleIfElseStatement returns [EObject current=null] : iv_ruleIfElseStatement= ruleIfElseStatement EOF ;
    public final EObject entryRuleIfElseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1779:2: (iv_ruleIfElseStatement= ruleIfElseStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1780:2: iv_ruleIfElseStatement= ruleIfElseStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfElseStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIfElseStatement_in_entryRuleIfElseStatement4508);
            iv_ruleIfElseStatement=ruleIfElseStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfElseStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfElseStatement4518); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1787:1: ruleIfElseStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) ;
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
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1790:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1791:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1791:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1791:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleIfElseStatement4555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfElseStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleIfElseStatement4567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfElseStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1799:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1800:1: (lv_condition_2_0= ruleExpression )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1800:1: (lv_condition_2_0= ruleExpression )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1801:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfElseStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfElseStatement4588);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleIfElseStatement4600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfElseStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1821:1: ( (lv_ifStatement_4_0= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1822:1: (lv_ifStatement_4_0= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1822:1: (lv_ifStatement_4_0= ruleStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1823:3: lv_ifStatement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfElseStatementAccess().getIfStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleIfElseStatement4621);
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

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1839:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )?
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1839:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1839:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1839:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleIfElseStatement4642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfElseStatementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1844:2: ( (lv_elseStatement_6_0= ruleStatement ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1845:1: (lv_elseStatement_6_0= ruleStatement )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1845:1: (lv_elseStatement_6_0= ruleStatement )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1846:3: lv_elseStatement_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfElseStatementAccess().getElseStatementStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIfElseStatement4664);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1870:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1871:2: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1872:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement4702);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileStatement4712); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1879:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statement_4_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1882:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1883:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1883:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1883:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleWhileStatement4749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleWhileStatement4761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1891:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1892:1: (lv_condition_2_0= ruleExpression )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1892:1: (lv_condition_2_0= ruleExpression )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1893:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleWhileStatement4782);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleWhileStatement4794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1913:1: ( (lv_statement_4_0= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1914:1: (lv_statement_4_0= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1914:1: (lv_statement_4_0= ruleStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1915:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleWhileStatement4815);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1939:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1940:2: (iv_ruleForStatement= ruleForStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1941:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_ruleForStatement_in_entryRuleForStatement4851);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForStatement4861); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1948:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) ) ;
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
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1951:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1952:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1952:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1952:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleForStatement4898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleForStatement4910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1960:1: ( (lv_var_2_0= ruleForVarDeclaration ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1961:1: (lv_var_2_0= ruleForVarDeclaration )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1961:1: (lv_var_2_0= ruleForVarDeclaration )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1962:3: lv_var_2_0= ruleForVarDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getVarForVarDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForVarDeclaration_in_ruleForStatement4931);
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

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleForStatement4943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1982:1: ( (lv_op_4_0= ruleRelOp ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1983:1: (lv_op_4_0= ruleRelOp )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1983:1: (lv_op_4_0= ruleRelOp )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1984:3: lv_op_4_0= ruleRelOp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getOpRelOpParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRelOp_in_ruleForStatement4964);
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

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2000:2: ( (lv_expression_5_0= ruleExpression ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2001:1: (lv_expression_5_0= ruleExpression )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2001:1: (lv_expression_5_0= ruleExpression )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2002:3: lv_expression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getExpressionExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleForStatement4985);
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

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleForStatement4997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2022:1: ( (lv_statement_7_0= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2023:1: (lv_statement_7_0= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2023:1: (lv_statement_7_0= ruleStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2024:3: lv_statement_7_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getStatementStatementParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleForStatement5018);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2048:1: entryRuleSwitchStatement returns [EObject current=null] : iv_ruleSwitchStatement= ruleSwitchStatement EOF ;
    public final EObject entryRuleSwitchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2049:2: (iv_ruleSwitchStatement= ruleSwitchStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2050:2: iv_ruleSwitchStatement= ruleSwitchStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement5054);
            iv_ruleSwitchStatement=ruleSwitchStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchStatement5064); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2057:1: ruleSwitchStatement returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}' ) ;
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
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2060:28: ( (otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2061:1: (otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2061:1: (otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2061:3: otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleSwitchStatement5101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchStatementAccess().getSwitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSwitchStatement5113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2069:1: ( (otherlv_2= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2070:1: (otherlv_2= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2070:1: (otherlv_2= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2071:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSwitchStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSwitchStatement5133); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getSwitchStatementAccess().getVarVarDeclarationCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSwitchStatement5145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleSwitchStatement5157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitchStatementAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2090:1: ( (lv_cases_5_0= ruleSwitchCase ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==47) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2091:1: (lv_cases_5_0= ruleSwitchCase )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2091:1: (lv_cases_5_0= ruleSwitchCase )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2092:3: lv_cases_5_0= ruleSwitchCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getCasesSwitchCaseParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSwitchCase_in_ruleSwitchStatement5178);
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

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2108:3: ( (lv_default_6_0= ruleSwitchDefault ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2109:1: (lv_default_6_0= ruleSwitchDefault )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2109:1: (lv_default_6_0= ruleSwitchDefault )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2110:3: lv_default_6_0= ruleSwitchDefault
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getDefaultSwitchDefaultParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSwitchDefault_in_ruleSwitchStatement5200);
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

            otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleSwitchStatement5213); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2138:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2139:2: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2140:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase5249);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchCase5259); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2147:1: ruleSwitchCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_var_1_0= ruleSignedInt ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) ) otherlv_5= '}' ) ;
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
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2150:28: ( (otherlv_0= 'case' ( (lv_var_1_0= ruleSignedInt ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) ) otherlv_5= '}' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2151:1: (otherlv_0= 'case' ( (lv_var_1_0= ruleSignedInt ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) ) otherlv_5= '}' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2151:1: (otherlv_0= 'case' ( (lv_var_1_0= ruleSignedInt ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) ) otherlv_5= '}' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2151:3: otherlv_0= 'case' ( (lv_var_1_0= ruleSignedInt ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleSwitchCase5296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchCaseAccess().getCaseKeyword_0());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2155:1: ( (lv_var_1_0= ruleSignedInt ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2156:1: (lv_var_1_0= ruleSignedInt )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2156:1: (lv_var_1_0= ruleSignedInt )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2157:3: lv_var_1_0= ruleSignedInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getVarSignedIntParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignedInt_in_ruleSwitchCase5317);
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

            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleSwitchCase5329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSwitchCaseAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleSwitchCase5341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchCaseAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2181:1: ( (lv_statement_4_0= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2182:1: (lv_statement_4_0= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2182:1: (lv_statement_4_0= ruleStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2183:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleSwitchCase5362);
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

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleSwitchCase5374); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2211:1: entryRuleSwitchDefault returns [EObject current=null] : iv_ruleSwitchDefault= ruleSwitchDefault EOF ;
    public final EObject entryRuleSwitchDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchDefault = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2212:2: (iv_ruleSwitchDefault= ruleSwitchDefault EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2213:2: iv_ruleSwitchDefault= ruleSwitchDefault EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchDefaultRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchDefault_in_entryRuleSwitchDefault5410);
            iv_ruleSwitchDefault=ruleSwitchDefault();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchDefault; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchDefault5420); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2220:1: ruleSwitchDefault returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= ':' otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) ) otherlv_4= '}' ) ;
    public final EObject ruleSwitchDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statement_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2223:28: ( (otherlv_0= 'default' otherlv_1= ':' otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) ) otherlv_4= '}' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2224:1: (otherlv_0= 'default' otherlv_1= ':' otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) ) otherlv_4= '}' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2224:1: (otherlv_0= 'default' otherlv_1= ':' otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) ) otherlv_4= '}' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2224:3: otherlv_0= 'default' otherlv_1= ':' otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleSwitchDefault5457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchDefaultAccess().getDefaultKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleSwitchDefault5469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchDefaultAccess().getColonKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleSwitchDefault5481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSwitchDefaultAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2236:1: ( (lv_statement_3_0= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2237:1: (lv_statement_3_0= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2237:1: (lv_statement_3_0= ruleStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2238:3: lv_statement_3_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchDefaultAccess().getStatementStatementParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleSwitchDefault5502);
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

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleSwitchDefault5514); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2266:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2267:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2268:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement5550);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStatement5560); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2275:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2278:28: ( ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2279:1: ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2279:1: ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2279:2: () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2279:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2280:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleReturnStatement5606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getReturnKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2289:1: (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2289:3: otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleReturnStatement5619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getReturnStatementAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2293:1: ( (lv_expression_3_0= ruleExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2294:1: (lv_expression_3_0= ruleExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2294:1: (lv_expression_3_0= ruleExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2295:3: lv_expression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReturnStatement5640);
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

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleReturnStatement5652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReturnStatementAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleReturnStatement5666); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2327:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2328:2: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2329:2: iv_ruleContinueStatement= ruleContinueStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContinueStatementRule()); 
            }
            pushFollow(FOLLOW_ruleContinueStatement_in_entryRuleContinueStatement5702);
            iv_ruleContinueStatement=ruleContinueStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContinueStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContinueStatement5712); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2336:1: ruleContinueStatement returns [EObject current=null] : ( () otherlv_1= 'continue' otherlv_2= ';' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2339:28: ( ( () otherlv_1= 'continue' otherlv_2= ';' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2340:1: ( () otherlv_1= 'continue' otherlv_2= ';' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2340:1: ( () otherlv_1= 'continue' otherlv_2= ';' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2340:2: () otherlv_1= 'continue' otherlv_2= ';'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2340:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2341:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContinueStatementAccess().getContinueStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleContinueStatement5758); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContinueStatementAccess().getContinueKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleContinueStatement5770); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2362:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2363:2: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2364:2: iv_ruleBreakStatement= ruleBreakStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBreakStatement_in_entryRuleBreakStatement5806);
            iv_ruleBreakStatement=ruleBreakStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakStatement5816); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2371:1: ruleBreakStatement returns [EObject current=null] : ( () otherlv_1= 'break' otherlv_2= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2374:28: ( ( () otherlv_1= 'break' otherlv_2= ';' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2375:1: ( () otherlv_1= 'break' otherlv_2= ';' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2375:1: ( () otherlv_1= 'break' otherlv_2= ';' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2375:2: () otherlv_1= 'break' otherlv_2= ';'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2375:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2376:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBreakStatementAccess().getBreakStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleBreakStatement5862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBreakStatementAccess().getBreakKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleBreakStatement5874); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2397:1: entryRulePostFixOp returns [String current=null] : iv_rulePostFixOp= rulePostFixOp EOF ;
    public final String entryRulePostFixOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePostFixOp = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2398:2: (iv_rulePostFixOp= rulePostFixOp EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2399:2: iv_rulePostFixOp= rulePostFixOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostFixOpRule()); 
            }
            pushFollow(FOLLOW_rulePostFixOp_in_entryRulePostFixOp5911);
            iv_rulePostFixOp=rulePostFixOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostFixOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostFixOp5922); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2406:1: rulePostFixOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' ) ;
    public final AntlrDatatypeRuleToken rulePostFixOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2409:28: ( (kw= '++' | kw= '--' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2410:1: (kw= '++' | kw= '--' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2410:1: (kw= '++' | kw= '--' )
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2411:2: kw= '++'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_rulePostFixOp5960); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPostFixOpAccess().getPlusSignPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2418:2: kw= '--'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_rulePostFixOp5979); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2431:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2432:2: (iv_ruleExpression= ruleExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2433:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6019);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6029); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2440:1: ruleExpression returns [EObject current=null] : ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) | ( (lv_expression_4_0= ruleSimpleExpression ) ) | ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) ) ) ;
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
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2443:28: ( ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) | ( (lv_expression_4_0= ruleSimpleExpression ) ) | ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2444:1: ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) | ( (lv_expression_4_0= ruleSimpleExpression ) ) | ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2444:1: ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) | ( (lv_expression_4_0= ruleSimpleExpression ) ) | ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) ) )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 53:
                case 54:
                    {
                    alt27=3;
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
                case 21:
                    {
                    alt27=1;
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2444:2: ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2444:2: ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2444:3: () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2444:3: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2445:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionAccess().getAssignmentExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2450:2: ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2450:3: ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2450:3: ( (lv_var_1_0= ruleVar ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2451:1: (lv_var_1_0= ruleVar )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2451:1: (lv_var_1_0= ruleVar )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2452:3: lv_var_1_0= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getVarVarParserRuleCall_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVar_in_ruleExpression6086);
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

                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleExpression6098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getEqualsSignKeyword_0_1_1());
                          
                    }
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2472:1: ( (lv_expression_3_0= ruleExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2473:1: (lv_expression_3_0= ruleExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2473:1: (lv_expression_3_0= ruleExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2474:3: lv_expression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_0_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression6119);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2491:6: ( (lv_expression_4_0= ruleSimpleExpression ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2491:6: ( (lv_expression_4_0= ruleSimpleExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2492:1: (lv_expression_4_0= ruleSimpleExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2492:1: (lv_expression_4_0= ruleSimpleExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2493:3: lv_expression_4_0= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionSimpleExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleExpression6148);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2510:6: ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2510:6: ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2510:7: () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2510:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2511:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionAccess().getPostfixExpressionAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2516:2: ( (otherlv_6= RULE_ID ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2517:1: (otherlv_6= RULE_ID )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2517:1: (otherlv_6= RULE_ID )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2518:3: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                              
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression6184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getPostfixVarVarDeclarationCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2529:2: ( (lv_op_7_0= rulePostFixOp ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2530:1: (lv_op_7_0= rulePostFixOp )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2530:1: (lv_op_7_0= rulePostFixOp )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2531:3: lv_op_7_0= rulePostFixOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getOpPostFixOpParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePostFixOp_in_ruleExpression6205);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2555:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2556:2: (iv_ruleVar= ruleVar EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2557:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar6242);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar6252); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2564:1: ruleVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2567:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2568:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2568:1: ( (otherlv_0= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2569:1: (otherlv_0= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2569:1: (otherlv_0= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2570:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVarRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar6296); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2589:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2590:2: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2591:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression6331);
            iv_ruleSimpleExpression=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpression6341); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2598:1: ruleSimpleExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2601:28: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2602:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2602:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2603:5: this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSimpleExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleSimpleExpression6388);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2611:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==55) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2611:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2611:2: ()
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2612:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSimpleExpressionAccess().getSimpleExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2617:2: ( (lv_op_2_0= '||' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2618:1: (lv_op_2_0= '||' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2618:1: (lv_op_2_0= '||' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2619:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,55,FOLLOW_55_in_ruleSimpleExpression6415); if (state.failed) return current;
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

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2632:2: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2633:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2633:1: (lv_right_3_0= ruleAndExpression )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2634:3: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleSimpleExpression6449);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2658:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2659:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2660:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression6487);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression6497); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2667:1: ruleAndExpression returns [EObject current=null] : (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_EqualsExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2670:28: ( (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2671:1: (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2671:1: (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2672:5: this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualsExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEqualsExpression_in_ruleAndExpression6544);
            this_EqualsExpression_0=ruleEqualsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EqualsExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2680:1: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==56) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2680:2: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2680:2: ()
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2681:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2686:2: ( (lv_op_2_0= '&&' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2687:1: (lv_op_2_0= '&&' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2687:1: (lv_op_2_0= '&&' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2688:3: lv_op_2_0= '&&'
            	    {
            	    lv_op_2_0=(Token)match(input,56,FOLLOW_56_in_ruleAndExpression6571); if (state.failed) return current;
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

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2701:2: ( (lv_right_3_0= ruleEqualsExpression ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2702:1: (lv_right_3_0= ruleEqualsExpression )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2702:1: (lv_right_3_0= ruleEqualsExpression )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2703:3: lv_right_3_0= ruleEqualsExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualsExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEqualsExpression_in_ruleAndExpression6605);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2727:1: entryRuleEqualsExpression returns [EObject current=null] : iv_ruleEqualsExpression= ruleEqualsExpression EOF ;
    public final EObject entryRuleEqualsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2728:2: (iv_ruleEqualsExpression= ruleEqualsExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2729:2: iv_ruleEqualsExpression= ruleEqualsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsExpression_in_entryRuleEqualsExpression6643);
            iv_ruleEqualsExpression=ruleEqualsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsExpression6653); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2736:1: ruleEqualsExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? ) ;
    public final EObject ruleEqualsExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2739:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2740:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2740:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2741:5: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEqualsExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparisonExpression_in_ruleEqualsExpression6700);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparisonExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2749:1: ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=57 && LA30_0<=58)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2749:2: () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2749:2: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2750:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEqualsExpressionAccess().getEqualsExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2755:2: ( (lv_op_2_0= ruleEqOp ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2756:1: (lv_op_2_0= ruleEqOp )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2756:1: (lv_op_2_0= ruleEqOp )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2757:3: lv_op_2_0= ruleEqOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualsExpressionAccess().getOpEqOpParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEqOp_in_ruleEqualsExpression6730);
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

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2773:2: ( (lv_right_3_0= ruleComparisonExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2774:1: (lv_right_3_0= ruleComparisonExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2774:1: (lv_right_3_0= ruleComparisonExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2775:3: lv_right_3_0= ruleComparisonExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualsExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComparisonExpression_in_ruleEqualsExpression6751);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2799:1: entryRuleEqOp returns [String current=null] : iv_ruleEqOp= ruleEqOp EOF ;
    public final String entryRuleEqOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqOp = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2800:2: (iv_ruleEqOp= ruleEqOp EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2801:2: iv_ruleEqOp= ruleEqOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqOpRule()); 
            }
            pushFollow(FOLLOW_ruleEqOp_in_entryRuleEqOp6790);
            iv_ruleEqOp=ruleEqOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqOp6801); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2808:1: ruleEqOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2811:28: ( (kw= '==' | kw= '!=' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2812:1: (kw= '==' | kw= '!=' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2812:1: (kw= '==' | kw= '!=' )
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2813:2: kw= '=='
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleEqOp6839); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqOpAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2820:2: kw= '!='
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleEqOp6858); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2833:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2834:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2835:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression6898);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonExpression6908); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2842:1: ruleComparisonExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2845:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2846:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2846:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2847:5: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleComparisonExpression6955);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2855:1: ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=59 && LA32_0<=62)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2855:2: () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2855:2: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2856:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2861:2: ( (lv_op_2_0= ruleRelOp ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2862:1: (lv_op_2_0= ruleRelOp )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2862:1: (lv_op_2_0= ruleRelOp )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2863:3: lv_op_2_0= ruleRelOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOpRelOpParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRelOp_in_ruleComparisonExpression6985);
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

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2879:2: ( (lv_right_3_0= ruleAdditiveExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2880:1: (lv_right_3_0= ruleAdditiveExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2880:1: (lv_right_3_0= ruleAdditiveExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2881:3: lv_right_3_0= ruleAdditiveExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleComparisonExpression7006);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2905:1: entryRuleRelOp returns [String current=null] : iv_ruleRelOp= ruleRelOp EOF ;
    public final String entryRuleRelOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelOp = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2906:2: (iv_ruleRelOp= ruleRelOp EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2907:2: iv_ruleRelOp= ruleRelOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelOpRule()); 
            }
            pushFollow(FOLLOW_ruleRelOp_in_entryRuleRelOp7045);
            iv_ruleRelOp=ruleRelOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelOp7056); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2914:1: ruleRelOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2917:28: ( (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2918:1: (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2918:1: (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' )
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2919:2: kw= '<='
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleRelOp7094); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2926:2: kw= '<'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleRelOp7113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2933:2: kw= '>'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleRelOp7132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2940:2: kw= '>='
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleRelOp7151); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2953:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2954:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2955:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression7191);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression7201); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2962:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2965:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2966:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2966:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2967:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7248);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2975:1: ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=12 && LA34_0<=13)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2975:2: () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2975:2: ()
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2976:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2981:2: ( (lv_op_2_0= ruleAddOp ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2982:1: (lv_op_2_0= ruleAddOp )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2982:1: (lv_op_2_0= ruleAddOp )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2983:3: lv_op_2_0= ruleAddOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpAddOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddOp_in_ruleAdditiveExpression7278);
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

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2999:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3000:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3000:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3001:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7299);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3025:1: entryRuleAddOp returns [String current=null] : iv_ruleAddOp= ruleAddOp EOF ;
    public final String entryRuleAddOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddOp = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3026:2: (iv_ruleAddOp= ruleAddOp EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3027:2: iv_ruleAddOp= ruleAddOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddOpRule()); 
            }
            pushFollow(FOLLOW_ruleAddOp_in_entryRuleAddOp7338);
            iv_ruleAddOp=ruleAddOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddOp7349); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3034:1: ruleAddOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAddOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3037:28: ( (kw= '+' | kw= '-' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3038:1: (kw= '+' | kw= '-' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3038:1: (kw= '+' | kw= '-' )
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3039:2: kw= '+'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleAddOp7387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAddOpAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3046:2: kw= '-'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleAddOp7406); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3059:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3060:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3061:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression7446);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression7456); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3068:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3071:28: ( (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3072:1: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3072:1: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3073:5: this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getAtomParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAtom_in_ruleMultiplicativeExpression7503);
            this_Atom_0=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Atom_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3081:1: ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=63 && LA36_0<=65)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3081:2: () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3081:2: ()
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3082:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3087:2: ( (lv_op_2_0= ruleMulOp ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3088:1: (lv_op_2_0= ruleMulOp )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3088:1: (lv_op_2_0= ruleMulOp )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3089:3: lv_op_2_0= ruleMulOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpMulOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMulOp_in_ruleMultiplicativeExpression7533);
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

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3105:2: ( (lv_right_3_0= ruleAtom ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3106:1: (lv_right_3_0= ruleAtom )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3106:1: (lv_right_3_0= ruleAtom )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3107:3: lv_right_3_0= ruleAtom
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightAtomParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAtom_in_ruleMultiplicativeExpression7554);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3131:1: entryRuleMulOp returns [String current=null] : iv_ruleMulOp= ruleMulOp EOF ;
    public final String entryRuleMulOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMulOp = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3132:2: (iv_ruleMulOp= ruleMulOp EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3133:2: iv_ruleMulOp= ruleMulOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOpRule()); 
            }
            pushFollow(FOLLOW_ruleMulOp_in_entryRuleMulOp7593);
            iv_ruleMulOp=ruleMulOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOp7604); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3140:1: ruleMulOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMulOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3143:28: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3144:1: (kw= '*' | kw= '/' | kw= '%' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3144:1: (kw= '*' | kw= '/' | kw= '%' )
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3145:2: kw= '*'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleMulOp7642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMulOpAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3152:2: kw= '/'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleMulOp7661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMulOpAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3159:2: kw= '%'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleMulOp7680); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3172:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3173:2: (iv_ruleAtom= ruleAtom EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3174:2: iv_ruleAtom= ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom7720);
            iv_ruleAtom=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom7730); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3181:1: ruleAtom returns [EObject current=null] : ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | ( (lv_expression_4_0= ruleVar ) ) | ( (lv_expression_5_0= ruleCall ) ) | ( () ( (lv_value_7_0= ruleSignedInt ) ) ) | ( () ( (lv_value_9_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_11_0= ruleBool ) ) ) | ( () ( (lv_value_13_0= ruleVector ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) ) ;
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
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3184:28: ( ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | ( (lv_expression_4_0= ruleVar ) ) | ( (lv_expression_5_0= ruleCall ) ) | ( () ( (lv_value_7_0= ruleSignedInt ) ) ) | ( () ( (lv_value_9_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_11_0= ruleBool ) ) ) | ( () ( (lv_value_13_0= ruleVector ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3185:1: ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | ( (lv_expression_4_0= ruleVar ) ) | ( (lv_expression_5_0= ruleCall ) ) | ( () ( (lv_value_7_0= ruleSignedInt ) ) ) | ( () ( (lv_value_9_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_11_0= ruleBool ) ) ) | ( () ( (lv_value_13_0= ruleVector ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3185:1: ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | ( (lv_expression_4_0= ruleVar ) ) | ( (lv_expression_5_0= ruleCall ) ) | ( () ( (lv_value_7_0= ruleSignedInt ) ) ) | ( () ( (lv_value_9_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_11_0= ruleBool ) ) ) | ( () ( (lv_value_13_0= ruleVector ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) )
            int alt38=8;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3185:2: ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3185:2: ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3185:3: () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3185:3: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3186:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getPrimaryExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3191:2: (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3191:4: otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAtom7778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_0_1_0());
                          
                    }
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3195:1: ( (lv_expression_2_0= ruleExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3196:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3196:1: (lv_expression_2_0= ruleExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3197:3: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getExpressionExpressionParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAtom7799);
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

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleAtom7811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getRightParenthesisKeyword_0_1_2());
                          
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3218:6: ( (lv_expression_4_0= ruleVar ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3218:6: ( (lv_expression_4_0= ruleVar ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3219:1: (lv_expression_4_0= ruleVar )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3219:1: (lv_expression_4_0= ruleVar )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3220:3: lv_expression_4_0= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getExpressionVarParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVar_in_ruleAtom7840);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3237:6: ( (lv_expression_5_0= ruleCall ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3237:6: ( (lv_expression_5_0= ruleCall ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3238:1: (lv_expression_5_0= ruleCall )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3238:1: (lv_expression_5_0= ruleCall )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3239:3: lv_expression_5_0= ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getExpressionCallParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCall_in_ruleAtom7867);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3256:6: ( () ( (lv_value_7_0= ruleSignedInt ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3256:6: ( () ( (lv_value_7_0= ruleSignedInt ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3256:7: () ( (lv_value_7_0= ruleSignedInt ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3256:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3257:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getLiteralIntAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3262:2: ( (lv_value_7_0= ruleSignedInt ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3263:1: (lv_value_7_0= ruleSignedInt )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3263:1: (lv_value_7_0= ruleSignedInt )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3264:3: lv_value_7_0= ruleSignedInt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getValueSignedIntParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedInt_in_ruleAtom7904);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3281:6: ( () ( (lv_value_9_0= ruleSignedFloat ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3281:6: ( () ( (lv_value_9_0= ruleSignedFloat ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3281:7: () ( (lv_value_9_0= ruleSignedFloat ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3281:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3282:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getLiteralFloatAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3287:2: ( (lv_value_9_0= ruleSignedFloat ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3288:1: (lv_value_9_0= ruleSignedFloat )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3288:1: (lv_value_9_0= ruleSignedFloat )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3289:3: lv_value_9_0= ruleSignedFloat
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getValueSignedFloatParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedFloat_in_ruleAtom7942);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3306:6: ( () ( (lv_value_11_0= ruleBool ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3306:6: ( () ( (lv_value_11_0= ruleBool ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3306:7: () ( (lv_value_11_0= ruleBool ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3306:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3307:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getLiteralBoolAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3312:2: ( (lv_value_11_0= ruleBool ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3313:1: (lv_value_11_0= ruleBool )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3313:1: (lv_value_11_0= ruleBool )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3314:3: lv_value_11_0= ruleBool
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getValueBoolParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBool_in_ruleAtom7980);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3331:6: ( () ( (lv_value_13_0= ruleVector ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3331:6: ( () ( (lv_value_13_0= ruleVector ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3331:7: () ( (lv_value_13_0= ruleVector ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3331:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3332:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getLiteralVectorAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3337:2: ( (lv_value_13_0= ruleVector ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3338:1: (lv_value_13_0= ruleVector )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3338:1: (lv_value_13_0= ruleVector )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3339:3: lv_value_13_0= ruleVector
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getValueVectorParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVector_in_ruleAtom8018);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3356:6: ( () ( (lv_value_15_0= RULE_STRING ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3356:6: ( () ( (lv_value_15_0= RULE_STRING ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3356:7: () ( (lv_value_15_0= RULE_STRING ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3356:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3357:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getLiteralStringAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3362:2: ( (lv_value_15_0= RULE_STRING ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3363:1: (lv_value_15_0= RULE_STRING )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3363:1: (lv_value_15_0= RULE_STRING )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3364:3: lv_value_15_0= RULE_STRING
                    {
                    lv_value_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtom8052); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3388:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3389:2: (iv_ruleCall= ruleCall EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3390:2: iv_ruleCall= ruleCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallRule()); 
            }
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall8094);
            iv_ruleCall=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall8104); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3397:1: ruleCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_args_2_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3400:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3401:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3401:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3401:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3401:2: ( (otherlv_0= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3402:1: (otherlv_0= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3402:1: (otherlv_0= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3403:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCall8149); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getCallAccess().getFunctionFunDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleCall8161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3418:1: ( (lv_args_2_0= ruleArguments ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_INT && LA39_0<=RULE_STRING)||(LA39_0>=12 && LA39_0<=13)||(LA39_0>=15 && LA39_0<=18)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3419:1: (lv_args_2_0= ruleArguments )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3419:1: (lv_args_2_0= ruleArguments )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3420:3: lv_args_2_0= ruleArguments
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCallAccess().getArgsArgumentsParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArguments_in_ruleCall8182);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCall8195); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3448:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3449:2: (iv_ruleArguments= ruleArguments EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3450:2: iv_ruleArguments= ruleArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentsRule()); 
            }
            pushFollow(FOLLOW_ruleArguments_in_entryRuleArguments8231);
            iv_ruleArguments=ruleArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArguments; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArguments8241); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3457:1: ruleArguments returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3460:28: ( ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3461:1: ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3461:1: ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3461:2: ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3461:2: ( (lv_expressions_0_0= ruleExpression ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3462:1: (lv_expressions_0_0= ruleExpression )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3462:1: (lv_expressions_0_0= ruleExpression )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3463:3: lv_expressions_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleArguments8287);
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

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3479:2: (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==19) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3479:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleArguments8300); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getArgumentsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3483:1: ( (lv_expressions_2_0= ruleExpression ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3484:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3484:1: (lv_expressions_2_0= ruleExpression )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3485:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleArguments8321);
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
        // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1839:4: ( 'else' )
        // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1839:6: 'else'
        {
        match(input,43,FOLLOW_43_in_synpred1_InternalXS4634); if (state.failed) return ;

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
            return "3185:1: ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | ( (lv_expression_4_0= ruleVar ) ) | ( (lv_expression_5_0= ruleCall ) ) | ( () ( (lv_value_7_0= ruleSignedInt ) ) ) | ( () ( (lv_value_9_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_11_0= ruleBool ) ) ) | ( () ( (lv_value_13_0= ruleVector ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) )";
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
    public static final BitSet FOLLOW_24_in_ruleRuleDeclaration2150 = new BitSet(new long[]{0x000001007F000000L});
    public static final BitSet FOLLOW_25_in_ruleRuleDeclaration2181 = new BitSet(new long[]{0x000001007F000000L});
    public static final BitSet FOLLOW_26_in_ruleRuleDeclaration2254 = new BitSet(new long[]{0x000001007F000000L});
    public static final BitSet FOLLOW_27_in_ruleRuleDeclaration2339 = new BitSet(new long[]{0x000001007F000000L});
    public static final BitSet FOLLOW_28_in_ruleRuleDeclaration2419 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleDeclaration2436 = new BitSet(new long[]{0x000001007F000000L});
    public static final BitSet FOLLOW_29_in_ruleRuleDeclaration2509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRuleDeclaration2526 = new BitSet(new long[]{0x000001007F000000L});
    public static final BitSet FOLLOW_30_in_ruleRuleDeclaration2599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRuleDeclaration2616 = new BitSet(new long[]{0x000001007F000000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleRuleDeclaration2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarModifier_in_entryRuleVarModifier2725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarModifier2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleVarModifier2822 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_32_in_ruleVarModifier2907 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_33_in_ruleVarModifier2992 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_ruleFunModifier_in_entryRuleFunModifier3080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunModifier3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFunModifier3177 = new BitSet(new long[]{0x0000000480000002L});
    public static final BitSet FOLLOW_34_in_ruleFunModifier3262 = new BitSet(new long[]{0x0000000480000002L});
    public static final BitSet FOLLOW_ruleVarTypeSpecifier_in_entryRuleVarTypeSpecifier3351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarTypeSpecifier3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleVarTypeSpecifier3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVarTypeSpecifier3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleVarTypeSpecifier3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVarTypeSpecifier3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVarTypeSpecifier3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunTypeSpecifier_in_entryRuleFunTypeSpecifier3517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunTypeSpecifier3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFunTypeSpecifier3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarTypeSpecifier_in_ruleFunTypeSpecifier3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParams_in_entryRuleParams3639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParams3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleParams3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleParams3733 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleParams3746 = new BitSet(new long[]{0x0000007B80020000L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleParams3767 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement3806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStatement3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCompoundStatement3862 = new BitSet(new long[]{0x001C777B8007B870L});
    public static final BitSet FOLLOW_ruleVarDeclarationOrStatement_in_ruleCompoundStatement3883 = new BitSet(new long[]{0x001C777B8007B870L});
    public static final BitSet FOLLOW_41_in_ruleCompoundStatement3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclarationOrStatement_in_entryRuleVarDeclarationOrStatement3932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclarationOrStatement3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleVarDeclarationOrStatement3990 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleVarDeclarationOrStatement4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleVarDeclarationOrStatement4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement4065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionStatement_in_ruleStatement4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleStatement4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseStatement_in_ruleStatement4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_ruleStatement4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_ruleStatement4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_ruleStatement4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_ruleStatement4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinueStatement_in_ruleStatement4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakStatement_in_ruleStatement4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionStatement_in_entryRuleExpressionStatement4373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionStatement4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionStatement4430 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleExpressionStatement4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleExpressionStatement4471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseStatement_in_entryRuleIfElseStatement4508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfElseStatement4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleIfElseStatement4555 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIfElseStatement4567 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfElseStatement4588 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIfElseStatement4600 = new BitSet(new long[]{0x001C757B8007B870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfElseStatement4621 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleIfElseStatement4642 = new BitSet(new long[]{0x001C757B8007B870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfElseStatement4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement4702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileStatement4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleWhileStatement4749 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleWhileStatement4761 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhileStatement4782 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleWhileStatement4794 = new BitSet(new long[]{0x001C757B8007B870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhileStatement4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_entryRuleForStatement4851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForStatement4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleForStatement4898 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleForStatement4910 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleForVarDeclaration_in_ruleForStatement4931 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleForStatement4943 = new BitSet(new long[]{0x7800000000000000L});
    public static final BitSet FOLLOW_ruleRelOp_in_ruleForStatement4964 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForStatement4985 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleForStatement4997 = new BitSet(new long[]{0x001C757B8007B870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleForStatement5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement5054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchStatement5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSwitchStatement5101 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSwitchStatement5113 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSwitchStatement5133 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSwitchStatement5145 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSwitchStatement5157 = new BitSet(new long[]{0x0002820000000000L});
    public static final BitSet FOLLOW_ruleSwitchCase_in_ruleSwitchStatement5178 = new BitSet(new long[]{0x0002820000000000L});
    public static final BitSet FOLLOW_ruleSwitchDefault_in_ruleSwitchStatement5200 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSwitchStatement5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase5249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchCase5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleSwitchCase5296 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_ruleSignedInt_in_ruleSwitchCase5317 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleSwitchCase5329 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSwitchCase5341 = new BitSet(new long[]{0x001C757B8007B870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSwitchCase5362 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSwitchCase5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchDefault_in_entryRuleSwitchDefault5410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchDefault5420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleSwitchDefault5457 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleSwitchDefault5469 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSwitchDefault5481 = new BitSet(new long[]{0x001C757B8007B870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSwitchDefault5502 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSwitchDefault5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement5550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleReturnStatement5606 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_18_in_ruleReturnStatement5619 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStatement5640 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleReturnStatement5652 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleReturnStatement5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinueStatement_in_entryRuleContinueStatement5702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContinueStatement5712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleContinueStatement5758 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleContinueStatement5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakStatement_in_entryRuleBreakStatement5806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakStatement5816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBreakStatement5862 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBreakStatement5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostFixOp_in_entryRulePostFixOp5911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostFixOp5922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePostFixOp5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePostFixOp5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleExpression6086 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExpression6098 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleExpression6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression6184 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_rulePostFixOp_in_ruleExpression6205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar6242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression6331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpression6341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleSimpleExpression6388 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleSimpleExpression6415 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleSimpleExpression6449 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression6487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsExpression_in_ruleAndExpression6544 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleAndExpression6571 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleEqualsExpression_in_ruleAndExpression6605 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleEqualsExpression_in_entryRuleEqualsExpression6643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsExpression6653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualsExpression6700 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_ruleEqOp_in_ruleEqualsExpression6730 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualsExpression6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqOp_in_entryRuleEqOp6790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqOp6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEqOp6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleEqOp6858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression6898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleComparisonExpression6955 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_ruleRelOp_in_ruleComparisonExpression6985 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleComparisonExpression7006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelOp_in_entryRuleRelOp7045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelOp7056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleRelOp7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleRelOp7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleRelOp7132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRelOp7151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression7191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7248 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_ruleAddOp_in_ruleAdditiveExpression7278 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7299 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_ruleAddOp_in_entryRuleAddOp7338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddOp7349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAddOp7387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleAddOp7406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression7446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleMultiplicativeExpression7503 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMulOp_in_ruleMultiplicativeExpression7533 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleMultiplicativeExpression7554 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMulOp_in_entryRuleMulOp7593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOp7604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleMulOp7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleMulOp7661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleMulOp7680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom7720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom7730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAtom7778 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAtom7799 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAtom7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleAtom7840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleAtom7867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_ruleAtom7904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedFloat_in_ruleAtom7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_ruleAtom7980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_ruleAtom8018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtom8052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall8094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall8104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCall8149 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCall8161 = new BitSet(new long[]{0x000000000017B070L});
    public static final BitSet FOLLOW_ruleArguments_in_ruleCall8182 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCall8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_entryRuleArguments8231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArguments8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArguments8287 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleArguments8300 = new BitSet(new long[]{0x000000000007B070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArguments8321 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_43_in_synpred1_InternalXS4634 = new BitSet(new long[]{0x0000000000000002L});

}
