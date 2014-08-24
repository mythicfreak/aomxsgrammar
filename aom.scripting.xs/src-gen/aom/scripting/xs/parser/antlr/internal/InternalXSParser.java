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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'-'", "'.'", "'true'", "'false'", "'vector'", "'('", "','", "')'", "'='", "'include'", "'rule'", "'active'", "'inactive'", "'runImmediately'", "'highFrequency'", "'group'", "'minInterval'", "'maxInterval'", "'static'", "'const'", "'extern'", "'mutable'", "'int'", "'float'", "'bool'", "'string'", "'void'", "'{'", "'}'", "'if'", "'else'", "'while'", "'for'", "'switch'", "'case'", "':'", "'default'", "'return'", "'continue'", "'break'", "'++'", "'--'", "'||'", "'&&'", "'=='", "'!='", "'<='", "'<'", "'>'", "'>='", "'+'", "'*'", "'/'", "'%'"
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

                if ( (LA1_0==16||(LA1_0>=21 && LA1_0<=22)||(LA1_0>=30 && LA1_0<=38)) ) {
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:183:1: ruleSign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleSign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:186:28: (kw= '-' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:188:2: kw= '-'
            {
            kw=(Token)match(input,12,FOLLOW_12_in_ruleSign416); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSignAccess().getHyphenMinusKeyword()); 
                  
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:201:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:202:2: (iv_ruleSignedInt= ruleSignedInt EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:203:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedIntRule()); 
            }
            pushFollow(FOLLOW_ruleSignedInt_in_entryRuleSignedInt456);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedInt.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInt467); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:210:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_Sign_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:213:28: ( ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:214:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:214:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:214:2: (this_Sign_0= ruleSign )? this_INT_1= RULE_INT
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:214:2: (this_Sign_0= ruleSign )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:215:5: this_Sign_0= ruleSign
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSignedIntAccess().getSignParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSign_in_ruleSignedInt515);
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

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedInt537); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:240:1: entryRuleSignedFloat returns [String current=null] : iv_ruleSignedFloat= ruleSignedFloat EOF ;
    public final String entryRuleSignedFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedFloat = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:241:2: (iv_ruleSignedFloat= ruleSignedFloat EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:242:2: iv_ruleSignedFloat= ruleSignedFloat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedFloatRule()); 
            }
            pushFollow(FOLLOW_ruleSignedFloat_in_entryRuleSignedFloat583);
            iv_ruleSignedFloat=ruleSignedFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedFloat.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedFloat594); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:249:1: ruleSignedFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;
        AntlrDatatypeRuleToken this_Sign_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:252:28: ( ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:253:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:253:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:253:2: (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:253:2: (this_Sign_0= ruleSign )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:254:5: this_Sign_0= ruleSign
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSignedFloatAccess().getSignParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSign_in_ruleSignedFloat642);
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

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedFloat664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getSignedFloatAccess().getINTTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,13,FOLLOW_13_in_ruleSignedFloat682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSignedFloatAccess().getFullStopKeyword_2()); 
                  
            }
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedFloat697); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:292:1: entryRuleSignedNum returns [String current=null] : iv_ruleSignedNum= ruleSignedNum EOF ;
    public final String entryRuleSignedNum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNum = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:293:2: (iv_ruleSignedNum= ruleSignedNum EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:294:2: iv_ruleSignedNum= ruleSignedNum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedNumRule()); 
            }
            pushFollow(FOLLOW_ruleSignedNum_in_entryRuleSignedNum743);
            iv_ruleSignedNum=ruleSignedNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedNum.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNum754); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:301:1: ruleSignedNum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SignedInt_0= ruleSignedInt | this_SignedFloat_1= ruleSignedFloat ) ;
    public final AntlrDatatypeRuleToken ruleSignedNum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SignedInt_0 = null;

        AntlrDatatypeRuleToken this_SignedFloat_1 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:304:28: ( (this_SignedInt_0= ruleSignedInt | this_SignedFloat_1= ruleSignedFloat ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:305:1: (this_SignedInt_0= ruleSignedInt | this_SignedFloat_1= ruleSignedFloat )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:305:1: (this_SignedInt_0= ruleSignedInt | this_SignedFloat_1= ruleSignedFloat )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_INT) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==13) ) {
                        alt5=2;
                    }
                    else if ( (LA5_2==EOF||(LA5_2>=18 && LA5_2<=19)||LA5_2==47) ) {
                        alt5=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_INT) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==13) ) {
                    alt5=2;
                }
                else if ( (LA5_2==EOF||(LA5_2>=18 && LA5_2<=19)||LA5_2==47) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:306:5: this_SignedInt_0= ruleSignedInt
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSignedNumAccess().getSignedIntParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignedInt_in_ruleSignedNum801);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:318:5: this_SignedFloat_1= ruleSignedFloat
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSignedNumAccess().getSignedFloatParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignedFloat_in_ruleSignedNum834);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:336:1: entryRuleConstantNum returns [EObject current=null] : iv_ruleConstantNum= ruleConstantNum EOF ;
    public final EObject entryRuleConstantNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantNum = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:337:2: (iv_ruleConstantNum= ruleConstantNum EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:338:2: iv_ruleConstantNum= ruleConstantNum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantNumRule()); 
            }
            pushFollow(FOLLOW_ruleConstantNum_in_entryRuleConstantNum879);
            iv_ruleConstantNum=ruleConstantNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantNum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantNum889); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:345:1: ruleConstantNum returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConstantNum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:348:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:349:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:349:1: ( (otherlv_0= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:350:1: (otherlv_0= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:350:1: (otherlv_0= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:351:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantNumRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantNum933); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:370:1: entryRuleLiteralOrConstantNum returns [EObject current=null] : iv_ruleLiteralOrConstantNum= ruleLiteralOrConstantNum EOF ;
    public final EObject entryRuleLiteralOrConstantNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralOrConstantNum = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:371:2: (iv_ruleLiteralOrConstantNum= ruleLiteralOrConstantNum EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:372:2: iv_ruleLiteralOrConstantNum= ruleLiteralOrConstantNum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralOrConstantNumRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralOrConstantNum_in_entryRuleLiteralOrConstantNum968);
            iv_ruleLiteralOrConstantNum=ruleLiteralOrConstantNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralOrConstantNum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralOrConstantNum978); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:379:1: ruleLiteralOrConstantNum returns [EObject current=null] : ( ( () ruleSignedNum ) | this_ConstantNum_2= ruleConstantNum ) ;
    public final EObject ruleLiteralOrConstantNum() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantNum_2 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:382:28: ( ( ( () ruleSignedNum ) | this_ConstantNum_2= ruleConstantNum ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:383:1: ( ( () ruleSignedNum ) | this_ConstantNum_2= ruleConstantNum )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:383:1: ( ( () ruleSignedNum ) | this_ConstantNum_2= ruleConstantNum )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:383:2: ( () ruleSignedNum )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:383:2: ( () ruleSignedNum )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:383:3: () ruleSignedNum
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:383:3: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:384:5: 
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
                    pushFollow(FOLLOW_ruleSignedNum_in_ruleLiteralOrConstantNum1029);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:399:5: this_ConstantNum_2= ruleConstantNum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralOrConstantNumAccess().getConstantNumParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantNum_in_ruleLiteralOrConstantNum1057);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:415:1: entryRuleBool returns [String current=null] : iv_ruleBool= ruleBool EOF ;
    public final String entryRuleBool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBool = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:416:2: (iv_ruleBool= ruleBool EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:417:2: iv_ruleBool= ruleBool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolRule()); 
            }
            pushFollow(FOLLOW_ruleBool_in_entryRuleBool1093);
            iv_ruleBool=ruleBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBool.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool1104); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:424:1: ruleBool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:427:28: ( (kw= 'true' | kw= 'false' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:428:1: (kw= 'true' | kw= 'false' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:428:1: (kw= 'true' | kw= 'false' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:429:2: kw= 'true'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleBool1142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBoolAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:436:2: kw= 'false'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleBool1161); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:449:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:450:2: (iv_ruleVector= ruleVector EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:451:2: iv_ruleVector= ruleVector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVectorRule()); 
            }
            pushFollow(FOLLOW_ruleVector_in_entryRuleVector1201);
            iv_ruleVector=ruleVector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector1211); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:458:1: ruleVector returns [EObject current=null] : (otherlv_0= 'vector' otherlv_1= '(' ( (lv_x_2_0= ruleLiteralOrConstantNum ) ) otherlv_3= ',' ( (lv_y_4_0= ruleLiteralOrConstantNum ) ) otherlv_5= ',' ( (lv_z_6_0= ruleLiteralOrConstantNum ) ) otherlv_7= ')' ) ;
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
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:461:28: ( (otherlv_0= 'vector' otherlv_1= '(' ( (lv_x_2_0= ruleLiteralOrConstantNum ) ) otherlv_3= ',' ( (lv_y_4_0= ruleLiteralOrConstantNum ) ) otherlv_5= ',' ( (lv_z_6_0= ruleLiteralOrConstantNum ) ) otherlv_7= ')' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:462:1: (otherlv_0= 'vector' otherlv_1= '(' ( (lv_x_2_0= ruleLiteralOrConstantNum ) ) otherlv_3= ',' ( (lv_y_4_0= ruleLiteralOrConstantNum ) ) otherlv_5= ',' ( (lv_z_6_0= ruleLiteralOrConstantNum ) ) otherlv_7= ')' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:462:1: (otherlv_0= 'vector' otherlv_1= '(' ( (lv_x_2_0= ruleLiteralOrConstantNum ) ) otherlv_3= ',' ( (lv_y_4_0= ruleLiteralOrConstantNum ) ) otherlv_5= ',' ( (lv_z_6_0= ruleLiteralOrConstantNum ) ) otherlv_7= ')' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:462:3: otherlv_0= 'vector' otherlv_1= '(' ( (lv_x_2_0= ruleLiteralOrConstantNum ) ) otherlv_3= ',' ( (lv_y_4_0= ruleLiteralOrConstantNum ) ) otherlv_5= ',' ( (lv_z_6_0= ruleLiteralOrConstantNum ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleVector1248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVectorKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleVector1260); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVectorAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:470:1: ( (lv_x_2_0= ruleLiteralOrConstantNum ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:471:1: (lv_x_2_0= ruleLiteralOrConstantNum )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:471:1: (lv_x_2_0= ruleLiteralOrConstantNum )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:472:3: lv_x_2_0= ruleLiteralOrConstantNum
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVectorAccess().getXLiteralOrConstantNumParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteralOrConstantNum_in_ruleVector1281);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleVector1293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVectorAccess().getCommaKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:492:1: ( (lv_y_4_0= ruleLiteralOrConstantNum ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:493:1: (lv_y_4_0= ruleLiteralOrConstantNum )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:493:1: (lv_y_4_0= ruleLiteralOrConstantNum )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:494:3: lv_y_4_0= ruleLiteralOrConstantNum
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVectorAccess().getYLiteralOrConstantNumParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteralOrConstantNum_in_ruleVector1314);
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

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleVector1326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getVectorAccess().getCommaKeyword_5());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:514:1: ( (lv_z_6_0= ruleLiteralOrConstantNum ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:515:1: (lv_z_6_0= ruleLiteralOrConstantNum )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:515:1: (lv_z_6_0= ruleLiteralOrConstantNum )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:516:3: lv_z_6_0= ruleLiteralOrConstantNum
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVectorAccess().getZLiteralOrConstantNumParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteralOrConstantNum_in_ruleVector1347);
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

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleVector1359); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:544:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:545:2: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:546:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration1395);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclaration1405); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:553:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleVarModifier ) ) ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_modifier_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:556:28: ( ( ( (lv_modifier_0_0= ruleVarModifier ) ) ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:557:1: ( ( (lv_modifier_0_0= ruleVarModifier ) ) ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:557:1: ( ( (lv_modifier_0_0= ruleVarModifier ) ) ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:557:2: ( (lv_modifier_0_0= ruleVarModifier ) ) ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:557:2: ( (lv_modifier_0_0= ruleVarModifier ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:558:1: (lv_modifier_0_0= ruleVarModifier )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:558:1: (lv_modifier_0_0= ruleVarModifier )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:559:3: lv_modifier_0_0= ruleVarModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarDeclarationAccess().getModifierVarModifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVarModifier_in_ruleVarDeclaration1451);
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

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:575:2: ( (lv_type_1_0= ruleVarTypeSpecifier ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:576:1: (lv_type_1_0= ruleVarTypeSpecifier )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:576:1: (lv_type_1_0= ruleVarTypeSpecifier )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:577:3: lv_type_1_0= ruleVarTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeVarTypeSpecifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVarTypeSpecifier_in_ruleVarDeclaration1472);
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

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:593:2: ( (lv_name_2_0= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:594:1: (lv_name_2_0= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:594:1: (lv_name_2_0= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:595:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDeclaration1489); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleVarDeclaration1506); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVarDeclarationAccess().getEqualsSignKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:615:1: ( (lv_value_4_0= ruleExpression ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:616:1: (lv_value_4_0= ruleExpression )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:616:1: (lv_value_4_0= ruleExpression )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:617:3: lv_value_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarDeclarationAccess().getValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleVarDeclaration1527);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:641:1: entryRuleForVarDeclaration returns [EObject current=null] : iv_ruleForVarDeclaration= ruleForVarDeclaration EOF ;
    public final EObject entryRuleForVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForVarDeclaration = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:642:2: (iv_ruleForVarDeclaration= ruleForVarDeclaration EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:643:2: iv_ruleForVarDeclaration= ruleForVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleForVarDeclaration_in_entryRuleForVarDeclaration1563);
            iv_ruleForVarDeclaration=ruleForVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForVarDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForVarDeclaration1573); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:650:1: ruleForVarDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleForVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:653:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:654:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:654:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:654:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:654:2: ( (lv_name_0_0= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:655:1: (lv_name_0_0= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:655:1: (lv_name_0_0= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:656:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForVarDeclaration1615); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleForVarDeclaration1632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForVarDeclarationAccess().getEqualsSignKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:676:1: ( (lv_value_2_0= ruleExpression ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:677:1: (lv_value_2_0= ruleExpression )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:677:1: (lv_value_2_0= ruleExpression )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:678:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForVarDeclarationAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleForVarDeclaration1653);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:702:1: entryRuleFunDeclaration returns [EObject current=null] : iv_ruleFunDeclaration= ruleFunDeclaration EOF ;
    public final EObject entryRuleFunDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunDeclaration = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:703:2: (iv_ruleFunDeclaration= ruleFunDeclaration EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:704:2: iv_ruleFunDeclaration= ruleFunDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFunDeclaration_in_entryRuleFunDeclaration1689);
            iv_ruleFunDeclaration=ruleFunDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunDeclaration1699); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:711:1: ruleFunDeclaration returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleFunModifier ) ) ( (lv_type_1_0= ruleFunTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_paramlist_4_0= ruleParams ) )? otherlv_5= ')' ( (lv_statements_6_0= ruleCompoundStatement ) ) ) ;
    public final EObject ruleFunDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_modifier_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_paramlist_4_0 = null;

        EObject lv_statements_6_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:714:28: ( ( ( (lv_modifier_0_0= ruleFunModifier ) ) ( (lv_type_1_0= ruleFunTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_paramlist_4_0= ruleParams ) )? otherlv_5= ')' ( (lv_statements_6_0= ruleCompoundStatement ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:715:1: ( ( (lv_modifier_0_0= ruleFunModifier ) ) ( (lv_type_1_0= ruleFunTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_paramlist_4_0= ruleParams ) )? otherlv_5= ')' ( (lv_statements_6_0= ruleCompoundStatement ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:715:1: ( ( (lv_modifier_0_0= ruleFunModifier ) ) ( (lv_type_1_0= ruleFunTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_paramlist_4_0= ruleParams ) )? otherlv_5= ')' ( (lv_statements_6_0= ruleCompoundStatement ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:715:2: ( (lv_modifier_0_0= ruleFunModifier ) ) ( (lv_type_1_0= ruleFunTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_paramlist_4_0= ruleParams ) )? otherlv_5= ')' ( (lv_statements_6_0= ruleCompoundStatement ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:715:2: ( (lv_modifier_0_0= ruleFunModifier ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:716:1: (lv_modifier_0_0= ruleFunModifier )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:716:1: (lv_modifier_0_0= ruleFunModifier )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:717:3: lv_modifier_0_0= ruleFunModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunDeclarationAccess().getModifierFunModifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFunModifier_in_ruleFunDeclaration1745);
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

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:733:2: ( (lv_type_1_0= ruleFunTypeSpecifier ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:734:1: (lv_type_1_0= ruleFunTypeSpecifier )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:734:1: (lv_type_1_0= ruleFunTypeSpecifier )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:735:3: lv_type_1_0= ruleFunTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunDeclarationAccess().getTypeFunTypeSpecifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFunTypeSpecifier_in_ruleFunDeclaration1766);
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

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:751:2: ( (lv_name_2_0= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:752:1: (lv_name_2_0= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:752:1: (lv_name_2_0= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:753:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunDeclaration1783); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleFunDeclaration1800); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunDeclarationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:773:1: ( (lv_paramlist_4_0= ruleParams ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16||(LA8_0>=30 && LA8_0<=32)||(LA8_0>=34 && LA8_0<=38)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:774:1: (lv_paramlist_4_0= ruleParams )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:774:1: (lv_paramlist_4_0= ruleParams )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:775:3: lv_paramlist_4_0= ruleParams
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunDeclarationAccess().getParamlistParamsParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParams_in_ruleFunDeclaration1821);
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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleFunDeclaration1834); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFunDeclarationAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:795:1: ( (lv_statements_6_0= ruleCompoundStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:796:1: (lv_statements_6_0= ruleCompoundStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:796:1: (lv_statements_6_0= ruleCompoundStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:797:3: lv_statements_6_0= ruleCompoundStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunDeclarationAccess().getStatementsCompoundStatementParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCompoundStatement_in_ruleFunDeclaration1855);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:821:1: entryRuleIncludeStatement returns [EObject current=null] : iv_ruleIncludeStatement= ruleIncludeStatement EOF ;
    public final EObject entryRuleIncludeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:822:2: (iv_ruleIncludeStatement= ruleIncludeStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:823:2: iv_ruleIncludeStatement= ruleIncludeStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIncludeStatement_in_entryRuleIncludeStatement1891);
            iv_ruleIncludeStatement=ruleIncludeStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIncludeStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeStatement1901); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:830:1: ruleIncludeStatement returns [EObject current=null] : (otherlv_0= 'include' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleIncludeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:833:28: ( (otherlv_0= 'include' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:834:1: (otherlv_0= 'include' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:834:1: (otherlv_0= 'include' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:834:3: otherlv_0= 'include' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleIncludeStatement1938); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIncludeStatementAccess().getIncludeKeyword_0());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:838:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:839:1: (lv_name_1_0= RULE_STRING )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:839:1: (lv_name_1_0= RULE_STRING )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:840:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIncludeStatement1955); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:864:1: entryRuleRuleDeclaration returns [EObject current=null] : iv_ruleRuleDeclaration= ruleRuleDeclaration EOF ;
    public final EObject entryRuleRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDeclaration = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:865:2: (iv_ruleRuleDeclaration= ruleRuleDeclaration EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:866:2: iv_ruleRuleDeclaration= ruleRuleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleRuleDeclaration_in_entryRuleRuleDeclaration1996);
            iv_ruleRuleDeclaration=ruleRuleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleDeclaration2006); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:873:1: ruleRuleDeclaration returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_13_0= ruleCompoundStatement ) ) ) ;
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
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:876:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_13_0= ruleCompoundStatement ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:877:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_13_0= ruleCompoundStatement ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:877:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_13_0= ruleCompoundStatement ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:877:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_13_0= ruleCompoundStatement ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleRuleDeclaration2043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRuleDeclarationAccess().getRuleKeyword_0());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:881:1: ( (lv_name_1_0= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:882:1: (lv_name_1_0= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:882:1: (lv_name_1_0= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:883:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleDeclaration2060); if (state.failed) return current;
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

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:899:2: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:901:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:901:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:902:2: ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2());
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:905:2: ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:906:3: ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:906:3: ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=7;
                int LA10_0 = input.LA(1);

                if ( LA10_0 >=23 && LA10_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 2) ) {
                    alt10=3;
                }
                else if ( LA10_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 3) ) {
                    alt10=4;
                }
                else if ( LA10_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 4) ) {
                    alt10=5;
                }
                else if ( LA10_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 5) ) {
                    alt10=6;
                }


                switch (alt10) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:908:4: ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:908:4: ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:909:5: {...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:909:112: ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:910:6: ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 0);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:913:6: ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:913:7: {...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:913:16: ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==23) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==24) ) {
            	        alt9=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:913:17: ( (lv_active_3_0= 'active' ) )
            	            {
            	            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:913:17: ( (lv_active_3_0= 'active' ) )
            	            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:914:1: (lv_active_3_0= 'active' )
            	            {
            	            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:914:1: (lv_active_3_0= 'active' )
            	            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:915:3: lv_active_3_0= 'active'
            	            {
            	            lv_active_3_0=(Token)match(input,23,FOLLOW_23_in_ruleRuleDeclaration2129); if (state.failed) return current;
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
            	            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:929:7: otherlv_4= 'inactive'
            	            {
            	            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleRuleDeclaration2160); if (state.failed) return current;
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:940:4: ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:940:4: ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:941:5: {...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:941:112: ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:942:6: ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 1);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:945:6: ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:945:7: {...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:945:16: ( (lv_runImmediately_5_0= 'runImmediately' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:946:1: (lv_runImmediately_5_0= 'runImmediately' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:946:1: (lv_runImmediately_5_0= 'runImmediately' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:947:3: lv_runImmediately_5_0= 'runImmediately'
            	    {
            	    lv_runImmediately_5_0=(Token)match(input,25,FOLLOW_25_in_ruleRuleDeclaration2233); if (state.failed) return current;
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:967:4: ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:967:4: ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:968:5: {...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:968:112: ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:969:6: ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 2);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:972:6: ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:972:7: {...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:972:16: ( (lv_highFrequency_6_0= 'highFrequency' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:973:1: (lv_highFrequency_6_0= 'highFrequency' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:973:1: (lv_highFrequency_6_0= 'highFrequency' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:974:3: lv_highFrequency_6_0= 'highFrequency'
            	    {
            	    lv_highFrequency_6_0=(Token)match(input,26,FOLLOW_26_in_ruleRuleDeclaration2318); if (state.failed) return current;
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:994:4: ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:994:4: ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:995:5: {...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:995:112: ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:996:6: ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 3);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:999:6: ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:999:7: {...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:999:16: (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:999:18: otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleRuleDeclaration2398); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getRuleDeclarationAccess().getGroupKeyword_2_3_0());
            	          
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1003:1: ( (lv_group_8_0= RULE_ID ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1004:1: (lv_group_8_0= RULE_ID )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1004:1: (lv_group_8_0= RULE_ID )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1005:3: lv_group_8_0= RULE_ID
            	    {
            	    lv_group_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleDeclaration2415); if (state.failed) return current;
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1028:4: ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1028:4: ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1029:5: {...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1029:112: ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1030:6: ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 4);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1033:6: ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1033:7: {...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1033:16: (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1033:18: otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) )
            	    {
            	    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleRuleDeclaration2488); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getRuleDeclarationAccess().getMinIntervalKeyword_2_4_0());
            	          
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1037:1: ( (lv_minInterval_10_0= RULE_INT ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1038:1: (lv_minInterval_10_0= RULE_INT )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1038:1: (lv_minInterval_10_0= RULE_INT )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1039:3: lv_minInterval_10_0= RULE_INT
            	    {
            	    lv_minInterval_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRuleDeclaration2505); if (state.failed) return current;
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1062:4: ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1062:4: ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1063:5: {...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1063:112: ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1064:6: ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 5);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1067:6: ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1067:7: {...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1067:16: (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1067:18: otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) )
            	    {
            	    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleRuleDeclaration2578); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getRuleDeclarationAccess().getMaxIntervalKeyword_2_5_0());
            	          
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1071:1: ( (lv_maxInterval_12_0= RULE_INT ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1072:1: (lv_maxInterval_12_0= RULE_INT )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1072:1: (lv_maxInterval_12_0= RULE_INT )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1073:3: lv_maxInterval_12_0= RULE_INT
            	    {
            	    lv_maxInterval_12_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRuleDeclaration2595); if (state.failed) return current;
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
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canLeave(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2());

            }

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1104:2: ( (lv_statements_13_0= ruleCompoundStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1105:1: (lv_statements_13_0= ruleCompoundStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1105:1: (lv_statements_13_0= ruleCompoundStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1106:3: lv_statements_13_0= ruleCompoundStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleDeclarationAccess().getStatementsCompoundStatementParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCompoundStatement_in_ruleRuleDeclaration2668);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1130:1: entryRuleVarModifier returns [EObject current=null] : iv_ruleVarModifier= ruleVarModifier EOF ;
    public final EObject entryRuleVarModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarModifier = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1131:2: (iv_ruleVarModifier= ruleVarModifier EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1132:2: iv_ruleVarModifier= ruleVarModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarModifierRule()); 
            }
            pushFollow(FOLLOW_ruleVarModifier_in_entryRuleVarModifier2704);
            iv_ruleVarModifier=ruleVarModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarModifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarModifier2714); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1139:1: ruleVarModifier returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleVarModifier() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_const_2_0=null;
        Token lv_extern_3_0=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1142:28: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1143:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1143:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1145:1: ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1145:1: ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1146:2: ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getVarModifierAccess().getUnorderedGroup());
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1149:2: ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1150:3: ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )*
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1150:3: ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )*
            loop11:
            do {
                int alt11=4;
                int LA11_0 = input.LA(1);

                if ( LA11_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 2) ) {
                    alt11=3;
                }


                switch (alt11) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1152:4: ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1152:4: ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1153:5: {...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1153:106: ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1154:6: ({...}? => ( (lv_static_1_0= 'static' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 0);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1157:6: ({...}? => ( (lv_static_1_0= 'static' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1157:7: {...}? => ( (lv_static_1_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1157:16: ( (lv_static_1_0= 'static' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1158:1: (lv_static_1_0= 'static' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1158:1: (lv_static_1_0= 'static' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1159:3: lv_static_1_0= 'static'
            	    {
            	    lv_static_1_0=(Token)match(input,30,FOLLOW_30_in_ruleVarModifier2801); if (state.failed) return current;
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1179:4: ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1179:4: ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1180:5: {...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1180:106: ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1181:6: ({...}? => ( (lv_const_2_0= 'const' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 1);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1184:6: ({...}? => ( (lv_const_2_0= 'const' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1184:7: {...}? => ( (lv_const_2_0= 'const' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1184:16: ( (lv_const_2_0= 'const' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1185:1: (lv_const_2_0= 'const' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1185:1: (lv_const_2_0= 'const' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1186:3: lv_const_2_0= 'const'
            	    {
            	    lv_const_2_0=(Token)match(input,31,FOLLOW_31_in_ruleVarModifier2886); if (state.failed) return current;
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1206:4: ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1206:4: ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1207:5: {...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1207:106: ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1208:6: ({...}? => ( (lv_extern_3_0= 'extern' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVarModifierAccess().getUnorderedGroup(), 2);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1211:6: ({...}? => ( (lv_extern_3_0= 'extern' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1211:7: {...}? => ( (lv_extern_3_0= 'extern' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1211:16: ( (lv_extern_3_0= 'extern' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1212:1: (lv_extern_3_0= 'extern' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1212:1: (lv_extern_3_0= 'extern' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1213:3: lv_extern_3_0= 'extern'
            	    {
            	    lv_extern_3_0=(Token)match(input,32,FOLLOW_32_in_ruleVarModifier2971); if (state.failed) return current;
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
            	    break loop11;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1248:1: entryRuleFunModifier returns [EObject current=null] : iv_ruleFunModifier= ruleFunModifier EOF ;
    public final EObject entryRuleFunModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunModifier = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1249:2: (iv_ruleFunModifier= ruleFunModifier EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1250:2: iv_ruleFunModifier= ruleFunModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunModifierRule()); 
            }
            pushFollow(FOLLOW_ruleFunModifier_in_entryRuleFunModifier3059);
            iv_ruleFunModifier=ruleFunModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunModifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunModifier3069); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1257:1: ruleFunModifier returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleFunModifier() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_mutable_2_0=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1260:28: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1261:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1261:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1263:1: ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1263:1: ( ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1264:2: ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getFunModifierAccess().getUnorderedGroup());
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1267:2: ( ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1268:3: ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )*
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1268:3: ( ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( LA12_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 1) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1270:4: ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1270:4: ({...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1271:5: {...}? => ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleFunModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1271:106: ( ({...}? => ( (lv_static_1_0= 'static' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1272:6: ({...}? => ( (lv_static_1_0= 'static' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 0);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1275:6: ({...}? => ( (lv_static_1_0= 'static' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1275:7: {...}? => ( (lv_static_1_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleFunModifier", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1275:16: ( (lv_static_1_0= 'static' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1276:1: (lv_static_1_0= 'static' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1276:1: (lv_static_1_0= 'static' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1277:3: lv_static_1_0= 'static'
            	    {
            	    lv_static_1_0=(Token)match(input,30,FOLLOW_30_in_ruleFunModifier3156); if (state.failed) return current;
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
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1297:4: ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1297:4: ({...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1298:5: {...}? => ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleFunModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1298:106: ( ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1299:6: ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getFunModifierAccess().getUnorderedGroup(), 1);
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1302:6: ({...}? => ( (lv_mutable_2_0= 'mutable' ) ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1302:7: {...}? => ( (lv_mutable_2_0= 'mutable' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleFunModifier", "true");
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1302:16: ( (lv_mutable_2_0= 'mutable' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1303:1: (lv_mutable_2_0= 'mutable' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1303:1: (lv_mutable_2_0= 'mutable' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1304:3: lv_mutable_2_0= 'mutable'
            	    {
            	    lv_mutable_2_0=(Token)match(input,33,FOLLOW_33_in_ruleFunModifier3241); if (state.failed) return current;
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
            	    break loop12;
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


    // $ANTLR start "entryRuleIntType"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1339:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1340:2: (iv_ruleIntType= ruleIntType EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1341:2: iv_ruleIntType= ruleIntType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntTypeRule()); 
            }
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType3329);
            iv_ruleIntType=ruleIntType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType3339); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntType"


    // $ANTLR start "ruleIntType"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1348:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1351:28: ( ( () otherlv_1= 'int' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1352:1: ( () otherlv_1= 'int' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1352:1: ( () otherlv_1= 'int' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1352:2: () otherlv_1= 'int'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1352:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1353:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntTypeAccess().getIntTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleIntType3385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIntTypeAccess().getIntKeyword_1());
                  
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
    // $ANTLR end "ruleIntType"


    // $ANTLR start "entryRuleFloatType"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1370:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1371:2: (iv_ruleFloatType= ruleFloatType EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1372:2: iv_ruleFloatType= ruleFloatType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType3421);
            iv_ruleFloatType=ruleFloatType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType3431); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloatType"


    // $ANTLR start "ruleFloatType"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1379:1: ruleFloatType returns [EObject current=null] : ( () otherlv_1= 'float' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1382:28: ( ( () otherlv_1= 'float' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1383:1: ( () otherlv_1= 'float' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1383:1: ( () otherlv_1= 'float' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1383:2: () otherlv_1= 'float'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1383:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1384:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFloatTypeAccess().getFloatTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleFloatType3477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFloatTypeAccess().getFloatKeyword_1());
                  
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
    // $ANTLR end "ruleFloatType"


    // $ANTLR start "entryRuleBoolType"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1401:1: entryRuleBoolType returns [EObject current=null] : iv_ruleBoolType= ruleBoolType EOF ;
    public final EObject entryRuleBoolType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolType = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1402:2: (iv_ruleBoolType= ruleBoolType EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1403:2: iv_ruleBoolType= ruleBoolType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolTypeRule()); 
            }
            pushFollow(FOLLOW_ruleBoolType_in_entryRuleBoolType3513);
            iv_ruleBoolType=ruleBoolType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolType3523); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolType"


    // $ANTLR start "ruleBoolType"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1410:1: ruleBoolType returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject ruleBoolType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1413:28: ( ( () otherlv_1= 'bool' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1414:1: ( () otherlv_1= 'bool' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1414:1: ( () otherlv_1= 'bool' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1414:2: () otherlv_1= 'bool'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1414:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1415:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolTypeAccess().getBoolTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleBoolType3569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBoolTypeAccess().getBoolKeyword_1());
                  
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
    // $ANTLR end "ruleBoolType"


    // $ANTLR start "entryRuleVectorType"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1432:1: entryRuleVectorType returns [EObject current=null] : iv_ruleVectorType= ruleVectorType EOF ;
    public final EObject entryRuleVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorType = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1433:2: (iv_ruleVectorType= ruleVectorType EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1434:2: iv_ruleVectorType= ruleVectorType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVectorTypeRule()); 
            }
            pushFollow(FOLLOW_ruleVectorType_in_entryRuleVectorType3605);
            iv_ruleVectorType=ruleVectorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVectorType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVectorType3615); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVectorType"


    // $ANTLR start "ruleVectorType"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1441:1: ruleVectorType returns [EObject current=null] : ( () otherlv_1= 'vector' ) ;
    public final EObject ruleVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1444:28: ( ( () otherlv_1= 'vector' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1445:1: ( () otherlv_1= 'vector' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1445:1: ( () otherlv_1= 'vector' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1445:2: () otherlv_1= 'vector'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1445:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1446:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVectorTypeAccess().getVectorTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleVectorType3661); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVectorTypeAccess().getVectorKeyword_1());
                  
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
    // $ANTLR end "ruleVectorType"


    // $ANTLR start "entryRuleStringType"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1463:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1464:2: (iv_ruleStringType= ruleStringType EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1465:2: iv_ruleStringType= ruleStringType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringTypeRule()); 
            }
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType3697);
            iv_ruleStringType=ruleStringType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType3707); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1472:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1475:28: ( ( () otherlv_1= 'string' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1476:1: ( () otherlv_1= 'string' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1476:1: ( () otherlv_1= 'string' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1476:2: () otherlv_1= 'string'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1476:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1477:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleStringType3753); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringKeyword_1());
                  
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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleVoidType"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1494:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1495:2: (iv_ruleVoidType= ruleVoidType EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1496:2: iv_ruleVoidType= ruleVoidType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVoidTypeRule()); 
            }
            pushFollow(FOLLOW_ruleVoidType_in_entryRuleVoidType3789);
            iv_ruleVoidType=ruleVoidType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVoidType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoidType3799); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVoidType"


    // $ANTLR start "ruleVoidType"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1503:1: ruleVoidType returns [EObject current=null] : ( () otherlv_1= 'void' ) ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1506:28: ( ( () otherlv_1= 'void' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1507:1: ( () otherlv_1= 'void' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1507:1: ( () otherlv_1= 'void' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1507:2: () otherlv_1= 'void'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1507:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1508:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVoidTypeAccess().getVoidTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleVoidType3845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVoidTypeAccess().getVoidKeyword_1());
                  
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
    // $ANTLR end "ruleVoidType"


    // $ANTLR start "entryRuleVarTypeSpecifier"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1525:1: entryRuleVarTypeSpecifier returns [EObject current=null] : iv_ruleVarTypeSpecifier= ruleVarTypeSpecifier EOF ;
    public final EObject entryRuleVarTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarTypeSpecifier = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1526:2: (iv_ruleVarTypeSpecifier= ruleVarTypeSpecifier EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1527:2: iv_ruleVarTypeSpecifier= ruleVarTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleVarTypeSpecifier_in_entryRuleVarTypeSpecifier3881);
            iv_ruleVarTypeSpecifier=ruleVarTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarTypeSpecifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarTypeSpecifier3891); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1534:1: ruleVarTypeSpecifier returns [EObject current=null] : (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BoolType_2= ruleBoolType | this_VectorType_3= ruleVectorType | this_StringType_4= ruleStringType ) ;
    public final EObject ruleVarTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject this_IntType_0 = null;

        EObject this_FloatType_1 = null;

        EObject this_BoolType_2 = null;

        EObject this_VectorType_3 = null;

        EObject this_StringType_4 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1537:28: ( (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BoolType_2= ruleBoolType | this_VectorType_3= ruleVectorType | this_StringType_4= ruleStringType ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1538:1: (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BoolType_2= ruleBoolType | this_VectorType_3= ruleVectorType | this_StringType_4= ruleStringType )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1538:1: (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BoolType_2= ruleBoolType | this_VectorType_3= ruleVectorType | this_StringType_4= ruleStringType )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt13=1;
                }
                break;
            case 35:
                {
                alt13=2;
                }
                break;
            case 36:
                {
                alt13=3;
                }
                break;
            case 16:
                {
                alt13=4;
                }
                break;
            case 37:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1539:5: this_IntType_0= ruleIntType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarTypeSpecifierAccess().getIntTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntType_in_ruleVarTypeSpecifier3938);
                    this_IntType_0=ruleIntType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1549:5: this_FloatType_1= ruleFloatType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarTypeSpecifierAccess().getFloatTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatType_in_ruleVarTypeSpecifier3965);
                    this_FloatType_1=ruleFloatType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1559:5: this_BoolType_2= ruleBoolType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarTypeSpecifierAccess().getBoolTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolType_in_ruleVarTypeSpecifier3992);
                    this_BoolType_2=ruleBoolType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolType_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1569:5: this_VectorType_3= ruleVectorType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarTypeSpecifierAccess().getVectorTypeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVectorType_in_ruleVarTypeSpecifier4019);
                    this_VectorType_3=ruleVectorType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VectorType_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1579:5: this_StringType_4= ruleStringType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarTypeSpecifierAccess().getStringTypeParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringType_in_ruleVarTypeSpecifier4046);
                    this_StringType_4=ruleStringType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringType_4; 
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
    // $ANTLR end "ruleVarTypeSpecifier"


    // $ANTLR start "entryRuleFunTypeSpecifier"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1595:1: entryRuleFunTypeSpecifier returns [EObject current=null] : iv_ruleFunTypeSpecifier= ruleFunTypeSpecifier EOF ;
    public final EObject entryRuleFunTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunTypeSpecifier = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1596:2: (iv_ruleFunTypeSpecifier= ruleFunTypeSpecifier EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1597:2: iv_ruleFunTypeSpecifier= ruleFunTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleFunTypeSpecifier_in_entryRuleFunTypeSpecifier4081);
            iv_ruleFunTypeSpecifier=ruleFunTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunTypeSpecifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunTypeSpecifier4091); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1604:1: ruleFunTypeSpecifier returns [EObject current=null] : (this_VoidType_0= ruleVoidType | this_VarTypeSpecifier_1= ruleVarTypeSpecifier ) ;
    public final EObject ruleFunTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject this_VoidType_0 = null;

        EObject this_VarTypeSpecifier_1 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1607:28: ( (this_VoidType_0= ruleVoidType | this_VarTypeSpecifier_1= ruleVarTypeSpecifier ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1608:1: (this_VoidType_0= ruleVoidType | this_VarTypeSpecifier_1= ruleVarTypeSpecifier )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1608:1: (this_VoidType_0= ruleVoidType | this_VarTypeSpecifier_1= ruleVarTypeSpecifier )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            else if ( (LA14_0==16||(LA14_0>=34 && LA14_0<=37)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1609:5: this_VoidType_0= ruleVoidType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunTypeSpecifierAccess().getVoidTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVoidType_in_ruleFunTypeSpecifier4138);
                    this_VoidType_0=ruleVoidType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VoidType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1619:5: this_VarTypeSpecifier_1= ruleVarTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunTypeSpecifierAccess().getVarTypeSpecifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarTypeSpecifier_in_ruleFunTypeSpecifier4165);
                    this_VarTypeSpecifier_1=ruleVarTypeSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VarTypeSpecifier_1; 
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1635:1: entryRuleParams returns [EObject current=null] : iv_ruleParams= ruleParams EOF ;
    public final EObject entryRuleParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParams = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1636:2: (iv_ruleParams= ruleParams EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1637:2: iv_ruleParams= ruleParams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamsRule()); 
            }
            pushFollow(FOLLOW_ruleParams_in_entryRuleParams4200);
            iv_ruleParams=ruleParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParams; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParams4210); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1644:1: ruleParams returns [EObject current=null] : ( ( (lv_param_0_0= 'void' ) ) | ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* ) ) ;
    public final EObject ruleParams() throws RecognitionException {
        EObject current = null;

        Token lv_param_0_0=null;
        Token otherlv_2=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1647:28: ( ( ( (lv_param_0_0= 'void' ) ) | ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1648:1: ( ( (lv_param_0_0= 'void' ) ) | ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1648:1: ( ( (lv_param_0_0= 'void' ) ) | ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            else if ( (LA16_0==16||(LA16_0>=30 && LA16_0<=32)||(LA16_0>=34 && LA16_0<=37)) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1648:2: ( (lv_param_0_0= 'void' ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1648:2: ( (lv_param_0_0= 'void' ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1649:1: (lv_param_0_0= 'void' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1649:1: (lv_param_0_0= 'void' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1650:3: lv_param_0_0= 'void'
                    {
                    lv_param_0_0=(Token)match(input,38,FOLLOW_38_in_ruleParams4253); if (state.failed) return current;
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1664:6: ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1664:6: ( ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )* )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1664:7: ( (lv_params_1_0= ruleVarDeclaration ) ) (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )*
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1664:7: ( (lv_params_1_0= ruleVarDeclaration ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1665:1: (lv_params_1_0= ruleVarDeclaration )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1665:1: (lv_params_1_0= ruleVarDeclaration )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1666:3: lv_params_1_0= ruleVarDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParamsAccess().getParamsVarDeclarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVarDeclaration_in_ruleParams4294);
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

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1682:2: (otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==18) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1682:4: otherlv_2= ',' ( (lv_params_3_0= ruleVarDeclaration ) )
                    	    {
                    	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleParams4307); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getParamsAccess().getCommaKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1686:1: ( (lv_params_3_0= ruleVarDeclaration ) )
                    	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1687:1: (lv_params_3_0= ruleVarDeclaration )
                    	    {
                    	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1687:1: (lv_params_3_0= ruleVarDeclaration )
                    	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1688:3: lv_params_3_0= ruleVarDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getParamsAccess().getParamsVarDeclarationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVarDeclaration_in_ruleParams4328);
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
                    	    break loop15;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1712:1: entryRuleCompoundStatement returns [EObject current=null] : iv_ruleCompoundStatement= ruleCompoundStatement EOF ;
    public final EObject entryRuleCompoundStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1713:2: (iv_ruleCompoundStatement= ruleCompoundStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1714:2: iv_ruleCompoundStatement= ruleCompoundStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompoundStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement4367);
            iv_ruleCompoundStatement=ruleCompoundStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompoundStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStatement4377); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1721:1: ruleCompoundStatement returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleCompoundStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_contents_2_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1724:28: ( ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1725:1: ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1725:1: ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1725:2: () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1725:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1726:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCompoundStatementAccess().getCompoundStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleCompoundStatement4423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCompoundStatementAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1735:1: ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_INT && LA17_0<=RULE_STRING)||(LA17_0>=11 && LA17_0<=12)||(LA17_0>=14 && LA17_0<=17)||(LA17_0>=30 && LA17_0<=32)||(LA17_0>=34 && LA17_0<=37)||LA17_0==39||LA17_0==41||(LA17_0>=43 && LA17_0<=45)||(LA17_0>=49 && LA17_0<=51)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1736:1: (lv_contents_2_0= ruleVarDeclarationOrStatement )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1736:1: (lv_contents_2_0= ruleVarDeclarationOrStatement )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1737:3: lv_contents_2_0= ruleVarDeclarationOrStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompoundStatementAccess().getContentsVarDeclarationOrStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVarDeclarationOrStatement_in_ruleCompoundStatement4444);
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
            	    break loop17;
                }
            } while (true);

            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleCompoundStatement4457); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1765:1: entryRuleVarDeclarationOrStatement returns [EObject current=null] : iv_ruleVarDeclarationOrStatement= ruleVarDeclarationOrStatement EOF ;
    public final EObject entryRuleVarDeclarationOrStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclarationOrStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1766:2: (iv_ruleVarDeclarationOrStatement= ruleVarDeclarationOrStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1767:2: iv_ruleVarDeclarationOrStatement= ruleVarDeclarationOrStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclarationOrStatementRule()); 
            }
            pushFollow(FOLLOW_ruleVarDeclarationOrStatement_in_entryRuleVarDeclarationOrStatement4493);
            iv_ruleVarDeclarationOrStatement=ruleVarDeclarationOrStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDeclarationOrStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDeclarationOrStatement4503); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1774:1: ruleVarDeclarationOrStatement returns [EObject current=null] : ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_Statement_2= ruleStatement ) ;
    public final EObject ruleVarDeclarationOrStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_VarDeclaration_0 = null;

        EObject this_Statement_2 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1777:28: ( ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_Statement_2= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1778:1: ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_Statement_2= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1778:1: ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_Statement_2= ruleStatement )
            int alt18=2;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
            case 32:
            case 34:
            case 35:
            case 36:
            case 37:
                {
                alt18=1;
                }
                break;
            case 16:
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==17) ) {
                    alt18=2;
                }
                else if ( (LA18_2==RULE_ID) ) {
                    alt18=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case RULE_STRING:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
            case 39:
            case 41:
            case 43:
            case 44:
            case 45:
            case 49:
            case 50:
            case 51:
                {
                alt18=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1778:2: (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1778:2: (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1779:5: this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarDeclarationOrStatementAccess().getVarDeclarationParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarDeclaration_in_ruleVarDeclarationOrStatement4551);
                    this_VarDeclaration_0=ruleVarDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VarDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleVarDeclarationOrStatement4562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVarDeclarationOrStatementAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1793:5: this_Statement_2= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarDeclarationOrStatementAccess().getStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleVarDeclarationOrStatement4591);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1809:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1810:2: (iv_ruleStatement= ruleStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1811:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement4626);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement4636); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1818:1: ruleStatement returns [EObject current=null] : (this_ExpressionStatement_0= ruleExpressionStatement | this_CompoundStatement_1= ruleCompoundStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement ) ;
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
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1821:28: ( (this_ExpressionStatement_0= ruleExpressionStatement | this_CompoundStatement_1= ruleCompoundStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1822:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_CompoundStatement_1= ruleCompoundStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1822:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_CompoundStatement_1= ruleCompoundStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement )
            int alt19=9;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_ID:
            case RULE_STRING:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
                {
                alt19=1;
                }
                break;
            case 39:
                {
                alt19=2;
                }
                break;
            case 41:
                {
                alt19=3;
                }
                break;
            case 43:
                {
                alt19=4;
                }
                break;
            case 44:
                {
                alt19=5;
                }
                break;
            case 45:
                {
                alt19=6;
                }
                break;
            case 49:
                {
                alt19=7;
                }
                break;
            case 50:
                {
                alt19=8;
                }
                break;
            case 51:
                {
                alt19=9;
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1823:5: this_ExpressionStatement_0= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExpressionStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionStatement_in_ruleStatement4683);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1833:5: this_CompoundStatement_1= ruleCompoundStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getCompoundStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompoundStatement_in_ruleStatement4710);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1843:5: this_IfElseStatement_2= ruleIfElseStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfElseStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfElseStatement_in_ruleStatement4737);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1853:5: this_WhileStatement_3= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhileStatement_in_ruleStatement4764);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1863:5: this_ForStatement_4= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForStatement_in_ruleStatement4791);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1873:5: this_SwitchStatement_5= ruleSwitchStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSwitchStatement_in_ruleStatement4818);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1883:5: this_ReturnStatement_6= ruleReturnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturnStatement_in_ruleStatement4845);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1893:5: this_ContinueStatement_7= ruleContinueStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getContinueStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContinueStatement_in_ruleStatement4872);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1903:5: this_BreakStatement_8= ruleBreakStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getBreakStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBreakStatement_in_ruleStatement4899);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1919:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1920:2: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1921:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionStatementRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionStatement_in_entryRuleExpressionStatement4934);
            iv_ruleExpressionStatement=ruleExpressionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionStatement4944); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1928:1: ruleExpressionStatement returns [EObject current=null] : ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) | ( () otherlv_3= ';' ) ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1931:28: ( ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) | ( () otherlv_3= ';' ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1932:1: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) | ( () otherlv_3= ';' ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1932:1: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) | ( () otherlv_3= ';' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_INT && LA20_0<=RULE_STRING)||LA20_0==12||(LA20_0>=14 && LA20_0<=17)) ) {
                alt20=1;
            }
            else if ( (LA20_0==11) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1932:2: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1932:2: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1932:3: ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';'
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1932:3: ( (lv_expression_0_0= ruleExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1933:1: (lv_expression_0_0= ruleExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1933:1: (lv_expression_0_0= ruleExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1934:3: lv_expression_0_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionStatementAccess().getExpressionExpressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionStatement4991);
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

                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleExpressionStatement5003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1955:6: ( () otherlv_3= ';' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1955:6: ( () otherlv_3= ';' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1955:7: () otherlv_3= ';'
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1955:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1956:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionStatementAccess().getEmptyExpressionStatementAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleExpressionStatement5032); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1973:1: entryRuleIfElseStatement returns [EObject current=null] : iv_ruleIfElseStatement= ruleIfElseStatement EOF ;
    public final EObject entryRuleIfElseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1974:2: (iv_ruleIfElseStatement= ruleIfElseStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1975:2: iv_ruleIfElseStatement= ruleIfElseStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfElseStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIfElseStatement_in_entryRuleIfElseStatement5069);
            iv_ruleIfElseStatement=ruleIfElseStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfElseStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfElseStatement5079); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1982:1: ruleIfElseStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) ;
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
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1985:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1986:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1986:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1986:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleIfElseStatement5116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfElseStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleIfElseStatement5128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfElseStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1994:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1995:1: (lv_condition_2_0= ruleExpression )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1995:1: (lv_condition_2_0= ruleExpression )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:1996:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfElseStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfElseStatement5149);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleIfElseStatement5161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfElseStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2016:1: ( (lv_ifStatement_4_0= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2017:1: (lv_ifStatement_4_0= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2017:1: (lv_ifStatement_4_0= ruleStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2018:3: lv_ifStatement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfElseStatementAccess().getIfStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleIfElseStatement5182);
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

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2034:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                int LA21_1 = input.LA(2);

                if ( (synpred1_InternalXS()) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2034:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2034:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2034:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleIfElseStatement5203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfElseStatementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2039:2: ( (lv_elseStatement_6_0= ruleStatement ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2040:1: (lv_elseStatement_6_0= ruleStatement )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2040:1: (lv_elseStatement_6_0= ruleStatement )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2041:3: lv_elseStatement_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfElseStatementAccess().getElseStatementStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIfElseStatement5225);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2065:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2066:2: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2067:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement5263);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhileStatement5273); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2074:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statement_4_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2077:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2078:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2078:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2078:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleWhileStatement5310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleWhileStatement5322); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2086:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2087:1: (lv_condition_2_0= ruleExpression )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2087:1: (lv_condition_2_0= ruleExpression )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2088:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleWhileStatement5343);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleWhileStatement5355); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2108:1: ( (lv_statement_4_0= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2109:1: (lv_statement_4_0= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2109:1: (lv_statement_4_0= ruleStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2110:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleWhileStatement5376);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2134:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2135:2: (iv_ruleForStatement= ruleForStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2136:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_ruleForStatement_in_entryRuleForStatement5412);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForStatement5422); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2143:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) ) ;
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
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2146:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2147:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2147:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2147:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleForStatement5459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleForStatement5471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2155:1: ( (lv_var_2_0= ruleForVarDeclaration ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2156:1: (lv_var_2_0= ruleForVarDeclaration )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2156:1: (lv_var_2_0= ruleForVarDeclaration )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2157:3: lv_var_2_0= ruleForVarDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getVarForVarDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForVarDeclaration_in_ruleForStatement5492);
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

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleForStatement5504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2177:1: ( (lv_op_4_0= ruleRelOp ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2178:1: (lv_op_4_0= ruleRelOp )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2178:1: (lv_op_4_0= ruleRelOp )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2179:3: lv_op_4_0= ruleRelOp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getOpRelOpParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRelOp_in_ruleForStatement5525);
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

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2195:2: ( (lv_expression_5_0= ruleExpression ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2196:1: (lv_expression_5_0= ruleExpression )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2196:1: (lv_expression_5_0= ruleExpression )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2197:3: lv_expression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getExpressionExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleForStatement5546);
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

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleForStatement5558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2217:1: ( (lv_statement_7_0= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2218:1: (lv_statement_7_0= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2218:1: (lv_statement_7_0= ruleStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2219:3: lv_statement_7_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getStatementStatementParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleForStatement5579);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2243:1: entryRuleSwitchStatement returns [EObject current=null] : iv_ruleSwitchStatement= ruleSwitchStatement EOF ;
    public final EObject entryRuleSwitchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2244:2: (iv_ruleSwitchStatement= ruleSwitchStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2245:2: iv_ruleSwitchStatement= ruleSwitchStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement5615);
            iv_ruleSwitchStatement=ruleSwitchStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchStatement5625); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2252:1: ruleSwitchStatement returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}' ) ;
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
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2255:28: ( (otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2256:1: (otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2256:1: (otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2256:3: otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleSwitchStatement5662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchStatementAccess().getSwitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleSwitchStatement5674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2264:1: ( (otherlv_2= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2265:1: (otherlv_2= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2265:1: (otherlv_2= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2266:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSwitchStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSwitchStatement5694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getSwitchStatementAccess().getVarVarDeclarationCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSwitchStatement5706); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleSwitchStatement5718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitchStatementAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2285:1: ( (lv_cases_5_0= ruleSwitchCase ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==46) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2286:1: (lv_cases_5_0= ruleSwitchCase )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2286:1: (lv_cases_5_0= ruleSwitchCase )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2287:3: lv_cases_5_0= ruleSwitchCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getCasesSwitchCaseParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSwitchCase_in_ruleSwitchStatement5739);
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
            	    break loop22;
                }
            } while (true);

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2303:3: ( (lv_default_6_0= ruleSwitchDefault ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2304:1: (lv_default_6_0= ruleSwitchDefault )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2304:1: (lv_default_6_0= ruleSwitchDefault )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2305:3: lv_default_6_0= ruleSwitchDefault
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getDefaultSwitchDefaultParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSwitchDefault_in_ruleSwitchStatement5761);
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

            otherlv_7=(Token)match(input,40,FOLLOW_40_in_ruleSwitchStatement5774); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2333:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2334:2: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2335:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase5810);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchCase5820); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2342:1: ruleSwitchCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_var_1_0= ruleLiteralOrConstantNum ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) ) otherlv_5= '}' ) ;
    public final EObject ruleSwitchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_var_1_0 = null;

        EObject lv_statement_4_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2345:28: ( (otherlv_0= 'case' ( (lv_var_1_0= ruleLiteralOrConstantNum ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) ) otherlv_5= '}' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2346:1: (otherlv_0= 'case' ( (lv_var_1_0= ruleLiteralOrConstantNum ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) ) otherlv_5= '}' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2346:1: (otherlv_0= 'case' ( (lv_var_1_0= ruleLiteralOrConstantNum ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) ) otherlv_5= '}' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2346:3: otherlv_0= 'case' ( (lv_var_1_0= ruleLiteralOrConstantNum ) ) otherlv_2= ':' otherlv_3= '{' ( (lv_statement_4_0= ruleStatement ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleSwitchCase5857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchCaseAccess().getCaseKeyword_0());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2350:1: ( (lv_var_1_0= ruleLiteralOrConstantNum ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2351:1: (lv_var_1_0= ruleLiteralOrConstantNum )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2351:1: (lv_var_1_0= ruleLiteralOrConstantNum )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2352:3: lv_var_1_0= ruleLiteralOrConstantNum
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getVarLiteralOrConstantNumParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteralOrConstantNum_in_ruleSwitchCase5878);
            lv_var_1_0=ruleLiteralOrConstantNum();

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
                      		"LiteralOrConstantNum");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleSwitchCase5890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSwitchCaseAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleSwitchCase5902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchCaseAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2376:1: ( (lv_statement_4_0= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2377:1: (lv_statement_4_0= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2377:1: (lv_statement_4_0= ruleStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2378:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleSwitchCase5923);
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

            otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleSwitchCase5935); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2406:1: entryRuleSwitchDefault returns [EObject current=null] : iv_ruleSwitchDefault= ruleSwitchDefault EOF ;
    public final EObject entryRuleSwitchDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchDefault = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2407:2: (iv_ruleSwitchDefault= ruleSwitchDefault EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2408:2: iv_ruleSwitchDefault= ruleSwitchDefault EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchDefaultRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchDefault_in_entryRuleSwitchDefault5971);
            iv_ruleSwitchDefault=ruleSwitchDefault();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchDefault; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchDefault5981); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2415:1: ruleSwitchDefault returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= ':' otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) ) otherlv_4= '}' ) ;
    public final EObject ruleSwitchDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statement_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2418:28: ( (otherlv_0= 'default' otherlv_1= ':' otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) ) otherlv_4= '}' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2419:1: (otherlv_0= 'default' otherlv_1= ':' otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) ) otherlv_4= '}' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2419:1: (otherlv_0= 'default' otherlv_1= ':' otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) ) otherlv_4= '}' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2419:3: otherlv_0= 'default' otherlv_1= ':' otherlv_2= '{' ( (lv_statement_3_0= ruleStatement ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleSwitchDefault6018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchDefaultAccess().getDefaultKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleSwitchDefault6030); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchDefaultAccess().getColonKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleSwitchDefault6042); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSwitchDefaultAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2431:1: ( (lv_statement_3_0= ruleStatement ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2432:1: (lv_statement_3_0= ruleStatement )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2432:1: (lv_statement_3_0= ruleStatement )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2433:3: lv_statement_3_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchDefaultAccess().getStatementStatementParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleSwitchDefault6063);
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

            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleSwitchDefault6075); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2461:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2462:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2463:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement6111);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStatement6121); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2470:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2473:28: ( ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2474:1: ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2474:1: ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2474:2: () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2474:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2475:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleReturnStatement6167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getReturnKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2484:1: (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2484:3: otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleReturnStatement6180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getReturnStatementAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2488:1: ( (lv_expression_3_0= ruleExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2489:1: (lv_expression_3_0= ruleExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2489:1: (lv_expression_3_0= ruleExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2490:3: lv_expression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReturnStatement6201);
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

                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleReturnStatement6213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReturnStatementAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_ruleReturnStatement6227); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2522:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2523:2: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2524:2: iv_ruleContinueStatement= ruleContinueStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContinueStatementRule()); 
            }
            pushFollow(FOLLOW_ruleContinueStatement_in_entryRuleContinueStatement6263);
            iv_ruleContinueStatement=ruleContinueStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContinueStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContinueStatement6273); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2531:1: ruleContinueStatement returns [EObject current=null] : ( () otherlv_1= 'continue' otherlv_2= ';' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2534:28: ( ( () otherlv_1= 'continue' otherlv_2= ';' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2535:1: ( () otherlv_1= 'continue' otherlv_2= ';' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2535:1: ( () otherlv_1= 'continue' otherlv_2= ';' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2535:2: () otherlv_1= 'continue' otherlv_2= ';'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2535:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2536:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContinueStatementAccess().getContinueStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleContinueStatement6319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContinueStatementAccess().getContinueKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleContinueStatement6331); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2557:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2558:2: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2559:2: iv_ruleBreakStatement= ruleBreakStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBreakStatement_in_entryRuleBreakStatement6367);
            iv_ruleBreakStatement=ruleBreakStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakStatement6377); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2566:1: ruleBreakStatement returns [EObject current=null] : ( () otherlv_1= 'break' otherlv_2= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2569:28: ( ( () otherlv_1= 'break' otherlv_2= ';' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2570:1: ( () otherlv_1= 'break' otherlv_2= ';' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2570:1: ( () otherlv_1= 'break' otherlv_2= ';' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2570:2: () otherlv_1= 'break' otherlv_2= ';'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2570:2: ()
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2571:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBreakStatementAccess().getBreakStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleBreakStatement6423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBreakStatementAccess().getBreakKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleBreakStatement6435); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2592:1: entryRulePostFixOp returns [String current=null] : iv_rulePostFixOp= rulePostFixOp EOF ;
    public final String entryRulePostFixOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePostFixOp = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2593:2: (iv_rulePostFixOp= rulePostFixOp EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2594:2: iv_rulePostFixOp= rulePostFixOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostFixOpRule()); 
            }
            pushFollow(FOLLOW_rulePostFixOp_in_entryRulePostFixOp6472);
            iv_rulePostFixOp=rulePostFixOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostFixOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostFixOp6483); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2601:1: rulePostFixOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' ) ;
    public final AntlrDatatypeRuleToken rulePostFixOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2604:28: ( (kw= '++' | kw= '--' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2605:1: (kw= '++' | kw= '--' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2605:1: (kw= '++' | kw= '--' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            else if ( (LA25_0==53) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2606:2: kw= '++'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_rulePostFixOp6521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPostFixOpAccess().getPlusSignPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2613:2: kw= '--'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_rulePostFixOp6540); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2626:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2627:2: (iv_ruleExpression= ruleExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2628:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6580);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6590); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2635:1: ruleExpression returns [EObject current=null] : ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) | ( (lv_expression_4_0= ruleSimpleExpression ) ) | ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) ) ) ;
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
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2638:28: ( ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) | ( (lv_expression_4_0= ruleSimpleExpression ) ) | ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2639:1: ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) | ( (lv_expression_4_0= ruleSimpleExpression ) ) | ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2639:1: ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) | ( (lv_expression_4_0= ruleSimpleExpression ) ) | ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) ) )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 11:
                case 12:
                case 17:
                case 18:
                case 19:
                case 54:
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
                    alt26=2;
                    }
                    break;
                case 20:
                    {
                    alt26=1;
                    }
                    break;
                case 52:
                case 53:
                    {
                    alt26=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA26_0==RULE_INT||LA26_0==RULE_STRING||LA26_0==12||(LA26_0>=14 && LA26_0<=17)) ) {
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2639:2: ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2639:2: ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2639:3: () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2639:3: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2640:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionAccess().getAssignmentExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2645:2: ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2645:3: ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2645:3: ( (lv_var_1_0= ruleVar ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2646:1: (lv_var_1_0= ruleVar )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2646:1: (lv_var_1_0= ruleVar )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2647:3: lv_var_1_0= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getVarVarParserRuleCall_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVar_in_ruleExpression6647);
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

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleExpression6659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getEqualsSignKeyword_0_1_1());
                          
                    }
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2667:1: ( (lv_expression_3_0= ruleExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2668:1: (lv_expression_3_0= ruleExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2668:1: (lv_expression_3_0= ruleExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2669:3: lv_expression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_0_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression6680);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2686:6: ( (lv_expression_4_0= ruleSimpleExpression ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2686:6: ( (lv_expression_4_0= ruleSimpleExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2687:1: (lv_expression_4_0= ruleSimpleExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2687:1: (lv_expression_4_0= ruleSimpleExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2688:3: lv_expression_4_0= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionSimpleExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleExpression6709);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2705:6: ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2705:6: ( () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2705:7: () ( (otherlv_6= RULE_ID ) ) ( (lv_op_7_0= rulePostFixOp ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2705:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2706:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionAccess().getPostfixExpressionAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2711:2: ( (otherlv_6= RULE_ID ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2712:1: (otherlv_6= RULE_ID )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2712:1: (otherlv_6= RULE_ID )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2713:3: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionRule());
                      	        }
                              
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression6745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getPostfixVarVarDeclarationCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2724:2: ( (lv_op_7_0= rulePostFixOp ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2725:1: (lv_op_7_0= rulePostFixOp )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2725:1: (lv_op_7_0= rulePostFixOp )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2726:3: lv_op_7_0= rulePostFixOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getOpPostFixOpParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePostFixOp_in_ruleExpression6766);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2750:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2751:2: (iv_ruleVar= ruleVar EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2752:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar6803);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar6813); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2759:1: ruleVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2762:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2763:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2763:1: ( (otherlv_0= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2764:1: (otherlv_0= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2764:1: (otherlv_0= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2765:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVarRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar6857); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2784:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2785:2: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2786:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression6892);
            iv_ruleSimpleExpression=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpression6902); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2793:1: ruleSimpleExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2796:28: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2797:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2797:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2798:5: this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSimpleExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleSimpleExpression6949);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2806:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==54) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2806:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2806:2: ()
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2807:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSimpleExpressionAccess().getOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2812:2: ( (lv_op_2_0= '||' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2813:1: (lv_op_2_0= '||' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2813:1: (lv_op_2_0= '||' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2814:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,54,FOLLOW_54_in_ruleSimpleExpression6976); if (state.failed) return current;
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

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2827:2: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2828:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2828:1: (lv_right_3_0= ruleAndExpression )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2829:3: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleSimpleExpression7010);
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
            	    break loop27;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2853:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2854:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2855:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression7048);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression7058); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2862:1: ruleAndExpression returns [EObject current=null] : (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_EqualsExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2865:28: ( (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2866:1: (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2866:1: (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2867:5: this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualsExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEqualsExpression_in_ruleAndExpression7105);
            this_EqualsExpression_0=ruleEqualsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EqualsExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2875:1: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==55) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2875:2: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2875:2: ()
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2876:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionAccess().getAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2881:2: ( (lv_op_2_0= '&&' ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2882:1: (lv_op_2_0= '&&' )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2882:1: (lv_op_2_0= '&&' )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2883:3: lv_op_2_0= '&&'
            	    {
            	    lv_op_2_0=(Token)match(input,55,FOLLOW_55_in_ruleAndExpression7132); if (state.failed) return current;
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

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2896:2: ( (lv_right_3_0= ruleEqualsExpression ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2897:1: (lv_right_3_0= ruleEqualsExpression )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2897:1: (lv_right_3_0= ruleEqualsExpression )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2898:3: lv_right_3_0= ruleEqualsExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualsExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEqualsExpression_in_ruleAndExpression7166);
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualsExpression"
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2922:1: entryRuleEqualsExpression returns [EObject current=null] : iv_ruleEqualsExpression= ruleEqualsExpression EOF ;
    public final EObject entryRuleEqualsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2923:2: (iv_ruleEqualsExpression= ruleEqualsExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2924:2: iv_ruleEqualsExpression= ruleEqualsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsExpression_in_entryRuleEqualsExpression7204);
            iv_ruleEqualsExpression=ruleEqualsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsExpression7214); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2931:1: ruleEqualsExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? ) ;
    public final EObject ruleEqualsExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2934:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2935:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2935:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2936:5: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEqualsExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparisonExpression_in_ruleEqualsExpression7261);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparisonExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2944:1: ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=56 && LA29_0<=57)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2944:2: () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2944:2: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2945:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEqualsExpressionAccess().getEqualsLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2950:2: ( (lv_op_2_0= ruleEqOp ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2951:1: (lv_op_2_0= ruleEqOp )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2951:1: (lv_op_2_0= ruleEqOp )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2952:3: lv_op_2_0= ruleEqOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualsExpressionAccess().getOpEqOpParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEqOp_in_ruleEqualsExpression7291);
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

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2968:2: ( (lv_right_3_0= ruleComparisonExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2969:1: (lv_right_3_0= ruleComparisonExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2969:1: (lv_right_3_0= ruleComparisonExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2970:3: lv_right_3_0= ruleComparisonExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualsExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComparisonExpression_in_ruleEqualsExpression7312);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2994:1: entryRuleEqOp returns [String current=null] : iv_ruleEqOp= ruleEqOp EOF ;
    public final String entryRuleEqOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqOp = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2995:2: (iv_ruleEqOp= ruleEqOp EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2996:2: iv_ruleEqOp= ruleEqOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqOpRule()); 
            }
            pushFollow(FOLLOW_ruleEqOp_in_entryRuleEqOp7351);
            iv_ruleEqOp=ruleEqOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqOp7362); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3003:1: ruleEqOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3006:28: ( (kw= '==' | kw= '!=' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3007:1: (kw= '==' | kw= '!=' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3007:1: (kw= '==' | kw= '!=' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            else if ( (LA30_0==57) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3008:2: kw= '=='
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleEqOp7400); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqOpAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3015:2: kw= '!='
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleEqOp7419); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3028:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3029:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3030:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression7459);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonExpression7469); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3037:1: ruleComparisonExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3040:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3041:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3041:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3042:5: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleComparisonExpression7516);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3050:1: ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=58 && LA31_0<=61)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3050:2: () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3050:2: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3051:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getComparisonExpressionAccess().getComparisonLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3056:2: ( (lv_op_2_0= ruleRelOp ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3057:1: (lv_op_2_0= ruleRelOp )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3057:1: (lv_op_2_0= ruleRelOp )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3058:3: lv_op_2_0= ruleRelOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOpRelOpParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRelOp_in_ruleComparisonExpression7546);
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

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3074:2: ( (lv_right_3_0= ruleAdditiveExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3075:1: (lv_right_3_0= ruleAdditiveExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3075:1: (lv_right_3_0= ruleAdditiveExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3076:3: lv_right_3_0= ruleAdditiveExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleComparisonExpression7567);
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3100:1: entryRuleRelOp returns [String current=null] : iv_ruleRelOp= ruleRelOp EOF ;
    public final String entryRuleRelOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelOp = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3101:2: (iv_ruleRelOp= ruleRelOp EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3102:2: iv_ruleRelOp= ruleRelOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelOpRule()); 
            }
            pushFollow(FOLLOW_ruleRelOp_in_entryRuleRelOp7606);
            iv_ruleRelOp=ruleRelOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelOp7617); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3109:1: ruleRelOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3112:28: ( (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3113:1: (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3113:1: (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt32=1;
                }
                break;
            case 59:
                {
                alt32=2;
                }
                break;
            case 60:
                {
                alt32=3;
                }
                break;
            case 61:
                {
                alt32=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3114:2: kw= '<='
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleRelOp7655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3121:2: kw= '<'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleRelOp7674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3128:2: kw= '>'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleRelOp7693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3135:2: kw= '>='
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleRelOp7712); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3148:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3149:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3150:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression7752);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression7762); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3157:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3160:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3161:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3161:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3162:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7809);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3170:1: ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==12||LA33_0==62) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3170:2: () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3170:2: ()
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3171:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getTermLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3176:2: ( (lv_op_2_0= ruleAddOp ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3177:1: (lv_op_2_0= ruleAddOp )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3177:1: (lv_op_2_0= ruleAddOp )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3178:3: lv_op_2_0= ruleAddOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpAddOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddOp_in_ruleAdditiveExpression7839);
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

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3194:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3195:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3195:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3196:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7860);
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
            	    break loop33;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3220:1: entryRuleAddOp returns [String current=null] : iv_ruleAddOp= ruleAddOp EOF ;
    public final String entryRuleAddOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddOp = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3221:2: (iv_ruleAddOp= ruleAddOp EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3222:2: iv_ruleAddOp= ruleAddOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddOpRule()); 
            }
            pushFollow(FOLLOW_ruleAddOp_in_entryRuleAddOp7899);
            iv_ruleAddOp=ruleAddOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddOp7910); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3229:1: ruleAddOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAddOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3232:28: ( (kw= '+' | kw= '-' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3233:1: (kw= '+' | kw= '-' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3233:1: (kw= '+' | kw= '-' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==62) ) {
                alt34=1;
            }
            else if ( (LA34_0==12) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3234:2: kw= '+'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleAddOp7948); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAddOpAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3241:2: kw= '-'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleAddOp7967); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3254:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3255:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3256:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression8007);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression8017); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3263:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3266:28: ( (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3267:1: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3267:1: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3268:5: this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getAtomParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAtom_in_ruleMultiplicativeExpression8064);
            this_Atom_0=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Atom_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3276:1: ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=63 && LA35_0<=65)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3276:2: () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3276:2: ()
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3277:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getFactorLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3282:2: ( (lv_op_2_0= ruleMulOp ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3283:1: (lv_op_2_0= ruleMulOp )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3283:1: (lv_op_2_0= ruleMulOp )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3284:3: lv_op_2_0= ruleMulOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpMulOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMulOp_in_ruleMultiplicativeExpression8094);
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

            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3300:2: ( (lv_right_3_0= ruleAtom ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3301:1: (lv_right_3_0= ruleAtom )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3301:1: (lv_right_3_0= ruleAtom )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3302:3: lv_right_3_0= ruleAtom
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightAtomParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAtom_in_ruleMultiplicativeExpression8115);
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
            	    break loop35;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3326:1: entryRuleMulOp returns [String current=null] : iv_ruleMulOp= ruleMulOp EOF ;
    public final String entryRuleMulOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMulOp = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3327:2: (iv_ruleMulOp= ruleMulOp EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3328:2: iv_ruleMulOp= ruleMulOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOpRule()); 
            }
            pushFollow(FOLLOW_ruleMulOp_in_entryRuleMulOp8154);
            iv_ruleMulOp=ruleMulOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOp8165); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3335:1: ruleMulOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMulOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3338:28: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3339:1: (kw= '*' | kw= '/' | kw= '%' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3339:1: (kw= '*' | kw= '/' | kw= '%' )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt36=1;
                }
                break;
            case 64:
                {
                alt36=2;
                }
                break;
            case 65:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3340:2: kw= '*'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleMulOp8203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMulOpAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3347:2: kw= '/'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleMulOp8222); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMulOpAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3354:2: kw= '%'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleMulOp8241); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3367:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3368:2: (iv_ruleAtom= ruleAtom EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3369:2: iv_ruleAtom= ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom8281);
            iv_ruleAtom=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom8291); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3376:1: ruleAtom returns [EObject current=null] : ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | ( (lv_expression_4_0= ruleVar ) ) | ( (lv_expression_5_0= ruleCall ) ) | ( () ( (lv_value_7_0= ruleSignedInt ) ) ) | ( () ( (lv_value_9_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_11_0= ruleBool ) ) ) | ( () ( (lv_value_13_0= ruleVector ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) ) ;
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
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3379:28: ( ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | ( (lv_expression_4_0= ruleVar ) ) | ( (lv_expression_5_0= ruleCall ) ) | ( () ( (lv_value_7_0= ruleSignedInt ) ) ) | ( () ( (lv_value_9_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_11_0= ruleBool ) ) ) | ( () ( (lv_value_13_0= ruleVector ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3380:1: ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | ( (lv_expression_4_0= ruleVar ) ) | ( (lv_expression_5_0= ruleCall ) ) | ( () ( (lv_value_7_0= ruleSignedInt ) ) ) | ( () ( (lv_value_9_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_11_0= ruleBool ) ) ) | ( () ( (lv_value_13_0= ruleVector ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3380:1: ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | ( (lv_expression_4_0= ruleVar ) ) | ( (lv_expression_5_0= ruleCall ) ) | ( () ( (lv_value_7_0= ruleSignedInt ) ) ) | ( () ( (lv_value_9_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_11_0= ruleBool ) ) ) | ( () ( (lv_value_13_0= ruleVector ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) )
            int alt37=8;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3380:2: ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3380:2: ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3380:3: () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3380:3: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3381:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getPrimaryExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3386:2: (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3386:4: otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAtom8339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_0_1_0());
                          
                    }
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3390:1: ( (lv_expression_2_0= ruleExpression ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3391:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3391:1: (lv_expression_2_0= ruleExpression )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3392:3: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getExpressionExpressionParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAtom8360);
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

                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleAtom8372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getRightParenthesisKeyword_0_1_2());
                          
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3413:6: ( (lv_expression_4_0= ruleVar ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3413:6: ( (lv_expression_4_0= ruleVar ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3414:1: (lv_expression_4_0= ruleVar )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3414:1: (lv_expression_4_0= ruleVar )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3415:3: lv_expression_4_0= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getExpressionVarParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVar_in_ruleAtom8401);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3432:6: ( (lv_expression_5_0= ruleCall ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3432:6: ( (lv_expression_5_0= ruleCall ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3433:1: (lv_expression_5_0= ruleCall )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3433:1: (lv_expression_5_0= ruleCall )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3434:3: lv_expression_5_0= ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getExpressionCallParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCall_in_ruleAtom8428);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3451:6: ( () ( (lv_value_7_0= ruleSignedInt ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3451:6: ( () ( (lv_value_7_0= ruleSignedInt ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3451:7: () ( (lv_value_7_0= ruleSignedInt ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3451:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3452:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getLiteralIntAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3457:2: ( (lv_value_7_0= ruleSignedInt ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3458:1: (lv_value_7_0= ruleSignedInt )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3458:1: (lv_value_7_0= ruleSignedInt )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3459:3: lv_value_7_0= ruleSignedInt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getValueSignedIntParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedInt_in_ruleAtom8465);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3476:6: ( () ( (lv_value_9_0= ruleSignedFloat ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3476:6: ( () ( (lv_value_9_0= ruleSignedFloat ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3476:7: () ( (lv_value_9_0= ruleSignedFloat ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3476:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3477:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getLiteralFloatAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3482:2: ( (lv_value_9_0= ruleSignedFloat ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3483:1: (lv_value_9_0= ruleSignedFloat )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3483:1: (lv_value_9_0= ruleSignedFloat )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3484:3: lv_value_9_0= ruleSignedFloat
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getValueSignedFloatParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedFloat_in_ruleAtom8503);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3501:6: ( () ( (lv_value_11_0= ruleBool ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3501:6: ( () ( (lv_value_11_0= ruleBool ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3501:7: () ( (lv_value_11_0= ruleBool ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3501:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3502:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getLiteralBoolAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3507:2: ( (lv_value_11_0= ruleBool ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3508:1: (lv_value_11_0= ruleBool )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3508:1: (lv_value_11_0= ruleBool )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3509:3: lv_value_11_0= ruleBool
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getValueBoolParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBool_in_ruleAtom8541);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3526:6: ( () ( (lv_value_13_0= ruleVector ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3526:6: ( () ( (lv_value_13_0= ruleVector ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3526:7: () ( (lv_value_13_0= ruleVector ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3526:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3527:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getLiteralVectorAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3532:2: ( (lv_value_13_0= ruleVector ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3533:1: (lv_value_13_0= ruleVector )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3533:1: (lv_value_13_0= ruleVector )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3534:3: lv_value_13_0= ruleVector
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getValueVectorParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVector_in_ruleAtom8579);
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
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3551:6: ( () ( (lv_value_15_0= RULE_STRING ) ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3551:6: ( () ( (lv_value_15_0= RULE_STRING ) ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3551:7: () ( (lv_value_15_0= RULE_STRING ) )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3551:7: ()
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3552:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getLiteralStringAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3557:2: ( (lv_value_15_0= RULE_STRING ) )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3558:1: (lv_value_15_0= RULE_STRING )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3558:1: (lv_value_15_0= RULE_STRING )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3559:3: lv_value_15_0= RULE_STRING
                    {
                    lv_value_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtom8613); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3583:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3584:2: (iv_ruleCall= ruleCall EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3585:2: iv_ruleCall= ruleCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallRule()); 
            }
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall8655);
            iv_ruleCall=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall8665); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3592:1: ruleCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_args_2_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3595:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3596:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3596:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3596:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')'
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3596:2: ( (otherlv_0= RULE_ID ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3597:1: (otherlv_0= RULE_ID )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3597:1: (otherlv_0= RULE_ID )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3598:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCall8710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getCallAccess().getFunctionFunDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleCall8722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3613:1: ( (lv_args_2_0= ruleArguments ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_INT && LA38_0<=RULE_STRING)||LA38_0==12||(LA38_0>=14 && LA38_0<=17)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3614:1: (lv_args_2_0= ruleArguments )
                    {
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3614:1: (lv_args_2_0= ruleArguments )
                    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3615:3: lv_args_2_0= ruleArguments
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCallAccess().getArgsArgumentsParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArguments_in_ruleCall8743);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleCall8756); if (state.failed) return current;
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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3643:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3644:2: (iv_ruleArguments= ruleArguments EOF )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3645:2: iv_ruleArguments= ruleArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentsRule()); 
            }
            pushFollow(FOLLOW_ruleArguments_in_entryRuleArguments8792);
            iv_ruleArguments=ruleArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArguments; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArguments8802); if (state.failed) return current;

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
    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3652:1: ruleArguments returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3655:28: ( ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3656:1: ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3656:1: ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3656:2: ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3656:2: ( (lv_expressions_0_0= ruleExpression ) )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3657:1: (lv_expressions_0_0= ruleExpression )
            {
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3657:1: (lv_expressions_0_0= ruleExpression )
            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3658:3: lv_expressions_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleArguments8848);
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

            // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3674:2: (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==18) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3674:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleArguments8861); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getArgumentsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3678:1: ( (lv_expressions_2_0= ruleExpression ) )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3679:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3679:1: (lv_expressions_2_0= ruleExpression )
            	    // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:3680:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleArguments8882);
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
            	    break loop39;
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
        // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2034:4: ( 'else' )
        // ../aom.scripting.xs/src-gen/aom/scripting/xs/parser/antlr/internal/InternalXS.g:2034:6: 'else'
        {
        match(input,42,FOLLOW_42_in_synpred1_InternalXS5195); if (state.failed) return ;

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
    protected DFA37 dfa37 = new DFA37(this);
    static final String DFA2_eotS =
        "\14\uffff";
    static final String DFA2_eofS =
        "\14\uffff";
    static final String DFA2_minS =
        "\2\20\1\uffff\5\5\3\uffff\1\21";
    static final String DFA2_maxS =
        "\2\46\1\uffff\5\5\3\uffff\1\24";
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
    static final String DFA37_eotS =
        "\14\uffff";
    static final String DFA37_eofS =
        "\2\uffff\1\10\1\uffff\1\13\7\uffff";
    static final String DFA37_minS =
        "\1\4\1\uffff\1\13\1\4\1\13\7\uffff";
    static final String DFA37_maxS =
        "\1\21\1\uffff\1\101\1\4\1\101\7\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\3\uffff\1\6\1\7\1\10\1\2\1\3\1\5\1\4";
    static final String DFA37_specialS =
        "\14\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\4\1\2\1\7\5\uffff\1\3\1\uffff\2\5\1\6\1\1",
            "",
            "\2\10\4\uffff\1\11\2\10\42\uffff\14\10",
            "\1\4",
            "\2\13\1\12\4\uffff\2\13\42\uffff\14\13",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "3380:1: ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | ( (lv_expression_4_0= ruleVar ) ) | ( (lv_expression_5_0= ruleCall ) ) | ( () ( (lv_value_7_0= ruleSignedInt ) ) ) | ( () ( (lv_value_9_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_11_0= ruleBool ) ) ) | ( () ( (lv_value_13_0= ruleVector ) ) ) | ( () ( (lv_value_15_0= RULE_STRING ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleProgram130 = new BitSet(new long[]{0x0000007FC0610002L});
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
    public static final BitSet FOLLOW_12_in_ruleSign416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_entryRuleSignedInt456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInt467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSign_in_ruleSignedInt515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedInt537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedFloat_in_entryRuleSignedFloat583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedFloat594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSign_in_ruleSignedFloat642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedFloat664 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSignedFloat682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedFloat697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNum_in_entryRuleSignedNum743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNum754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_ruleSignedNum801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedFloat_in_ruleSignedNum834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantNum_in_entryRuleConstantNum879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantNum889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantNum933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralOrConstantNum_in_entryRuleLiteralOrConstantNum968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralOrConstantNum978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNum_in_ruleLiteralOrConstantNum1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantNum_in_ruleLiteralOrConstantNum1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_entryRuleBool1093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBool1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBool1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_entryRuleVector1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleVector1248 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVector1260 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_ruleLiteralOrConstantNum_in_ruleVector1281 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVector1293 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_ruleLiteralOrConstantNum_in_ruleVector1314 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVector1326 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_ruleLiteralOrConstantNum_in_ruleVector1347 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVector1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_entryRuleVarDeclaration1395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclaration1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarModifier_in_ruleVarDeclaration1451 = new BitSet(new long[]{0x0000003DC0010000L});
    public static final BitSet FOLLOW_ruleVarTypeSpecifier_in_ruleVarDeclaration1472 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDeclaration1489 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVarDeclaration1506 = new BitSet(new long[]{0x000000000003D070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVarDeclaration1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForVarDeclaration_in_entryRuleForVarDeclaration1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForVarDeclaration1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForVarDeclaration1615 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleForVarDeclaration1632 = new BitSet(new long[]{0x000000000003D070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForVarDeclaration1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunDeclaration_in_entryRuleFunDeclaration1689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunDeclaration1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunModifier_in_ruleFunDeclaration1745 = new BitSet(new long[]{0x0000007FC0010000L});
    public static final BitSet FOLLOW_ruleFunTypeSpecifier_in_ruleFunDeclaration1766 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunDeclaration1783 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunDeclaration1800 = new BitSet(new long[]{0x0000007DC0090000L});
    public static final BitSet FOLLOW_ruleParams_in_ruleFunDeclaration1821 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunDeclaration1834 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleFunDeclaration1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeStatement_in_entryRuleIncludeStatement1891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeStatement1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleIncludeStatement1938 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludeStatement1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDeclaration_in_entryRuleRuleDeclaration1996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleDeclaration2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRuleDeclaration2043 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleDeclaration2060 = new BitSet(new long[]{0x000000003F800000L});
    public static final BitSet FOLLOW_23_in_ruleRuleDeclaration2129 = new BitSet(new long[]{0x000000803F800000L});
    public static final BitSet FOLLOW_24_in_ruleRuleDeclaration2160 = new BitSet(new long[]{0x000000803F800000L});
    public static final BitSet FOLLOW_25_in_ruleRuleDeclaration2233 = new BitSet(new long[]{0x000000803F800000L});
    public static final BitSet FOLLOW_26_in_ruleRuleDeclaration2318 = new BitSet(new long[]{0x000000803F800000L});
    public static final BitSet FOLLOW_27_in_ruleRuleDeclaration2398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleDeclaration2415 = new BitSet(new long[]{0x000000803F800000L});
    public static final BitSet FOLLOW_28_in_ruleRuleDeclaration2488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRuleDeclaration2505 = new BitSet(new long[]{0x000000803F800000L});
    public static final BitSet FOLLOW_29_in_ruleRuleDeclaration2578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRuleDeclaration2595 = new BitSet(new long[]{0x000000803F800000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleRuleDeclaration2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarModifier_in_entryRuleVarModifier2704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarModifier2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleVarModifier2801 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_31_in_ruleVarModifier2886 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_32_in_ruleVarModifier2971 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_ruleFunModifier_in_entryRuleFunModifier3059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunModifier3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFunModifier3156 = new BitSet(new long[]{0x0000000240000002L});
    public static final BitSet FOLLOW_33_in_ruleFunModifier3241 = new BitSet(new long[]{0x0000000240000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType3329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleIntType3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType3421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFloatType3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolType_in_entryRuleBoolType3513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolType3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBoolType3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_entryRuleVectorType3605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVectorType3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleVectorType3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType3697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleStringType3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_entryRuleVoidType3789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoidType3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVoidType3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarTypeSpecifier_in_entryRuleVarTypeSpecifier3881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarTypeSpecifier3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_ruleVarTypeSpecifier3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_ruleVarTypeSpecifier3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolType_in_ruleVarTypeSpecifier3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_ruleVarTypeSpecifier4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleVarTypeSpecifier4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunTypeSpecifier_in_entryRuleFunTypeSpecifier4081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunTypeSpecifier4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_ruleFunTypeSpecifier4138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarTypeSpecifier_in_ruleFunTypeSpecifier4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParams_in_entryRuleParams4200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParams4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleParams4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleParams4294 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleParams4307 = new BitSet(new long[]{0x0000003DC0010000L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleParams4328 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement4367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStatement4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCompoundStatement4423 = new BitSet(new long[]{0x000E3BBDC003D870L});
    public static final BitSet FOLLOW_ruleVarDeclarationOrStatement_in_ruleCompoundStatement4444 = new BitSet(new long[]{0x000E3BBDC003D870L});
    public static final BitSet FOLLOW_40_in_ruleCompoundStatement4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclarationOrStatement_in_entryRuleVarDeclarationOrStatement4493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDeclarationOrStatement4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDeclaration_in_ruleVarDeclarationOrStatement4551 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleVarDeclarationOrStatement4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleVarDeclarationOrStatement4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement4626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionStatement_in_ruleStatement4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleStatement4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseStatement_in_ruleStatement4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_ruleStatement4764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_ruleStatement4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_ruleStatement4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_ruleStatement4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinueStatement_in_ruleStatement4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakStatement_in_ruleStatement4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionStatement_in_entryRuleExpressionStatement4934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionStatement4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionStatement4991 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleExpressionStatement5003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleExpressionStatement5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseStatement_in_entryRuleIfElseStatement5069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfElseStatement5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleIfElseStatement5116 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIfElseStatement5128 = new BitSet(new long[]{0x000000000003D070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfElseStatement5149 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIfElseStatement5161 = new BitSet(new long[]{0x000E3ABDC003D870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfElseStatement5182 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleIfElseStatement5203 = new BitSet(new long[]{0x000E3ABDC003D870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIfElseStatement5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhileStatement_in_entryRuleWhileStatement5263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhileStatement5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleWhileStatement5310 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWhileStatement5322 = new BitSet(new long[]{0x000000000003D070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhileStatement5343 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleWhileStatement5355 = new BitSet(new long[]{0x000E3ABDC003D870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhileStatement5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStatement_in_entryRuleForStatement5412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForStatement5422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleForStatement5459 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleForStatement5471 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleForVarDeclaration_in_ruleForStatement5492 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleForStatement5504 = new BitSet(new long[]{0x3C00000000000000L});
    public static final BitSet FOLLOW_ruleRelOp_in_ruleForStatement5525 = new BitSet(new long[]{0x000000000003D070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForStatement5546 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleForStatement5558 = new BitSet(new long[]{0x000E3ABDC003D870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleForStatement5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchStatement_in_entryRuleSwitchStatement5615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchStatement5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSwitchStatement5662 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSwitchStatement5674 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSwitchStatement5694 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSwitchStatement5706 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSwitchStatement5718 = new BitSet(new long[]{0x0001410000000000L});
    public static final BitSet FOLLOW_ruleSwitchCase_in_ruleSwitchStatement5739 = new BitSet(new long[]{0x0001410000000000L});
    public static final BitSet FOLLOW_ruleSwitchDefault_in_ruleSwitchStatement5761 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSwitchStatement5774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase5810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchCase5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSwitchCase5857 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_ruleLiteralOrConstantNum_in_ruleSwitchCase5878 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleSwitchCase5890 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSwitchCase5902 = new BitSet(new long[]{0x000E3ABDC003D870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSwitchCase5923 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSwitchCase5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchDefault_in_entryRuleSwitchDefault5971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchDefault5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSwitchDefault6018 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleSwitchDefault6030 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSwitchDefault6042 = new BitSet(new long[]{0x000E3ABDC003D870L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSwitchDefault6063 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSwitchDefault6075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement6111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleReturnStatement6167 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_17_in_ruleReturnStatement6180 = new BitSet(new long[]{0x000000000003D070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStatement6201 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleReturnStatement6213 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleReturnStatement6227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinueStatement_in_entryRuleContinueStatement6263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContinueStatement6273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleContinueStatement6319 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleContinueStatement6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakStatement_in_entryRuleBreakStatement6367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakStatement6377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBreakStatement6423 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBreakStatement6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostFixOp_in_entryRulePostFixOp6472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostFixOp6483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePostFixOp6521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePostFixOp6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleExpression6647 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExpression6659 = new BitSet(new long[]{0x000000000003D070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression6680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleExpression6709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression6745 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_rulePostFixOp_in_ruleExpression6766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar6803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar6813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar6857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression6892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpression6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleSimpleExpression6949 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleSimpleExpression6976 = new BitSet(new long[]{0x000000000003D070L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleSimpleExpression7010 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression7048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression7058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsExpression_in_ruleAndExpression7105 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleAndExpression7132 = new BitSet(new long[]{0x000000000003D070L});
    public static final BitSet FOLLOW_ruleEqualsExpression_in_ruleAndExpression7166 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleEqualsExpression_in_entryRuleEqualsExpression7204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsExpression7214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualsExpression7261 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_ruleEqOp_in_ruleEqualsExpression7291 = new BitSet(new long[]{0x000000000003D070L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualsExpression7312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqOp_in_entryRuleEqOp7351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqOp7362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEqOp7400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEqOp7419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression7459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression7469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleComparisonExpression7516 = new BitSet(new long[]{0x3C00000000000002L});
    public static final BitSet FOLLOW_ruleRelOp_in_ruleComparisonExpression7546 = new BitSet(new long[]{0x000000000003D070L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleComparisonExpression7567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelOp_in_entryRuleRelOp7606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelOp7617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleRelOp7655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleRelOp7674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleRelOp7693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleRelOp7712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression7752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression7762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7809 = new BitSet(new long[]{0x4000000000001002L});
    public static final BitSet FOLLOW_ruleAddOp_in_ruleAdditiveExpression7839 = new BitSet(new long[]{0x000000000003D070L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7860 = new BitSet(new long[]{0x4000000000001002L});
    public static final BitSet FOLLOW_ruleAddOp_in_entryRuleAddOp7899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddOp7910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleAddOp7948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAddOp7967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression8007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression8017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleMultiplicativeExpression8064 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMulOp_in_ruleMultiplicativeExpression8094 = new BitSet(new long[]{0x000000000003D070L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleMultiplicativeExpression8115 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMulOp_in_entryRuleMulOp8154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOp8165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleMulOp8203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleMulOp8222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleMulOp8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom8281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom8291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAtom8339 = new BitSet(new long[]{0x000000000003D070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAtom8360 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAtom8372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleAtom8401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleAtom8428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_ruleAtom8465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedFloat_in_ruleAtom8503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_ruleAtom8541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_ruleAtom8579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtom8613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall8655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCall8710 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCall8722 = new BitSet(new long[]{0x00000000000BD070L});
    public static final BitSet FOLLOW_ruleArguments_in_ruleCall8743 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCall8756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_entryRuleArguments8792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArguments8802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArguments8848 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleArguments8861 = new BitSet(new long[]{0x000000000003D070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArguments8882 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_42_in_synpred1_InternalXS5195 = new BitSet(new long[]{0x0000000000000002L});

}
