// Generated from C:/Users/wangz/IdeaProjects/riddle-idea/src/main/resources/antlr/RiddleParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RiddleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Var=1, Val=2, For=3, While=4, Continue=5, Break=6, If=7, Else=8, Func=9, 
		Return=10, Import=11, Package=12, Class=13, True=14, False=15, Null=16, 
		Try=17, Catch=18, Override=19, Static=20, Const=21, Public=22, Protected=23, 
		Private=24, Virtual=25, Operator=26, Template=27, TypeName=28, LeftBracket=29, 
		RightBracket=30, LeftSquare=31, RightSquare=32, LeftCurly=33, RightCurly=34, 
		Colon=35, Semi=36, Comma=37, Equal=38, Assign=39, Greater=40, Less=41, 
		LeftLeft=42, RightRight=43, RightRightRight=44, Add=45, Sub=46, Star=47, 
		Div=48, Mod=49, Not=50, And=51, Or=52, Xor=53, Dot=54, DoubleQuotes=55, 
		Quotes=56, Endl=57, Identifier=58, Hexadecimal=59, Decimal=60, Octal=61, 
		Binary=62, Float=63, IntegerSequence=64, HEX_DIGIT=65, OCTAL_DIGIT=66, 
		BINARY_DIGIT=67, DIGIT=68, STRING=69, CHAR=70, LINE_COMMENT=71, BLOCK_COMMENT=72, 
		WHITESPACE=73;
	public static final int
		RULE_program = 0, RULE_null_cnt = 1, RULE_statement_ed = 2, RULE_statement = 3, 
		RULE_bodyExpr = 4, RULE_packStatement = 5, RULE_importStatement = 6, RULE_varDefineStatement = 7, 
		RULE_argsExpr = 8, RULE_defineArgs = 9, RULE_funcDefine = 10, RULE_forStatement = 11, 
		RULE_whileStatement = 12, RULE_continueStatement = 13, RULE_breakStatement = 14, 
		RULE_ifStatement = 15, RULE_returnStatement = 16, RULE_classDefine = 17, 
		RULE_tryExpr = 18, RULE_catchExpr = 19, RULE_exprPtr = 20, RULE_exprPtrParser = 21, 
		RULE_expression = 22, RULE_id = 23, RULE_modifier = 24, RULE_modifierList = 25, 
		RULE_number = 26, RULE_boolean = 27, RULE_float = 28, RULE_integer = 29, 
		RULE_tmpleDefine = 30, RULE_tmplDefineArg = 31, RULE_tmplUsed = 32, RULE_tmplArg = 33, 
		RULE_tmplArgList = 34, RULE_typeUsed = 35, RULE_property = 36, RULE_propertyItem = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "null_cnt", "statement_ed", "statement", "bodyExpr", "packStatement", 
			"importStatement", "varDefineStatement", "argsExpr", "defineArgs", "funcDefine", 
			"forStatement", "whileStatement", "continueStatement", "breakStatement", 
			"ifStatement", "returnStatement", "classDefine", "tryExpr", "catchExpr", 
			"exprPtr", "exprPtrParser", "expression", "id", "modifier", "modifierList", 
			"number", "boolean", "float", "integer", "tmpleDefine", "tmplDefineArg", 
			"tmplUsed", "tmplArg", "tmplArgList", "typeUsed", "property", "propertyItem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'val'", "'for'", "'while'", "'continue'", "'break'", 
			"'if'", "'else'", "'fun'", "'return'", "'import'", "'package'", "'class'", 
			"'true'", "'false'", "'null'", "'try'", "'catch'", "'override'", "'static'", 
			"'const'", "'public'", "'protected'", "'private'", "'virtual'", "'operator'", 
			"'template'", "'typename'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"':'", "';'", "','", "'=='", "'='", "'>'", "'<'", "'<<'", "'>>'", "'>>>'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'&'", "'|'", "'^'", "'.'", 
			"'\"'", "'''", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Var", "Val", "For", "While", "Continue", "Break", "If", "Else", 
			"Func", "Return", "Import", "Package", "Class", "True", "False", "Null", 
			"Try", "Catch", "Override", "Static", "Const", "Public", "Protected", 
			"Private", "Virtual", "Operator", "Template", "TypeName", "LeftBracket", 
			"RightBracket", "LeftSquare", "RightSquare", "LeftCurly", "RightCurly", 
			"Colon", "Semi", "Comma", "Equal", "Assign", "Greater", "Less", "LeftLeft", 
			"RightRight", "RightRightRight", "Add", "Sub", "Star", "Div", "Mod", 
			"Not", "And", "Or", "Xor", "Dot", "DoubleQuotes", "Quotes", "Endl", "Identifier", 
			"Hexadecimal", "Decimal", "Octal", "Binary", "Float", "IntegerSequence", 
			"HEX_DIGIT", "OCTAL_DIGIT", "BINARY_DIGIT", "DIGIT", "STRING", "CHAR", 
			"LINE_COMMENT", "BLOCK_COMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "RiddleParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RiddleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<Statement_edContext> statement_ed() {
			return getRuleContexts(Statement_edContext.class);
		}
		public Statement_edContext statement_ed(int i) {
			return getRuleContext(Statement_edContext.class,i);
		}
		public TerminalNode EOF() { return getToken(RiddleParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -142740718281294086L) != 0) || _la==STRING || _la==CHAR) {
					{
					{
					setState(76);
					statement_ed();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(EOF);
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
	public static class Null_cntContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(RiddleParser.Semi, 0); }
		public TerminalNode Endl() { return getToken(RiddleParser.Endl, 0); }
		public Null_cntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_cnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterNull_cnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitNull_cnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitNull_cnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_cntContext null_cnt() throws RecognitionException {
		Null_cntContext _localctx = new Null_cntContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_null_cnt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==Semi || _la==Endl) ) {
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
	public static class Statement_edContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Semi() { return getToken(RiddleParser.Semi, 0); }
		public TerminalNode Endl() { return getToken(RiddleParser.Endl, 0); }
		public Statement_edContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_ed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterStatement_ed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitStatement_ed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitStatement_ed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_edContext statement_ed() throws RecognitionException {
		Statement_edContext _localctx = new Statement_edContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement_ed);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				statement();
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(88);
					match(Semi);
					}
					break;
				}
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(91);
					match(Endl);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(Endl);
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
	public static class StatementContext extends ParserRuleContext {
		public PackStatementContext packStatement() {
			return getRuleContext(PackStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ClassDefineContext classDefine() {
			return getRuleContext(ClassDefineContext.class,0);
		}
		public FuncDefineContext funcDefine() {
			return getRuleContext(FuncDefineContext.class,0);
		}
		public VarDefineStatementContext varDefineStatement() {
			return getRuleContext(VarDefineStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public TryExprContext tryExpr() {
			return getRuleContext(TryExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyExprContext bodyExpr() {
			return getRuleContext(BodyExprContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				packStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				importStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				classDefine();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				funcDefine();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				varDefineStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(104);
				whileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(105);
				ifStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(106);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(107);
				continueStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(108);
				breakStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(109);
				tryExpr();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(110);
				expression(0);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(111);
				bodyExpr();
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
	public static class BodyExprContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(RiddleParser.LeftCurly, 0); }
		public TerminalNode RightCurly() { return getToken(RiddleParser.RightCurly, 0); }
		public List<Statement_edContext> statement_ed() {
			return getRuleContexts(Statement_edContext.class);
		}
		public Statement_edContext statement_ed(int i) {
			return getRuleContext(Statement_edContext.class,i);
		}
		public BodyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterBodyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitBodyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitBodyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyExprContext bodyExpr() throws RecognitionException {
		BodyExprContext _localctx = new BodyExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bodyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(LeftCurly);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -142740718281294086L) != 0) || _la==STRING || _la==CHAR) {
				{
				{
				setState(115);
				statement_ed();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(RightCurly);
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
	public static class PackStatementContext extends ParserRuleContext {
		public IdContext packName;
		public TerminalNode Package() { return getToken(RiddleParser.Package, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PackStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterPackStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitPackStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitPackStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackStatementContext packStatement() throws RecognitionException {
		PackStatementContext _localctx = new PackStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_packStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(Package);
			setState(124);
			((PackStatementContext)_localctx).packName = id();
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
	public static class ImportStatementContext extends ParserRuleContext {
		public IdContext libName;
		public TerminalNode Import() { return getToken(RiddleParser.Import, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(Import);
			setState(127);
			((ImportStatementContext)_localctx).libName = id();
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
	public static class VarDefineStatementContext extends ParserRuleContext {
		public IdContext name;
		public TypeUsedContext type;
		public ExpressionContext value;
		public TerminalNode Var() { return getToken(RiddleParser.Var, 0); }
		public TerminalNode Colon() { return getToken(RiddleParser.Colon, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeUsedContext typeUsed() {
			return getRuleContext(TypeUsedContext.class,0);
		}
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDefineStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefineStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterVarDefineStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitVarDefineStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitVarDefineStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefineStatementContext varDefineStatement() throws RecognitionException {
		VarDefineStatementContext _localctx = new VarDefineStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDefineStatement);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(Var);
				setState(130);
				((VarDefineStatementContext)_localctx).name = id();
				setState(131);
				match(Colon);
				setState(132);
				((VarDefineStatementContext)_localctx).type = typeUsed(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(Var);
				setState(135);
				((VarDefineStatementContext)_localctx).name = id();
				setState(136);
				match(Assign);
				setState(137);
				((VarDefineStatementContext)_localctx).value = expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(Var);
				setState(140);
				((VarDefineStatementContext)_localctx).name = id();
				setState(141);
				match(Colon);
				setState(142);
				((VarDefineStatementContext)_localctx).type = typeUsed(0);
				setState(143);
				match(Assign);
				setState(144);
				((VarDefineStatementContext)_localctx).value = expression(0);
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
	public static class ArgsExprContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(RiddleParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(RiddleParser.Comma, i);
		}
		public ArgsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterArgsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitArgsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitArgsExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsExprContext argsExpr() throws RecognitionException {
		ArgsExprContext _localctx = new ArgsExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argsExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 109194782663802887L) != 0)) {
				{
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(148);
						expression(0);
						setState(149);
						match(Comma);
						}
						} 
					}
					setState(155);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(156);
				expression(0);
				}
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
	public static class DefineArgsContext extends ParserRuleContext {
		public boolean varArg;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(RiddleParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(RiddleParser.Colon, i);
		}
		public List<TypeUsedContext> typeUsed() {
			return getRuleContexts(TypeUsedContext.class);
		}
		public TypeUsedContext typeUsed(int i) {
			return getRuleContext(TypeUsedContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(RiddleParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(RiddleParser.Comma, i);
		}
		public List<TerminalNode> Dot() { return getTokens(RiddleParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(RiddleParser.Dot, i);
		}
		public DefineArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterDefineArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitDefineArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitDefineArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineArgsContext defineArgs() throws RecognitionException {
		DefineArgsContext _localctx = new DefineArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defineArgs);
		int _la;
		try {
			int _alt;
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(166);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(159);
							id();
							setState(160);
							match(Colon);
							setState(161);
							typeUsed(0);
							setState(162);
							match(Comma);
							}
							} 
						}
						setState(168);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					}
					{
					setState(169);
					id();
					setState(170);
					match(Colon);
					setState(171);
					typeUsed(0);
					}
					}
				}

				((DefineArgsContext)_localctx).varArg = false;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(176);
						id();
						setState(177);
						match(Colon);
						setState(178);
						typeUsed(0);
						setState(179);
						match(Comma);
						}
						} 
					}
					setState(185);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				{
				setState(186);
				id();
				setState(187);
				match(Colon);
				setState(188);
				typeUsed(0);
				}
				}
				{
				setState(190);
				match(Comma);
				setState(191);
				match(Dot);
				setState(192);
				match(Dot);
				setState(193);
				match(Dot);
				}
				((DefineArgsContext)_localctx).varArg = true;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(197);
				match(Dot);
				setState(198);
				match(Dot);
				setState(199);
				match(Dot);
				}
				((DefineArgsContext)_localctx).varArg = true;
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
	public static class FuncDefineContext extends ParserRuleContext {
		public PropertyContext prop;
		public TmpleDefineContext tmpl;
		public ModifierListContext mod;
		public IdContext funcName;
		public DefineArgsContext args;
		public TypeUsedContext returnType;
		public BodyExprContext body;
		public TerminalNode Func() { return getToken(RiddleParser.Func, 0); }
		public TerminalNode LeftBracket() { return getToken(RiddleParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(RiddleParser.RightBracket, 0); }
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DefineArgsContext defineArgs() {
			return getRuleContext(DefineArgsContext.class,0);
		}
		public TerminalNode Semi() { return getToken(RiddleParser.Semi, 0); }
		public List<TerminalNode> Endl() { return getTokens(RiddleParser.Endl); }
		public TerminalNode Endl(int i) {
			return getToken(RiddleParser.Endl, i);
		}
		public TerminalNode Sub() { return getToken(RiddleParser.Sub, 0); }
		public TerminalNode Greater() { return getToken(RiddleParser.Greater, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TmpleDefineContext tmpleDefine() {
			return getRuleContext(TmpleDefineContext.class,0);
		}
		public TypeUsedContext typeUsed() {
			return getRuleContext(TypeUsedContext.class,0);
		}
		public BodyExprContext bodyExpr() {
			return getRuleContext(BodyExprContext.class,0);
		}
		public FuncDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterFuncDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitFuncDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitFuncDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefineContext funcDefine() throws RecognitionException {
		FuncDefineContext _localctx = new FuncDefineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftSquare) {
				{
				setState(204);
				((FuncDefineContext)_localctx).prop = property();
				}
			}

			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(207);
				match(Endl);
				}
				break;
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(210);
				((FuncDefineContext)_localctx).tmpl = tmpleDefine();
				}
			}

			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Endl) {
				{
				setState(213);
				match(Endl);
				}
			}

			setState(216);
			((FuncDefineContext)_localctx).mod = modifierList();
			setState(217);
			match(Func);
			setState(218);
			((FuncDefineContext)_localctx).funcName = id();
			setState(219);
			match(LeftBracket);
			setState(220);
			((FuncDefineContext)_localctx).args = defineArgs();
			setState(221);
			match(RightBracket);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sub) {
				{
				setState(222);
				match(Sub);
				setState(223);
				match(Greater);
				setState(224);
				((FuncDefineContext)_localctx).returnType = typeUsed(0);
				}
			}

			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftCurly:
				{
				{
				setState(227);
				((FuncDefineContext)_localctx).body = bodyExpr();
				}
				}
				break;
			case Semi:
				{
				setState(228);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext init;
		public StatementContext cond;
		public StatementContext incr;
		public Statement_edContext body;
		public TerminalNode For() { return getToken(RiddleParser.For, 0); }
		public TerminalNode LeftBracket() { return getToken(RiddleParser.LeftBracket, 0); }
		public List<TerminalNode> Semi() { return getTokens(RiddleParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(RiddleParser.Semi, i);
		}
		public TerminalNode RightBracket() { return getToken(RiddleParser.RightBracket, 0); }
		public Statement_edContext statement_ed() {
			return getRuleContext(Statement_edContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(For);
			setState(232);
			match(LeftBracket);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -142740787000770822L) != 0) || _la==STRING || _la==CHAR) {
				{
				setState(233);
				((ForStatementContext)_localctx).init = statement();
				}
			}

			setState(236);
			match(Semi);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -142740787000770822L) != 0) || _la==STRING || _la==CHAR) {
				{
				setState(237);
				((ForStatementContext)_localctx).cond = statement();
				}
			}

			setState(240);
			match(Semi);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -142740787000770822L) != 0) || _la==STRING || _la==CHAR) {
				{
				setState(241);
				((ForStatementContext)_localctx).incr = statement();
				}
			}

			setState(244);
			match(RightBracket);
			setState(245);
			((ForStatementContext)_localctx).body = statement_ed();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext cond;
		public Statement_edContext body;
		public TerminalNode While() { return getToken(RiddleParser.While, 0); }
		public TerminalNode LeftBracket() { return getToken(RiddleParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(RiddleParser.RightBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_edContext statement_ed() {
			return getRuleContext(Statement_edContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(While);
			setState(248);
			match(LeftBracket);
			setState(249);
			((WhileStatementContext)_localctx).cond = expression(0);
			setState(250);
			match(RightBracket);
			setState(251);
			((WhileStatementContext)_localctx).body = statement_ed();
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
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(RiddleParser.Continue, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(Continue);
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
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(RiddleParser.Break, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(Break);
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
	public static class IfStatementContext extends ParserRuleContext {
		public boolean hasElse;
		public ExpressionContext cond;
		public Statement_edContext body;
		public Statement_edContext elseBody;
		public TerminalNode If() { return getToken(RiddleParser.If, 0); }
		public TerminalNode LeftBracket() { return getToken(RiddleParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(RiddleParser.RightBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Statement_edContext> statement_ed() {
			return getRuleContexts(Statement_edContext.class);
		}
		public Statement_edContext statement_ed(int i) {
			return getRuleContext(Statement_edContext.class,i);
		}
		public TerminalNode Else() { return getToken(RiddleParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifStatement);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(If);
				setState(258);
				match(LeftBracket);
				setState(259);
				((IfStatementContext)_localctx).cond = expression(0);
				setState(260);
				match(RightBracket);
				setState(261);
				((IfStatementContext)_localctx).body = statement_ed();
				((IfStatementContext)_localctx).hasElse = false;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(If);
				setState(265);
				match(LeftBracket);
				setState(266);
				((IfStatementContext)_localctx).cond = expression(0);
				setState(267);
				match(RightBracket);
				setState(268);
				((IfStatementContext)_localctx).body = statement_ed();
				setState(269);
				match(Else);
				setState(270);
				((IfStatementContext)_localctx).elseBody = statement_ed();
				((IfStatementContext)_localctx).hasElse = true;
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public StatementContext result;
		public TerminalNode Return() { return getToken(RiddleParser.Return, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(Return);
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(276);
				((ReturnStatementContext)_localctx).result = statement();
				}
				break;
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
	public static class ClassDefineContext extends ParserRuleContext {
		public PropertyContext prop;
		public TmpleDefineContext tmpl;
		public IdContext className;
		public IdContext parentClass;
		public BodyExprContext body;
		public TerminalNode Class() { return getToken(RiddleParser.Class, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public BodyExprContext bodyExpr() {
			return getRuleContext(BodyExprContext.class,0);
		}
		public List<TerminalNode> Endl() { return getTokens(RiddleParser.Endl); }
		public TerminalNode Endl(int i) {
			return getToken(RiddleParser.Endl, i);
		}
		public TerminalNode Colon() { return getToken(RiddleParser.Colon, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TmpleDefineContext tmpleDefine() {
			return getRuleContext(TmpleDefineContext.class,0);
		}
		public ClassDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterClassDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitClassDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitClassDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefineContext classDefine() throws RecognitionException {
		ClassDefineContext _localctx = new ClassDefineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftSquare) {
				{
				setState(279);
				((ClassDefineContext)_localctx).prop = property();
				}
			}

			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(282);
				match(Endl);
				}
				break;
			}
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(285);
				((ClassDefineContext)_localctx).tmpl = tmpleDefine();
				}
			}

			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Endl) {
				{
				setState(288);
				match(Endl);
				}
			}

			setState(291);
			match(Class);
			setState(292);
			((ClassDefineContext)_localctx).className = id();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(293);
				match(Colon);
				setState(294);
				((ClassDefineContext)_localctx).parentClass = id();
				}
			}

			setState(297);
			((ClassDefineContext)_localctx).body = bodyExpr();
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
	public static class TryExprContext extends ParserRuleContext {
		public BodyExprContext tryBody;
		public TerminalNode Try() { return getToken(RiddleParser.Try, 0); }
		public CatchExprContext catchExpr() {
			return getRuleContext(CatchExprContext.class,0);
		}
		public BodyExprContext bodyExpr() {
			return getRuleContext(BodyExprContext.class,0);
		}
		public Null_cntContext null_cnt() {
			return getRuleContext(Null_cntContext.class,0);
		}
		public TryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterTryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitTryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitTryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryExprContext tryExpr() throws RecognitionException {
		TryExprContext _localctx = new TryExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(Try);
			setState(300);
			((TryExprContext)_localctx).tryBody = bodyExpr();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semi || _la==Endl) {
				{
				setState(301);
				null_cnt();
				}
			}

			setState(304);
			catchExpr();
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
	public static class CatchExprContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(RiddleParser.Catch, 0); }
		public TerminalNode LeftBracket() { return getToken(RiddleParser.LeftBracket, 0); }
		public VarDefineStatementContext varDefineStatement() {
			return getRuleContext(VarDefineStatementContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(RiddleParser.RightBracket, 0); }
		public CatchExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterCatchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitCatchExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitCatchExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchExprContext catchExpr() throws RecognitionException {
		CatchExprContext _localctx = new CatchExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_catchExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(Catch);
			setState(307);
			match(LeftBracket);
			setState(308);
			varDefineStatement();
			setState(309);
			match(RightBracket);
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
	public static class ExprPtrContext extends ParserRuleContext {
		public ExprPtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprPtr; }
	 
		public ExprPtrContext() { }
		public void copyFrom(ExprPtrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncExprContext extends ExprPtrContext {
		public IdContext funcName;
		public TmplUsedContext tmpl;
		public ArgsExprContext args;
		public TerminalNode LeftBracket() { return getToken(RiddleParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(RiddleParser.RightBracket, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ArgsExprContext argsExpr() {
			return getRuleContext(ArgsExprContext.class,0);
		}
		public TmplUsedContext tmplUsed() {
			return getRuleContext(TmplUsedContext.class,0);
		}
		public FuncExprContext(ExprPtrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExprContext extends ExprPtrContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ObjectExprContext(ExprPtrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterObjectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitObjectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitObjectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlendExprContext extends ExprPtrContext {
		public ExprPtrContext parentNode;
		public ExprPtrContext childNode;
		public TerminalNode Dot() { return getToken(RiddleParser.Dot, 0); }
		public List<ExprPtrContext> exprPtr() {
			return getRuleContexts(ExprPtrContext.class);
		}
		public ExprPtrContext exprPtr(int i) {
			return getRuleContext(ExprPtrContext.class,i);
		}
		public BlendExprContext(ExprPtrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterBlendExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitBlendExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitBlendExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprPtrContext exprPtr() throws RecognitionException {
		return exprPtr(0);
	}

	private ExprPtrContext exprPtr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprPtrContext _localctx = new ExprPtrContext(_ctx, _parentState);
		ExprPtrContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_exprPtr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(312);
				((FuncExprContext)_localctx).funcName = id();
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Less) {
					{
					setState(313);
					((FuncExprContext)_localctx).tmpl = tmplUsed();
					}
				}

				setState(316);
				match(LeftBracket);
				setState(317);
				((FuncExprContext)_localctx).args = argsExpr();
				setState(318);
				match(RightBracket);
				}
				break;
			case 2:
				{
				_localctx = new ObjectExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(320);
				id();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlendExprContext(new ExprPtrContext(_parentctx, _parentState));
					((BlendExprContext)_localctx).parentNode = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exprPtr);
					setState(323);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(324);
					match(Dot);
					setState(325);
					((BlendExprContext)_localctx).childNode = exprPtr(2);
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprPtrParserContext extends ParserRuleContext {
		public ExprPtrContext exprPtr() {
			return getRuleContext(ExprPtrContext.class,0);
		}
		public ExprPtrParserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprPtrParser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterExprPtrParser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitExprPtrParser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitExprPtrParser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprPtrParserContext exprPtrParser() throws RecognitionException {
		ExprPtrParserContext _localctx = new ExprPtrParserContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprPtrParser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			exprPtr(0);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfSubRightExprContext extends ExpressionContext {
		public ExprPtrParserContext expr;
		public List<TerminalNode> Sub() { return getTokens(RiddleParser.Sub); }
		public TerminalNode Sub(int i) {
			return getToken(RiddleParser.Sub, i);
		}
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public SelfSubRightExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterSelfSubRightExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitSelfSubRightExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitSelfSubRightExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndAssignExprContext extends ExpressionContext {
		public ExprPtrParserContext left;
		public ExpressionContext right;
		public TerminalNode And() { return getToken(RiddleParser.And, 0); }
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AndAssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterAndAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitAndAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitAndAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoadExprContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode Star() { return getToken(RiddleParser.Star, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoadExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterLoadExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitLoadExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitLoadExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullExprContext extends ExpressionContext {
		public TerminalNode Null() { return getToken(RiddleParser.Null, 0); }
		public NullExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterNullExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitNullExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitNullExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode Mod() { return getToken(RiddleParser.Mod, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ModExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitModExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitModExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastExprContext extends ExpressionContext {
		public TypeUsedContext type;
		public ExprPtrParserContext value;
		public TerminalNode Less() { return getToken(RiddleParser.Less, 0); }
		public TerminalNode Greater() { return getToken(RiddleParser.Greater, 0); }
		public TerminalNode LeftBracket() { return getToken(RiddleParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(RiddleParser.RightBracket, 0); }
		public TypeUsedContext typeUsed() {
			return getRuleContext(TypeUsedContext.class,0);
		}
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public CastExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterCastExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitCastExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LShrExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode RightRightRight() { return getToken(RiddleParser.RightRightRight, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LShrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterLShrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitLShrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitLShrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegativeExprContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode Sub() { return getToken(RiddleParser.Sub, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegativeExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterNegativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitNegativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitNegativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExprContext extends ExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulAssignExprContext extends ExpressionContext {
		public ExprPtrParserContext left;
		public ExpressionContext right;
		public TerminalNode Star() { return getToken(RiddleParser.Star, 0); }
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MulAssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterMulAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitMulAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitMulAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorAssignExprContext extends ExpressionContext {
		public ExprPtrParserContext left;
		public ExpressionContext right;
		public TerminalNode Xor() { return getToken(RiddleParser.Xor, 0); }
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public XorAssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterXorAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitXorAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitXorAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode Sub() { return getToken(RiddleParser.Sub, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterEqualExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode Greater() { return getToken(RiddleParser.Greater, 0); }
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterEqualExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterGreaterEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitGreaterEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitGreaterEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddAssignExprContext extends ExpressionContext {
		public ExprPtrParserContext left;
		public ExpressionContext right;
		public TerminalNode Add() { return getToken(RiddleParser.Add, 0); }
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AddAssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterAddAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitAddAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitAddAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrAssignExprContext extends ExpressionContext {
		public ExprPtrParserContext left;
		public ExpressionContext right;
		public TerminalNode Or() { return getToken(RiddleParser.Or, 0); }
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrAssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterOrAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitOrAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitOrAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitXorExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode Xor() { return getToken(RiddleParser.Xor, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitXorExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterBitXorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitBitXorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitBitXorExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PtrExprContext extends ExpressionContext {
		public ExprPtrContext exprPtr() {
			return getRuleContext(ExprPtrContext.class,0);
		}
		public PtrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterPtrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitPtrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitPtrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(RiddleParser.STRING, 0); }
		public StringExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode Greater() { return getToken(RiddleParser.Greater, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterGreaterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitGreaterExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitGreaterExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivAssignExprContext extends ExpressionContext {
		public ExprPtrParserContext left;
		public ExpressionContext right;
		public TerminalNode Div() { return getToken(RiddleParser.Div, 0); }
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DivAssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterDivAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitDivAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitDivAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode Star() { return getToken(RiddleParser.Star, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode Not() { return getToken(RiddleParser.Not, 0); }
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotEqualExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterNotEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitNotEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitNotEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfSubLeftExprContext extends ExpressionContext {
		public ExprPtrParserContext expr;
		public List<TerminalNode> Sub() { return getTokens(RiddleParser.Sub); }
		public TerminalNode Sub(int i) {
			return getToken(RiddleParser.Sub, i);
		}
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public SelfSubLeftExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterSelfSubLeftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitSelfSubLeftExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitSelfSubLeftExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode Div() { return getToken(RiddleParser.Div, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitAndExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode And() { return getToken(RiddleParser.And, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitAndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterBitAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitBitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitBitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExprContext extends ExpressionContext {
		public ExprPtrParserContext left;
		public ExpressionContext right;
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfAddRightExprContext extends ExpressionContext {
		public ExprPtrParserContext expr;
		public List<TerminalNode> Add() { return getTokens(RiddleParser.Add); }
		public TerminalNode Add(int i) {
			return getToken(RiddleParser.Add, i);
		}
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public SelfAddRightExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterSelfAddRightExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitSelfAddRightExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitSelfAddRightExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubAssignExprContext extends ExpressionContext {
		public ExprPtrParserContext left;
		public ExpressionContext right;
		public TerminalNode Sub() { return getToken(RiddleParser.Sub, 0); }
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubAssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterSubAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitSubAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitSubAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharExprContext extends ExpressionContext {
		public TerminalNode CHAR() { return getToken(RiddleParser.CHAR, 0); }
		public CharExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterCharExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitCharExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitCharExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketExprContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode LeftBracket() { return getToken(RiddleParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(RiddleParser.RightBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracketExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterBracketExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitBracketExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitBracketExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExprContext extends ExpressionContext {
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public BooleanExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitBooleanExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AShrExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode RightRight() { return getToken(RiddleParser.RightRight, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AShrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterAShrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitAShrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitAShrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode Less() { return getToken(RiddleParser.Less, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterLessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitLessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitLessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<TerminalNode> Or() { return getTokens(RiddleParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(RiddleParser.Or, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfAddLeftExprContext extends ExpressionContext {
		public ExprPtrParserContext expr;
		public List<TerminalNode> Add() { return getTokens(RiddleParser.Add); }
		public TerminalNode Add(int i) {
			return getToken(RiddleParser.Add, i);
		}
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public SelfAddLeftExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterSelfAddLeftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitSelfAddLeftExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitSelfAddLeftExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LShrAssignExprContext extends ExpressionContext {
		public ExprPtrParserContext left;
		public ExpressionContext right;
		public TerminalNode RightRightRight() { return getToken(RiddleParser.RightRightRight, 0); }
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LShrAssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterLShrAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitLShrAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitLShrAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessEqualExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode Less() { return getToken(RiddleParser.Less, 0); }
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessEqualExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterLessEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitLessEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitLessEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AShrAssignExprContext extends ExpressionContext {
		public ExprPtrParserContext left;
		public ExpressionContext right;
		public TerminalNode RightRight() { return getToken(RiddleParser.RightRight, 0); }
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AShrAssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterAShrAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitAShrAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitAShrAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitOrExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode Or() { return getToken(RiddleParser.Or, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitOrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterBitOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitBitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitBitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode Not() { return getToken(RiddleParser.Not, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode Add() { return getToken(RiddleParser.Add, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShlAssignExprContext extends ExpressionContext {
		public ExprPtrParserContext left;
		public ExpressionContext right;
		public TerminalNode LeftLeft() { return getToken(RiddleParser.LeftLeft, 0); }
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ShlAssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterShlAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitShlAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitShlAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModAssignExprContext extends ExpressionContext {
		public ExprPtrParserContext left;
		public ExpressionContext right;
		public TerminalNode Mod() { return getToken(RiddleParser.Mod, 0); }
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public ExprPtrParserContext exprPtrParser() {
			return getRuleContext(ExprPtrParserContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ModAssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterModAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitModAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitModAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositiveExprContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode Add() { return getToken(RiddleParser.Add, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PositiveExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterPositiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitPositiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitPositiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShlExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LeftLeft() { return getToken(RiddleParser.LeftLeft, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ShlExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterShlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitShlExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitShlExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode Equal() { return getToken(RiddleParser.Equal, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<TerminalNode> And() { return getTokens(RiddleParser.And); }
		public TerminalNode And(int i) {
			return getToken(RiddleParser.And, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBlendContext extends ExpressionContext {
		public ExpressionContext parentNode;
		public ExprPtrContext childNode;
		public TerminalNode Dot() { return getToken(RiddleParser.Dot, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprPtrContext exprPtr() {
			return getRuleContext(ExprPtrContext.class,0);
		}
		public ExprBlendContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterExprBlend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitExprBlend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitExprBlend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(334);
				match(Less);
				setState(335);
				((CastExprContext)_localctx).type = typeUsed(0);
				setState(336);
				match(Greater);
				setState(337);
				match(LeftBracket);
				setState(338);
				((CastExprContext)_localctx).value = exprPtrParser();
				setState(339);
				match(RightBracket);
				}
				break;
			case 2:
				{
				_localctx = new BracketExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				match(LeftBracket);
				setState(342);
				((BracketExprContext)_localctx).expr = expression(0);
				setState(343);
				match(RightBracket);
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(345);
				match(Not);
				setState(346);
				((NotExprContext)_localctx).expr = expression(47);
				}
				break;
			case 4:
				{
				_localctx = new PositiveExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347);
				match(Add);
				setState(348);
				((PositiveExprContext)_localctx).expr = expression(46);
				}
				break;
			case 5:
				{
				_localctx = new NegativeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(349);
				match(Sub);
				setState(350);
				((NegativeExprContext)_localctx).expr = expression(45);
				}
				break;
			case 6:
				{
				_localctx = new SelfAddLeftExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(351);
				match(Add);
				setState(352);
				match(Add);
				setState(353);
				((SelfAddLeftExprContext)_localctx).expr = exprPtrParser();
				}
				break;
			case 7:
				{
				_localctx = new SelfAddRightExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354);
				((SelfAddRightExprContext)_localctx).expr = exprPtrParser();
				setState(355);
				match(Add);
				setState(356);
				match(Add);
				}
				break;
			case 8:
				{
				_localctx = new SelfSubLeftExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(358);
				match(Sub);
				setState(359);
				match(Sub);
				setState(360);
				((SelfSubLeftExprContext)_localctx).expr = exprPtrParser();
				}
				break;
			case 9:
				{
				_localctx = new SelfSubRightExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(361);
				((SelfSubRightExprContext)_localctx).expr = exprPtrParser();
				setState(362);
				match(Sub);
				setState(363);
				match(Sub);
				}
				break;
			case 10:
				{
				_localctx = new PtrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(365);
				exprPtr(0);
				}
				break;
			case 11:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				((AssignExprContext)_localctx).left = exprPtrParser();
				setState(367);
				match(Assign);
				setState(368);
				((AssignExprContext)_localctx).right = expression(20);
				}
				break;
			case 12:
				{
				_localctx = new AddAssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(370);
				((AddAssignExprContext)_localctx).left = exprPtrParser();
				setState(371);
				match(Add);
				setState(372);
				match(Assign);
				setState(373);
				((AddAssignExprContext)_localctx).right = expression(19);
				}
				break;
			case 13:
				{
				_localctx = new SubAssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(375);
				((SubAssignExprContext)_localctx).left = exprPtrParser();
				setState(376);
				match(Sub);
				setState(377);
				match(Assign);
				setState(378);
				((SubAssignExprContext)_localctx).right = expression(18);
				}
				break;
			case 14:
				{
				_localctx = new MulAssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(380);
				((MulAssignExprContext)_localctx).left = exprPtrParser();
				setState(381);
				match(Star);
				setState(382);
				match(Assign);
				setState(383);
				((MulAssignExprContext)_localctx).right = expression(17);
				}
				break;
			case 15:
				{
				_localctx = new DivAssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(385);
				((DivAssignExprContext)_localctx).left = exprPtrParser();
				setState(386);
				match(Div);
				setState(387);
				match(Assign);
				setState(388);
				((DivAssignExprContext)_localctx).right = expression(16);
				}
				break;
			case 16:
				{
				_localctx = new ModAssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(390);
				((ModAssignExprContext)_localctx).left = exprPtrParser();
				setState(391);
				match(Mod);
				setState(392);
				match(Assign);
				setState(393);
				((ModAssignExprContext)_localctx).right = expression(15);
				}
				break;
			case 17:
				{
				_localctx = new AddAssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(395);
				((AddAssignExprContext)_localctx).left = exprPtrParser();
				setState(396);
				match(Add);
				setState(397);
				match(Assign);
				setState(398);
				((AddAssignExprContext)_localctx).right = expression(14);
				}
				break;
			case 18:
				{
				_localctx = new AndAssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(400);
				((AndAssignExprContext)_localctx).left = exprPtrParser();
				setState(401);
				match(And);
				setState(402);
				match(Assign);
				setState(403);
				((AndAssignExprContext)_localctx).right = expression(13);
				}
				break;
			case 19:
				{
				_localctx = new OrAssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(405);
				((OrAssignExprContext)_localctx).left = exprPtrParser();
				setState(406);
				match(Or);
				setState(407);
				match(Assign);
				setState(408);
				((OrAssignExprContext)_localctx).right = expression(12);
				}
				break;
			case 20:
				{
				_localctx = new XorAssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(410);
				((XorAssignExprContext)_localctx).left = exprPtrParser();
				setState(411);
				match(Xor);
				setState(412);
				match(Assign);
				setState(413);
				((XorAssignExprContext)_localctx).right = expression(11);
				}
				break;
			case 21:
				{
				_localctx = new ShlAssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(415);
				((ShlAssignExprContext)_localctx).left = exprPtrParser();
				setState(416);
				match(LeftLeft);
				setState(417);
				match(Assign);
				setState(418);
				((ShlAssignExprContext)_localctx).right = expression(10);
				}
				break;
			case 22:
				{
				_localctx = new AShrAssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(420);
				((AShrAssignExprContext)_localctx).left = exprPtrParser();
				setState(421);
				match(RightRight);
				setState(422);
				match(Assign);
				setState(423);
				((AShrAssignExprContext)_localctx).right = expression(9);
				}
				break;
			case 23:
				{
				_localctx = new LShrAssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(425);
				((LShrAssignExprContext)_localctx).left = exprPtrParser();
				setState(426);
				match(RightRightRight);
				setState(427);
				match(Assign);
				setState(428);
				((LShrAssignExprContext)_localctx).right = expression(8);
				}
				break;
			case 24:
				{
				_localctx = new LoadExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(430);
				match(Star);
				setState(431);
				((LoadExprContext)_localctx).expr = expression(6);
				}
				break;
			case 25:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(432);
				match(STRING);
				}
				break;
			case 26:
				{
				_localctx = new CharExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(433);
				match(CHAR);
				}
				break;
			case 27:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(434);
				number();
				}
				break;
			case 28:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(435);
				boolean_();
				}
				break;
			case 29:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(436);
				match(Null);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(504);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExpressionContext(_parentctx, _parentState));
						((MulExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(439);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(440);
						match(Star);
						setState(441);
						((MulExprContext)_localctx).right = expression(40);
						}
						break;
					case 2:
						{
						_localctx = new DivExprContext(new ExpressionContext(_parentctx, _parentState));
						((DivExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(442);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(443);
						match(Div);
						setState(444);
						((DivExprContext)_localctx).right = expression(39);
						}
						break;
					case 3:
						{
						_localctx = new ModExprContext(new ExpressionContext(_parentctx, _parentState));
						((ModExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(445);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(446);
						match(Mod);
						setState(447);
						((ModExprContext)_localctx).right = expression(38);
						}
						break;
					case 4:
						{
						_localctx = new AddExprContext(new ExpressionContext(_parentctx, _parentState));
						((AddExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(448);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(449);
						match(Add);
						setState(450);
						((AddExprContext)_localctx).right = expression(37);
						}
						break;
					case 5:
						{
						_localctx = new SubExprContext(new ExpressionContext(_parentctx, _parentState));
						((SubExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(451);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(452);
						match(Sub);
						setState(453);
						((SubExprContext)_localctx).right = expression(36);
						}
						break;
					case 6:
						{
						_localctx = new ShlExprContext(new ExpressionContext(_parentctx, _parentState));
						((ShlExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(454);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(455);
						match(LeftLeft);
						setState(456);
						((ShlExprContext)_localctx).right = expression(35);
						}
						break;
					case 7:
						{
						_localctx = new AShrExprContext(new ExpressionContext(_parentctx, _parentState));
						((AShrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(457);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(458);
						match(RightRight);
						setState(459);
						((AShrExprContext)_localctx).right = expression(34);
						}
						break;
					case 8:
						{
						_localctx = new LShrExprContext(new ExpressionContext(_parentctx, _parentState));
						((LShrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(460);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(461);
						match(RightRightRight);
						setState(462);
						((LShrExprContext)_localctx).right = expression(33);
						}
						break;
					case 9:
						{
						_localctx = new GreaterExprContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(463);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(464);
						match(Greater);
						setState(465);
						((GreaterExprContext)_localctx).right = expression(32);
						}
						break;
					case 10:
						{
						_localctx = new LessExprContext(new ExpressionContext(_parentctx, _parentState));
						((LessExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(466);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(467);
						match(Less);
						setState(468);
						((LessExprContext)_localctx).right = expression(31);
						}
						break;
					case 11:
						{
						_localctx = new GreaterEqualExprContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterEqualExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(469);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(470);
						match(Greater);
						setState(471);
						match(Assign);
						setState(472);
						((GreaterEqualExprContext)_localctx).right = expression(30);
						}
						break;
					case 12:
						{
						_localctx = new LessEqualExprContext(new ExpressionContext(_parentctx, _parentState));
						((LessEqualExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(473);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(474);
						match(Less);
						setState(475);
						match(Assign);
						setState(476);
						((LessEqualExprContext)_localctx).right = expression(29);
						}
						break;
					case 13:
						{
						_localctx = new EqualExprContext(new ExpressionContext(_parentctx, _parentState));
						((EqualExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(477);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(478);
						match(Equal);
						setState(479);
						((EqualExprContext)_localctx).right = expression(28);
						}
						break;
					case 14:
						{
						_localctx = new NotEqualExprContext(new ExpressionContext(_parentctx, _parentState));
						((NotEqualExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(480);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(481);
						match(Not);
						setState(482);
						match(Assign);
						setState(483);
						((NotEqualExprContext)_localctx).right = expression(27);
						}
						break;
					case 15:
						{
						_localctx = new BitAndExprContext(new ExpressionContext(_parentctx, _parentState));
						((BitAndExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(484);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(485);
						match(And);
						setState(486);
						((BitAndExprContext)_localctx).right = expression(26);
						}
						break;
					case 16:
						{
						_localctx = new BitXorExprContext(new ExpressionContext(_parentctx, _parentState));
						((BitXorExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(487);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(488);
						match(Xor);
						setState(489);
						((BitXorExprContext)_localctx).right = expression(25);
						}
						break;
					case 17:
						{
						_localctx = new BitOrExprContext(new ExpressionContext(_parentctx, _parentState));
						((BitOrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(490);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(491);
						match(Or);
						setState(492);
						((BitOrExprContext)_localctx).right = expression(24);
						}
						break;
					case 18:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						((AndExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(493);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(494);
						match(And);
						setState(495);
						match(And);
						setState(496);
						((AndExprContext)_localctx).right = expression(23);
						}
						break;
					case 19:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						((OrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(497);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(498);
						match(Or);
						setState(499);
						match(Or);
						setState(500);
						((OrExprContext)_localctx).right = expression(22);
						}
						break;
					case 20:
						{
						_localctx = new ExprBlendContext(new ExpressionContext(_parentctx, _parentState));
						((ExprBlendContext)_localctx).parentNode = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(501);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(502);
						match(Dot);
						setState(503);
						((ExprBlendContext)_localctx).childNode = exprPtr(0);
						}
						break;
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RiddleParser.Identifier, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(Identifier);
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
	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(RiddleParser.Public, 0); }
		public TerminalNode Protected() { return getToken(RiddleParser.Protected, 0); }
		public TerminalNode Private() { return getToken(RiddleParser.Private, 0); }
		public TerminalNode Operator() { return getToken(RiddleParser.Operator, 0); }
		public TerminalNode Virtual() { return getToken(RiddleParser.Virtual, 0); }
		public TerminalNode Static() { return getToken(RiddleParser.Static, 0); }
		public TerminalNode Override() { return getToken(RiddleParser.Override, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 131596288L) != 0)) ) {
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
	public static class ModifierListContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitModifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitModifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131596288L) != 0)) {
				{
				{
				setState(513);
				modifier();
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class NumberContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public FloatContext float_() {
			return getRuleContext(FloatContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_number);
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Hexadecimal:
			case Decimal:
			case Octal:
			case Binary:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				integer();
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				float_();
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
	public static class BooleanContext extends ParserRuleContext {
		public boolean value;
		public TerminalNode True() { return getToken(RiddleParser.True, 0); }
		public TerminalNode False() { return getToken(RiddleParser.False, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean_() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_boolean);
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				match(True);
				((BooleanContext)_localctx).value = true;
				}
				break;
			case False:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(False);
				((BooleanContext)_localctx).value = false;
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
	public static class FloatContext extends ParserRuleContext {
		public double value;
		public Token Float;
		public TerminalNode Float() { return getToken(RiddleParser.Float, 0); }
		public FloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			((FloatContext)_localctx).Float = match(Float);
			((FloatContext)_localctx).value =  Double.parseDouble(((FloatContext)_localctx).Float.getText());
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
	public static class IntegerContext extends ParserRuleContext {
		public int value;
		public Token Decimal;
		public Token Hexadecimal;
		public Token Binary;
		public Token Octal;
		public TerminalNode Decimal() { return getToken(RiddleParser.Decimal, 0); }
		public TerminalNode Hexadecimal() { return getToken(RiddleParser.Hexadecimal, 0); }
		public TerminalNode Binary() { return getToken(RiddleParser.Binary, 0); }
		public TerminalNode Octal() { return getToken(RiddleParser.Octal, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_integer);
		try {
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decimal:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				((IntegerContext)_localctx).Decimal = match(Decimal);
				((IntegerContext)_localctx).value =  Integer.parseInt(((IntegerContext)_localctx).Decimal.getText());
				}
				break;
			case Hexadecimal:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				((IntegerContext)_localctx).Hexadecimal = match(Hexadecimal);
				((IntegerContext)_localctx).value =  Integer.parseInt(((IntegerContext)_localctx).Hexadecimal.getText().substring(2), 16);
				}
				break;
			case Binary:
				enterOuterAlt(_localctx, 3);
				{
				setState(536);
				((IntegerContext)_localctx).Binary = match(Binary);
				((IntegerContext)_localctx).value =  Integer.parseInt(((IntegerContext)_localctx).Binary.getText().substring(2), 2);
				}
				break;
			case Octal:
				enterOuterAlt(_localctx, 4);
				{
				setState(538);
				((IntegerContext)_localctx).Octal = match(Octal);
				((IntegerContext)_localctx).value =  Integer.parseInt(((IntegerContext)_localctx).Octal.getText().substring(1), 8);
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
	public static class TmpleDefineContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(RiddleParser.Template, 0); }
		public TerminalNode Less() { return getToken(RiddleParser.Less, 0); }
		public List<TmplDefineArgContext> tmplDefineArg() {
			return getRuleContexts(TmplDefineArgContext.class);
		}
		public TmplDefineArgContext tmplDefineArg(int i) {
			return getRuleContext(TmplDefineArgContext.class,i);
		}
		public TerminalNode Greater() { return getToken(RiddleParser.Greater, 0); }
		public List<TerminalNode> Comma() { return getTokens(RiddleParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(RiddleParser.Comma, i);
		}
		public TmpleDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmpleDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterTmpleDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitTmpleDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitTmpleDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmpleDefineContext tmpleDefine() throws RecognitionException {
		TmpleDefineContext _localctx = new TmpleDefineContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tmpleDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(Template);
			setState(543);
			match(Less);
			setState(544);
			tmplDefineArg();
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(545);
				match(Comma);
				setState(546);
				tmplDefineArg();
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552);
			match(Greater);
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
	public static class TmplDefineArgContext extends ParserRuleContext {
		public IdContext name;
		public TerminalNode TypeName() { return getToken(RiddleParser.TypeName, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeUsedContext typeUsed() {
			return getRuleContext(TypeUsedContext.class,0);
		}
		public TmplDefineArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplDefineArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterTmplDefineArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitTmplDefineArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitTmplDefineArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplDefineArgContext tmplDefineArg() throws RecognitionException {
		TmplDefineArgContext _localctx = new TmplDefineArgContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tmplDefineArg);
		try {
			setState(559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TypeName:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				match(TypeName);
				setState(555);
				((TmplDefineArgContext)_localctx).name = id();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				typeUsed(0);
				setState(557);
				((TmplDefineArgContext)_localctx).name = id();
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
	public static class TmplUsedContext extends ParserRuleContext {
		public TmplArgListContext args;
		public TerminalNode Less() { return getToken(RiddleParser.Less, 0); }
		public TerminalNode Greater() { return getToken(RiddleParser.Greater, 0); }
		public TmplArgListContext tmplArgList() {
			return getRuleContext(TmplArgListContext.class,0);
		}
		public TmplUsedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplUsed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterTmplUsed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitTmplUsed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitTmplUsed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplUsedContext tmplUsed() throws RecognitionException {
		TmplUsedContext _localctx = new TmplUsedContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tmplUsed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(Less);
			setState(562);
			((TmplUsedContext)_localctx).args = tmplArgList();
			setState(563);
			match(Greater);
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
	public static class TmplArgContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeUsedContext typeUsed() {
			return getRuleContext(TypeUsedContext.class,0);
		}
		public TmplArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterTmplArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitTmplArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitTmplArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplArgContext tmplArg() throws RecognitionException {
		TmplArgContext _localctx = new TmplArgContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tmplArg);
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				typeUsed(0);
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
	public static class TmplArgListContext extends ParserRuleContext {
		public List<TmplArgContext> tmplArg() {
			return getRuleContexts(TmplArgContext.class);
		}
		public TmplArgContext tmplArg(int i) {
			return getRuleContext(TmplArgContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(RiddleParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(RiddleParser.Comma, i);
		}
		public TmplArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterTmplArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitTmplArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitTmplArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmplArgListContext tmplArgList() throws RecognitionException {
		TmplArgListContext _localctx = new TmplArgListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tmplArgList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & 109194782663802887L) != 0)) {
				{
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(569);
						tmplArg();
						setState(570);
						match(Comma);
						}
						} 
					}
					setState(576);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(577);
				tmplArg();
				}
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
	public static class TypeUsedContext extends ParserRuleContext {
		public TypeUsedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeUsed; }
	 
		public TypeUsedContext() { }
		public void copyFrom(TypeUsedContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends TypeUsedContext {
		public TypeUsedContext baseType;
		public ExpressionContext size;
		public TerminalNode LeftSquare() { return getToken(RiddleParser.LeftSquare, 0); }
		public TerminalNode RightSquare() { return getToken(RiddleParser.RightSquare, 0); }
		public TypeUsedContext typeUsed() {
			return getRuleContext(TypeUsedContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayTypeContext(TypeUsedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TmplTypeContext extends TypeUsedContext {
		public ExprPtrContext name;
		public TmplUsedContext tmpl;
		public ExprPtrContext exprPtr() {
			return getRuleContext(ExprPtrContext.class,0);
		}
		public TmplUsedContext tmplUsed() {
			return getRuleContext(TmplUsedContext.class,0);
		}
		public TmplTypeContext(TypeUsedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterTmplType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitTmplType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitTmplType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BaseTypeContext extends TypeUsedContext {
		public ExprPtrContext name;
		public ExprPtrContext exprPtr() {
			return getRuleContext(ExprPtrContext.class,0);
		}
		public List<TerminalNode> Star() { return getTokens(RiddleParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(RiddleParser.Star, i);
		}
		public BaseTypeContext(TypeUsedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeUsedContext typeUsed() throws RecognitionException {
		return typeUsed(0);
	}

	private TypeUsedContext typeUsed(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeUsedContext _localctx = new TypeUsedContext(_ctx, _parentState);
		TypeUsedContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_typeUsed, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				_localctx = new BaseTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(581);
				((BaseTypeContext)_localctx).name = exprPtr(0);
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(582);
						match(Star);
						}
						} 
					}
					setState(587);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				}
				break;
			case 2:
				{
				_localctx = new TmplTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(588);
				((TmplTypeContext)_localctx).name = exprPtr(0);
				setState(589);
				((TmplTypeContext)_localctx).tmpl = tmplUsed();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(new TypeUsedContext(_parentctx, _parentState));
					((ArrayTypeContext)_localctx).baseType = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_typeUsed);
					setState(593);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(594);
					match(LeftSquare);
					setState(595);
					((ArrayTypeContext)_localctx).size = expression(0);
					setState(596);
					match(RightSquare);
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public List<TerminalNode> LeftSquare() { return getTokens(RiddleParser.LeftSquare); }
		public TerminalNode LeftSquare(int i) {
			return getToken(RiddleParser.LeftSquare, i);
		}
		public List<PropertyItemContext> propertyItem() {
			return getRuleContexts(PropertyItemContext.class);
		}
		public PropertyItemContext propertyItem(int i) {
			return getRuleContext(PropertyItemContext.class,i);
		}
		public List<TerminalNode> RightSquare() { return getTokens(RiddleParser.RightSquare); }
		public TerminalNode RightSquare(int i) {
			return getToken(RiddleParser.RightSquare, i);
		}
		public List<TerminalNode> Comma() { return getTokens(RiddleParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(RiddleParser.Comma, i);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(LeftSquare);
			setState(604);
			match(LeftSquare);
			setState(605);
			propertyItem();
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(606);
				match(Comma);
				setState(607);
				propertyItem();
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(613);
			match(RightSquare);
			setState(614);
			match(RightSquare);
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
	public static class PropertyItemContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RiddleParser.Identifier, 0); }
		public PropertyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterPropertyItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitPropertyItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitPropertyItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyItemContext propertyItem() throws RecognitionException {
		PropertyItemContext _localctx = new PropertyItemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_propertyItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(Identifier);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return exprPtr_sempred((ExprPtrContext)_localctx, predIndex);
		case 22:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 35:
			return typeUsed_sempred((TypeUsedContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprPtr_sempred(ExprPtrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 39);
		case 2:
			return precpred(_ctx, 38);
		case 3:
			return precpred(_ctx, 37);
		case 4:
			return precpred(_ctx, 36);
		case 5:
			return precpred(_ctx, 35);
		case 6:
			return precpred(_ctx, 34);
		case 7:
			return precpred(_ctx, 33);
		case 8:
			return precpred(_ctx, 32);
		case 9:
			return precpred(_ctx, 31);
		case 10:
			return precpred(_ctx, 30);
		case 11:
			return precpred(_ctx, 29);
		case 12:
			return precpred(_ctx, 28);
		case 13:
			return precpred(_ctx, 27);
		case 14:
			return precpred(_ctx, 26);
		case 15:
			return precpred(_ctx, 25);
		case 16:
			return precpred(_ctx, 24);
		case 17:
			return precpred(_ctx, 23);
		case 18:
			return precpred(_ctx, 22);
		case 19:
			return precpred(_ctx, 21);
		case 20:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean typeUsed_sempred(TypeUsedContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001I\u026b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0005\u0000N\b\u0000"+
		"\n\u0000\f\u0000Q\t\u0000\u0001\u0000\u0003\u0000T\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002Z\b\u0002\u0001\u0002"+
		"\u0003\u0002]\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002a\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003q\b\u0003\u0001\u0004\u0001\u0004\u0005"+
		"\u0004u\b\u0004\n\u0004\f\u0004x\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0093"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0098\b\b\n\b\f\b\u009b\t\b\u0001"+
		"\b\u0003\b\u009e\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a5"+
		"\b\t\n\t\f\t\u00a8\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ae\b"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b6\b\t\n"+
		"\t\f\t\u00b9\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00cb\b\t\u0001\n\u0003\n\u00ce\b\n\u0001\n\u0003\n\u00d1\b"+
		"\n\u0001\n\u0003\n\u00d4\b\n\u0001\n\u0003\n\u00d7\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e2"+
		"\b\n\u0001\n\u0001\n\u0003\n\u00e6\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00eb\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ef\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00f3\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0112\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0116\b\u0010\u0001\u0011\u0003\u0011\u0119\b\u0011\u0001\u0011\u0003"+
		"\u0011\u011c\b\u0011\u0001\u0011\u0003\u0011\u011f\b\u0011\u0001\u0011"+
		"\u0003\u0011\u0122\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0128\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u012f\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u013b\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0142\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0147\b\u0014\n\u0014\f\u0014\u014a\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01b6\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u01f9"+
		"\b\u0016\n\u0016\f\u0016\u01fc\t\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0005\u0019\u0203\b\u0019\n\u0019\f\u0019\u0206"+
		"\t\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u020a\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0210\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u021d\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u0224\b\u001e\n\u001e\f\u001e\u0227\t\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0230"+
		"\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0003!\u0238\b!\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u023d\b\"\n\"\f\"\u0240\t\"\u0001\"\u0003\""+
		"\u0243\b\"\u0001#\u0001#\u0001#\u0005#\u0248\b#\n#\f#\u024b\t#\u0001#"+
		"\u0001#\u0001#\u0003#\u0250\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005"+
		"#\u0257\b#\n#\f#\u025a\t#\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u0261"+
		"\b$\n$\f$\u0264\t$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0000\u0003"+
		"(,F&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0002\u0002\u0000$$99"+
		"\u0002\u0000\u0013\u0014\u0016\u001a\u02b4\u0000S\u0001\u0000\u0000\u0000"+
		"\u0002U\u0001\u0000\u0000\u0000\u0004`\u0001\u0000\u0000\u0000\u0006p"+
		"\u0001\u0000\u0000\u0000\br\u0001\u0000\u0000\u0000\n{\u0001\u0000\u0000"+
		"\u0000\f~\u0001\u0000\u0000\u0000\u000e\u0092\u0001\u0000\u0000\u0000"+
		"\u0010\u009d\u0001\u0000\u0000\u0000\u0012\u00ca\u0001\u0000\u0000\u0000"+
		"\u0014\u00cd\u0001\u0000\u0000\u0000\u0016\u00e7\u0001\u0000\u0000\u0000"+
		"\u0018\u00f7\u0001\u0000\u0000\u0000\u001a\u00fd\u0001\u0000\u0000\u0000"+
		"\u001c\u00ff\u0001\u0000\u0000\u0000\u001e\u0111\u0001\u0000\u0000\u0000"+
		" \u0113\u0001\u0000\u0000\u0000\"\u0118\u0001\u0000\u0000\u0000$\u012b"+
		"\u0001\u0000\u0000\u0000&\u0132\u0001\u0000\u0000\u0000(\u0141\u0001\u0000"+
		"\u0000\u0000*\u014b\u0001\u0000\u0000\u0000,\u01b5\u0001\u0000\u0000\u0000"+
		".\u01fd\u0001\u0000\u0000\u00000\u01ff\u0001\u0000\u0000\u00002\u0204"+
		"\u0001\u0000\u0000\u00004\u0209\u0001\u0000\u0000\u00006\u020f\u0001\u0000"+
		"\u0000\u00008\u0211\u0001\u0000\u0000\u0000:\u021c\u0001\u0000\u0000\u0000"+
		"<\u021e\u0001\u0000\u0000\u0000>\u022f\u0001\u0000\u0000\u0000@\u0231"+
		"\u0001\u0000\u0000\u0000B\u0237\u0001\u0000\u0000\u0000D\u0242\u0001\u0000"+
		"\u0000\u0000F\u024f\u0001\u0000\u0000\u0000H\u025b\u0001\u0000\u0000\u0000"+
		"J\u0268\u0001\u0000\u0000\u0000LN\u0003\u0004\u0002\u0000ML\u0001\u0000"+
		"\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PT\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"RT\u0005\u0000\u0000\u0001SO\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000"+
		"\u0000T\u0001\u0001\u0000\u0000\u0000UV\u0007\u0000\u0000\u0000V\u0003"+
		"\u0001\u0000\u0000\u0000WY\u0003\u0006\u0003\u0000XZ\u0005$\u0000\u0000"+
		"YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000"+
		"\u0000[]\u00059\u0000\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]a\u0001\u0000\u0000\u0000^a\u0005$\u0000\u0000_a\u00059\u0000"+
		"\u0000`W\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000"+
		"\u0000\u0000a\u0005\u0001\u0000\u0000\u0000bq\u0003\n\u0005\u0000cq\u0003"+
		"\f\u0006\u0000dq\u0003\"\u0011\u0000eq\u0003\u0014\n\u0000fq\u0003\u000e"+
		"\u0007\u0000gq\u0003\u0016\u000b\u0000hq\u0003\u0018\f\u0000iq\u0003\u001e"+
		"\u000f\u0000jq\u0003 \u0010\u0000kq\u0003\u001a\r\u0000lq\u0003\u001c"+
		"\u000e\u0000mq\u0003$\u0012\u0000nq\u0003,\u0016\u0000oq\u0003\b\u0004"+
		"\u0000pb\u0001\u0000\u0000\u0000pc\u0001\u0000\u0000\u0000pd\u0001\u0000"+
		"\u0000\u0000pe\u0001\u0000\u0000\u0000pf\u0001\u0000\u0000\u0000pg\u0001"+
		"\u0000\u0000\u0000ph\u0001\u0000\u0000\u0000pi\u0001\u0000\u0000\u0000"+
		"pj\u0001\u0000\u0000\u0000pk\u0001\u0000\u0000\u0000pl\u0001\u0000\u0000"+
		"\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000q\u0007\u0001\u0000\u0000\u0000rv\u0005!\u0000\u0000su\u0003"+
		"\u0004\u0002\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000yz\u0005\"\u0000\u0000z\t\u0001\u0000"+
		"\u0000\u0000{|\u0005\f\u0000\u0000|}\u0003.\u0017\u0000}\u000b\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005\u000b\u0000\u0000\u007f\u0080\u0003.\u0017\u0000"+
		"\u0080\r\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0001\u0000\u0000\u0082"+
		"\u0083\u0003.\u0017\u0000\u0083\u0084\u0005#\u0000\u0000\u0084\u0085\u0003"+
		"F#\u0000\u0085\u0093\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0001\u0000"+
		"\u0000\u0087\u0088\u0003.\u0017\u0000\u0088\u0089\u0005\'\u0000\u0000"+
		"\u0089\u008a\u0003,\u0016\u0000\u008a\u0093\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005\u0001\u0000\u0000\u008c\u008d\u0003.\u0017\u0000\u008d\u008e"+
		"\u0005#\u0000\u0000\u008e\u008f\u0003F#\u0000\u008f\u0090\u0005\'\u0000"+
		"\u0000\u0090\u0091\u0003,\u0016\u0000\u0091\u0093\u0001\u0000\u0000\u0000"+
		"\u0092\u0081\u0001\u0000\u0000\u0000\u0092\u0086\u0001\u0000\u0000\u0000"+
		"\u0092\u008b\u0001\u0000\u0000\u0000\u0093\u000f\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0003,\u0016\u0000\u0095\u0096\u0005%\u0000\u0000\u0096\u0098"+
		"\u0001\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0098\u009b"+
		"\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\u0003,\u0016\u0000\u009d\u0099\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u0011\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0003.\u0017\u0000\u00a0\u00a1\u0005#\u0000"+
		"\u0000\u00a1\u00a2\u0003F#\u0000\u00a2\u00a3\u0005%\u0000\u0000\u00a3"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a4\u009f\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0003.\u0017\u0000\u00aa\u00ab"+
		"\u0005#\u0000\u0000\u00ab\u00ac\u0003F#\u0000\u00ac\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ad\u00a6\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00cb\u0006\t\uffff"+
		"\uffff\u0000\u00b0\u00b1\u0003.\u0017\u0000\u00b1\u00b2\u0005#\u0000\u0000"+
		"\u00b2\u00b3\u0003F#\u0000\u00b3\u00b4\u0005%\u0000\u0000\u00b4\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000\u00b6\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b7"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003.\u0017\u0000\u00bb\u00bc\u0005"+
		"#\u0000\u0000\u00bc\u00bd\u0003F#\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0005%\u0000\u0000\u00bf\u00c0\u00056\u0000\u0000\u00c0"+
		"\u00c1\u00056\u0000\u0000\u00c1\u00c2\u00056\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0006\t\uffff\uffff\u0000\u00c4\u00cb\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u00056\u0000\u0000\u00c6\u00c7\u00056\u0000"+
		"\u0000\u00c7\u00c8\u00056\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c9\u00cb\u0006\t\uffff\uffff\u0000\u00ca\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ca\u00b7\u0001\u0000\u0000\u0000\u00ca\u00c5\u0001\u0000\u0000\u0000"+
		"\u00cb\u0013\u0001\u0000\u0000\u0000\u00cc\u00ce\u0003H$\u0000\u00cd\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d1\u00059\u0000\u0000\u00d0\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d4\u0003<\u001e\u0000\u00d3\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d7\u00059\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u00032\u0019\u0000\u00d9\u00da\u0005\t\u0000\u0000"+
		"\u00da\u00db\u0003.\u0017\u0000\u00db\u00dc\u0005\u001d\u0000\u0000\u00dc"+
		"\u00dd\u0003\u0012\t\u0000\u00dd\u00e1\u0005\u001e\u0000\u0000\u00de\u00df"+
		"\u0005.\u0000\u0000\u00df\u00e0\u0005(\u0000\u0000\u00e0\u00e2\u0003F"+
		"#\u0000\u00e1\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e6\u0003\b\u0004\u0000"+
		"\u00e4\u00e6\u0005$\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e6\u0015\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0005\u0003\u0000\u0000\u00e8\u00ea\u0005\u001d\u0000\u0000\u00e9"+
		"\u00eb\u0003\u0006\u0003\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ee\u0005$\u0000\u0000\u00ed\u00ef\u0003\u0006\u0003\u0000\u00ee\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f2\u0005$\u0000\u0000\u00f1\u00f3\u0003"+
		"\u0006\u0003\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005"+
		"\u001e\u0000\u0000\u00f5\u00f6\u0003\u0004\u0002\u0000\u00f6\u0017\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005\u0004\u0000\u0000\u00f8\u00f9\u0005"+
		"\u001d\u0000\u0000\u00f9\u00fa\u0003,\u0016\u0000\u00fa\u00fb\u0005\u001e"+
		"\u0000\u0000\u00fb\u00fc\u0003\u0004\u0002\u0000\u00fc\u0019\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0005\u0005\u0000\u0000\u00fe\u001b\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0005\u0006\u0000\u0000\u0100\u001d\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0005\u0007\u0000\u0000\u0102\u0103\u0005\u001d"+
		"\u0000\u0000\u0103\u0104\u0003,\u0016\u0000\u0104\u0105\u0005\u001e\u0000"+
		"\u0000\u0105\u0106\u0003\u0004\u0002\u0000\u0106\u0107\u0006\u000f\uffff"+
		"\uffff\u0000\u0107\u0112\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u0007"+
		"\u0000\u0000\u0109\u010a\u0005\u001d\u0000\u0000\u010a\u010b\u0003,\u0016"+
		"\u0000\u010b\u010c\u0005\u001e\u0000\u0000\u010c\u010d\u0003\u0004\u0002"+
		"\u0000\u010d\u010e\u0005\b\u0000\u0000\u010e\u010f\u0003\u0004\u0002\u0000"+
		"\u010f\u0110\u0006\u000f\uffff\uffff\u0000\u0110\u0112\u0001\u0000\u0000"+
		"\u0000\u0111\u0101\u0001\u0000\u0000\u0000\u0111\u0108\u0001\u0000\u0000"+
		"\u0000\u0112\u001f\u0001\u0000\u0000\u0000\u0113\u0115\u0005\n\u0000\u0000"+
		"\u0114\u0116\u0003\u0006\u0003\u0000\u0115\u0114\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0001\u0000\u0000\u0000\u0116!\u0001\u0000\u0000\u0000\u0117"+
		"\u0119\u0003H$\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0118\u0119\u0001"+
		"\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u011c\u0005"+
		"9\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000"+
		"\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011f\u0003<\u001e"+
		"\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000"+
		"\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u0122\u00059\u0000\u0000"+
		"\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0005\r\u0000\u0000\u0124"+
		"\u0127\u0003.\u0017\u0000\u0125\u0126\u0005#\u0000\u0000\u0126\u0128\u0003"+
		".\u0017\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0003\b\u0004"+
		"\u0000\u012a#\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u0011\u0000\u0000"+
		"\u012c\u012e\u0003\b\u0004\u0000\u012d\u012f\u0003\u0002\u0001\u0000\u012e"+
		"\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0003&\u0013\u0000\u0131%\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0005\u0012\u0000\u0000\u0133\u0134\u0005"+
		"\u001d\u0000\u0000\u0134\u0135\u0003\u000e\u0007\u0000\u0135\u0136\u0005"+
		"\u001e\u0000\u0000\u0136\'\u0001\u0000\u0000\u0000\u0137\u0138\u0006\u0014"+
		"\uffff\uffff\u0000\u0138\u013a\u0003.\u0017\u0000\u0139\u013b\u0003@ "+
		"\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u001d\u0000"+
		"\u0000\u013d\u013e\u0003\u0010\b\u0000\u013e\u013f\u0005\u001e\u0000\u0000"+
		"\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u0142\u0003.\u0017\u0000\u0141"+
		"\u0137\u0001\u0000\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142"+
		"\u0148\u0001\u0000\u0000\u0000\u0143\u0144\n\u0001\u0000\u0000\u0144\u0145"+
		"\u00056\u0000\u0000\u0145\u0147\u0003(\u0014\u0002\u0146\u0143\u0001\u0000"+
		"\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149)\u0001\u0000\u0000"+
		"\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u014c\u0003(\u0014\u0000"+
		"\u014c+\u0001\u0000\u0000\u0000\u014d\u014e\u0006\u0016\uffff\uffff\u0000"+
		"\u014e\u014f\u0005)\u0000\u0000\u014f\u0150\u0003F#\u0000\u0150\u0151"+
		"\u0005(\u0000\u0000\u0151\u0152\u0005\u001d\u0000\u0000\u0152\u0153\u0003"+
		"*\u0015\u0000\u0153\u0154\u0005\u001e\u0000\u0000\u0154\u01b6\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0005\u001d\u0000\u0000\u0156\u0157\u0003,\u0016"+
		"\u0000\u0157\u0158\u0005\u001e\u0000\u0000\u0158\u01b6\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u00052\u0000\u0000\u015a\u01b6\u0003,\u0016/\u015b"+
		"\u015c\u0005-\u0000\u0000\u015c\u01b6\u0003,\u0016.\u015d\u015e\u0005"+
		".\u0000\u0000\u015e\u01b6\u0003,\u0016-\u015f\u0160\u0005-\u0000\u0000"+
		"\u0160\u0161\u0005-\u0000\u0000\u0161\u01b6\u0003*\u0015\u0000\u0162\u0163"+
		"\u0003*\u0015\u0000\u0163\u0164\u0005-\u0000\u0000\u0164\u0165\u0005-"+
		"\u0000\u0000\u0165\u01b6\u0001\u0000\u0000\u0000\u0166\u0167\u0005.\u0000"+
		"\u0000\u0167\u0168\u0005.\u0000\u0000\u0168\u01b6\u0003*\u0015\u0000\u0169"+
		"\u016a\u0003*\u0015\u0000\u016a\u016b\u0005.\u0000\u0000\u016b\u016c\u0005"+
		".\u0000\u0000\u016c\u01b6\u0001\u0000\u0000\u0000\u016d\u01b6\u0003(\u0014"+
		"\u0000\u016e\u016f\u0003*\u0015\u0000\u016f\u0170\u0005\'\u0000\u0000"+
		"\u0170\u0171\u0003,\u0016\u0014\u0171\u01b6\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0003*\u0015\u0000\u0173\u0174\u0005-\u0000\u0000\u0174\u0175\u0005"+
		"\'\u0000\u0000\u0175\u0176\u0003,\u0016\u0013\u0176\u01b6\u0001\u0000"+
		"\u0000\u0000\u0177\u0178\u0003*\u0015\u0000\u0178\u0179\u0005.\u0000\u0000"+
		"\u0179\u017a\u0005\'\u0000\u0000\u017a\u017b\u0003,\u0016\u0012\u017b"+
		"\u01b6\u0001\u0000\u0000\u0000\u017c\u017d\u0003*\u0015\u0000\u017d\u017e"+
		"\u0005/\u0000\u0000\u017e\u017f\u0005\'\u0000\u0000\u017f\u0180\u0003"+
		",\u0016\u0011\u0180\u01b6\u0001\u0000\u0000\u0000\u0181\u0182\u0003*\u0015"+
		"\u0000\u0182\u0183\u00050\u0000\u0000\u0183\u0184\u0005\'\u0000\u0000"+
		"\u0184\u0185\u0003,\u0016\u0010\u0185\u01b6\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0003*\u0015\u0000\u0187\u0188\u00051\u0000\u0000\u0188\u0189\u0005"+
		"\'\u0000\u0000\u0189\u018a\u0003,\u0016\u000f\u018a\u01b6\u0001\u0000"+
		"\u0000\u0000\u018b\u018c\u0003*\u0015\u0000\u018c\u018d\u0005-\u0000\u0000"+
		"\u018d\u018e\u0005\'\u0000\u0000\u018e\u018f\u0003,\u0016\u000e\u018f"+
		"\u01b6\u0001\u0000\u0000\u0000\u0190\u0191\u0003*\u0015\u0000\u0191\u0192"+
		"\u00053\u0000\u0000\u0192\u0193\u0005\'\u0000\u0000\u0193\u0194\u0003"+
		",\u0016\r\u0194\u01b6\u0001\u0000\u0000\u0000\u0195\u0196\u0003*\u0015"+
		"\u0000\u0196\u0197\u00054\u0000\u0000\u0197\u0198\u0005\'\u0000\u0000"+
		"\u0198\u0199\u0003,\u0016\f\u0199\u01b6\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0003*\u0015\u0000\u019b\u019c\u00055\u0000\u0000\u019c\u019d\u0005"+
		"\'\u0000\u0000\u019d\u019e\u0003,\u0016\u000b\u019e\u01b6\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0003*\u0015\u0000\u01a0\u01a1\u0005*\u0000\u0000"+
		"\u01a1\u01a2\u0005\'\u0000\u0000\u01a2\u01a3\u0003,\u0016\n\u01a3\u01b6"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0003*\u0015\u0000\u01a5\u01a6\u0005"+
		"+\u0000\u0000\u01a6\u01a7\u0005\'\u0000\u0000\u01a7\u01a8\u0003,\u0016"+
		"\t\u01a8\u01b6\u0001\u0000\u0000\u0000\u01a9\u01aa\u0003*\u0015\u0000"+
		"\u01aa\u01ab\u0005,\u0000\u0000\u01ab\u01ac\u0005\'\u0000\u0000\u01ac"+
		"\u01ad\u0003,\u0016\b\u01ad\u01b6\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0005/\u0000\u0000\u01af\u01b6\u0003,\u0016\u0006\u01b0\u01b6\u0005E"+
		"\u0000\u0000\u01b1\u01b6\u0005F\u0000\u0000\u01b2\u01b6\u00034\u001a\u0000"+
		"\u01b3\u01b6\u00036\u001b\u0000\u01b4\u01b6\u0005\u0010\u0000\u0000\u01b5"+
		"\u014d\u0001\u0000\u0000\u0000\u01b5\u0155\u0001\u0000\u0000\u0000\u01b5"+
		"\u0159\u0001\u0000\u0000\u0000\u01b5\u015b\u0001\u0000\u0000\u0000\u01b5"+
		"\u015d\u0001\u0000\u0000\u0000\u01b5\u015f\u0001\u0000\u0000\u0000\u01b5"+
		"\u0162\u0001\u0000\u0000\u0000\u01b5\u0166\u0001\u0000\u0000\u0000\u01b5"+
		"\u0169\u0001\u0000\u0000\u0000\u01b5\u016d\u0001\u0000\u0000\u0000\u01b5"+
		"\u016e\u0001\u0000\u0000\u0000\u01b5\u0172\u0001\u0000\u0000\u0000\u01b5"+
		"\u0177\u0001\u0000\u0000\u0000\u01b5\u017c\u0001\u0000\u0000\u0000\u01b5"+
		"\u0181\u0001\u0000\u0000\u0000\u01b5\u0186\u0001\u0000\u0000\u0000\u01b5"+
		"\u018b\u0001\u0000\u0000\u0000\u01b5\u0190\u0001\u0000\u0000\u0000\u01b5"+
		"\u0195\u0001\u0000\u0000\u0000\u01b5\u019a\u0001\u0000\u0000\u0000\u01b5"+
		"\u019f\u0001\u0000\u0000\u0000\u01b5\u01a4\u0001\u0000\u0000\u0000\u01b5"+
		"\u01a9\u0001\u0000\u0000\u0000\u01b5\u01ae\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b5\u01b1\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b6\u01fa\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\n\'\u0000\u0000\u01b8\u01b9\u0005/\u0000\u0000\u01b9\u01f9\u0003"+
		",\u0016(\u01ba\u01bb\n&\u0000\u0000\u01bb\u01bc\u00050\u0000\u0000\u01bc"+
		"\u01f9\u0003,\u0016\'\u01bd\u01be\n%\u0000\u0000\u01be\u01bf\u00051\u0000"+
		"\u0000\u01bf\u01f9\u0003,\u0016&\u01c0\u01c1\n$\u0000\u0000\u01c1\u01c2"+
		"\u0005-\u0000\u0000\u01c2\u01f9\u0003,\u0016%\u01c3\u01c4\n#\u0000\u0000"+
		"\u01c4\u01c5\u0005.\u0000\u0000\u01c5\u01f9\u0003,\u0016$\u01c6\u01c7"+
		"\n\"\u0000\u0000\u01c7\u01c8\u0005*\u0000\u0000\u01c8\u01f9\u0003,\u0016"+
		"#\u01c9\u01ca\n!\u0000\u0000\u01ca\u01cb\u0005+\u0000\u0000\u01cb\u01f9"+
		"\u0003,\u0016\"\u01cc\u01cd\n \u0000\u0000\u01cd\u01ce\u0005,\u0000\u0000"+
		"\u01ce\u01f9\u0003,\u0016!\u01cf\u01d0\n\u001f\u0000\u0000\u01d0\u01d1"+
		"\u0005(\u0000\u0000\u01d1\u01f9\u0003,\u0016 \u01d2\u01d3\n\u001e\u0000"+
		"\u0000\u01d3\u01d4\u0005)\u0000\u0000\u01d4\u01f9\u0003,\u0016\u001f\u01d5"+
		"\u01d6\n\u001d\u0000\u0000\u01d6\u01d7\u0005(\u0000\u0000\u01d7\u01d8"+
		"\u0005\'\u0000\u0000\u01d8\u01f9\u0003,\u0016\u001e\u01d9\u01da\n\u001c"+
		"\u0000\u0000\u01da\u01db\u0005)\u0000\u0000\u01db\u01dc\u0005\'\u0000"+
		"\u0000\u01dc\u01f9\u0003,\u0016\u001d\u01dd\u01de\n\u001b\u0000\u0000"+
		"\u01de\u01df\u0005&\u0000\u0000\u01df\u01f9\u0003,\u0016\u001c\u01e0\u01e1"+
		"\n\u001a\u0000\u0000\u01e1\u01e2\u00052\u0000\u0000\u01e2\u01e3\u0005"+
		"\'\u0000\u0000\u01e3\u01f9\u0003,\u0016\u001b\u01e4\u01e5\n\u0019\u0000"+
		"\u0000\u01e5\u01e6\u00053\u0000\u0000\u01e6\u01f9\u0003,\u0016\u001a\u01e7"+
		"\u01e8\n\u0018\u0000\u0000\u01e8\u01e9\u00055\u0000\u0000\u01e9\u01f9"+
		"\u0003,\u0016\u0019\u01ea\u01eb\n\u0017\u0000\u0000\u01eb\u01ec\u0005"+
		"4\u0000\u0000\u01ec\u01f9\u0003,\u0016\u0018\u01ed\u01ee\n\u0016\u0000"+
		"\u0000\u01ee\u01ef\u00053\u0000\u0000\u01ef\u01f0\u00053\u0000\u0000\u01f0"+
		"\u01f9\u0003,\u0016\u0017\u01f1\u01f2\n\u0015\u0000\u0000\u01f2\u01f3"+
		"\u00054\u0000\u0000\u01f3\u01f4\u00054\u0000\u0000\u01f4\u01f9\u0003,"+
		"\u0016\u0016\u01f5\u01f6\n\u0007\u0000\u0000\u01f6\u01f7\u00056\u0000"+
		"\u0000\u01f7\u01f9\u0003(\u0014\u0000\u01f8\u01b7\u0001\u0000\u0000\u0000"+
		"\u01f8\u01ba\u0001\u0000\u0000\u0000\u01f8\u01bd\u0001\u0000\u0000\u0000"+
		"\u01f8\u01c0\u0001\u0000\u0000\u0000\u01f8\u01c3\u0001\u0000\u0000\u0000"+
		"\u01f8\u01c6\u0001\u0000\u0000\u0000\u01f8\u01c9\u0001\u0000\u0000\u0000"+
		"\u01f8\u01cc\u0001\u0000\u0000\u0000\u01f8\u01cf\u0001\u0000\u0000\u0000"+
		"\u01f8\u01d2\u0001\u0000\u0000\u0000\u01f8\u01d5\u0001\u0000\u0000\u0000"+
		"\u01f8\u01d9\u0001\u0000\u0000\u0000\u01f8\u01dd\u0001\u0000\u0000\u0000"+
		"\u01f8\u01e0\u0001\u0000\u0000\u0000\u01f8\u01e4\u0001\u0000\u0000\u0000"+
		"\u01f8\u01e7\u0001\u0000\u0000\u0000\u01f8\u01ea\u0001\u0000\u0000\u0000"+
		"\u01f8\u01ed\u0001\u0000\u0000\u0000\u01f8\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f5\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fb-\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0005:\u0000\u0000\u01fe/\u0001\u0000\u0000\u0000\u01ff\u0200\u0007"+
		"\u0001\u0000\u0000\u02001\u0001\u0000\u0000\u0000\u0201\u0203\u00030\u0018"+
		"\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0203\u0206\u0001\u0000\u0000"+
		"\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000"+
		"\u0000\u02053\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000"+
		"\u0207\u020a\u0003:\u001d\u0000\u0208\u020a\u00038\u001c\u0000\u0209\u0207"+
		"\u0001\u0000\u0000\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u020a5\u0001"+
		"\u0000\u0000\u0000\u020b\u020c\u0005\u000e\u0000\u0000\u020c\u0210\u0006"+
		"\u001b\uffff\uffff\u0000\u020d\u020e\u0005\u000f\u0000\u0000\u020e\u0210"+
		"\u0006\u001b\uffff\uffff\u0000\u020f\u020b\u0001\u0000\u0000\u0000\u020f"+
		"\u020d\u0001\u0000\u0000\u0000\u02107\u0001\u0000\u0000\u0000\u0211\u0212"+
		"\u0005?\u0000\u0000\u0212\u0213\u0006\u001c\uffff\uffff\u0000\u02139\u0001"+
		"\u0000\u0000\u0000\u0214\u0215\u0005<\u0000\u0000\u0215\u021d\u0006\u001d"+
		"\uffff\uffff\u0000\u0216\u0217\u0005;\u0000\u0000\u0217\u021d\u0006\u001d"+
		"\uffff\uffff\u0000\u0218\u0219\u0005>\u0000\u0000\u0219\u021d\u0006\u001d"+
		"\uffff\uffff\u0000\u021a\u021b\u0005=\u0000\u0000\u021b\u021d\u0006\u001d"+
		"\uffff\uffff\u0000\u021c\u0214\u0001\u0000\u0000\u0000\u021c\u0216\u0001"+
		"\u0000\u0000\u0000\u021c\u0218\u0001\u0000\u0000\u0000\u021c\u021a\u0001"+
		"\u0000\u0000\u0000\u021d;\u0001\u0000\u0000\u0000\u021e\u021f\u0005\u001b"+
		"\u0000\u0000\u021f\u0220\u0005)\u0000\u0000\u0220\u0225\u0003>\u001f\u0000"+
		"\u0221\u0222\u0005%\u0000\u0000\u0222\u0224\u0003>\u001f\u0000\u0223\u0221"+
		"\u0001\u0000\u0000\u0000\u0224\u0227\u0001\u0000\u0000\u0000\u0225\u0223"+
		"\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u0228"+
		"\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0228\u0229"+
		"\u0005(\u0000\u0000\u0229=\u0001\u0000\u0000\u0000\u022a\u022b\u0005\u001c"+
		"\u0000\u0000\u022b\u0230\u0003.\u0017\u0000\u022c\u022d\u0003F#\u0000"+
		"\u022d\u022e\u0003.\u0017\u0000\u022e\u0230\u0001\u0000\u0000\u0000\u022f"+
		"\u022a\u0001\u0000\u0000\u0000\u022f\u022c\u0001\u0000\u0000\u0000\u0230"+
		"?\u0001\u0000\u0000\u0000\u0231\u0232\u0005)\u0000\u0000\u0232\u0233\u0003"+
		"D\"\u0000\u0233\u0234\u0005(\u0000\u0000\u0234A\u0001\u0000\u0000\u0000"+
		"\u0235\u0238\u0003,\u0016\u0000\u0236\u0238\u0003F#\u0000\u0237\u0235"+
		"\u0001\u0000\u0000\u0000\u0237\u0236\u0001\u0000\u0000\u0000\u0238C\u0001"+
		"\u0000\u0000\u0000\u0239\u023a\u0003B!\u0000\u023a\u023b\u0005%\u0000"+
		"\u0000\u023b\u023d\u0001\u0000\u0000\u0000\u023c\u0239\u0001\u0000\u0000"+
		"\u0000\u023d\u0240\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000"+
		"\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0241\u0001\u0000\u0000"+
		"\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0241\u0243\u0003B!\u0000\u0242"+
		"\u023e\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243"+
		"E\u0001\u0000\u0000\u0000\u0244\u0245\u0006#\uffff\uffff\u0000\u0245\u0249"+
		"\u0003(\u0014\u0000\u0246\u0248\u0005/\u0000\u0000\u0247\u0246\u0001\u0000"+
		"\u0000\u0000\u0248\u024b\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000"+
		"\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u0250\u0001\u0000"+
		"\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024c\u024d\u0003(\u0014"+
		"\u0000\u024d\u024e\u0003@ \u0000\u024e\u0250\u0001\u0000\u0000\u0000\u024f"+
		"\u0244\u0001\u0000\u0000\u0000\u024f\u024c\u0001\u0000\u0000\u0000\u0250"+
		"\u0258\u0001\u0000\u0000\u0000\u0251\u0252\n\u0001\u0000\u0000\u0252\u0253"+
		"\u0005\u001f\u0000\u0000\u0253\u0254\u0003,\u0016\u0000\u0254\u0255\u0005"+
		" \u0000\u0000\u0255\u0257\u0001\u0000\u0000\u0000\u0256\u0251\u0001\u0000"+
		"\u0000\u0000\u0257\u025a\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000"+
		"\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259G\u0001\u0000\u0000"+
		"\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025b\u025c\u0005\u001f\u0000"+
		"\u0000\u025c\u025d\u0005\u001f\u0000\u0000\u025d\u0262\u0003J%\u0000\u025e"+
		"\u025f\u0005%\u0000\u0000\u025f\u0261\u0003J%\u0000\u0260\u025e\u0001"+
		"\u0000\u0000\u0000\u0261\u0264\u0001\u0000\u0000\u0000\u0262\u0260\u0001"+
		"\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0265\u0001"+
		"\u0000\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0265\u0266\u0005"+
		" \u0000\u0000\u0266\u0267\u0005 \u0000\u0000\u0267I\u0001\u0000\u0000"+
		"\u0000\u0268\u0269\u0005:\u0000\u0000\u0269K\u0001\u0000\u0000\u00002"+
		"OSY\\`pv\u0092\u0099\u009d\u00a6\u00ad\u00b7\u00ca\u00cd\u00d0\u00d3\u00d6"+
		"\u00e1\u00e5\u00ea\u00ee\u00f2\u0111\u0115\u0118\u011b\u011e\u0121\u0127"+
		"\u012e\u013a\u0141\u0148\u01b5\u01f8\u01fa\u0204\u0209\u020f\u021c\u0225"+
		"\u022f\u0237\u023e\u0242\u0249\u024f\u0258\u0262";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}