// Generated from Dil.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DilParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		STRING=88, COMMENT=89, RAKAM=90, DEGISKEN_ISMI=91, WS=92;
	public static final int
		RULE_program = 0, RULE_bildirimler = 1, RULE_tur_fonksiyonu = 2, RULE_tur_donusturme_islec = 3, 
		RULE_fonksiyon_tanimi = 4, RULE_return_deyimi = 5, RULE_donguden_cik = 6, 
		RULE_continue_komutu = 7, RULE_matematik_fonksiyon_tanimi = 8, RULE_fonksiyon_cagirilmasi = 9, 
		RULE_fonksiyon_bildirimleri = 10, RULE_tus_bekle = 11, RULE_fonksiyon_parametreleri = 12, 
		RULE_sinif_tanimi = 13, RULE_yeni_sinif_objesi = 14, RULE_sinif_degisken_tanimi = 15, 
		RULE_sinif_fonksiyon_tanimi = 16, RULE_ulasim_anahtarlari = 17, RULE_oku_komutu = 18, 
		RULE_degisken_grubu = 19, RULE_grup_degiskeni = 20, RULE_referans_tanimi = 21, 
		RULE_referans_durum = 22, RULE_referans_atama_yapisi = 23, RULE_referans_olabilenler = 24, 
		RULE_degisken_tanimi = 25, RULE_degisken_durum = 26, RULE_mantik = 27, 
		RULE_yok_ifadesi = 28, RULE_degisken_grub_eleman = 29, RULE_sinif_fonksiyon_cagirma = 30, 
		RULE_degisken_grubu_elemani = 31, RULE_structure_eleman = 32, RULE_sart_ifadesi = 33, 
		RULE_dogru_degilse_yapisi = 34, RULE_veya_dogruysa_yapisi = 35, RULE_mantik_ifadeleri = 36, 
		RULE_dogruluk_ifadeleri = 37, RULE_arraye_ekleme = 38, RULE_degisken_turu = 39, 
		RULE_goster_komutu = 40, RULE_program_bitir = 41, RULE_deger_atama = 42, 
		RULE_sol_taraf_degiskenleri = 43, RULE_ifadeler = 44, RULE_basit_artis = 45, 
		RULE_try_yapisi = 46, RULE_hata_gonder = 47, RULE_catch_yapisi = 48, RULE_case_yapisi = 49, 
		RULE_secilen = 50, RULE_hic_yoksa = 51, RULE_secenekler = 52, RULE_for_dongu_degisim = 53, 
		RULE_for_dongusu = 54, RULE_dongu_artis = 55, RULE_parantez2 = 56, RULE_parantez1 = 57, 
		RULE_ikinci_loop_yapisi = 58, RULE_loop_yapisi = 59, RULE_array_listesi = 60, 
		RULE_array_degiskeni = 61, RULE_degisken_ismi = 62, RULE_sabit_rakam_degeri = 63;
	public static final String[] ruleNames = {
		"program", "bildirimler", "tur_fonksiyonu", "tur_donusturme_islec", "fonksiyon_tanimi", 
		"return_deyimi", "donguden_cik", "continue_komutu", "matematik_fonksiyon_tanimi", 
		"fonksiyon_cagirilmasi", "fonksiyon_bildirimleri", "tus_bekle", "fonksiyon_parametreleri", 
		"sinif_tanimi", "yeni_sinif_objesi", "sinif_degisken_tanimi", "sinif_fonksiyon_tanimi", 
		"ulasim_anahtarlari", "oku_komutu", "degisken_grubu", "grup_degiskeni", 
		"referans_tanimi", "referans_durum", "referans_atama_yapisi", "referans_olabilenler", 
		"degisken_tanimi", "degisken_durum", "mantik", "yok_ifadesi", "degisken_grub_eleman", 
		"sinif_fonksiyon_cagirma", "degisken_grubu_elemani", "structure_eleman", 
		"sart_ifadesi", "dogru_degilse_yapisi", "veya_dogruysa_yapisi", "mantik_ifadeleri", 
		"dogruluk_ifadeleri", "arraye_ekleme", "degisken_turu", "goster_komutu", 
		"program_bitir", "deger_atama", "sol_taraf_degiskenleri", "ifadeler", 
		"basit_artis", "try_yapisi", "hata_gonder", "catch_yapisi", "case_yapisi", 
		"secilen", "hic_yoksa", "secenekler", "for_dongu_degisim", "for_dongusu", 
		"dongu_artis", "parantez2", "parantez1", "ikinci_loop_yapisi", "loop_yapisi", 
		"array_listesi", "array_degiskeni", "degisken_ismi", "sabit_rakam_degeri"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'t\\u00fcr'", "'('", "')'", "'fonksiyon'", "','", "'{'", 
		"'}'", "'sonu\\u00e7'", "'d\\u00f6ng\\u00fcden'", "'\\u00e7\\u0131k'", 
		"'ba\\u015ftan'", "'devam'", "'et'", "'='", "'tu\\u015f'", "'bekle'", 
		"'S\\u0131n\\u0131f'", "'yeni'", "'\\u00f6zel'", "'genel'", "'oku'", "'De\\u011fi\\u015fken'", 
		"'Grubu'", "'<'", "'>'", "'Referans'", "'->'", "'do\\u011fru'", "'yanl\\u0131\\u015f'", 
		"'yok'", "'.'", "'ise'", "'do\\u011fruysa'", "'de\\u011filse'", "'veya'", 
		"'VEYA'", "'&&'", "'VE'", "'ve'", "'||'", "'!'", "'=='", "'>='", "'<='", 
		"'!='", "'ekle'", "'Array'", "'Tamsay\\u0131'", "'Noktal\\u0131Say\\u0131'", 
		"'Karakter'", "'Dinamik'", "'Bool'", "'g\\u00F6ster'", "'kapat'", "'-'", 
		"'karek\\u00F6k'", "'sin'", "'cos'", "'tan'", "'cot'", "'ln'", "'Matematik'", 
		"'E'", "'P\\u0130'", "'log'", "'^'", "'%'", "'*'", "'/'", "'+'", "'boyut'", 
		"'++'", "'hata'", "'olabilir'", "'g\\u00f6nder'", "'se\\u00e7'", "'hi\\u00e7biri'", 
		"':'", "'d\\u00f6ng\\u00fc'", "'oldu\\u011fu'", "'s\\u00fcrece'", "'|'", 
		"']'", "'['", "'buradan'", "'itibaren'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "STRING", "COMMENT", "RAKAM", "DEGISKEN_ISMI", 
		"WS"
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

	@Override
	public String getGrammarFileName() { return "Dil.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DilParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<BildirimlerContext> bildirimler() {
			return getRuleContexts(BildirimlerContext.class);
		}
		public BildirimlerContext bildirimler(int i) {
			return getRuleContext(BildirimlerContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				bildirimler();
				setState(131);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(129);
					match(T__0);
					}
					break;
				case EOF:
				case T__1:
				case T__2:
				case T__4:
				case T__6:
				case T__8:
				case T__9:
				case T__11:
				case T__15:
				case T__17:
				case T__18:
				case T__21:
				case T__22:
				case T__26:
				case T__28:
				case T__29:
				case T__30:
				case T__41:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__57:
				case T__58:
				case T__59:
				case T__60:
				case T__61:
				case T__62:
				case T__65:
				case T__71:
				case T__73:
				case T__76:
				case T__79:
				case T__85:
				case STRING:
				case COMMENT:
				case RAKAM:
				case DEGISKEN_ISMI:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__71 - 66)) | (1L << (T__73 - 66)) | (1L << (T__76 - 66)) | (1L << (T__79 - 66)) | (1L << (T__85 - 66)) | (1L << (STRING - 66)) | (1L << (COMMENT - 66)) | (1L << (RAKAM - 66)) | (1L << (DEGISKEN_ISMI - 66)))) != 0) );
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

	public static class BildirimlerContext extends ParserRuleContext {
		public Sinif_tanimiContext sinif_tanimi() {
			return getRuleContext(Sinif_tanimiContext.class,0);
		}
		public Goster_komutuContext goster_komutu() {
			return getRuleContext(Goster_komutuContext.class,0);
		}
		public Referans_tanimiContext referans_tanimi() {
			return getRuleContext(Referans_tanimiContext.class,0);
		}
		public Degisken_tanimiContext degisken_tanimi() {
			return getRuleContext(Degisken_tanimiContext.class,0);
		}
		public Deger_atamaContext deger_atama() {
			return getRuleContext(Deger_atamaContext.class,0);
		}
		public Program_bitirContext program_bitir() {
			return getRuleContext(Program_bitirContext.class,0);
		}
		public Arraye_eklemeContext arraye_ekleme() {
			return getRuleContext(Arraye_eklemeContext.class,0);
		}
		public Sart_ifadesiContext sart_ifadesi() {
			return getRuleContext(Sart_ifadesiContext.class,0);
		}
		public Loop_yapisiContext loop_yapisi() {
			return getRuleContext(Loop_yapisiContext.class,0);
		}
		public Ikinci_loop_yapisiContext ikinci_loop_yapisi() {
			return getRuleContext(Ikinci_loop_yapisiContext.class,0);
		}
		public Case_yapisiContext case_yapisi() {
			return getRuleContext(Case_yapisiContext.class,0);
		}
		public Referans_atama_yapisiContext referans_atama_yapisi() {
			return getRuleContext(Referans_atama_yapisiContext.class,0);
		}
		public Degisken_grubuContext degisken_grubu() {
			return getRuleContext(Degisken_grubuContext.class,0);
		}
		public Fonksiyon_tanimiContext fonksiyon_tanimi() {
			return getRuleContext(Fonksiyon_tanimiContext.class,0);
		}
		public Matematik_fonksiyon_tanimiContext matematik_fonksiyon_tanimi() {
			return getRuleContext(Matematik_fonksiyon_tanimiContext.class,0);
		}
		public Fonksiyon_cagirilmasiContext fonksiyon_cagirilmasi() {
			return getRuleContext(Fonksiyon_cagirilmasiContext.class,0);
		}
		public Return_deyimiContext return_deyimi() {
			return getRuleContext(Return_deyimiContext.class,0);
		}
		public Donguden_cikContext donguden_cik() {
			return getRuleContext(Donguden_cikContext.class,0);
		}
		public For_dongusuContext for_dongusu() {
			return getRuleContext(For_dongusuContext.class,0);
		}
		public Continue_komutuContext continue_komutu() {
			return getRuleContext(Continue_komutuContext.class,0);
		}
		public Hata_gonderContext hata_gonder() {
			return getRuleContext(Hata_gonderContext.class,0);
		}
		public Try_yapisiContext try_yapisi() {
			return getRuleContext(Try_yapisiContext.class,0);
		}
		public Sinif_fonksiyon_cagirmaContext sinif_fonksiyon_cagirma() {
			return getRuleContext(Sinif_fonksiyon_cagirmaContext.class,0);
		}
		public Tus_bekleContext tus_bekle() {
			return getRuleContext(Tus_bekleContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(DilParser.COMMENT, 0); }
		public BildirimlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bildirimler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterBildirimler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitBildirimler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitBildirimler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BildirimlerContext bildirimler() throws RecognitionException {
		BildirimlerContext _localctx = new BildirimlerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bildirimler);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				sinif_tanimi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				goster_komutu();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				referans_tanimi();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				degisken_tanimi();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				deger_atama();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				program_bitir();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				arraye_ekleme();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				sart_ifadesi();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(145);
				loop_yapisi();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(146);
				ikinci_loop_yapisi();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(147);
				case_yapisi();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(148);
				referans_atama_yapisi();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(149);
				degisken_grubu();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(150);
				fonksiyon_tanimi();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(151);
				matematik_fonksiyon_tanimi();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(152);
				fonksiyon_cagirilmasi();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(153);
				return_deyimi();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(154);
				donguden_cik();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(155);
				for_dongusu();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(156);
				continue_komutu();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(157);
				hata_gonder();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(158);
				try_yapisi();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(159);
				sinif_fonksiyon_cagirma();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(160);
				tus_bekle();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(161);
				match(COMMENT);
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

	public static class Tur_fonksiyonuContext extends ParserRuleContext {
		public Tur_fonksiyonuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tur_fonksiyonu; }
	 
		public Tur_fonksiyonuContext() { }
		public void copyFrom(Tur_fonksiyonuContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Turu_neContext extends Tur_fonksiyonuContext {
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Turu_neContext(Tur_fonksiyonuContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterTuru_ne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitTuru_ne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitTuru_ne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tur_fonksiyonuContext tur_fonksiyonu() throws RecognitionException {
		Tur_fonksiyonuContext _localctx = new Tur_fonksiyonuContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tur_fonksiyonu);
		try {
			_localctx = new Turu_neContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__1);
			setState(165);
			match(T__2);
			setState(166);
			ifadeler(0);
			setState(167);
			match(T__3);
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

	public static class Tur_donusturme_islecContext extends ParserRuleContext {
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Tur_donusturme_islecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tur_donusturme_islec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterTur_donusturme_islec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitTur_donusturme_islec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitTur_donusturme_islec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tur_donusturme_islecContext tur_donusturme_islec() throws RecognitionException {
		Tur_donusturme_islecContext _localctx = new Tur_donusturme_islecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tur_donusturme_islec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__2);
			setState(170);
			match(T__3);
			setState(171);
			ifadeler(0);
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

	public static class Fonksiyon_tanimiContext extends ParserRuleContext {
		public Fonksiyon_tanimiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fonksiyon_tanimi; }
	 
		public Fonksiyon_tanimiContext() { }
		public void copyFrom(Fonksiyon_tanimiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Fonksiyon_tanimi_Context extends Fonksiyon_tanimiContext {
		public Degisken_ismiContext degisken_ismi() {
			return getRuleContext(Degisken_ismiContext.class,0);
		}
		public List<Fonksiyon_bildirimleriContext> fonksiyon_bildirimleri() {
			return getRuleContexts(Fonksiyon_bildirimleriContext.class);
		}
		public Fonksiyon_bildirimleriContext fonksiyon_bildirimleri(int i) {
			return getRuleContext(Fonksiyon_bildirimleriContext.class,i);
		}
		public List<Fonksiyon_parametreleriContext> fonksiyon_parametreleri() {
			return getRuleContexts(Fonksiyon_parametreleriContext.class);
		}
		public Fonksiyon_parametreleriContext fonksiyon_parametreleri(int i) {
			return getRuleContext(Fonksiyon_parametreleriContext.class,i);
		}
		public Fonksiyon_tanimi_Context(Fonksiyon_tanimiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterFonksiyon_tanimi_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitFonksiyon_tanimi_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitFonksiyon_tanimi_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fonksiyon_tanimiContext fonksiyon_tanimi() throws RecognitionException {
		Fonksiyon_tanimiContext _localctx = new Fonksiyon_tanimiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fonksiyon_tanimi);
		int _la;
		try {
			_localctx = new Fonksiyon_tanimi_Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__4);
			setState(174);
			degisken_ismi();
			setState(175);
			match(T__2);
			setState(185);
			switch (_input.LA(1)) {
			case T__3:
				{
				}
				break;
			case T__26:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case DEGISKEN_ISMI:
				{
				{
				setState(177);
				fonksiyon_parametreleri();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(178);
					match(T__5);
					setState(179);
					fonksiyon_parametreleri();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(187);
			match(T__3);
			setState(188);
			match(T__6);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__71 - 66)) | (1L << (T__73 - 66)) | (1L << (T__76 - 66)) | (1L << (T__79 - 66)) | (1L << (T__85 - 66)) | (1L << (STRING - 66)) | (1L << (COMMENT - 66)) | (1L << (RAKAM - 66)) | (1L << (DEGISKEN_ISMI - 66)))) != 0)) {
				{
				{
				setState(189);
				fonksiyon_bildirimleri();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(T__7);
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

	public static class Return_deyimiContext extends ParserRuleContext {
		public Return_deyimiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_deyimi; }
	 
		public Return_deyimiContext() { }
		public void copyFrom(Return_deyimiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Return_komutuContext extends Return_deyimiContext {
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Return_komutuContext(Return_deyimiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterReturn_komutu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitReturn_komutu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitReturn_komutu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_deyimiContext return_deyimi() throws RecognitionException {
		Return_deyimiContext _localctx = new Return_deyimiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_return_deyimi);
		try {
			_localctx = new Return_komutuContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__8);
			setState(198);
			ifadeler(0);
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

	public static class Donguden_cikContext extends ParserRuleContext {
		public Donguden_cikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_donguden_cik; }
	 
		public Donguden_cikContext() { }
		public void copyFrom(Donguden_cikContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Break_komutuContext extends Donguden_cikContext {
		public Break_komutuContext(Donguden_cikContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterBreak_komutu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitBreak_komutu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitBreak_komutu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Donguden_cikContext donguden_cik() throws RecognitionException {
		Donguden_cikContext _localctx = new Donguden_cikContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_donguden_cik);
		try {
			_localctx = new Break_komutuContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__9);
			setState(201);
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

	public static class Continue_komutuContext extends ParserRuleContext {
		public Continue_komutuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_komutu; }
	 
		public Continue_komutuContext() { }
		public void copyFrom(Continue_komutuContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Continue_komutContext extends Continue_komutuContext {
		public Continue_komutContext(Continue_komutuContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterContinue_komut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitContinue_komut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitContinue_komut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_komutuContext continue_komutu() throws RecognitionException {
		Continue_komutuContext _localctx = new Continue_komutuContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_continue_komutu);
		try {
			_localctx = new Continue_komutContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__11);
			setState(204);
			match(T__12);
			setState(205);
			match(T__13);
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

	public static class Matematik_fonksiyon_tanimiContext extends ParserRuleContext {
		public Matematik_fonksiyon_tanimiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matematik_fonksiyon_tanimi; }
	 
		public Matematik_fonksiyon_tanimiContext() { }
		public void copyFrom(Matematik_fonksiyon_tanimiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Matematik_fonksiyon_kaydiContext extends Matematik_fonksiyon_tanimiContext {
		public List<Degisken_ismiContext> degisken_ismi() {
			return getRuleContexts(Degisken_ismiContext.class);
		}
		public Degisken_ismiContext degisken_ismi(int i) {
			return getRuleContext(Degisken_ismiContext.class,i);
		}
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Matematik_fonksiyon_kaydiContext(Matematik_fonksiyon_tanimiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterMatematik_fonksiyon_kaydi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitMatematik_fonksiyon_kaydi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitMatematik_fonksiyon_kaydi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matematik_fonksiyon_tanimiContext matematik_fonksiyon_tanimi() throws RecognitionException {
		Matematik_fonksiyon_tanimiContext _localctx = new Matematik_fonksiyon_tanimiContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_matematik_fonksiyon_tanimi);
		int _la;
		try {
			_localctx = new Matematik_fonksiyon_kaydiContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			degisken_ismi();
			setState(208);
			match(T__2);
			setState(209);
			degisken_ismi();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(210);
				match(T__5);
				setState(211);
				degisken_ismi();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(T__3);
			setState(218);
			match(T__14);
			setState(219);
			ifadeler(0);
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

	public static class Fonksiyon_cagirilmasiContext extends ParserRuleContext {
		public Fonksiyon_cagirilmasiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fonksiyon_cagirilmasi; }
	 
		public Fonksiyon_cagirilmasiContext() { }
		public void copyFrom(Fonksiyon_cagirilmasiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Fonksiyon_callContext extends Fonksiyon_cagirilmasiContext {
		public Degisken_ismiContext degisken_ismi() {
			return getRuleContext(Degisken_ismiContext.class,0);
		}
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public Fonksiyon_callContext(Fonksiyon_cagirilmasiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterFonksiyon_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitFonksiyon_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitFonksiyon_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fonksiyon_cagirilmasiContext fonksiyon_cagirilmasi() throws RecognitionException {
		Fonksiyon_cagirilmasiContext _localctx = new Fonksiyon_cagirilmasiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fonksiyon_cagirilmasi);
		int _la;
		try {
			_localctx = new Fonksiyon_callContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			degisken_ismi();
			setState(222);
			match(T__2);
			setState(232);
			switch (_input.LA(1)) {
			case T__3:
				{
				}
				break;
			case T__1:
			case T__2:
			case T__6:
			case T__18:
			case T__21:
			case T__28:
			case T__29:
			case T__30:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__65:
			case T__71:
			case STRING:
			case RAKAM:
			case DEGISKEN_ISMI:
				{
				{
				setState(224);
				ifadeler(0);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(225);
					match(T__5);
					setState(226);
					ifadeler(0);
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(234);
			match(T__3);
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

	public static class Fonksiyon_bildirimleriContext extends ParserRuleContext {
		public Goster_komutuContext goster_komutu() {
			return getRuleContext(Goster_komutuContext.class,0);
		}
		public Referans_tanimiContext referans_tanimi() {
			return getRuleContext(Referans_tanimiContext.class,0);
		}
		public Degisken_tanimiContext degisken_tanimi() {
			return getRuleContext(Degisken_tanimiContext.class,0);
		}
		public Deger_atamaContext deger_atama() {
			return getRuleContext(Deger_atamaContext.class,0);
		}
		public Program_bitirContext program_bitir() {
			return getRuleContext(Program_bitirContext.class,0);
		}
		public Arraye_eklemeContext arraye_ekleme() {
			return getRuleContext(Arraye_eklemeContext.class,0);
		}
		public Sart_ifadesiContext sart_ifadesi() {
			return getRuleContext(Sart_ifadesiContext.class,0);
		}
		public Loop_yapisiContext loop_yapisi() {
			return getRuleContext(Loop_yapisiContext.class,0);
		}
		public Ikinci_loop_yapisiContext ikinci_loop_yapisi() {
			return getRuleContext(Ikinci_loop_yapisiContext.class,0);
		}
		public Case_yapisiContext case_yapisi() {
			return getRuleContext(Case_yapisiContext.class,0);
		}
		public Referans_atama_yapisiContext referans_atama_yapisi() {
			return getRuleContext(Referans_atama_yapisiContext.class,0);
		}
		public Fonksiyon_cagirilmasiContext fonksiyon_cagirilmasi() {
			return getRuleContext(Fonksiyon_cagirilmasiContext.class,0);
		}
		public Return_deyimiContext return_deyimi() {
			return getRuleContext(Return_deyimiContext.class,0);
		}
		public Donguden_cikContext donguden_cik() {
			return getRuleContext(Donguden_cikContext.class,0);
		}
		public For_dongusuContext for_dongusu() {
			return getRuleContext(For_dongusuContext.class,0);
		}
		public Continue_komutuContext continue_komutu() {
			return getRuleContext(Continue_komutuContext.class,0);
		}
		public Hata_gonderContext hata_gonder() {
			return getRuleContext(Hata_gonderContext.class,0);
		}
		public Try_yapisiContext try_yapisi() {
			return getRuleContext(Try_yapisiContext.class,0);
		}
		public Oku_komutuContext oku_komutu() {
			return getRuleContext(Oku_komutuContext.class,0);
		}
		public Tus_bekleContext tus_bekle() {
			return getRuleContext(Tus_bekleContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(DilParser.COMMENT, 0); }
		public Fonksiyon_bildirimleriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fonksiyon_bildirimleri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterFonksiyon_bildirimleri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitFonksiyon_bildirimleri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitFonksiyon_bildirimleri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fonksiyon_bildirimleriContext fonksiyon_bildirimleri() throws RecognitionException {
		Fonksiyon_bildirimleriContext _localctx = new Fonksiyon_bildirimleriContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fonksiyon_bildirimleri);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				goster_komutu();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				referans_tanimi();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				degisken_tanimi();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				deger_atama();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				program_bitir();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				arraye_ekleme();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				sart_ifadesi();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
				loop_yapisi();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				ikinci_loop_yapisi();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(245);
				case_yapisi();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(246);
				referans_atama_yapisi();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(247);
				fonksiyon_cagirilmasi();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(248);
				return_deyimi();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(249);
				donguden_cik();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(250);
				for_dongusu();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(251);
				continue_komutu();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(252);
				hata_gonder();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(253);
				try_yapisi();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(254);
				oku_komutu();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(255);
				tus_bekle();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(256);
				match(COMMENT);
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

	public static class Tus_bekleContext extends ParserRuleContext {
		public Tus_bekleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tus_bekle; }
	 
		public Tus_bekleContext() { }
		public void copyFrom(Tus_bekleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Getch_komutuContext extends Tus_bekleContext {
		public Getch_komutuContext(Tus_bekleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterGetch_komutu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitGetch_komutu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitGetch_komutu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tus_bekleContext tus_bekle() throws RecognitionException {
		Tus_bekleContext _localctx = new Tus_bekleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tus_bekle);
		try {
			_localctx = new Getch_komutuContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__15);
			setState(260);
			match(T__16);
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

	public static class Fonksiyon_parametreleriContext extends ParserRuleContext {
		public Degisken_tanimiContext degisken_tanimi() {
			return getRuleContext(Degisken_tanimiContext.class,0);
		}
		public Referans_tanimiContext referans_tanimi() {
			return getRuleContext(Referans_tanimiContext.class,0);
		}
		public Fonksiyon_parametreleriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fonksiyon_parametreleri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterFonksiyon_parametreleri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitFonksiyon_parametreleri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitFonksiyon_parametreleri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fonksiyon_parametreleriContext fonksiyon_parametreleri() throws RecognitionException {
		Fonksiyon_parametreleriContext _localctx = new Fonksiyon_parametreleriContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fonksiyon_parametreleri);
		try {
			setState(264);
			switch (_input.LA(1)) {
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case DEGISKEN_ISMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				degisken_tanimi();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				referans_tanimi();
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

	public static class Sinif_tanimiContext extends ParserRuleContext {
		public Sinif_tanimiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinif_tanimi; }
	 
		public Sinif_tanimiContext() { }
		public void copyFrom(Sinif_tanimiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Sinif_tanimlanmasiContext extends Sinif_tanimiContext {
		public Degisken_ismiContext degisken_ismi() {
			return getRuleContext(Degisken_ismiContext.class,0);
		}
		public List<Sinif_fonksiyon_tanimiContext> sinif_fonksiyon_tanimi() {
			return getRuleContexts(Sinif_fonksiyon_tanimiContext.class);
		}
		public Sinif_fonksiyon_tanimiContext sinif_fonksiyon_tanimi(int i) {
			return getRuleContext(Sinif_fonksiyon_tanimiContext.class,i);
		}
		public List<Sinif_degisken_tanimiContext> sinif_degisken_tanimi() {
			return getRuleContexts(Sinif_degisken_tanimiContext.class);
		}
		public Sinif_degisken_tanimiContext sinif_degisken_tanimi(int i) {
			return getRuleContext(Sinif_degisken_tanimiContext.class,i);
		}
		public Sinif_tanimlanmasiContext(Sinif_tanimiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterSinif_tanimlanmasi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitSinif_tanimlanmasi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitSinif_tanimlanmasi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sinif_tanimiContext sinif_tanimi() throws RecognitionException {
		Sinif_tanimiContext _localctx = new Sinif_tanimiContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sinif_tanimi);
		int _la;
		try {
			_localctx = new Sinif_tanimlanmasiContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__17);
			setState(267);
			degisken_ismi();
			setState(268);
			match(T__6);
			setState(271); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(269);
					sinif_fonksiyon_tanimi();
					}
					break;
				case 2:
					{
					setState(270);
					sinif_degisken_tanimi();
					}
					break;
				}
				}
				setState(273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__19 || _la==T__20 );
			setState(275);
			match(T__7);
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

	public static class Yeni_sinif_objesiContext extends ParserRuleContext {
		public Yeni_sinif_objesiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yeni_sinif_objesi; }
	 
		public Yeni_sinif_objesiContext() { }
		public void copyFrom(Yeni_sinif_objesiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Sinif_elema_olusturmaContext extends Yeni_sinif_objesiContext {
		public Fonksiyon_cagirilmasiContext fonksiyon_cagirilmasi() {
			return getRuleContext(Fonksiyon_cagirilmasiContext.class,0);
		}
		public Sinif_elema_olusturmaContext(Yeni_sinif_objesiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterSinif_elema_olusturma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitSinif_elema_olusturma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitSinif_elema_olusturma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yeni_sinif_objesiContext yeni_sinif_objesi() throws RecognitionException {
		Yeni_sinif_objesiContext _localctx = new Yeni_sinif_objesiContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_yeni_sinif_objesi);
		try {
			_localctx = new Sinif_elema_olusturmaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__18);
			setState(278);
			fonksiyon_cagirilmasi();
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

	public static class Sinif_degisken_tanimiContext extends ParserRuleContext {
		public Sinif_degisken_tanimiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinif_degisken_tanimi; }
	 
		public Sinif_degisken_tanimiContext() { }
		public void copyFrom(Sinif_degisken_tanimiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Sinif_eleman_olusturmaContext extends Sinif_degisken_tanimiContext {
		public Ulasim_anahtarlariContext ulasim_anahtarlari() {
			return getRuleContext(Ulasim_anahtarlariContext.class,0);
		}
		public Grup_degiskeniContext grup_degiskeni() {
			return getRuleContext(Grup_degiskeniContext.class,0);
		}
		public Sinif_eleman_olusturmaContext(Sinif_degisken_tanimiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterSinif_eleman_olusturma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitSinif_eleman_olusturma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitSinif_eleman_olusturma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sinif_degisken_tanimiContext sinif_degisken_tanimi() throws RecognitionException {
		Sinif_degisken_tanimiContext _localctx = new Sinif_degisken_tanimiContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sinif_degisken_tanimi);
		try {
			_localctx = new Sinif_eleman_olusturmaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			ulasim_anahtarlari();
			setState(281);
			grup_degiskeni();
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

	public static class Sinif_fonksiyon_tanimiContext extends ParserRuleContext {
		public Ulasim_anahtarlariContext ulasim_anahtarlari() {
			return getRuleContext(Ulasim_anahtarlariContext.class,0);
		}
		public Fonksiyon_tanimiContext fonksiyon_tanimi() {
			return getRuleContext(Fonksiyon_tanimiContext.class,0);
		}
		public Sinif_fonksiyon_tanimiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinif_fonksiyon_tanimi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterSinif_fonksiyon_tanimi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitSinif_fonksiyon_tanimi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitSinif_fonksiyon_tanimi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sinif_fonksiyon_tanimiContext sinif_fonksiyon_tanimi() throws RecognitionException {
		Sinif_fonksiyon_tanimiContext _localctx = new Sinif_fonksiyon_tanimiContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sinif_fonksiyon_tanimi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			ulasim_anahtarlari();
			setState(284);
			fonksiyon_tanimi();
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

	public static class Ulasim_anahtarlariContext extends ParserRuleContext {
		public Ulasim_anahtarlariContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ulasim_anahtarlari; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterUlasim_anahtarlari(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitUlasim_anahtarlari(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitUlasim_anahtarlari(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ulasim_anahtarlariContext ulasim_anahtarlari() throws RecognitionException {
		Ulasim_anahtarlariContext _localctx = new Ulasim_anahtarlariContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ulasim_anahtarlari);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Oku_komutuContext extends ParserRuleContext {
		public Oku_komutuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oku_komutu; }
	 
		public Oku_komutuContext() { }
		public void copyFrom(Oku_komutuContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Oku_commandContext extends Oku_komutuContext {
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Oku_commandContext(Oku_komutuContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterOku_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitOku_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitOku_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oku_komutuContext oku_komutu() throws RecognitionException {
		Oku_komutuContext _localctx = new Oku_komutuContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_oku_komutu);
		try {
			_localctx = new Oku_commandContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__21);
			setState(289);
			match(T__2);
			setState(290);
			ifadeler(0);
			setState(291);
			match(T__3);
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

	public static class Degisken_grubuContext extends ParserRuleContext {
		public Degisken_grubuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degisken_grubu; }
	 
		public Degisken_grubuContext() { }
		public void copyFrom(Degisken_grubuContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Degisken_grubu_tanimiContext extends Degisken_grubuContext {
		public Degisken_ismiContext degisken_ismi() {
			return getRuleContext(Degisken_ismiContext.class,0);
		}
		public List<Grup_degiskeniContext> grup_degiskeni() {
			return getRuleContexts(Grup_degiskeniContext.class);
		}
		public Grup_degiskeniContext grup_degiskeni(int i) {
			return getRuleContext(Grup_degiskeniContext.class,i);
		}
		public Degisken_grubu_tanimiContext(Degisken_grubuContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterDegisken_grubu_tanimi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitDegisken_grubu_tanimi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitDegisken_grubu_tanimi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Degisken_grubuContext degisken_grubu() throws RecognitionException {
		Degisken_grubuContext _localctx = new Degisken_grubuContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_degisken_grubu);
		int _la;
		try {
			_localctx = new Degisken_grubu_tanimiContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__22);
			setState(294);
			match(T__23);
			setState(295);
			degisken_ismi();
			setState(296);
			match(T__24);
			setState(297);
			grup_degiskeni();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(298);
				match(T__5);
				setState(299);
				grup_degiskeni();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(T__25);
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

	public static class Grup_degiskeniContext extends ParserRuleContext {
		public Referans_tanimiContext referans_tanimi() {
			return getRuleContext(Referans_tanimiContext.class,0);
		}
		public Degisken_tanimiContext degisken_tanimi() {
			return getRuleContext(Degisken_tanimiContext.class,0);
		}
		public Grup_degiskeniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grup_degiskeni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterGrup_degiskeni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitGrup_degiskeni(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitGrup_degiskeni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grup_degiskeniContext grup_degiskeni() throws RecognitionException {
		Grup_degiskeniContext _localctx = new Grup_degiskeniContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_grup_degiskeni);
		try {
			setState(309);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				referans_tanimi();
				}
				break;
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case DEGISKEN_ISMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				degisken_tanimi();
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

	public static class Referans_tanimiContext extends ParserRuleContext {
		public List<Referans_durumContext> referans_durum() {
			return getRuleContexts(Referans_durumContext.class);
		}
		public Referans_durumContext referans_durum(int i) {
			return getRuleContext(Referans_durumContext.class,i);
		}
		public Referans_tanimiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referans_tanimi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterReferans_tanimi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitReferans_tanimi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitReferans_tanimi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Referans_tanimiContext referans_tanimi() throws RecognitionException {
		Referans_tanimiContext _localctx = new Referans_tanimiContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_referans_tanimi);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__26);
			setState(312);
			referans_durum();
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(313);
					match(T__5);
					setState(314);
					referans_durum();
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Referans_durumContext extends ParserRuleContext {
		public Referans_durumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referans_durum; }
	 
		public Referans_durumContext() { }
		public void copyFrom(Referans_durumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Sadece_referans_ismiContext extends Referans_durumContext {
		public Degisken_ismiContext degisken_ismi() {
			return getRuleContext(Degisken_ismiContext.class,0);
		}
		public Sadece_referans_ismiContext(Referans_durumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterSadece_referans_ismi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitSadece_referans_ismi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitSadece_referans_ismi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atamali_referans_ismiContext extends Referans_durumContext {
		public List<Degisken_ismiContext> degisken_ismi() {
			return getRuleContexts(Degisken_ismiContext.class);
		}
		public Degisken_ismiContext degisken_ismi(int i) {
			return getRuleContext(Degisken_ismiContext.class,i);
		}
		public Atamali_referans_ismiContext(Referans_durumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterAtamali_referans_ismi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitAtamali_referans_ismi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitAtamali_referans_ismi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Referans_durumContext referans_durum() throws RecognitionException {
		Referans_durumContext _localctx = new Referans_durumContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_referans_durum);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new Sadece_referans_ismiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				degisken_ismi();
				}
				break;
			case 2:
				_localctx = new Atamali_referans_ismiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				degisken_ismi();
				setState(322);
				match(T__27);
				setState(323);
				degisken_ismi();
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

	public static class Referans_atama_yapisiContext extends ParserRuleContext {
		public Referans_atama_yapisiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referans_atama_yapisi; }
	 
		public Referans_atama_yapisiContext() { }
		public void copyFrom(Referans_atama_yapisiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Referans_atamaContext extends Referans_atama_yapisiContext {
		public List<Referans_olabilenlerContext> referans_olabilenler() {
			return getRuleContexts(Referans_olabilenlerContext.class);
		}
		public Referans_olabilenlerContext referans_olabilenler(int i) {
			return getRuleContext(Referans_olabilenlerContext.class,i);
		}
		public Referans_atamaContext(Referans_atama_yapisiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterReferans_atama(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitReferans_atama(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitReferans_atama(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Referans_atama_yapisiContext referans_atama_yapisi() throws RecognitionException {
		Referans_atama_yapisiContext _localctx = new Referans_atama_yapisiContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_referans_atama_yapisi);
		try {
			_localctx = new Referans_atamaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			referans_olabilenler();
			setState(328);
			match(T__27);
			setState(329);
			referans_olabilenler();
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

	public static class Referans_olabilenlerContext extends ParserRuleContext {
		public Degisken_ismiContext degisken_ismi() {
			return getRuleContext(Degisken_ismiContext.class,0);
		}
		public Degisken_grubu_elemaniContext degisken_grubu_elemani() {
			return getRuleContext(Degisken_grubu_elemaniContext.class,0);
		}
		public Array_degiskeniContext array_degiskeni() {
			return getRuleContext(Array_degiskeniContext.class,0);
		}
		public Yok_ifadesiContext yok_ifadesi() {
			return getRuleContext(Yok_ifadesiContext.class,0);
		}
		public Referans_olabilenlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referans_olabilenler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterReferans_olabilenler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitReferans_olabilenler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitReferans_olabilenler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Referans_olabilenlerContext referans_olabilenler() throws RecognitionException {
		Referans_olabilenlerContext _localctx = new Referans_olabilenlerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_referans_olabilenler);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				degisken_ismi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				degisken_grubu_elemani(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				array_degiskeni();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				yok_ifadesi();
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

	public static class Degisken_tanimiContext extends ParserRuleContext {
		public Degisken_tanimiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degisken_tanimi; }
	 
		public Degisken_tanimiContext() { }
		public void copyFrom(Degisken_tanimiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Degisken_tanimlaContext extends Degisken_tanimiContext {
		public Degisken_turuContext degisken_turu() {
			return getRuleContext(Degisken_turuContext.class,0);
		}
		public List<Degisken_durumContext> degisken_durum() {
			return getRuleContexts(Degisken_durumContext.class);
		}
		public Degisken_durumContext degisken_durum(int i) {
			return getRuleContext(Degisken_durumContext.class,i);
		}
		public Degisken_tanimlaContext(Degisken_tanimiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterDegisken_tanimla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitDegisken_tanimla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitDegisken_tanimla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Degisken_tanimiContext degisken_tanimi() throws RecognitionException {
		Degisken_tanimiContext _localctx = new Degisken_tanimiContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_degisken_tanimi);
		try {
			int _alt;
			_localctx = new Degisken_tanimlaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			degisken_turu();
			setState(338);
			degisken_durum();
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(339);
					match(T__5);
					setState(340);
					degisken_durum();
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class Degisken_durumContext extends ParserRuleContext {
		public Degisken_durumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degisken_durum; }
	 
		public Degisken_durumContext() { }
		public void copyFrom(Degisken_durumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Sadece_isimContext extends Degisken_durumContext {
		public Degisken_ismiContext degisken_ismi() {
			return getRuleContext(Degisken_ismiContext.class,0);
		}
		public Sadece_isimContext(Degisken_durumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterSadece_isim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitSadece_isim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitSadece_isim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ilk_degerliContext extends Degisken_durumContext {
		public Degisken_ismiContext degisken_ismi() {
			return getRuleContext(Degisken_ismiContext.class,0);
		}
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Ilk_degerliContext(Degisken_durumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterIlk_degerli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitIlk_degerli(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitIlk_degerli(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Degisken_durumContext degisken_durum() throws RecognitionException {
		Degisken_durumContext _localctx = new Degisken_durumContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_degisken_durum);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new Sadece_isimContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				degisken_ismi();
				}
				break;
			case 2:
				_localctx = new Ilk_degerliContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				degisken_ismi();
				setState(348);
				match(T__14);
				setState(349);
				ifadeler(0);
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

	public static class MantikContext extends ParserRuleContext {
		public MantikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mantik; }
	 
		public MantikContext() { }
		public void copyFrom(MantikContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class YanlisContext extends MantikContext {
		public YanlisContext(MantikContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterYanlis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitYanlis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitYanlis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DogruContext extends MantikContext {
		public DogruContext(MantikContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterDogru(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitDogru(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitDogru(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MantikContext mantik() throws RecognitionException {
		MantikContext _localctx = new MantikContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mantik);
		try {
			setState(355);
			switch (_input.LA(1)) {
			case T__28:
				_localctx = new DogruContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(T__28);
				}
				break;
			case T__29:
				_localctx = new YanlisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(T__29);
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

	public static class Yok_ifadesiContext extends ParserRuleContext {
		public Yok_ifadesiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yok_ifadesi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterYok_ifadesi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitYok_ifadesi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitYok_ifadesi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yok_ifadesiContext yok_ifadesi() throws RecognitionException {
		Yok_ifadesiContext _localctx = new Yok_ifadesiContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_yok_ifadesi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__30);
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

	public static class Degisken_grub_elemanContext extends ParserRuleContext {
		public Degisken_ismiContext degisken_ismi() {
			return getRuleContext(Degisken_ismiContext.class,0);
		}
		public Array_degiskeniContext array_degiskeni() {
			return getRuleContext(Array_degiskeniContext.class,0);
		}
		public Yeni_sinif_objesiContext yeni_sinif_objesi() {
			return getRuleContext(Yeni_sinif_objesiContext.class,0);
		}
		public List<Degisken_grub_elemanContext> degisken_grub_eleman() {
			return getRuleContexts(Degisken_grub_elemanContext.class);
		}
		public Degisken_grub_elemanContext degisken_grub_eleman(int i) {
			return getRuleContext(Degisken_grub_elemanContext.class,i);
		}
		public Degisken_grub_elemanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degisken_grub_eleman; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterDegisken_grub_eleman(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitDegisken_grub_eleman(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitDegisken_grub_eleman(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Degisken_grub_elemanContext degisken_grub_eleman() throws RecognitionException {
		return degisken_grub_eleman(0);
	}

	private Degisken_grub_elemanContext degisken_grub_eleman(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Degisken_grub_elemanContext _localctx = new Degisken_grub_elemanContext(_ctx, _parentState);
		Degisken_grub_elemanContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_degisken_grub_eleman, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(360);
				degisken_ismi();
				}
				break;
			case 2:
				{
				setState(361);
				array_degiskeni();
				}
				break;
			case 3:
				{
				setState(362);
				yeni_sinif_objesi();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Degisken_grub_elemanContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_degisken_grub_eleman);
					setState(365);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(366);
					match(T__31);
					setState(367);
					degisken_grub_eleman(5);
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Sinif_fonksiyon_cagirmaContext extends ParserRuleContext {
		public Sinif_fonksiyon_cagirmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinif_fonksiyon_cagirma; }
	 
		public Sinif_fonksiyon_cagirmaContext() { }
		public void copyFrom(Sinif_fonksiyon_cagirmaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Sinif_fonksiyon_cagirmasiContext extends Sinif_fonksiyon_cagirmaContext {
		public Structure_elemanContext structure_eleman() {
			return getRuleContext(Structure_elemanContext.class,0);
		}
		public Fonksiyon_cagirilmasiContext fonksiyon_cagirilmasi() {
			return getRuleContext(Fonksiyon_cagirilmasiContext.class,0);
		}
		public Sinif_fonksiyon_cagirmasiContext(Sinif_fonksiyon_cagirmaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterSinif_fonksiyon_cagirmasi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitSinif_fonksiyon_cagirmasi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitSinif_fonksiyon_cagirmasi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sinif_fonksiyon_cagirmaContext sinif_fonksiyon_cagirma() throws RecognitionException {
		Sinif_fonksiyon_cagirmaContext _localctx = new Sinif_fonksiyon_cagirmaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sinif_fonksiyon_cagirma);
		try {
			_localctx = new Sinif_fonksiyon_cagirmasiContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			structure_eleman();
			setState(374);
			match(T__31);
			setState(375);
			fonksiyon_cagirilmasi();
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

	public static class Degisken_grubu_elemaniContext extends ParserRuleContext {
		public Degisken_grubu_elemaniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degisken_grubu_elemani; }
	 
		public Degisken_grubu_elemaniContext() { }
		public void copyFrom(Degisken_grubu_elemaniContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Degisken_grubu_elemani_elemaniContext extends Degisken_grubu_elemaniContext {
		public List<Structure_elemanContext> structure_eleman() {
			return getRuleContexts(Structure_elemanContext.class);
		}
		public Structure_elemanContext structure_eleman(int i) {
			return getRuleContext(Structure_elemanContext.class,i);
		}
		public Degisken_grubu_elemani_elemaniContext(Degisken_grubu_elemaniContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterDegisken_grubu_elemani_elemani(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitDegisken_grubu_elemani_elemani(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitDegisken_grubu_elemani_elemani(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Degisken_grubContext extends Degisken_grubu_elemaniContext {
		public Degisken_grubu_elemaniContext degisken_grubu_elemani() {
			return getRuleContext(Degisken_grubu_elemaniContext.class,0);
		}
		public Structure_elemanContext structure_eleman() {
			return getRuleContext(Structure_elemanContext.class,0);
		}
		public Degisken_grubContext(Degisken_grubu_elemaniContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterDegisken_grub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitDegisken_grub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitDegisken_grub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Degisken_grubu_elemaniContext degisken_grubu_elemani() throws RecognitionException {
		return degisken_grubu_elemani(0);
	}

	private Degisken_grubu_elemaniContext degisken_grubu_elemani(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Degisken_grubu_elemaniContext _localctx = new Degisken_grubu_elemaniContext(_ctx, _parentState);
		Degisken_grubu_elemaniContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_degisken_grubu_elemani, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Degisken_grubu_elemani_elemaniContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(378);
			structure_eleman();
			setState(379);
			match(T__31);
			setState(380);
			structure_eleman();
			}
			_ctx.stop = _input.LT(-1);
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Degisken_grubContext(new Degisken_grubu_elemaniContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_degisken_grubu_elemani);
					setState(382);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(383);
					match(T__31);
					setState(384);
					structure_eleman();
					}
					} 
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Structure_elemanContext extends ParserRuleContext {
		public Array_degiskeniContext array_degiskeni() {
			return getRuleContext(Array_degiskeniContext.class,0);
		}
		public Degisken_ismiContext degisken_ismi() {
			return getRuleContext(Degisken_ismiContext.class,0);
		}
		public Yeni_sinif_objesiContext yeni_sinif_objesi() {
			return getRuleContext(Yeni_sinif_objesiContext.class,0);
		}
		public Structure_elemanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure_eleman; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterStructure_eleman(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitStructure_eleman(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitStructure_eleman(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structure_elemanContext structure_eleman() throws RecognitionException {
		Structure_elemanContext _localctx = new Structure_elemanContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_structure_eleman);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				array_degiskeni();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				degisken_ismi();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				yeni_sinif_objesi();
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

	public static class Sart_ifadesiContext extends ParserRuleContext {
		public Sart_ifadesiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sart_ifadesi; }
	 
		public Sart_ifadesiContext() { }
		public void copyFrom(Sart_ifadesiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Sart_komutuContext extends Sart_ifadesiContext {
		public Mantik_ifadeleriContext mantik_ifadeleri() {
			return getRuleContext(Mantik_ifadeleriContext.class,0);
		}
		public Dogru_degilse_yapisiContext dogru_degilse_yapisi() {
			return getRuleContext(Dogru_degilse_yapisiContext.class,0);
		}
		public List<BildirimlerContext> bildirimler() {
			return getRuleContexts(BildirimlerContext.class);
		}
		public BildirimlerContext bildirimler(int i) {
			return getRuleContext(BildirimlerContext.class,i);
		}
		public List<Veya_dogruysa_yapisiContext> veya_dogruysa_yapisi() {
			return getRuleContexts(Veya_dogruysa_yapisiContext.class);
		}
		public Veya_dogruysa_yapisiContext veya_dogruysa_yapisi(int i) {
			return getRuleContext(Veya_dogruysa_yapisiContext.class,i);
		}
		public Sart_komutuContext(Sart_ifadesiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterSart_komutu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitSart_komutu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitSart_komutu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sart_ifadesiContext sart_ifadesi() throws RecognitionException {
		Sart_ifadesiContext _localctx = new Sart_ifadesiContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sart_ifadesi);
		int _la;
		try {
			_localctx = new Sart_komutuContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			mantik_ifadeleri(0);
			setState(399);
			switch (_input.LA(1)) {
			case T__28:
				{
				setState(396);
				match(T__28);
				setState(397);
				match(T__32);
				}
				break;
			case T__33:
				{
				setState(398);
				match(T__33);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(401);
			match(T__24);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__71 - 66)) | (1L << (T__73 - 66)) | (1L << (T__76 - 66)) | (1L << (T__79 - 66)) | (1L << (T__85 - 66)) | (1L << (STRING - 66)) | (1L << (COMMENT - 66)) | (1L << (RAKAM - 66)) | (1L << (DEGISKEN_ISMI - 66)))) != 0)) {
				{
				{
				setState(402);
				bildirimler();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			match(T__25);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35 || _la==T__36) {
				{
				{
				setState(409);
				veya_dogruysa_yapisi();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(416);
				dogru_degilse_yapisi();
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

	public static class Dogru_degilse_yapisiContext extends ParserRuleContext {
		public Dogru_degilse_yapisiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dogru_degilse_yapisi; }
	 
		public Dogru_degilse_yapisiContext() { }
		public void copyFrom(Dogru_degilse_yapisiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Dogru_degilContext extends Dogru_degilse_yapisiContext {
		public List<BildirimlerContext> bildirimler() {
			return getRuleContexts(BildirimlerContext.class);
		}
		public BildirimlerContext bildirimler(int i) {
			return getRuleContext(BildirimlerContext.class,i);
		}
		public Dogru_degilContext(Dogru_degilse_yapisiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterDogru_degil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitDogru_degil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitDogru_degil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dogru_degilse_yapisiContext dogru_degilse_yapisi() throws RecognitionException {
		Dogru_degilse_yapisiContext _localctx = new Dogru_degilse_yapisiContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dogru_degilse_yapisi);
		int _la;
		try {
			_localctx = new Dogru_degilContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__28);
			setState(420);
			match(T__34);
			setState(421);
			match(T__24);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__71 - 66)) | (1L << (T__73 - 66)) | (1L << (T__76 - 66)) | (1L << (T__79 - 66)) | (1L << (T__85 - 66)) | (1L << (STRING - 66)) | (1L << (COMMENT - 66)) | (1L << (RAKAM - 66)) | (1L << (DEGISKEN_ISMI - 66)))) != 0)) {
				{
				{
				setState(422);
				bildirimler();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			match(T__25);
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

	public static class Veya_dogruysa_yapisiContext extends ParserRuleContext {
		public Mantik_ifadeleriContext mantik_ifadeleri() {
			return getRuleContext(Mantik_ifadeleriContext.class,0);
		}
		public List<BildirimlerContext> bildirimler() {
			return getRuleContexts(BildirimlerContext.class);
		}
		public BildirimlerContext bildirimler(int i) {
			return getRuleContext(BildirimlerContext.class,i);
		}
		public Veya_dogruysa_yapisiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_veya_dogruysa_yapisi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterVeya_dogruysa_yapisi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitVeya_dogruysa_yapisi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitVeya_dogruysa_yapisi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Veya_dogruysa_yapisiContext veya_dogruysa_yapisi() throws RecognitionException {
		Veya_dogruysa_yapisiContext _localctx = new Veya_dogruysa_yapisiContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_veya_dogruysa_yapisi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(431);
			mantik_ifadeleri(0);
			setState(435);
			switch (_input.LA(1)) {
			case T__28:
				{
				setState(432);
				match(T__28);
				setState(433);
				match(T__32);
				}
				break;
			case T__33:
				{
				setState(434);
				match(T__33);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(437);
			match(T__24);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__71 - 66)) | (1L << (T__73 - 66)) | (1L << (T__76 - 66)) | (1L << (T__79 - 66)) | (1L << (T__85 - 66)) | (1L << (STRING - 66)) | (1L << (COMMENT - 66)) | (1L << (RAKAM - 66)) | (1L << (DEGISKEN_ISMI - 66)))) != 0)) {
				{
				{
				setState(438);
				bildirimler();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
			match(T__25);
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

	public static class Mantik_ifadeleriContext extends ParserRuleContext {
		public Mantik_ifadeleriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mantik_ifadeleri; }
	 
		public Mantik_ifadeleriContext() { }
		public void copyFrom(Mantik_ifadeleriContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Normal_dogru_ifadeContext extends Mantik_ifadeleriContext {
		public Dogruluk_ifadeleriContext dogruluk_ifadeleri() {
			return getRuleContext(Dogruluk_ifadeleriContext.class,0);
		}
		public Normal_dogru_ifadeContext(Mantik_ifadeleriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterNormal_dogru_ifade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitNormal_dogru_ifade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitNormal_dogru_ifade(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Parantezli_mantikContext extends Mantik_ifadeleriContext {
		public Mantik_ifadeleriContext mantik_ifadeleri() {
			return getRuleContext(Mantik_ifadeleriContext.class,0);
		}
		public Parantezli_mantikContext(Mantik_ifadeleriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterParantezli_mantik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitParantezli_mantik(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitParantezli_mantik(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Veya_islecContext extends Mantik_ifadeleriContext {
		public List<Mantik_ifadeleriContext> mantik_ifadeleri() {
			return getRuleContexts(Mantik_ifadeleriContext.class);
		}
		public Mantik_ifadeleriContext mantik_ifadeleri(int i) {
			return getRuleContext(Mantik_ifadeleriContext.class,i);
		}
		public Veya_islecContext(Mantik_ifadeleriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterVeya_islec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitVeya_islec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitVeya_islec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ve_islecContext extends Mantik_ifadeleriContext {
		public List<Mantik_ifadeleriContext> mantik_ifadeleri() {
			return getRuleContexts(Mantik_ifadeleriContext.class);
		}
		public Mantik_ifadeleriContext mantik_ifadeleri(int i) {
			return getRuleContext(Mantik_ifadeleriContext.class,i);
		}
		public Ve_islecContext(Mantik_ifadeleriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterVe_islec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitVe_islec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitVe_islec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mantik_ifadeleriContext mantik_ifadeleri() throws RecognitionException {
		return mantik_ifadeleri(0);
	}

	private Mantik_ifadeleriContext mantik_ifadeleri(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Mantik_ifadeleriContext _localctx = new Mantik_ifadeleriContext(_ctx, _parentState);
		Mantik_ifadeleriContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_mantik_ifadeleri, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				_localctx = new Parantezli_mantikContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(447);
				match(T__2);
				setState(448);
				mantik_ifadeleri(0);
				setState(449);
				match(T__3);
				}
				break;
			case 2:
				{
				_localctx = new Normal_dogru_ifadeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(451);
				dogruluk_ifadeleri();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(460);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new Ve_islecContext(new Mantik_ifadeleriContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mantik_ifadeleri);
						setState(454);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(455);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(456);
						mantik_ifadeleri(4);
						}
						break;
					case 2:
						{
						_localctx = new Veya_islecContext(new Mantik_ifadeleriContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mantik_ifadeleri);
						setState(457);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(458);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__40))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(459);
						mantik_ifadeleri(3);
						}
						break;
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class Dogruluk_ifadeleriContext extends ParserRuleContext {
		public Dogruluk_ifadeleriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dogruluk_ifadeleri; }
	 
		public Dogruluk_ifadeleriContext() { }
		public void copyFrom(Dogruluk_ifadeleriContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Parantezli_dogruContext extends Dogruluk_ifadeleriContext {
		public Dogruluk_ifadeleriContext dogruluk_ifadeleri() {
			return getRuleContext(Dogruluk_ifadeleriContext.class,0);
		}
		public Parantezli_dogruContext(Dogruluk_ifadeleriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterParantezli_dogru(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitParantezli_dogru(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitParantezli_dogru(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuyukContext extends Dogruluk_ifadeleriContext {
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public BuyukContext(Dogruluk_ifadeleriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterBuyuk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitBuyuk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitBuyuk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Buyuk_esitContext extends Dogruluk_ifadeleriContext {
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public Buyuk_esitContext(Dogruluk_ifadeleriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterBuyuk_esit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitBuyuk_esit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitBuyuk_esit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Esit_degilContext extends Dogruluk_ifadeleriContext {
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public Esit_degilContext(Dogruluk_ifadeleriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterEsit_degil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitEsit_degil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitEsit_degil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DegiliContext extends Dogruluk_ifadeleriContext {
		public Dogruluk_ifadeleriContext dogruluk_ifadeleri() {
			return getRuleContext(Dogruluk_ifadeleriContext.class,0);
		}
		public DegiliContext(Dogruluk_ifadeleriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterDegili(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitDegili(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitDegili(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Saf_degerContext extends Dogruluk_ifadeleriContext {
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Saf_degerContext(Dogruluk_ifadeleriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterSaf_deger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitSaf_deger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitSaf_deger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KucukContext extends Dogruluk_ifadeleriContext {
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public KucukContext(Dogruluk_ifadeleriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterKucuk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitKucuk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitKucuk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EsitContext extends Dogruluk_ifadeleriContext {
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public EsitContext(Dogruluk_ifadeleriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterEsit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitEsit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitEsit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Kucuk_esitContext extends Dogruluk_ifadeleriContext {
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public Kucuk_esitContext(Dogruluk_ifadeleriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterKucuk_esit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitKucuk_esit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitKucuk_esit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dogruluk_ifadeleriContext dogruluk_ifadeleri() throws RecognitionException {
		Dogruluk_ifadeleriContext _localctx = new Dogruluk_ifadeleriContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_dogruluk_ifadeleri);
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new Parantezli_dogruContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(T__2);
				setState(466);
				dogruluk_ifadeleri();
				setState(467);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new DegiliContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(T__41);
				setState(470);
				dogruluk_ifadeleri();
				}
				break;
			case 3:
				_localctx = new BuyukContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				ifadeler(0);
				{
				setState(472);
				match(T__25);
				}
				setState(473);
				ifadeler(0);
				}
				break;
			case 4:
				_localctx = new KucukContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				ifadeler(0);
				setState(476);
				match(T__24);
				setState(477);
				ifadeler(0);
				}
				break;
			case 5:
				_localctx = new EsitContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(479);
				ifadeler(0);
				setState(480);
				match(T__42);
				setState(481);
				ifadeler(0);
				}
				break;
			case 6:
				_localctx = new Buyuk_esitContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(483);
				ifadeler(0);
				setState(484);
				match(T__43);
				setState(485);
				ifadeler(0);
				}
				break;
			case 7:
				_localctx = new Kucuk_esitContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(487);
				ifadeler(0);
				setState(488);
				match(T__44);
				setState(489);
				ifadeler(0);
				}
				break;
			case 8:
				_localctx = new Esit_degilContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(491);
				ifadeler(0);
				setState(492);
				match(T__45);
				setState(493);
				ifadeler(0);
				}
				break;
			case 9:
				_localctx = new Saf_degerContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(495);
				ifadeler(0);
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

	public static class Arraye_eklemeContext extends ParserRuleContext {
		public Arraye_eklemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraye_ekleme; }
	 
		public Arraye_eklemeContext() { }
		public void copyFrom(Arraye_eklemeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Array_eleman_eklemeContext extends Arraye_eklemeContext {
		public Sol_taraf_degiskenleriContext sol_taraf_degiskenleri() {
			return getRuleContext(Sol_taraf_degiskenleriContext.class,0);
		}
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Array_eleman_eklemeContext(Arraye_eklemeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterArray_eleman_ekleme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitArray_eleman_ekleme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitArray_eleman_ekleme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arraye_eklemeContext arraye_ekleme() throws RecognitionException {
		Arraye_eklemeContext _localctx = new Arraye_eklemeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arraye_ekleme);
		try {
			_localctx = new Array_eleman_eklemeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			sol_taraf_degiskenleri();
			setState(499);
			match(T__31);
			setState(500);
			match(T__46);
			setState(501);
			match(T__2);
			setState(502);
			ifadeler(0);
			setState(503);
			match(T__3);
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

	public static class Degisken_turuContext extends ParserRuleContext {
		public Degisken_ismiContext degisken_ismi() {
			return getRuleContext(Degisken_ismiContext.class,0);
		}
		public Degisken_turuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degisken_turu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterDegisken_turu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitDegisken_turu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitDegisken_turu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Degisken_turuContext degisken_turu() throws RecognitionException {
		Degisken_turuContext _localctx = new Degisken_turuContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_degisken_turu);
		try {
			setState(512);
			switch (_input.LA(1)) {
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 3);
				{
				setState(507);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 4);
				{
				setState(508);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 5);
				{
				setState(509);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 6);
				{
				setState(510);
				match(T__52);
				}
				break;
			case DEGISKEN_ISMI:
				enterOuterAlt(_localctx, 7);
				{
				setState(511);
				degisken_ismi();
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

	public static class Goster_komutuContext extends ParserRuleContext {
		public Goster_komutuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goster_komutu; }
	 
		public Goster_komutuContext() { }
		public void copyFrom(Goster_komutuContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Goster_commandContext extends Goster_komutuContext {
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public Goster_commandContext(Goster_komutuContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterGoster_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitGoster_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitGoster_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Goster_komutuContext goster_komutu() throws RecognitionException {
		Goster_komutuContext _localctx = new Goster_komutuContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_goster_komutu);
		int _la;
		try {
			_localctx = new Goster_commandContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(T__53);
			setState(515);
			ifadeler(0);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(516);
				match(T__5);
				setState(517);
				ifadeler(0);
				}
				}
				setState(522);
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

	public static class Program_bitirContext extends ParserRuleContext {
		public Program_bitirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_bitir; }
	 
		public Program_bitirContext() { }
		public void copyFrom(Program_bitirContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Program_sonlandirContext extends Program_bitirContext {
		public Program_sonlandirContext(Program_bitirContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterProgram_sonlandir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitProgram_sonlandir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitProgram_sonlandir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Program_bitirContext program_bitir() throws RecognitionException {
		Program_bitirContext _localctx = new Program_bitirContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_program_bitir);
		try {
			_localctx = new Program_sonlandirContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(T__54);
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

	public static class Deger_atamaContext extends ParserRuleContext {
		public Deger_atamaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deger_atama; }
	 
		public Deger_atamaContext() { }
		public void copyFrom(Deger_atamaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Deger_ataContext extends Deger_atamaContext {
		public List<Sol_taraf_degiskenleriContext> sol_taraf_degiskenleri() {
			return getRuleContexts(Sol_taraf_degiskenleriContext.class);
		}
		public Sol_taraf_degiskenleriContext sol_taraf_degiskenleri(int i) {
			return getRuleContext(Sol_taraf_degiskenleriContext.class,i);
		}
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public Deger_ataContext(Deger_atamaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterDeger_ata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitDeger_ata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitDeger_ata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deger_atamaContext deger_atama() throws RecognitionException {
		Deger_atamaContext _localctx = new Deger_atamaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_deger_atama);
		int _la;
		try {
			_localctx = new Deger_ataContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			sol_taraf_degiskenleri();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(526);
				match(T__5);
				setState(527);
				sol_taraf_degiskenleri();
				}
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(533);
			match(T__14);
			setState(534);
			ifadeler(0);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(535);
				match(T__5);
				setState(536);
				ifadeler(0);
				}
				}
				setState(541);
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

	public static class Sol_taraf_degiskenleriContext extends ParserRuleContext {
		public Degisken_ismiContext degisken_ismi() {
			return getRuleContext(Degisken_ismiContext.class,0);
		}
		public Array_degiskeniContext array_degiskeni() {
			return getRuleContext(Array_degiskeniContext.class,0);
		}
		public Degisken_grubu_elemaniContext degisken_grubu_elemani() {
			return getRuleContext(Degisken_grubu_elemaniContext.class,0);
		}
		public Sol_taraf_degiskenleriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sol_taraf_degiskenleri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterSol_taraf_degiskenleri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitSol_taraf_degiskenleri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitSol_taraf_degiskenleri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sol_taraf_degiskenleriContext sol_taraf_degiskenleri() throws RecognitionException {
		Sol_taraf_degiskenleriContext _localctx = new Sol_taraf_degiskenleriContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_sol_taraf_degiskenleri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(542);
				degisken_ismi();
				}
				break;
			case 2:
				{
				setState(543);
				array_degiskeni();
				}
				break;
			case 3:
				{
				setState(544);
				degisken_grubu_elemani(0);
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

	public static class IfadelerContext extends ParserRuleContext {
		public IfadelerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifadeler; }
	 
		public IfadelerContext() { }
		public void copyFrom(IfadelerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Sinif_fonksiyon_degerContext extends IfadelerContext {
		public Sinif_fonksiyon_cagirmaContext sinif_fonksiyon_cagirma() {
			return getRuleContext(Sinif_fonksiyon_cagirmaContext.class,0);
		}
		public Sinif_fonksiyon_degerContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterSinif_fonksiyon_deger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitSinif_fonksiyon_deger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitSinif_fonksiyon_deger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dogru_yanlisContext extends IfadelerContext {
		public MantikContext mantik() {
			return getRuleContext(MantikContext.class,0);
		}
		public Dogru_yanlisContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterDogru_yanlis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitDogru_yanlis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitDogru_yanlis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Array_degerContext extends IfadelerContext {
		public Array_listesiContext array_listesi() {
			return getRuleContext(Array_listesiContext.class,0);
		}
		public Array_degerContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterArray_deger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitArray_deger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitArray_deger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Karekok_islemiContext extends IfadelerContext {
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Karekok_islemiContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterKarekok_islemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitKarekok_islemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitKarekok_islemi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Euler_sayisiContext extends IfadelerContext {
		public Euler_sayisiContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterEuler_sayisi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitEuler_sayisi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitEuler_sayisi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Degisken_grubu_elemanContext extends IfadelerContext {
		public Degisken_grubu_elemaniContext degisken_grubu_elemani() {
			return getRuleContext(Degisken_grubu_elemaniContext.class,0);
		}
		public Degisken_grubu_elemanContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterDegisken_grubu_eleman(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitDegisken_grubu_eleman(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitDegisken_grubu_eleman(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cosinus_fonksiyonuContext extends IfadelerContext {
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Cosinus_fonksiyonuContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterCosinus_fonksiyonu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitCosinus_fonksiyonu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitCosinus_fonksiyonu(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Kolay_artisContext extends IfadelerContext {
		public Basit_artisContext basit_artis() {
			return getRuleContext(Basit_artisContext.class,0);
		}
		public Kolay_artisContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterKolay_artis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitKolay_artis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitKolay_artis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Parantezli_ifadeContext extends IfadelerContext {
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Parantezli_ifadeContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterParantezli_ifade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitParantezli_ifade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitParantezli_ifade(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tur_fonksiyonContext extends IfadelerContext {
		public Tur_fonksiyonuContext tur_fonksiyonu() {
			return getRuleContext(Tur_fonksiyonuContext.class,0);
		}
		public Tur_fonksiyonContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterTur_fonksiyon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitTur_fonksiyon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitTur_fonksiyon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Mod_islemiContext extends IfadelerContext {
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public Mod_islemiContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterMod_islemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitMod_islemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitMod_islemi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Uslu_ifadeContext extends IfadelerContext {
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public Uslu_ifadeContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterUslu_ifade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitUslu_ifade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitUslu_ifade(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Carpma_bolmeContext extends IfadelerContext {
		public Token opt;
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public Carpma_bolmeContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterCarpma_bolme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitCarpma_bolme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitCarpma_bolme(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Read_komutuContext extends IfadelerContext {
		public Oku_komutuContext oku_komutu() {
			return getRuleContext(Oku_komutuContext.class,0);
		}
		public Read_komutuContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterRead_komutu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitRead_komutu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitRead_komutu(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Array_degiskeContext extends IfadelerContext {
		public Array_degiskeniContext array_degiskeni() {
			return getRuleContext(Array_degiskeniContext.class,0);
		}
		public Array_degiskeContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterArray_degiske(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitArray_degiske(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitArray_degiske(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tanjant_fonksiyonuContext extends IfadelerContext {
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Tanjant_fonksiyonuContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterTanjant_fonksiyonu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitTanjant_fonksiyonu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitTanjant_fonksiyonu(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class String_degerContext extends IfadelerContext {
		public TerminalNode STRING() { return getToken(DilParser.STRING, 0); }
		public String_degerContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterString_deger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitString_deger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitString_deger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Yok_commandContext extends IfadelerContext {
		public Yok_ifadesiContext yok_ifadesi() {
			return getRuleContext(Yok_ifadesiContext.class,0);
		}
		public Yok_commandContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterYok_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitYok_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitYok_command(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Toplama_cikarmaContext extends IfadelerContext {
		public Token opt;
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public Toplama_cikarmaContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterToplama_cikarma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitToplama_cikarma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitToplama_cikarma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eksi_sayiContext extends IfadelerContext {
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Eksi_sayiContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterEksi_sayi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitEksi_sayi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitEksi_sayi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Sinus_fonksiyonuContext extends IfadelerContext {
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Sinus_fonksiyonuContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterSinus_fonksiyonu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitSinus_fonksiyonu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitSinus_fonksiyonu(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Fonk_cagriContext extends IfadelerContext {
		public Fonksiyon_cagirilmasiContext fonksiyon_cagirilmasi() {
			return getRuleContext(Fonksiyon_cagirilmasiContext.class,0);
		}
		public Fonk_cagriContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterFonk_cagri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitFonk_cagri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitFonk_cagri(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Degisken_deger_alContext extends IfadelerContext {
		public Degisken_ismiContext degisken_ismi() {
			return getRuleContext(Degisken_ismiContext.class,0);
		}
		public Degisken_deger_alContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterDegisken_deger_al(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitDegisken_deger_al(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitDegisken_deger_al(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tur_degistirContext extends IfadelerContext {
		public Degisken_turuContext degisken_turu() {
			return getRuleContext(Degisken_turuContext.class,0);
		}
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Tur_degistirContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterTur_degistir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitTur_degistir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitTur_degistir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pi_sayisiContext extends IfadelerContext {
		public Pi_sayisiContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterPi_sayisi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitPi_sayisi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitPi_sayisi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ln_fonksiyonuContext extends IfadelerContext {
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Ln_fonksiyonuContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterLn_fonksiyonu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitLn_fonksiyonu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitLn_fonksiyonu(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Log_fonksiyonuContext extends IfadelerContext {
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public Log_fonksiyonuContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterLog_fonksiyonu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitLog_fonksiyonu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitLog_fonksiyonu(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Yeni_sinifContext extends IfadelerContext {
		public Yeni_sinif_objesiContext yeni_sinif_objesi() {
			return getRuleContext(Yeni_sinif_objesiContext.class,0);
		}
		public Yeni_sinifContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterYeni_sinif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitYeni_sinif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitYeni_sinif(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cotanjant_fonksiyonuContext extends IfadelerContext {
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Cotanjant_fonksiyonuContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterCotanjant_fonksiyonu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitCotanjant_fonksiyonu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitCotanjant_fonksiyonu(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Sabit_rakam_degerContext extends IfadelerContext {
		public Sabit_rakam_degeriContext sabit_rakam_degeri() {
			return getRuleContext(Sabit_rakam_degeriContext.class,0);
		}
		public Sabit_rakam_degerContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterSabit_rakam_deger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitSabit_rakam_deger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitSabit_rakam_deger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Len_fonksiyonuContext extends IfadelerContext {
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Len_fonksiyonuContext(IfadelerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterLen_fonksiyonu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitLen_fonksiyonu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitLen_fonksiyonu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfadelerContext ifadeler() throws RecognitionException {
		return ifadeler(0);
	}

	private IfadelerContext ifadeler(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IfadelerContext _localctx = new IfadelerContext(_ctx, _parentState);
		IfadelerContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_ifadeler, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				_localctx = new Tur_degistirContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(548);
				match(T__2);
				setState(549);
				degisken_turu();
				setState(550);
				match(T__3);
				setState(551);
				ifadeler(31);
				}
				break;
			case 2:
				{
				_localctx = new Parantezli_ifadeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(553);
				match(T__2);
				setState(554);
				ifadeler(0);
				setState(555);
				match(T__3);
				}
				break;
			case 3:
				{
				_localctx = new Eksi_sayiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(557);
				match(T__55);
				setState(558);
				ifadeler(29);
				}
				break;
			case 4:
				{
				_localctx = new Karekok_islemiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(559);
				match(T__56);
				setState(560);
				match(T__2);
				setState(561);
				ifadeler(0);
				setState(562);
				match(T__3);
				}
				break;
			case 5:
				{
				_localctx = new Sinus_fonksiyonuContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(564);
				match(T__57);
				setState(565);
				match(T__2);
				setState(566);
				ifadeler(0);
				setState(567);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new Cosinus_fonksiyonuContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(569);
				match(T__58);
				setState(570);
				match(T__2);
				setState(571);
				ifadeler(0);
				setState(572);
				match(T__3);
				}
				break;
			case 7:
				{
				_localctx = new Tanjant_fonksiyonuContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(574);
				match(T__59);
				setState(575);
				match(T__2);
				setState(576);
				ifadeler(0);
				setState(577);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new Cotanjant_fonksiyonuContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(579);
				match(T__60);
				setState(580);
				match(T__2);
				setState(581);
				ifadeler(0);
				setState(582);
				match(T__3);
				}
				break;
			case 9:
				{
				_localctx = new Ln_fonksiyonuContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(584);
				match(T__61);
				setState(585);
				match(T__2);
				setState(586);
				ifadeler(0);
				setState(587);
				match(T__3);
				}
				break;
			case 10:
				{
				_localctx = new Euler_sayisiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(589);
				match(T__62);
				setState(590);
				match(T__31);
				setState(591);
				match(T__63);
				}
				break;
			case 11:
				{
				_localctx = new Pi_sayisiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(592);
				match(T__62);
				setState(593);
				match(T__31);
				setState(594);
				match(T__64);
				}
				break;
			case 12:
				{
				_localctx = new Log_fonksiyonuContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(595);
				match(T__65);
				setState(596);
				ifadeler(0);
				setState(597);
				match(T__66);
				setState(598);
				ifadeler(0);
				}
				break;
			case 13:
				{
				_localctx = new Dogru_yanlisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(600);
				mantik();
				}
				break;
			case 14:
				{
				_localctx = new Degisken_deger_alContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(601);
				degisken_ismi();
				}
				break;
			case 15:
				{
				_localctx = new Array_degiskeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(602);
				array_degiskeni();
				}
				break;
			case 16:
				{
				_localctx = new Sabit_rakam_degerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(603);
				sabit_rakam_degeri();
				}
				break;
			case 17:
				{
				_localctx = new String_degerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(604);
				match(STRING);
				}
				break;
			case 18:
				{
				_localctx = new Array_degerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(605);
				array_listesi();
				}
				break;
			case 19:
				{
				_localctx = new Fonk_cagriContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(606);
				fonksiyon_cagirilmasi();
				}
				break;
			case 20:
				{
				_localctx = new Degisken_grubu_elemanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(607);
				degisken_grubu_elemani(0);
				}
				break;
			case 21:
				{
				_localctx = new Len_fonksiyonuContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(608);
				match(T__71);
				setState(609);
				match(T__2);
				setState(610);
				ifadeler(0);
				setState(611);
				match(T__3);
				}
				break;
			case 22:
				{
				_localctx = new Tur_fonksiyonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(613);
				tur_fonksiyonu();
				}
				break;
			case 23:
				{
				_localctx = new Kolay_artisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(614);
				basit_artis();
				}
				break;
			case 24:
				{
				_localctx = new Yeni_sinifContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(615);
				yeni_sinif_objesi();
				}
				break;
			case 25:
				{
				_localctx = new Read_komutuContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(616);
				oku_komutu();
				}
				break;
			case 26:
				{
				_localctx = new Yok_commandContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(617);
				yok_ifadesi();
				}
				break;
			case 27:
				{
				_localctx = new Sinif_fonksiyon_degerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(618);
				sinif_fonksiyon_cagirma();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(633);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new Mod_islemiContext(new IfadelerContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ifadeler);
						setState(621);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(622);
						match(T__67);
						setState(623);
						ifadeler(20);
						}
						break;
					case 2:
						{
						_localctx = new Uslu_ifadeContext(new IfadelerContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ifadeler);
						setState(624);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(625);
						match(T__66);
						setState(626);
						ifadeler(19);
						}
						break;
					case 3:
						{
						_localctx = new Carpma_bolmeContext(new IfadelerContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ifadeler);
						setState(627);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(628);
						((Carpma_bolmeContext)_localctx).opt = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__68 || _la==T__69) ) {
							((Carpma_bolmeContext)_localctx).opt = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(629);
						ifadeler(18);
						}
						break;
					case 4:
						{
						_localctx = new Toplama_cikarmaContext(new IfadelerContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ifadeler);
						setState(630);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(631);
						((Toplama_cikarmaContext)_localctx).opt = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__55 || _la==T__70) ) {
							((Toplama_cikarmaContext)_localctx).opt = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(632);
						ifadeler(17);
						}
						break;
					}
					} 
				}
				setState(637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class Basit_artisContext extends ParserRuleContext {
		public Basit_artisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basit_artis; }
	 
		public Basit_artisContext() { }
		public void copyFrom(Basit_artisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Basit_bir_artirmaContext extends Basit_artisContext {
		public Sol_taraf_degiskenleriContext sol_taraf_degiskenleri() {
			return getRuleContext(Sol_taraf_degiskenleriContext.class,0);
		}
		public Basit_bir_artirmaContext(Basit_artisContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterBasit_bir_artirma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitBasit_bir_artirma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitBasit_bir_artirma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basit_artisContext basit_artis() throws RecognitionException {
		Basit_artisContext _localctx = new Basit_artisContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_basit_artis);
		try {
			_localctx = new Basit_bir_artirmaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			sol_taraf_degiskenleri();
			setState(639);
			match(T__72);
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

	public static class Try_yapisiContext extends ParserRuleContext {
		public Try_yapisiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_yapisi; }
	 
		public Try_yapisiContext() { }
		public void copyFrom(Try_yapisiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Try_catch_yapisiContext extends Try_yapisiContext {
		public List<BildirimlerContext> bildirimler() {
			return getRuleContexts(BildirimlerContext.class);
		}
		public BildirimlerContext bildirimler(int i) {
			return getRuleContext(BildirimlerContext.class,i);
		}
		public List<Catch_yapisiContext> catch_yapisi() {
			return getRuleContexts(Catch_yapisiContext.class);
		}
		public Catch_yapisiContext catch_yapisi(int i) {
			return getRuleContext(Catch_yapisiContext.class,i);
		}
		public Try_catch_yapisiContext(Try_yapisiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterTry_catch_yapisi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitTry_catch_yapisi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitTry_catch_yapisi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_yapisiContext try_yapisi() throws RecognitionException {
		Try_yapisiContext _localctx = new Try_yapisiContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_try_yapisi);
		int _la;
		try {
			int _alt;
			_localctx = new Try_catch_yapisiContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(T__73);
			setState(642);
			match(T__74);
			setState(643);
			match(T__24);
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__71 - 66)) | (1L << (T__73 - 66)) | (1L << (T__76 - 66)) | (1L << (T__79 - 66)) | (1L << (T__85 - 66)) | (1L << (STRING - 66)) | (1L << (COMMENT - 66)) | (1L << (RAKAM - 66)) | (1L << (DEGISKEN_ISMI - 66)))) != 0)) {
				{
				{
				setState(644);
				bildirimler();
				}
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650);
			match(T__25);
			setState(652); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(651);
					catch_yapisi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(654); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Hata_gonderContext extends ParserRuleContext {
		public Hata_gonderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hata_gonder; }
	 
		public Hata_gonderContext() { }
		public void copyFrom(Hata_gonderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Hata_atContext extends Hata_gonderContext {
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Hata_atContext(Hata_gonderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterHata_at(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitHata_at(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitHata_at(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hata_gonderContext hata_gonder() throws RecognitionException {
		Hata_gonderContext _localctx = new Hata_gonderContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_hata_gonder);
		try {
			_localctx = new Hata_atContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(T__73);
			setState(657);
			match(T__75);
			setState(658);
			ifadeler(0);
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

	public static class Catch_yapisiContext extends ParserRuleContext {
		public Degisken_tanimiContext degisken_tanimi() {
			return getRuleContext(Degisken_tanimiContext.class,0);
		}
		public List<BildirimlerContext> bildirimler() {
			return getRuleContexts(BildirimlerContext.class);
		}
		public BildirimlerContext bildirimler(int i) {
			return getRuleContext(BildirimlerContext.class,i);
		}
		public Catch_yapisiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_yapisi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterCatch_yapisi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitCatch_yapisi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitCatch_yapisi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_yapisiContext catch_yapisi() throws RecognitionException {
		Catch_yapisiContext _localctx = new Catch_yapisiContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_catch_yapisi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(T__73);
			setState(661);
			degisken_tanimi();
			setState(662);
			match(T__24);
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__71 - 66)) | (1L << (T__73 - 66)) | (1L << (T__76 - 66)) | (1L << (T__79 - 66)) | (1L << (T__85 - 66)) | (1L << (STRING - 66)) | (1L << (COMMENT - 66)) | (1L << (RAKAM - 66)) | (1L << (DEGISKEN_ISMI - 66)))) != 0)) {
				{
				{
				setState(663);
				bildirimler();
				}
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(669);
			match(T__25);
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

	public static class Case_yapisiContext extends ParserRuleContext {
		public Case_yapisiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_yapisi; }
	 
		public Case_yapisiContext() { }
		public void copyFrom(Case_yapisiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Case_komutuContext extends Case_yapisiContext {
		public SecilenContext secilen() {
			return getRuleContext(SecilenContext.class,0);
		}
		public Hic_yoksaContext hic_yoksa() {
			return getRuleContext(Hic_yoksaContext.class,0);
		}
		public List<SeceneklerContext> secenekler() {
			return getRuleContexts(SeceneklerContext.class);
		}
		public SeceneklerContext secenekler(int i) {
			return getRuleContext(SeceneklerContext.class,i);
		}
		public Case_komutuContext(Case_yapisiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterCase_komutu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitCase_komutu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitCase_komutu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_yapisiContext case_yapisi() throws RecognitionException {
		Case_yapisiContext _localctx = new Case_yapisiContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_case_yapisi);
		int _la;
		try {
			_localctx = new Case_komutuContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(T__76);
			setState(672);
			match(T__2);
			setState(673);
			secilen();
			setState(674);
			match(T__3);
			setState(675);
			match(T__24);
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__18) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__71 - 66)) | (1L << (STRING - 66)) | (1L << (RAKAM - 66)) | (1L << (DEGISKEN_ISMI - 66)))) != 0)) {
				{
				{
				setState(676);
				secenekler();
				}
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
			switch (_input.LA(1)) {
			case T__25:
				{
				}
				break;
			case T__77:
				{
				setState(683);
				hic_yoksa();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(686);
			match(T__25);
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

	public static class SecilenContext extends ParserRuleContext {
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public SecilenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secilen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterSecilen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitSecilen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitSecilen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecilenContext secilen() throws RecognitionException {
		SecilenContext _localctx = new SecilenContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_secilen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			ifadeler(0);
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

	public static class Hic_yoksaContext extends ParserRuleContext {
		public List<BildirimlerContext> bildirimler() {
			return getRuleContexts(BildirimlerContext.class);
		}
		public BildirimlerContext bildirimler(int i) {
			return getRuleContext(BildirimlerContext.class,i);
		}
		public Hic_yoksaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hic_yoksa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterHic_yoksa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitHic_yoksa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitHic_yoksa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hic_yoksaContext hic_yoksa() throws RecognitionException {
		Hic_yoksaContext _localctx = new Hic_yoksaContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_hic_yoksa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(T__77);
			setState(691);
			match(T__34);
			setState(692);
			match(T__78);
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__71 - 66)) | (1L << (T__73 - 66)) | (1L << (T__76 - 66)) | (1L << (T__79 - 66)) | (1L << (T__85 - 66)) | (1L << (STRING - 66)) | (1L << (COMMENT - 66)) | (1L << (RAKAM - 66)) | (1L << (DEGISKEN_ISMI - 66)))) != 0)) {
				{
				{
				setState(693);
				bildirimler();
				}
				}
				setState(698);
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

	public static class SeceneklerContext extends ParserRuleContext {
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public List<BildirimlerContext> bildirimler() {
			return getRuleContexts(BildirimlerContext.class);
		}
		public BildirimlerContext bildirimler(int i) {
			return getRuleContext(BildirimlerContext.class,i);
		}
		public SeceneklerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secenekler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterSecenekler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitSecenekler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitSecenekler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeceneklerContext secenekler() throws RecognitionException {
		SeceneklerContext _localctx = new SeceneklerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_secenekler);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			ifadeler(0);
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(700);
				match(T__35);
				setState(701);
				ifadeler(0);
				}
				}
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(707);
			match(T__32);
			setState(708);
			match(T__78);
			setState(710); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(709);
					bildirimler();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(712); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class For_dongu_degisimContext extends ParserRuleContext {
		public Deger_atamaContext deger_atama() {
			return getRuleContext(Deger_atamaContext.class,0);
		}
		public Basit_artisContext basit_artis() {
			return getRuleContext(Basit_artisContext.class,0);
		}
		public For_dongu_degisimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_dongu_degisim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterFor_dongu_degisim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitFor_dongu_degisim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitFor_dongu_degisim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_dongu_degisimContext for_dongu_degisim() throws RecognitionException {
		For_dongu_degisimContext _localctx = new For_dongu_degisimContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_for_dongu_degisim);
		try {
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				deger_atama();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				basit_artis();
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

	public static class For_dongusuContext extends ParserRuleContext {
		public For_dongusuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_dongusu; }
	 
		public For_dongusuContext() { }
		public void copyFrom(For_dongusuContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class For_donguContext extends For_dongusuContext {
		public Degisken_ismiContext degisken_ismi() {
			return getRuleContext(Degisken_ismiContext.class,0);
		}
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Mantik_ifadeleriContext mantik_ifadeleri() {
			return getRuleContext(Mantik_ifadeleriContext.class,0);
		}
		public For_dongu_degisimContext for_dongu_degisim() {
			return getRuleContext(For_dongu_degisimContext.class,0);
		}
		public List<BildirimlerContext> bildirimler() {
			return getRuleContexts(BildirimlerContext.class);
		}
		public BildirimlerContext bildirimler(int i) {
			return getRuleContext(BildirimlerContext.class,i);
		}
		public For_donguContext(For_dongusuContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterFor_dongu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitFor_dongu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitFor_dongu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_dongusuContext for_dongusu() throws RecognitionException {
		For_dongusuContext _localctx = new For_dongusuContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_for_dongusu);
		int _la;
		try {
			_localctx = new For_donguContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(T__79);
			setState(719);
			degisken_ismi();
			setState(720);
			match(T__14);
			setState(721);
			ifadeler(0);
			setState(722);
			match(T__5);
			setState(723);
			mantik_ifadeleri(0);
			setState(724);
			match(T__28);
			setState(725);
			match(T__80);
			setState(726);
			match(T__81);
			setState(730);
			switch (_input.LA(1)) {
			case T__24:
				{
				}
				break;
			case T__5:
				{
				setState(728);
				match(T__5);
				setState(729);
				for_dongu_degisim();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(732);
			match(T__24);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__71 - 66)) | (1L << (T__73 - 66)) | (1L << (T__76 - 66)) | (1L << (T__79 - 66)) | (1L << (T__85 - 66)) | (1L << (STRING - 66)) | (1L << (COMMENT - 66)) | (1L << (RAKAM - 66)) | (1L << (DEGISKEN_ISMI - 66)))) != 0)) {
				{
				{
				setState(733);
				bildirimler();
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(739);
			match(T__25);
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

	public static class Dongu_artisContext extends ParserRuleContext {
		public Degisken_ismiContext degisken_ismi() {
			return getRuleContext(Degisken_ismiContext.class,0);
		}
		public IfadelerContext ifadeler() {
			return getRuleContext(IfadelerContext.class,0);
		}
		public Dongu_artisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dongu_artis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterDongu_artis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitDongu_artis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitDongu_artis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dongu_artisContext dongu_artis() throws RecognitionException {
		Dongu_artisContext _localctx = new Dongu_artisContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_dongu_artis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(T__82);
			setState(742);
			degisken_ismi();
			setState(743);
			match(T__14);
			setState(744);
			ifadeler(0);
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

	public static class Parantez2Context extends ParserRuleContext {
		public Parantez2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parantez2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterParantez2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitParantez2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitParantez2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parantez2Context parantez2() throws RecognitionException {
		Parantez2Context _localctx = new Parantez2Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_parantez2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__83) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Parantez1Context extends ParserRuleContext {
		public Parantez1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parantez1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterParantez1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitParantez1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitParantez1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parantez1Context parantez1() throws RecognitionException {
		Parantez1Context _localctx = new Parantez1Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_parantez1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__84) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Ikinci_loop_yapisiContext extends ParserRuleContext {
		public Ikinci_loop_yapisiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ikinci_loop_yapisi; }
	 
		public Ikinci_loop_yapisiContext() { }
		public void copyFrom(Ikinci_loop_yapisiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Do_while_loopContext extends Ikinci_loop_yapisiContext {
		public Mantik_ifadeleriContext mantik_ifadeleri() {
			return getRuleContext(Mantik_ifadeleriContext.class,0);
		}
		public List<BildirimlerContext> bildirimler() {
			return getRuleContexts(BildirimlerContext.class);
		}
		public BildirimlerContext bildirimler(int i) {
			return getRuleContext(BildirimlerContext.class,i);
		}
		public Do_while_loopContext(Ikinci_loop_yapisiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterDo_while_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitDo_while_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitDo_while_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ikinci_loop_yapisiContext ikinci_loop_yapisi() throws RecognitionException {
		Ikinci_loop_yapisiContext _localctx = new Ikinci_loop_yapisiContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_ikinci_loop_yapisi);
		int _la;
		try {
			_localctx = new Do_while_loopContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(T__85);
			setState(751);
			match(T__86);
			setState(752);
			match(T__24);
			setState(754); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(753);
				bildirimler();
				}
				}
				setState(756); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__71 - 66)) | (1L << (T__73 - 66)) | (1L << (T__76 - 66)) | (1L << (T__79 - 66)) | (1L << (T__85 - 66)) | (1L << (STRING - 66)) | (1L << (COMMENT - 66)) | (1L << (RAKAM - 66)) | (1L << (DEGISKEN_ISMI - 66)))) != 0) );
			setState(758);
			match(T__25);
			setState(759);
			mantik_ifadeleri(0);
			setState(760);
			match(T__28);
			setState(761);
			match(T__80);
			setState(762);
			match(T__81);
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

	public static class Loop_yapisiContext extends ParserRuleContext {
		public Loop_yapisiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_yapisi; }
	 
		public Loop_yapisiContext() { }
		public void copyFrom(Loop_yapisiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class While_loopContext extends Loop_yapisiContext {
		public Mantik_ifadeleriContext mantik_ifadeleri() {
			return getRuleContext(Mantik_ifadeleriContext.class,0);
		}
		public List<BildirimlerContext> bildirimler() {
			return getRuleContexts(BildirimlerContext.class);
		}
		public BildirimlerContext bildirimler(int i) {
			return getRuleContext(BildirimlerContext.class,i);
		}
		public While_loopContext(Loop_yapisiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_yapisiContext loop_yapisi() throws RecognitionException {
		Loop_yapisiContext _localctx = new Loop_yapisiContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_loop_yapisi);
		int _la;
		try {
			_localctx = new While_loopContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			mantik_ifadeleri(0);
			setState(765);
			match(T__28);
			setState(766);
			match(T__80);
			setState(767);
			match(T__81);
			setState(768);
			match(T__24);
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__71 - 66)) | (1L << (T__73 - 66)) | (1L << (T__76 - 66)) | (1L << (T__79 - 66)) | (1L << (T__85 - 66)) | (1L << (STRING - 66)) | (1L << (COMMENT - 66)) | (1L << (RAKAM - 66)) | (1L << (DEGISKEN_ISMI - 66)))) != 0)) {
				{
				{
				setState(769);
				bildirimler();
				}
				}
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(775);
			match(T__25);
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

	public static class Array_listesiContext extends ParserRuleContext {
		public Array_listesiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_listesi; }
	 
		public Array_listesiContext() { }
		public void copyFrom(Array_listesiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Array_list_hazirlandiContext extends Array_listesiContext {
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public Array_list_hazirlandiContext(Array_listesiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterArray_list_hazirlandi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitArray_list_hazirlandi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitArray_list_hazirlandi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_listesiContext array_listesi() throws RecognitionException {
		Array_listesiContext _localctx = new Array_listesiContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_array_listesi);
		int _la;
		try {
			_localctx = new Array_list_hazirlandiContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(T__6);
			setState(787);
			switch (_input.LA(1)) {
			case T__7:
				{
				}
				break;
			case T__1:
			case T__2:
			case T__6:
			case T__18:
			case T__21:
			case T__28:
			case T__29:
			case T__30:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__65:
			case T__71:
			case STRING:
			case RAKAM:
			case DEGISKEN_ISMI:
				{
				{
				setState(779);
				ifadeler(0);
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(780);
					match(T__5);
					setState(781);
					ifadeler(0);
					}
					}
					setState(786);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(789);
			match(T__7);
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

	public static class Array_degiskeniContext extends ParserRuleContext {
		public Array_degiskeniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_degiskeni; }
	 
		public Array_degiskeniContext() { }
		public void copyFrom(Array_degiskeniContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Array_deger_alContext extends Array_degiskeniContext {
		public Degisken_ismiContext degisken_ismi() {
			return getRuleContext(Degisken_ismiContext.class,0);
		}
		public List<IfadelerContext> ifadeler() {
			return getRuleContexts(IfadelerContext.class);
		}
		public IfadelerContext ifadeler(int i) {
			return getRuleContext(IfadelerContext.class,i);
		}
		public Array_deger_alContext(Array_degiskeniContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterArray_deger_al(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitArray_deger_al(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitArray_deger_al(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_degiskeniContext array_degiskeni() throws RecognitionException {
		Array_degiskeniContext _localctx = new Array_degiskeniContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_array_degiskeni);
		try {
			int _alt;
			_localctx = new Array_deger_alContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			degisken_ismi();
			setState(796); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(792);
					match(T__84);
					setState(793);
					ifadeler(0);
					setState(794);
					match(T__83);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(798); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Degisken_ismiContext extends ParserRuleContext {
		public Degisken_ismiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degisken_ismi; }
	 
		public Degisken_ismiContext() { }
		public void copyFrom(Degisken_ismiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Degisken_degerContext extends Degisken_ismiContext {
		public TerminalNode DEGISKEN_ISMI() { return getToken(DilParser.DEGISKEN_ISMI, 0); }
		public Degisken_degerContext(Degisken_ismiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterDegisken_deger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitDegisken_deger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitDegisken_deger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Degisken_ismiContext degisken_ismi() throws RecognitionException {
		Degisken_ismiContext _localctx = new Degisken_ismiContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_degisken_ismi);
		try {
			_localctx = new Degisken_degerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(DEGISKEN_ISMI);
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

	public static class Sabit_rakam_degeriContext extends ParserRuleContext {
		public TerminalNode RAKAM() { return getToken(DilParser.RAKAM, 0); }
		public Sabit_rakam_degeriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sabit_rakam_degeri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).enterSabit_rakam_degeri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DilListener ) ((DilListener)listener).exitSabit_rakam_degeri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DilVisitor ) return ((DilVisitor<? extends T>)visitor).visitSabit_rakam_degeri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sabit_rakam_degeriContext sabit_rakam_degeri() throws RecognitionException {
		Sabit_rakam_degeriContext _localctx = new Sabit_rakam_degeriContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_sabit_rakam_degeri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(RAKAM);
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
		case 29:
			return degisken_grub_eleman_sempred((Degisken_grub_elemanContext)_localctx, predIndex);
		case 31:
			return degisken_grubu_elemani_sempred((Degisken_grubu_elemaniContext)_localctx, predIndex);
		case 36:
			return mantik_ifadeleri_sempred((Mantik_ifadeleriContext)_localctx, predIndex);
		case 44:
			return ifadeler_sempred((IfadelerContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean degisken_grub_eleman_sempred(Degisken_grub_elemanContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean degisken_grubu_elemani_sempred(Degisken_grubu_elemaniContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mantik_ifadeleri_sempred(Mantik_ifadeleriContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean ifadeler_sempred(IfadelerContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 17);
		case 7:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3^\u0327\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\5\2\u0086\n\2\6\2\u0088\n\2\r\2\16"+
		"\2\u0089\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00a5\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b7\n\6\f\6\16\6"+
		"\u00ba\13\6\5\6\u00bc\n\6\3\6\3\6\3\6\7\6\u00c1\n\6\f\6\16\6\u00c4\13"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u00d7\n\n\f\n\16\n\u00da\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u00e6\n\13\f\13\16\13\u00e9\13\13\5\13\u00eb\n\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u0104\n\f\3\r\3\r\3\r\3\16\3\16\5\16\u010b\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\6\17\u0112\n\17\r\17\16\17\u0113\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u012f\n\25\f\25\16"+
		"\25\u0132\13\25\3\25\3\25\3\26\3\26\5\26\u0138\n\26\3\27\3\27\3\27\3\27"+
		"\7\27\u013e\n\27\f\27\16\27\u0141\13\27\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0148\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0152\n\32\3"+
		"\33\3\33\3\33\3\33\7\33\u0158\n\33\f\33\16\33\u015b\13\33\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u0162\n\34\3\35\3\35\5\35\u0166\n\35\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\5\37\u016e\n\37\3\37\3\37\3\37\7\37\u0173\n\37\f\37\16"+
		"\37\u0176\13\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\7!\u0184\n!\f!\16"+
		"!\u0187\13!\3\"\3\"\3\"\5\"\u018c\n\"\3#\3#\3#\3#\5#\u0192\n#\3#\3#\7"+
		"#\u0196\n#\f#\16#\u0199\13#\3#\3#\7#\u019d\n#\f#\16#\u01a0\13#\3#\3#\5"+
		"#\u01a4\n#\3$\3$\3$\3$\7$\u01aa\n$\f$\16$\u01ad\13$\3$\3$\3%\3%\3%\3%"+
		"\3%\5%\u01b6\n%\3%\3%\7%\u01ba\n%\f%\16%\u01bd\13%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\5&\u01c7\n&\3&\3&\3&\3&\3&\3&\7&\u01cf\n&\f&\16&\u01d2\13&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01f3\n\'\3(\3(\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\5)\u0203\n)\3*\3*\3*\3*\7*\u0209\n"+
		"*\f*\16*\u020c\13*\3+\3+\3,\3,\3,\7,\u0213\n,\f,\16,\u0216\13,\3,\3,\3"+
		",\3,\7,\u021c\n,\f,\16,\u021f\13,\3-\3-\3-\5-\u0224\n-\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u026e"+
		"\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u027c\n.\f.\16.\u027f\13.\3"+
		"/\3/\3/\3\60\3\60\3\60\3\60\7\60\u0288\n\60\f\60\16\60\u028b\13\60\3\60"+
		"\3\60\6\60\u028f\n\60\r\60\16\60\u0290\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\7\62\u029b\n\62\f\62\16\62\u029e\13\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\7\63\u02a8\n\63\f\63\16\63\u02ab\13\63\3\63\3\63\5"+
		"\63\u02af\n\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u02b9\n\65"+
		"\f\65\16\65\u02bc\13\65\3\66\3\66\3\66\7\66\u02c1\n\66\f\66\16\66\u02c4"+
		"\13\66\3\66\3\66\3\66\6\66\u02c9\n\66\r\66\16\66\u02ca\3\67\3\67\5\67"+
		"\u02cf\n\67\38\38\38\38\38\38\38\38\38\38\38\38\58\u02dd\n8\38\38\78\u02e1"+
		"\n8\f8\168\u02e4\138\38\38\39\39\39\39\39\3:\3:\3;\3;\3<\3<\3<\3<\6<\u02f5"+
		"\n<\r<\16<\u02f6\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\7=\u0305\n=\f=\16"+
		"=\u0308\13=\3=\3=\3>\3>\3>\3>\3>\7>\u0311\n>\f>\16>\u0314\13>\5>\u0316"+
		"\n>\3>\3>\3?\3?\3?\3?\3?\6?\u031f\n?\r?\16?\u0320\3@\3@\3A\3A\3A\2\6<"+
		"@JZB\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\2\n\3\2\26\27\3\2&\'\3\2(*\4\2"+
		"&\'++\3\2GH\4\2::II\4\2\6\6VV\4\2\5\5WW\u0378\2\u0087\3\2\2\2\4\u00a4"+
		"\3\2\2\2\6\u00a6\3\2\2\2\b\u00ab\3\2\2\2\n\u00af\3\2\2\2\f\u00c7\3\2\2"+
		"\2\16\u00ca\3\2\2\2\20\u00cd\3\2\2\2\22\u00d1\3\2\2\2\24\u00df\3\2\2\2"+
		"\26\u0103\3\2\2\2\30\u0105\3\2\2\2\32\u010a\3\2\2\2\34\u010c\3\2\2\2\36"+
		"\u0117\3\2\2\2 \u011a\3\2\2\2\"\u011d\3\2\2\2$\u0120\3\2\2\2&\u0122\3"+
		"\2\2\2(\u0127\3\2\2\2*\u0137\3\2\2\2,\u0139\3\2\2\2.\u0147\3\2\2\2\60"+
		"\u0149\3\2\2\2\62\u0151\3\2\2\2\64\u0153\3\2\2\2\66\u0161\3\2\2\28\u0165"+
		"\3\2\2\2:\u0167\3\2\2\2<\u016d\3\2\2\2>\u0177\3\2\2\2@\u017b\3\2\2\2B"+
		"\u018b\3\2\2\2D\u018d\3\2\2\2F\u01a5\3\2\2\2H\u01b0\3\2\2\2J\u01c6\3\2"+
		"\2\2L\u01f2\3\2\2\2N\u01f4\3\2\2\2P\u0202\3\2\2\2R\u0204\3\2\2\2T\u020d"+
		"\3\2\2\2V\u020f\3\2\2\2X\u0223\3\2\2\2Z\u026d\3\2\2\2\\\u0280\3\2\2\2"+
		"^\u0283\3\2\2\2`\u0292\3\2\2\2b\u0296\3\2\2\2d\u02a1\3\2\2\2f\u02b2\3"+
		"\2\2\2h\u02b4\3\2\2\2j\u02bd\3\2\2\2l\u02ce\3\2\2\2n\u02d0\3\2\2\2p\u02e7"+
		"\3\2\2\2r\u02ec\3\2\2\2t\u02ee\3\2\2\2v\u02f0\3\2\2\2x\u02fe\3\2\2\2z"+
		"\u030b\3\2\2\2|\u0319\3\2\2\2~\u0322\3\2\2\2\u0080\u0324\3\2\2\2\u0082"+
		"\u0085\5\4\3\2\u0083\u0086\7\3\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0084\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0082\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\3\3\2\2\2"+
		"\u008b\u00a5\5\34\17\2\u008c\u00a5\5R*\2\u008d\u00a5\5,\27\2\u008e\u00a5"+
		"\5\64\33\2\u008f\u00a5\5V,\2\u0090\u00a5\5T+\2\u0091\u00a5\5N(\2\u0092"+
		"\u00a5\5D#\2\u0093\u00a5\5x=\2\u0094\u00a5\5v<\2\u0095\u00a5\5d\63\2\u0096"+
		"\u00a5\5\60\31\2\u0097\u00a5\5(\25\2\u0098\u00a5\5\n\6\2\u0099\u00a5\5"+
		"\22\n\2\u009a\u00a5\5\24\13\2\u009b\u00a5\5\f\7\2\u009c\u00a5\5\16\b\2"+
		"\u009d\u00a5\5n8\2\u009e\u00a5\5\20\t\2\u009f\u00a5\5`\61\2\u00a0\u00a5"+
		"\5^\60\2\u00a1\u00a5\5> \2\u00a2\u00a5\5\30\r\2\u00a3\u00a5\7[\2\2\u00a4"+
		"\u008b\3\2\2\2\u00a4\u008c\3\2\2\2\u00a4\u008d\3\2\2\2\u00a4\u008e\3\2"+
		"\2\2\u00a4\u008f\3\2\2\2\u00a4\u0090\3\2\2\2\u00a4\u0091\3\2\2\2\u00a4"+
		"\u0092\3\2\2\2\u00a4\u0093\3\2\2\2\u00a4\u0094\3\2\2\2\u00a4\u0095\3\2"+
		"\2\2\u00a4\u0096\3\2\2\2\u00a4\u0097\3\2\2\2\u00a4\u0098\3\2\2\2\u00a4"+
		"\u0099\3\2\2\2\u00a4\u009a\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4\u009c\3\2"+
		"\2\2\u00a4\u009d\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4"+
		"\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a5\5\3\2\2\2\u00a6\u00a7\7\4\2\2\u00a7\u00a8\7\5\2\2\u00a8\u00a9"+
		"\5Z.\2\u00a9\u00aa\7\6\2\2\u00aa\7\3\2\2\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad"+
		"\7\6\2\2\u00ad\u00ae\5Z.\2\u00ae\t\3\2\2\2\u00af\u00b0\7\7\2\2\u00b0\u00b1"+
		"\5~@\2\u00b1\u00bb\7\5\2\2\u00b2\u00bc\3\2\2\2\u00b3\u00b8\5\32\16\2\u00b4"+
		"\u00b5\7\b\2\2\u00b5\u00b7\5\32\16\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3"+
		"\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\7\6\2\2\u00be\u00c2\7\t\2\2\u00bf\u00c1\5\26\f\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\n\2\2\u00c6"+
		"\13\3\2\2\2\u00c7\u00c8\7\13\2\2\u00c8\u00c9\5Z.\2\u00c9\r\3\2\2\2\u00ca"+
		"\u00cb\7\f\2\2\u00cb\u00cc\7\r\2\2\u00cc\17\3\2\2\2\u00cd\u00ce\7\16\2"+
		"\2\u00ce\u00cf\7\17\2\2\u00cf\u00d0\7\20\2\2\u00d0\21\3\2\2\2\u00d1\u00d2"+
		"\5~@\2\u00d2\u00d3\7\5\2\2\u00d3\u00d8\5~@\2\u00d4\u00d5\7\b\2\2\u00d5"+
		"\u00d7\5~@\2\u00d6\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2"+
		"\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc"+
		"\7\6\2\2\u00dc\u00dd\7\21\2\2\u00dd\u00de\5Z.\2\u00de\23\3\2\2\2\u00df"+
		"\u00e0\5~@\2\u00e0\u00ea\7\5\2\2\u00e1\u00eb\3\2\2\2\u00e2\u00e7\5Z.\2"+
		"\u00e3\u00e4\7\b\2\2\u00e4\u00e6\5Z.\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00e1\3\2\2\2\u00ea\u00e2\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ed\7\6\2\2\u00ed\25\3\2\2\2\u00ee\u0104\5R*\2\u00ef\u0104"+
		"\5,\27\2\u00f0\u0104\5\64\33\2\u00f1\u0104\5V,\2\u00f2\u0104\5T+\2\u00f3"+
		"\u0104\5N(\2\u00f4\u0104\5D#\2\u00f5\u0104\5x=\2\u00f6\u0104\5v<\2\u00f7"+
		"\u0104\5d\63\2\u00f8\u0104\5\60\31\2\u00f9\u0104\5\24\13\2\u00fa\u0104"+
		"\5\f\7\2\u00fb\u0104\5\16\b\2\u00fc\u0104\5n8\2\u00fd\u0104\5\20\t\2\u00fe"+
		"\u0104\5`\61\2\u00ff\u0104\5^\60\2\u0100\u0104\5&\24\2\u0101\u0104\5\30"+
		"\r\2\u0102\u0104\7[\2\2\u0103\u00ee\3\2\2\2\u0103\u00ef\3\2\2\2\u0103"+
		"\u00f0\3\2\2\2\u0103\u00f1\3\2\2\2\u0103\u00f2\3\2\2\2\u0103\u00f3\3\2"+
		"\2\2\u0103\u00f4\3\2\2\2\u0103\u00f5\3\2\2\2\u0103\u00f6\3\2\2\2\u0103"+
		"\u00f7\3\2\2\2\u0103\u00f8\3\2\2\2\u0103\u00f9\3\2\2\2\u0103\u00fa\3\2"+
		"\2\2\u0103\u00fb\3\2\2\2\u0103\u00fc\3\2\2\2\u0103\u00fd\3\2\2\2\u0103"+
		"\u00fe\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0103\u0102\3\2\2\2\u0104\27\3\2\2\2\u0105\u0106\7\22\2\2\u0106\u0107"+
		"\7\23\2\2\u0107\31\3\2\2\2\u0108\u010b\5\64\33\2\u0109\u010b\5,\27\2\u010a"+
		"\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\33\3\2\2\2\u010c\u010d\7\24\2"+
		"\2\u010d\u010e\5~@\2\u010e\u0111\7\t\2\2\u010f\u0112\5\"\22\2\u0110\u0112"+
		"\5 \21\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7\n"+
		"\2\2\u0116\35\3\2\2\2\u0117\u0118\7\25\2\2\u0118\u0119\5\24\13\2\u0119"+
		"\37\3\2\2\2\u011a\u011b\5$\23\2\u011b\u011c\5*\26\2\u011c!\3\2\2\2\u011d"+
		"\u011e\5$\23\2\u011e\u011f\5\n\6\2\u011f#\3\2\2\2\u0120\u0121\t\2\2\2"+
		"\u0121%\3\2\2\2\u0122\u0123\7\30\2\2\u0123\u0124\7\5\2\2\u0124\u0125\5"+
		"Z.\2\u0125\u0126\7\6\2\2\u0126\'\3\2\2\2\u0127\u0128\7\31\2\2\u0128\u0129"+
		"\7\32\2\2\u0129\u012a\5~@\2\u012a\u012b\7\33\2\2\u012b\u0130\5*\26\2\u012c"+
		"\u012d\7\b\2\2\u012d\u012f\5*\26\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0134\7\34\2\2\u0134)\3\2\2\2\u0135\u0138\5,\27\2"+
		"\u0136\u0138\5\64\33\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138+"+
		"\3\2\2\2\u0139\u013a\7\35\2\2\u013a\u013f\5.\30\2\u013b\u013c\7\b\2\2"+
		"\u013c\u013e\5.\30\2\u013d\u013b\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140-\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0148\5~@\2\u0143\u0144\5~@\2\u0144\u0145\7\36\2\2\u0145\u0146\5~@\2"+
		"\u0146\u0148\3\2\2\2\u0147\u0142\3\2\2\2\u0147\u0143\3\2\2\2\u0148/\3"+
		"\2\2\2\u0149\u014a\5\62\32\2\u014a\u014b\7\36\2\2\u014b\u014c\5\62\32"+
		"\2\u014c\61\3\2\2\2\u014d\u0152\5~@\2\u014e\u0152\5@!\2\u014f\u0152\5"+
		"|?\2\u0150\u0152\5:\36\2\u0151\u014d\3\2\2\2\u0151\u014e\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152\63\3\2\2\2\u0153\u0154\5P)\2"+
		"\u0154\u0159\5\66\34\2\u0155\u0156\7\b\2\2\u0156\u0158\5\66\34\2\u0157"+
		"\u0155\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\65\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u0162\5~@\2\u015d\u015e"+
		"\5~@\2\u015e\u015f\7\21\2\2\u015f\u0160\5Z.\2\u0160\u0162\3\2\2\2\u0161"+
		"\u015c\3\2\2\2\u0161\u015d\3\2\2\2\u0162\67\3\2\2\2\u0163\u0166\7\37\2"+
		"\2\u0164\u0166\7 \2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u01669\3"+
		"\2\2\2\u0167\u0168\7!\2\2\u0168;\3\2\2\2\u0169\u016a\b\37\1\2\u016a\u016e"+
		"\5~@\2\u016b\u016e\5|?\2\u016c\u016e\5\36\20\2\u016d\u0169\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016e\u0174\3\2\2\2\u016f\u0170\f\6"+
		"\2\2\u0170\u0171\7\"\2\2\u0171\u0173\5<\37\7\u0172\u016f\3\2\2\2\u0173"+
		"\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175=\3\2\2\2"+
		"\u0176\u0174\3\2\2\2\u0177\u0178\5B\"\2\u0178\u0179\7\"\2\2\u0179\u017a"+
		"\5\24\13\2\u017a?\3\2\2\2\u017b\u017c\b!\1\2\u017c\u017d\5B\"\2\u017d"+
		"\u017e\7\"\2\2\u017e\u017f\5B\"\2\u017f\u0185\3\2\2\2\u0180\u0181\f\4"+
		"\2\2\u0181\u0182\7\"\2\2\u0182\u0184\5B\"\2\u0183\u0180\3\2\2\2\u0184"+
		"\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186A\3\2\2\2"+
		"\u0187\u0185\3\2\2\2\u0188\u018c\5|?\2\u0189\u018c\5~@\2\u018a\u018c\5"+
		"\36\20\2\u018b\u0188\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018c"+
		"C\3\2\2\2\u018d\u0191\5J&\2\u018e\u018f\7\37\2\2\u018f\u0192\7#\2\2\u0190"+
		"\u0192\7$\2\2\u0191\u018e\3\2\2\2\u0191\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0197\7\33\2\2\u0194\u0196\5\4\3\2\u0195\u0194\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u019a\u019e\7\34\2\2\u019b\u019d\5H%\2\u019c"+
		"\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f\u01a3\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2"+
		"\u01a4\5F$\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4E\3\2\2\2\u01a5"+
		"\u01a6\7\37\2\2\u01a6\u01a7\7%\2\2\u01a7\u01ab\7\33\2\2\u01a8\u01aa\5"+
		"\4\3\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\7\34"+
		"\2\2\u01afG\3\2\2\2\u01b0\u01b1\t\3\2\2\u01b1\u01b5\5J&\2\u01b2\u01b3"+
		"\7\37\2\2\u01b3\u01b6\7#\2\2\u01b4\u01b6\7$\2\2\u01b5\u01b2\3\2\2\2\u01b5"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01bb\7\33\2\2\u01b8\u01ba\5"+
		"\4\3\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7\34"+
		"\2\2\u01bfI\3\2\2\2\u01c0\u01c1\b&\1\2\u01c1\u01c2\7\5\2\2\u01c2\u01c3"+
		"\5J&\2\u01c3\u01c4\7\6\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c7\5L\'\2\u01c6"+
		"\u01c0\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01d0\3\2\2\2\u01c8\u01c9\f\5"+
		"\2\2\u01c9\u01ca\t\4\2\2\u01ca\u01cf\5J&\6\u01cb\u01cc\f\4\2\2\u01cc\u01cd"+
		"\t\5\2\2\u01cd\u01cf\5J&\5\u01ce\u01c8\3\2\2\2\u01ce\u01cb\3\2\2\2\u01cf"+
		"\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1K\3\2\2\2"+
		"\u01d2\u01d0\3\2\2\2\u01d3\u01d4\7\5\2\2\u01d4\u01d5\5L\'\2\u01d5\u01d6"+
		"\7\6\2\2\u01d6\u01f3\3\2\2\2\u01d7\u01d8\7,\2\2\u01d8\u01f3\5L\'\2\u01d9"+
		"\u01da\5Z.\2\u01da\u01db\7\34\2\2\u01db\u01dc\5Z.\2\u01dc\u01f3\3\2\2"+
		"\2\u01dd\u01de\5Z.\2\u01de\u01df\7\33\2\2\u01df\u01e0\5Z.\2\u01e0\u01f3"+
		"\3\2\2\2\u01e1\u01e2\5Z.\2\u01e2\u01e3\7-\2\2\u01e3\u01e4\5Z.\2\u01e4"+
		"\u01f3\3\2\2\2\u01e5\u01e6\5Z.\2\u01e6\u01e7\7.\2\2\u01e7\u01e8\5Z.\2"+
		"\u01e8\u01f3\3\2\2\2\u01e9\u01ea\5Z.\2\u01ea\u01eb\7/\2\2\u01eb\u01ec"+
		"\5Z.\2\u01ec\u01f3\3\2\2\2\u01ed\u01ee\5Z.\2\u01ee\u01ef\7\60\2\2\u01ef"+
		"\u01f0\5Z.\2\u01f0\u01f3\3\2\2\2\u01f1\u01f3\5Z.\2\u01f2\u01d3\3\2\2\2"+
		"\u01f2\u01d7\3\2\2\2\u01f2\u01d9\3\2\2\2\u01f2\u01dd\3\2\2\2\u01f2\u01e1"+
		"\3\2\2\2\u01f2\u01e5\3\2\2\2\u01f2\u01e9\3\2\2\2\u01f2\u01ed\3\2\2\2\u01f2"+
		"\u01f1\3\2\2\2\u01f3M\3\2\2\2\u01f4\u01f5\5X-\2\u01f5\u01f6\7\"\2\2\u01f6"+
		"\u01f7\7\61\2\2\u01f7\u01f8\7\5\2\2\u01f8\u01f9\5Z.\2\u01f9\u01fa\7\6"+
		"\2\2\u01faO\3\2\2\2\u01fb\u0203\7\62\2\2\u01fc\u0203\7\63\2\2\u01fd\u0203"+
		"\7\64\2\2\u01fe\u0203\7\65\2\2\u01ff\u0203\7\66\2\2\u0200\u0203\7\67\2"+
		"\2\u0201\u0203\5~@\2\u0202\u01fb\3\2\2\2\u0202\u01fc\3\2\2\2\u0202\u01fd"+
		"\3\2\2\2\u0202\u01fe\3\2\2\2\u0202\u01ff\3\2\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0201\3\2\2\2\u0203Q\3\2\2\2\u0204\u0205\78\2\2\u0205\u020a\5Z.\2\u0206"+
		"\u0207\7\b\2\2\u0207\u0209\5Z.\2\u0208\u0206\3\2\2\2\u0209\u020c\3\2\2"+
		"\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020bS\3\2\2\2\u020c\u020a"+
		"\3\2\2\2\u020d\u020e\79\2\2\u020eU\3\2\2\2\u020f\u0214\5X-\2\u0210\u0211"+
		"\7\b\2\2\u0211\u0213\5X-\2\u0212\u0210\3\2\2\2\u0213\u0216\3\2\2\2\u0214"+
		"\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0214\3\2"+
		"\2\2\u0217\u0218\7\21\2\2\u0218\u021d\5Z.\2\u0219\u021a\7\b\2\2\u021a"+
		"\u021c\5Z.\2\u021b\u0219\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2"+
		"\2\u021d\u021e\3\2\2\2\u021eW\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0224"+
		"\5~@\2\u0221\u0224\5|?\2\u0222\u0224\5@!\2\u0223\u0220\3\2\2\2\u0223\u0221"+
		"\3\2\2\2\u0223\u0222\3\2\2\2\u0224Y\3\2\2\2\u0225\u0226\b.\1\2\u0226\u0227"+
		"\7\5\2\2\u0227\u0228\5P)\2\u0228\u0229\7\6\2\2\u0229\u022a\5Z.!\u022a"+
		"\u026e\3\2\2\2\u022b\u022c\7\5\2\2\u022c\u022d\5Z.\2\u022d\u022e\7\6\2"+
		"\2\u022e\u026e\3\2\2\2\u022f\u0230\7:\2\2\u0230\u026e\5Z.\37\u0231\u0232"+
		"\7;\2\2\u0232\u0233\7\5\2\2\u0233\u0234\5Z.\2\u0234\u0235\7\6\2\2\u0235"+
		"\u026e\3\2\2\2\u0236\u0237\7<\2\2\u0237\u0238\7\5\2\2\u0238\u0239\5Z."+
		"\2\u0239\u023a\7\6\2\2\u023a\u026e\3\2\2\2\u023b\u023c\7=\2\2\u023c\u023d"+
		"\7\5\2\2\u023d\u023e\5Z.\2\u023e\u023f\7\6\2\2\u023f\u026e\3\2\2\2\u0240"+
		"\u0241\7>\2\2\u0241\u0242\7\5\2\2\u0242\u0243\5Z.\2\u0243\u0244\7\6\2"+
		"\2\u0244\u026e\3\2\2\2\u0245\u0246\7?\2\2\u0246\u0247\7\5\2\2\u0247\u0248"+
		"\5Z.\2\u0248\u0249\7\6\2\2\u0249\u026e\3\2\2\2\u024a\u024b\7@\2\2\u024b"+
		"\u024c\7\5\2\2\u024c\u024d\5Z.\2\u024d\u024e\7\6\2\2\u024e\u026e\3\2\2"+
		"\2\u024f\u0250\7A\2\2\u0250\u0251\7\"\2\2\u0251\u026e\7B\2\2\u0252\u0253"+
		"\7A\2\2\u0253\u0254\7\"\2\2\u0254\u026e\7C\2\2\u0255\u0256\7D\2\2\u0256"+
		"\u0257\5Z.\2\u0257\u0258\7E\2\2\u0258\u0259\5Z.\2\u0259\u026e\3\2\2\2"+
		"\u025a\u026e\58\35\2\u025b\u026e\5~@\2\u025c\u026e\5|?\2\u025d\u026e\5"+
		"\u0080A\2\u025e\u026e\7Z\2\2\u025f\u026e\5z>\2\u0260\u026e\5\24\13\2\u0261"+
		"\u026e\5@!\2\u0262\u0263\7J\2\2\u0263\u0264\7\5\2\2\u0264\u0265\5Z.\2"+
		"\u0265\u0266\7\6\2\2\u0266\u026e\3\2\2\2\u0267\u026e\5\6\4\2\u0268\u026e"+
		"\5\\/\2\u0269\u026e\5\36\20\2\u026a\u026e\5&\24\2\u026b\u026e\5:\36\2"+
		"\u026c\u026e\5> \2\u026d\u0225\3\2\2\2\u026d\u022b\3\2\2\2\u026d\u022f"+
		"\3\2\2\2\u026d\u0231\3\2\2\2\u026d\u0236\3\2\2\2\u026d\u023b\3\2\2\2\u026d"+
		"\u0240\3\2\2\2\u026d\u0245\3\2\2\2\u026d\u024a\3\2\2\2\u026d\u024f\3\2"+
		"\2\2\u026d\u0252\3\2\2\2\u026d\u0255\3\2\2\2\u026d\u025a\3\2\2\2\u026d"+
		"\u025b\3\2\2\2\u026d\u025c\3\2\2\2\u026d\u025d\3\2\2\2\u026d\u025e\3\2"+
		"\2\2\u026d\u025f\3\2\2\2\u026d\u0260\3\2\2\2\u026d\u0261\3\2\2\2\u026d"+
		"\u0262\3\2\2\2\u026d\u0267\3\2\2\2\u026d\u0268\3\2\2\2\u026d\u0269\3\2"+
		"\2\2\u026d\u026a\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026c\3\2\2\2\u026e"+
		"\u027d\3\2\2\2\u026f\u0270\f\25\2\2\u0270\u0271\7F\2\2\u0271\u027c\5Z"+
		".\26\u0272\u0273\f\24\2\2\u0273\u0274\7E\2\2\u0274\u027c\5Z.\25\u0275"+
		"\u0276\f\23\2\2\u0276\u0277\t\6\2\2\u0277\u027c\5Z.\24\u0278\u0279\f\22"+
		"\2\2\u0279\u027a\t\7\2\2\u027a\u027c\5Z.\23\u027b\u026f\3\2\2\2\u027b"+
		"\u0272\3\2\2\2\u027b\u0275\3\2\2\2\u027b\u0278\3\2\2\2\u027c\u027f\3\2"+
		"\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e[\3\2\2\2\u027f\u027d"+
		"\3\2\2\2\u0280\u0281\5X-\2\u0281\u0282\7K\2\2\u0282]\3\2\2\2\u0283\u0284"+
		"\7L\2\2\u0284\u0285\7M\2\2\u0285\u0289\7\33\2\2\u0286\u0288\5\4\3\2\u0287"+
		"\u0286\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028a\u028c\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u028e\7\34\2\2\u028d"+
		"\u028f\5b\62\2\u028e\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u028e\3\2"+
		"\2\2\u0290\u0291\3\2\2\2\u0291_\3\2\2\2\u0292\u0293\7L\2\2\u0293\u0294"+
		"\7N\2\2\u0294\u0295\5Z.\2\u0295a\3\2\2\2\u0296\u0297\7L\2\2\u0297\u0298"+
		"\5\64\33\2\u0298\u029c\7\33\2\2\u0299\u029b\5\4\3\2\u029a\u0299\3\2\2"+
		"\2\u029b\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f"+
		"\3\2\2\2\u029e\u029c\3\2\2\2\u029f\u02a0\7\34\2\2\u02a0c\3\2\2\2\u02a1"+
		"\u02a2\7O\2\2\u02a2\u02a3\7\5\2\2\u02a3\u02a4\5f\64\2\u02a4\u02a5\7\6"+
		"\2\2\u02a5\u02a9\7\33\2\2\u02a6\u02a8\5j\66\2\u02a7\u02a6\3\2\2\2\u02a8"+
		"\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ae\3\2"+
		"\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02af\5h\65\2\u02ae"+
		"\u02ac\3\2\2\2\u02ae\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\7\34"+
		"\2\2\u02b1e\3\2\2\2\u02b2\u02b3\5Z.\2\u02b3g\3\2\2\2\u02b4\u02b5\7P\2"+
		"\2\u02b5\u02b6\7%\2\2\u02b6\u02ba\7Q\2\2\u02b7\u02b9\5\4\3\2\u02b8\u02b7"+
		"\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb"+
		"i\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02c2\5Z.\2\u02be\u02bf\7&\2\2\u02bf"+
		"\u02c1\5Z.\2\u02c0\u02be\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2"+
		"\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c6"+
		"\7#\2\2\u02c6\u02c8\7Q\2\2\u02c7\u02c9\5\4\3\2\u02c8\u02c7\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cbk\3\2\2\2"+
		"\u02cc\u02cf\5V,\2\u02cd\u02cf\5\\/\2\u02ce\u02cc\3\2\2\2\u02ce\u02cd"+
		"\3\2\2\2\u02cfm\3\2\2\2\u02d0\u02d1\7R\2\2\u02d1\u02d2\5~@\2\u02d2\u02d3"+
		"\7\21\2\2\u02d3\u02d4\5Z.\2\u02d4\u02d5\7\b\2\2\u02d5\u02d6\5J&\2\u02d6"+
		"\u02d7\7\37\2\2\u02d7\u02d8\7S\2\2\u02d8\u02dc\7T\2\2\u02d9\u02dd\3\2"+
		"\2\2\u02da\u02db\7\b\2\2\u02db\u02dd\5l\67\2\u02dc\u02d9\3\2\2\2\u02dc"+
		"\u02da\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e2\7\33\2\2\u02df\u02e1\5"+
		"\4\3\2\u02e0\u02df\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2"+
		"\u02e3\3\2\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e6\7\34"+
		"\2\2\u02e6o\3\2\2\2\u02e7\u02e8\7U\2\2\u02e8\u02e9\5~@\2\u02e9\u02ea\7"+
		"\21\2\2\u02ea\u02eb\5Z.\2\u02ebq\3\2\2\2\u02ec\u02ed\t\b\2\2\u02eds\3"+
		"\2\2\2\u02ee\u02ef\t\t\2\2\u02efu\3\2\2\2\u02f0\u02f1\7X\2\2\u02f1\u02f2"+
		"\7Y\2\2\u02f2\u02f4\7\33\2\2\u02f3\u02f5\5\4\3\2\u02f4\u02f3\3\2\2\2\u02f5"+
		"\u02f6\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3\2"+
		"\2\2\u02f8\u02f9\7\34\2\2\u02f9\u02fa\5J&\2\u02fa\u02fb\7\37\2\2\u02fb"+
		"\u02fc\7S\2\2\u02fc\u02fd\7T\2\2\u02fdw\3\2\2\2\u02fe\u02ff\5J&\2\u02ff"+
		"\u0300\7\37\2\2\u0300\u0301\7S\2\2\u0301\u0302\7T\2\2\u0302\u0306\7\33"+
		"\2\2\u0303\u0305\5\4\3\2\u0304\u0303\3\2\2\2\u0305\u0308\3\2\2\2\u0306"+
		"\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308\u0306\3\2"+
		"\2\2\u0309\u030a\7\34\2\2\u030ay\3\2\2\2\u030b\u0315\7\t\2\2\u030c\u0316"+
		"\3\2\2\2\u030d\u0312\5Z.\2\u030e\u030f\7\b\2\2\u030f\u0311\5Z.\2\u0310"+
		"\u030e\3\2\2\2\u0311\u0314\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2"+
		"\2\2\u0313\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0315\u030c\3\2\2\2\u0315"+
		"\u030d\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\7\n\2\2\u0318{\3\2\2\2"+
		"\u0319\u031e\5~@\2\u031a\u031b\7W\2\2\u031b\u031c\5Z.\2\u031c\u031d\7"+
		"V\2\2\u031d\u031f\3\2\2\2\u031e\u031a\3\2\2\2\u031f\u0320\3\2\2\2\u0320"+
		"\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321}\3\2\2\2\u0322\u0323\7]\2\2\u0323"+
		"\177\3\2\2\2\u0324\u0325\7\\\2\2\u0325\u0081\3\2\2\2>\u0085\u0089\u00a4"+
		"\u00b8\u00bb\u00c2\u00d8\u00e7\u00ea\u0103\u010a\u0111\u0113\u0130\u0137"+
		"\u013f\u0147\u0151\u0159\u0161\u0165\u016d\u0174\u0185\u018b\u0191\u0197"+
		"\u019e\u01a3\u01ab\u01b5\u01bb\u01c6\u01ce\u01d0\u01f2\u0202\u020a\u0214"+
		"\u021d\u0223\u026d\u027b\u027d\u0289\u0290\u029c\u02a9\u02ae\u02ba\u02c2"+
		"\u02ca\u02ce\u02dc\u02e2\u02f6\u0306\u0312\u0315\u0320";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}