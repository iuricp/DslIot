package org.xtext.example.iotdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.iotdsl.services.IotDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIotDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'eventos'", "'end'", "'resetEventos'", "'comandos'", "'estado'", "'acoes'", "'{'", "'}'", "'=>'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalIotDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIotDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIotDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIotDsl.g"; }



     	private IotDslGrammarAccess grammarAccess;

        public InternalIotDslParser(TokenStream input, IotDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "IotDsl";
       	}

       	@Override
       	protected IotDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleIotDsl"
    // InternalIotDsl.g:64:1: entryRuleIotDsl returns [EObject current=null] : iv_ruleIotDsl= ruleIotDsl EOF ;
    public final EObject entryRuleIotDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIotDsl = null;


        try {
            // InternalIotDsl.g:64:47: (iv_ruleIotDsl= ruleIotDsl EOF )
            // InternalIotDsl.g:65:2: iv_ruleIotDsl= ruleIotDsl EOF
            {
             newCompositeNode(grammarAccess.getIotDslRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIotDsl=ruleIotDsl();

            state._fsp--;

             current =iv_ruleIotDsl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIotDsl"


    // $ANTLR start "ruleIotDsl"
    // InternalIotDsl.g:71:1: ruleIotDsl returns [EObject current=null] : ( () (otherlv_1= 'eventos' ( (lv_eventos_2_0= ruleEvento ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEventos' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'comandos' ( (lv_comandos_8_0= ruleComando ) )+ otherlv_9= 'end' )? ( (lv_estados_10_0= ruleEstado ) )* ) ;
    public final EObject ruleIotDsl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_eventos_2_0 = null;

        EObject lv_comandos_8_0 = null;

        EObject lv_estados_10_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:77:2: ( ( () (otherlv_1= 'eventos' ( (lv_eventos_2_0= ruleEvento ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEventos' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'comandos' ( (lv_comandos_8_0= ruleComando ) )+ otherlv_9= 'end' )? ( (lv_estados_10_0= ruleEstado ) )* ) )
            // InternalIotDsl.g:78:2: ( () (otherlv_1= 'eventos' ( (lv_eventos_2_0= ruleEvento ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEventos' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'comandos' ( (lv_comandos_8_0= ruleComando ) )+ otherlv_9= 'end' )? ( (lv_estados_10_0= ruleEstado ) )* )
            {
            // InternalIotDsl.g:78:2: ( () (otherlv_1= 'eventos' ( (lv_eventos_2_0= ruleEvento ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEventos' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'comandos' ( (lv_comandos_8_0= ruleComando ) )+ otherlv_9= 'end' )? ( (lv_estados_10_0= ruleEstado ) )* )
            // InternalIotDsl.g:79:3: () (otherlv_1= 'eventos' ( (lv_eventos_2_0= ruleEvento ) )+ otherlv_3= 'end' )? (otherlv_4= 'resetEventos' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )? (otherlv_7= 'comandos' ( (lv_comandos_8_0= ruleComando ) )+ otherlv_9= 'end' )? ( (lv_estados_10_0= ruleEstado ) )*
            {
            // InternalIotDsl.g:79:3: ()
            // InternalIotDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIotDslAccess().getIotDslAction_0(),
            					current);
            			

            }

            // InternalIotDsl.g:86:3: (otherlv_1= 'eventos' ( (lv_eventos_2_0= ruleEvento ) )+ otherlv_3= 'end' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalIotDsl.g:87:4: otherlv_1= 'eventos' ( (lv_eventos_2_0= ruleEvento ) )+ otherlv_3= 'end'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getIotDslAccess().getEventosKeyword_1_0());
                    			
                    // InternalIotDsl.g:91:4: ( (lv_eventos_2_0= ruleEvento ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalIotDsl.g:92:5: (lv_eventos_2_0= ruleEvento )
                    	    {
                    	    // InternalIotDsl.g:92:5: (lv_eventos_2_0= ruleEvento )
                    	    // InternalIotDsl.g:93:6: lv_eventos_2_0= ruleEvento
                    	    {

                    	    						newCompositeNode(grammarAccess.getIotDslAccess().getEventosEventoParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_eventos_2_0=ruleEvento();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIotDslRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"eventos",
                    	    							lv_eventos_2_0,
                    	    							"org.xtext.example.iotdsl.IotDsl.Evento");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getIotDslAccess().getEndKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalIotDsl.g:115:3: (otherlv_4= 'resetEventos' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalIotDsl.g:116:4: otherlv_4= 'resetEventos' ( (otherlv_5= RULE_ID ) )+ otherlv_6= 'end'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getIotDslAccess().getResetEventosKeyword_2_0());
                    			
                    // InternalIotDsl.g:120:4: ( (otherlv_5= RULE_ID ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalIotDsl.g:121:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalIotDsl.g:121:5: (otherlv_5= RULE_ID )
                    	    // InternalIotDsl.g:122:6: otherlv_5= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getIotDslRule());
                    	    						}
                    	    					
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_4); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getIotDslAccess().getResetEventosEventoCrossReference_2_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    otherlv_6=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getIotDslAccess().getEndKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalIotDsl.g:138:3: (otherlv_7= 'comandos' ( (lv_comandos_8_0= ruleComando ) )+ otherlv_9= 'end' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalIotDsl.g:139:4: otherlv_7= 'comandos' ( (lv_comandos_8_0= ruleComando ) )+ otherlv_9= 'end'
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getIotDslAccess().getComandosKeyword_3_0());
                    			
                    // InternalIotDsl.g:143:4: ( (lv_comandos_8_0= ruleComando ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalIotDsl.g:144:5: (lv_comandos_8_0= ruleComando )
                    	    {
                    	    // InternalIotDsl.g:144:5: (lv_comandos_8_0= ruleComando )
                    	    // InternalIotDsl.g:145:6: lv_comandos_8_0= ruleComando
                    	    {

                    	    						newCompositeNode(grammarAccess.getIotDslAccess().getComandosComandoParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_comandos_8_0=ruleComando();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIotDslRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"comandos",
                    	    							lv_comandos_8_0,
                    	    							"org.xtext.example.iotdsl.IotDsl.Comando");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    otherlv_9=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getIotDslAccess().getEndKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalIotDsl.g:167:3: ( (lv_estados_10_0= ruleEstado ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalIotDsl.g:168:4: (lv_estados_10_0= ruleEstado )
            	    {
            	    // InternalIotDsl.g:168:4: (lv_estados_10_0= ruleEstado )
            	    // InternalIotDsl.g:169:5: lv_estados_10_0= ruleEstado
            	    {

            	    					newCompositeNode(grammarAccess.getIotDslAccess().getEstadosEstadoParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_estados_10_0=ruleEstado();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIotDslRule());
            	    					}
            	    					add(
            	    						current,
            	    						"estados",
            	    						lv_estados_10_0,
            	    						"org.xtext.example.iotdsl.IotDsl.Estado");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIotDsl"


    // $ANTLR start "entryRuleEvento"
    // InternalIotDsl.g:190:1: entryRuleEvento returns [EObject current=null] : iv_ruleEvento= ruleEvento EOF ;
    public final EObject entryRuleEvento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvento = null;


        try {
            // InternalIotDsl.g:190:47: (iv_ruleEvento= ruleEvento EOF )
            // InternalIotDsl.g:191:2: iv_ruleEvento= ruleEvento EOF
            {
             newCompositeNode(grammarAccess.getEventoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvento=ruleEvento();

            state._fsp--;

             current =iv_ruleEvento; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvento"


    // $ANTLR start "ruleEvento"
    // InternalIotDsl.g:197:1: ruleEvento returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEvento() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIotDsl.g:203:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIotDsl.g:204:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIotDsl.g:204:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIotDsl.g:205:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIotDsl.g:205:3: (lv_name_0_0= RULE_ID )
            // InternalIotDsl.g:206:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEventoAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEventoRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvento"


    // $ANTLR start "entryRuleComando"
    // InternalIotDsl.g:225:1: entryRuleComando returns [EObject current=null] : iv_ruleComando= ruleComando EOF ;
    public final EObject entryRuleComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComando = null;


        try {
            // InternalIotDsl.g:225:48: (iv_ruleComando= ruleComando EOF )
            // InternalIotDsl.g:226:2: iv_ruleComando= ruleComando EOF
            {
             newCompositeNode(grammarAccess.getComandoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComando=ruleComando();

            state._fsp--;

             current =iv_ruleComando; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComando"


    // $ANTLR start "ruleComando"
    // InternalIotDsl.g:232:1: ruleComando returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleComando() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIotDsl.g:238:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIotDsl.g:239:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIotDsl.g:239:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIotDsl.g:240:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIotDsl.g:240:3: (lv_name_0_0= RULE_ID )
            // InternalIotDsl.g:241:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getComandoAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getComandoRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComando"


    // $ANTLR start "entryRuleEstado"
    // InternalIotDsl.g:260:1: entryRuleEstado returns [EObject current=null] : iv_ruleEstado= ruleEstado EOF ;
    public final EObject entryRuleEstado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstado = null;


        try {
            // InternalIotDsl.g:260:47: (iv_ruleEstado= ruleEstado EOF )
            // InternalIotDsl.g:261:2: iv_ruleEstado= ruleEstado EOF
            {
             newCompositeNode(grammarAccess.getEstadoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEstado=ruleEstado();

            state._fsp--;

             current =iv_ruleEstado; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEstado"


    // $ANTLR start "ruleEstado"
    // InternalIotDsl.g:267:1: ruleEstado returns [EObject current=null] : (otherlv_0= 'estado' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'acoes' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transacoes_6_0= ruleTransacao ) )* otherlv_7= 'end' ) ;
    public final EObject ruleEstado() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_transacoes_6_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:273:2: ( (otherlv_0= 'estado' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'acoes' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transacoes_6_0= ruleTransacao ) )* otherlv_7= 'end' ) )
            // InternalIotDsl.g:274:2: (otherlv_0= 'estado' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'acoes' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transacoes_6_0= ruleTransacao ) )* otherlv_7= 'end' )
            {
            // InternalIotDsl.g:274:2: (otherlv_0= 'estado' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'acoes' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transacoes_6_0= ruleTransacao ) )* otherlv_7= 'end' )
            // InternalIotDsl.g:275:3: otherlv_0= 'estado' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'acoes' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? ( (lv_transacoes_6_0= ruleTransacao ) )* otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEstadoAccess().getEstadoKeyword_0());
            		
            // InternalIotDsl.g:279:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotDsl.g:280:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotDsl.g:280:4: (lv_name_1_0= RULE_ID )
            // InternalIotDsl.g:281:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEstadoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEstadoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIotDsl.g:297:3: (otherlv_2= 'acoes' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalIotDsl.g:298:4: otherlv_2= 'acoes' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getEstadoAccess().getAcoesKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEstadoAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalIotDsl.g:306:4: ( (otherlv_4= RULE_ID ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalIotDsl.g:307:5: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalIotDsl.g:307:5: (otherlv_4= RULE_ID )
                    	    // InternalIotDsl.g:308:6: otherlv_4= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEstadoRule());
                    	    						}
                    	    					
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getEstadoAccess().getAcoesComandoCrossReference_2_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    otherlv_5=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getEstadoAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalIotDsl.g:324:3: ( (lv_transacoes_6_0= ruleTransacao ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIotDsl.g:325:4: (lv_transacoes_6_0= ruleTransacao )
            	    {
            	    // InternalIotDsl.g:325:4: (lv_transacoes_6_0= ruleTransacao )
            	    // InternalIotDsl.g:326:5: lv_transacoes_6_0= ruleTransacao
            	    {

            	    					newCompositeNode(grammarAccess.getEstadoAccess().getTransacoesTransacaoParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_transacoes_6_0=ruleTransacao();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEstadoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transacoes",
            	    						lv_transacoes_6_0,
            	    						"org.xtext.example.iotdsl.IotDsl.Transacao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEstadoAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEstado"


    // $ANTLR start "entryRuleTransacao"
    // InternalIotDsl.g:351:1: entryRuleTransacao returns [EObject current=null] : iv_ruleTransacao= ruleTransacao EOF ;
    public final EObject entryRuleTransacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransacao = null;


        try {
            // InternalIotDsl.g:351:50: (iv_ruleTransacao= ruleTransacao EOF )
            // InternalIotDsl.g:352:2: iv_ruleTransacao= ruleTransacao EOF
            {
             newCompositeNode(grammarAccess.getTransacaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransacao=ruleTransacao();

            state._fsp--;

             current =iv_ruleTransacao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransacao"


    // $ANTLR start "ruleTransacao"
    // InternalIotDsl.g:358:1: ruleTransacao returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransacao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalIotDsl.g:364:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalIotDsl.g:365:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalIotDsl.g:365:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // InternalIotDsl.g:366:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // InternalIotDsl.g:366:3: ( (otherlv_0= RULE_ID ) )
            // InternalIotDsl.g:367:4: (otherlv_0= RULE_ID )
            {
            // InternalIotDsl.g:367:4: (otherlv_0= RULE_ID )
            // InternalIotDsl.g:368:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransacaoRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getTransacaoAccess().getEventoEventoCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransacaoAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalIotDsl.g:383:3: ( (otherlv_2= RULE_ID ) )
            // InternalIotDsl.g:384:4: (otherlv_2= RULE_ID )
            {
            // InternalIotDsl.g:384:4: (otherlv_2= RULE_ID )
            // InternalIotDsl.g:385:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransacaoRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getTransacaoAccess().getEstadoEstadoCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransacao"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000011010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});

}