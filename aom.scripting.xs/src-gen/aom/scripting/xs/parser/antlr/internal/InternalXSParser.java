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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'include'", "';'", "'='", "'const'", "'extern'", "'('", "')'", "'void'", "','", "'rule'", "'active'", "'inactive'", "'runImmediately'", "'highFrequency'", "'group'", "'minInterval'", "'maxInterval'", "'mutable'", "'{'", "'}'", "'if'", "'else'", "'while'", "'for'", "'switch'", "'case'", "':'", "'default'", "'return'", "'continue'", "'break'", "'++'", "'--'", "'||'", "'&&'", "'=='", "'!='", "'<='", "'<'", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'int'", "'float'", "'bool'", "'vector'", "'string'", "'.'", "'true'", "'false'"
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
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "InternalXS.g"; }



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
    // InternalXS.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalXS.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // InternalXS.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:76:1: ruleProgram returns [EObject current=null] : ( (lv_declarations_0_0= ruleDeclaration ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:79:28: ( ( (lv_declarations_0_0= ruleDeclaration ) )* )
            // InternalXS.g:80:1: ( (lv_declarations_0_0= ruleDeclaration ) )*
            {
            // InternalXS.g:80:1: ( (lv_declarations_0_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=14 && LA1_0<=15)||LA1_0==18||LA1_0==20||LA1_0==28||(LA1_0>=57 && LA1_0<=61)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXS.g:81:1: (lv_declarations_0_0= ruleDeclaration )
            	    {
            	    // InternalXS.g:81:1: (lv_declarations_0_0= ruleDeclaration )
            	    // InternalXS.g:82:3: lv_declarations_0_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getDeclarationsDeclarationParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
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
            	              		"aom.scripting.xs.XS.Declaration");
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
    // InternalXS.g:106:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalXS.g:107:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalXS.g:108:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:115:1: ruleDeclaration returns [EObject current=null] : (this_GlobalVarDeclaration_0= ruleGlobalVarDeclaration | this_FunDeclaration_1= ruleFunDeclaration | this_IncludeStatement_2= ruleIncludeStatement | this_RuleDeclaration_3= ruleRuleDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalVarDeclaration_0 = null;

        EObject this_FunDeclaration_1 = null;

        EObject this_IncludeStatement_2 = null;

        EObject this_RuleDeclaration_3 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:118:28: ( (this_GlobalVarDeclaration_0= ruleGlobalVarDeclaration | this_FunDeclaration_1= ruleFunDeclaration | this_IncludeStatement_2= ruleIncludeStatement | this_RuleDeclaration_3= ruleRuleDeclaration ) )
            // InternalXS.g:119:1: (this_GlobalVarDeclaration_0= ruleGlobalVarDeclaration | this_FunDeclaration_1= ruleFunDeclaration | this_IncludeStatement_2= ruleIncludeStatement | this_RuleDeclaration_3= ruleRuleDeclaration )
            {
            // InternalXS.g:119:1: (this_GlobalVarDeclaration_0= ruleGlobalVarDeclaration | this_FunDeclaration_1= ruleFunDeclaration | this_IncludeStatement_2= ruleIncludeStatement | this_RuleDeclaration_3= ruleRuleDeclaration )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalXS.g:120:5: this_GlobalVarDeclaration_0= ruleGlobalVarDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getGlobalVarDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_GlobalVarDeclaration_0=ruleGlobalVarDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GlobalVarDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:130:5: this_FunDeclaration_1= ruleFunDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getFunDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_FunDeclaration_1=ruleFunDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalXS.g:140:5: this_IncludeStatement_2= ruleIncludeStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getIncludeStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_IncludeStatement_2=ruleIncludeStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IncludeStatement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalXS.g:150:5: this_RuleDeclaration_3= ruleRuleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getRuleDeclarationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_RuleDeclaration_3=ruleRuleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RuleDeclaration_3; 
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


    // $ANTLR start "entryRuleIncludeStatement"
    // InternalXS.g:166:1: entryRuleIncludeStatement returns [EObject current=null] : iv_ruleIncludeStatement= ruleIncludeStatement EOF ;
    public final EObject entryRuleIncludeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeStatement = null;


        try {
            // InternalXS.g:167:2: (iv_ruleIncludeStatement= ruleIncludeStatement EOF )
            // InternalXS.g:168:2: iv_ruleIncludeStatement= ruleIncludeStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIncludeStatement=ruleIncludeStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIncludeStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:175:1: ruleIncludeStatement returns [EObject current=null] : (otherlv_0= 'include' ( (lv_filePath_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleIncludeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_filePath_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalXS.g:178:28: ( (otherlv_0= 'include' ( (lv_filePath_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalXS.g:179:1: (otherlv_0= 'include' ( (lv_filePath_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalXS.g:179:1: (otherlv_0= 'include' ( (lv_filePath_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalXS.g:179:3: otherlv_0= 'include' ( (lv_filePath_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIncludeStatementAccess().getIncludeKeyword_0());
                  
            }
            // InternalXS.g:183:1: ( (lv_filePath_1_0= RULE_STRING ) )
            // InternalXS.g:184:1: (lv_filePath_1_0= RULE_STRING )
            {
            // InternalXS.g:184:1: (lv_filePath_1_0= RULE_STRING )
            // InternalXS.g:185:3: lv_filePath_1_0= RULE_STRING
            {
            lv_filePath_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_filePath_1_0, grammarAccess.getIncludeStatementAccess().getFilePathSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIncludeStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"filePath",
                      		lv_filePath_1_0, 
                      		"aom.scripting.xs.XS.STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIncludeStatementAccess().getSemicolonKeyword_2());
                  
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


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalXS.g:213:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalXS.g:214:2: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalXS.g:215:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:222:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleVarTypeSpecifier ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:225:28: ( ( ( (lv_type_0_0= ruleVarTypeSpecifier ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // InternalXS.g:226:1: ( ( (lv_type_0_0= ruleVarTypeSpecifier ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // InternalXS.g:226:1: ( ( (lv_type_0_0= ruleVarTypeSpecifier ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // InternalXS.g:226:2: ( (lv_type_0_0= ruleVarTypeSpecifier ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            // InternalXS.g:226:2: ( (lv_type_0_0= ruleVarTypeSpecifier ) )
            // InternalXS.g:227:1: (lv_type_0_0= ruleVarTypeSpecifier )
            {
            // InternalXS.g:227:1: (lv_type_0_0= ruleVarTypeSpecifier )
            // InternalXS.g:228:3: lv_type_0_0= ruleVarTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeVarTypeSpecifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_6);
            lv_type_0_0=ruleVarTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"aom.scripting.xs.XS.VarTypeSpecifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXS.g:244:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalXS.g:245:1: (lv_name_1_0= RULE_ID )
            {
            // InternalXS.g:245:1: (lv_name_1_0= RULE_ID )
            // InternalXS.g:246:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVarDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"aom.scripting.xs.XS.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getVarDeclarationAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalXS.g:266:1: ( (lv_value_3_0= ruleExpression ) )
            // InternalXS.g:267:1: (lv_value_3_0= ruleExpression )
            {
            // InternalXS.g:267:1: (lv_value_3_0= ruleExpression )
            // InternalXS.g:268:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVarDeclarationAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"aom.scripting.xs.XS.Expression");
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


    // $ANTLR start "entryRuleGlobalVarDeclaration"
    // InternalXS.g:292:1: entryRuleGlobalVarDeclaration returns [EObject current=null] : iv_ruleGlobalVarDeclaration= ruleGlobalVarDeclaration EOF ;
    public final EObject entryRuleGlobalVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalVarDeclaration = null;


        try {
            // InternalXS.g:293:2: (iv_ruleGlobalVarDeclaration= ruleGlobalVarDeclaration EOF )
            // InternalXS.g:294:2: iv_ruleGlobalVarDeclaration= ruleGlobalVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGlobalVarDeclaration=ruleGlobalVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobalVarDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalVarDeclaration"


    // $ANTLR start "ruleGlobalVarDeclaration"
    // InternalXS.g:301:1: ruleGlobalVarDeclaration returns [EObject current=null] : ( () ( (lv_modifier_1_0= ruleVarModifier ) ) ( (lv_type_2_0= ruleVarTypeSpecifier ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleLiteralOrVar ) ) otherlv_6= ';' ) ;
    public final EObject ruleGlobalVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_modifier_1_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:304:28: ( ( () ( (lv_modifier_1_0= ruleVarModifier ) ) ( (lv_type_2_0= ruleVarTypeSpecifier ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleLiteralOrVar ) ) otherlv_6= ';' ) )
            // InternalXS.g:305:1: ( () ( (lv_modifier_1_0= ruleVarModifier ) ) ( (lv_type_2_0= ruleVarTypeSpecifier ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleLiteralOrVar ) ) otherlv_6= ';' )
            {
            // InternalXS.g:305:1: ( () ( (lv_modifier_1_0= ruleVarModifier ) ) ( (lv_type_2_0= ruleVarTypeSpecifier ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleLiteralOrVar ) ) otherlv_6= ';' )
            // InternalXS.g:305:2: () ( (lv_modifier_1_0= ruleVarModifier ) ) ( (lv_type_2_0= ruleVarTypeSpecifier ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleLiteralOrVar ) ) otherlv_6= ';'
            {
            // InternalXS.g:305:2: ()
            // InternalXS.g:306:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGlobalVarDeclarationAccess().getGlobalVarDeclarationAction_0(),
                          current);
                  
            }

            }

            // InternalXS.g:311:2: ( (lv_modifier_1_0= ruleVarModifier ) )
            // InternalXS.g:312:1: (lv_modifier_1_0= ruleVarModifier )
            {
            // InternalXS.g:312:1: (lv_modifier_1_0= ruleVarModifier )
            // InternalXS.g:313:3: lv_modifier_1_0= ruleVarModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGlobalVarDeclarationAccess().getModifierVarModifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_9);
            lv_modifier_1_0=ruleVarModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGlobalVarDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"modifier",
                      		lv_modifier_1_0, 
                      		"aom.scripting.xs.XS.VarModifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXS.g:329:2: ( (lv_type_2_0= ruleVarTypeSpecifier ) )
            // InternalXS.g:330:1: (lv_type_2_0= ruleVarTypeSpecifier )
            {
            // InternalXS.g:330:1: (lv_type_2_0= ruleVarTypeSpecifier )
            // InternalXS.g:331:3: lv_type_2_0= ruleVarTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGlobalVarDeclarationAccess().getTypeVarTypeSpecifierParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_6);
            lv_type_2_0=ruleVarTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGlobalVarDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"aom.scripting.xs.XS.VarTypeSpecifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXS.g:347:2: ( (lv_name_3_0= RULE_ID ) )
            // InternalXS.g:348:1: (lv_name_3_0= RULE_ID )
            {
            // InternalXS.g:348:1: (lv_name_3_0= RULE_ID )
            // InternalXS.g:349:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getGlobalVarDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGlobalVarDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"aom.scripting.xs.XS.ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getGlobalVarDeclarationAccess().getEqualsSignKeyword_4());
                  
            }
            // InternalXS.g:369:1: ( (lv_value_5_0= ruleLiteralOrVar ) )
            // InternalXS.g:370:1: (lv_value_5_0= ruleLiteralOrVar )
            {
            // InternalXS.g:370:1: (lv_value_5_0= ruleLiteralOrVar )
            // InternalXS.g:371:3: lv_value_5_0= ruleLiteralOrVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGlobalVarDeclarationAccess().getValueLiteralOrVarParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_5);
            lv_value_5_0=ruleLiteralOrVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGlobalVarDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_5_0, 
                      		"aom.scripting.xs.XS.LiteralOrVar");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getGlobalVarDeclarationAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleGlobalVarDeclaration"


    // $ANTLR start "entryRuleVarModifier"
    // InternalXS.g:399:1: entryRuleVarModifier returns [EObject current=null] : iv_ruleVarModifier= ruleVarModifier EOF ;
    public final EObject entryRuleVarModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarModifier = null;


        try {
            // InternalXS.g:400:2: (iv_ruleVarModifier= ruleVarModifier EOF )
            // InternalXS.g:401:2: iv_ruleVarModifier= ruleVarModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarModifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarModifier=ruleVarModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarModifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:408:1: ruleVarModifier returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleVarModifier() throws RecognitionException {
        EObject current = null;

        Token lv_const_2_0=null;
        Token lv_extern_3_0=null;

         enterRule(); 
            
        try {
            // InternalXS.g:411:28: ( ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) ) ) )
            // InternalXS.g:412:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) ) )
            {
            // InternalXS.g:412:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) ) )
            // InternalXS.g:412:2: () ( ( ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) )
            {
            // InternalXS.g:412:2: ()
            // InternalXS.g:413:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVarModifierAccess().getVarModifierAction_0(),
                          current);
                  
            }

            }

            // InternalXS.g:418:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) )
            // InternalXS.g:420:1: ( ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) )
            {
            // InternalXS.g:420:1: ( ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) )
            // InternalXS.g:421:2: ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getVarModifierAccess().getUnorderedGroup_1());
            // InternalXS.g:424:2: ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* )
            // InternalXS.g:425:3: ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )*
            {
            // InternalXS.g:425:3: ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup_1(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup_1(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXS.g:427:4: ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) )
            	    {
            	    // InternalXS.g:427:4: ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) )
            	    // InternalXS.g:428:5: {...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalXS.g:428:108: ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) )
            	    // InternalXS.g:429:6: ({...}? => ( (lv_const_2_0= 'const' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVarModifierAccess().getUnorderedGroup_1(), 0);
            	    // InternalXS.g:432:6: ({...}? => ( (lv_const_2_0= 'const' ) ) )
            	    // InternalXS.g:432:7: {...}? => ( (lv_const_2_0= 'const' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "true");
            	    }
            	    // InternalXS.g:432:16: ( (lv_const_2_0= 'const' ) )
            	    // InternalXS.g:433:1: (lv_const_2_0= 'const' )
            	    {
            	    // InternalXS.g:433:1: (lv_const_2_0= 'const' )
            	    // InternalXS.g:434:3: lv_const_2_0= 'const'
            	    {
            	    lv_const_2_0=(Token)match(input,14,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_const_2_0, grammarAccess.getVarModifierAccess().getConstConstKeyword_1_0_0());
            	          
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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVarModifierAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXS.g:454:4: ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) )
            	    {
            	    // InternalXS.g:454:4: ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) )
            	    // InternalXS.g:455:5: {...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "getUnorderedGroupHelper().canSelect(grammarAccess.getVarModifierAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalXS.g:455:108: ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) )
            	    // InternalXS.g:456:6: ({...}? => ( (lv_extern_3_0= 'extern' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVarModifierAccess().getUnorderedGroup_1(), 1);
            	    // InternalXS.g:459:6: ({...}? => ( (lv_extern_3_0= 'extern' ) ) )
            	    // InternalXS.g:459:7: {...}? => ( (lv_extern_3_0= 'extern' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVarModifier", "true");
            	    }
            	    // InternalXS.g:459:16: ( (lv_extern_3_0= 'extern' ) )
            	    // InternalXS.g:460:1: (lv_extern_3_0= 'extern' )
            	    {
            	    // InternalXS.g:460:1: (lv_extern_3_0= 'extern' )
            	    // InternalXS.g:461:3: lv_extern_3_0= 'extern'
            	    {
            	    lv_extern_3_0=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_extern_3_0, grammarAccess.getVarModifierAccess().getExternExternKeyword_1_1_0());
            	          
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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVarModifierAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getVarModifierAccess().getUnorderedGroup_1());

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
    // $ANTLR end "ruleVarModifier"


    // $ANTLR start "entryRuleParameterDeclaration"
    // InternalXS.g:496:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // InternalXS.g:497:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // InternalXS.g:498:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // InternalXS.g:505:1: ruleParameterDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleVarTypeSpecifier ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleLiteralOrVar ) ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:508:28: ( ( ( (lv_type_0_0= ruleVarTypeSpecifier ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleLiteralOrVar ) ) ) )
            // InternalXS.g:509:1: ( ( (lv_type_0_0= ruleVarTypeSpecifier ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleLiteralOrVar ) ) )
            {
            // InternalXS.g:509:1: ( ( (lv_type_0_0= ruleVarTypeSpecifier ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleLiteralOrVar ) ) )
            // InternalXS.g:509:2: ( (lv_type_0_0= ruleVarTypeSpecifier ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleLiteralOrVar ) )
            {
            // InternalXS.g:509:2: ( (lv_type_0_0= ruleVarTypeSpecifier ) )
            // InternalXS.g:510:1: (lv_type_0_0= ruleVarTypeSpecifier )
            {
            // InternalXS.g:510:1: (lv_type_0_0= ruleVarTypeSpecifier )
            // InternalXS.g:511:3: lv_type_0_0= ruleVarTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getTypeVarTypeSpecifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_6);
            lv_type_0_0=ruleVarTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"aom.scripting.xs.XS.VarTypeSpecifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXS.g:527:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalXS.g:528:1: (lv_name_1_0= RULE_ID )
            {
            // InternalXS.g:528:1: (lv_name_1_0= RULE_ID )
            // InternalXS.g:529:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"aom.scripting.xs.XS.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParameterDeclarationAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalXS.g:549:1: ( (lv_value_3_0= ruleLiteralOrVar ) )
            // InternalXS.g:550:1: (lv_value_3_0= ruleLiteralOrVar )
            {
            // InternalXS.g:550:1: (lv_value_3_0= ruleLiteralOrVar )
            // InternalXS.g:551:3: lv_value_3_0= ruleLiteralOrVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getValueLiteralOrVarParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleLiteralOrVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"aom.scripting.xs.XS.LiteralOrVar");
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
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRuleForVarDeclaration"
    // InternalXS.g:575:1: entryRuleForVarDeclaration returns [EObject current=null] : iv_ruleForVarDeclaration= ruleForVarDeclaration EOF ;
    public final EObject entryRuleForVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForVarDeclaration = null;


        try {
            // InternalXS.g:576:2: (iv_ruleForVarDeclaration= ruleForVarDeclaration EOF )
            // InternalXS.g:577:2: iv_ruleForVarDeclaration= ruleForVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForVarDeclaration=ruleForVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForVarDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:584:1: ruleForVarDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleForVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:587:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalXS.g:588:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalXS.g:588:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalXS.g:588:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalXS.g:588:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalXS.g:589:1: (lv_name_0_0= RULE_ID )
            {
            // InternalXS.g:589:1: (lv_name_0_0= RULE_ID )
            // InternalXS.g:590:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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
                      		"aom.scripting.xs.XS.ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForVarDeclarationAccess().getEqualsSignKeyword_1());
                  
            }
            // InternalXS.g:610:1: ( (lv_value_2_0= ruleExpression ) )
            // InternalXS.g:611:1: (lv_value_2_0= ruleExpression )
            {
            // InternalXS.g:611:1: (lv_value_2_0= ruleExpression )
            // InternalXS.g:612:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForVarDeclarationAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"aom.scripting.xs.XS.Expression");
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
    // InternalXS.g:636:1: entryRuleFunDeclaration returns [EObject current=null] : iv_ruleFunDeclaration= ruleFunDeclaration EOF ;
    public final EObject entryRuleFunDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunDeclaration = null;


        try {
            // InternalXS.g:637:2: (iv_ruleFunDeclaration= ruleFunDeclaration EOF )
            // InternalXS.g:638:2: iv_ruleFunDeclaration= ruleFunDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunDeclaration=ruleFunDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:645:1: ruleFunDeclaration returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleFunModifier ) ) ( (lv_type_1_0= ruleFunTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_paramlist_4_0= ruleParams ) )? otherlv_5= ')' ( (lv_statements_6_0= ruleCompoundStatement ) ) ) ;
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
            // InternalXS.g:648:28: ( ( ( (lv_modifier_0_0= ruleFunModifier ) ) ( (lv_type_1_0= ruleFunTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_paramlist_4_0= ruleParams ) )? otherlv_5= ')' ( (lv_statements_6_0= ruleCompoundStatement ) ) ) )
            // InternalXS.g:649:1: ( ( (lv_modifier_0_0= ruleFunModifier ) ) ( (lv_type_1_0= ruleFunTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_paramlist_4_0= ruleParams ) )? otherlv_5= ')' ( (lv_statements_6_0= ruleCompoundStatement ) ) )
            {
            // InternalXS.g:649:1: ( ( (lv_modifier_0_0= ruleFunModifier ) ) ( (lv_type_1_0= ruleFunTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_paramlist_4_0= ruleParams ) )? otherlv_5= ')' ( (lv_statements_6_0= ruleCompoundStatement ) ) )
            // InternalXS.g:649:2: ( (lv_modifier_0_0= ruleFunModifier ) ) ( (lv_type_1_0= ruleFunTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_paramlist_4_0= ruleParams ) )? otherlv_5= ')' ( (lv_statements_6_0= ruleCompoundStatement ) )
            {
            // InternalXS.g:649:2: ( (lv_modifier_0_0= ruleFunModifier ) )
            // InternalXS.g:650:1: (lv_modifier_0_0= ruleFunModifier )
            {
            // InternalXS.g:650:1: (lv_modifier_0_0= ruleFunModifier )
            // InternalXS.g:651:3: lv_modifier_0_0= ruleFunModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunDeclarationAccess().getModifierFunModifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_11);
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
                      		"aom.scripting.xs.XS.FunModifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXS.g:667:2: ( (lv_type_1_0= ruleFunTypeSpecifier ) )
            // InternalXS.g:668:1: (lv_type_1_0= ruleFunTypeSpecifier )
            {
            // InternalXS.g:668:1: (lv_type_1_0= ruleFunTypeSpecifier )
            // InternalXS.g:669:3: lv_type_1_0= ruleFunTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunDeclarationAccess().getTypeFunTypeSpecifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_6);
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
                      		"aom.scripting.xs.XS.FunTypeSpecifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXS.g:685:2: ( (lv_name_2_0= RULE_ID ) )
            // InternalXS.g:686:1: (lv_name_2_0= RULE_ID )
            {
            // InternalXS.g:686:1: (lv_name_2_0= RULE_ID )
            // InternalXS.g:687:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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
                      		"aom.scripting.xs.XS.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunDeclarationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // InternalXS.g:707:1: ( (lv_paramlist_4_0= ruleParams ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18||(LA4_0>=57 && LA4_0<=61)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXS.g:708:1: (lv_paramlist_4_0= ruleParams )
                    {
                    // InternalXS.g:708:1: (lv_paramlist_4_0= ruleParams )
                    // InternalXS.g:709:3: lv_paramlist_4_0= ruleParams
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunDeclarationAccess().getParamlistParamsParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_14);
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
                              		"aom.scripting.xs.XS.Params");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFunDeclarationAccess().getRightParenthesisKeyword_5());
                  
            }
            // InternalXS.g:729:1: ( (lv_statements_6_0= ruleCompoundStatement ) )
            // InternalXS.g:730:1: (lv_statements_6_0= ruleCompoundStatement )
            {
            // InternalXS.g:730:1: (lv_statements_6_0= ruleCompoundStatement )
            // InternalXS.g:731:3: lv_statements_6_0= ruleCompoundStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunDeclarationAccess().getStatementsCompoundStatementParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"aom.scripting.xs.XS.CompoundStatement");
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


    // $ANTLR start "entryRuleFunTypeSpecifier"
    // InternalXS.g:755:1: entryRuleFunTypeSpecifier returns [EObject current=null] : iv_ruleFunTypeSpecifier= ruleFunTypeSpecifier EOF ;
    public final EObject entryRuleFunTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunTypeSpecifier = null;


        try {
            // InternalXS.g:756:2: (iv_ruleFunTypeSpecifier= ruleFunTypeSpecifier EOF )
            // InternalXS.g:757:2: iv_ruleFunTypeSpecifier= ruleFunTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunTypeSpecifier=ruleFunTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunTypeSpecifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:764:1: ruleFunTypeSpecifier returns [EObject current=null] : (this_VoidType_0= ruleVoidType | this_VarTypeSpecifier_1= ruleVarTypeSpecifier ) ;
    public final EObject ruleFunTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject this_VoidType_0 = null;

        EObject this_VarTypeSpecifier_1 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:767:28: ( (this_VoidType_0= ruleVoidType | this_VarTypeSpecifier_1= ruleVarTypeSpecifier ) )
            // InternalXS.g:768:1: (this_VoidType_0= ruleVoidType | this_VarTypeSpecifier_1= ruleVarTypeSpecifier )
            {
            // InternalXS.g:768:1: (this_VoidType_0= ruleVoidType | this_VarTypeSpecifier_1= ruleVarTypeSpecifier )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=57 && LA5_0<=61)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXS.g:769:5: this_VoidType_0= ruleVoidType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunTypeSpecifierAccess().getVoidTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalXS.g:779:5: this_VarTypeSpecifier_1= ruleVarTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunTypeSpecifierAccess().getVarTypeSpecifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalXS.g:795:1: entryRuleParams returns [EObject current=null] : iv_ruleParams= ruleParams EOF ;
    public final EObject entryRuleParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParams = null;


        try {
            // InternalXS.g:796:2: (iv_ruleParams= ruleParams EOF )
            // InternalXS.g:797:2: iv_ruleParams= ruleParams EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParams=ruleParams();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParams; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:804:1: ruleParams returns [EObject current=null] : ( ( () otherlv_1= 'void' ) | ( ( (lv_params_2_0= ruleParameterDeclaration ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterDeclaration ) ) )* ) ) ;
    public final EObject ruleParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:807:28: ( ( ( () otherlv_1= 'void' ) | ( ( (lv_params_2_0= ruleParameterDeclaration ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterDeclaration ) ) )* ) ) )
            // InternalXS.g:808:1: ( ( () otherlv_1= 'void' ) | ( ( (lv_params_2_0= ruleParameterDeclaration ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterDeclaration ) ) )* ) )
            {
            // InternalXS.g:808:1: ( ( () otherlv_1= 'void' ) | ( ( (lv_params_2_0= ruleParameterDeclaration ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterDeclaration ) ) )* ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=57 && LA7_0<=61)) ) {
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
                    // InternalXS.g:808:2: ( () otherlv_1= 'void' )
                    {
                    // InternalXS.g:808:2: ( () otherlv_1= 'void' )
                    // InternalXS.g:808:3: () otherlv_1= 'void'
                    {
                    // InternalXS.g:808:3: ()
                    // InternalXS.g:809:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getParamsAccess().getParamsAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getParamsAccess().getVoidKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXS.g:819:6: ( ( (lv_params_2_0= ruleParameterDeclaration ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterDeclaration ) ) )* )
                    {
                    // InternalXS.g:819:6: ( ( (lv_params_2_0= ruleParameterDeclaration ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterDeclaration ) ) )* )
                    // InternalXS.g:819:7: ( (lv_params_2_0= ruleParameterDeclaration ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParameterDeclaration ) ) )*
                    {
                    // InternalXS.g:819:7: ( (lv_params_2_0= ruleParameterDeclaration ) )
                    // InternalXS.g:820:1: (lv_params_2_0= ruleParameterDeclaration )
                    {
                    // InternalXS.g:820:1: (lv_params_2_0= ruleParameterDeclaration )
                    // InternalXS.g:821:3: lv_params_2_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParamsAccess().getParamsParameterDeclarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
                    lv_params_2_0=ruleParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParamsRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_2_0, 
                              		"aom.scripting.xs.XS.ParameterDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalXS.g:837:2: (otherlv_3= ',' ( (lv_params_4_0= ruleParameterDeclaration ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalXS.g:837:4: otherlv_3= ',' ( (lv_params_4_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getParamsAccess().getCommaKeyword_1_1_0());
                    	          
                    	    }
                    	    // InternalXS.g:841:1: ( (lv_params_4_0= ruleParameterDeclaration ) )
                    	    // InternalXS.g:842:1: (lv_params_4_0= ruleParameterDeclaration )
                    	    {
                    	    // InternalXS.g:842:1: (lv_params_4_0= ruleParameterDeclaration )
                    	    // InternalXS.g:843:3: lv_params_4_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getParamsAccess().getParamsParameterDeclarationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    lv_params_4_0=ruleParameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getParamsRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_4_0, 
                    	              		"aom.scripting.xs.XS.ParameterDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
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


    // $ANTLR start "entryRuleRuleDeclaration"
    // InternalXS.g:867:1: entryRuleRuleDeclaration returns [EObject current=null] : iv_ruleRuleDeclaration= ruleRuleDeclaration EOF ;
    public final EObject entryRuleRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDeclaration = null;


        try {
            // InternalXS.g:868:2: (iv_ruleRuleDeclaration= ruleRuleDeclaration EOF )
            // InternalXS.g:869:2: iv_ruleRuleDeclaration= ruleRuleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleDeclaration=ruleRuleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:876:1: ruleRuleDeclaration returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_13_0= ruleCompoundStatement ) ) ) ;
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
            // InternalXS.g:879:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_13_0= ruleCompoundStatement ) ) ) )
            // InternalXS.g:880:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_13_0= ruleCompoundStatement ) ) )
            {
            // InternalXS.g:880:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_13_0= ruleCompoundStatement ) ) )
            // InternalXS.g:880:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_statements_13_0= ruleCompoundStatement ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRuleDeclarationAccess().getRuleKeyword_0());
                  
            }
            // InternalXS.g:884:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalXS.g:885:1: (lv_name_1_0= RULE_ID )
            {
            // InternalXS.g:885:1: (lv_name_1_0= RULE_ID )
            // InternalXS.g:886:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
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
                      		"aom.scripting.xs.XS.ID");
              	    
            }

            }


            }

            // InternalXS.g:902:2: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalXS.g:904:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalXS.g:904:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalXS.g:905:2: ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2());
            // InternalXS.g:908:2: ( ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalXS.g:909:3: ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalXS.g:909:3: ( ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=7;
                int LA9_0 = input.LA(1);

                if ( LA9_0 >= 21 && LA9_0 <= 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 1) ) {
                    alt9=2;
                }
                else if ( LA9_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 2) ) {
                    alt9=3;
                }
                else if ( LA9_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 3) ) {
                    alt9=4;
                }
                else if ( LA9_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 4) ) {
                    alt9=5;
                }
                else if ( LA9_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 5) ) {
                    alt9=6;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXS.g:911:4: ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) )
            	    {
            	    // InternalXS.g:911:4: ({...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) ) )
            	    // InternalXS.g:912:5: {...}? => ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalXS.g:912:112: ( ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) ) )
            	    // InternalXS.g:913:6: ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 0);
            	    // InternalXS.g:916:6: ({...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' ) )
            	    // InternalXS.g:916:7: {...}? => ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // InternalXS.g:916:16: ( ( (lv_active_3_0= 'active' ) ) | otherlv_4= 'inactive' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==21) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==22) ) {
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
            	            // InternalXS.g:916:17: ( (lv_active_3_0= 'active' ) )
            	            {
            	            // InternalXS.g:916:17: ( (lv_active_3_0= 'active' ) )
            	            // InternalXS.g:917:1: (lv_active_3_0= 'active' )
            	            {
            	            // InternalXS.g:917:1: (lv_active_3_0= 'active' )
            	            // InternalXS.g:918:3: lv_active_3_0= 'active'
            	            {
            	            lv_active_3_0=(Token)match(input,21,FOLLOW_19); if (state.failed) return current;
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
            	            // InternalXS.g:932:7: otherlv_4= 'inactive'
            	            {
            	            otherlv_4=(Token)match(input,22,FOLLOW_19); if (state.failed) return current;
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
            	    // InternalXS.g:943:4: ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) )
            	    {
            	    // InternalXS.g:943:4: ({...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) ) )
            	    // InternalXS.g:944:5: {...}? => ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalXS.g:944:112: ( ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) ) )
            	    // InternalXS.g:945:6: ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 1);
            	    // InternalXS.g:948:6: ({...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) ) )
            	    // InternalXS.g:948:7: {...}? => ( (lv_runImmediately_5_0= 'runImmediately' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // InternalXS.g:948:16: ( (lv_runImmediately_5_0= 'runImmediately' ) )
            	    // InternalXS.g:949:1: (lv_runImmediately_5_0= 'runImmediately' )
            	    {
            	    // InternalXS.g:949:1: (lv_runImmediately_5_0= 'runImmediately' )
            	    // InternalXS.g:950:3: lv_runImmediately_5_0= 'runImmediately'
            	    {
            	    lv_runImmediately_5_0=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
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
            	    // InternalXS.g:970:4: ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) )
            	    {
            	    // InternalXS.g:970:4: ({...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) ) )
            	    // InternalXS.g:971:5: {...}? => ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalXS.g:971:112: ( ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) ) )
            	    // InternalXS.g:972:6: ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 2);
            	    // InternalXS.g:975:6: ({...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) ) )
            	    // InternalXS.g:975:7: {...}? => ( (lv_highFrequency_6_0= 'highFrequency' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // InternalXS.g:975:16: ( (lv_highFrequency_6_0= 'highFrequency' ) )
            	    // InternalXS.g:976:1: (lv_highFrequency_6_0= 'highFrequency' )
            	    {
            	    // InternalXS.g:976:1: (lv_highFrequency_6_0= 'highFrequency' )
            	    // InternalXS.g:977:3: lv_highFrequency_6_0= 'highFrequency'
            	    {
            	    lv_highFrequency_6_0=(Token)match(input,24,FOLLOW_19); if (state.failed) return current;
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
            	    // InternalXS.g:997:4: ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalXS.g:997:4: ({...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) ) )
            	    // InternalXS.g:998:5: {...}? => ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalXS.g:998:112: ( ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) ) )
            	    // InternalXS.g:999:6: ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 3);
            	    // InternalXS.g:1002:6: ({...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) ) )
            	    // InternalXS.g:1002:7: {...}? => (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // InternalXS.g:1002:16: (otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) ) )
            	    // InternalXS.g:1002:18: otherlv_7= 'group' ( (lv_group_8_0= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getRuleDeclarationAccess().getGroupKeyword_2_3_0());
            	          
            	    }
            	    // InternalXS.g:1006:1: ( (lv_group_8_0= RULE_ID ) )
            	    // InternalXS.g:1007:1: (lv_group_8_0= RULE_ID )
            	    {
            	    // InternalXS.g:1007:1: (lv_group_8_0= RULE_ID )
            	    // InternalXS.g:1008:3: lv_group_8_0= RULE_ID
            	    {
            	    lv_group_8_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
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
            	              		"aom.scripting.xs.XS.ID");
            	      	    
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
            	    // InternalXS.g:1031:4: ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalXS.g:1031:4: ({...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) ) )
            	    // InternalXS.g:1032:5: {...}? => ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalXS.g:1032:112: ( ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) ) )
            	    // InternalXS.g:1033:6: ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 4);
            	    // InternalXS.g:1036:6: ({...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) ) )
            	    // InternalXS.g:1036:7: {...}? => (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // InternalXS.g:1036:16: (otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) ) )
            	    // InternalXS.g:1036:18: otherlv_9= 'minInterval' ( (lv_minInterval_10_0= RULE_INT ) )
            	    {
            	    otherlv_9=(Token)match(input,26,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getRuleDeclarationAccess().getMinIntervalKeyword_2_4_0());
            	          
            	    }
            	    // InternalXS.g:1040:1: ( (lv_minInterval_10_0= RULE_INT ) )
            	    // InternalXS.g:1041:1: (lv_minInterval_10_0= RULE_INT )
            	    {
            	    // InternalXS.g:1041:1: (lv_minInterval_10_0= RULE_INT )
            	    // InternalXS.g:1042:3: lv_minInterval_10_0= RULE_INT
            	    {
            	    lv_minInterval_10_0=(Token)match(input,RULE_INT,FOLLOW_19); if (state.failed) return current;
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
            	              		"aom.scripting.xs.XS.INT");
            	      	    
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
            	    // InternalXS.g:1065:4: ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalXS.g:1065:4: ({...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) ) )
            	    // InternalXS.g:1066:5: {...}? => ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalXS.g:1066:112: ( ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) ) )
            	    // InternalXS.g:1067:6: ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2(), 5);
            	    // InternalXS.g:1070:6: ({...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) ) )
            	    // InternalXS.g:1070:7: {...}? => (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // InternalXS.g:1070:16: (otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) ) )
            	    // InternalXS.g:1070:18: otherlv_11= 'maxInterval' ( (lv_maxInterval_12_0= RULE_INT ) )
            	    {
            	    otherlv_11=(Token)match(input,27,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getRuleDeclarationAccess().getMaxIntervalKeyword_2_5_0());
            	          
            	    }
            	    // InternalXS.g:1074:1: ( (lv_maxInterval_12_0= RULE_INT ) )
            	    // InternalXS.g:1075:1: (lv_maxInterval_12_0= RULE_INT )
            	    {
            	    // InternalXS.g:1075:1: (lv_maxInterval_12_0= RULE_INT )
            	    // InternalXS.g:1076:3: lv_maxInterval_12_0= RULE_INT
            	    {
            	    lv_maxInterval_12_0=(Token)match(input,RULE_INT,FOLLOW_19); if (state.failed) return current;
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
            	              		"aom.scripting.xs.XS.INT");
            	      	    
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
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canLeave(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_2());

            }

            // InternalXS.g:1107:2: ( (lv_statements_13_0= ruleCompoundStatement ) )
            // InternalXS.g:1108:1: (lv_statements_13_0= ruleCompoundStatement )
            {
            // InternalXS.g:1108:1: (lv_statements_13_0= ruleCompoundStatement )
            // InternalXS.g:1109:3: lv_statements_13_0= ruleCompoundStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleDeclarationAccess().getStatementsCompoundStatementParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"aom.scripting.xs.XS.CompoundStatement");
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


    // $ANTLR start "entryRuleFunModifier"
    // InternalXS.g:1133:1: entryRuleFunModifier returns [EObject current=null] : iv_ruleFunModifier= ruleFunModifier EOF ;
    public final EObject entryRuleFunModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunModifier = null;


        try {
            // InternalXS.g:1134:2: (iv_ruleFunModifier= ruleFunModifier EOF )
            // InternalXS.g:1135:2: iv_ruleFunModifier= ruleFunModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunModifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunModifier=ruleFunModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunModifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:1142:1: ruleFunModifier returns [EObject current=null] : ( () ( (lv_mutable_1_0= 'mutable' ) )? ) ;
    public final EObject ruleFunModifier() throws RecognitionException {
        EObject current = null;

        Token lv_mutable_1_0=null;

         enterRule(); 
            
        try {
            // InternalXS.g:1145:28: ( ( () ( (lv_mutable_1_0= 'mutable' ) )? ) )
            // InternalXS.g:1146:1: ( () ( (lv_mutable_1_0= 'mutable' ) )? )
            {
            // InternalXS.g:1146:1: ( () ( (lv_mutable_1_0= 'mutable' ) )? )
            // InternalXS.g:1146:2: () ( (lv_mutable_1_0= 'mutable' ) )?
            {
            // InternalXS.g:1146:2: ()
            // InternalXS.g:1147:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunModifierAccess().getFunModifierAction_0(),
                          current);
                  
            }

            }

            // InternalXS.g:1152:2: ( (lv_mutable_1_0= 'mutable' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXS.g:1153:1: (lv_mutable_1_0= 'mutable' )
                    {
                    // InternalXS.g:1153:1: (lv_mutable_1_0= 'mutable' )
                    // InternalXS.g:1154:3: lv_mutable_1_0= 'mutable'
                    {
                    lv_mutable_1_0=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_mutable_1_0, grammarAccess.getFunModifierAccess().getMutableMutableKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunModifierRule());
                      	        }
                             		setWithLastConsumed(current, "mutable", true, "mutable");
                      	    
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
    // $ANTLR end "ruleFunModifier"


    // $ANTLR start "entryRuleVarTypeSpecifier"
    // InternalXS.g:1175:1: entryRuleVarTypeSpecifier returns [EObject current=null] : iv_ruleVarTypeSpecifier= ruleVarTypeSpecifier EOF ;
    public final EObject entryRuleVarTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarTypeSpecifier = null;


        try {
            // InternalXS.g:1176:2: (iv_ruleVarTypeSpecifier= ruleVarTypeSpecifier EOF )
            // InternalXS.g:1177:2: iv_ruleVarTypeSpecifier= ruleVarTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarTypeSpecifier=ruleVarTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarTypeSpecifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:1184:1: ruleVarTypeSpecifier returns [EObject current=null] : (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BoolType_2= ruleBoolType | this_VectorType_3= ruleVectorType | this_StringType_4= ruleStringType ) ;
    public final EObject ruleVarTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject this_IntType_0 = null;

        EObject this_FloatType_1 = null;

        EObject this_BoolType_2 = null;

        EObject this_VectorType_3 = null;

        EObject this_StringType_4 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1187:28: ( (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BoolType_2= ruleBoolType | this_VectorType_3= ruleVectorType | this_StringType_4= ruleStringType ) )
            // InternalXS.g:1188:1: (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BoolType_2= ruleBoolType | this_VectorType_3= ruleVectorType | this_StringType_4= ruleStringType )
            {
            // InternalXS.g:1188:1: (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BoolType_2= ruleBoolType | this_VectorType_3= ruleVectorType | this_StringType_4= ruleStringType )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt11=1;
                }
                break;
            case 58:
                {
                alt11=2;
                }
                break;
            case 59:
                {
                alt11=3;
                }
                break;
            case 60:
                {
                alt11=4;
                }
                break;
            case 61:
                {
                alt11=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalXS.g:1189:5: this_IntType_0= ruleIntType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarTypeSpecifierAccess().getIntTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalXS.g:1199:5: this_FloatType_1= ruleFloatType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarTypeSpecifierAccess().getFloatTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalXS.g:1209:5: this_BoolType_2= ruleBoolType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarTypeSpecifierAccess().getBoolTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalXS.g:1219:5: this_VectorType_3= ruleVectorType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarTypeSpecifierAccess().getVectorTypeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalXS.g:1229:5: this_StringType_4= ruleStringType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarTypeSpecifierAccess().getStringTypeParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleCompoundStatement"
    // InternalXS.g:1245:1: entryRuleCompoundStatement returns [EObject current=null] : iv_ruleCompoundStatement= ruleCompoundStatement EOF ;
    public final EObject entryRuleCompoundStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundStatement = null;


        try {
            // InternalXS.g:1246:2: (iv_ruleCompoundStatement= ruleCompoundStatement EOF )
            // InternalXS.g:1247:2: iv_ruleCompoundStatement= ruleCompoundStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompoundStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompoundStatement=ruleCompoundStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompoundStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:1254:1: ruleCompoundStatement returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleCompoundStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_contents_2_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1257:28: ( ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' ) )
            // InternalXS.g:1258:1: ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' )
            {
            // InternalXS.g:1258:1: ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' )
            // InternalXS.g:1258:2: () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}'
            {
            // InternalXS.g:1258:2: ()
            // InternalXS.g:1259:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCompoundStatementAccess().getCompoundStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCompoundStatementAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalXS.g:1268:1: ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_INT)||LA12_0==16||LA12_0==29||LA12_0==31||(LA12_0>=33 && LA12_0<=35)||(LA12_0>=39 && LA12_0<=41)||LA12_0==53||(LA12_0>=57 && LA12_0<=61)||(LA12_0>=63 && LA12_0<=64)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXS.g:1269:1: (lv_contents_2_0= ruleVarDeclarationOrStatement )
            	    {
            	    // InternalXS.g:1269:1: (lv_contents_2_0= ruleVarDeclarationOrStatement )
            	    // InternalXS.g:1270:3: lv_contents_2_0= ruleVarDeclarationOrStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompoundStatementAccess().getContentsVarDeclarationOrStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_21);
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
            	              		"aom.scripting.xs.XS.VarDeclarationOrStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:1298:1: entryRuleVarDeclarationOrStatement returns [EObject current=null] : iv_ruleVarDeclarationOrStatement= ruleVarDeclarationOrStatement EOF ;
    public final EObject entryRuleVarDeclarationOrStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclarationOrStatement = null;


        try {
            // InternalXS.g:1299:2: (iv_ruleVarDeclarationOrStatement= ruleVarDeclarationOrStatement EOF )
            // InternalXS.g:1300:2: iv_ruleVarDeclarationOrStatement= ruleVarDeclarationOrStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclarationOrStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclarationOrStatement=ruleVarDeclarationOrStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDeclarationOrStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:1307:1: ruleVarDeclarationOrStatement returns [EObject current=null] : ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_Statement_2= ruleStatement ) ;
    public final EObject ruleVarDeclarationOrStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_VarDeclaration_0 = null;

        EObject this_Statement_2 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1310:28: ( ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_Statement_2= ruleStatement ) )
            // InternalXS.g:1311:1: ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_Statement_2= ruleStatement )
            {
            // InternalXS.g:1311:1: ( (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' ) | this_Statement_2= ruleStatement )
            int alt13=2;
            switch ( input.LA(1) ) {
            case 57:
            case 58:
            case 59:
            case 61:
                {
                alt13=1;
                }
                break;
            case 60:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==16) ) {
                    alt13=2;
                }
                else if ( (LA13_2==RULE_ID) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case 16:
            case 29:
            case 31:
            case 33:
            case 34:
            case 35:
            case 39:
            case 40:
            case 41:
            case 53:
            case 63:
            case 64:
                {
                alt13=2;
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
                    // InternalXS.g:1311:2: (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' )
                    {
                    // InternalXS.g:1311:2: (this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';' )
                    // InternalXS.g:1312:5: this_VarDeclaration_0= ruleVarDeclaration otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarDeclarationOrStatementAccess().getVarDeclarationParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_5);
                    this_VarDeclaration_0=ruleVarDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VarDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVarDeclarationOrStatementAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXS.g:1326:5: this_Statement_2= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarDeclarationOrStatementAccess().getStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalXS.g:1342:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalXS.g:1343:2: (iv_ruleStatement= ruleStatement EOF )
            // InternalXS.g:1344:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:1351:1: ruleStatement returns [EObject current=null] : (this_ExpressionStatement_0= ruleExpressionStatement | this_PostfixStatement_1= rulePostfixStatement | this_CompoundStatement_2= ruleCompoundStatement | this_IfElseStatement_3= ruleIfElseStatement | this_WhileStatement_4= ruleWhileStatement | this_ForStatement_5= ruleForStatement | this_SwitchStatement_6= ruleSwitchStatement | this_ReturnStatement_7= ruleReturnStatement | this_ContinueStatement_8= ruleContinueStatement | this_BreakStatement_9= ruleBreakStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionStatement_0 = null;

        EObject this_PostfixStatement_1 = null;

        EObject this_CompoundStatement_2 = null;

        EObject this_IfElseStatement_3 = null;

        EObject this_WhileStatement_4 = null;

        EObject this_ForStatement_5 = null;

        EObject this_SwitchStatement_6 = null;

        EObject this_ReturnStatement_7 = null;

        EObject this_ContinueStatement_8 = null;

        EObject this_BreakStatement_9 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1354:28: ( (this_ExpressionStatement_0= ruleExpressionStatement | this_PostfixStatement_1= rulePostfixStatement | this_CompoundStatement_2= ruleCompoundStatement | this_IfElseStatement_3= ruleIfElseStatement | this_WhileStatement_4= ruleWhileStatement | this_ForStatement_5= ruleForStatement | this_SwitchStatement_6= ruleSwitchStatement | this_ReturnStatement_7= ruleReturnStatement | this_ContinueStatement_8= ruleContinueStatement | this_BreakStatement_9= ruleBreakStatement ) )
            // InternalXS.g:1355:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_PostfixStatement_1= rulePostfixStatement | this_CompoundStatement_2= ruleCompoundStatement | this_IfElseStatement_3= ruleIfElseStatement | this_WhileStatement_4= ruleWhileStatement | this_ForStatement_5= ruleForStatement | this_SwitchStatement_6= ruleSwitchStatement | this_ReturnStatement_7= ruleReturnStatement | this_ContinueStatement_8= ruleContinueStatement | this_BreakStatement_9= ruleBreakStatement )
            {
            // InternalXS.g:1355:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_PostfixStatement_1= rulePostfixStatement | this_CompoundStatement_2= ruleCompoundStatement | this_IfElseStatement_3= ruleIfElseStatement | this_WhileStatement_4= ruleWhileStatement | this_ForStatement_5= ruleForStatement | this_SwitchStatement_6= ruleSwitchStatement | this_ReturnStatement_7= ruleReturnStatement | this_ContinueStatement_8= ruleContinueStatement | this_BreakStatement_9= ruleBreakStatement )
            int alt14=10;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalXS.g:1356:5: this_ExpressionStatement_0= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExpressionStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalXS.g:1366:5: this_PostfixStatement_1= rulePostfixStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getPostfixStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_PostfixStatement_1=rulePostfixStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PostfixStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalXS.g:1376:5: this_CompoundStatement_2= ruleCompoundStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getCompoundStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_CompoundStatement_2=ruleCompoundStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompoundStatement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalXS.g:1386:5: this_IfElseStatement_3= ruleIfElseStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfElseStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_IfElseStatement_3=ruleIfElseStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfElseStatement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalXS.g:1396:5: this_WhileStatement_4= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_4=ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WhileStatement_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalXS.g:1406:5: this_ForStatement_5= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ForStatement_5=ruleForStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ForStatement_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalXS.g:1416:5: this_SwitchStatement_6= ruleSwitchStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_SwitchStatement_6=ruleSwitchStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SwitchStatement_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalXS.g:1426:5: this_ReturnStatement_7= ruleReturnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ReturnStatement_7=ruleReturnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReturnStatement_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // InternalXS.g:1436:5: this_ContinueStatement_8= ruleContinueStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getContinueStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ContinueStatement_8=ruleContinueStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ContinueStatement_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // InternalXS.g:1446:5: this_BreakStatement_9= ruleBreakStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getBreakStatementParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BreakStatement_9=ruleBreakStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BreakStatement_9; 
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
    // InternalXS.g:1462:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // InternalXS.g:1463:2: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // InternalXS.g:1464:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionStatement=ruleExpressionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:1471:1: ruleExpressionStatement returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1474:28: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) )
            // InternalXS.g:1475:1: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            {
            // InternalXS.g:1475:1: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            // InternalXS.g:1475:2: ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';'
            {
            // InternalXS.g:1475:2: ( (lv_expression_0_0= ruleExpression ) )
            // InternalXS.g:1476:1: (lv_expression_0_0= ruleExpression )
            {
            // InternalXS.g:1476:1: (lv_expression_0_0= ruleExpression )
            // InternalXS.g:1477:3: lv_expression_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionStatementAccess().getExpressionExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_5);
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
                      		"aom.scripting.xs.XS.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_1());
                  
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
    // $ANTLR end "ruleExpressionStatement"


    // $ANTLR start "entryRulePostfixStatement"
    // InternalXS.g:1505:1: entryRulePostfixStatement returns [EObject current=null] : iv_rulePostfixStatement= rulePostfixStatement EOF ;
    public final EObject entryRulePostfixStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixStatement = null;


        try {
            // InternalXS.g:1506:2: (iv_rulePostfixStatement= rulePostfixStatement EOF )
            // InternalXS.g:1507:2: iv_rulePostfixStatement= rulePostfixStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePostfixStatement=rulePostfixStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixStatement"


    // $ANTLR start "rulePostfixStatement"
    // InternalXS.g:1514:1: rulePostfixStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= rulePostFixOp ) ) otherlv_2= ';' ) ;
    public final EObject rulePostfixStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1517:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= rulePostFixOp ) ) otherlv_2= ';' ) )
            // InternalXS.g:1518:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= rulePostFixOp ) ) otherlv_2= ';' )
            {
            // InternalXS.g:1518:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= rulePostFixOp ) ) otherlv_2= ';' )
            // InternalXS.g:1518:2: ( (otherlv_0= RULE_ID ) ) ( (lv_op_1_0= rulePostFixOp ) ) otherlv_2= ';'
            {
            // InternalXS.g:1518:2: ( (otherlv_0= RULE_ID ) )
            // InternalXS.g:1519:1: (otherlv_0= RULE_ID )
            {
            // InternalXS.g:1519:1: (otherlv_0= RULE_ID )
            // InternalXS.g:1520:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPostfixStatementRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPostfixStatementAccess().getVarVarDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalXS.g:1531:2: ( (lv_op_1_0= rulePostFixOp ) )
            // InternalXS.g:1532:1: (lv_op_1_0= rulePostFixOp )
            {
            // InternalXS.g:1532:1: (lv_op_1_0= rulePostFixOp )
            // InternalXS.g:1533:3: lv_op_1_0= rulePostFixOp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPostfixStatementAccess().getOpPostFixOpParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_5);
            lv_op_1_0=rulePostFixOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPostfixStatementRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_1_0, 
                      		"aom.scripting.xs.XS.PostFixOp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPostfixStatementAccess().getSemicolonKeyword_2());
                  
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
    // $ANTLR end "rulePostfixStatement"


    // $ANTLR start "entryRuleIfElseStatement"
    // InternalXS.g:1561:1: entryRuleIfElseStatement returns [EObject current=null] : iv_ruleIfElseStatement= ruleIfElseStatement EOF ;
    public final EObject entryRuleIfElseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseStatement = null;


        try {
            // InternalXS.g:1562:2: (iv_ruleIfElseStatement= ruleIfElseStatement EOF )
            // InternalXS.g:1563:2: iv_ruleIfElseStatement= ruleIfElseStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfElseStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfElseStatement=ruleIfElseStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfElseStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:1570:1: ruleIfElseStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) ;
    public final EObject ruleIfElseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_thenStatement_4_0 = null;

        EObject lv_elseStatement_6_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1573:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? ) )
            // InternalXS.g:1574:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            {
            // InternalXS.g:1574:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )? )
            // InternalXS.g:1574:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenStatement_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfElseStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfElseStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalXS.g:1582:1: ( (lv_condition_2_0= ruleExpression ) )
            // InternalXS.g:1583:1: (lv_condition_2_0= ruleExpression )
            {
            // InternalXS.g:1583:1: (lv_condition_2_0= ruleExpression )
            // InternalXS.g:1584:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfElseStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
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
                      		"aom.scripting.xs.XS.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfElseStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // InternalXS.g:1604:1: ( (lv_thenStatement_4_0= ruleStatement ) )
            // InternalXS.g:1605:1: (lv_thenStatement_4_0= ruleStatement )
            {
            // InternalXS.g:1605:1: (lv_thenStatement_4_0= ruleStatement )
            // InternalXS.g:1606:3: lv_thenStatement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfElseStatementAccess().getThenStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_24);
            lv_thenStatement_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
              	        }
                     		set(
                     			current, 
                     			"thenStatement",
                      		lv_thenStatement_4_0, 
                      		"aom.scripting.xs.XS.Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXS.g:1622:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                int LA15_1 = input.LA(2);

                if ( (synpred1_InternalXS()) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalXS.g:1622:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseStatement_6_0= ruleStatement ) )
                    {
                    // InternalXS.g:1622:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalXS.g:1622:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfElseStatementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // InternalXS.g:1627:2: ( (lv_elseStatement_6_0= ruleStatement ) )
                    // InternalXS.g:1628:1: (lv_elseStatement_6_0= ruleStatement )
                    {
                    // InternalXS.g:1628:1: (lv_elseStatement_6_0= ruleStatement )
                    // InternalXS.g:1629:3: lv_elseStatement_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfElseStatementAccess().getElseStatementStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"aom.scripting.xs.XS.Statement");
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
    // InternalXS.g:1653:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalXS.g:1654:2: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalXS.g:1655:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:1662:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statement_4_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1665:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) )
            // InternalXS.g:1666:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            {
            // InternalXS.g:1666:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            // InternalXS.g:1666:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalXS.g:1674:1: ( (lv_condition_2_0= ruleExpression ) )
            // InternalXS.g:1675:1: (lv_condition_2_0= ruleExpression )
            {
            // InternalXS.g:1675:1: (lv_condition_2_0= ruleExpression )
            // InternalXS.g:1676:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
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
                      		"aom.scripting.xs.XS.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // InternalXS.g:1696:1: ( (lv_statement_4_0= ruleStatement ) )
            // InternalXS.g:1697:1: (lv_statement_4_0= ruleStatement )
            {
            // InternalXS.g:1697:1: (lv_statement_4_0= ruleStatement )
            // InternalXS.g:1698:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"aom.scripting.xs.XS.Statement");
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
    // InternalXS.g:1722:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalXS.g:1723:2: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalXS.g:1724:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:1731:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) ) ;
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
            // InternalXS.g:1734:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) ) )
            // InternalXS.g:1735:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) )
            {
            // InternalXS.g:1735:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) ) )
            // InternalXS.g:1735:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleForVarDeclaration ) ) otherlv_3= ';' ( (lv_op_4_0= ruleRelOp ) ) ( (lv_expression_5_0= ruleExpression ) ) otherlv_6= ')' ( (lv_statement_7_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalXS.g:1743:1: ( (lv_var_2_0= ruleForVarDeclaration ) )
            // InternalXS.g:1744:1: (lv_var_2_0= ruleForVarDeclaration )
            {
            // InternalXS.g:1744:1: (lv_var_2_0= ruleForVarDeclaration )
            // InternalXS.g:1745:3: lv_var_2_0= ruleForVarDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getVarForVarDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_5);
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
                      		"aom.scripting.xs.XS.ForVarDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_3());
                  
            }
            // InternalXS.g:1765:1: ( (lv_op_4_0= ruleRelOp ) )
            // InternalXS.g:1766:1: (lv_op_4_0= ruleRelOp )
            {
            // InternalXS.g:1766:1: (lv_op_4_0= ruleRelOp )
            // InternalXS.g:1767:3: lv_op_4_0= ruleRelOp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getOpRelOpParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_8);
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
                      		"aom.scripting.xs.XS.RelOp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXS.g:1783:2: ( (lv_expression_5_0= ruleExpression ) )
            // InternalXS.g:1784:1: (lv_expression_5_0= ruleExpression )
            {
            // InternalXS.g:1784:1: (lv_expression_5_0= ruleExpression )
            // InternalXS.g:1785:3: lv_expression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getExpressionExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
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
                      		"aom.scripting.xs.XS.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_6());
                  
            }
            // InternalXS.g:1805:1: ( (lv_statement_7_0= ruleStatement ) )
            // InternalXS.g:1806:1: (lv_statement_7_0= ruleStatement )
            {
            // InternalXS.g:1806:1: (lv_statement_7_0= ruleStatement )
            // InternalXS.g:1807:3: lv_statement_7_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getStatementStatementParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"aom.scripting.xs.XS.Statement");
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
    // InternalXS.g:1831:1: entryRuleSwitchStatement returns [EObject current=null] : iv_ruleSwitchStatement= ruleSwitchStatement EOF ;
    public final EObject entryRuleSwitchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchStatement = null;


        try {
            // InternalXS.g:1832:2: (iv_ruleSwitchStatement= ruleSwitchStatement EOF )
            // InternalXS.g:1833:2: iv_ruleSwitchStatement= ruleSwitchStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchStatement=ruleSwitchStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:1840:1: ruleSwitchStatement returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}' ) ;
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
            // InternalXS.g:1843:28: ( (otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}' ) )
            // InternalXS.g:1844:1: (otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}' )
            {
            // InternalXS.g:1844:1: (otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}' )
            // InternalXS.g:1844:3: otherlv_0= 'switch' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_cases_5_0= ruleSwitchCase ) )* ( (lv_default_6_0= ruleSwitchDefault ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchStatementAccess().getSwitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalXS.g:1852:1: ( (otherlv_2= RULE_ID ) )
            // InternalXS.g:1853:1: (otherlv_2= RULE_ID )
            {
            // InternalXS.g:1853:1: (otherlv_2= RULE_ID )
            // InternalXS.g:1854:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSwitchStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getSwitchStatementAccess().getVarVarDeclarationCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,29,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitchStatementAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // InternalXS.g:1873:1: ( (lv_cases_5_0= ruleSwitchCase ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalXS.g:1874:1: (lv_cases_5_0= ruleSwitchCase )
            	    {
            	    // InternalXS.g:1874:1: (lv_cases_5_0= ruleSwitchCase )
            	    // InternalXS.g:1875:3: lv_cases_5_0= ruleSwitchCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getCasesSwitchCaseParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_26);
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
            	              		"aom.scripting.xs.XS.SwitchCase");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalXS.g:1891:3: ( (lv_default_6_0= ruleSwitchDefault ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXS.g:1892:1: (lv_default_6_0= ruleSwitchDefault )
                    {
                    // InternalXS.g:1892:1: (lv_default_6_0= ruleSwitchDefault )
                    // InternalXS.g:1893:3: lv_default_6_0= ruleSwitchDefault
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getDefaultSwitchDefaultParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_27);
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
                              		"aom.scripting.xs.XS.SwitchDefault");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:1921:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // InternalXS.g:1922:2: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // InternalXS.g:1923:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchCase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:1930:1: ruleSwitchCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_var_1_0= ruleLiteralNumOrVar ) ) otherlv_2= ':' ( (lv_statement_3_0= ruleStatement ) ) ) ;
    public final EObject ruleSwitchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_var_1_0 = null;

        EObject lv_statement_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1933:28: ( (otherlv_0= 'case' ( (lv_var_1_0= ruleLiteralNumOrVar ) ) otherlv_2= ':' ( (lv_statement_3_0= ruleStatement ) ) ) )
            // InternalXS.g:1934:1: (otherlv_0= 'case' ( (lv_var_1_0= ruleLiteralNumOrVar ) ) otherlv_2= ':' ( (lv_statement_3_0= ruleStatement ) ) )
            {
            // InternalXS.g:1934:1: (otherlv_0= 'case' ( (lv_var_1_0= ruleLiteralNumOrVar ) ) otherlv_2= ':' ( (lv_statement_3_0= ruleStatement ) ) )
            // InternalXS.g:1934:3: otherlv_0= 'case' ( (lv_var_1_0= ruleLiteralNumOrVar ) ) otherlv_2= ':' ( (lv_statement_3_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchCaseAccess().getCaseKeyword_0());
                  
            }
            // InternalXS.g:1938:1: ( (lv_var_1_0= ruleLiteralNumOrVar ) )
            // InternalXS.g:1939:1: (lv_var_1_0= ruleLiteralNumOrVar )
            {
            // InternalXS.g:1939:1: (lv_var_1_0= ruleLiteralNumOrVar )
            // InternalXS.g:1940:3: lv_var_1_0= ruleLiteralNumOrVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getVarLiteralNumOrVarParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_29);
            lv_var_1_0=ruleLiteralNumOrVar();

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
                      		"aom.scripting.xs.XS.LiteralNumOrVar");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSwitchCaseAccess().getColonKeyword_2());
                  
            }
            // InternalXS.g:1960:1: ( (lv_statement_3_0= ruleStatement ) )
            // InternalXS.g:1961:1: (lv_statement_3_0= ruleStatement )
            {
            // InternalXS.g:1961:1: (lv_statement_3_0= ruleStatement )
            // InternalXS.g:1962:3: lv_statement_3_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getStatementStatementParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_statement_3_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_3_0, 
                      		"aom.scripting.xs.XS.Statement");
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
    // $ANTLR end "ruleSwitchCase"


    // $ANTLR start "entryRuleSwitchDefault"
    // InternalXS.g:1986:1: entryRuleSwitchDefault returns [EObject current=null] : iv_ruleSwitchDefault= ruleSwitchDefault EOF ;
    public final EObject entryRuleSwitchDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchDefault = null;


        try {
            // InternalXS.g:1987:2: (iv_ruleSwitchDefault= ruleSwitchDefault EOF )
            // InternalXS.g:1988:2: iv_ruleSwitchDefault= ruleSwitchDefault EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchDefaultRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchDefault=ruleSwitchDefault();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchDefault; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:1995:1: ruleSwitchDefault returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= ':' ( (lv_statement_2_0= ruleStatement ) ) ) ;
    public final EObject ruleSwitchDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_statement_2_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1998:28: ( (otherlv_0= 'default' otherlv_1= ':' ( (lv_statement_2_0= ruleStatement ) ) ) )
            // InternalXS.g:1999:1: (otherlv_0= 'default' otherlv_1= ':' ( (lv_statement_2_0= ruleStatement ) ) )
            {
            // InternalXS.g:1999:1: (otherlv_0= 'default' otherlv_1= ':' ( (lv_statement_2_0= ruleStatement ) ) )
            // InternalXS.g:1999:3: otherlv_0= 'default' otherlv_1= ':' ( (lv_statement_2_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchDefaultAccess().getDefaultKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,37,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchDefaultAccess().getColonKeyword_1());
                  
            }
            // InternalXS.g:2007:1: ( (lv_statement_2_0= ruleStatement ) )
            // InternalXS.g:2008:1: (lv_statement_2_0= ruleStatement )
            {
            // InternalXS.g:2008:1: (lv_statement_2_0= ruleStatement )
            // InternalXS.g:2009:3: lv_statement_2_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchDefaultAccess().getStatementStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_statement_2_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchDefaultRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_2_0, 
                      		"aom.scripting.xs.XS.Statement");
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
    // $ANTLR end "ruleSwitchDefault"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalXS.g:2033:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalXS.g:2034:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalXS.g:2035:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2042:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2045:28: ( ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' ) )
            // InternalXS.g:2046:1: ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' )
            {
            // InternalXS.g:2046:1: ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' )
            // InternalXS.g:2046:2: () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';'
            {
            // InternalXS.g:2046:2: ()
            // InternalXS.g:2047:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getReturnKeyword_1());
                  
            }
            // InternalXS.g:2056:1: (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXS.g:2056:3: otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getReturnStatementAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalXS.g:2060:1: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalXS.g:2061:1: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalXS.g:2061:1: (lv_expression_3_0= ruleExpression )
                    // InternalXS.g:2062:3: lv_expression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_14);
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
                              		"aom.scripting.xs.XS.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReturnStatementAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:2094:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // InternalXS.g:2095:2: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // InternalXS.g:2096:2: iv_ruleContinueStatement= ruleContinueStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContinueStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContinueStatement=ruleContinueStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContinueStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2103:1: ruleContinueStatement returns [EObject current=null] : ( () otherlv_1= 'continue' otherlv_2= ';' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalXS.g:2106:28: ( ( () otherlv_1= 'continue' otherlv_2= ';' ) )
            // InternalXS.g:2107:1: ( () otherlv_1= 'continue' otherlv_2= ';' )
            {
            // InternalXS.g:2107:1: ( () otherlv_1= 'continue' otherlv_2= ';' )
            // InternalXS.g:2107:2: () otherlv_1= 'continue' otherlv_2= ';'
            {
            // InternalXS.g:2107:2: ()
            // InternalXS.g:2108:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContinueStatementAccess().getContinueStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContinueStatementAccess().getContinueKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:2129:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // InternalXS.g:2130:2: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // InternalXS.g:2131:2: iv_ruleBreakStatement= ruleBreakStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBreakStatement=ruleBreakStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2138:1: ruleBreakStatement returns [EObject current=null] : ( () otherlv_1= 'break' otherlv_2= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalXS.g:2141:28: ( ( () otherlv_1= 'break' otherlv_2= ';' ) )
            // InternalXS.g:2142:1: ( () otherlv_1= 'break' otherlv_2= ';' )
            {
            // InternalXS.g:2142:1: ( () otherlv_1= 'break' otherlv_2= ';' )
            // InternalXS.g:2142:2: () otherlv_1= 'break' otherlv_2= ';'
            {
            // InternalXS.g:2142:2: ()
            // InternalXS.g:2143:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBreakStatementAccess().getBreakStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBreakStatementAccess().getBreakKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:2164:1: entryRulePostFixOp returns [String current=null] : iv_rulePostFixOp= rulePostFixOp EOF ;
    public final String entryRulePostFixOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePostFixOp = null;


        try {
            // InternalXS.g:2165:2: (iv_rulePostFixOp= rulePostFixOp EOF )
            // InternalXS.g:2166:2: iv_rulePostFixOp= rulePostFixOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostFixOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePostFixOp=rulePostFixOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostFixOp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2173:1: rulePostFixOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' ) ;
    public final AntlrDatatypeRuleToken rulePostFixOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXS.g:2176:28: ( (kw= '++' | kw= '--' ) )
            // InternalXS.g:2177:1: (kw= '++' | kw= '--' )
            {
            // InternalXS.g:2177:1: (kw= '++' | kw= '--' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            else if ( (LA19_0==43) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalXS.g:2178:2: kw= '++'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPostFixOpAccess().getPlusSignPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:2185:2: kw= '--'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:2198:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalXS.g:2199:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalXS.g:2200:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2207:1: ruleExpression returns [EObject current=null] : ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) | ( (lv_expression_4_0= ruleSimpleExpression ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_var_1_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2210:28: ( ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) | ( (lv_expression_4_0= ruleSimpleExpression ) ) ) )
            // InternalXS.g:2211:1: ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) | ( (lv_expression_4_0= ruleSimpleExpression ) ) )
            {
            // InternalXS.g:2211:1: ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) | ( (lv_expression_4_0= ruleSimpleExpression ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==EOF||LA20_1==12||(LA20_1>=16 && LA20_1<=17)||LA20_1==19||(LA20_1>=44 && LA20_1<=56)) ) {
                    alt20=2;
                }
                else if ( (LA20_1==13) ) {
                    alt20=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA20_0==RULE_STRING||LA20_0==RULE_INT||LA20_0==16||LA20_0==53||LA20_0==60||(LA20_0>=63 && LA20_0<=64)) ) {
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
                    // InternalXS.g:2211:2: ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
                    {
                    // InternalXS.g:2211:2: ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
                    // InternalXS.g:2211:3: () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
                    {
                    // InternalXS.g:2211:3: ()
                    // InternalXS.g:2212:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpressionAccess().getAssignmentExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalXS.g:2217:2: ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
                    // InternalXS.g:2217:3: ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    // InternalXS.g:2217:3: ( (lv_var_1_0= ruleVar ) )
                    // InternalXS.g:2218:1: (lv_var_1_0= ruleVar )
                    {
                    // InternalXS.g:2218:1: (lv_var_1_0= ruleVar )
                    // InternalXS.g:2219:3: lv_var_1_0= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getVarVarParserRuleCall_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
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
                              		"aom.scripting.xs.XS.Var");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getEqualsSignKeyword_0_1_1());
                          
                    }
                    // InternalXS.g:2239:1: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalXS.g:2240:1: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalXS.g:2240:1: (lv_expression_3_0= ruleExpression )
                    // InternalXS.g:2241:3: lv_expression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_0_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"aom.scripting.xs.XS.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXS.g:2258:6: ( (lv_expression_4_0= ruleSimpleExpression ) )
                    {
                    // InternalXS.g:2258:6: ( (lv_expression_4_0= ruleSimpleExpression ) )
                    // InternalXS.g:2259:1: (lv_expression_4_0= ruleSimpleExpression )
                    {
                    // InternalXS.g:2259:1: (lv_expression_4_0= ruleSimpleExpression )
                    // InternalXS.g:2260:3: lv_expression_4_0= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionSimpleExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"aom.scripting.xs.XS.SimpleExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // InternalXS.g:2284:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalXS.g:2285:2: (iv_ruleVar= ruleVar EOF )
            // InternalXS.g:2286:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2293:1: ruleVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalXS.g:2296:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalXS.g:2297:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalXS.g:2297:1: ( (otherlv_0= RULE_ID ) )
            // InternalXS.g:2298:1: (otherlv_0= RULE_ID )
            {
            // InternalXS.g:2298:1: (otherlv_0= RULE_ID )
            // InternalXS.g:2299:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVarRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVarAccess().getDeclarationVarDeclarationCrossReference_0()); 
              	
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
    // InternalXS.g:2318:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // InternalXS.g:2319:2: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // InternalXS.g:2320:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleExpression=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2327:1: ruleSimpleExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2330:28: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalXS.g:2331:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalXS.g:2331:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalXS.g:2332:5: this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSimpleExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_31);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalXS.g:2340:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==44) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXS.g:2340:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalXS.g:2340:2: ()
            	    // InternalXS.g:2341:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSimpleExpressionAccess().getOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalXS.g:2346:2: ( (lv_op_2_0= '||' ) )
            	    // InternalXS.g:2347:1: (lv_op_2_0= '||' )
            	    {
            	    // InternalXS.g:2347:1: (lv_op_2_0= '||' )
            	    // InternalXS.g:2348:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,44,FOLLOW_8); if (state.failed) return current;
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

            	    // InternalXS.g:2361:2: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalXS.g:2362:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalXS.g:2362:1: (lv_right_3_0= ruleAndExpression )
            	    // InternalXS.g:2363:3: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_31);
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
            	              		"aom.scripting.xs.XS.AndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalXS.g:2387:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalXS.g:2388:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalXS.g:2389:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2396:1: ruleAndExpression returns [EObject current=null] : (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_EqualsExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2399:28: ( (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* ) )
            // InternalXS.g:2400:1: (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* )
            {
            // InternalXS.g:2400:1: (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* )
            // InternalXS.g:2401:5: this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualsExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_32);
            this_EqualsExpression_0=ruleEqualsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EqualsExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalXS.g:2409:1: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==45) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXS.g:2409:2: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) )
            	    {
            	    // InternalXS.g:2409:2: ()
            	    // InternalXS.g:2410:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionAccess().getAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalXS.g:2415:2: ( (lv_op_2_0= '&&' ) )
            	    // InternalXS.g:2416:1: (lv_op_2_0= '&&' )
            	    {
            	    // InternalXS.g:2416:1: (lv_op_2_0= '&&' )
            	    // InternalXS.g:2417:3: lv_op_2_0= '&&'
            	    {
            	    lv_op_2_0=(Token)match(input,45,FOLLOW_8); if (state.failed) return current;
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

            	    // InternalXS.g:2430:2: ( (lv_right_3_0= ruleEqualsExpression ) )
            	    // InternalXS.g:2431:1: (lv_right_3_0= ruleEqualsExpression )
            	    {
            	    // InternalXS.g:2431:1: (lv_right_3_0= ruleEqualsExpression )
            	    // InternalXS.g:2432:3: lv_right_3_0= ruleEqualsExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualsExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_32);
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
            	              		"aom.scripting.xs.XS.EqualsExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalXS.g:2456:1: entryRuleEqualsExpression returns [EObject current=null] : iv_ruleEqualsExpression= ruleEqualsExpression EOF ;
    public final EObject entryRuleEqualsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsExpression = null;


        try {
            // InternalXS.g:2457:2: (iv_ruleEqualsExpression= ruleEqualsExpression EOF )
            // InternalXS.g:2458:2: iv_ruleEqualsExpression= ruleEqualsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualsExpression=ruleEqualsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2465:1: ruleEqualsExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? ) ;
    public final EObject ruleEqualsExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2468:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? ) )
            // InternalXS.g:2469:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? )
            {
            // InternalXS.g:2469:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? )
            // InternalXS.g:2470:5: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEqualsExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_33);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparisonExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalXS.g:2478:1: ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=46 && LA23_0<=47)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXS.g:2478:2: () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) )
                    {
                    // InternalXS.g:2478:2: ()
                    // InternalXS.g:2479:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEqualsExpressionAccess().getEqualsLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalXS.g:2484:2: ( (lv_op_2_0= ruleEqOp ) )
                    // InternalXS.g:2485:1: (lv_op_2_0= ruleEqOp )
                    {
                    // InternalXS.g:2485:1: (lv_op_2_0= ruleEqOp )
                    // InternalXS.g:2486:3: lv_op_2_0= ruleEqOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualsExpressionAccess().getOpEqOpParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_8);
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
                              		"aom.scripting.xs.XS.EqOp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalXS.g:2502:2: ( (lv_right_3_0= ruleComparisonExpression ) )
                    // InternalXS.g:2503:1: (lv_right_3_0= ruleComparisonExpression )
                    {
                    // InternalXS.g:2503:1: (lv_right_3_0= ruleComparisonExpression )
                    // InternalXS.g:2504:3: lv_right_3_0= ruleComparisonExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualsExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"aom.scripting.xs.XS.ComparisonExpression");
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
    // InternalXS.g:2528:1: entryRuleEqOp returns [String current=null] : iv_ruleEqOp= ruleEqOp EOF ;
    public final String entryRuleEqOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqOp = null;


        try {
            // InternalXS.g:2529:2: (iv_ruleEqOp= ruleEqOp EOF )
            // InternalXS.g:2530:2: iv_ruleEqOp= ruleEqOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqOp=ruleEqOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqOp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2537:1: ruleEqOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXS.g:2540:28: ( (kw= '==' | kw= '!=' ) )
            // InternalXS.g:2541:1: (kw= '==' | kw= '!=' )
            {
            // InternalXS.g:2541:1: (kw= '==' | kw= '!=' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==46) ) {
                alt24=1;
            }
            else if ( (LA24_0==47) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalXS.g:2542:2: kw= '=='
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqOpAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:2549:2: kw= '!='
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:2562:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalXS.g:2563:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalXS.g:2564:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2571:1: ruleComparisonExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2574:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) )
            // InternalXS.g:2575:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            {
            // InternalXS.g:2575:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            // InternalXS.g:2576:5: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_34);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalXS.g:2584:1: ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=48 && LA25_0<=51)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXS.g:2584:2: () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
                    {
                    // InternalXS.g:2584:2: ()
                    // InternalXS.g:2585:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getComparisonExpressionAccess().getComparisonLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalXS.g:2590:2: ( (lv_op_2_0= ruleRelOp ) )
                    // InternalXS.g:2591:1: (lv_op_2_0= ruleRelOp )
                    {
                    // InternalXS.g:2591:1: (lv_op_2_0= ruleRelOp )
                    // InternalXS.g:2592:3: lv_op_2_0= ruleRelOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOpRelOpParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_8);
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
                              		"aom.scripting.xs.XS.RelOp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalXS.g:2608:2: ( (lv_right_3_0= ruleAdditiveExpression ) )
                    // InternalXS.g:2609:1: (lv_right_3_0= ruleAdditiveExpression )
                    {
                    // InternalXS.g:2609:1: (lv_right_3_0= ruleAdditiveExpression )
                    // InternalXS.g:2610:3: lv_right_3_0= ruleAdditiveExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"aom.scripting.xs.XS.AdditiveExpression");
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
    // InternalXS.g:2634:1: entryRuleRelOp returns [String current=null] : iv_ruleRelOp= ruleRelOp EOF ;
    public final String entryRuleRelOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelOp = null;


        try {
            // InternalXS.g:2635:2: (iv_ruleRelOp= ruleRelOp EOF )
            // InternalXS.g:2636:2: iv_ruleRelOp= ruleRelOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelOp=ruleRelOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelOp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2643:1: ruleRelOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXS.g:2646:28: ( (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' ) )
            // InternalXS.g:2647:1: (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' )
            {
            // InternalXS.g:2647:1: (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt26=1;
                }
                break;
            case 49:
                {
                alt26=2;
                }
                break;
            case 50:
                {
                alt26=3;
                }
                break;
            case 51:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalXS.g:2648:2: kw= '<='
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:2655:2: kw= '<'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalXS.g:2662:2: kw= '>'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalXS.g:2669:2: kw= '>='
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:2682:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalXS.g:2683:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalXS.g:2684:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2691:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2694:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalXS.g:2695:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalXS.g:2695:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalXS.g:2696:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_35);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalXS.g:2704:1: ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=52 && LA27_0<=53)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalXS.g:2704:2: () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalXS.g:2704:2: ()
            	    // InternalXS.g:2705:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getTermLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalXS.g:2710:2: ( (lv_op_2_0= ruleAddOp ) )
            	    // InternalXS.g:2711:1: (lv_op_2_0= ruleAddOp )
            	    {
            	    // InternalXS.g:2711:1: (lv_op_2_0= ruleAddOp )
            	    // InternalXS.g:2712:3: lv_op_2_0= ruleAddOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpAddOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_8);
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
            	              		"aom.scripting.xs.XS.AddOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalXS.g:2728:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalXS.g:2729:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalXS.g:2729:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalXS.g:2730:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_35);
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
            	              		"aom.scripting.xs.XS.MultiplicativeExpression");
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleAddOp"
    // InternalXS.g:2754:1: entryRuleAddOp returns [String current=null] : iv_ruleAddOp= ruleAddOp EOF ;
    public final String entryRuleAddOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddOp = null;


        try {
            // InternalXS.g:2755:2: (iv_ruleAddOp= ruleAddOp EOF )
            // InternalXS.g:2756:2: iv_ruleAddOp= ruleAddOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddOp=ruleAddOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddOp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2763:1: ruleAddOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAddOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXS.g:2766:28: ( (kw= '+' | kw= '-' ) )
            // InternalXS.g:2767:1: (kw= '+' | kw= '-' )
            {
            // InternalXS.g:2767:1: (kw= '+' | kw= '-' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==52) ) {
                alt28=1;
            }
            else if ( (LA28_0==53) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalXS.g:2768:2: kw= '+'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAddOpAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:2775:2: kw= '-'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:2788:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalXS.g:2789:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalXS.g:2790:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2797:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2800:28: ( (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) )
            // InternalXS.g:2801:1: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            {
            // InternalXS.g:2801:1: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            // InternalXS.g:2802:5: this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getAtomParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_36);
            this_Atom_0=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Atom_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalXS.g:2810:1: ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=54 && LA29_0<=56)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalXS.g:2810:2: () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) )
            	    {
            	    // InternalXS.g:2810:2: ()
            	    // InternalXS.g:2811:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getFactorLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalXS.g:2816:2: ( (lv_op_2_0= ruleMulOp ) )
            	    // InternalXS.g:2817:1: (lv_op_2_0= ruleMulOp )
            	    {
            	    // InternalXS.g:2817:1: (lv_op_2_0= ruleMulOp )
            	    // InternalXS.g:2818:3: lv_op_2_0= ruleMulOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpMulOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_8);
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
            	              		"aom.scripting.xs.XS.MulOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalXS.g:2834:2: ( (lv_right_3_0= ruleAtom ) )
            	    // InternalXS.g:2835:1: (lv_right_3_0= ruleAtom )
            	    {
            	    // InternalXS.g:2835:1: (lv_right_3_0= ruleAtom )
            	    // InternalXS.g:2836:3: lv_right_3_0= ruleAtom
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightAtomParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_36);
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
            	              		"aom.scripting.xs.XS.Atom");
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleMulOp"
    // InternalXS.g:2860:1: entryRuleMulOp returns [String current=null] : iv_ruleMulOp= ruleMulOp EOF ;
    public final String entryRuleMulOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMulOp = null;


        try {
            // InternalXS.g:2861:2: (iv_ruleMulOp= ruleMulOp EOF )
            // InternalXS.g:2862:2: iv_ruleMulOp= ruleMulOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMulOp=ruleMulOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOp.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2869:1: ruleMulOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMulOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXS.g:2872:28: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // InternalXS.g:2873:1: (kw= '*' | kw= '/' | kw= '%' )
            {
            // InternalXS.g:2873:1: (kw= '*' | kw= '/' | kw= '%' )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt30=1;
                }
                break;
            case 55:
                {
                alt30=2;
                }
                break;
            case 56:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalXS.g:2874:2: kw= '*'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMulOpAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:2881:2: kw= '/'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMulOpAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalXS.g:2888:2: kw= '%'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:2901:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalXS.g:2902:2: (iv_ruleAtom= ruleAtom EOF )
            // InternalXS.g:2903:2: iv_ruleAtom= ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtom; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:2910:1: ruleAtom returns [EObject current=null] : ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | this_Call_4= ruleCall | this_LiteralOrVar_5= ruleLiteralOrVar ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;

        EObject this_Call_4 = null;

        EObject this_LiteralOrVar_5 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2913:28: ( ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | this_Call_4= ruleCall | this_LiteralOrVar_5= ruleLiteralOrVar ) )
            // InternalXS.g:2914:1: ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | this_Call_4= ruleCall | this_LiteralOrVar_5= ruleLiteralOrVar )
            {
            // InternalXS.g:2914:1: ( ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ) | this_Call_4= ruleCall | this_LiteralOrVar_5= ruleLiteralOrVar )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt31=1;
                }
                break;
            case RULE_ID:
                {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==16) ) {
                    alt31=2;
                }
                else if ( (LA31_2==EOF||LA31_2==12||LA31_2==17||LA31_2==19||(LA31_2>=44 && LA31_2<=56)) ) {
                    alt31=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 53:
            case 60:
            case 63:
            case 64:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalXS.g:2914:2: ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
                    {
                    // InternalXS.g:2914:2: ( () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
                    // InternalXS.g:2914:3: () (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
                    {
                    // InternalXS.g:2914:3: ()
                    // InternalXS.g:2915:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomAccess().getPrimaryExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalXS.g:2920:2: (otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
                    // InternalXS.g:2920:4: otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_0_1_0());
                          
                    }
                    // InternalXS.g:2924:1: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalXS.g:2925:1: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalXS.g:2925:1: (lv_expression_2_0= ruleExpression )
                    // InternalXS.g:2926:3: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomAccess().getExpressionExpressionParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_14);
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
                              		"aom.scripting.xs.XS.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getRightParenthesisKeyword_0_1_2());
                          
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXS.g:2948:5: this_Call_4= ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Call_4=ruleCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Call_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalXS.g:2958:5: this_LiteralOrVar_5= ruleLiteralOrVar
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getLiteralOrVarParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralOrVar_5=ruleLiteralOrVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralOrVar_5; 
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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleLiteralOrVar"
    // InternalXS.g:2974:1: entryRuleLiteralOrVar returns [EObject current=null] : iv_ruleLiteralOrVar= ruleLiteralOrVar EOF ;
    public final EObject entryRuleLiteralOrVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralOrVar = null;


        try {
            // InternalXS.g:2975:2: (iv_ruleLiteralOrVar= ruleLiteralOrVar EOF )
            // InternalXS.g:2976:2: iv_ruleLiteralOrVar= ruleLiteralOrVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralOrVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralOrVar=ruleLiteralOrVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralOrVar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralOrVar"


    // $ANTLR start "ruleLiteralOrVar"
    // InternalXS.g:2983:1: ruleLiteralOrVar returns [EObject current=null] : (this_Var_0= ruleVar | this_Literal_1= ruleLiteral ) ;
    public final EObject ruleLiteralOrVar() throws RecognitionException {
        EObject current = null;

        EObject this_Var_0 = null;

        EObject this_Literal_1 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2986:28: ( (this_Var_0= ruleVar | this_Literal_1= ruleLiteral ) )
            // InternalXS.g:2987:1: (this_Var_0= ruleVar | this_Literal_1= ruleLiteral )
            {
            // InternalXS.g:2987:1: (this_Var_0= ruleVar | this_Literal_1= ruleLiteral )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_STRING||LA32_0==RULE_INT||LA32_0==53||LA32_0==60||(LA32_0>=63 && LA32_0<=64)) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalXS.g:2988:5: this_Var_0= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralOrVarAccess().getVarParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Var_0=ruleVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Var_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:2998:5: this_Literal_1= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralOrVarAccess().getLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_1=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_1; 
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
    // $ANTLR end "ruleLiteralOrVar"


    // $ANTLR start "entryRuleLiteral"
    // InternalXS.g:3014:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalXS.g:3015:2: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalXS.g:3016:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalXS.g:3023:1: ruleLiteral returns [EObject current=null] : (this_LiteralNum_0= ruleLiteralNum | ( () ( (lv_value_2_0= ruleVector ) ) ) | ( () ( (lv_value_4_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_4_0=null;
        EObject this_LiteralNum_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:3026:28: ( (this_LiteralNum_0= ruleLiteralNum | ( () ( (lv_value_2_0= ruleVector ) ) ) | ( () ( (lv_value_4_0= RULE_STRING ) ) ) ) )
            // InternalXS.g:3027:1: (this_LiteralNum_0= ruleLiteralNum | ( () ( (lv_value_2_0= ruleVector ) ) ) | ( () ( (lv_value_4_0= RULE_STRING ) ) ) )
            {
            // InternalXS.g:3027:1: (this_LiteralNum_0= ruleLiteralNum | ( () ( (lv_value_2_0= ruleVector ) ) ) | ( () ( (lv_value_4_0= RULE_STRING ) ) ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 53:
            case 63:
            case 64:
                {
                alt33=1;
                }
                break;
            case 60:
                {
                alt33=2;
                }
                break;
            case RULE_STRING:
                {
                alt33=3;
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
                    // InternalXS.g:3028:5: this_LiteralNum_0= ruleLiteralNum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getLiteralNumParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralNum_0=ruleLiteralNum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralNum_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:3037:6: ( () ( (lv_value_2_0= ruleVector ) ) )
                    {
                    // InternalXS.g:3037:6: ( () ( (lv_value_2_0= ruleVector ) ) )
                    // InternalXS.g:3037:7: () ( (lv_value_2_0= ruleVector ) )
                    {
                    // InternalXS.g:3037:7: ()
                    // InternalXS.g:3038:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getLiteralVectorAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalXS.g:3043:2: ( (lv_value_2_0= ruleVector ) )
                    // InternalXS.g:3044:1: (lv_value_2_0= ruleVector )
                    {
                    // InternalXS.g:3044:1: (lv_value_2_0= ruleVector )
                    // InternalXS.g:3045:3: lv_value_2_0= ruleVector
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueVectorParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleVector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"aom.scripting.xs.XS.Vector");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXS.g:3062:6: ( () ( (lv_value_4_0= RULE_STRING ) ) )
                    {
                    // InternalXS.g:3062:6: ( () ( (lv_value_4_0= RULE_STRING ) ) )
                    // InternalXS.g:3062:7: () ( (lv_value_4_0= RULE_STRING ) )
                    {
                    // InternalXS.g:3062:7: ()
                    // InternalXS.g:3063:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getLiteralStringAction_2_0(),
                                  current);
                          
                    }

                    }

                    // InternalXS.g:3068:2: ( (lv_value_4_0= RULE_STRING ) )
                    // InternalXS.g:3069:1: (lv_value_4_0= RULE_STRING )
                    {
                    // InternalXS.g:3069:1: (lv_value_4_0= RULE_STRING )
                    // InternalXS.g:3070:3: lv_value_4_0= RULE_STRING
                    {
                    lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_4_0, grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"aom.scripting.xs.XS.STRING");
                      	    
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleLiteralNum"
    // InternalXS.g:3094:1: entryRuleLiteralNum returns [EObject current=null] : iv_ruleLiteralNum= ruleLiteralNum EOF ;
    public final EObject entryRuleLiteralNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNum = null;


        try {
            // InternalXS.g:3095:2: (iv_ruleLiteralNum= ruleLiteralNum EOF )
            // InternalXS.g:3096:2: iv_ruleLiteralNum= ruleLiteralNum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralNumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralNum=ruleLiteralNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralNum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralNum"


    // $ANTLR start "ruleLiteralNum"
    // InternalXS.g:3103:1: ruleLiteralNum returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleSignedInt ) ) ) | ( () ( (lv_value_3_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_5_0= ruleBool ) ) ) ) ;
    public final EObject ruleLiteralNum() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:3106:28: ( ( ( () ( (lv_value_1_0= ruleSignedInt ) ) ) | ( () ( (lv_value_3_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_5_0= ruleBool ) ) ) ) )
            // InternalXS.g:3107:1: ( ( () ( (lv_value_1_0= ruleSignedInt ) ) ) | ( () ( (lv_value_3_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_5_0= ruleBool ) ) ) )
            {
            // InternalXS.g:3107:1: ( ( () ( (lv_value_1_0= ruleSignedInt ) ) ) | ( () ( (lv_value_3_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_5_0= ruleBool ) ) ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==RULE_INT) ) {
                    int LA34_2 = input.LA(3);

                    if ( (LA34_2==62) ) {
                        alt34=2;
                    }
                    else if ( (LA34_2==EOF||LA34_2==12||LA34_2==17||LA34_2==19||LA34_2==37||(LA34_2>=44 && LA34_2<=56)) ) {
                        alt34=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA34_2 = input.LA(2);

                if ( (LA34_2==62) ) {
                    alt34=2;
                }
                else if ( (LA34_2==EOF||LA34_2==12||LA34_2==17||LA34_2==19||LA34_2==37||(LA34_2>=44 && LA34_2<=56)) ) {
                    alt34=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;
                }
                }
                break;
            case 63:
            case 64:
                {
                alt34=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalXS.g:3107:2: ( () ( (lv_value_1_0= ruleSignedInt ) ) )
                    {
                    // InternalXS.g:3107:2: ( () ( (lv_value_1_0= ruleSignedInt ) ) )
                    // InternalXS.g:3107:3: () ( (lv_value_1_0= ruleSignedInt ) )
                    {
                    // InternalXS.g:3107:3: ()
                    // InternalXS.g:3108:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralNumAccess().getLiteralIntAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalXS.g:3113:2: ( (lv_value_1_0= ruleSignedInt ) )
                    // InternalXS.g:3114:1: (lv_value_1_0= ruleSignedInt )
                    {
                    // InternalXS.g:3114:1: (lv_value_1_0= ruleSignedInt )
                    // InternalXS.g:3115:3: lv_value_1_0= ruleSignedInt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralNumAccess().getValueSignedIntParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleSignedInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralNumRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"aom.scripting.xs.XS.SignedInt");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXS.g:3132:6: ( () ( (lv_value_3_0= ruleSignedFloat ) ) )
                    {
                    // InternalXS.g:3132:6: ( () ( (lv_value_3_0= ruleSignedFloat ) ) )
                    // InternalXS.g:3132:7: () ( (lv_value_3_0= ruleSignedFloat ) )
                    {
                    // InternalXS.g:3132:7: ()
                    // InternalXS.g:3133:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralNumAccess().getLiteralFloatAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalXS.g:3138:2: ( (lv_value_3_0= ruleSignedFloat ) )
                    // InternalXS.g:3139:1: (lv_value_3_0= ruleSignedFloat )
                    {
                    // InternalXS.g:3139:1: (lv_value_3_0= ruleSignedFloat )
                    // InternalXS.g:3140:3: lv_value_3_0= ruleSignedFloat
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralNumAccess().getValueSignedFloatParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleSignedFloat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralNumRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"aom.scripting.xs.XS.SignedFloat");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXS.g:3157:6: ( () ( (lv_value_5_0= ruleBool ) ) )
                    {
                    // InternalXS.g:3157:6: ( () ( (lv_value_5_0= ruleBool ) ) )
                    // InternalXS.g:3157:7: () ( (lv_value_5_0= ruleBool ) )
                    {
                    // InternalXS.g:3157:7: ()
                    // InternalXS.g:3158:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralNumAccess().getLiteralBoolAction_2_0(),
                                  current);
                          
                    }

                    }

                    // InternalXS.g:3163:2: ( (lv_value_5_0= ruleBool ) )
                    // InternalXS.g:3164:1: (lv_value_5_0= ruleBool )
                    {
                    // InternalXS.g:3164:1: (lv_value_5_0= ruleBool )
                    // InternalXS.g:3165:3: lv_value_5_0= ruleBool
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralNumAccess().getValueBoolParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleBool();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralNumRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_5_0, 
                              		"aom.scripting.xs.XS.Bool");
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
    // $ANTLR end "ruleLiteralNum"


    // $ANTLR start "entryRuleLiteralNumOrVar"
    // InternalXS.g:3189:1: entryRuleLiteralNumOrVar returns [EObject current=null] : iv_ruleLiteralNumOrVar= ruleLiteralNumOrVar EOF ;
    public final EObject entryRuleLiteralNumOrVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNumOrVar = null;


        try {
            // InternalXS.g:3190:2: (iv_ruleLiteralNumOrVar= ruleLiteralNumOrVar EOF )
            // InternalXS.g:3191:2: iv_ruleLiteralNumOrVar= ruleLiteralNumOrVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralNumOrVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralNumOrVar=ruleLiteralNumOrVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralNumOrVar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralNumOrVar"


    // $ANTLR start "ruleLiteralNumOrVar"
    // InternalXS.g:3198:1: ruleLiteralNumOrVar returns [EObject current=null] : (this_LiteralNum_0= ruleLiteralNum | this_Var_1= ruleVar ) ;
    public final EObject ruleLiteralNumOrVar() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralNum_0 = null;

        EObject this_Var_1 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:3201:28: ( (this_LiteralNum_0= ruleLiteralNum | this_Var_1= ruleVar ) )
            // InternalXS.g:3202:1: (this_LiteralNum_0= ruleLiteralNum | this_Var_1= ruleVar )
            {
            // InternalXS.g:3202:1: (this_LiteralNum_0= ruleLiteralNum | this_Var_1= ruleVar )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INT||LA35_0==53||(LA35_0>=63 && LA35_0<=64)) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID) ) {
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
                    // InternalXS.g:3203:5: this_LiteralNum_0= ruleLiteralNum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralNumOrVarAccess().getLiteralNumParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralNum_0=ruleLiteralNum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralNum_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:3213:5: this_Var_1= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralNumOrVarAccess().getVarParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Var_1=ruleVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Var_1; 
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
    // $ANTLR end "ruleLiteralNumOrVar"


    // $ANTLR start "entryRuleCall"
    // InternalXS.g:3229:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalXS.g:3230:2: (iv_ruleCall= ruleCall EOF )
            // InternalXS.g:3231:2: iv_ruleCall= ruleCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCall=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:3238:1: ruleCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_args_2_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:3241:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' ) )
            // InternalXS.g:3242:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' )
            {
            // InternalXS.g:3242:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')' )
            // InternalXS.g:3242:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleArguments ) )? otherlv_3= ')'
            {
            // InternalXS.g:3242:2: ( (otherlv_0= RULE_ID ) )
            // InternalXS.g:3243:1: (otherlv_0= RULE_ID )
            {
            // InternalXS.g:3243:1: (otherlv_0= RULE_ID )
            // InternalXS.g:3244:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getCallAccess().getFunctionFunDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalXS.g:3259:1: ( (lv_args_2_0= ruleArguments ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_INT)||LA36_0==16||LA36_0==53||LA36_0==60||(LA36_0>=63 && LA36_0<=64)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXS.g:3260:1: (lv_args_2_0= ruleArguments )
                    {
                    // InternalXS.g:3260:1: (lv_args_2_0= ruleArguments )
                    // InternalXS.g:3261:3: lv_args_2_0= ruleArguments
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCallAccess().getArgsArgumentsParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_14);
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
                              		"aom.scripting.xs.XS.Arguments");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3289:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalXS.g:3290:2: (iv_ruleArguments= ruleArguments EOF )
            // InternalXS.g:3291:2: iv_ruleArguments= ruleArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArguments=ruleArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArguments; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:3298:1: ruleArguments returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:3301:28: ( ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) )
            // InternalXS.g:3302:1: ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            {
            // InternalXS.g:3302:1: ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            // InternalXS.g:3302:2: ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            {
            // InternalXS.g:3302:2: ( (lv_expressions_0_0= ruleExpression ) )
            // InternalXS.g:3303:1: (lv_expressions_0_0= ruleExpression )
            {
            // InternalXS.g:3303:1: (lv_expressions_0_0= ruleExpression )
            // InternalXS.g:3304:3: lv_expressions_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_16);
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
                      		"aom.scripting.xs.XS.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXS.g:3320:2: (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==19) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalXS.g:3320:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getArgumentsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalXS.g:3324:1: ( (lv_expressions_2_0= ruleExpression ) )
            	    // InternalXS.g:3325:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // InternalXS.g:3325:1: (lv_expressions_2_0= ruleExpression )
            	    // InternalXS.g:3326:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_16);
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
            	              		"aom.scripting.xs.XS.Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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


    // $ANTLR start "entryRuleIntType"
    // InternalXS.g:3350:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // InternalXS.g:3351:2: (iv_ruleIntType= ruleIntType EOF )
            // InternalXS.g:3352:2: iv_ruleIntType= ruleIntType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntType=ruleIntType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:3359:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3362:28: ( ( () otherlv_1= 'int' ) )
            // InternalXS.g:3363:1: ( () otherlv_1= 'int' )
            {
            // InternalXS.g:3363:1: ( () otherlv_1= 'int' )
            // InternalXS.g:3363:2: () otherlv_1= 'int'
            {
            // InternalXS.g:3363:2: ()
            // InternalXS.g:3364:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntTypeAccess().getIntTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3381:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // InternalXS.g:3382:2: (iv_ruleFloatType= ruleFloatType EOF )
            // InternalXS.g:3383:2: iv_ruleFloatType= ruleFloatType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFloatType=ruleFloatType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:3390:1: ruleFloatType returns [EObject current=null] : ( () otherlv_1= 'float' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3393:28: ( ( () otherlv_1= 'float' ) )
            // InternalXS.g:3394:1: ( () otherlv_1= 'float' )
            {
            // InternalXS.g:3394:1: ( () otherlv_1= 'float' )
            // InternalXS.g:3394:2: () otherlv_1= 'float'
            {
            // InternalXS.g:3394:2: ()
            // InternalXS.g:3395:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFloatTypeAccess().getFloatTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3412:1: entryRuleBoolType returns [EObject current=null] : iv_ruleBoolType= ruleBoolType EOF ;
    public final EObject entryRuleBoolType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolType = null;


        try {
            // InternalXS.g:3413:2: (iv_ruleBoolType= ruleBoolType EOF )
            // InternalXS.g:3414:2: iv_ruleBoolType= ruleBoolType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolType=ruleBoolType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:3421:1: ruleBoolType returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject ruleBoolType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3424:28: ( ( () otherlv_1= 'bool' ) )
            // InternalXS.g:3425:1: ( () otherlv_1= 'bool' )
            {
            // InternalXS.g:3425:1: ( () otherlv_1= 'bool' )
            // InternalXS.g:3425:2: () otherlv_1= 'bool'
            {
            // InternalXS.g:3425:2: ()
            // InternalXS.g:3426:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolTypeAccess().getBoolTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3443:1: entryRuleVectorType returns [EObject current=null] : iv_ruleVectorType= ruleVectorType EOF ;
    public final EObject entryRuleVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorType = null;


        try {
            // InternalXS.g:3444:2: (iv_ruleVectorType= ruleVectorType EOF )
            // InternalXS.g:3445:2: iv_ruleVectorType= ruleVectorType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVectorTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVectorType=ruleVectorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVectorType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:3452:1: ruleVectorType returns [EObject current=null] : ( () otherlv_1= 'vector' ) ;
    public final EObject ruleVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3455:28: ( ( () otherlv_1= 'vector' ) )
            // InternalXS.g:3456:1: ( () otherlv_1= 'vector' )
            {
            // InternalXS.g:3456:1: ( () otherlv_1= 'vector' )
            // InternalXS.g:3456:2: () otherlv_1= 'vector'
            {
            // InternalXS.g:3456:2: ()
            // InternalXS.g:3457:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVectorTypeAccess().getVectorTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3474:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalXS.g:3475:2: (iv_ruleStringType= ruleStringType EOF )
            // InternalXS.g:3476:2: iv_ruleStringType= ruleStringType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringType=ruleStringType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:3483:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3486:28: ( ( () otherlv_1= 'string' ) )
            // InternalXS.g:3487:1: ( () otherlv_1= 'string' )
            {
            // InternalXS.g:3487:1: ( () otherlv_1= 'string' )
            // InternalXS.g:3487:2: () otherlv_1= 'string'
            {
            // InternalXS.g:3487:2: ()
            // InternalXS.g:3488:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3505:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // InternalXS.g:3506:2: (iv_ruleVoidType= ruleVoidType EOF )
            // InternalXS.g:3507:2: iv_ruleVoidType= ruleVoidType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVoidTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVoidType=ruleVoidType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVoidType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:3514:1: ruleVoidType returns [EObject current=null] : ( () otherlv_1= 'void' ) ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3517:28: ( ( () otherlv_1= 'void' ) )
            // InternalXS.g:3518:1: ( () otherlv_1= 'void' )
            {
            // InternalXS.g:3518:1: ( () otherlv_1= 'void' )
            // InternalXS.g:3518:2: () otherlv_1= 'void'
            {
            // InternalXS.g:3518:2: ()
            // InternalXS.g:3519:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVoidTypeAccess().getVoidTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleSign"
    // InternalXS.g:3536:1: entryRuleSign returns [String current=null] : iv_ruleSign= ruleSign EOF ;
    public final String entryRuleSign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSign = null;


        try {
            // InternalXS.g:3537:2: (iv_ruleSign= ruleSign EOF )
            // InternalXS.g:3538:2: iv_ruleSign= ruleSign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSign=ruleSign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSign.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:3545:1: ruleSign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleSign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3548:28: (kw= '-' )
            // InternalXS.g:3550:2: kw= '-'
            {
            kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3563:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // InternalXS.g:3564:2: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalXS.g:3565:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedInt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:3572:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_Sign_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:3575:28: ( ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT ) )
            // InternalXS.g:3576:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT )
            {
            // InternalXS.g:3576:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT )
            // InternalXS.g:3576:2: (this_Sign_0= ruleSign )? this_INT_1= RULE_INT
            {
            // InternalXS.g:3576:2: (this_Sign_0= ruleSign )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXS.g:3577:5: this_Sign_0= ruleSign
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSignedIntAccess().getSignParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_20);
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

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3602:1: entryRuleSignedFloat returns [String current=null] : iv_ruleSignedFloat= ruleSignedFloat EOF ;
    public final String entryRuleSignedFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedFloat = null;


        try {
            // InternalXS.g:3603:2: (iv_ruleSignedFloat= ruleSignedFloat EOF )
            // InternalXS.g:3604:2: iv_ruleSignedFloat= ruleSignedFloat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedFloatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSignedFloat=ruleSignedFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedFloat.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:3611:1: ruleSignedFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;
        AntlrDatatypeRuleToken this_Sign_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:3614:28: ( ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // InternalXS.g:3615:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // InternalXS.g:3615:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalXS.g:3615:2: (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // InternalXS.g:3615:2: (this_Sign_0= ruleSign )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==53) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXS.g:3616:5: this_Sign_0= ruleSign
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSignedFloatAccess().getSignParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_20);
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

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getSignedFloatAccess().getINTTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,62,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSignedFloatAccess().getFullStopKeyword_2()); 
                  
            }
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBool"
    // InternalXS.g:3654:1: entryRuleBool returns [String current=null] : iv_ruleBool= ruleBool EOF ;
    public final String entryRuleBool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBool = null;


        try {
            // InternalXS.g:3655:2: (iv_ruleBool= ruleBool EOF )
            // InternalXS.g:3656:2: iv_ruleBool= ruleBool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBool=ruleBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBool.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:3663:1: ruleBool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3666:28: ( (kw= 'true' | kw= 'false' ) )
            // InternalXS.g:3667:1: (kw= 'true' | kw= 'false' )
            {
            // InternalXS.g:3667:1: (kw= 'true' | kw= 'false' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==63) ) {
                alt40=1;
            }
            else if ( (LA40_0==64) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalXS.g:3668:2: kw= 'true'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBoolAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:3675:2: kw= 'false'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3688:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // InternalXS.g:3689:2: (iv_ruleVector= ruleVector EOF )
            // InternalXS.g:3690:2: iv_ruleVector= ruleVector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVector=ruleVector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVector; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalXS.g:3697:1: ruleVector returns [EObject current=null] : (otherlv_0= 'vector' otherlv_1= '(' ( (lv_x_2_0= ruleLiteralNumOrVar ) ) otherlv_3= ',' ( (lv_y_4_0= ruleLiteralNumOrVar ) ) otherlv_5= ',' ( (lv_z_6_0= ruleLiteralNumOrVar ) ) otherlv_7= ')' ) ;
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
            // InternalXS.g:3700:28: ( (otherlv_0= 'vector' otherlv_1= '(' ( (lv_x_2_0= ruleLiteralNumOrVar ) ) otherlv_3= ',' ( (lv_y_4_0= ruleLiteralNumOrVar ) ) otherlv_5= ',' ( (lv_z_6_0= ruleLiteralNumOrVar ) ) otherlv_7= ')' ) )
            // InternalXS.g:3701:1: (otherlv_0= 'vector' otherlv_1= '(' ( (lv_x_2_0= ruleLiteralNumOrVar ) ) otherlv_3= ',' ( (lv_y_4_0= ruleLiteralNumOrVar ) ) otherlv_5= ',' ( (lv_z_6_0= ruleLiteralNumOrVar ) ) otherlv_7= ')' )
            {
            // InternalXS.g:3701:1: (otherlv_0= 'vector' otherlv_1= '(' ( (lv_x_2_0= ruleLiteralNumOrVar ) ) otherlv_3= ',' ( (lv_y_4_0= ruleLiteralNumOrVar ) ) otherlv_5= ',' ( (lv_z_6_0= ruleLiteralNumOrVar ) ) otherlv_7= ')' )
            // InternalXS.g:3701:3: otherlv_0= 'vector' otherlv_1= '(' ( (lv_x_2_0= ruleLiteralNumOrVar ) ) otherlv_3= ',' ( (lv_y_4_0= ruleLiteralNumOrVar ) ) otherlv_5= ',' ( (lv_z_6_0= ruleLiteralNumOrVar ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVectorKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVectorAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalXS.g:3709:1: ( (lv_x_2_0= ruleLiteralNumOrVar ) )
            // InternalXS.g:3710:1: (lv_x_2_0= ruleLiteralNumOrVar )
            {
            // InternalXS.g:3710:1: (lv_x_2_0= ruleLiteralNumOrVar )
            // InternalXS.g:3711:3: lv_x_2_0= ruleLiteralNumOrVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVectorAccess().getXLiteralNumOrVarParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_39);
            lv_x_2_0=ruleLiteralNumOrVar();

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
                      		"aom.scripting.xs.XS.LiteralNumOrVar");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVectorAccess().getCommaKeyword_3());
                  
            }
            // InternalXS.g:3731:1: ( (lv_y_4_0= ruleLiteralNumOrVar ) )
            // InternalXS.g:3732:1: (lv_y_4_0= ruleLiteralNumOrVar )
            {
            // InternalXS.g:3732:1: (lv_y_4_0= ruleLiteralNumOrVar )
            // InternalXS.g:3733:3: lv_y_4_0= ruleLiteralNumOrVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVectorAccess().getYLiteralNumOrVarParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_39);
            lv_y_4_0=ruleLiteralNumOrVar();

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
                      		"aom.scripting.xs.XS.LiteralNumOrVar");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getVectorAccess().getCommaKeyword_5());
                  
            }
            // InternalXS.g:3753:1: ( (lv_z_6_0= ruleLiteralNumOrVar ) )
            // InternalXS.g:3754:1: (lv_z_6_0= ruleLiteralNumOrVar )
            {
            // InternalXS.g:3754:1: (lv_z_6_0= ruleLiteralNumOrVar )
            // InternalXS.g:3755:3: lv_z_6_0= ruleLiteralNumOrVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVectorAccess().getZLiteralNumOrVarParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
            lv_z_6_0=ruleLiteralNumOrVar();

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
                      		"aom.scripting.xs.XS.LiteralNumOrVar");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalXS
    public final void synpred1_InternalXS_fragment() throws RecognitionException {   
        // InternalXS.g:1622:4: ( 'else' )
        // InternalXS.g:1622:6: 'else'
        {
        match(input,32,FOLLOW_2); if (state.failed) return ;

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
    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\13\1\uffff\5\5\3\uffff\1\15";
    static final String dfa_3s = "\1\75\1\uffff\5\5\3\uffff\1\20";
    static final String dfa_4s = "\1\uffff\1\1\5\uffff\1\2\1\3\1\4\1\uffff";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\10\2\uffff\2\1\2\uffff\1\7\1\uffff\1\11\7\uffff\1\7\34\uffff\1\2\1\3\1\4\1\5\1\6",
            "",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "",
            "",
            "",
            "\1\1\2\uffff\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "119:1: (this_GlobalVarDeclaration_0= ruleGlobalVarDeclaration | this_FunDeclaration_1= ruleFunDeclaration | this_IncludeStatement_2= ruleIncludeStatement | this_RuleDeclaration_3= ruleRuleDeclaration )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\4\1\14\12\uffff";
    static final String dfa_9s = "\1\100\1\70\12\uffff";
    static final String dfa_10s = "\2\uffff\1\1\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\2";
    static final String dfa_11s = "\14\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\1\1\2\11\uffff\1\2\14\uffff\1\3\1\uffff\1\4\1\uffff\1\5\1\6\1\7\3\uffff\1\10\1\11\1\12\13\uffff\1\2\6\uffff\1\2\2\uffff\2\2",
            "\2\2\2\uffff\1\2\31\uffff\2\13\15\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1355:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_PostfixStatement_1= rulePostfixStatement | this_CompoundStatement_2= ruleCompoundStatement | this_IfElseStatement_3= ruleIfElseStatement | this_WhileStatement_4= ruleWhileStatement | this_ForStatement_5= ruleForStatement | this_SwitchStatement_6= ruleSwitchStatement | this_ReturnStatement_7= ruleReturnStatement | this_ContinueStatement_8= ruleContinueStatement | this_BreakStatement_9= ruleBreakStatement )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x3E0000001014C802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x9020000000010070L,0x0000000000000001L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x3E0000000000C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x3E0000001004C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x3E0000000006C000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x3E0000000004C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000FE00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000002FE00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xBE20038EE001C070L,0x0000000000000001L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xBE20038EA001C070L,0x0000000000000001L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000F000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000005040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x8020000000000060L,0x0000000000000001L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x01C0000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x9020000000030070L,0x0000000000000001L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000080000L});

}
