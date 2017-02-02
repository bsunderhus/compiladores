// Generated from Grammar.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, WS=38, BlockComment=39, 
		LineComment=40, PALAVRA_RESERVADA=41, OPERADOR_NAO=42, OPERADOR_RELACIONAL=43, 
		OPERADOR_ARITIMETICA=44, OPERADOR_SOMA=45, OPERADOR_SUB=46, OPERADOR_LOGICO=47, 
		OPERADOR_BIT_A_BIT=48, LOGICO=49, LITERAL=50, CARACTERE=51, ATRIBUICAO=52, 
		IDENTIFICADOR=53, SIMBOLO_ESPECIAL=54, REAL=55, INTEIRO=56, DESCONHECIDO=57;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "WS", "BlockComment", "LineComment", 
		"PALAVRA_RESERVADA", "OPERADOR_NAO", "OPERADOR_RELACIONAL", "OPERADOR_ARITIMETICA", 
		"OPERADOR_SOMA", "OPERADOR_SUB", "OPERADOR_LOGICO", "OPERADOR_BIT_A_BIT", 
		"LOGICO", "LITERAL", "CARACTERE", "ATRIBUICAO", "IDENTIFICADOR", "SIMBOLO_ESPECIAL", 
		"DECIMAL", "OCTAL", "HEX", "BINARY", "REAL", "INTEIRO", "DESCONHECIDO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'algoritmo'", "';'", "'variaveis'", "'fim_variaveis'", "','", "':'", 
		"'inteiro'", "'real'", "'caractere'", "'literal'", "'logico'", "'matriz'", 
		"'['", "']'", "'de'", "'inteiros'", "'reais'", "'caracteres'", "'literais'", 
		"'logicos'", "'inicio'", "'fim'", "'retorne'", "'se'", "'entao'", "'senao'", 
		"'fim_se'", "'enquanto'", "'faca'", "'fim_enquanto'", "'para'", "'ate'", 
		"'fim_para'", "'passo'", "'('", "')'", "'funcao'", null, null, null, null, 
		"'nao'", null, null, "'+'", "'-'", null, null, null, null, null, "':='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "WS", "BlockComment", "LineComment", "PALAVRA_RESERVADA", 
		"OPERADOR_NAO", "OPERADOR_RELACIONAL", "OPERADOR_ARITIMETICA", "OPERADOR_SOMA", 
		"OPERADOR_SUB", "OPERADOR_LOGICO", "OPERADOR_BIT_A_BIT", "LOGICO", "LITERAL", 
		"CARACTERE", "ATRIBUICAO", "IDENTIFICADOR", "SIMBOLO_ESPECIAL", "REAL", 
		"INTEIRO", "DESCONHECIDO"
	};
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2;\u02ca\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3\'\6\'\u016d\n\'\r\'\16\'\u016e\3\'\3\'\3(\3(\3(\3(\7(\u0177"+
		"\n(\f(\16(\u017a\13(\3(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u0185\n)\f)\16)\u0188"+
		"\13)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u024e\n*\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\5,\u025d\n,\3-\3-\3-\3-\3-\5-\u0264\n-\3.\3.\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0271\n\60\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u0284\n\62\3\63\3\63\3\63\3\63\7\63\u028a\n\63\f\63\16\63\u028d"+
		"\13\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u0295\n\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\66\3\66\7\66\u029e\n\66\f\66\16\66\u02a1\13\66\3\67\3\67\3"+
		"8\68\u02a6\n8\r8\168\u02a7\39\39\39\69\u02ad\n9\r9\169\u02ae\3:\3:\3:"+
		"\6:\u02b4\n:\r:\16:\u02b5\3;\3;\3;\6;\u02bb\n;\r;\16;\u02bc\3<\3<\3<\3"+
		"<\3=\3=\3=\3=\5=\u02c7\n=\3>\3>\3\u0178\2?\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o\2q\2s\2u\2w9y:{;\3\2\21\5"+
		"\2\13\f\17\17\"\"\4\2\f\f\17\17\5\2\'\',,\61\61\5\2((``~~\3\2$$\5\2C\\"+
		"aac|\6\2\62;C\\aac|\7\2*+..<=]]__\3\2\62;\4\2EEee\3\2\629\4\2ZZzz\5\2"+
		"\62;CHch\4\2DDdd\3\2\62\63\u02fc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}"+
		"\3\2\2\2\5\u0087\3\2\2\2\7\u0089\3\2\2\2\t\u0093\3\2\2\2\13\u00a1\3\2"+
		"\2\2\r\u00a3\3\2\2\2\17\u00a5\3\2\2\2\21\u00ad\3\2\2\2\23\u00b2\3\2\2"+
		"\2\25\u00bc\3\2\2\2\27\u00c4\3\2\2\2\31\u00cb\3\2\2\2\33\u00d2\3\2\2\2"+
		"\35\u00d4\3\2\2\2\37\u00d6\3\2\2\2!\u00d9\3\2\2\2#\u00e2\3\2\2\2%\u00e8"+
		"\3\2\2\2\'\u00f3\3\2\2\2)\u00fc\3\2\2\2+\u0104\3\2\2\2-\u010b\3\2\2\2"+
		"/\u010f\3\2\2\2\61\u0117\3\2\2\2\63\u011a\3\2\2\2\65\u0120\3\2\2\2\67"+
		"\u0126\3\2\2\29\u012d\3\2\2\2;\u0136\3\2\2\2=\u013b\3\2\2\2?\u0148\3\2"+
		"\2\2A\u014d\3\2\2\2C\u0151\3\2\2\2E\u015a\3\2\2\2G\u0160\3\2\2\2I\u0162"+
		"\3\2\2\2K\u0164\3\2\2\2M\u016c\3\2\2\2O\u0172\3\2\2\2Q\u0180\3\2\2\2S"+
		"\u024d\3\2\2\2U\u024f\3\2\2\2W\u025c\3\2\2\2Y\u0263\3\2\2\2[\u0265\3\2"+
		"\2\2]\u0267\3\2\2\2_\u0270\3\2\2\2a\u0272\3\2\2\2c\u0283\3\2\2\2e\u0285"+
		"\3\2\2\2g\u0290\3\2\2\2i\u0298\3\2\2\2k\u029b\3\2\2\2m\u02a2\3\2\2\2o"+
		"\u02a5\3\2\2\2q\u02a9\3\2\2\2s\u02b0\3\2\2\2u\u02b7\3\2\2\2w\u02be\3\2"+
		"\2\2y\u02c6\3\2\2\2{\u02c8\3\2\2\2}~\7c\2\2~\177\7n\2\2\177\u0080\7i\2"+
		"\2\u0080\u0081\7q\2\2\u0081\u0082\7t\2\2\u0082\u0083\7k\2\2\u0083\u0084"+
		"\7v\2\2\u0084\u0085\7o\2\2\u0085\u0086\7q\2\2\u0086\4\3\2\2\2\u0087\u0088"+
		"\7=\2\2\u0088\6\3\2\2\2\u0089\u008a\7x\2\2\u008a\u008b\7c\2\2\u008b\u008c"+
		"\7t\2\2\u008c\u008d\7k\2\2\u008d\u008e\7c\2\2\u008e\u008f\7x\2\2\u008f"+
		"\u0090\7g\2\2\u0090\u0091\7k\2\2\u0091\u0092\7u\2\2\u0092\b\3\2\2\2\u0093"+
		"\u0094\7h\2\2\u0094\u0095\7k\2\2\u0095\u0096\7o\2\2\u0096\u0097\7a\2\2"+
		"\u0097\u0098\7x\2\2\u0098\u0099\7c\2\2\u0099\u009a\7t\2\2\u009a\u009b"+
		"\7k\2\2\u009b\u009c\7c\2\2\u009c\u009d\7x\2\2\u009d\u009e\7g\2\2\u009e"+
		"\u009f\7k\2\2\u009f\u00a0\7u\2\2\u00a0\n\3\2\2\2\u00a1\u00a2\7.\2\2\u00a2"+
		"\f\3\2\2\2\u00a3\u00a4\7<\2\2\u00a4\16\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6"+
		"\u00a7\7p\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7k\2\2"+
		"\u00aa\u00ab\7t\2\2\u00ab\u00ac\7q\2\2\u00ac\20\3\2\2\2\u00ad\u00ae\7"+
		"t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7n\2\2\u00b1\22"+
		"\3\2\2\2\u00b2\u00b3\7e\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7t\2\2\u00b5"+
		"\u00b6\7c\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7g\2\2"+
		"\u00b9\u00ba\7t\2\2\u00ba\u00bb\7g\2\2\u00bb\24\3\2\2\2\u00bc\u00bd\7"+
		"n\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1"+
		"\7t\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7n\2\2\u00c3\26\3\2\2\2\u00c4\u00c5"+
		"\7n\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7i\2\2\u00c7\u00c8\7k\2\2\u00c8"+
		"\u00c9\7e\2\2\u00c9\u00ca\7q\2\2\u00ca\30\3\2\2\2\u00cb\u00cc\7o\2\2\u00cc"+
		"\u00cd\7c\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7k\2\2"+
		"\u00d0\u00d1\7|\2\2\u00d1\32\3\2\2\2\u00d2\u00d3\7]\2\2\u00d3\34\3\2\2"+
		"\2\u00d4\u00d5\7_\2\2\u00d5\36\3\2\2\2\u00d6\u00d7\7f\2\2\u00d7\u00d8"+
		"\7g\2\2\u00d8 \3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db\u00dc"+
		"\7v\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7t\2\2\u00df"+
		"\u00e0\7q\2\2\u00e0\u00e1\7u\2\2\u00e1\"\3\2\2\2\u00e2\u00e3\7t\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7u\2\2"+
		"\u00e7$\3\2\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7t\2"+
		"\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef"+
		"\7g\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7u\2\2\u00f2"+
		"&\3\2\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7v\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7k\2\2"+
		"\u00fa\u00fb\7u\2\2\u00fb(\3\2\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7q\2"+
		"\2\u00fe\u00ff\7i\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7e\2\2\u0101\u0102"+
		"\7q\2\2\u0102\u0103\7u\2\2\u0103*\3\2\2\2\u0104\u0105\7k\2\2\u0105\u0106"+
		"\7p\2\2\u0106\u0107\7k\2\2\u0107\u0108\7e\2\2\u0108\u0109\7k\2\2\u0109"+
		"\u010a\7q\2\2\u010a,\3\2\2\2\u010b\u010c\7h\2\2\u010c\u010d\7k\2\2\u010d"+
		"\u010e\7o\2\2\u010e.\3\2\2\2\u010f\u0110\7t\2\2\u0110\u0111\7g\2\2\u0111"+
		"\u0112\7v\2\2\u0112\u0113\7q\2\2\u0113\u0114\7t\2\2\u0114\u0115\7p\2\2"+
		"\u0115\u0116\7g\2\2\u0116\60\3\2\2\2\u0117\u0118\7u\2\2\u0118\u0119\7"+
		"g\2\2\u0119\62\3\2\2\2\u011a\u011b\7g\2\2\u011b\u011c\7p\2\2\u011c\u011d"+
		"\7v\2\2\u011d\u011e\7c\2\2\u011e\u011f\7q\2\2\u011f\64\3\2\2\2\u0120\u0121"+
		"\7u\2\2\u0121\u0122\7g\2\2\u0122\u0123\7p\2\2\u0123\u0124\7c\2\2\u0124"+
		"\u0125\7q\2\2\u0125\66\3\2\2\2\u0126\u0127\7h\2\2\u0127\u0128\7k\2\2\u0128"+
		"\u0129\7o\2\2\u0129\u012a\7a\2\2\u012a\u012b\7u\2\2\u012b\u012c\7g\2\2"+
		"\u012c8\3\2\2\2\u012d\u012e\7g\2\2\u012e\u012f\7p\2\2\u012f\u0130\7s\2"+
		"\2\u0130\u0131\7w\2\2\u0131\u0132\7c\2\2\u0132\u0133\7p\2\2\u0133\u0134"+
		"\7v\2\2\u0134\u0135\7q\2\2\u0135:\3\2\2\2\u0136\u0137\7h\2\2\u0137\u0138"+
		"\7c\2\2\u0138\u0139\7e\2\2\u0139\u013a\7c\2\2\u013a<\3\2\2\2\u013b\u013c"+
		"\7h\2\2\u013c\u013d\7k\2\2\u013d\u013e\7o\2\2\u013e\u013f\7a\2\2\u013f"+
		"\u0140\7g\2\2\u0140\u0141\7p\2\2\u0141\u0142\7s\2\2\u0142\u0143\7w\2\2"+
		"\u0143\u0144\7c\2\2\u0144\u0145\7p\2\2\u0145\u0146\7v\2\2\u0146\u0147"+
		"\7q\2\2\u0147>\3\2\2\2\u0148\u0149\7r\2\2\u0149\u014a\7c\2\2\u014a\u014b"+
		"\7t\2\2\u014b\u014c\7c\2\2\u014c@\3\2\2\2\u014d\u014e\7c\2\2\u014e\u014f"+
		"\7v\2\2\u014f\u0150\7g\2\2\u0150B\3\2\2\2\u0151\u0152\7h\2\2\u0152\u0153"+
		"\7k\2\2\u0153\u0154\7o\2\2\u0154\u0155\7a\2\2\u0155\u0156\7r\2\2\u0156"+
		"\u0157\7c\2\2\u0157\u0158\7t\2\2\u0158\u0159\7c\2\2\u0159D\3\2\2\2\u015a"+
		"\u015b\7r\2\2\u015b\u015c\7c\2\2\u015c\u015d\7u\2\2\u015d\u015e\7u\2\2"+
		"\u015e\u015f\7q\2\2\u015fF\3\2\2\2\u0160\u0161\7*\2\2\u0161H\3\2\2\2\u0162"+
		"\u0163\7+\2\2\u0163J\3\2\2\2\u0164\u0165\7h\2\2\u0165\u0166\7w\2\2\u0166"+
		"\u0167\7p\2\2\u0167\u0168\7e\2\2\u0168\u0169\7c\2\2\u0169\u016a\7q\2\2"+
		"\u016aL\3\2\2\2\u016b\u016d\t\2\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3"+
		"\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\b\'\2\2\u0171N\3\2\2\2\u0172\u0173\7\61\2\2\u0173\u0174\7,\2\2"+
		"\u0174\u0178\3\2\2\2\u0175\u0177\13\2\2\2\u0176\u0175\3\2\2\2\u0177\u017a"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017b\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017b\u017c\7,\2\2\u017c\u017d\7\61\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u017f\b(\2\2\u017fP\3\2\2\2\u0180\u0181\7\61\2\2\u0181\u0182"+
		"\7\61\2\2\u0182\u0186\3\2\2\2\u0183\u0185\n\3\2\2\u0184\u0183\3\2\2\2"+
		"\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189"+
		"\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\b)\2\2\u018aR\3\2\2\2\u018b\u018c"+
		"\7c\2\2\u018c\u018d\7n\2\2\u018d\u018e\7i\2\2\u018e\u018f\7q\2\2\u018f"+
		"\u0190\7t\2\2\u0190\u0191\7k\2\2\u0191\u0192\7v\2\2\u0192\u0193\7o\2\2"+
		"\u0193\u024e\7q\2\2\u0194\u0195\7h\2\2\u0195\u0196\7k\2\2\u0196\u0197"+
		"\7o\2\2\u0197\u0198\7a\2\2\u0198\u0199\7x\2\2\u0199\u019a\7c\2\2\u019a"+
		"\u019b\7t\2\2\u019b\u019c\7k\2\2\u019c\u019d\7c\2\2\u019d\u019e\7x\2\2"+
		"\u019e\u019f\7g\2\2\u019f\u01a0\7k\2\2\u01a0\u024e\7u\2\2\u01a1\u01a2"+
		"\7x\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7t\2\2\u01a4\u01a5\7k\2\2\u01a5"+
		"\u01a6\7c\2\2\u01a6\u01a7\7x\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7k\2\2"+
		"\u01a9\u024e\7u\2\2\u01aa\u01ab\7k\2\2\u01ab\u01ac\7p\2\2\u01ac\u01ad"+
		"\7v\2\2\u01ad\u01ae\7g\2\2\u01ae\u01af\7k\2\2\u01af\u01b0\7t\2\2\u01b0"+
		"\u024e\7q\2\2\u01b1\u01b2\7t\2\2\u01b2\u01b3\7g\2\2\u01b3\u01b4\7c\2\2"+
		"\u01b4\u024e\7n\2\2\u01b5\u01b6\7e\2\2\u01b6\u01b7\7c\2\2\u01b7\u01b8"+
		"\7t\2\2\u01b8\u01b9\7c\2\2\u01b9\u01ba\7e\2\2\u01ba\u01bb\7v\2\2\u01bb"+
		"\u01bc\7g\2\2\u01bc\u01bd\7t\2\2\u01bd\u024e\7g\2\2\u01be\u01bf\7n\2\2"+
		"\u01bf\u01c0\7k\2\2\u01c0\u01c1\7v\2\2\u01c1\u01c2\7g\2\2\u01c2\u01c3"+
		"\7t\2\2\u01c3\u01c4\7c\2\2\u01c4\u024e\7n\2\2\u01c5\u01c6\7n\2\2\u01c6"+
		"\u01c7\7q\2\2\u01c7\u01c8\7i\2\2\u01c8\u01c9\7k\2\2\u01c9\u01ca\7e\2\2"+
		"\u01ca\u024e\7q\2\2\u01cb\u01cc\7k\2\2\u01cc\u01cd\7p\2\2\u01cd\u01ce"+
		"\7k\2\2\u01ce\u01cf\7e\2\2\u01cf\u01d0\7k\2\2\u01d0\u024e\7q\2\2\u01d1"+
		"\u01d2\7h\2\2\u01d2\u01d3\7k\2\2\u01d3\u024e\7o\2\2\u01d4\u01d5\7u\2\2"+
		"\u01d5\u024e\7g\2\2\u01d6\u01d7\7u\2\2\u01d7\u01d8\7g\2\2\u01d8\u01d9"+
		"\7p\2\2\u01d9\u01da\7c\2\2\u01da\u024e\7q\2\2\u01db\u01dc\7g\2\2\u01dc"+
		"\u01dd\7p\2\2\u01dd\u01de\7v\2\2\u01de\u01df\7c\2\2\u01df\u024e\7q\2\2"+
		"\u01e0\u01e1\7h\2\2\u01e1\u01e2\7k\2\2\u01e2\u01e3\7o\2\2\u01e3\u01e4"+
		"\7a\2\2\u01e4\u01e5\7u\2\2\u01e5\u024e\7g\2\2\u01e6\u01e7\7g\2\2\u01e7"+
		"\u01e8\7p\2\2\u01e8\u01e9\7s\2\2\u01e9\u01ea\7w\2\2\u01ea\u01eb\7c\2\2"+
		"\u01eb\u01ec\7p\2\2\u01ec\u01ed\7v\2\2\u01ed\u024e\7q\2\2\u01ee\u01ef"+
		"\7h\2\2\u01ef\u01f0\7c\2\2\u01f0\u01f1\7e\2\2\u01f1\u024e\7c\2\2\u01f2"+
		"\u01f3\7h\2\2\u01f3\u01f4\7k\2\2\u01f4\u01f5\7o\2\2\u01f5\u01f6\7a\2\2"+
		"\u01f6\u01f7\7g\2\2\u01f7\u01f8\7p\2\2\u01f8\u01f9\7s\2\2\u01f9\u01fa"+
		"\7w\2\2\u01fa\u01fb\7c\2\2\u01fb\u01fc\7p\2\2\u01fc\u01fd\7v\2\2\u01fd"+
		"\u024e\7q\2\2\u01fe\u01ff\7r\2\2\u01ff\u0200\7c\2\2\u0200\u0201\7t\2\2"+
		"\u0201\u024e\7c\2\2\u0202\u0203\7f\2\2\u0203\u024e\7g\2\2\u0204\u0205"+
		"\7c\2\2\u0205\u0206\7v\2\2\u0206\u024e\7g\2\2\u0207\u0208\7h\2\2\u0208"+
		"\u0209\7k\2\2\u0209\u020a\7o\2\2\u020a\u020b\7a\2\2\u020b\u020c\7r\2\2"+
		"\u020c\u020d\7c\2\2\u020d\u020e\7t\2\2\u020e\u024e\7c\2\2\u020f\u0210"+
		"\7o\2\2\u0210\u0211\7c\2\2\u0211\u0212\7v\2\2\u0212\u0213\7t\2\2\u0213"+
		"\u0214\7k\2\2\u0214\u024e\7|\2\2\u0215\u0216\7k\2\2\u0216\u0217\7p\2\2"+
		"\u0217\u0218\7v\2\2\u0218\u0219\7g\2\2\u0219\u021a\7k\2\2\u021a\u021b"+
		"\7t\2\2\u021b\u021c\7q\2\2\u021c\u024e\7u\2\2\u021d\u021e\7t\2\2\u021e"+
		"\u021f\7g\2\2\u021f\u0220\7c\2\2\u0220\u0221\7k\2\2\u0221\u024e\7u\2\2"+
		"\u0222\u0223\7e\2\2\u0223\u0224\7c\2\2\u0224\u0225\7t\2\2\u0225\u0226"+
		"\7c\2\2\u0226\u0227\7e\2\2\u0227\u0228\7v\2\2\u0228\u0229\7g\2\2\u0229"+
		"\u022a\7t\2\2\u022a\u022b\7g\2\2\u022b\u024e\7u\2\2\u022c\u022d\7n\2\2"+
		"\u022d\u022e\7k\2\2\u022e\u022f\7v\2\2\u022f\u0230\7g\2\2\u0230\u0231"+
		"\7t\2\2\u0231\u0232\7c\2\2\u0232\u0233\7k\2\2\u0233\u024e\7u\2\2\u0234"+
		"\u0235\7n\2\2\u0235\u0236\7q\2\2\u0236\u0237\7i\2\2\u0237\u0238\7k\2\2"+
		"\u0238\u0239\7e\2\2\u0239\u023a\7q\2\2\u023a\u024e\7u\2\2\u023b\u023c"+
		"\7h\2\2\u023c\u023d\7w\2\2\u023d\u023e\7p\2\2\u023e\u023f\7e\2\2\u023f"+
		"\u0240\7c\2\2\u0240\u024e\7q\2\2\u0241\u0242\7t\2\2\u0242\u0243\7g\2\2"+
		"\u0243\u0244\7v\2\2\u0244\u0245\7q\2\2\u0245\u0246\7t\2\2\u0246\u0247"+
		"\7p\2\2\u0247\u024e\7g\2\2\u0248\u0249\7r\2\2\u0249\u024a\7c\2\2\u024a"+
		"\u024b\7u\2\2\u024b\u024c\7u\2\2\u024c\u024e\7q\2\2\u024d\u018b\3\2\2"+
		"\2\u024d\u0194\3\2\2\2\u024d\u01a1\3\2\2\2\u024d\u01aa\3\2\2\2\u024d\u01b1"+
		"\3\2\2\2\u024d\u01b5\3\2\2\2\u024d\u01be\3\2\2\2\u024d\u01c5\3\2\2\2\u024d"+
		"\u01cb\3\2\2\2\u024d\u01d1\3\2\2\2\u024d\u01d4\3\2\2\2\u024d\u01d6\3\2"+
		"\2\2\u024d\u01db\3\2\2\2\u024d\u01e0\3\2\2\2\u024d\u01e6\3\2\2\2\u024d"+
		"\u01ee\3\2\2\2\u024d\u01f2\3\2\2\2\u024d\u01fe\3\2\2\2\u024d\u0202\3\2"+
		"\2\2\u024d\u0204\3\2\2\2\u024d\u0207\3\2\2\2\u024d\u020f\3\2\2\2\u024d"+
		"\u0215\3\2\2\2\u024d\u021d\3\2\2\2\u024d\u0222\3\2\2\2\u024d\u022c\3\2"+
		"\2\2\u024d\u0234\3\2\2\2\u024d\u023b\3\2\2\2\u024d\u0241\3\2\2\2\u024d"+
		"\u0248\3\2\2\2\u024eT\3\2\2\2\u024f\u0250\7p\2\2\u0250\u0251\7c\2\2\u0251"+
		"\u0252\7q\2\2\u0252V\3\2\2\2\u0253\u025d\7@\2\2\u0254\u0255\7@\2\2\u0255"+
		"\u025d\7?\2\2\u0256\u025d\7>\2\2\u0257\u0258\7>\2\2\u0258\u025d\7?\2\2"+
		"\u0259\u025d\7?\2\2\u025a\u025b\7>\2\2\u025b\u025d\7@\2\2\u025c\u0253"+
		"\3\2\2\2\u025c\u0254\3\2\2\2\u025c\u0256\3\2\2\2\u025c\u0257\3\2\2\2\u025c"+
		"\u0259\3\2\2\2\u025c\u025a\3\2\2\2\u025dX\3\2\2\2\u025e\u0264\t\4\2\2"+
		"\u025f\u0260\7-\2\2\u0260\u0264\7-\2\2\u0261\u0262\7/\2\2\u0262\u0264"+
		"\7/\2\2\u0263\u025e\3\2\2\2\u0263\u025f\3\2\2\2\u0263\u0261\3\2\2\2\u0264"+
		"Z\3\2\2\2\u0265\u0266\7-\2\2\u0266\\\3\2\2\2\u0267\u0268\7/\2\2\u0268"+
		"^\3\2\2\2\u0269\u0271\7g\2\2\u026a\u026b\7q\2\2\u026b\u0271\7w\2\2\u026c"+
		"\u026d\7(\2\2\u026d\u0271\7(\2\2\u026e\u026f\7~\2\2\u026f\u0271\7~\2\2"+
		"\u0270\u0269\3\2\2\2\u0270\u026a\3\2\2\2\u0270\u026c\3\2\2\2\u0270\u026e"+
		"\3\2\2\2\u0271`\3\2\2\2\u0272\u0273\t\5\2\2\u0273b\3\2\2\2\u0274\u0275"+
		"\7x\2\2\u0275\u0276\7g\2\2\u0276\u0277\7t\2\2\u0277\u0278\7f\2\2\u0278"+
		"\u0279\7c\2\2\u0279\u027a\7f\2\2\u027a\u027b\7g\2\2\u027b\u027c\7k\2\2"+
		"\u027c\u027d\7t\2\2\u027d\u0284\7q\2\2\u027e\u027f\7h\2\2\u027f\u0280"+
		"\7c\2\2\u0280\u0281\7n\2\2\u0281\u0282\7u\2\2\u0282\u0284\7q\2\2\u0283"+
		"\u0274\3\2\2\2\u0283\u027e\3\2\2\2\u0284d\3\2\2\2\u0285\u028b\7$\2\2\u0286"+
		"\u0287\7^\2\2\u0287\u028a\13\2\2\2\u0288\u028a\n\6\2\2\u0289\u0286\3\2"+
		"\2\2\u0289\u0288\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u028e\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u028f\7$"+
		"\2\2\u028ff\3\2\2\2\u0290\u0294\7)\2\2\u0291\u0292\7^\2\2\u0292\u0295"+
		"\13\2\2\2\u0293\u0295\n\6\2\2\u0294\u0291\3\2\2\2\u0294\u0293\3\2\2\2"+
		"\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\7)\2\2\u0297h\3\2"+
		"\2\2\u0298\u0299\7<\2\2\u0299\u029a\7?\2\2\u029aj\3\2\2\2\u029b\u029f"+
		"\t\7\2\2\u029c\u029e\t\b\2\2\u029d\u029c\3\2\2\2\u029e\u02a1\3\2\2\2\u029f"+
		"\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0l\3\2\2\2\u02a1\u029f\3\2\2\2"+
		"\u02a2\u02a3\t\t\2\2\u02a3n\3\2\2\2\u02a4\u02a6\t\n\2\2\u02a5\u02a4\3"+
		"\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8"+
		"p\3\2\2\2\u02a9\u02aa\7\62\2\2\u02aa\u02ac\t\13\2\2\u02ab\u02ad\t\f\2"+
		"\2\u02ac\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af"+
		"\3\2\2\2\u02afr\3\2\2\2\u02b0\u02b1\7\62\2\2\u02b1\u02b3\t\r\2\2\u02b2"+
		"\u02b4\t\16\2\2\u02b3\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b3\3"+
		"\2\2\2\u02b5\u02b6\3\2\2\2\u02b6t\3\2\2\2\u02b7\u02b8\7\62\2\2\u02b8\u02ba"+
		"\t\17\2\2\u02b9\u02bb\t\20\2\2\u02ba\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2"+
		"\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bdv\3\2\2\2\u02be\u02bf\5"+
		"o8\2\u02bf\u02c0\7\60\2\2\u02c0\u02c1\5o8\2\u02c1x\3\2\2\2\u02c2\u02c7"+
		"\5o8\2\u02c3\u02c7\5q9\2\u02c4\u02c7\5u;\2\u02c5\u02c7\5s:\2\u02c6\u02c2"+
		"\3\2\2\2\u02c6\u02c3\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c5\3\2\2\2\u02c7"+
		"z\3\2\2\2\u02c8\u02c9\13\2\2\2\u02c9|\3\2\2\2\24\2\u016e\u0178\u0186\u024d"+
		"\u025c\u0263\u0270\u0283\u0289\u028b\u0294\u029f\u02a7\u02ae\u02b5\u02bc"+
		"\u02c6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}