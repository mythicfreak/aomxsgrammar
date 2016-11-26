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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_PSEUDO_PRECOMPILER", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'include'", "';'", "'='", "'const'", "'extern'", "'mutable'", "'('", "'void'", "','", "')'", "'rule'", "'active'", "'inactive'", "'runImmediately'", "'highFrequency'", "'group'", "'minInterval'", "'maxInterval'", "'priority'", "'{'", "'}'", "'if'", "'else'", "'while'", "'for'", "'switch'", "'case'", "':'", "'default'", "'return'", "'continue'", "'break'", "'++'", "'--'", "'||'", "'&&'", "'=='", "'!='", "'<='", "'<'", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'vector'", "'int'", "'float'", "'bool'", "'string'", "'.'", "'true'", "'false'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_PSEUDO_PRECOMPILER=5;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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
    // InternalXS.g:76:1: ruleProgram returns [EObject current=null] : ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_1_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:79:28: ( ( () ( (lv_declarations_1_0= ruleDeclaration ) )* ) )
            // InternalXS.g:80:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* )
            {
            // InternalXS.g:80:1: ( () ( (lv_declarations_1_0= ruleDeclaration ) )* )
            // InternalXS.g:80:2: () ( (lv_declarations_1_0= ruleDeclaration ) )*
            {
            // InternalXS.g:80:2: ()
            // InternalXS.g:81:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getProgramAccess().getProgramAction_0(),
                          current);
                  
            }

            }

            // InternalXS.g:86:2: ( (lv_declarations_1_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_PSEUDO_PRECOMPILER||LA1_0==12||(LA1_0>=15 && LA1_0<=17)||LA1_0==19||LA1_0==22||(LA1_0>=59 && LA1_0<=63)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXS.g:87:1: (lv_declarations_1_0= ruleDeclaration )
            	    {
            	    // InternalXS.g:87:1: (lv_declarations_1_0= ruleDeclaration )
            	    // InternalXS.g:88:3: lv_declarations_1_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_declarations_1_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_1_0, 
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
    // InternalXS.g:112:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalXS.g:113:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalXS.g:114:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalXS.g:121:1: ruleDeclaration returns [EObject current=null] : (this_GlobalVarDeclaration_0= ruleGlobalVarDeclaration | this_FunctionDeclaration_1= ruleFunctionDeclaration | this_IncludeDeclaration_2= ruleIncludeDeclaration | this_PseudoIncludeDeclaration_3= rulePseudoIncludeDeclaration | this_RuleDeclaration_4= ruleRuleDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalVarDeclaration_0 = null;

        EObject this_FunctionDeclaration_1 = null;

        EObject this_IncludeDeclaration_2 = null;

        EObject this_PseudoIncludeDeclaration_3 = null;

        EObject this_RuleDeclaration_4 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:124:28: ( (this_GlobalVarDeclaration_0= ruleGlobalVarDeclaration | this_FunctionDeclaration_1= ruleFunctionDeclaration | this_IncludeDeclaration_2= ruleIncludeDeclaration | this_PseudoIncludeDeclaration_3= rulePseudoIncludeDeclaration | this_RuleDeclaration_4= ruleRuleDeclaration ) )
            // InternalXS.g:125:1: (this_GlobalVarDeclaration_0= ruleGlobalVarDeclaration | this_FunctionDeclaration_1= ruleFunctionDeclaration | this_IncludeDeclaration_2= ruleIncludeDeclaration | this_PseudoIncludeDeclaration_3= rulePseudoIncludeDeclaration | this_RuleDeclaration_4= ruleRuleDeclaration )
            {
            // InternalXS.g:125:1: (this_GlobalVarDeclaration_0= ruleGlobalVarDeclaration | this_FunctionDeclaration_1= ruleFunctionDeclaration | this_IncludeDeclaration_2= ruleIncludeDeclaration | this_PseudoIncludeDeclaration_3= rulePseudoIncludeDeclaration | this_RuleDeclaration_4= ruleRuleDeclaration )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalXS.g:126:5: this_GlobalVarDeclaration_0= ruleGlobalVarDeclaration
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
                    // InternalXS.g:136:5: this_FunctionDeclaration_1= ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getFunctionDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionDeclaration_1=ruleFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalXS.g:146:5: this_IncludeDeclaration_2= ruleIncludeDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getIncludeDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_IncludeDeclaration_2=ruleIncludeDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IncludeDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalXS.g:156:5: this_PseudoIncludeDeclaration_3= rulePseudoIncludeDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getPseudoIncludeDeclarationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_PseudoIncludeDeclaration_3=rulePseudoIncludeDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PseudoIncludeDeclaration_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalXS.g:166:5: this_RuleDeclaration_4= ruleRuleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getRuleDeclarationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_RuleDeclaration_4=ruleRuleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RuleDeclaration_4; 
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


    // $ANTLR start "entryRuleIncludeDeclaration"
    // InternalXS.g:182:1: entryRuleIncludeDeclaration returns [EObject current=null] : iv_ruleIncludeDeclaration= ruleIncludeDeclaration EOF ;
    public final EObject entryRuleIncludeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeDeclaration = null;


        try {
            // InternalXS.g:183:2: (iv_ruleIncludeDeclaration= ruleIncludeDeclaration EOF )
            // InternalXS.g:184:2: iv_ruleIncludeDeclaration= ruleIncludeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIncludeDeclaration=ruleIncludeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIncludeDeclaration; 
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
    // $ANTLR end "entryRuleIncludeDeclaration"


    // $ANTLR start "ruleIncludeDeclaration"
    // InternalXS.g:191:1: ruleIncludeDeclaration returns [EObject current=null] : ( () otherlv_1= 'include' ( (lv_filePath_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleIncludeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_filePath_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalXS.g:194:28: ( ( () otherlv_1= 'include' ( (lv_filePath_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalXS.g:195:1: ( () otherlv_1= 'include' ( (lv_filePath_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalXS.g:195:1: ( () otherlv_1= 'include' ( (lv_filePath_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalXS.g:195:2: () otherlv_1= 'include' ( (lv_filePath_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            // InternalXS.g:195:2: ()
            // InternalXS.g:196:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIncludeDeclarationAccess().getIncludeDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIncludeDeclarationAccess().getIncludeKeyword_1());
                  
            }
            // InternalXS.g:205:1: ( (lv_filePath_2_0= RULE_STRING ) )
            // InternalXS.g:206:1: (lv_filePath_2_0= RULE_STRING )
            {
            // InternalXS.g:206:1: (lv_filePath_2_0= RULE_STRING )
            // InternalXS.g:207:3: lv_filePath_2_0= RULE_STRING
            {
            lv_filePath_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_filePath_2_0, grammarAccess.getIncludeDeclarationAccess().getFilePathSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIncludeDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"filePath",
                      		lv_filePath_2_0, 
                      		"aom.scripting.xs.XS.STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIncludeDeclarationAccess().getSemicolonKeyword_3());
                  
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
    // $ANTLR end "ruleIncludeDeclaration"


    // $ANTLR start "entryRulePseudoIncludeDeclaration"
    // InternalXS.g:235:1: entryRulePseudoIncludeDeclaration returns [EObject current=null] : iv_rulePseudoIncludeDeclaration= rulePseudoIncludeDeclaration EOF ;
    public final EObject entryRulePseudoIncludeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoIncludeDeclaration = null;


        try {
            // InternalXS.g:236:2: (iv_rulePseudoIncludeDeclaration= rulePseudoIncludeDeclaration EOF )
            // InternalXS.g:237:2: iv_rulePseudoIncludeDeclaration= rulePseudoIncludeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoIncludeDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePseudoIncludeDeclaration=rulePseudoIncludeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoIncludeDeclaration; 
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
    // $ANTLR end "entryRulePseudoIncludeDeclaration"


    // $ANTLR start "rulePseudoIncludeDeclaration"
    // InternalXS.g:244:1: rulePseudoIncludeDeclaration returns [EObject current=null] : ( () this_PSEUDO_PRECOMPILER_1= RULE_PSEUDO_PRECOMPILER otherlv_2= 'include' ( (lv_filePath_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject rulePseudoIncludeDeclaration() throws RecognitionException {
        EObject current = null;

        Token this_PSEUDO_PRECOMPILER_1=null;
        Token otherlv_2=null;
        Token lv_filePath_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // InternalXS.g:247:28: ( ( () this_PSEUDO_PRECOMPILER_1= RULE_PSEUDO_PRECOMPILER otherlv_2= 'include' ( (lv_filePath_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // InternalXS.g:248:1: ( () this_PSEUDO_PRECOMPILER_1= RULE_PSEUDO_PRECOMPILER otherlv_2= 'include' ( (lv_filePath_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // InternalXS.g:248:1: ( () this_PSEUDO_PRECOMPILER_1= RULE_PSEUDO_PRECOMPILER otherlv_2= 'include' ( (lv_filePath_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // InternalXS.g:248:2: () this_PSEUDO_PRECOMPILER_1= RULE_PSEUDO_PRECOMPILER otherlv_2= 'include' ( (lv_filePath_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            // InternalXS.g:248:2: ()
            // InternalXS.g:249:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPseudoIncludeDeclarationAccess().getIncludeDeclarationAction_0(),
                          current);
                  
            }

            }

            this_PSEUDO_PRECOMPILER_1=(Token)match(input,RULE_PSEUDO_PRECOMPILER,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_PSEUDO_PRECOMPILER_1, grammarAccess.getPseudoIncludeDeclarationAccess().getPSEUDO_PRECOMPILERTerminalRuleCall_1()); 
                  
            }
            otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPseudoIncludeDeclarationAccess().getIncludeKeyword_2());
                  
            }
            // InternalXS.g:262:1: ( (lv_filePath_3_0= RULE_STRING ) )
            // InternalXS.g:263:1: (lv_filePath_3_0= RULE_STRING )
            {
            // InternalXS.g:263:1: (lv_filePath_3_0= RULE_STRING )
            // InternalXS.g:264:3: lv_filePath_3_0= RULE_STRING
            {
            lv_filePath_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_filePath_3_0, grammarAccess.getPseudoIncludeDeclarationAccess().getFilePathSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPseudoIncludeDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"filePath",
                      		lv_filePath_3_0, 
                      		"aom.scripting.xs.XS.STRING");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPseudoIncludeDeclarationAccess().getSemicolonKeyword_4());
                  
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
    // $ANTLR end "rulePseudoIncludeDeclaration"


    // $ANTLR start "entryRuleLocalVarDeclaration"
    // InternalXS.g:294:1: entryRuleLocalVarDeclaration returns [EObject current=null] : iv_ruleLocalVarDeclaration= ruleLocalVarDeclaration EOF ;
    public final EObject entryRuleLocalVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVarDeclaration = null;


        try {
            // InternalXS.g:295:2: (iv_ruleLocalVarDeclaration= ruleLocalVarDeclaration EOF )
            // InternalXS.g:296:2: iv_ruleLocalVarDeclaration= ruleLocalVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocalVarDeclaration=ruleLocalVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalVarDeclaration; 
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
    // $ANTLR end "entryRuleLocalVarDeclaration"


    // $ANTLR start "ruleLocalVarDeclaration"
    // InternalXS.g:303:1: ruleLocalVarDeclaration returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleLocalVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_1_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:306:28: ( ( () ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';' ) )
            // InternalXS.g:307:1: ( () ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';' )
            {
            // InternalXS.g:307:1: ( () ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';' )
            // InternalXS.g:307:2: () ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';'
            {
            // InternalXS.g:307:2: ()
            // InternalXS.g:308:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLocalVarDeclarationAccess().getLocalVarDeclarationAction_0(),
                          current);
                  
            }

            }

            // InternalXS.g:313:2: ( (lv_type_1_0= ruleVarTypeSpecifier ) )
            // InternalXS.g:314:1: (lv_type_1_0= ruleVarTypeSpecifier )
            {
            // InternalXS.g:314:1: (lv_type_1_0= ruleVarTypeSpecifier )
            // InternalXS.g:315:3: lv_type_1_0= ruleVarTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalVarDeclarationAccess().getTypeVarTypeSpecifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_type_1_0=ruleVarTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalVarDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"aom.scripting.xs.XS.VarTypeSpecifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXS.g:331:2: ( (lv_name_2_0= RULE_ID ) )
            // InternalXS.g:332:1: (lv_name_2_0= RULE_ID )
            {
            // InternalXS.g:332:1: (lv_name_2_0= RULE_ID )
            // InternalXS.g:333:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getLocalVarDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalVarDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"aom.scripting.xs.XS.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLocalVarDeclarationAccess().getEqualsSignKeyword_3());
                  
            }
            // InternalXS.g:353:1: ( (lv_value_4_0= ruleExpression ) )
            // InternalXS.g:354:1: (lv_value_4_0= ruleExpression )
            {
            // InternalXS.g:354:1: (lv_value_4_0= ruleExpression )
            // InternalXS.g:355:3: lv_value_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalVarDeclarationAccess().getValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_5);
            lv_value_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalVarDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_4_0, 
                      		"aom.scripting.xs.XS.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getLocalVarDeclarationAccess().getSemicolonKeyword_5());
                  
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
    // $ANTLR end "ruleLocalVarDeclaration"


    // $ANTLR start "entryRuleGlobalVarDeclaration"
    // InternalXS.g:383:1: entryRuleGlobalVarDeclaration returns [EObject current=null] : iv_ruleGlobalVarDeclaration= ruleGlobalVarDeclaration EOF ;
    public final EObject entryRuleGlobalVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalVarDeclaration = null;


        try {
            // InternalXS.g:384:2: (iv_ruleGlobalVarDeclaration= ruleGlobalVarDeclaration EOF )
            // InternalXS.g:385:2: iv_ruleGlobalVarDeclaration= ruleGlobalVarDeclaration EOF
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
    // InternalXS.g:392:1: ruleGlobalVarDeclaration returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) ) ( (lv_type_4_0= ruleVarTypeSpecifier ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_value_7_0= ruleLiteralOrVar ) ) otherlv_8= ';' ) ;
    public final EObject ruleGlobalVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_const_2_0=null;
        Token lv_extern_3_0=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_type_4_0 = null;

        EObject lv_value_7_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:395:28: ( ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) ) ( (lv_type_4_0= ruleVarTypeSpecifier ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_value_7_0= ruleLiteralOrVar ) ) otherlv_8= ';' ) )
            // InternalXS.g:396:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) ) ( (lv_type_4_0= ruleVarTypeSpecifier ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_value_7_0= ruleLiteralOrVar ) ) otherlv_8= ';' )
            {
            // InternalXS.g:396:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) ) ( (lv_type_4_0= ruleVarTypeSpecifier ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_value_7_0= ruleLiteralOrVar ) ) otherlv_8= ';' )
            // InternalXS.g:396:2: () ( ( ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) ) ( (lv_type_4_0= ruleVarTypeSpecifier ) ) ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_value_7_0= ruleLiteralOrVar ) ) otherlv_8= ';'
            {
            // InternalXS.g:396:2: ()
            // InternalXS.g:397:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGlobalVarDeclarationAccess().getGlobalVarDeclarationAction_0(),
                          current);
                  
            }

            }

            // InternalXS.g:402:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) ) )
            // InternalXS.g:404:1: ( ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) )
            {
            // InternalXS.g:404:1: ( ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* ) )
            // InternalXS.g:405:2: ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGlobalVarDeclarationAccess().getUnorderedGroup_1());
            // InternalXS.g:408:2: ( ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )* )
            // InternalXS.g:409:3: ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )*
            {
            // InternalXS.g:409:3: ( ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalVarDeclarationAccess().getUnorderedGroup_1(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalVarDeclarationAccess().getUnorderedGroup_1(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXS.g:411:4: ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) )
            	    {
            	    // InternalXS.g:411:4: ({...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) ) )
            	    // InternalXS.g:412:5: {...}? => ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalVarDeclarationAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGlobalVarDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalVarDeclarationAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalXS.g:412:117: ( ({...}? => ( (lv_const_2_0= 'const' ) ) ) )
            	    // InternalXS.g:413:6: ({...}? => ( (lv_const_2_0= 'const' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGlobalVarDeclarationAccess().getUnorderedGroup_1(), 0);
            	    // InternalXS.g:416:6: ({...}? => ( (lv_const_2_0= 'const' ) ) )
            	    // InternalXS.g:416:7: {...}? => ( (lv_const_2_0= 'const' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGlobalVarDeclaration", "true");
            	    }
            	    // InternalXS.g:416:16: ( (lv_const_2_0= 'const' ) )
            	    // InternalXS.g:417:1: (lv_const_2_0= 'const' )
            	    {
            	    // InternalXS.g:417:1: (lv_const_2_0= 'const' )
            	    // InternalXS.g:418:3: lv_const_2_0= 'const'
            	    {
            	    lv_const_2_0=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_const_2_0, grammarAccess.getGlobalVarDeclarationAccess().getConstConstKeyword_1_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGlobalVarDeclarationRule());
            	      	        }
            	             		setWithLastConsumed(current, "const", true, "const");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGlobalVarDeclarationAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXS.g:438:4: ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) )
            	    {
            	    // InternalXS.g:438:4: ({...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) ) )
            	    // InternalXS.g:439:5: {...}? => ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalVarDeclarationAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGlobalVarDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getGlobalVarDeclarationAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalXS.g:439:117: ( ({...}? => ( (lv_extern_3_0= 'extern' ) ) ) )
            	    // InternalXS.g:440:6: ({...}? => ( (lv_extern_3_0= 'extern' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGlobalVarDeclarationAccess().getUnorderedGroup_1(), 1);
            	    // InternalXS.g:443:6: ({...}? => ( (lv_extern_3_0= 'extern' ) ) )
            	    // InternalXS.g:443:7: {...}? => ( (lv_extern_3_0= 'extern' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGlobalVarDeclaration", "true");
            	    }
            	    // InternalXS.g:443:16: ( (lv_extern_3_0= 'extern' ) )
            	    // InternalXS.g:444:1: (lv_extern_3_0= 'extern' )
            	    {
            	    // InternalXS.g:444:1: (lv_extern_3_0= 'extern' )
            	    // InternalXS.g:445:3: lv_extern_3_0= 'extern'
            	    {
            	    lv_extern_3_0=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_extern_3_0, grammarAccess.getGlobalVarDeclarationAccess().getExternExternKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGlobalVarDeclarationRule());
            	      	        }
            	             		setWithLastConsumed(current, "extern", true, "extern");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGlobalVarDeclarationAccess().getUnorderedGroup_1());

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

            getUnorderedGroupHelper().leave(grammarAccess.getGlobalVarDeclarationAccess().getUnorderedGroup_1());

            }

            // InternalXS.g:472:2: ( (lv_type_4_0= ruleVarTypeSpecifier ) )
            // InternalXS.g:473:1: (lv_type_4_0= ruleVarTypeSpecifier )
            {
            // InternalXS.g:473:1: (lv_type_4_0= ruleVarTypeSpecifier )
            // InternalXS.g:474:3: lv_type_4_0= ruleVarTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGlobalVarDeclarationAccess().getTypeVarTypeSpecifierParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_type_4_0=ruleVarTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGlobalVarDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_4_0, 
                      		"aom.scripting.xs.XS.VarTypeSpecifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXS.g:490:2: ( (lv_name_5_0= RULE_ID ) )
            // InternalXS.g:491:1: (lv_name_5_0= RULE_ID )
            {
            // InternalXS.g:491:1: (lv_name_5_0= RULE_ID )
            // InternalXS.g:492:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getGlobalVarDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGlobalVarDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"aom.scripting.xs.XS.ID");
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getGlobalVarDeclarationAccess().getEqualsSignKeyword_4());
                  
            }
            // InternalXS.g:512:1: ( (lv_value_7_0= ruleLiteralOrVar ) )
            // InternalXS.g:513:1: (lv_value_7_0= ruleLiteralOrVar )
            {
            // InternalXS.g:513:1: (lv_value_7_0= ruleLiteralOrVar )
            // InternalXS.g:514:3: lv_value_7_0= ruleLiteralOrVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGlobalVarDeclarationAccess().getValueLiteralOrVarParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_5);
            lv_value_7_0=ruleLiteralOrVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGlobalVarDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_7_0, 
                      		"aom.scripting.xs.XS.LiteralOrVar");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getGlobalVarDeclarationAccess().getSemicolonKeyword_6());
                  
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


    // $ANTLR start "entryRuleParameterDeclaration"
    // InternalXS.g:542:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // InternalXS.g:543:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // InternalXS.g:544:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
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
    // InternalXS.g:551:1: ruleParameterDeclaration returns [EObject current=null] : ( () ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteralOrVar ) ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:554:28: ( ( () ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteralOrVar ) ) ) )
            // InternalXS.g:555:1: ( () ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteralOrVar ) ) )
            {
            // InternalXS.g:555:1: ( () ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteralOrVar ) ) )
            // InternalXS.g:555:2: () ( (lv_type_1_0= ruleVarTypeSpecifier ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleLiteralOrVar ) )
            {
            // InternalXS.g:555:2: ()
            // InternalXS.g:556:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParameterDeclarationAccess().getParameterDeclarationAction_0(),
                          current);
                  
            }

            }

            // InternalXS.g:561:2: ( (lv_type_1_0= ruleVarTypeSpecifier ) )
            // InternalXS.g:562:1: (lv_type_1_0= ruleVarTypeSpecifier )
            {
            // InternalXS.g:562:1: (lv_type_1_0= ruleVarTypeSpecifier )
            // InternalXS.g:563:3: lv_type_1_0= ruleVarTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getTypeVarTypeSpecifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_type_1_0=ruleVarTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"aom.scripting.xs.XS.VarTypeSpecifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXS.g:579:2: ( (lv_name_2_0= RULE_ID ) )
            // InternalXS.g:580:1: (lv_name_2_0= RULE_ID )
            {
            // InternalXS.g:580:1: (lv_name_2_0= RULE_ID )
            // InternalXS.g:581:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"aom.scripting.xs.XS.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getParameterDeclarationAccess().getEqualsSignKeyword_3());
                  
            }
            // InternalXS.g:601:1: ( (lv_value_4_0= ruleLiteralOrVar ) )
            // InternalXS.g:602:1: (lv_value_4_0= ruleLiteralOrVar )
            {
            // InternalXS.g:602:1: (lv_value_4_0= ruleLiteralOrVar )
            // InternalXS.g:603:3: lv_value_4_0= ruleLiteralOrVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getValueLiteralOrVarParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleLiteralOrVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_4_0, 
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
    // InternalXS.g:627:1: entryRuleForVarDeclaration returns [EObject current=null] : iv_ruleForVarDeclaration= ruleForVarDeclaration EOF ;
    public final EObject entryRuleForVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForVarDeclaration = null;


        try {
            // InternalXS.g:628:2: (iv_ruleForVarDeclaration= ruleForVarDeclaration EOF )
            // InternalXS.g:629:2: iv_ruleForVarDeclaration= ruleForVarDeclaration EOF
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
    // InternalXS.g:636:1: ruleForVarDeclaration returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleForVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:639:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // InternalXS.g:640:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // InternalXS.g:640:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // InternalXS.g:640:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            // InternalXS.g:640:2: ()
            // InternalXS.g:641:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getForVarDeclarationAccess().getForVarDeclarationAction_0(),
                          current);
                  
            }

            }

            // InternalXS.g:646:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalXS.g:647:1: (lv_name_1_0= RULE_ID )
            {
            // InternalXS.g:647:1: (lv_name_1_0= RULE_ID )
            // InternalXS.g:648:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getForVarDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getForVarDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"aom.scripting.xs.XS.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getForVarDeclarationAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalXS.g:668:1: ( (lv_value_3_0= ruleExpression ) )
            // InternalXS.g:669:1: (lv_value_3_0= ruleExpression )
            {
            // InternalXS.g:669:1: (lv_value_3_0= ruleExpression )
            // InternalXS.g:670:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForVarDeclarationAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForVarDeclarationRule());
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
    // $ANTLR end "ruleForVarDeclaration"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // InternalXS.g:694:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // InternalXS.g:695:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // InternalXS.g:696:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDeclaration; 
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
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalXS.g:703:1: ruleFunctionDeclaration returns [EObject current=null] : ( () ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_type_2_0= ruleFunctionTypeSpecifier ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (otherlv_5= 'void' )? | ( ( (lv_parameters_6_0= ruleParameterDeclaration ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterDeclaration ) ) )* ) ) otherlv_9= ')' ( (lv_body_10_0= ruleBlock ) ) ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_mutable_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_type_2_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_body_10_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:706:28: ( ( () ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_type_2_0= ruleFunctionTypeSpecifier ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (otherlv_5= 'void' )? | ( ( (lv_parameters_6_0= ruleParameterDeclaration ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterDeclaration ) ) )* ) ) otherlv_9= ')' ( (lv_body_10_0= ruleBlock ) ) ) )
            // InternalXS.g:707:1: ( () ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_type_2_0= ruleFunctionTypeSpecifier ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (otherlv_5= 'void' )? | ( ( (lv_parameters_6_0= ruleParameterDeclaration ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterDeclaration ) ) )* ) ) otherlv_9= ')' ( (lv_body_10_0= ruleBlock ) ) )
            {
            // InternalXS.g:707:1: ( () ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_type_2_0= ruleFunctionTypeSpecifier ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (otherlv_5= 'void' )? | ( ( (lv_parameters_6_0= ruleParameterDeclaration ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterDeclaration ) ) )* ) ) otherlv_9= ')' ( (lv_body_10_0= ruleBlock ) ) )
            // InternalXS.g:707:2: () ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_type_2_0= ruleFunctionTypeSpecifier ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (otherlv_5= 'void' )? | ( ( (lv_parameters_6_0= ruleParameterDeclaration ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterDeclaration ) ) )* ) ) otherlv_9= ')' ( (lv_body_10_0= ruleBlock ) )
            {
            // InternalXS.g:707:2: ()
            // InternalXS.g:708:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctionDeclarationAccess().getFunctionDeclarationAction_0(),
                          current);
                  
            }

            }

            // InternalXS.g:713:2: ( (lv_mutable_1_0= 'mutable' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXS.g:714:1: (lv_mutable_1_0= 'mutable' )
                    {
                    // InternalXS.g:714:1: (lv_mutable_1_0= 'mutable' )
                    // InternalXS.g:715:3: lv_mutable_1_0= 'mutable'
                    {
                    lv_mutable_1_0=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_mutable_1_0, grammarAccess.getFunctionDeclarationAccess().getMutableMutableKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "mutable", true, "mutable");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalXS.g:728:3: ( (lv_type_2_0= ruleFunctionTypeSpecifier ) )
            // InternalXS.g:729:1: (lv_type_2_0= ruleFunctionTypeSpecifier )
            {
            // InternalXS.g:729:1: (lv_type_2_0= ruleFunctionTypeSpecifier )
            // InternalXS.g:730:3: lv_type_2_0= ruleFunctionTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getTypeFunctionTypeSpecifierParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_type_2_0=ruleFunctionTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"aom.scripting.xs.XS.FunctionTypeSpecifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXS.g:746:2: ( (lv_name_3_0= RULE_ID ) )
            // InternalXS.g:747:1: (lv_name_3_0= RULE_ID )
            {
            // InternalXS.g:747:1: (lv_name_3_0= RULE_ID )
            // InternalXS.g:748:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"aom.scripting.xs.XS.ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_4());
                  
            }
            // InternalXS.g:768:1: ( (otherlv_5= 'void' )? | ( ( (lv_parameters_6_0= ruleParameterDeclaration ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterDeclaration ) ) )* ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19||LA7_0==21) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=59 && LA7_0<=63)) ) {
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
                    // InternalXS.g:768:2: (otherlv_5= 'void' )?
                    {
                    // InternalXS.g:768:2: (otherlv_5= 'void' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==19) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalXS.g:768:4: otherlv_5= 'void'
                            {
                            otherlv_5=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getVoidKeyword_5_0());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalXS.g:773:6: ( ( (lv_parameters_6_0= ruleParameterDeclaration ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterDeclaration ) ) )* )
                    {
                    // InternalXS.g:773:6: ( ( (lv_parameters_6_0= ruleParameterDeclaration ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterDeclaration ) ) )* )
                    // InternalXS.g:773:7: ( (lv_parameters_6_0= ruleParameterDeclaration ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterDeclaration ) ) )*
                    {
                    // InternalXS.g:773:7: ( (lv_parameters_6_0= ruleParameterDeclaration ) )
                    // InternalXS.g:774:1: (lv_parameters_6_0= ruleParameterDeclaration )
                    {
                    // InternalXS.g:774:1: (lv_parameters_6_0= ruleParameterDeclaration )
                    // InternalXS.g:775:3: lv_parameters_6_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersParameterDeclarationParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
                    lv_parameters_6_0=ruleParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_6_0, 
                              		"aom.scripting.xs.XS.ParameterDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalXS.g:791:2: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterDeclaration ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==20) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalXS.g:791:4: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // InternalXS.g:795:1: ( (lv_parameters_8_0= ruleParameterDeclaration ) )
                    	    // InternalXS.g:796:1: (lv_parameters_8_0= ruleParameterDeclaration )
                    	    {
                    	    // InternalXS.g:796:1: (lv_parameters_8_0= ruleParameterDeclaration )
                    	    // InternalXS.g:797:3: lv_parameters_8_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersParameterDeclarationParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    lv_parameters_8_0=ruleParameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_8_0, 
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

            otherlv_9=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_6());
                  
            }
            // InternalXS.g:817:1: ( (lv_body_10_0= ruleBlock ) )
            // InternalXS.g:818:1: (lv_body_10_0= ruleBlock )
            {
            // InternalXS.g:818:1: (lv_body_10_0= ruleBlock )
            // InternalXS.g:819:3: lv_body_10_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyBlockParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_body_10_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_10_0, 
                      		"aom.scripting.xs.XS.Block");
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
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleFunctionTypeSpecifier"
    // InternalXS.g:843:1: entryRuleFunctionTypeSpecifier returns [EObject current=null] : iv_ruleFunctionTypeSpecifier= ruleFunctionTypeSpecifier EOF ;
    public final EObject entryRuleFunctionTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionTypeSpecifier = null;


        try {
            // InternalXS.g:844:2: (iv_ruleFunctionTypeSpecifier= ruleFunctionTypeSpecifier EOF )
            // InternalXS.g:845:2: iv_ruleFunctionTypeSpecifier= ruleFunctionTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionTypeSpecifier=ruleFunctionTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionTypeSpecifier; 
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
    // $ANTLR end "entryRuleFunctionTypeSpecifier"


    // $ANTLR start "ruleFunctionTypeSpecifier"
    // InternalXS.g:852:1: ruleFunctionTypeSpecifier returns [EObject current=null] : (this_VoidType_0= ruleVoidType | this_VarTypeSpecifier_1= ruleVarTypeSpecifier ) ;
    public final EObject ruleFunctionTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject this_VoidType_0 = null;

        EObject this_VarTypeSpecifier_1 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:855:28: ( (this_VoidType_0= ruleVoidType | this_VarTypeSpecifier_1= ruleVarTypeSpecifier ) )
            // InternalXS.g:856:1: (this_VoidType_0= ruleVoidType | this_VarTypeSpecifier_1= ruleVarTypeSpecifier )
            {
            // InternalXS.g:856:1: (this_VoidType_0= ruleVoidType | this_VarTypeSpecifier_1= ruleVarTypeSpecifier )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=59 && LA8_0<=63)) ) {
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
                    // InternalXS.g:857:5: this_VoidType_0= ruleVoidType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunctionTypeSpecifierAccess().getVoidTypeParserRuleCall_0()); 
                          
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
                    // InternalXS.g:867:5: this_VarTypeSpecifier_1= ruleVarTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunctionTypeSpecifierAccess().getVarTypeSpecifierParserRuleCall_1()); 
                          
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
    // $ANTLR end "ruleFunctionTypeSpecifier"


    // $ANTLR start "entryRuleRuleDeclaration"
    // InternalXS.g:883:1: entryRuleRuleDeclaration returns [EObject current=null] : iv_ruleRuleDeclaration= ruleRuleDeclaration EOF ;
    public final EObject entryRuleRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDeclaration = null;


        try {
            // InternalXS.g:884:2: (iv_ruleRuleDeclaration= ruleRuleDeclaration EOF )
            // InternalXS.g:885:2: iv_ruleRuleDeclaration= ruleRuleDeclaration EOF
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
    // InternalXS.g:892:1: ruleRuleDeclaration returns [EObject current=null] : ( () otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_body_16_0= ruleBlock ) ) ) ;
    public final EObject ruleRuleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_active_4_0=null;
        Token otherlv_5=null;
        Token lv_runImmediately_6_0=null;
        Token lv_highFrequency_7_0=null;
        Token otherlv_8=null;
        Token lv_group_9_0=null;
        Token otherlv_10=null;
        Token lv_minInterval_11_0=null;
        Token otherlv_12=null;
        Token lv_maxInterval_13_0=null;
        Token otherlv_14=null;
        Token lv_priority_15_0=null;
        EObject lv_body_16_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:895:28: ( ( () otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_body_16_0= ruleBlock ) ) ) )
            // InternalXS.g:896:1: ( () otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_body_16_0= ruleBlock ) ) )
            {
            // InternalXS.g:896:1: ( () otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_body_16_0= ruleBlock ) ) )
            // InternalXS.g:896:2: () otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_body_16_0= ruleBlock ) )
            {
            // InternalXS.g:896:2: ()
            // InternalXS.g:897:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRuleDeclarationAccess().getRuleDeclarationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRuleDeclarationAccess().getRuleKeyword_1());
                  
            }
            // InternalXS.g:906:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalXS.g:907:1: (lv_name_2_0= RULE_ID )
            {
            // InternalXS.g:907:1: (lv_name_2_0= RULE_ID )
            // InternalXS.g:908:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getRuleDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"aom.scripting.xs.XS.ID");
              	    
            }

            }


            }

            // InternalXS.g:924:2: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalXS.g:926:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalXS.g:926:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalXS.g:927:2: ( ( ({...}? => ( ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3());
            // InternalXS.g:930:2: ( ( ({...}? => ( ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalXS.g:931:3: ( ({...}? => ( ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalXS.g:931:3: ( ({...}? => ( ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=8;
                int LA10_0 = input.LA(1);

                if ( LA10_0 >= 23 && LA10_0 <= 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 2) ) {
                    alt10=3;
                }
                else if ( LA10_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 3) ) {
                    alt10=4;
                }
                else if ( LA10_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 4) ) {
                    alt10=5;
                }
                else if ( LA10_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 5) ) {
                    alt10=6;
                }
                else if ( LA10_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 6) ) {
                    alt10=7;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXS.g:933:4: ({...}? => ( ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) ) ) )
            	    {
            	    // InternalXS.g:933:4: ({...}? => ( ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) ) ) )
            	    // InternalXS.g:934:5: {...}? => ( ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalXS.g:934:112: ( ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) ) )
            	    // InternalXS.g:935:6: ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 0);
            	    // InternalXS.g:938:6: ({...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' ) )
            	    // InternalXS.g:938:7: {...}? => ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // InternalXS.g:938:16: ( ( (lv_active_4_0= 'active' ) ) | otherlv_5= 'inactive' )
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
            	            // InternalXS.g:938:17: ( (lv_active_4_0= 'active' ) )
            	            {
            	            // InternalXS.g:938:17: ( (lv_active_4_0= 'active' ) )
            	            // InternalXS.g:939:1: (lv_active_4_0= 'active' )
            	            {
            	            // InternalXS.g:939:1: (lv_active_4_0= 'active' )
            	            // InternalXS.g:940:3: lv_active_4_0= 'active'
            	            {
            	            lv_active_4_0=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_active_4_0, grammarAccess.getRuleDeclarationAccess().getActiveActiveKeyword_3_0_0_0());
            	                  
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
            	            // InternalXS.g:954:7: otherlv_5= 'inactive'
            	            {
            	            otherlv_5=(Token)match(input,24,FOLLOW_19); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_5, grammarAccess.getRuleDeclarationAccess().getInactiveKeyword_3_0_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXS.g:965:4: ({...}? => ( ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) ) ) )
            	    {
            	    // InternalXS.g:965:4: ({...}? => ( ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) ) ) )
            	    // InternalXS.g:966:5: {...}? => ( ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalXS.g:966:112: ( ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) ) )
            	    // InternalXS.g:967:6: ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 1);
            	    // InternalXS.g:970:6: ({...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) ) )
            	    // InternalXS.g:970:7: {...}? => ( (lv_runImmediately_6_0= 'runImmediately' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // InternalXS.g:970:16: ( (lv_runImmediately_6_0= 'runImmediately' ) )
            	    // InternalXS.g:971:1: (lv_runImmediately_6_0= 'runImmediately' )
            	    {
            	    // InternalXS.g:971:1: (lv_runImmediately_6_0= 'runImmediately' )
            	    // InternalXS.g:972:3: lv_runImmediately_6_0= 'runImmediately'
            	    {
            	    lv_runImmediately_6_0=(Token)match(input,25,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_runImmediately_6_0, grammarAccess.getRuleDeclarationAccess().getRunImmediatelyRunImmediatelyKeyword_3_1_0());
            	          
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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXS.g:992:4: ({...}? => ( ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) ) ) )
            	    {
            	    // InternalXS.g:992:4: ({...}? => ( ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) ) ) )
            	    // InternalXS.g:993:5: {...}? => ( ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalXS.g:993:112: ( ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) ) )
            	    // InternalXS.g:994:6: ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 2);
            	    // InternalXS.g:997:6: ({...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) ) )
            	    // InternalXS.g:997:7: {...}? => ( (lv_highFrequency_7_0= 'highFrequency' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // InternalXS.g:997:16: ( (lv_highFrequency_7_0= 'highFrequency' ) )
            	    // InternalXS.g:998:1: (lv_highFrequency_7_0= 'highFrequency' )
            	    {
            	    // InternalXS.g:998:1: (lv_highFrequency_7_0= 'highFrequency' )
            	    // InternalXS.g:999:3: lv_highFrequency_7_0= 'highFrequency'
            	    {
            	    lv_highFrequency_7_0=(Token)match(input,26,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_highFrequency_7_0, grammarAccess.getRuleDeclarationAccess().getHighFrequencyHighFrequencyKeyword_3_2_0());
            	          
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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXS.g:1019:4: ({...}? => ( ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalXS.g:1019:4: ({...}? => ( ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) ) ) )
            	    // InternalXS.g:1020:5: {...}? => ( ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalXS.g:1020:112: ( ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) ) )
            	    // InternalXS.g:1021:6: ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 3);
            	    // InternalXS.g:1024:6: ({...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) ) )
            	    // InternalXS.g:1024:7: {...}? => (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // InternalXS.g:1024:16: (otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) ) )
            	    // InternalXS.g:1024:18: otherlv_8= 'group' ( (lv_group_9_0= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,27,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getRuleDeclarationAccess().getGroupKeyword_3_3_0());
            	          
            	    }
            	    // InternalXS.g:1028:1: ( (lv_group_9_0= RULE_ID ) )
            	    // InternalXS.g:1029:1: (lv_group_9_0= RULE_ID )
            	    {
            	    // InternalXS.g:1029:1: (lv_group_9_0= RULE_ID )
            	    // InternalXS.g:1030:3: lv_group_9_0= RULE_ID
            	    {
            	    lv_group_9_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_group_9_0, grammarAccess.getRuleDeclarationAccess().getGroupIDTerminalRuleCall_3_3_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"group",
            	              		lv_group_9_0, 
            	              		"aom.scripting.xs.XS.ID");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalXS.g:1053:4: ({...}? => ( ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalXS.g:1053:4: ({...}? => ( ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) ) ) )
            	    // InternalXS.g:1054:5: {...}? => ( ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalXS.g:1054:112: ( ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) ) )
            	    // InternalXS.g:1055:6: ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 4);
            	    // InternalXS.g:1058:6: ({...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) ) )
            	    // InternalXS.g:1058:7: {...}? => (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // InternalXS.g:1058:16: (otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) ) )
            	    // InternalXS.g:1058:18: otherlv_10= 'minInterval' ( (lv_minInterval_11_0= RULE_INT ) )
            	    {
            	    otherlv_10=(Token)match(input,28,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getRuleDeclarationAccess().getMinIntervalKeyword_3_4_0());
            	          
            	    }
            	    // InternalXS.g:1062:1: ( (lv_minInterval_11_0= RULE_INT ) )
            	    // InternalXS.g:1063:1: (lv_minInterval_11_0= RULE_INT )
            	    {
            	    // InternalXS.g:1063:1: (lv_minInterval_11_0= RULE_INT )
            	    // InternalXS.g:1064:3: lv_minInterval_11_0= RULE_INT
            	    {
            	    lv_minInterval_11_0=(Token)match(input,RULE_INT,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_minInterval_11_0, grammarAccess.getRuleDeclarationAccess().getMinIntervalINTTerminalRuleCall_3_4_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"minInterval",
            	              		lv_minInterval_11_0, 
            	              		"aom.scripting.xs.XS.INT");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalXS.g:1087:4: ({...}? => ( ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalXS.g:1087:4: ({...}? => ( ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) ) ) )
            	    // InternalXS.g:1088:5: {...}? => ( ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalXS.g:1088:112: ( ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) ) )
            	    // InternalXS.g:1089:6: ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 5);
            	    // InternalXS.g:1092:6: ({...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) ) )
            	    // InternalXS.g:1092:7: {...}? => (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // InternalXS.g:1092:16: (otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) ) )
            	    // InternalXS.g:1092:18: otherlv_12= 'maxInterval' ( (lv_maxInterval_13_0= RULE_INT ) )
            	    {
            	    otherlv_12=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getRuleDeclarationAccess().getMaxIntervalKeyword_3_5_0());
            	          
            	    }
            	    // InternalXS.g:1096:1: ( (lv_maxInterval_13_0= RULE_INT ) )
            	    // InternalXS.g:1097:1: (lv_maxInterval_13_0= RULE_INT )
            	    {
            	    // InternalXS.g:1097:1: (lv_maxInterval_13_0= RULE_INT )
            	    // InternalXS.g:1098:3: lv_maxInterval_13_0= RULE_INT
            	    {
            	    lv_maxInterval_13_0=(Token)match(input,RULE_INT,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_maxInterval_13_0, grammarAccess.getRuleDeclarationAccess().getMaxIntervalINTTerminalRuleCall_3_5_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"maxInterval",
            	              		lv_maxInterval_13_0, 
            	              		"aom.scripting.xs.XS.INT");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalXS.g:1121:4: ({...}? => ( ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalXS.g:1121:4: ({...}? => ( ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) ) ) )
            	    // InternalXS.g:1122:5: {...}? => ( ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalXS.g:1122:112: ( ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) ) )
            	    // InternalXS.g:1123:6: ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3(), 6);
            	    // InternalXS.g:1126:6: ({...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) ) )
            	    // InternalXS.g:1126:7: {...}? => (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRuleDeclaration", "true");
            	    }
            	    // InternalXS.g:1126:16: (otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) ) )
            	    // InternalXS.g:1126:18: otherlv_14= 'priority' ( (lv_priority_15_0= RULE_INT ) )
            	    {
            	    otherlv_14=(Token)match(input,30,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getRuleDeclarationAccess().getPriorityKeyword_3_6_0());
            	          
            	    }
            	    // InternalXS.g:1130:1: ( (lv_priority_15_0= RULE_INT ) )
            	    // InternalXS.g:1131:1: (lv_priority_15_0= RULE_INT )
            	    {
            	    // InternalXS.g:1131:1: (lv_priority_15_0= RULE_INT )
            	    // InternalXS.g:1132:3: lv_priority_15_0= RULE_INT
            	    {
            	    lv_priority_15_0=(Token)match(input,RULE_INT,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_priority_15_0, grammarAccess.getRuleDeclarationAccess().getPriorityINTTerminalRuleCall_3_6_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRuleDeclarationRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"priority",
            	              		lv_priority_15_0, 
            	              		"aom.scripting.xs.XS.INT");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleRuleDeclaration", "getUnorderedGroupHelper().canLeave(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getRuleDeclarationAccess().getUnorderedGroup_3());

            }

            // InternalXS.g:1163:2: ( (lv_body_16_0= ruleBlock ) )
            // InternalXS.g:1164:1: (lv_body_16_0= ruleBlock )
            {
            // InternalXS.g:1164:1: (lv_body_16_0= ruleBlock )
            // InternalXS.g:1165:3: lv_body_16_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleDeclarationAccess().getBodyBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_body_16_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRuleDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_16_0, 
                      		"aom.scripting.xs.XS.Block");
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


    // $ANTLR start "entryRuleVarTypeSpecifier"
    // InternalXS.g:1189:1: entryRuleVarTypeSpecifier returns [EObject current=null] : iv_ruleVarTypeSpecifier= ruleVarTypeSpecifier EOF ;
    public final EObject entryRuleVarTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarTypeSpecifier = null;


        try {
            // InternalXS.g:1190:2: (iv_ruleVarTypeSpecifier= ruleVarTypeSpecifier EOF )
            // InternalXS.g:1191:2: iv_ruleVarTypeSpecifier= ruleVarTypeSpecifier EOF
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
    // InternalXS.g:1198:1: ruleVarTypeSpecifier returns [EObject current=null] : (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BoolType_2= ruleBoolType | this_VectorType_3= ruleVectorType | this_StringType_4= ruleStringType ) ;
    public final EObject ruleVarTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject this_IntType_0 = null;

        EObject this_FloatType_1 = null;

        EObject this_BoolType_2 = null;

        EObject this_VectorType_3 = null;

        EObject this_StringType_4 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1201:28: ( (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BoolType_2= ruleBoolType | this_VectorType_3= ruleVectorType | this_StringType_4= ruleStringType ) )
            // InternalXS.g:1202:1: (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BoolType_2= ruleBoolType | this_VectorType_3= ruleVectorType | this_StringType_4= ruleStringType )
            {
            // InternalXS.g:1202:1: (this_IntType_0= ruleIntType | this_FloatType_1= ruleFloatType | this_BoolType_2= ruleBoolType | this_VectorType_3= ruleVectorType | this_StringType_4= ruleStringType )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt11=1;
                }
                break;
            case 61:
                {
                alt11=2;
                }
                break;
            case 62:
                {
                alt11=3;
                }
                break;
            case 59:
                {
                alt11=4;
                }
                break;
            case 63:
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
                    // InternalXS.g:1203:5: this_IntType_0= ruleIntType
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
                    // InternalXS.g:1213:5: this_FloatType_1= ruleFloatType
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
                    // InternalXS.g:1223:5: this_BoolType_2= ruleBoolType
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
                    // InternalXS.g:1233:5: this_VectorType_3= ruleVectorType
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
                    // InternalXS.g:1243:5: this_StringType_4= ruleStringType
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


    // $ANTLR start "entryRuleBlock"
    // InternalXS.g:1259:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalXS.g:1260:2: (iv_ruleBlock= ruleBlock EOF )
            // InternalXS.g:1261:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalXS.g:1268:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_contents_2_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1271:28: ( ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' ) )
            // InternalXS.g:1272:1: ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' )
            {
            // InternalXS.g:1272:1: ( () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}' )
            // InternalXS.g:1272:2: () otherlv_1= '{' ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )* otherlv_3= '}'
            {
            // InternalXS.g:1272:2: ()
            // InternalXS.g:1273:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockAccess().getBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalXS.g:1282:1: ( (lv_contents_2_0= ruleVarDeclarationOrStatement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==33||(LA12_0>=35 && LA12_0<=37)||(LA12_0>=41 && LA12_0<=43)||(LA12_0>=59 && LA12_0<=63)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXS.g:1283:1: (lv_contents_2_0= ruleVarDeclarationOrStatement )
            	    {
            	    // InternalXS.g:1283:1: (lv_contents_2_0= ruleVarDeclarationOrStatement )
            	    // InternalXS.g:1284:3: lv_contents_2_0= ruleVarDeclarationOrStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockAccess().getContentsVarDeclarationOrStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_contents_2_0=ruleVarDeclarationOrStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBlockRule());
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

            otherlv_3=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleVarDeclarationOrStatement"
    // InternalXS.g:1312:1: entryRuleVarDeclarationOrStatement returns [EObject current=null] : iv_ruleVarDeclarationOrStatement= ruleVarDeclarationOrStatement EOF ;
    public final EObject entryRuleVarDeclarationOrStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclarationOrStatement = null;


        try {
            // InternalXS.g:1313:2: (iv_ruleVarDeclarationOrStatement= ruleVarDeclarationOrStatement EOF )
            // InternalXS.g:1314:2: iv_ruleVarDeclarationOrStatement= ruleVarDeclarationOrStatement EOF
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
    // InternalXS.g:1321:1: ruleVarDeclarationOrStatement returns [EObject current=null] : (this_LocalVarDeclaration_0= ruleLocalVarDeclaration | this_Statement_1= ruleStatement ) ;
    public final EObject ruleVarDeclarationOrStatement() throws RecognitionException {
        EObject current = null;

        EObject this_LocalVarDeclaration_0 = null;

        EObject this_Statement_1 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1324:28: ( (this_LocalVarDeclaration_0= ruleLocalVarDeclaration | this_Statement_1= ruleStatement ) )
            // InternalXS.g:1325:1: (this_LocalVarDeclaration_0= ruleLocalVarDeclaration | this_Statement_1= ruleStatement )
            {
            // InternalXS.g:1325:1: (this_LocalVarDeclaration_0= ruleLocalVarDeclaration | this_Statement_1= ruleStatement )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=59 && LA13_0<=63)) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID||LA13_0==33||(LA13_0>=35 && LA13_0<=37)||(LA13_0>=41 && LA13_0<=43)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalXS.g:1326:5: this_LocalVarDeclaration_0= ruleLocalVarDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarDeclarationOrStatementAccess().getLocalVarDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_LocalVarDeclaration_0=ruleLocalVarDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalVarDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:1336:5: this_Statement_1= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarDeclarationOrStatementAccess().getStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Statement_1=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_1; 
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


    // $ANTLR start "entryRuleStatementOrBlock"
    // InternalXS.g:1352:1: entryRuleStatementOrBlock returns [EObject current=null] : iv_ruleStatementOrBlock= ruleStatementOrBlock EOF ;
    public final EObject entryRuleStatementOrBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementOrBlock = null;


        try {
            // InternalXS.g:1353:2: (iv_ruleStatementOrBlock= ruleStatementOrBlock EOF )
            // InternalXS.g:1354:2: iv_ruleStatementOrBlock= ruleStatementOrBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementOrBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatementOrBlock=ruleStatementOrBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementOrBlock; 
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
    // $ANTLR end "entryRuleStatementOrBlock"


    // $ANTLR start "ruleStatementOrBlock"
    // InternalXS.g:1361:1: ruleStatementOrBlock returns [EObject current=null] : (this_Statement_0= ruleStatement | this_Block_1= ruleBlock ) ;
    public final EObject ruleStatementOrBlock() throws RecognitionException {
        EObject current = null;

        EObject this_Statement_0 = null;

        EObject this_Block_1 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1364:28: ( (this_Statement_0= ruleStatement | this_Block_1= ruleBlock ) )
            // InternalXS.g:1365:1: (this_Statement_0= ruleStatement | this_Block_1= ruleBlock )
            {
            // InternalXS.g:1365:1: (this_Statement_0= ruleStatement | this_Block_1= ruleBlock )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==33||(LA14_0>=35 && LA14_0<=37)||(LA14_0>=41 && LA14_0<=43)) ) {
                alt14=1;
            }
            else if ( (LA14_0==31) ) {
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
                    // InternalXS.g:1366:5: this_Statement_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementOrBlockAccess().getStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Statement_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:1376:5: this_Block_1= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementOrBlockAccess().getBlockParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Block_1=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Block_1; 
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
    // $ANTLR end "ruleStatementOrBlock"


    // $ANTLR start "entryRuleStatement"
    // InternalXS.g:1392:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalXS.g:1393:2: (iv_ruleStatement= ruleStatement EOF )
            // InternalXS.g:1394:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalXS.g:1401:1: ruleStatement returns [EObject current=null] : (this_ExpressionStatement_0= ruleExpressionStatement | this_PostfixStatement_1= rulePostfixStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionStatement_0 = null;

        EObject this_PostfixStatement_1 = null;

        EObject this_IfElseStatement_2 = null;

        EObject this_WhileStatement_3 = null;

        EObject this_ForStatement_4 = null;

        EObject this_SwitchStatement_5 = null;

        EObject this_ReturnStatement_6 = null;

        EObject this_ContinueStatement_7 = null;

        EObject this_BreakStatement_8 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1404:28: ( (this_ExpressionStatement_0= ruleExpressionStatement | this_PostfixStatement_1= rulePostfixStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement ) )
            // InternalXS.g:1405:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_PostfixStatement_1= rulePostfixStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement )
            {
            // InternalXS.g:1405:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_PostfixStatement_1= rulePostfixStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement )
            int alt15=9;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalXS.g:1406:5: this_ExpressionStatement_0= ruleExpressionStatement
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
                    // InternalXS.g:1416:5: this_PostfixStatement_1= rulePostfixStatement
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
                    // InternalXS.g:1426:5: this_IfElseStatement_2= ruleIfElseStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfElseStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalXS.g:1436:5: this_WhileStatement_3= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalXS.g:1446:5: this_ForStatement_4= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalXS.g:1456:5: this_SwitchStatement_5= ruleSwitchStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getSwitchStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalXS.g:1466:5: this_ReturnStatement_6= ruleReturnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalXS.g:1476:5: this_ContinueStatement_7= ruleContinueStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getContinueStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalXS.g:1486:5: this_BreakStatement_8= ruleBreakStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getBreakStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalXS.g:1502:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // InternalXS.g:1503:2: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // InternalXS.g:1504:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
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
    // InternalXS.g:1511:1: ruleExpressionStatement returns [EObject current=null] : ( (this_Call_0= ruleCall otherlv_1= ';' ) | (this_Assign_2= ruleAssign otherlv_3= ';' ) ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Call_0 = null;

        EObject this_Assign_2 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1514:28: ( ( (this_Call_0= ruleCall otherlv_1= ';' ) | (this_Assign_2= ruleAssign otherlv_3= ';' ) ) )
            // InternalXS.g:1515:1: ( (this_Call_0= ruleCall otherlv_1= ';' ) | (this_Assign_2= ruleAssign otherlv_3= ';' ) )
            {
            // InternalXS.g:1515:1: ( (this_Call_0= ruleCall otherlv_1= ';' ) | (this_Assign_2= ruleAssign otherlv_3= ';' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==18) ) {
                    alt16=1;
                }
                else if ( (LA16_1==14) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalXS.g:1515:2: (this_Call_0= ruleCall otherlv_1= ';' )
                    {
                    // InternalXS.g:1515:2: (this_Call_0= ruleCall otherlv_1= ';' )
                    // InternalXS.g:1516:5: this_Call_0= ruleCall otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionStatementAccess().getCallParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_5);
                    this_Call_0=ruleCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Call_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXS.g:1529:6: (this_Assign_2= ruleAssign otherlv_3= ';' )
                    {
                    // InternalXS.g:1529:6: (this_Assign_2= ruleAssign otherlv_3= ';' )
                    // InternalXS.g:1530:5: this_Assign_2= ruleAssign otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionStatementAccess().getAssignParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_5);
                    this_Assign_2=ruleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assign_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRulePostfixStatement"
    // InternalXS.g:1550:1: entryRulePostfixStatement returns [EObject current=null] : iv_rulePostfixStatement= rulePostfixStatement EOF ;
    public final EObject entryRulePostfixStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixStatement = null;


        try {
            // InternalXS.g:1551:2: (iv_rulePostfixStatement= rulePostfixStatement EOF )
            // InternalXS.g:1552:2: iv_rulePostfixStatement= rulePostfixStatement EOF
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
    // InternalXS.g:1559:1: rulePostfixStatement returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_op_2_0= rulePostFixOp ) ) otherlv_3= ';' ) ;
    public final EObject rulePostfixStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_op_2_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1562:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_op_2_0= rulePostFixOp ) ) otherlv_3= ';' ) )
            // InternalXS.g:1563:1: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_op_2_0= rulePostFixOp ) ) otherlv_3= ';' )
            {
            // InternalXS.g:1563:1: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_op_2_0= rulePostFixOp ) ) otherlv_3= ';' )
            // InternalXS.g:1563:2: () ( (otherlv_1= RULE_ID ) ) ( (lv_op_2_0= rulePostFixOp ) ) otherlv_3= ';'
            {
            // InternalXS.g:1563:2: ()
            // InternalXS.g:1564:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPostfixStatementAccess().getPostfixStatementAction_0(),
                          current);
                  
            }

            }

            // InternalXS.g:1569:2: ( (otherlv_1= RULE_ID ) )
            // InternalXS.g:1570:1: (otherlv_1= RULE_ID )
            {
            // InternalXS.g:1570:1: (otherlv_1= RULE_ID )
            // InternalXS.g:1571:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPostfixStatementRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getPostfixStatementAccess().getVarVarDeclarationCrossReference_1_0()); 
              	
            }

            }


            }

            // InternalXS.g:1582:2: ( (lv_op_2_0= rulePostFixOp ) )
            // InternalXS.g:1583:1: (lv_op_2_0= rulePostFixOp )
            {
            // InternalXS.g:1583:1: (lv_op_2_0= rulePostFixOp )
            // InternalXS.g:1584:3: lv_op_2_0= rulePostFixOp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPostfixStatementAccess().getOpPostFixOpParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_5);
            lv_op_2_0=rulePostFixOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPostfixStatementRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_2_0, 
                      		"aom.scripting.xs.XS.PostFixOp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPostfixStatementAccess().getSemicolonKeyword_3());
                  
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
    // InternalXS.g:1612:1: entryRuleIfElseStatement returns [EObject current=null] : iv_ruleIfElseStatement= ruleIfElseStatement EOF ;
    public final EObject entryRuleIfElseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElseStatement = null;


        try {
            // InternalXS.g:1613:2: (iv_ruleIfElseStatement= ruleIfElseStatement EOF )
            // InternalXS.g:1614:2: iv_ruleIfElseStatement= ruleIfElseStatement EOF
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
    // InternalXS.g:1621:1: ruleIfElseStatement returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenStatement_5_0= ruleStatementOrBlock ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_elseStatement_7_0= ruleStatementOrBlock ) ) )? ) ;
    public final EObject ruleIfElseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_3_0 = null;

        EObject lv_thenStatement_5_0 = null;

        EObject lv_elseStatement_7_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1624:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenStatement_5_0= ruleStatementOrBlock ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_elseStatement_7_0= ruleStatementOrBlock ) ) )? ) )
            // InternalXS.g:1625:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenStatement_5_0= ruleStatementOrBlock ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_elseStatement_7_0= ruleStatementOrBlock ) ) )? )
            {
            // InternalXS.g:1625:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenStatement_5_0= ruleStatementOrBlock ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_elseStatement_7_0= ruleStatementOrBlock ) ) )? )
            // InternalXS.g:1625:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_thenStatement_5_0= ruleStatementOrBlock ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_elseStatement_7_0= ruleStatementOrBlock ) ) )?
            {
            // InternalXS.g:1625:2: ()
            // InternalXS.g:1626:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIfElseStatementAccess().getIfElseStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfElseStatementAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfElseStatementAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalXS.g:1639:1: ( (lv_condition_3_0= ruleExpression ) )
            // InternalXS.g:1640:1: (lv_condition_3_0= ruleExpression )
            {
            // InternalXS.g:1640:1: (lv_condition_3_0= ruleExpression )
            // InternalXS.g:1641:3: lv_condition_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfElseStatementAccess().getConditionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_15);
            lv_condition_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_3_0, 
                      		"aom.scripting.xs.XS.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIfElseStatementAccess().getRightParenthesisKeyword_4());
                  
            }
            // InternalXS.g:1661:1: ( (lv_thenStatement_5_0= ruleStatementOrBlock ) )
            // InternalXS.g:1662:1: (lv_thenStatement_5_0= ruleStatementOrBlock )
            {
            // InternalXS.g:1662:1: (lv_thenStatement_5_0= ruleStatementOrBlock )
            // InternalXS.g:1663:3: lv_thenStatement_5_0= ruleStatementOrBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfElseStatementAccess().getThenStatementStatementOrBlockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_24);
            lv_thenStatement_5_0=ruleStatementOrBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
              	        }
                     		set(
                     			current, 
                     			"thenStatement",
                      		lv_thenStatement_5_0, 
                      		"aom.scripting.xs.XS.StatementOrBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXS.g:1679:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_elseStatement_7_0= ruleStatementOrBlock ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                int LA17_1 = input.LA(2);

                if ( (synpred1_InternalXS()) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalXS.g:1679:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_elseStatement_7_0= ruleStatementOrBlock ) )
                    {
                    // InternalXS.g:1679:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // InternalXS.g:1679:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getIfElseStatementAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // InternalXS.g:1684:2: ( (lv_elseStatement_7_0= ruleStatementOrBlock ) )
                    // InternalXS.g:1685:1: (lv_elseStatement_7_0= ruleStatementOrBlock )
                    {
                    // InternalXS.g:1685:1: (lv_elseStatement_7_0= ruleStatementOrBlock )
                    // InternalXS.g:1686:3: lv_elseStatement_7_0= ruleStatementOrBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfElseStatementAccess().getElseStatementStatementOrBlockParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseStatement_7_0=ruleStatementOrBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfElseStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_7_0, 
                              		"aom.scripting.xs.XS.StatementOrBlock");
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
    // InternalXS.g:1710:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalXS.g:1711:2: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalXS.g:1712:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalXS.g:1719:1: ruleWhileStatement returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_statement_5_0= ruleStatementOrBlock ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_3_0 = null;

        EObject lv_statement_5_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1722:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_statement_5_0= ruleStatementOrBlock ) ) ) )
            // InternalXS.g:1723:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_statement_5_0= ruleStatementOrBlock ) ) )
            {
            // InternalXS.g:1723:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_statement_5_0= ruleStatementOrBlock ) ) )
            // InternalXS.g:1723:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ')' ( (lv_statement_5_0= ruleStatementOrBlock ) )
            {
            // InternalXS.g:1723:2: ()
            // InternalXS.g:1724:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getWhileStatementAccess().getWhileStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalXS.g:1737:1: ( (lv_condition_3_0= ruleExpression ) )
            // InternalXS.g:1738:1: (lv_condition_3_0= ruleExpression )
            {
            // InternalXS.g:1738:1: (lv_condition_3_0= ruleExpression )
            // InternalXS.g:1739:3: lv_condition_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_15);
            lv_condition_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_3_0, 
                      		"aom.scripting.xs.XS.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_4());
                  
            }
            // InternalXS.g:1759:1: ( (lv_statement_5_0= ruleStatementOrBlock ) )
            // InternalXS.g:1760:1: (lv_statement_5_0= ruleStatementOrBlock )
            {
            // InternalXS.g:1760:1: (lv_statement_5_0= ruleStatementOrBlock )
            // InternalXS.g:1761:3: lv_statement_5_0= ruleStatementOrBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileStatementAccess().getStatementStatementOrBlockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_statement_5_0=ruleStatementOrBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_5_0, 
                      		"aom.scripting.xs.XS.StatementOrBlock");
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
    // InternalXS.g:1785:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalXS.g:1786:2: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalXS.g:1787:2: iv_ruleForStatement= ruleForStatement EOF
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
    // InternalXS.g:1794:1: ruleForStatement returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_var_3_0= ruleForVarDeclaration ) ) otherlv_4= ';' ( (lv_op_5_0= ruleRelOp ) ) ( (lv_end_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatementOrBlock ) ) ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_var_3_0 = null;

        AntlrDatatypeRuleToken lv_op_5_0 = null;

        EObject lv_end_6_0 = null;

        EObject lv_statement_8_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1797:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_var_3_0= ruleForVarDeclaration ) ) otherlv_4= ';' ( (lv_op_5_0= ruleRelOp ) ) ( (lv_end_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatementOrBlock ) ) ) )
            // InternalXS.g:1798:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_var_3_0= ruleForVarDeclaration ) ) otherlv_4= ';' ( (lv_op_5_0= ruleRelOp ) ) ( (lv_end_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatementOrBlock ) ) )
            {
            // InternalXS.g:1798:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_var_3_0= ruleForVarDeclaration ) ) otherlv_4= ';' ( (lv_op_5_0= ruleRelOp ) ) ( (lv_end_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatementOrBlock ) ) )
            // InternalXS.g:1798:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_var_3_0= ruleForVarDeclaration ) ) otherlv_4= ';' ( (lv_op_5_0= ruleRelOp ) ) ( (lv_end_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatementOrBlock ) )
            {
            // InternalXS.g:1798:2: ()
            // InternalXS.g:1799:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getForStatementAccess().getForStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalXS.g:1812:1: ( (lv_var_3_0= ruleForVarDeclaration ) )
            // InternalXS.g:1813:1: (lv_var_3_0= ruleForVarDeclaration )
            {
            // InternalXS.g:1813:1: (lv_var_3_0= ruleForVarDeclaration )
            // InternalXS.g:1814:3: lv_var_3_0= ruleForVarDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getVarForVarDeclarationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_5);
            lv_var_3_0=ruleForVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForStatementRule());
              	        }
                     		set(
                     			current, 
                     			"var",
                      		lv_var_3_0, 
                      		"aom.scripting.xs.XS.ForVarDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getForStatementAccess().getSemicolonKeyword_4());
                  
            }
            // InternalXS.g:1834:1: ( (lv_op_5_0= ruleRelOp ) )
            // InternalXS.g:1835:1: (lv_op_5_0= ruleRelOp )
            {
            // InternalXS.g:1835:1: (lv_op_5_0= ruleRelOp )
            // InternalXS.g:1836:3: lv_op_5_0= ruleRelOp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getOpRelOpParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_9);
            lv_op_5_0=ruleRelOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForStatementRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_5_0, 
                      		"aom.scripting.xs.XS.RelOp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalXS.g:1852:2: ( (lv_end_6_0= ruleExpression ) )
            // InternalXS.g:1853:1: (lv_end_6_0= ruleExpression )
            {
            // InternalXS.g:1853:1: (lv_end_6_0= ruleExpression )
            // InternalXS.g:1854:3: lv_end_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getEndExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_15);
            lv_end_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForStatementRule());
              	        }
                     		set(
                     			current, 
                     			"end",
                      		lv_end_6_0, 
                      		"aom.scripting.xs.XS.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_7());
                  
            }
            // InternalXS.g:1874:1: ( (lv_statement_8_0= ruleStatementOrBlock ) )
            // InternalXS.g:1875:1: (lv_statement_8_0= ruleStatementOrBlock )
            {
            // InternalXS.g:1875:1: (lv_statement_8_0= ruleStatementOrBlock )
            // InternalXS.g:1876:3: lv_statement_8_0= ruleStatementOrBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForStatementAccess().getStatementStatementOrBlockParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_statement_8_0=ruleStatementOrBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForStatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_8_0, 
                      		"aom.scripting.xs.XS.StatementOrBlock");
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
    // InternalXS.g:1900:1: entryRuleSwitchStatement returns [EObject current=null] : iv_ruleSwitchStatement= ruleSwitchStatement EOF ;
    public final EObject entryRuleSwitchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchStatement = null;


        try {
            // InternalXS.g:1901:2: (iv_ruleSwitchStatement= ruleSwitchStatement EOF )
            // InternalXS.g:1902:2: iv_ruleSwitchStatement= ruleSwitchStatement EOF
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
    // InternalXS.g:1909:1: ruleSwitchStatement returns [EObject current=null] : ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_cases_6_0= ruleSwitchCase ) )* ( (lv_default_7_0= ruleSwitchDefault ) )? otherlv_8= '}' ) ;
    public final EObject ruleSwitchStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_expression_3_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_7_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:1912:28: ( ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_cases_6_0= ruleSwitchCase ) )* ( (lv_default_7_0= ruleSwitchDefault ) )? otherlv_8= '}' ) )
            // InternalXS.g:1913:1: ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_cases_6_0= ruleSwitchCase ) )* ( (lv_default_7_0= ruleSwitchDefault ) )? otherlv_8= '}' )
            {
            // InternalXS.g:1913:1: ( () otherlv_1= 'switch' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_cases_6_0= ruleSwitchCase ) )* ( (lv_default_7_0= ruleSwitchDefault ) )? otherlv_8= '}' )
            // InternalXS.g:1913:2: () otherlv_1= 'switch' otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_cases_6_0= ruleSwitchCase ) )* ( (lv_default_7_0= ruleSwitchDefault ) )? otherlv_8= '}'
            {
            // InternalXS.g:1913:2: ()
            // InternalXS.g:1914:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSwitchStatementAccess().getSwitchStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchStatementAccess().getSwitchKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSwitchStatementAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalXS.g:1927:1: ( (lv_expression_3_0= ruleExpression ) )
            // InternalXS.g:1928:1: (lv_expression_3_0= ruleExpression )
            {
            // InternalXS.g:1928:1: (lv_expression_3_0= ruleExpression )
            // InternalXS.g:1929:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_15);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
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

            otherlv_4=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitchStatementAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSwitchStatementAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // InternalXS.g:1953:1: ( (lv_cases_6_0= ruleSwitchCase ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXS.g:1954:1: (lv_cases_6_0= ruleSwitchCase )
            	    {
            	    // InternalXS.g:1954:1: (lv_cases_6_0= ruleSwitchCase )
            	    // InternalXS.g:1955:3: lv_cases_6_0= ruleSwitchCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getCasesSwitchCaseParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_cases_6_0=ruleSwitchCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"aom.scripting.xs.XS.SwitchCase");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalXS.g:1971:3: ( (lv_default_7_0= ruleSwitchDefault ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXS.g:1972:1: (lv_default_7_0= ruleSwitchDefault )
                    {
                    // InternalXS.g:1972:1: (lv_default_7_0= ruleSwitchDefault )
                    // InternalXS.g:1973:3: lv_default_7_0= ruleSwitchDefault
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSwitchStatementAccess().getDefaultSwitchDefaultParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_27);
                    lv_default_7_0=ruleSwitchDefault();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSwitchStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_7_0, 
                              		"aom.scripting.xs.XS.SwitchDefault");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getSwitchStatementAccess().getRightCurlyBracketKeyword_8());
                  
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
    // InternalXS.g:2001:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // InternalXS.g:2002:2: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // InternalXS.g:2003:2: iv_ruleSwitchCase= ruleSwitchCase EOF
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
    // InternalXS.g:2010:1: ruleSwitchCase returns [EObject current=null] : ( () otherlv_1= 'case' ( ( (lv_value_2_0= ruleLiteralNumOrVar ) ) | (otherlv_3= '(' ( (lv_value_4_0= ruleLiteralNumOrVar ) ) otherlv_5= ')' ) ) otherlv_6= ':' ( (lv_statement_7_0= ruleStatementOrBlock ) ) ) ;
    public final EObject ruleSwitchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_statement_7_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2013:28: ( ( () otherlv_1= 'case' ( ( (lv_value_2_0= ruleLiteralNumOrVar ) ) | (otherlv_3= '(' ( (lv_value_4_0= ruleLiteralNumOrVar ) ) otherlv_5= ')' ) ) otherlv_6= ':' ( (lv_statement_7_0= ruleStatementOrBlock ) ) ) )
            // InternalXS.g:2014:1: ( () otherlv_1= 'case' ( ( (lv_value_2_0= ruleLiteralNumOrVar ) ) | (otherlv_3= '(' ( (lv_value_4_0= ruleLiteralNumOrVar ) ) otherlv_5= ')' ) ) otherlv_6= ':' ( (lv_statement_7_0= ruleStatementOrBlock ) ) )
            {
            // InternalXS.g:2014:1: ( () otherlv_1= 'case' ( ( (lv_value_2_0= ruleLiteralNumOrVar ) ) | (otherlv_3= '(' ( (lv_value_4_0= ruleLiteralNumOrVar ) ) otherlv_5= ')' ) ) otherlv_6= ':' ( (lv_statement_7_0= ruleStatementOrBlock ) ) )
            // InternalXS.g:2014:2: () otherlv_1= 'case' ( ( (lv_value_2_0= ruleLiteralNumOrVar ) ) | (otherlv_3= '(' ( (lv_value_4_0= ruleLiteralNumOrVar ) ) otherlv_5= ')' ) ) otherlv_6= ':' ( (lv_statement_7_0= ruleStatementOrBlock ) )
            {
            // InternalXS.g:2014:2: ()
            // InternalXS.g:2015:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSwitchCaseAccess().getSwitchCaseAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchCaseAccess().getCaseKeyword_1());
                  
            }
            // InternalXS.g:2024:1: ( ( (lv_value_2_0= ruleLiteralNumOrVar ) ) | (otherlv_3= '(' ( (lv_value_4_0= ruleLiteralNumOrVar ) ) otherlv_5= ')' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INT)||LA20_0==55||(LA20_0>=65 && LA20_0<=66)) ) {
                alt20=1;
            }
            else if ( (LA20_0==18) ) {
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
                    // InternalXS.g:2024:2: ( (lv_value_2_0= ruleLiteralNumOrVar ) )
                    {
                    // InternalXS.g:2024:2: ( (lv_value_2_0= ruleLiteralNumOrVar ) )
                    // InternalXS.g:2025:1: (lv_value_2_0= ruleLiteralNumOrVar )
                    {
                    // InternalXS.g:2025:1: (lv_value_2_0= ruleLiteralNumOrVar )
                    // InternalXS.g:2026:3: lv_value_2_0= ruleLiteralNumOrVar
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getValueLiteralNumOrVarParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_29);
                    lv_value_2_0=ruleLiteralNumOrVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"aom.scripting.xs.XS.LiteralNumOrVar");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXS.g:2043:6: (otherlv_3= '(' ( (lv_value_4_0= ruleLiteralNumOrVar ) ) otherlv_5= ')' )
                    {
                    // InternalXS.g:2043:6: (otherlv_3= '(' ( (lv_value_4_0= ruleLiteralNumOrVar ) ) otherlv_5= ')' )
                    // InternalXS.g:2043:8: otherlv_3= '(' ( (lv_value_4_0= ruleLiteralNumOrVar ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSwitchCaseAccess().getLeftParenthesisKeyword_2_1_0());
                          
                    }
                    // InternalXS.g:2047:1: ( (lv_value_4_0= ruleLiteralNumOrVar ) )
                    // InternalXS.g:2048:1: (lv_value_4_0= ruleLiteralNumOrVar )
                    {
                    // InternalXS.g:2048:1: (lv_value_4_0= ruleLiteralNumOrVar )
                    // InternalXS.g:2049:3: lv_value_4_0= ruleLiteralNumOrVar
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getValueLiteralNumOrVarParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_15);
                    lv_value_4_0=ruleLiteralNumOrVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"aom.scripting.xs.XS.LiteralNumOrVar");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSwitchCaseAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,39,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSwitchCaseAccess().getColonKeyword_3());
                  
            }
            // InternalXS.g:2073:1: ( (lv_statement_7_0= ruleStatementOrBlock ) )
            // InternalXS.g:2074:1: (lv_statement_7_0= ruleStatementOrBlock )
            {
            // InternalXS.g:2074:1: (lv_statement_7_0= ruleStatementOrBlock )
            // InternalXS.g:2075:3: lv_statement_7_0= ruleStatementOrBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getStatementStatementOrBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_statement_7_0=ruleStatementOrBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_7_0, 
                      		"aom.scripting.xs.XS.StatementOrBlock");
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
    // InternalXS.g:2099:1: entryRuleSwitchDefault returns [EObject current=null] : iv_ruleSwitchDefault= ruleSwitchDefault EOF ;
    public final EObject entryRuleSwitchDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchDefault = null;


        try {
            // InternalXS.g:2100:2: (iv_ruleSwitchDefault= ruleSwitchDefault EOF )
            // InternalXS.g:2101:2: iv_ruleSwitchDefault= ruleSwitchDefault EOF
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
    // InternalXS.g:2108:1: ruleSwitchDefault returns [EObject current=null] : ( () otherlv_1= 'default' otherlv_2= ':' ( (lv_statement_3_0= ruleStatementOrBlock ) ) ) ;
    public final EObject ruleSwitchDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_statement_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2111:28: ( ( () otherlv_1= 'default' otherlv_2= ':' ( (lv_statement_3_0= ruleStatementOrBlock ) ) ) )
            // InternalXS.g:2112:1: ( () otherlv_1= 'default' otherlv_2= ':' ( (lv_statement_3_0= ruleStatementOrBlock ) ) )
            {
            // InternalXS.g:2112:1: ( () otherlv_1= 'default' otherlv_2= ':' ( (lv_statement_3_0= ruleStatementOrBlock ) ) )
            // InternalXS.g:2112:2: () otherlv_1= 'default' otherlv_2= ':' ( (lv_statement_3_0= ruleStatementOrBlock ) )
            {
            // InternalXS.g:2112:2: ()
            // InternalXS.g:2113:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSwitchDefaultAccess().getSwitchDefaultAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchDefaultAccess().getDefaultKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,39,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSwitchDefaultAccess().getColonKeyword_2());
                  
            }
            // InternalXS.g:2126:1: ( (lv_statement_3_0= ruleStatementOrBlock ) )
            // InternalXS.g:2127:1: (lv_statement_3_0= ruleStatementOrBlock )
            {
            // InternalXS.g:2127:1: (lv_statement_3_0= ruleStatementOrBlock )
            // InternalXS.g:2128:3: lv_statement_3_0= ruleStatementOrBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchDefaultAccess().getStatementStatementOrBlockParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_statement_3_0=ruleStatementOrBlock();

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
                      		"aom.scripting.xs.XS.StatementOrBlock");
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
    // InternalXS.g:2152:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalXS.g:2153:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalXS.g:2154:2: iv_ruleReturnStatement= ruleReturnStatement EOF
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
    // InternalXS.g:2161:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2164:28: ( ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' ) )
            // InternalXS.g:2165:1: ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' )
            {
            // InternalXS.g:2165:1: ( () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';' )
            // InternalXS.g:2165:2: () otherlv_1= 'return' (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )? otherlv_5= ';'
            {
            // InternalXS.g:2165:2: ()
            // InternalXS.g:2166:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getReturnKeyword_1());
                  
            }
            // InternalXS.g:2175:1: (otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXS.g:2175:3: otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getReturnStatementAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalXS.g:2179:1: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalXS.g:2180:1: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalXS.g:2180:1: (lv_expression_3_0= ruleExpression )
                    // InternalXS.g:2181:3: lv_expression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_15);
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

                    otherlv_4=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReturnStatementAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:2213:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // InternalXS.g:2214:2: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // InternalXS.g:2215:2: iv_ruleContinueStatement= ruleContinueStatement EOF
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
    // InternalXS.g:2222:1: ruleContinueStatement returns [EObject current=null] : ( () otherlv_1= 'continue' otherlv_2= ';' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalXS.g:2225:28: ( ( () otherlv_1= 'continue' otherlv_2= ';' ) )
            // InternalXS.g:2226:1: ( () otherlv_1= 'continue' otherlv_2= ';' )
            {
            // InternalXS.g:2226:1: ( () otherlv_1= 'continue' otherlv_2= ';' )
            // InternalXS.g:2226:2: () otherlv_1= 'continue' otherlv_2= ';'
            {
            // InternalXS.g:2226:2: ()
            // InternalXS.g:2227:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContinueStatementAccess().getContinueStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContinueStatementAccess().getContinueKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:2248:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // InternalXS.g:2249:2: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // InternalXS.g:2250:2: iv_ruleBreakStatement= ruleBreakStatement EOF
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
    // InternalXS.g:2257:1: ruleBreakStatement returns [EObject current=null] : ( () otherlv_1= 'break' otherlv_2= ';' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalXS.g:2260:28: ( ( () otherlv_1= 'break' otherlv_2= ';' ) )
            // InternalXS.g:2261:1: ( () otherlv_1= 'break' otherlv_2= ';' )
            {
            // InternalXS.g:2261:1: ( () otherlv_1= 'break' otherlv_2= ';' )
            // InternalXS.g:2261:2: () otherlv_1= 'break' otherlv_2= ';'
            {
            // InternalXS.g:2261:2: ()
            // InternalXS.g:2262:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBreakStatementAccess().getBreakStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBreakStatementAccess().getBreakKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:2283:1: entryRulePostFixOp returns [String current=null] : iv_rulePostFixOp= rulePostFixOp EOF ;
    public final String entryRulePostFixOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePostFixOp = null;


        try {
            // InternalXS.g:2284:2: (iv_rulePostFixOp= rulePostFixOp EOF )
            // InternalXS.g:2285:2: iv_rulePostFixOp= rulePostFixOp EOF
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
    // InternalXS.g:2292:1: rulePostFixOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' ) ;
    public final AntlrDatatypeRuleToken rulePostFixOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXS.g:2295:28: ( (kw= '++' | kw= '--' ) )
            // InternalXS.g:2296:1: (kw= '++' | kw= '--' )
            {
            // InternalXS.g:2296:1: (kw= '++' | kw= '--' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            else if ( (LA22_0==45) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalXS.g:2297:2: kw= '++'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPostFixOpAccess().getPlusSignPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:2304:2: kw= '--'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:2317:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalXS.g:2318:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalXS.g:2319:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalXS.g:2326:1: ruleExpression returns [EObject current=null] : (this_Assign_0= ruleAssign | this_SimpleExpression_1= ruleSimpleExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assign_0 = null;

        EObject this_SimpleExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2329:28: ( (this_Assign_0= ruleAssign | this_SimpleExpression_1= ruleSimpleExpression ) )
            // InternalXS.g:2330:1: (this_Assign_0= ruleAssign | this_SimpleExpression_1= ruleSimpleExpression )
            {
            // InternalXS.g:2330:1: (this_Assign_0= ruleAssign | this_SimpleExpression_1= ruleSimpleExpression )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==14) ) {
                    alt23=1;
                }
                else if ( (LA23_1==EOF||LA23_1==13||LA23_1==18||(LA23_1>=20 && LA23_1<=21)||(LA23_1>=46 && LA23_1<=58)) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==RULE_STRING||LA23_0==RULE_INT||LA23_0==18||LA23_0==55||LA23_0==59||(LA23_0>=65 && LA23_0<=66)) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalXS.g:2331:5: this_Assign_0= ruleAssign
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getAssignParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Assign_0=ruleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assign_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:2341:5: this_SimpleExpression_1= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getSimpleExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_SimpleExpression_1=ruleSimpleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SimpleExpression_1; 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssign"
    // InternalXS.g:2357:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // InternalXS.g:2358:2: (iv_ruleAssign= ruleAssign EOF )
            // InternalXS.g:2359:2: iv_ruleAssign= ruleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssign=ruleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssign; 
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
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // InternalXS.g:2366:1: ruleAssign returns [EObject current=null] : ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_var_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2369:28: ( ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ) )
            // InternalXS.g:2370:1: ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
            {
            // InternalXS.g:2370:1: ( () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalXS.g:2370:2: () ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalXS.g:2370:2: ()
            // InternalXS.g:2371:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAssignAccess().getAssignAction_0(),
                          current);
                  
            }

            }

            // InternalXS.g:2376:2: ( ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalXS.g:2376:3: ( (lv_var_1_0= ruleVar ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
            {
            // InternalXS.g:2376:3: ( (lv_var_1_0= ruleVar ) )
            // InternalXS.g:2377:1: (lv_var_1_0= ruleVar )
            {
            // InternalXS.g:2377:1: (lv_var_1_0= ruleVar )
            // InternalXS.g:2378:3: lv_var_1_0= ruleVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignAccess().getVarVarParserRuleCall_1_0_0()); 
              	    
            }
            pushFollow(FOLLOW_8);
            lv_var_1_0=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignRule());
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

            otherlv_2=(Token)match(input,14,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssignAccess().getEqualsSignKeyword_1_1());
                  
            }
            // InternalXS.g:2398:1: ( (lv_expression_3_0= ruleExpression ) )
            // InternalXS.g:2399:1: (lv_expression_3_0= ruleExpression )
            {
            // InternalXS.g:2399:1: (lv_expression_3_0= ruleExpression )
            // InternalXS.g:2400:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignAccess().getExpressionExpressionParserRuleCall_1_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignRule());
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
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleSimpleExpression"
    // InternalXS.g:2424:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // InternalXS.g:2425:2: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // InternalXS.g:2426:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
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
    // InternalXS.g:2433:1: ruleSimpleExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2436:28: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalXS.g:2437:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalXS.g:2437:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalXS.g:2438:5: this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSimpleExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_32);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalXS.g:2446:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==46) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalXS.g:2446:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalXS.g:2446:2: ()
            	    // InternalXS.g:2447:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSimpleExpressionAccess().getOrExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalXS.g:2452:2: ( (lv_op_2_0= '||' ) )
            	    // InternalXS.g:2453:1: (lv_op_2_0= '||' )
            	    {
            	    // InternalXS.g:2453:1: (lv_op_2_0= '||' )
            	    // InternalXS.g:2454:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,46,FOLLOW_9); if (state.failed) return current;
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

            	    // InternalXS.g:2467:2: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalXS.g:2468:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalXS.g:2468:1: (lv_right_3_0= ruleAndExpression )
            	    // InternalXS.g:2469:3: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_32);
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
            	    break loop24;
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
    // InternalXS.g:2493:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalXS.g:2494:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalXS.g:2495:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalXS.g:2502:1: ruleAndExpression returns [EObject current=null] : (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_EqualsExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2505:28: ( (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* ) )
            // InternalXS.g:2506:1: (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* )
            {
            // InternalXS.g:2506:1: (this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )* )
            // InternalXS.g:2507:5: this_EqualsExpression_0= ruleEqualsExpression ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualsExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_33);
            this_EqualsExpression_0=ruleEqualsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EqualsExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalXS.g:2515:1: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==47) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalXS.g:2515:2: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEqualsExpression ) )
            	    {
            	    // InternalXS.g:2515:2: ()
            	    // InternalXS.g:2516:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalXS.g:2521:2: ( (lv_op_2_0= '&&' ) )
            	    // InternalXS.g:2522:1: (lv_op_2_0= '&&' )
            	    {
            	    // InternalXS.g:2522:1: (lv_op_2_0= '&&' )
            	    // InternalXS.g:2523:3: lv_op_2_0= '&&'
            	    {
            	    lv_op_2_0=(Token)match(input,47,FOLLOW_9); if (state.failed) return current;
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

            	    // InternalXS.g:2536:2: ( (lv_right_3_0= ruleEqualsExpression ) )
            	    // InternalXS.g:2537:1: (lv_right_3_0= ruleEqualsExpression )
            	    {
            	    // InternalXS.g:2537:1: (lv_right_3_0= ruleEqualsExpression )
            	    // InternalXS.g:2538:3: lv_right_3_0= ruleEqualsExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualsExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_33);
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
            	    break loop25;
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
    // InternalXS.g:2562:1: entryRuleEqualsExpression returns [EObject current=null] : iv_ruleEqualsExpression= ruleEqualsExpression EOF ;
    public final EObject entryRuleEqualsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsExpression = null;


        try {
            // InternalXS.g:2563:2: (iv_ruleEqualsExpression= ruleEqualsExpression EOF )
            // InternalXS.g:2564:2: iv_ruleEqualsExpression= ruleEqualsExpression EOF
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
    // InternalXS.g:2571:1: ruleEqualsExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? ) ;
    public final EObject ruleEqualsExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2574:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? ) )
            // InternalXS.g:2575:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? )
            {
            // InternalXS.g:2575:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )? )
            // InternalXS.g:2576:5: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEqualsExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_34);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparisonExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalXS.g:2584:1: ( () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=48 && LA26_0<=49)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXS.g:2584:2: () ( (lv_op_2_0= ruleEqOp ) ) ( (lv_right_3_0= ruleComparisonExpression ) )
                    {
                    // InternalXS.g:2584:2: ()
                    // InternalXS.g:2585:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEqualsExpressionAccess().getEqualsExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalXS.g:2590:2: ( (lv_op_2_0= ruleEqOp ) )
                    // InternalXS.g:2591:1: (lv_op_2_0= ruleEqOp )
                    {
                    // InternalXS.g:2591:1: (lv_op_2_0= ruleEqOp )
                    // InternalXS.g:2592:3: lv_op_2_0= ruleEqOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualsExpressionAccess().getOpEqOpParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_9);
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

                    // InternalXS.g:2608:2: ( (lv_right_3_0= ruleComparisonExpression ) )
                    // InternalXS.g:2609:1: (lv_right_3_0= ruleComparisonExpression )
                    {
                    // InternalXS.g:2609:1: (lv_right_3_0= ruleComparisonExpression )
                    // InternalXS.g:2610:3: lv_right_3_0= ruleComparisonExpression
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
    // InternalXS.g:2634:1: entryRuleEqOp returns [String current=null] : iv_ruleEqOp= ruleEqOp EOF ;
    public final String entryRuleEqOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqOp = null;


        try {
            // InternalXS.g:2635:2: (iv_ruleEqOp= ruleEqOp EOF )
            // InternalXS.g:2636:2: iv_ruleEqOp= ruleEqOp EOF
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
    // InternalXS.g:2643:1: ruleEqOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXS.g:2646:28: ( (kw= '==' | kw= '!=' ) )
            // InternalXS.g:2647:1: (kw= '==' | kw= '!=' )
            {
            // InternalXS.g:2647:1: (kw= '==' | kw= '!=' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==48) ) {
                alt27=1;
            }
            else if ( (LA27_0==49) ) {
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
                    // InternalXS.g:2648:2: kw= '=='
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqOpAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:2655:2: kw= '!='
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:2668:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalXS.g:2669:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalXS.g:2670:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
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
    // InternalXS.g:2677:1: ruleComparisonExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2680:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) )
            // InternalXS.g:2681:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            {
            // InternalXS.g:2681:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            // InternalXS.g:2682:5: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_35);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalXS.g:2690:1: ( () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=50 && LA28_0<=53)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXS.g:2690:2: () ( (lv_op_2_0= ruleRelOp ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
                    {
                    // InternalXS.g:2690:2: ()
                    // InternalXS.g:2691:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalXS.g:2696:2: ( (lv_op_2_0= ruleRelOp ) )
                    // InternalXS.g:2697:1: (lv_op_2_0= ruleRelOp )
                    {
                    // InternalXS.g:2697:1: (lv_op_2_0= ruleRelOp )
                    // InternalXS.g:2698:3: lv_op_2_0= ruleRelOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOpRelOpParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_9);
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

                    // InternalXS.g:2714:2: ( (lv_right_3_0= ruleAdditiveExpression ) )
                    // InternalXS.g:2715:1: (lv_right_3_0= ruleAdditiveExpression )
                    {
                    // InternalXS.g:2715:1: (lv_right_3_0= ruleAdditiveExpression )
                    // InternalXS.g:2716:3: lv_right_3_0= ruleAdditiveExpression
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
    // InternalXS.g:2740:1: entryRuleRelOp returns [String current=null] : iv_ruleRelOp= ruleRelOp EOF ;
    public final String entryRuleRelOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelOp = null;


        try {
            // InternalXS.g:2741:2: (iv_ruleRelOp= ruleRelOp EOF )
            // InternalXS.g:2742:2: iv_ruleRelOp= ruleRelOp EOF
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
    // InternalXS.g:2749:1: ruleRelOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXS.g:2752:28: ( (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' ) )
            // InternalXS.g:2753:1: (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' )
            {
            // InternalXS.g:2753:1: (kw= '<=' | kw= '<' | kw= '>' | kw= '>=' )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt29=1;
                }
                break;
            case 51:
                {
                alt29=2;
                }
                break;
            case 52:
                {
                alt29=3;
                }
                break;
            case 53:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalXS.g:2754:2: kw= '<='
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:2761:2: kw= '<'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpAccess().getLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalXS.g:2768:2: kw= '>'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelOpAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalXS.g:2775:2: kw= '>='
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:2788:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalXS.g:2789:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalXS.g:2790:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalXS.g:2797:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2800:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalXS.g:2801:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalXS.g:2801:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalXS.g:2802:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_36);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalXS.g:2810:1: ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=54 && LA30_0<=55)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalXS.g:2810:2: () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalXS.g:2810:2: ()
            	    // InternalXS.g:2811:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getTermLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalXS.g:2816:2: ( (lv_op_2_0= ruleAddOp ) )
            	    // InternalXS.g:2817:1: (lv_op_2_0= ruleAddOp )
            	    {
            	    // InternalXS.g:2817:1: (lv_op_2_0= ruleAddOp )
            	    // InternalXS.g:2818:3: lv_op_2_0= ruleAddOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpAddOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_9);
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

            	    // InternalXS.g:2834:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalXS.g:2835:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalXS.g:2835:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalXS.g:2836:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    break loop30;
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
    // InternalXS.g:2860:1: entryRuleAddOp returns [String current=null] : iv_ruleAddOp= ruleAddOp EOF ;
    public final String entryRuleAddOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddOp = null;


        try {
            // InternalXS.g:2861:2: (iv_ruleAddOp= ruleAddOp EOF )
            // InternalXS.g:2862:2: iv_ruleAddOp= ruleAddOp EOF
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
    // InternalXS.g:2869:1: ruleAddOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAddOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXS.g:2872:28: ( (kw= '+' | kw= '-' ) )
            // InternalXS.g:2873:1: (kw= '+' | kw= '-' )
            {
            // InternalXS.g:2873:1: (kw= '+' | kw= '-' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==54) ) {
                alt31=1;
            }
            else if ( (LA31_0==55) ) {
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
                    // InternalXS.g:2874:2: kw= '+'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAddOpAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:2881:2: kw= '-'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:2894:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalXS.g:2895:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalXS.g:2896:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalXS.g:2903:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:2906:28: ( (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* ) )
            // InternalXS.g:2907:1: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            {
            // InternalXS.g:2907:1: (this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )* )
            // InternalXS.g:2908:5: this_Atom_0= ruleAtom ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getAtomParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_37);
            this_Atom_0=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Atom_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalXS.g:2916:1: ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=56 && LA32_0<=58)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalXS.g:2916:2: () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= ruleAtom ) )
            	    {
            	    // InternalXS.g:2916:2: ()
            	    // InternalXS.g:2917:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getFactorLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalXS.g:2922:2: ( (lv_op_2_0= ruleMulOp ) )
            	    // InternalXS.g:2923:1: (lv_op_2_0= ruleMulOp )
            	    {
            	    // InternalXS.g:2923:1: (lv_op_2_0= ruleMulOp )
            	    // InternalXS.g:2924:3: lv_op_2_0= ruleMulOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpMulOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_9);
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

            	    // InternalXS.g:2940:2: ( (lv_right_3_0= ruleAtom ) )
            	    // InternalXS.g:2941:1: (lv_right_3_0= ruleAtom )
            	    {
            	    // InternalXS.g:2941:1: (lv_right_3_0= ruleAtom )
            	    // InternalXS.g:2942:3: lv_right_3_0= ruleAtom
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightAtomParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_37);
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
            	    break loop32;
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
    // InternalXS.g:2966:1: entryRuleMulOp returns [String current=null] : iv_ruleMulOp= ruleMulOp EOF ;
    public final String entryRuleMulOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMulOp = null;


        try {
            // InternalXS.g:2967:2: (iv_ruleMulOp= ruleMulOp EOF )
            // InternalXS.g:2968:2: iv_ruleMulOp= ruleMulOp EOF
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
    // InternalXS.g:2975:1: ruleMulOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMulOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXS.g:2978:28: ( (kw= '*' | kw= '/' | kw= '%' ) )
            // InternalXS.g:2979:1: (kw= '*' | kw= '/' | kw= '%' )
            {
            // InternalXS.g:2979:1: (kw= '*' | kw= '/' | kw= '%' )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt33=1;
                }
                break;
            case 57:
                {
                alt33=2;
                }
                break;
            case 58:
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
                    // InternalXS.g:2980:2: kw= '*'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMulOpAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:2987:2: kw= '/'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMulOpAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalXS.g:2994:2: kw= '%'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3007:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalXS.g:3008:2: (iv_ruleAtom= ruleAtom EOF )
            // InternalXS.g:3009:2: iv_ruleAtom= ruleAtom EOF
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
    // InternalXS.g:3016:1: ruleAtom returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Call_3= ruleCall | this_Literal_4= ruleLiteral | this_Var_5= ruleVar ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_Call_3 = null;

        EObject this_Literal_4 = null;

        EObject this_Var_5 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:3019:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Call_3= ruleCall | this_Literal_4= ruleLiteral | this_Var_5= ruleVar ) )
            // InternalXS.g:3020:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Call_3= ruleCall | this_Literal_4= ruleLiteral | this_Var_5= ruleVar )
            {
            // InternalXS.g:3020:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Call_3= ruleCall | this_Literal_4= ruleLiteral | this_Var_5= ruleVar )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt34=1;
                }
                break;
            case RULE_ID:
                {
                int LA34_2 = input.LA(2);

                if ( (LA34_2==EOF||LA34_2==13||(LA34_2>=20 && LA34_2<=21)||(LA34_2>=46 && LA34_2<=58)) ) {
                    alt34=4;
                }
                else if ( (LA34_2==18) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 55:
            case 59:
            case 65:
            case 66:
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
                    // InternalXS.g:3020:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalXS.g:3020:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalXS.g:3020:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_15);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalXS.g:3039:5: this_Call_3= ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Call_3=ruleCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Call_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalXS.g:3049:5: this_Literal_4= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_4=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalXS.g:3059:5: this_Var_5= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getVarParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Var_5=ruleVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Var_5; 
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


    // $ANTLR start "entryRuleCall"
    // InternalXS.g:3075:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalXS.g:3076:2: (iv_ruleCall= ruleCall EOF )
            // InternalXS.g:3077:2: iv_ruleCall= ruleCall EOF
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
    // InternalXS.g:3084:1: ruleCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:3087:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) )
            // InternalXS.g:3088:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            {
            // InternalXS.g:3088:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            // InternalXS.g:3088:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
            {
            // InternalXS.g:3088:2: ()
            // InternalXS.g:3089:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCallAccess().getCallAction_0(),
                          current);
                  
            }

            }

            // InternalXS.g:3094:2: ( (otherlv_1= RULE_ID ) )
            // InternalXS.g:3095:1: (otherlv_1= RULE_ID )
            {
            // InternalXS.g:3095:1: (otherlv_1= RULE_ID )
            // InternalXS.g:3096:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCallRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getCallAccess().getFunctionFunctionDeclarationCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCallAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalXS.g:3111:1: ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING||(LA36_0>=RULE_ID && LA36_0<=RULE_INT)||LA36_0==18||LA36_0==55||LA36_0==59||(LA36_0>=65 && LA36_0<=66)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXS.g:3111:2: ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
                    {
                    // InternalXS.g:3111:2: ( (lv_arguments_3_0= ruleExpression ) )
                    // InternalXS.g:3112:1: (lv_arguments_3_0= ruleExpression )
                    {
                    // InternalXS.g:3112:1: (lv_arguments_3_0= ruleExpression )
                    // InternalXS.g:3113:3: lv_arguments_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCallAccess().getArgumentsExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
                    lv_arguments_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_3_0, 
                              		"aom.scripting.xs.XS.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalXS.g:3129:2: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==20) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalXS.g:3129:4: otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getCallAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // InternalXS.g:3133:1: ( (lv_arguments_5_0= ruleExpression ) )
                    	    // InternalXS.g:3134:1: (lv_arguments_5_0= ruleExpression )
                    	    {
                    	    // InternalXS.g:3134:1: (lv_arguments_5_0= ruleExpression )
                    	    // InternalXS.g:3135:3: lv_arguments_5_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCallAccess().getArgumentsExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    lv_arguments_5_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_5_0, 
                    	              		"aom.scripting.xs.XS.Expression");
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
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCallAccess().getRightParenthesisKeyword_4());
                  
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


    // $ANTLR start "entryRuleVar"
    // InternalXS.g:3163:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalXS.g:3164:2: (iv_ruleVar= ruleVar EOF )
            // InternalXS.g:3165:2: iv_ruleVar= ruleVar EOF
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
    // InternalXS.g:3172:1: ruleVar returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3175:28: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalXS.g:3176:1: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalXS.g:3176:1: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalXS.g:3176:2: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalXS.g:3176:2: ()
            // InternalXS.g:3177:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVarAccess().getVarAction_0(),
                          current);
                  
            }

            }

            // InternalXS.g:3182:2: ( (otherlv_1= RULE_ID ) )
            // InternalXS.g:3183:1: (otherlv_1= RULE_ID )
            {
            // InternalXS.g:3183:1: (otherlv_1= RULE_ID )
            // InternalXS.g:3184:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVarRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getVarAccess().getDeclarationVarDeclarationCrossReference_1_0()); 
              	
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
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleLiteralOrVar"
    // InternalXS.g:3203:1: entryRuleLiteralOrVar returns [EObject current=null] : iv_ruleLiteralOrVar= ruleLiteralOrVar EOF ;
    public final EObject entryRuleLiteralOrVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralOrVar = null;


        try {
            // InternalXS.g:3204:2: (iv_ruleLiteralOrVar= ruleLiteralOrVar EOF )
            // InternalXS.g:3205:2: iv_ruleLiteralOrVar= ruleLiteralOrVar EOF
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
    // InternalXS.g:3212:1: ruleLiteralOrVar returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_Var_1= ruleVar ) ;
    public final EObject ruleLiteralOrVar() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_Var_1 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:3215:28: ( (this_Literal_0= ruleLiteral | this_Var_1= ruleVar ) )
            // InternalXS.g:3216:1: (this_Literal_0= ruleLiteral | this_Var_1= ruleVar )
            {
            // InternalXS.g:3216:1: (this_Literal_0= ruleLiteral | this_Var_1= ruleVar )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING||LA37_0==RULE_INT||LA37_0==55||LA37_0==59||(LA37_0>=65 && LA37_0<=66)) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalXS.g:3217:5: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralOrVarAccess().getLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:3227:5: this_Var_1= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralOrVarAccess().getVarParserRuleCall_1()); 
                          
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
    // $ANTLR end "ruleLiteralOrVar"


    // $ANTLR start "entryRuleLiteralNumOrVar"
    // InternalXS.g:3243:1: entryRuleLiteralNumOrVar returns [EObject current=null] : iv_ruleLiteralNumOrVar= ruleLiteralNumOrVar EOF ;
    public final EObject entryRuleLiteralNumOrVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNumOrVar = null;


        try {
            // InternalXS.g:3244:2: (iv_ruleLiteralNumOrVar= ruleLiteralNumOrVar EOF )
            // InternalXS.g:3245:2: iv_ruleLiteralNumOrVar= ruleLiteralNumOrVar EOF
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
    // InternalXS.g:3252:1: ruleLiteralNumOrVar returns [EObject current=null] : (this_LiteralNum_0= ruleLiteralNum | this_Var_1= ruleVar ) ;
    public final EObject ruleLiteralNumOrVar() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralNum_0 = null;

        EObject this_Var_1 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:3255:28: ( (this_LiteralNum_0= ruleLiteralNum | this_Var_1= ruleVar ) )
            // InternalXS.g:3256:1: (this_LiteralNum_0= ruleLiteralNum | this_Var_1= ruleVar )
            {
            // InternalXS.g:3256:1: (this_LiteralNum_0= ruleLiteralNum | this_Var_1= ruleVar )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT||LA38_0==55||(LA38_0>=65 && LA38_0<=66)) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalXS.g:3257:5: this_LiteralNum_0= ruleLiteralNum
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
                    // InternalXS.g:3267:5: this_Var_1= ruleVar
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


    // $ANTLR start "entryRuleLiteral"
    // InternalXS.g:3283:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalXS.g:3284:2: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalXS.g:3285:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalXS.g:3292:1: ruleLiteral returns [EObject current=null] : (this_LiteralNum_0= ruleLiteralNum | this_Vector_1= ruleVector | ( () ( (lv_value_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_3_0=null;
        EObject this_LiteralNum_0 = null;

        EObject this_Vector_1 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:3295:28: ( (this_LiteralNum_0= ruleLiteralNum | this_Vector_1= ruleVector | ( () ( (lv_value_3_0= RULE_STRING ) ) ) ) )
            // InternalXS.g:3296:1: (this_LiteralNum_0= ruleLiteralNum | this_Vector_1= ruleVector | ( () ( (lv_value_3_0= RULE_STRING ) ) ) )
            {
            // InternalXS.g:3296:1: (this_LiteralNum_0= ruleLiteralNum | this_Vector_1= ruleVector | ( () ( (lv_value_3_0= RULE_STRING ) ) ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 55:
            case 65:
            case 66:
                {
                alt39=1;
                }
                break;
            case 59:
                {
                alt39=2;
                }
                break;
            case RULE_STRING:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalXS.g:3297:5: this_LiteralNum_0= ruleLiteralNum
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
                    // InternalXS.g:3307:5: this_Vector_1= ruleVector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getVectorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Vector_1=ruleVector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Vector_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalXS.g:3316:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalXS.g:3316:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalXS.g:3316:7: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalXS.g:3316:7: ()
                    // InternalXS.g:3317:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getLiteralStringAction_2_0(),
                                  current);
                          
                    }

                    }

                    // InternalXS.g:3322:2: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalXS.g:3323:1: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalXS.g:3323:1: (lv_value_3_0= RULE_STRING )
                    // InternalXS.g:3324:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_3_0, grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
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
    // InternalXS.g:3348:1: entryRuleLiteralNum returns [EObject current=null] : iv_ruleLiteralNum= ruleLiteralNum EOF ;
    public final EObject entryRuleLiteralNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNum = null;


        try {
            // InternalXS.g:3349:2: (iv_ruleLiteralNum= ruleLiteralNum EOF )
            // InternalXS.g:3350:2: iv_ruleLiteralNum= ruleLiteralNum EOF
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
    // InternalXS.g:3357:1: ruleLiteralNum returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleSignedInt ) ) ) | ( () ( (lv_value_3_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_5_0= ruleBool ) ) ) ) ;
    public final EObject ruleLiteralNum() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:3360:28: ( ( ( () ( (lv_value_1_0= ruleSignedInt ) ) ) | ( () ( (lv_value_3_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_5_0= ruleBool ) ) ) ) )
            // InternalXS.g:3361:1: ( ( () ( (lv_value_1_0= ruleSignedInt ) ) ) | ( () ( (lv_value_3_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_5_0= ruleBool ) ) ) )
            {
            // InternalXS.g:3361:1: ( ( () ( (lv_value_1_0= ruleSignedInt ) ) ) | ( () ( (lv_value_3_0= ruleSignedFloat ) ) ) | ( () ( (lv_value_5_0= ruleBool ) ) ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==RULE_INT) ) {
                    int LA40_2 = input.LA(3);

                    if ( (LA40_2==64) ) {
                        alt40=2;
                    }
                    else if ( (LA40_2==EOF||LA40_2==13||(LA40_2>=20 && LA40_2<=21)||LA40_2==39||(LA40_2>=46 && LA40_2<=58)) ) {
                        alt40=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==64) ) {
                    alt40=2;
                }
                else if ( (LA40_2==EOF||LA40_2==13||(LA40_2>=20 && LA40_2<=21)||LA40_2==39||(LA40_2>=46 && LA40_2<=58)) ) {
                    alt40=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
                }
                break;
            case 65:
            case 66:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalXS.g:3361:2: ( () ( (lv_value_1_0= ruleSignedInt ) ) )
                    {
                    // InternalXS.g:3361:2: ( () ( (lv_value_1_0= ruleSignedInt ) ) )
                    // InternalXS.g:3361:3: () ( (lv_value_1_0= ruleSignedInt ) )
                    {
                    // InternalXS.g:3361:3: ()
                    // InternalXS.g:3362:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralNumAccess().getLiteralIntAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalXS.g:3367:2: ( (lv_value_1_0= ruleSignedInt ) )
                    // InternalXS.g:3368:1: (lv_value_1_0= ruleSignedInt )
                    {
                    // InternalXS.g:3368:1: (lv_value_1_0= ruleSignedInt )
                    // InternalXS.g:3369:3: lv_value_1_0= ruleSignedInt
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
                    // InternalXS.g:3386:6: ( () ( (lv_value_3_0= ruleSignedFloat ) ) )
                    {
                    // InternalXS.g:3386:6: ( () ( (lv_value_3_0= ruleSignedFloat ) ) )
                    // InternalXS.g:3386:7: () ( (lv_value_3_0= ruleSignedFloat ) )
                    {
                    // InternalXS.g:3386:7: ()
                    // InternalXS.g:3387:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralNumAccess().getLiteralFloatAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalXS.g:3392:2: ( (lv_value_3_0= ruleSignedFloat ) )
                    // InternalXS.g:3393:1: (lv_value_3_0= ruleSignedFloat )
                    {
                    // InternalXS.g:3393:1: (lv_value_3_0= ruleSignedFloat )
                    // InternalXS.g:3394:3: lv_value_3_0= ruleSignedFloat
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
                    // InternalXS.g:3411:6: ( () ( (lv_value_5_0= ruleBool ) ) )
                    {
                    // InternalXS.g:3411:6: ( () ( (lv_value_5_0= ruleBool ) ) )
                    // InternalXS.g:3411:7: () ( (lv_value_5_0= ruleBool ) )
                    {
                    // InternalXS.g:3411:7: ()
                    // InternalXS.g:3412:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralNumAccess().getLiteralBoolAction_2_0(),
                                  current);
                          
                    }

                    }

                    // InternalXS.g:3417:2: ( (lv_value_5_0= ruleBool ) )
                    // InternalXS.g:3418:1: (lv_value_5_0= ruleBool )
                    {
                    // InternalXS.g:3418:1: (lv_value_5_0= ruleBool )
                    // InternalXS.g:3419:3: lv_value_5_0= ruleBool
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


    // $ANTLR start "entryRuleVector"
    // InternalXS.g:3443:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // InternalXS.g:3444:2: (iv_ruleVector= ruleVector EOF )
            // InternalXS.g:3445:2: iv_ruleVector= ruleVector EOF
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
    // InternalXS.g:3452:1: ruleVector returns [EObject current=null] : ( () otherlv_1= 'vector' otherlv_2= '(' ( (lv_x_3_0= ruleLiteralNumOrVar ) ) otherlv_4= ',' ( (lv_y_5_0= ruleLiteralNumOrVar ) ) otherlv_6= ',' ( (lv_z_7_0= ruleLiteralNumOrVar ) ) otherlv_8= ')' ) ;
    public final EObject ruleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_x_3_0 = null;

        EObject lv_y_5_0 = null;

        EObject lv_z_7_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:3455:28: ( ( () otherlv_1= 'vector' otherlv_2= '(' ( (lv_x_3_0= ruleLiteralNumOrVar ) ) otherlv_4= ',' ( (lv_y_5_0= ruleLiteralNumOrVar ) ) otherlv_6= ',' ( (lv_z_7_0= ruleLiteralNumOrVar ) ) otherlv_8= ')' ) )
            // InternalXS.g:3456:1: ( () otherlv_1= 'vector' otherlv_2= '(' ( (lv_x_3_0= ruleLiteralNumOrVar ) ) otherlv_4= ',' ( (lv_y_5_0= ruleLiteralNumOrVar ) ) otherlv_6= ',' ( (lv_z_7_0= ruleLiteralNumOrVar ) ) otherlv_8= ')' )
            {
            // InternalXS.g:3456:1: ( () otherlv_1= 'vector' otherlv_2= '(' ( (lv_x_3_0= ruleLiteralNumOrVar ) ) otherlv_4= ',' ( (lv_y_5_0= ruleLiteralNumOrVar ) ) otherlv_6= ',' ( (lv_z_7_0= ruleLiteralNumOrVar ) ) otherlv_8= ')' )
            // InternalXS.g:3456:2: () otherlv_1= 'vector' otherlv_2= '(' ( (lv_x_3_0= ruleLiteralNumOrVar ) ) otherlv_4= ',' ( (lv_y_5_0= ruleLiteralNumOrVar ) ) otherlv_6= ',' ( (lv_z_7_0= ruleLiteralNumOrVar ) ) otherlv_8= ')'
            {
            // InternalXS.g:3456:2: ()
            // InternalXS.g:3457:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVectorAccess().getVectorLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVectorAccess().getVectorKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getVectorAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalXS.g:3470:1: ( (lv_x_3_0= ruleLiteralNumOrVar ) )
            // InternalXS.g:3471:1: (lv_x_3_0= ruleLiteralNumOrVar )
            {
            // InternalXS.g:3471:1: (lv_x_3_0= ruleLiteralNumOrVar )
            // InternalXS.g:3472:3: lv_x_3_0= ruleLiteralNumOrVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVectorAccess().getXLiteralNumOrVarParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_39);
            lv_x_3_0=ruleLiteralNumOrVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVectorRule());
              	        }
                     		set(
                     			current, 
                     			"x",
                      		lv_x_3_0, 
                      		"aom.scripting.xs.XS.LiteralNumOrVar");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getCommaKeyword_4());
                  
            }
            // InternalXS.g:3492:1: ( (lv_y_5_0= ruleLiteralNumOrVar ) )
            // InternalXS.g:3493:1: (lv_y_5_0= ruleLiteralNumOrVar )
            {
            // InternalXS.g:3493:1: (lv_y_5_0= ruleLiteralNumOrVar )
            // InternalXS.g:3494:3: lv_y_5_0= ruleLiteralNumOrVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVectorAccess().getYLiteralNumOrVarParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_39);
            lv_y_5_0=ruleLiteralNumOrVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVectorRule());
              	        }
                     		set(
                     			current, 
                     			"y",
                      		lv_y_5_0, 
                      		"aom.scripting.xs.XS.LiteralNumOrVar");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getVectorAccess().getCommaKeyword_6());
                  
            }
            // InternalXS.g:3514:1: ( (lv_z_7_0= ruleLiteralNumOrVar ) )
            // InternalXS.g:3515:1: (lv_z_7_0= ruleLiteralNumOrVar )
            {
            // InternalXS.g:3515:1: (lv_z_7_0= ruleLiteralNumOrVar )
            // InternalXS.g:3516:3: lv_z_7_0= ruleLiteralNumOrVar
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVectorAccess().getZLiteralNumOrVarParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_15);
            lv_z_7_0=ruleLiteralNumOrVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVectorRule());
              	        }
                     		set(
                     			current, 
                     			"z",
                      		lv_z_7_0, 
                      		"aom.scripting.xs.XS.LiteralNumOrVar");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getVectorAccess().getRightParenthesisKeyword_8());
                  
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


    // $ANTLR start "entryRuleIntType"
    // InternalXS.g:3544:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // InternalXS.g:3545:2: (iv_ruleIntType= ruleIntType EOF )
            // InternalXS.g:3546:2: iv_ruleIntType= ruleIntType EOF
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
    // InternalXS.g:3553:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3556:28: ( ( () otherlv_1= 'int' ) )
            // InternalXS.g:3557:1: ( () otherlv_1= 'int' )
            {
            // InternalXS.g:3557:1: ( () otherlv_1= 'int' )
            // InternalXS.g:3557:2: () otherlv_1= 'int'
            {
            // InternalXS.g:3557:2: ()
            // InternalXS.g:3558:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntTypeAccess().getIntTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3575:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // InternalXS.g:3576:2: (iv_ruleFloatType= ruleFloatType EOF )
            // InternalXS.g:3577:2: iv_ruleFloatType= ruleFloatType EOF
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
    // InternalXS.g:3584:1: ruleFloatType returns [EObject current=null] : ( () otherlv_1= 'float' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3587:28: ( ( () otherlv_1= 'float' ) )
            // InternalXS.g:3588:1: ( () otherlv_1= 'float' )
            {
            // InternalXS.g:3588:1: ( () otherlv_1= 'float' )
            // InternalXS.g:3588:2: () otherlv_1= 'float'
            {
            // InternalXS.g:3588:2: ()
            // InternalXS.g:3589:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFloatTypeAccess().getFloatTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3606:1: entryRuleBoolType returns [EObject current=null] : iv_ruleBoolType= ruleBoolType EOF ;
    public final EObject entryRuleBoolType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolType = null;


        try {
            // InternalXS.g:3607:2: (iv_ruleBoolType= ruleBoolType EOF )
            // InternalXS.g:3608:2: iv_ruleBoolType= ruleBoolType EOF
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
    // InternalXS.g:3615:1: ruleBoolType returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject ruleBoolType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3618:28: ( ( () otherlv_1= 'bool' ) )
            // InternalXS.g:3619:1: ( () otherlv_1= 'bool' )
            {
            // InternalXS.g:3619:1: ( () otherlv_1= 'bool' )
            // InternalXS.g:3619:2: () otherlv_1= 'bool'
            {
            // InternalXS.g:3619:2: ()
            // InternalXS.g:3620:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolTypeAccess().getBoolTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3637:1: entryRuleVectorType returns [EObject current=null] : iv_ruleVectorType= ruleVectorType EOF ;
    public final EObject entryRuleVectorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorType = null;


        try {
            // InternalXS.g:3638:2: (iv_ruleVectorType= ruleVectorType EOF )
            // InternalXS.g:3639:2: iv_ruleVectorType= ruleVectorType EOF
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
    // InternalXS.g:3646:1: ruleVectorType returns [EObject current=null] : ( () otherlv_1= 'vector' ) ;
    public final EObject ruleVectorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3649:28: ( ( () otherlv_1= 'vector' ) )
            // InternalXS.g:3650:1: ( () otherlv_1= 'vector' )
            {
            // InternalXS.g:3650:1: ( () otherlv_1= 'vector' )
            // InternalXS.g:3650:2: () otherlv_1= 'vector'
            {
            // InternalXS.g:3650:2: ()
            // InternalXS.g:3651:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVectorTypeAccess().getVectorTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3668:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalXS.g:3669:2: (iv_ruleStringType= ruleStringType EOF )
            // InternalXS.g:3670:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalXS.g:3677:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3680:28: ( ( () otherlv_1= 'string' ) )
            // InternalXS.g:3681:1: ( () otherlv_1= 'string' )
            {
            // InternalXS.g:3681:1: ( () otherlv_1= 'string' )
            // InternalXS.g:3681:2: () otherlv_1= 'string'
            {
            // InternalXS.g:3681:2: ()
            // InternalXS.g:3682:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3699:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // InternalXS.g:3700:2: (iv_ruleVoidType= ruleVoidType EOF )
            // InternalXS.g:3701:2: iv_ruleVoidType= ruleVoidType EOF
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
    // InternalXS.g:3708:1: ruleVoidType returns [EObject current=null] : ( () otherlv_1= 'void' ) ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3711:28: ( ( () otherlv_1= 'void' ) )
            // InternalXS.g:3712:1: ( () otherlv_1= 'void' )
            {
            // InternalXS.g:3712:1: ( () otherlv_1= 'void' )
            // InternalXS.g:3712:2: () otherlv_1= 'void'
            {
            // InternalXS.g:3712:2: ()
            // InternalXS.g:3713:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVoidTypeAccess().getVoidTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3730:1: entryRuleSign returns [String current=null] : iv_ruleSign= ruleSign EOF ;
    public final String entryRuleSign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSign = null;


        try {
            // InternalXS.g:3731:2: (iv_ruleSign= ruleSign EOF )
            // InternalXS.g:3732:2: iv_ruleSign= ruleSign EOF
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
    // InternalXS.g:3739:1: ruleSign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleSign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3742:28: (kw= '-' )
            // InternalXS.g:3744:2: kw= '-'
            {
            kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
    // InternalXS.g:3757:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // InternalXS.g:3758:2: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalXS.g:3759:2: iv_ruleSignedInt= ruleSignedInt EOF
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
    // InternalXS.g:3766:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_Sign_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:3769:28: ( ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT ) )
            // InternalXS.g:3770:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT )
            {
            // InternalXS.g:3770:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT )
            // InternalXS.g:3770:2: (this_Sign_0= ruleSign )? this_INT_1= RULE_INT
            {
            // InternalXS.g:3770:2: (this_Sign_0= ruleSign )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==55) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXS.g:3771:5: this_Sign_0= ruleSign
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
    // InternalXS.g:3796:1: entryRuleSignedFloat returns [String current=null] : iv_ruleSignedFloat= ruleSignedFloat EOF ;
    public final String entryRuleSignedFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedFloat = null;


        try {
            // InternalXS.g:3797:2: (iv_ruleSignedFloat= ruleSignedFloat EOF )
            // InternalXS.g:3798:2: iv_ruleSignedFloat= ruleSignedFloat EOF
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
    // InternalXS.g:3805:1: ruleSignedFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;
        AntlrDatatypeRuleToken this_Sign_0 = null;


         enterRule(); 
            
        try {
            // InternalXS.g:3808:28: ( ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // InternalXS.g:3809:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // InternalXS.g:3809:1: ( (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalXS.g:3809:2: (this_Sign_0= ruleSign )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // InternalXS.g:3809:2: (this_Sign_0= ruleSign )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==55) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXS.g:3810:5: this_Sign_0= ruleSign
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

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getSignedFloatAccess().getINTTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,64,FOLLOW_20); if (state.failed) return current;
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
    // InternalXS.g:3848:1: entryRuleBool returns [String current=null] : iv_ruleBool= ruleBool EOF ;
    public final String entryRuleBool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBool = null;


        try {
            // InternalXS.g:3849:2: (iv_ruleBool= ruleBool EOF )
            // InternalXS.g:3850:2: iv_ruleBool= ruleBool EOF
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
    // InternalXS.g:3857:1: ruleBool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalXS.g:3860:28: ( (kw= 'true' | kw= 'false' ) )
            // InternalXS.g:3861:1: (kw= 'true' | kw= 'false' )
            {
            // InternalXS.g:3861:1: (kw= 'true' | kw= 'false' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==65) ) {
                alt43=1;
            }
            else if ( (LA43_0==66) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalXS.g:3862:2: kw= 'true'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBoolAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalXS.g:3869:2: kw= 'false'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalXS
    public final void synpred1_InternalXS_fragment() throws RecognitionException {   
        // InternalXS.g:1679:4: ( 'else' )
        // InternalXS.g:1679:6: 'else'
        {
        match(input,34,FOLLOW_2); if (state.failed) return ;

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
    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\5\1\uffff\5\6\4\uffff\1\16";
    static final String dfa_3s = "\1\77\1\uffff\5\6\4\uffff\1\22";
    static final String dfa_4s = "\1\uffff\1\1\5\uffff\1\2\1\3\1\4\1\5\1\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\11\6\uffff\1\10\2\uffff\2\1\1\7\1\uffff\1\7\2\uffff\1\12\44\uffff\1\5\1\2\1\3\1\4\1\6",
            "",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "",
            "",
            "",
            "",
            "\1\1\3\uffff\1\7"
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
            return "125:1: (this_GlobalVarDeclaration_0= ruleGlobalVarDeclaration | this_FunctionDeclaration_1= ruleFunctionDeclaration | this_IncludeDeclaration_2= ruleIncludeDeclaration | this_PseudoIncludeDeclaration_3= rulePseudoIncludeDeclaration | this_RuleDeclaration_4= ruleRuleDeclaration )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\6\1\16\11\uffff";
    static final String dfa_9s = "\1\53\1\55\11\uffff";
    static final String dfa_10s = "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\1\1\2";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\32\uffff\1\2\1\uffff\1\3\1\4\1\5\3\uffff\1\6\1\7\1\10",
            "\1\11\3\uffff\1\11\31\uffff\2\12",
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

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1405:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_PostfixStatement_1= rulePostfixStatement | this_IfElseStatement_2= ruleIfElseStatement | this_WhileStatement_3= ruleWhileStatement | this_ForStatement_4= ruleForStatement | this_SwitchStatement_5= ruleSwitchStatement | this_ReturnStatement_6= ruleReturnStatement | this_ContinueStatement_7= ruleContinueStatement | this_BreakStatement_8= ruleBreakStatement )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xF8000000004B9022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x08800000000400D0L,0x0000000000000006L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xF800000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x08800000000000D0L,0x0000000000000006L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xF8000000000B8000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0xF800000000298000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000007F800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000FF800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xF8000E3B00018040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xF8000E3A80018040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000014100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00800000000400C0L,0x0000000000000006L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00800000000000C0L,0x0000000000000006L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x003C000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x08800000002400D0L,0x0000000000000006L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});

}
