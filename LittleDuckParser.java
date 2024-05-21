// Generated from LittleDuck.g4 by ANTLR 4.13.1

	import interventions.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LittleDuckParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, ID=30, STRING=31, NEWLINE=32, 
		WHITESPACE=33, INT=34, FLOAT=35;
	public static final int
		RULE_programa = 0, RULE_dec_v = 1, RULE_dec_f = 2, RULE_vars = 3, RULE_vars1 = 4, 
		RULE_vars2 = 5, RULE_list_ids = 6, RULE_list_ids1 = 7, RULE_type = 8, 
		RULE_body = 9, RULE_body1 = 10, RULE_statement = 11, RULE_print = 12, 
		RULE_print1 = 13, RULE_print_opciones = 14, RULE_print2 = 15, RULE_cycle = 16, 
		RULE_condition = 17, RULE_else_if = 18, RULE_assign = 19, RULE_expresion = 20, 
		RULE_expresion1 = 21, RULE_signos = 22, RULE_exp = 23, RULE_exp1 = 24, 
		RULE_exp_signos = 25, RULE_termino = 26, RULE_termino1 = 27, RULE_term_signos = 28, 
		RULE_factor = 29, RULE_factor1 = 30, RULE_factor2 = 31, RULE_cte = 32, 
		RULE_funcs = 33, RULE_funcs1 = 34, RULE_funcs_var = 35, RULE_funcs2 = 36, 
		RULE_f_call = 37, RULE_f_call1 = 38, RULE_call_list = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "dec_v", "dec_f", "vars", "vars1", "vars2", "list_ids", "list_ids1", 
			"type", "body", "body1", "statement", "print", "print1", "print_opciones", 
			"print2", "cycle", "condition", "else_if", "assign", "expresion", "expresion1", 
			"signos", "exp", "exp1", "exp_signos", "termino", "termino1", "term_signos", 
			"factor", "factor1", "factor2", "cte", "funcs", "funcs1", "funcs_var", 
			"funcs2", "f_call", "f_call1", "call_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program '", "';'", "'main'", "'end'", "'var '", "':'", "','", 
			"'int'", "'float'", "'{'", "'}'", "'print('", "')'", "'do'", "'while'", 
			"'('", "'if('", "'else'", "'='", "'<'", "'>'", "'!='", "'+'", "'-'", 
			"'*'", "'/'", "'void '", "'['", "'];'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "STRING", "NEWLINE", "WHITESPACE", 
			"INT", "FLOAT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LittleDuck.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		public static Middleman m = new Middleman(); 

	public LittleDuckParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public Program p = new Program(m);
		public Token ID;
		public TerminalNode ID() { return getToken(LittleDuckParser.ID, 0); }
		public Dec_vContext dec_v() {
			return getRuleContext(Dec_vContext.class,0);
		}
		public Dec_fContext dec_f() {
			return getRuleContext(Dec_fContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__0);
			setState(81);
			((ProgramaContext)_localctx).ID = match(ID);
			((ProgramaContext)getInvokingContext(0)).p.setName((((ProgramaContext)_localctx).ID!=null?((ProgramaContext)_localctx).ID.getText():null));
			setState(83);
			match(T__1);
			setState(84);
			dec_v();
			setState(85);
			dec_f();
			setState(86);
			match(T__2);
			setState(87);
			body();
			setState(88);
			match(T__3);
			m.cuads.add(new Cuadruplo("End"));
			System.out.println(m.cuads);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_vContext extends ParserRuleContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public Dec_vContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterDec_v(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitDec_v(this);
		}
	}

	public final Dec_vContext dec_v() throws RecognitionException {
		Dec_vContext _localctx = new Dec_vContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec_v);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				vars();
				}
				break;
			case T__2:
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_fContext extends ParserRuleContext {
		public FuncsContext funcs() {
			return getRuleContext(FuncsContext.class,0);
		}
		public Dec_fContext dec_f() {
			return getRuleContext(Dec_fContext.class,0);
		}
		public Dec_fContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterDec_f(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitDec_f(this);
		}
	}

	public final Dec_fContext dec_f() throws RecognitionException {
		Dec_fContext _localctx = new Dec_fContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec_f);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				funcs();
				setState(97);
				dec_f();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarsContext extends ParserRuleContext {
		public ArrayList<String> l_vars = new ArrayList<String>();
		public Vars1Context vars1() {
			return getRuleContext(Vars1Context.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__4);
			setState(103);
			vars1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Vars1Context extends ParserRuleContext {
		public TypeContext type;
		public List_idsContext list_ids() {
			return getRuleContext(List_idsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Vars2Context vars2() {
			return getRuleContext(Vars2Context.class,0);
		}
		public Vars1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterVars1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitVars1(this);
		}
	}

	public final Vars1Context vars1() throws RecognitionException {
		Vars1Context _localctx = new Vars1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_vars1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			list_ids();
			setState(106);
			match(T__5);
			setState(107);
			((Vars1Context)_localctx).type = type();
			((ProgramaContext)getInvokingContext(0)).p.decVars(((VarsContext)getInvokingContext(3)).l_vars, (((Vars1Context)_localctx).type!=null?_input.getText(((Vars1Context)_localctx).type.start,((Vars1Context)_localctx).type.stop):null), _localctx.getStart().getLine());
			setState(109);
			match(T__1);
			setState(110);
			vars2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Vars2Context extends ParserRuleContext {
		public Vars1Context vars1() {
			return getRuleContext(Vars1Context.class,0);
		}
		public Vars2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterVars2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitVars2(this);
		}
	}

	public final Vars2Context vars2() throws RecognitionException {
		Vars2Context _localctx = new Vars2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_vars2);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				vars1();
				}
				break;
			case T__2:
			case T__9:
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_idsContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(LittleDuckParser.ID, 0); }
		public List_ids1Context list_ids1() {
			return getRuleContext(List_ids1Context.class,0);
		}
		public List_idsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterList_ids(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitList_ids(this);
		}
	}

	public final List_idsContext list_ids() throws RecognitionException {
		List_idsContext _localctx = new List_idsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list_ids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((List_idsContext)_localctx).ID = match(ID);
			((VarsContext)getInvokingContext(3)).l_vars.add((((List_idsContext)_localctx).ID!=null?((List_idsContext)_localctx).ID.getText():null));
			setState(118);
			list_ids1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_ids1Context extends ParserRuleContext {
		public List_idsContext list_ids() {
			return getRuleContext(List_idsContext.class,0);
		}
		public List_ids1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_ids1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterList_ids1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitList_ids1(this);
		}
	}

	public final List_ids1Context list_ids1() throws RecognitionException {
		List_ids1Context _localctx = new List_ids1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_list_ids1);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(T__6);
				setState(121);
				list_ids();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public Body1Context body1() {
			return getRuleContext(Body1Context.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__9);
			setState(128);
			body1();
			setState(129);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Body1Context extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Body1Context body1() {
			return getRuleContext(Body1Context.class,0);
		}
		public Body1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterBody1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitBody1(this);
		}
	}

	public final Body1Context body1() throws RecognitionException {
		Body1Context _localctx = new Body1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_body1);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__13:
			case T__16:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				statement();
				setState(132);
				body1();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CycleContext cycle() {
			return getRuleContext(CycleContext.class,0);
		}
		public F_callContext f_call() {
			return getRuleContext(F_callContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				cycle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				f_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				print();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public Print1Context print1() {
			return getRuleContext(Print1Context.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__11);
			setState(145);
			print1();
			setState(146);
			match(T__12);
			setState(147);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print1Context extends ParserRuleContext {
		public Print_opcionesContext print_opciones() {
			return getRuleContext(Print_opcionesContext.class,0);
		}
		public Print2Context print2() {
			return getRuleContext(Print2Context.class,0);
		}
		public Print1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterPrint1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitPrint1(this);
		}
	}

	public final Print1Context print1() throws RecognitionException {
		Print1Context _localctx = new Print1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_print1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			print_opciones();
			setState(150);
			print2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_opcionesContext extends ParserRuleContext {
		public Token STRING;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LittleDuckParser.STRING, 0); }
		public Print_opcionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_opciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterPrint_opciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitPrint_opciones(this);
		}
	}

	public final Print_opcionesContext print_opciones() throws RecognitionException {
		Print_opcionesContext _localctx = new Print_opcionesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_print_opciones);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__22:
			case T__23:
			case ID:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				expresion();
				((ProgramaContext)getInvokingContext(0)).p.pushPrintExpresion();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				((Print_opcionesContext)_localctx).STRING = match(STRING);
				((ProgramaContext)getInvokingContext(0)).p.pushPrintString((((Print_opcionesContext)_localctx).STRING!=null?((Print_opcionesContext)_localctx).STRING.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print2Context extends ParserRuleContext {
		public Print1Context print1() {
			return getRuleContext(Print1Context.class,0);
		}
		public Print2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterPrint2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitPrint2(this);
		}
	}

	public final Print2Context print2() throws RecognitionException {
		Print2Context _localctx = new Print2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_print2);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(T__6);
				setState(160);
				print1();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CycleContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitCycle(this);
		}
	}

	public final CycleContext cycle() throws RecognitionException {
		CycleContext _localctx = new CycleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__13);
			((ProgramaContext)getInvokingContext(0)).p.pushDo();
			setState(166);
			body();
			setState(167);
			match(T__14);
			setState(168);
			match(T__15);
			setState(169);
			expresion();
			setState(170);
			match(T__12);
			setState(171);
			match(T__1);
			((ProgramaContext)getInvokingContext(0)).p.popDo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Else_ifContext else_if() {
			return getRuleContext(Else_ifContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__16);
			setState(175);
			expresion();
			setState(176);
			match(T__12);
			((ProgramaContext)getInvokingContext(0)).p.pushIf();
			setState(178);
			body();
			setState(179);
			else_if();
			setState(180);
			match(T__1);
			((ProgramaContext)getInvokingContext(0)).p.endIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_ifContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterElse_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitElse_if(this);
		}
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_else_if);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(T__17);
				((ProgramaContext)getInvokingContext(0)).p.pushElse();
				setState(185);
				body();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(LittleDuckParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			((AssignContext)_localctx).ID = match(ID);
			setState(190);
			match(T__18);
			((ProgramaContext)getInvokingContext(0)).p.checkVarExists((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null), _localctx.getStart().getLine());((ProgramaContext)getInvokingContext(0)).p.pushAssign((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null));
			setState(192);
			expresion();
			((ProgramaContext)getInvokingContext(0)).p.popAssign();
			setState(194);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Expresion1Context expresion1() {
			return getRuleContext(Expresion1Context.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			exp();
			setState(197);
			expresion1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expresion1Context extends ParserRuleContext {
		public SignosContext signos;
		public SignosContext signos() {
			return getRuleContext(SignosContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Expresion1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterExpresion1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitExpresion1(this);
		}
	}

	public final Expresion1Context expresion1() throws RecognitionException {
		Expresion1Context _localctx = new Expresion1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_expresion1);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				((Expresion1Context)_localctx).signos = signos();
				((ProgramaContext)getInvokingContext(0)).p.pushOps((((Expresion1Context)_localctx).signos!=null?_input.getText(((Expresion1Context)_localctx).signos.start,((Expresion1Context)_localctx).signos.stop):null));
				setState(201);
				exp();
				((ProgramaContext)getInvokingContext(0)).p.pushRelational();
				}
				break;
			case T__1:
			case T__6:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignosContext extends ParserRuleContext {
		public SignosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterSignos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitSignos(this);
		}
	}

	public final SignosContext signos() throws RecognitionException {
		SignosContext _localctx = new SignosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_signos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			termino();
			((ProgramaContext)getInvokingContext(0)).p.pushAdd();
			setState(211);
			exp1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp1Context extends ParserRuleContext {
		public Exp_signosContext exp_signos;
		public Exp_signosContext exp_signos() {
			return getRuleContext(Exp_signosContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitExp1(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_exp1);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				((Exp1Context)_localctx).exp_signos = exp_signos();
				((ProgramaContext)getInvokingContext(0)).p.pushOps((((Exp1Context)_localctx).exp_signos!=null?_input.getText(((Exp1Context)_localctx).exp_signos.start,((Exp1Context)_localctx).exp_signos.stop):null));
				setState(215);
				exp();
				}
				break;
			case T__1:
			case T__6:
			case T__12:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_signosContext extends ParserRuleContext {
		public Exp_signosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_signos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterExp_signos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitExp_signos(this);
		}
	}

	public final Exp_signosContext exp_signos() throws RecognitionException {
		Exp_signosContext _localctx = new Exp_signosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exp_signos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Termino1Context termino1() {
			return getRuleContext(Termino1Context.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			factor();
			((ProgramaContext)getInvokingContext(0)).p.pushMult();
			setState(224);
			termino1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Termino1Context extends ParserRuleContext {
		public Term_signosContext term_signos;
		public Term_signosContext term_signos() {
			return getRuleContext(Term_signosContext.class,0);
		}
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Termino1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterTermino1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitTermino1(this);
		}
	}

	public final Termino1Context termino1() throws RecognitionException {
		Termino1Context _localctx = new Termino1Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_termino1);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				((Termino1Context)_localctx).term_signos = term_signos();
				((ProgramaContext)getInvokingContext(0)).p.pushOps((((Termino1Context)_localctx).term_signos!=null?_input.getText(((Termino1Context)_localctx).term_signos.start,((Termino1Context)_localctx).term_signos.stop):null));
				setState(228);
				termino();
				}
				break;
			case T__1:
			case T__6:
			case T__12:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Term_signosContext extends ParserRuleContext {
		public Term_signosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_signos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterTerm_signos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitTerm_signos(this);
		}
	}

	public final Term_signosContext term_signos() throws RecognitionException {
		Term_signosContext _localctx = new Term_signosContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_term_signos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public Factor1Context factor1;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Factor1Context factor1() {
			return getRuleContext(Factor1Context.class,0);
		}
		public Factor2Context factor2() {
			return getRuleContext(Factor2Context.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_factor);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(T__15);
				((ProgramaContext)getInvokingContext(0)).p.createFBottom();
				setState(237);
				expresion();
				setState(238);
				match(T__12);
				((ProgramaContext)getInvokingContext(0)).p.removeFBottom();
				}
				break;
			case T__22:
			case T__23:
			case ID:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				((FactorContext)_localctx).factor1 = factor1();
				((ProgramaContext)getInvokingContext(0)).p.pushNegative((((FactorContext)_localctx).factor1!=null?_input.getText(((FactorContext)_localctx).factor1.start,((FactorContext)_localctx).factor1.stop):null));
				setState(243);
				factor2();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Factor1Context extends ParserRuleContext {
		public Exp_signosContext exp_signos() {
			return getRuleContext(Exp_signosContext.class,0);
		}
		public Factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterFactor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitFactor1(this);
		}
	}

	public final Factor1Context factor1() throws RecognitionException {
		Factor1Context _localctx = new Factor1Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_factor1);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				exp_signos();
				}
				break;
			case ID:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Factor2Context extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(LittleDuckParser.ID, 0); }
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public Factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterFactor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitFactor2(this);
		}
	}

	public final Factor2Context factor2() throws RecognitionException {
		Factor2Context _localctx = new Factor2Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_factor2);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				((Factor2Context)_localctx).ID = match(ID);
				((ProgramaContext)getInvokingContext(0)).p.checkVarExists((((Factor2Context)_localctx).ID!=null?((Factor2Context)_localctx).ID.getText():null), _localctx.getStart().getLine());
				((ProgramaContext)getInvokingContext(0)).p.pushQVar((((Factor2Context)_localctx).ID!=null?((Factor2Context)_localctx).ID.getText():null));
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				cte();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CteContext extends ParserRuleContext {
		public Token INT;
		public Token FLOAT;
		public TerminalNode INT() { return getToken(LittleDuckParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LittleDuckParser.FLOAT, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterCte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitCte(this);
		}
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cte);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				((CteContext)_localctx).INT = match(INT);
				((ProgramaContext)getInvokingContext(0)).p.pushQConst((((CteContext)_localctx).INT!=null?((CteContext)_localctx).INT.getText():null), "Integer");
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				((CteContext)_localctx).FLOAT = match(FLOAT);
				((ProgramaContext)getInvokingContext(0)).p.pushQConst((((CteContext)_localctx).FLOAT!=null?((CteContext)_localctx).FLOAT.getText():null), "Float");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncsContext extends ParserRuleContext {
		public ArrayList<Variable> l_vars = new ArrayList<Variable>();
		public Token ID;
		public TerminalNode ID() { return getToken(LittleDuckParser.ID, 0); }
		public Funcs1Context funcs1() {
			return getRuleContext(Funcs1Context.class,0);
		}
		public Funcs2Context funcs2() {
			return getRuleContext(Funcs2Context.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterFuncs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitFuncs(this);
		}
	}

	public final FuncsContext funcs() throws RecognitionException {
		FuncsContext _localctx = new FuncsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_funcs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ProgramaContext)getInvokingContext(0)).p.setLocal(true);
			setState(264);
			match(T__26);
			setState(265);
			((FuncsContext)_localctx).ID = match(ID);
			((ProgramaContext)getInvokingContext(0)).p.addFunc((((FuncsContext)_localctx).ID!=null?((FuncsContext)_localctx).ID.getText():null), _localctx.getStart().getLine());
			setState(267);
			match(T__15);
			setState(268);
			funcs1();
			setState(269);
			match(T__12);
			setState(270);
			match(T__27);
			setState(271);
			funcs2();
			setState(272);
			body();
			setState(273);
			match(T__28);
			((ProgramaContext)getInvokingContext(0)).p.setLocal(false); ((ProgramaContext)getInvokingContext(0)).p.deleteFunc((((FuncsContext)_localctx).ID!=null?((FuncsContext)_localctx).ID.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Funcs1Context extends ParserRuleContext {
		public Token ID;
		public TypeContext type;
		public TerminalNode ID() { return getToken(LittleDuckParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Funcs_varContext funcs_var() {
			return getRuleContext(Funcs_varContext.class,0);
		}
		public Funcs1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterFuncs1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitFuncs1(this);
		}
	}

	public final Funcs1Context funcs1() throws RecognitionException {
		Funcs1Context _localctx = new Funcs1Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_funcs1);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				((Funcs1Context)_localctx).ID = match(ID);
				setState(277);
				match(T__5);
				setState(278);
				((Funcs1Context)_localctx).type = type();
				((ProgramaContext)getInvokingContext(0)).p.decVar((((Funcs1Context)_localctx).ID!=null?((Funcs1Context)_localctx).ID.getText():null), (((Funcs1Context)_localctx).type!=null?_input.getText(((Funcs1Context)_localctx).type.start,((Funcs1Context)_localctx).type.stop):null), _localctx.getStart().getLine());
				setState(280);
				funcs_var();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Funcs_varContext extends ParserRuleContext {
		public Funcs1Context funcs1() {
			return getRuleContext(Funcs1Context.class,0);
		}
		public Funcs_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterFuncs_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitFuncs_var(this);
		}
	}

	public final Funcs_varContext funcs_var() throws RecognitionException {
		Funcs_varContext _localctx = new Funcs_varContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_funcs_var);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(T__6);
				setState(286);
				funcs1();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Funcs2Context extends ParserRuleContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public Funcs2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterFuncs2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitFuncs2(this);
		}
	}

	public final Funcs2Context funcs2() throws RecognitionException {
		Funcs2Context _localctx = new Funcs2Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_funcs2);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				vars();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class F_callContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(LittleDuckParser.ID, 0); }
		public F_call1Context f_call1() {
			return getRuleContext(F_call1Context.class,0);
		}
		public F_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterF_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitF_call(this);
		}
	}

	public final F_callContext f_call() throws RecognitionException {
		F_callContext _localctx = new F_callContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_f_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			((F_callContext)_localctx).ID = match(ID);
			setState(295);
			match(T__15);
			((ProgramaContext)getInvokingContext(0)).p.checkFuncExists((((F_callContext)_localctx).ID!=null?((F_callContext)_localctx).ID.getText():null), _localctx.getStart().getLine());
			setState(297);
			f_call1();
			setState(298);
			match(T__12);
			setState(299);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class F_call1Context extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Call_listContext call_list() {
			return getRuleContext(Call_listContext.class,0);
		}
		public F_call1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_call1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterF_call1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitF_call1(this);
		}
	}

	public final F_call1Context f_call1() throws RecognitionException {
		F_call1Context _localctx = new F_call1Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_f_call1);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__22:
			case T__23:
			case ID:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				expresion();
				setState(302);
				call_list();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Call_listContext extends ParserRuleContext {
		public F_call1Context f_call1() {
			return getRuleContext(F_call1Context.class,0);
		}
		public Call_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).enterCall_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LittleDuckListener ) ((LittleDuckListener)listener).exitCall_list(this);
		}
	}

	public final Call_listContext call_list() throws RecognitionException {
		Call_listContext _localctx = new Call_listContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_call_list);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(T__6);
				setState(308);
				f_call1();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u0139\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u0001_\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002e\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005s\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007|\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0088\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008f\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u009e\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a3\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00bc\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00ce\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u00db\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u00e8\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u00f6\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u00fa\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u0100\b\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u0106\b"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0003\"\u011c\b\"\u0001#\u0001#\u0001#\u0003#\u0121\b#\u0001"+
		"$\u0001$\u0003$\u0125\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0003&\u0132\b&\u0001\'\u0001\'\u0001\'"+
		"\u0003\'\u0137\b\'\u0001\'\u0000\u0000(\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:"+
		"<>@BDFHJLN\u0000\u0004\u0001\u0000\b\t\u0001\u0000\u0014\u0016\u0001\u0000"+
		"\u0017\u0018\u0001\u0000\u0019\u001a\u0128\u0000P\u0001\u0000\u0000\u0000"+
		"\u0002^\u0001\u0000\u0000\u0000\u0004d\u0001\u0000\u0000\u0000\u0006f"+
		"\u0001\u0000\u0000\u0000\bi\u0001\u0000\u0000\u0000\nr\u0001\u0000\u0000"+
		"\u0000\ft\u0001\u0000\u0000\u0000\u000e{\u0001\u0000\u0000\u0000\u0010"+
		"}\u0001\u0000\u0000\u0000\u0012\u007f\u0001\u0000\u0000\u0000\u0014\u0087"+
		"\u0001\u0000\u0000\u0000\u0016\u008e\u0001\u0000\u0000\u0000\u0018\u0090"+
		"\u0001\u0000\u0000\u0000\u001a\u0095\u0001\u0000\u0000\u0000\u001c\u009d"+
		"\u0001\u0000\u0000\u0000\u001e\u00a2\u0001\u0000\u0000\u0000 \u00a4\u0001"+
		"\u0000\u0000\u0000\"\u00ae\u0001\u0000\u0000\u0000$\u00bb\u0001\u0000"+
		"\u0000\u0000&\u00bd\u0001\u0000\u0000\u0000(\u00c4\u0001\u0000\u0000\u0000"+
		"*\u00cd\u0001\u0000\u0000\u0000,\u00cf\u0001\u0000\u0000\u0000.\u00d1"+
		"\u0001\u0000\u0000\u00000\u00da\u0001\u0000\u0000\u00002\u00dc\u0001\u0000"+
		"\u0000\u00004\u00de\u0001\u0000\u0000\u00006\u00e7\u0001\u0000\u0000\u0000"+
		"8\u00e9\u0001\u0000\u0000\u0000:\u00f5\u0001\u0000\u0000\u0000<\u00f9"+
		"\u0001\u0000\u0000\u0000>\u00ff\u0001\u0000\u0000\u0000@\u0105\u0001\u0000"+
		"\u0000\u0000B\u0107\u0001\u0000\u0000\u0000D\u011b\u0001\u0000\u0000\u0000"+
		"F\u0120\u0001\u0000\u0000\u0000H\u0124\u0001\u0000\u0000\u0000J\u0126"+
		"\u0001\u0000\u0000\u0000L\u0131\u0001\u0000\u0000\u0000N\u0136\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u0001\u0000\u0000QR\u0005\u001e\u0000\u0000RS\u0006"+
		"\u0000\uffff\uffff\u0000ST\u0005\u0002\u0000\u0000TU\u0003\u0002\u0001"+
		"\u0000UV\u0003\u0004\u0002\u0000VW\u0005\u0003\u0000\u0000WX\u0003\u0012"+
		"\t\u0000XY\u0005\u0004\u0000\u0000YZ\u0006\u0000\uffff\uffff\u0000Z[\u0006"+
		"\u0000\uffff\uffff\u0000[\u0001\u0001\u0000\u0000\u0000\\_\u0003\u0006"+
		"\u0003\u0000]_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_\u0003\u0001\u0000\u0000\u0000`a\u0003B!\u0000ab\u0003"+
		"\u0004\u0002\u0000be\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000"+
		"d`\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\u0005\u0001\u0000"+
		"\u0000\u0000fg\u0005\u0005\u0000\u0000gh\u0003\b\u0004\u0000h\u0007\u0001"+
		"\u0000\u0000\u0000ij\u0003\f\u0006\u0000jk\u0005\u0006\u0000\u0000kl\u0003"+
		"\u0010\b\u0000lm\u0006\u0004\uffff\uffff\u0000mn\u0005\u0002\u0000\u0000"+
		"no\u0003\n\u0005\u0000o\t\u0001\u0000\u0000\u0000ps\u0003\b\u0004\u0000"+
		"qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000"+
		"\u0000s\u000b\u0001\u0000\u0000\u0000tu\u0005\u001e\u0000\u0000uv\u0006"+
		"\u0006\uffff\uffff\u0000vw\u0003\u000e\u0007\u0000w\r\u0001\u0000\u0000"+
		"\u0000xy\u0005\u0007\u0000\u0000y|\u0003\f\u0006\u0000z|\u0001\u0000\u0000"+
		"\u0000{x\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|\u000f\u0001"+
		"\u0000\u0000\u0000}~\u0007\u0000\u0000\u0000~\u0011\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005\n\u0000\u0000\u0080\u0081\u0003\u0014\n\u0000"+
		"\u0081\u0082\u0005\u000b\u0000\u0000\u0082\u0013\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0003\u0016\u000b\u0000\u0084\u0085\u0003\u0014\n\u0000\u0085"+
		"\u0088\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087"+
		"\u0083\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u0015\u0001\u0000\u0000\u0000\u0089\u008f\u0003&\u0013\u0000\u008a\u008f"+
		"\u0003\"\u0011\u0000\u008b\u008f\u0003 \u0010\u0000\u008c\u008f\u0003"+
		"J%\u0000\u008d\u008f\u0003\u0018\f\u0000\u008e\u0089\u0001\u0000\u0000"+
		"\u0000\u008e\u008a\u0001\u0000\u0000\u0000\u008e\u008b\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0017\u0001\u0000\u0000\u0000\u0090\u0091\u0005\f\u0000\u0000"+
		"\u0091\u0092\u0003\u001a\r\u0000\u0092\u0093\u0005\r\u0000\u0000\u0093"+
		"\u0094\u0005\u0002\u0000\u0000\u0094\u0019\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0003\u001c\u000e\u0000\u0096\u0097\u0003\u001e\u000f\u0000\u0097"+
		"\u001b\u0001\u0000\u0000\u0000\u0098\u0099\u0003(\u0014\u0000\u0099\u009a"+
		"\u0006\u000e\uffff\uffff\u0000\u009a\u009e\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005\u001f\u0000\u0000\u009c\u009e\u0006\u000e\uffff\uffff\u0000"+
		"\u009d\u0098\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009e\u001d\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0007\u0000\u0000"+
		"\u00a0\u00a3\u0003\u001a\r\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2"+
		"\u009f\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u001f\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u000e\u0000\u0000\u00a5"+
		"\u00a6\u0006\u0010\uffff\uffff\u0000\u00a6\u00a7\u0003\u0012\t\u0000\u00a7"+
		"\u00a8\u0005\u000f\u0000\u0000\u00a8\u00a9\u0005\u0010\u0000\u0000\u00a9"+
		"\u00aa\u0003(\u0014\u0000\u00aa\u00ab\u0005\r\u0000\u0000\u00ab\u00ac"+
		"\u0005\u0002\u0000\u0000\u00ac\u00ad\u0006\u0010\uffff\uffff\u0000\u00ad"+
		"!\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0011\u0000\u0000\u00af\u00b0"+
		"\u0003(\u0014\u0000\u00b0\u00b1\u0005\r\u0000\u0000\u00b1\u00b2\u0006"+
		"\u0011\uffff\uffff\u0000\u00b2\u00b3\u0003\u0012\t\u0000\u00b3\u00b4\u0003"+
		"$\u0012\u0000\u00b4\u00b5\u0005\u0002\u0000\u0000\u00b5\u00b6\u0006\u0011"+
		"\uffff\uffff\u0000\u00b6#\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0012"+
		"\u0000\u0000\u00b8\u00b9\u0006\u0012\uffff\uffff\u0000\u00b9\u00bc\u0003"+
		"\u0012\t\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b7\u0001\u0000"+
		"\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc%\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0005\u001e\u0000\u0000\u00be\u00bf\u0005\u0013\u0000"+
		"\u0000\u00bf\u00c0\u0006\u0013\uffff\uffff\u0000\u00c0\u00c1\u0003(\u0014"+
		"\u0000\u00c1\u00c2\u0006\u0013\uffff\uffff\u0000\u00c2\u00c3\u0005\u0002"+
		"\u0000\u0000\u00c3\'\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003.\u0017"+
		"\u0000\u00c5\u00c6\u0003*\u0015\u0000\u00c6)\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0003,\u0016\u0000\u00c8\u00c9\u0006\u0015\uffff\uffff\u0000\u00c9"+
		"\u00ca\u0003.\u0017\u0000\u00ca\u00cb\u0006\u0015\uffff\uffff\u0000\u00cb"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd"+
		"\u00c7\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"+\u0001\u0000\u0000\u0000\u00cf\u00d0\u0007\u0001\u0000\u0000\u00d0-\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u00034\u001a\u0000\u00d2\u00d3\u0006\u0017"+
		"\uffff\uffff\u0000\u00d3\u00d4\u00030\u0018\u0000\u00d4/\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u00032\u0019\u0000\u00d6\u00d7\u0006\u0018\uffff\uffff"+
		"\u0000\u00d7\u00d8\u0003.\u0017\u0000\u00d8\u00db\u0001\u0000\u0000\u0000"+
		"\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d5\u0001\u0000\u0000\u0000"+
		"\u00da\u00d9\u0001\u0000\u0000\u0000\u00db1\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0007\u0002\u0000\u0000\u00dd3\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0003:\u001d\u0000\u00df\u00e0\u0006\u001a\uffff\uffff\u0000\u00e0\u00e1"+
		"\u00036\u001b\u0000\u00e15\u0001\u0000\u0000\u0000\u00e2\u00e3\u00038"+
		"\u001c\u0000\u00e3\u00e4\u0006\u001b\uffff\uffff\u0000\u00e4\u00e5\u0003"+
		"4\u001a\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e87\u0001\u0000\u0000\u0000\u00e9\u00ea\u0007\u0003\u0000"+
		"\u0000\u00ea9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0010\u0000\u0000"+
		"\u00ec\u00ed\u0006\u001d\uffff\uffff\u0000\u00ed\u00ee\u0003(\u0014\u0000"+
		"\u00ee\u00ef\u0005\r\u0000\u0000\u00ef\u00f0\u0006\u001d\uffff\uffff\u0000"+
		"\u00f0\u00f6\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003<\u001e\u0000\u00f2"+
		"\u00f3\u0006\u001d\uffff\uffff\u0000\u00f3\u00f4\u0003>\u001f\u0000\u00f4"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f5\u00eb\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f6;\u0001\u0000\u0000\u0000\u00f7\u00fa"+
		"\u00032\u0019\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa=\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0005\u001e\u0000\u0000\u00fc\u00fd\u0006\u001f"+
		"\uffff\uffff\u0000\u00fd\u0100\u0006\u001f\uffff\uffff\u0000\u00fe\u0100"+
		"\u0003@ \u0000\u00ff\u00fb\u0001\u0000\u0000\u0000\u00ff\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100?\u0001\u0000\u0000\u0000\u0101\u0102\u0005\"\u0000"+
		"\u0000\u0102\u0106\u0006 \uffff\uffff\u0000\u0103\u0104\u0005#\u0000\u0000"+
		"\u0104\u0106\u0006 \uffff\uffff\u0000\u0105\u0101\u0001\u0000\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0106A\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0006!\uffff\uffff\u0000\u0108\u0109\u0005\u001b\u0000\u0000\u0109"+
		"\u010a\u0005\u001e\u0000\u0000\u010a\u010b\u0006!\uffff\uffff\u0000\u010b"+
		"\u010c\u0005\u0010\u0000\u0000\u010c\u010d\u0003D\"\u0000\u010d\u010e"+
		"\u0005\r\u0000\u0000\u010e\u010f\u0005\u001c\u0000\u0000\u010f\u0110\u0003"+
		"H$\u0000\u0110\u0111\u0003\u0012\t\u0000\u0111\u0112\u0005\u001d\u0000"+
		"\u0000\u0112\u0113\u0006!\uffff\uffff\u0000\u0113C\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0005\u001e\u0000\u0000\u0115\u0116\u0005\u0006\u0000\u0000"+
		"\u0116\u0117\u0003\u0010\b\u0000\u0117\u0118\u0006\"\uffff\uffff\u0000"+
		"\u0118\u0119\u0003F#\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u011c"+
		"\u0001\u0000\u0000\u0000\u011b\u0114\u0001\u0000\u0000\u0000\u011b\u011a"+
		"\u0001\u0000\u0000\u0000\u011cE\u0001\u0000\u0000\u0000\u011d\u011e\u0005"+
		"\u0007\u0000\u0000\u011e\u0121\u0003D\"\u0000\u011f\u0121\u0001\u0000"+
		"\u0000\u0000\u0120\u011d\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000"+
		"\u0000\u0000\u0121G\u0001\u0000\u0000\u0000\u0122\u0125\u0003\u0006\u0003"+
		"\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000"+
		"\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125I\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0005\u001e\u0000\u0000\u0127\u0128\u0005\u0010\u0000\u0000"+
		"\u0128\u0129\u0006%\uffff\uffff\u0000\u0129\u012a\u0003L&\u0000\u012a"+
		"\u012b\u0005\r\u0000\u0000\u012b\u012c\u0005\u0002\u0000\u0000\u012cK"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0003(\u0014\u0000\u012e\u012f\u0003"+
		"N\'\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u0132\u0001\u0000"+
		"\u0000\u0000\u0131\u012d\u0001\u0000\u0000\u0000\u0131\u0130\u0001\u0000"+
		"\u0000\u0000\u0132M\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u0007\u0000"+
		"\u0000\u0134\u0137\u0003L&\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136"+
		"\u0133\u0001\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137"+
		"O\u0001\u0000\u0000\u0000\u0015^dr{\u0087\u008e\u009d\u00a2\u00bb\u00cd"+
		"\u00da\u00e7\u00f5\u00f9\u00ff\u0105\u011b\u0120\u0124\u0131\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}