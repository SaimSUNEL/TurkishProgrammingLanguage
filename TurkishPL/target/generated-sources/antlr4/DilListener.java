// Generated from Dil.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DilParser}.
 */
public interface DilListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DilParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DilParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DilParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#bildirimler}.
	 * @param ctx the parse tree
	 */
	void enterBildirimler(DilParser.BildirimlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#bildirimler}.
	 * @param ctx the parse tree
	 */
	void exitBildirimler(DilParser.BildirimlerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code turu_ne}
	 * labeled alternative in {@link DilParser#tur_fonksiyonu}.
	 * @param ctx the parse tree
	 */
	void enterTuru_ne(DilParser.Turu_neContext ctx);
	/**
	 * Exit a parse tree produced by the {@code turu_ne}
	 * labeled alternative in {@link DilParser#tur_fonksiyonu}.
	 * @param ctx the parse tree
	 */
	void exitTuru_ne(DilParser.Turu_neContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#tur_donusturme_islec}.
	 * @param ctx the parse tree
	 */
	void enterTur_donusturme_islec(DilParser.Tur_donusturme_islecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#tur_donusturme_islec}.
	 * @param ctx the parse tree
	 */
	void exitTur_donusturme_islec(DilParser.Tur_donusturme_islecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fonksiyon_tanimi_}
	 * labeled alternative in {@link DilParser#fonksiyon_tanimi}.
	 * @param ctx the parse tree
	 */
	void enterFonksiyon_tanimi_(DilParser.Fonksiyon_tanimi_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code fonksiyon_tanimi_}
	 * labeled alternative in {@link DilParser#fonksiyon_tanimi}.
	 * @param ctx the parse tree
	 */
	void exitFonksiyon_tanimi_(DilParser.Fonksiyon_tanimi_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code return_komutu}
	 * labeled alternative in {@link DilParser#return_deyimi}.
	 * @param ctx the parse tree
	 */
	void enterReturn_komutu(DilParser.Return_komutuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return_komutu}
	 * labeled alternative in {@link DilParser#return_deyimi}.
	 * @param ctx the parse tree
	 */
	void exitReturn_komutu(DilParser.Return_komutuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break_komutu}
	 * labeled alternative in {@link DilParser#donguden_cik}.
	 * @param ctx the parse tree
	 */
	void enterBreak_komutu(DilParser.Break_komutuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break_komutu}
	 * labeled alternative in {@link DilParser#donguden_cik}.
	 * @param ctx the parse tree
	 */
	void exitBreak_komutu(DilParser.Break_komutuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue_komut}
	 * labeled alternative in {@link DilParser#continue_komutu}.
	 * @param ctx the parse tree
	 */
	void enterContinue_komut(DilParser.Continue_komutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue_komut}
	 * labeled alternative in {@link DilParser#continue_komutu}.
	 * @param ctx the parse tree
	 */
	void exitContinue_komut(DilParser.Continue_komutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code matematik_fonksiyon_kaydi}
	 * labeled alternative in {@link DilParser#matematik_fonksiyon_tanimi}.
	 * @param ctx the parse tree
	 */
	void enterMatematik_fonksiyon_kaydi(DilParser.Matematik_fonksiyon_kaydiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matematik_fonksiyon_kaydi}
	 * labeled alternative in {@link DilParser#matematik_fonksiyon_tanimi}.
	 * @param ctx the parse tree
	 */
	void exitMatematik_fonksiyon_kaydi(DilParser.Matematik_fonksiyon_kaydiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fonksiyon_call}
	 * labeled alternative in {@link DilParser#fonksiyon_cagirilmasi}.
	 * @param ctx the parse tree
	 */
	void enterFonksiyon_call(DilParser.Fonksiyon_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fonksiyon_call}
	 * labeled alternative in {@link DilParser#fonksiyon_cagirilmasi}.
	 * @param ctx the parse tree
	 */
	void exitFonksiyon_call(DilParser.Fonksiyon_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#fonksiyon_bildirimleri}.
	 * @param ctx the parse tree
	 */
	void enterFonksiyon_bildirimleri(DilParser.Fonksiyon_bildirimleriContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#fonksiyon_bildirimleri}.
	 * @param ctx the parse tree
	 */
	void exitFonksiyon_bildirimleri(DilParser.Fonksiyon_bildirimleriContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getch_komutu}
	 * labeled alternative in {@link DilParser#tus_bekle}.
	 * @param ctx the parse tree
	 */
	void enterGetch_komutu(DilParser.Getch_komutuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getch_komutu}
	 * labeled alternative in {@link DilParser#tus_bekle}.
	 * @param ctx the parse tree
	 */
	void exitGetch_komutu(DilParser.Getch_komutuContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#fonksiyon_parametreleri}.
	 * @param ctx the parse tree
	 */
	void enterFonksiyon_parametreleri(DilParser.Fonksiyon_parametreleriContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#fonksiyon_parametreleri}.
	 * @param ctx the parse tree
	 */
	void exitFonksiyon_parametreleri(DilParser.Fonksiyon_parametreleriContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sinif_tanimlanmasi}
	 * labeled alternative in {@link DilParser#sinif_tanimi}.
	 * @param ctx the parse tree
	 */
	void enterSinif_tanimlanmasi(DilParser.Sinif_tanimlanmasiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sinif_tanimlanmasi}
	 * labeled alternative in {@link DilParser#sinif_tanimi}.
	 * @param ctx the parse tree
	 */
	void exitSinif_tanimlanmasi(DilParser.Sinif_tanimlanmasiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sinif_elema_olusturma}
	 * labeled alternative in {@link DilParser#yeni_sinif_objesi}.
	 * @param ctx the parse tree
	 */
	void enterSinif_elema_olusturma(DilParser.Sinif_elema_olusturmaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sinif_elema_olusturma}
	 * labeled alternative in {@link DilParser#yeni_sinif_objesi}.
	 * @param ctx the parse tree
	 */
	void exitSinif_elema_olusturma(DilParser.Sinif_elema_olusturmaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sinif_eleman_olusturma}
	 * labeled alternative in {@link DilParser#sinif_degisken_tanimi}.
	 * @param ctx the parse tree
	 */
	void enterSinif_eleman_olusturma(DilParser.Sinif_eleman_olusturmaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sinif_eleman_olusturma}
	 * labeled alternative in {@link DilParser#sinif_degisken_tanimi}.
	 * @param ctx the parse tree
	 */
	void exitSinif_eleman_olusturma(DilParser.Sinif_eleman_olusturmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#sinif_fonksiyon_tanimi}.
	 * @param ctx the parse tree
	 */
	void enterSinif_fonksiyon_tanimi(DilParser.Sinif_fonksiyon_tanimiContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#sinif_fonksiyon_tanimi}.
	 * @param ctx the parse tree
	 */
	void exitSinif_fonksiyon_tanimi(DilParser.Sinif_fonksiyon_tanimiContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#ulasim_anahtarlari}.
	 * @param ctx the parse tree
	 */
	void enterUlasim_anahtarlari(DilParser.Ulasim_anahtarlariContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#ulasim_anahtarlari}.
	 * @param ctx the parse tree
	 */
	void exitUlasim_anahtarlari(DilParser.Ulasim_anahtarlariContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oku_command}
	 * labeled alternative in {@link DilParser#oku_komutu}.
	 * @param ctx the parse tree
	 */
	void enterOku_command(DilParser.Oku_commandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oku_command}
	 * labeled alternative in {@link DilParser#oku_komutu}.
	 * @param ctx the parse tree
	 */
	void exitOku_command(DilParser.Oku_commandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code degisken_grubu_tanimi}
	 * labeled alternative in {@link DilParser#degisken_grubu}.
	 * @param ctx the parse tree
	 */
	void enterDegisken_grubu_tanimi(DilParser.Degisken_grubu_tanimiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code degisken_grubu_tanimi}
	 * labeled alternative in {@link DilParser#degisken_grubu}.
	 * @param ctx the parse tree
	 */
	void exitDegisken_grubu_tanimi(DilParser.Degisken_grubu_tanimiContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#grup_degiskeni}.
	 * @param ctx the parse tree
	 */
	void enterGrup_degiskeni(DilParser.Grup_degiskeniContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#grup_degiskeni}.
	 * @param ctx the parse tree
	 */
	void exitGrup_degiskeni(DilParser.Grup_degiskeniContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#referans_tanimi}.
	 * @param ctx the parse tree
	 */
	void enterReferans_tanimi(DilParser.Referans_tanimiContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#referans_tanimi}.
	 * @param ctx the parse tree
	 */
	void exitReferans_tanimi(DilParser.Referans_tanimiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sadece_referans_ismi}
	 * labeled alternative in {@link DilParser#referans_durum}.
	 * @param ctx the parse tree
	 */
	void enterSadece_referans_ismi(DilParser.Sadece_referans_ismiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sadece_referans_ismi}
	 * labeled alternative in {@link DilParser#referans_durum}.
	 * @param ctx the parse tree
	 */
	void exitSadece_referans_ismi(DilParser.Sadece_referans_ismiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atamali_referans_ismi}
	 * labeled alternative in {@link DilParser#referans_durum}.
	 * @param ctx the parse tree
	 */
	void enterAtamali_referans_ismi(DilParser.Atamali_referans_ismiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atamali_referans_ismi}
	 * labeled alternative in {@link DilParser#referans_durum}.
	 * @param ctx the parse tree
	 */
	void exitAtamali_referans_ismi(DilParser.Atamali_referans_ismiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code referans_atama}
	 * labeled alternative in {@link DilParser#referans_atama_yapisi}.
	 * @param ctx the parse tree
	 */
	void enterReferans_atama(DilParser.Referans_atamaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referans_atama}
	 * labeled alternative in {@link DilParser#referans_atama_yapisi}.
	 * @param ctx the parse tree
	 */
	void exitReferans_atama(DilParser.Referans_atamaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#referans_olabilenler}.
	 * @param ctx the parse tree
	 */
	void enterReferans_olabilenler(DilParser.Referans_olabilenlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#referans_olabilenler}.
	 * @param ctx the parse tree
	 */
	void exitReferans_olabilenler(DilParser.Referans_olabilenlerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code degisken_tanimla}
	 * labeled alternative in {@link DilParser#degisken_tanimi}.
	 * @param ctx the parse tree
	 */
	void enterDegisken_tanimla(DilParser.Degisken_tanimlaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code degisken_tanimla}
	 * labeled alternative in {@link DilParser#degisken_tanimi}.
	 * @param ctx the parse tree
	 */
	void exitDegisken_tanimla(DilParser.Degisken_tanimlaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sadece_isim}
	 * labeled alternative in {@link DilParser#degisken_durum}.
	 * @param ctx the parse tree
	 */
	void enterSadece_isim(DilParser.Sadece_isimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sadece_isim}
	 * labeled alternative in {@link DilParser#degisken_durum}.
	 * @param ctx the parse tree
	 */
	void exitSadece_isim(DilParser.Sadece_isimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ilk_degerli}
	 * labeled alternative in {@link DilParser#degisken_durum}.
	 * @param ctx the parse tree
	 */
	void enterIlk_degerli(DilParser.Ilk_degerliContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ilk_degerli}
	 * labeled alternative in {@link DilParser#degisken_durum}.
	 * @param ctx the parse tree
	 */
	void exitIlk_degerli(DilParser.Ilk_degerliContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dogru}
	 * labeled alternative in {@link DilParser#mantik}.
	 * @param ctx the parse tree
	 */
	void enterDogru(DilParser.DogruContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dogru}
	 * labeled alternative in {@link DilParser#mantik}.
	 * @param ctx the parse tree
	 */
	void exitDogru(DilParser.DogruContext ctx);
	/**
	 * Enter a parse tree produced by the {@code yanlis}
	 * labeled alternative in {@link DilParser#mantik}.
	 * @param ctx the parse tree
	 */
	void enterYanlis(DilParser.YanlisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code yanlis}
	 * labeled alternative in {@link DilParser#mantik}.
	 * @param ctx the parse tree
	 */
	void exitYanlis(DilParser.YanlisContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#yok_ifadesi}.
	 * @param ctx the parse tree
	 */
	void enterYok_ifadesi(DilParser.Yok_ifadesiContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#yok_ifadesi}.
	 * @param ctx the parse tree
	 */
	void exitYok_ifadesi(DilParser.Yok_ifadesiContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#degisken_grub_eleman}.
	 * @param ctx the parse tree
	 */
	void enterDegisken_grub_eleman(DilParser.Degisken_grub_elemanContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#degisken_grub_eleman}.
	 * @param ctx the parse tree
	 */
	void exitDegisken_grub_eleman(DilParser.Degisken_grub_elemanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sinif_fonksiyon_cagirmasi}
	 * labeled alternative in {@link DilParser#sinif_fonksiyon_cagirma}.
	 * @param ctx the parse tree
	 */
	void enterSinif_fonksiyon_cagirmasi(DilParser.Sinif_fonksiyon_cagirmasiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sinif_fonksiyon_cagirmasi}
	 * labeled alternative in {@link DilParser#sinif_fonksiyon_cagirma}.
	 * @param ctx the parse tree
	 */
	void exitSinif_fonksiyon_cagirmasi(DilParser.Sinif_fonksiyon_cagirmasiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code degisken_grubu_elemani_elemani}
	 * labeled alternative in {@link DilParser#degisken_grubu_elemani}.
	 * @param ctx the parse tree
	 */
	void enterDegisken_grubu_elemani_elemani(DilParser.Degisken_grubu_elemani_elemaniContext ctx);
	/**
	 * Exit a parse tree produced by the {@code degisken_grubu_elemani_elemani}
	 * labeled alternative in {@link DilParser#degisken_grubu_elemani}.
	 * @param ctx the parse tree
	 */
	void exitDegisken_grubu_elemani_elemani(DilParser.Degisken_grubu_elemani_elemaniContext ctx);
	/**
	 * Enter a parse tree produced by the {@code degisken_grub}
	 * labeled alternative in {@link DilParser#degisken_grubu_elemani}.
	 * @param ctx the parse tree
	 */
	void enterDegisken_grub(DilParser.Degisken_grubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code degisken_grub}
	 * labeled alternative in {@link DilParser#degisken_grubu_elemani}.
	 * @param ctx the parse tree
	 */
	void exitDegisken_grub(DilParser.Degisken_grubContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#structure_eleman}.
	 * @param ctx the parse tree
	 */
	void enterStructure_eleman(DilParser.Structure_elemanContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#structure_eleman}.
	 * @param ctx the parse tree
	 */
	void exitStructure_eleman(DilParser.Structure_elemanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sart_komutu}
	 * labeled alternative in {@link DilParser#sart_ifadesi}.
	 * @param ctx the parse tree
	 */
	void enterSart_komutu(DilParser.Sart_komutuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sart_komutu}
	 * labeled alternative in {@link DilParser#sart_ifadesi}.
	 * @param ctx the parse tree
	 */
	void exitSart_komutu(DilParser.Sart_komutuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dogru_degil}
	 * labeled alternative in {@link DilParser#dogru_degilse_yapisi}.
	 * @param ctx the parse tree
	 */
	void enterDogru_degil(DilParser.Dogru_degilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dogru_degil}
	 * labeled alternative in {@link DilParser#dogru_degilse_yapisi}.
	 * @param ctx the parse tree
	 */
	void exitDogru_degil(DilParser.Dogru_degilContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#veya_dogruysa_yapisi}.
	 * @param ctx the parse tree
	 */
	void enterVeya_dogruysa_yapisi(DilParser.Veya_dogruysa_yapisiContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#veya_dogruysa_yapisi}.
	 * @param ctx the parse tree
	 */
	void exitVeya_dogruysa_yapisi(DilParser.Veya_dogruysa_yapisiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normal_dogru_ifade}
	 * labeled alternative in {@link DilParser#mantik_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void enterNormal_dogru_ifade(DilParser.Normal_dogru_ifadeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normal_dogru_ifade}
	 * labeled alternative in {@link DilParser#mantik_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void exitNormal_dogru_ifade(DilParser.Normal_dogru_ifadeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parantezli_mantik}
	 * labeled alternative in {@link DilParser#mantik_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void enterParantezli_mantik(DilParser.Parantezli_mantikContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parantezli_mantik}
	 * labeled alternative in {@link DilParser#mantik_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void exitParantezli_mantik(DilParser.Parantezli_mantikContext ctx);
	/**
	 * Enter a parse tree produced by the {@code veya_islec}
	 * labeled alternative in {@link DilParser#mantik_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void enterVeya_islec(DilParser.Veya_islecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code veya_islec}
	 * labeled alternative in {@link DilParser#mantik_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void exitVeya_islec(DilParser.Veya_islecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ve_islec}
	 * labeled alternative in {@link DilParser#mantik_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void enterVe_islec(DilParser.Ve_islecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ve_islec}
	 * labeled alternative in {@link DilParser#mantik_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void exitVe_islec(DilParser.Ve_islecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parantezli_dogru}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void enterParantezli_dogru(DilParser.Parantezli_dogruContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parantezli_dogru}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void exitParantezli_dogru(DilParser.Parantezli_dogruContext ctx);
	/**
	 * Enter a parse tree produced by the {@code degili}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void enterDegili(DilParser.DegiliContext ctx);
	/**
	 * Exit a parse tree produced by the {@code degili}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void exitDegili(DilParser.DegiliContext ctx);
	/**
	 * Enter a parse tree produced by the {@code buyuk}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void enterBuyuk(DilParser.BuyukContext ctx);
	/**
	 * Exit a parse tree produced by the {@code buyuk}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void exitBuyuk(DilParser.BuyukContext ctx);
	/**
	 * Enter a parse tree produced by the {@code kucuk}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void enterKucuk(DilParser.KucukContext ctx);
	/**
	 * Exit a parse tree produced by the {@code kucuk}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void exitKucuk(DilParser.KucukContext ctx);
	/**
	 * Enter a parse tree produced by the {@code esit}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void enterEsit(DilParser.EsitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code esit}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void exitEsit(DilParser.EsitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code buyuk_esit}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void enterBuyuk_esit(DilParser.Buyuk_esitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code buyuk_esit}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void exitBuyuk_esit(DilParser.Buyuk_esitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code kucuk_esit}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void enterKucuk_esit(DilParser.Kucuk_esitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code kucuk_esit}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void exitKucuk_esit(DilParser.Kucuk_esitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code esit_degil}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void enterEsit_degil(DilParser.Esit_degilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code esit_degil}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void exitEsit_degil(DilParser.Esit_degilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code saf_deger}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void enterSaf_deger(DilParser.Saf_degerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code saf_deger}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 */
	void exitSaf_deger(DilParser.Saf_degerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_eleman_ekleme}
	 * labeled alternative in {@link DilParser#arraye_ekleme}.
	 * @param ctx the parse tree
	 */
	void enterArray_eleman_ekleme(DilParser.Array_eleman_eklemeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_eleman_ekleme}
	 * labeled alternative in {@link DilParser#arraye_ekleme}.
	 * @param ctx the parse tree
	 */
	void exitArray_eleman_ekleme(DilParser.Array_eleman_eklemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#degisken_turu}.
	 * @param ctx the parse tree
	 */
	void enterDegisken_turu(DilParser.Degisken_turuContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#degisken_turu}.
	 * @param ctx the parse tree
	 */
	void exitDegisken_turu(DilParser.Degisken_turuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goster_command}
	 * labeled alternative in {@link DilParser#goster_komutu}.
	 * @param ctx the parse tree
	 */
	void enterGoster_command(DilParser.Goster_commandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goster_command}
	 * labeled alternative in {@link DilParser#goster_komutu}.
	 * @param ctx the parse tree
	 */
	void exitGoster_command(DilParser.Goster_commandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code program_sonlandir}
	 * labeled alternative in {@link DilParser#program_bitir}.
	 * @param ctx the parse tree
	 */
	void enterProgram_sonlandir(DilParser.Program_sonlandirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code program_sonlandir}
	 * labeled alternative in {@link DilParser#program_bitir}.
	 * @param ctx the parse tree
	 */
	void exitProgram_sonlandir(DilParser.Program_sonlandirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deger_ata}
	 * labeled alternative in {@link DilParser#deger_atama}.
	 * @param ctx the parse tree
	 */
	void enterDeger_ata(DilParser.Deger_ataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deger_ata}
	 * labeled alternative in {@link DilParser#deger_atama}.
	 * @param ctx the parse tree
	 */
	void exitDeger_ata(DilParser.Deger_ataContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#sol_taraf_degiskenleri}.
	 * @param ctx the parse tree
	 */
	void enterSol_taraf_degiskenleri(DilParser.Sol_taraf_degiskenleriContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#sol_taraf_degiskenleri}.
	 * @param ctx the parse tree
	 */
	void exitSol_taraf_degiskenleri(DilParser.Sol_taraf_degiskenleriContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sinif_fonksiyon_deger}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterSinif_fonksiyon_deger(DilParser.Sinif_fonksiyon_degerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sinif_fonksiyon_deger}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitSinif_fonksiyon_deger(DilParser.Sinif_fonksiyon_degerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dogru_yanlis}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterDogru_yanlis(DilParser.Dogru_yanlisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dogru_yanlis}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitDogru_yanlis(DilParser.Dogru_yanlisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_deger}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterArray_deger(DilParser.Array_degerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_deger}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitArray_deger(DilParser.Array_degerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code karekok_islemi}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterKarekok_islemi(DilParser.Karekok_islemiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code karekok_islemi}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitKarekok_islemi(DilParser.Karekok_islemiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code euler_sayisi}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterEuler_sayisi(DilParser.Euler_sayisiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code euler_sayisi}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitEuler_sayisi(DilParser.Euler_sayisiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code degisken_grubu_eleman}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterDegisken_grubu_eleman(DilParser.Degisken_grubu_elemanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code degisken_grubu_eleman}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitDegisken_grubu_eleman(DilParser.Degisken_grubu_elemanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cosinus_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterCosinus_fonksiyonu(DilParser.Cosinus_fonksiyonuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cosinus_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitCosinus_fonksiyonu(DilParser.Cosinus_fonksiyonuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code kolay_artis}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterKolay_artis(DilParser.Kolay_artisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code kolay_artis}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitKolay_artis(DilParser.Kolay_artisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parantezli_ifade}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterParantezli_ifade(DilParser.Parantezli_ifadeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parantezli_ifade}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitParantezli_ifade(DilParser.Parantezli_ifadeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tur_fonksiyon}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterTur_fonksiyon(DilParser.Tur_fonksiyonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tur_fonksiyon}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitTur_fonksiyon(DilParser.Tur_fonksiyonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mod_islemi}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterMod_islemi(DilParser.Mod_islemiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mod_islemi}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitMod_islemi(DilParser.Mod_islemiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uslu_ifade}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterUslu_ifade(DilParser.Uslu_ifadeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uslu_ifade}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitUslu_ifade(DilParser.Uslu_ifadeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code carpma_bolme}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterCarpma_bolme(DilParser.Carpma_bolmeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code carpma_bolme}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitCarpma_bolme(DilParser.Carpma_bolmeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read_komutu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterRead_komutu(DilParser.Read_komutuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read_komutu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitRead_komutu(DilParser.Read_komutuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_degiske}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterArray_degiske(DilParser.Array_degiskeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_degiske}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitArray_degiske(DilParser.Array_degiskeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tanjant_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterTanjant_fonksiyonu(DilParser.Tanjant_fonksiyonuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tanjant_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitTanjant_fonksiyonu(DilParser.Tanjant_fonksiyonuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_deger}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterString_deger(DilParser.String_degerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_deger}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitString_deger(DilParser.String_degerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code yok_command}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterYok_command(DilParser.Yok_commandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code yok_command}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitYok_command(DilParser.Yok_commandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toplama_cikarma}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterToplama_cikarma(DilParser.Toplama_cikarmaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toplama_cikarma}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitToplama_cikarma(DilParser.Toplama_cikarmaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eksi_sayi}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterEksi_sayi(DilParser.Eksi_sayiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eksi_sayi}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitEksi_sayi(DilParser.Eksi_sayiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sinus_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterSinus_fonksiyonu(DilParser.Sinus_fonksiyonuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sinus_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitSinus_fonksiyonu(DilParser.Sinus_fonksiyonuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fonk_cagri}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterFonk_cagri(DilParser.Fonk_cagriContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fonk_cagri}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitFonk_cagri(DilParser.Fonk_cagriContext ctx);
	/**
	 * Enter a parse tree produced by the {@code degisken_deger_al}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterDegisken_deger_al(DilParser.Degisken_deger_alContext ctx);
	/**
	 * Exit a parse tree produced by the {@code degisken_deger_al}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitDegisken_deger_al(DilParser.Degisken_deger_alContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tur_degistir}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterTur_degistir(DilParser.Tur_degistirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tur_degistir}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitTur_degistir(DilParser.Tur_degistirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pi_sayisi}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterPi_sayisi(DilParser.Pi_sayisiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pi_sayisi}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitPi_sayisi(DilParser.Pi_sayisiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ln_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterLn_fonksiyonu(DilParser.Ln_fonksiyonuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ln_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitLn_fonksiyonu(DilParser.Ln_fonksiyonuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code log_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterLog_fonksiyonu(DilParser.Log_fonksiyonuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code log_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitLog_fonksiyonu(DilParser.Log_fonksiyonuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code yeni_sinif}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterYeni_sinif(DilParser.Yeni_sinifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code yeni_sinif}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitYeni_sinif(DilParser.Yeni_sinifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cotanjant_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterCotanjant_fonksiyonu(DilParser.Cotanjant_fonksiyonuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cotanjant_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitCotanjant_fonksiyonu(DilParser.Cotanjant_fonksiyonuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sabit_rakam_deger}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterSabit_rakam_deger(DilParser.Sabit_rakam_degerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sabit_rakam_deger}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitSabit_rakam_deger(DilParser.Sabit_rakam_degerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code len_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void enterLen_fonksiyonu(DilParser.Len_fonksiyonuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code len_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 */
	void exitLen_fonksiyonu(DilParser.Len_fonksiyonuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basit_bir_artirma}
	 * labeled alternative in {@link DilParser#basit_artis}.
	 * @param ctx the parse tree
	 */
	void enterBasit_bir_artirma(DilParser.Basit_bir_artirmaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basit_bir_artirma}
	 * labeled alternative in {@link DilParser#basit_artis}.
	 * @param ctx the parse tree
	 */
	void exitBasit_bir_artirma(DilParser.Basit_bir_artirmaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code try_catch_yapisi}
	 * labeled alternative in {@link DilParser#try_yapisi}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_yapisi(DilParser.Try_catch_yapisiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code try_catch_yapisi}
	 * labeled alternative in {@link DilParser#try_yapisi}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_yapisi(DilParser.Try_catch_yapisiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hata_at}
	 * labeled alternative in {@link DilParser#hata_gonder}.
	 * @param ctx the parse tree
	 */
	void enterHata_at(DilParser.Hata_atContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hata_at}
	 * labeled alternative in {@link DilParser#hata_gonder}.
	 * @param ctx the parse tree
	 */
	void exitHata_at(DilParser.Hata_atContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#catch_yapisi}.
	 * @param ctx the parse tree
	 */
	void enterCatch_yapisi(DilParser.Catch_yapisiContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#catch_yapisi}.
	 * @param ctx the parse tree
	 */
	void exitCatch_yapisi(DilParser.Catch_yapisiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case_komutu}
	 * labeled alternative in {@link DilParser#case_yapisi}.
	 * @param ctx the parse tree
	 */
	void enterCase_komutu(DilParser.Case_komutuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case_komutu}
	 * labeled alternative in {@link DilParser#case_yapisi}.
	 * @param ctx the parse tree
	 */
	void exitCase_komutu(DilParser.Case_komutuContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#secilen}.
	 * @param ctx the parse tree
	 */
	void enterSecilen(DilParser.SecilenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#secilen}.
	 * @param ctx the parse tree
	 */
	void exitSecilen(DilParser.SecilenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#hic_yoksa}.
	 * @param ctx the parse tree
	 */
	void enterHic_yoksa(DilParser.Hic_yoksaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#hic_yoksa}.
	 * @param ctx the parse tree
	 */
	void exitHic_yoksa(DilParser.Hic_yoksaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#secenekler}.
	 * @param ctx the parse tree
	 */
	void enterSecenekler(DilParser.SeceneklerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#secenekler}.
	 * @param ctx the parse tree
	 */
	void exitSecenekler(DilParser.SeceneklerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#for_dongu_degisim}.
	 * @param ctx the parse tree
	 */
	void enterFor_dongu_degisim(DilParser.For_dongu_degisimContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#for_dongu_degisim}.
	 * @param ctx the parse tree
	 */
	void exitFor_dongu_degisim(DilParser.For_dongu_degisimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_dongu}
	 * labeled alternative in {@link DilParser#for_dongusu}.
	 * @param ctx the parse tree
	 */
	void enterFor_dongu(DilParser.For_donguContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_dongu}
	 * labeled alternative in {@link DilParser#for_dongusu}.
	 * @param ctx the parse tree
	 */
	void exitFor_dongu(DilParser.For_donguContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#dongu_artis}.
	 * @param ctx the parse tree
	 */
	void enterDongu_artis(DilParser.Dongu_artisContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#dongu_artis}.
	 * @param ctx the parse tree
	 */
	void exitDongu_artis(DilParser.Dongu_artisContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#parantez2}.
	 * @param ctx the parse tree
	 */
	void enterParantez2(DilParser.Parantez2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#parantez2}.
	 * @param ctx the parse tree
	 */
	void exitParantez2(DilParser.Parantez2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#parantez1}.
	 * @param ctx the parse tree
	 */
	void enterParantez1(DilParser.Parantez1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#parantez1}.
	 * @param ctx the parse tree
	 */
	void exitParantez1(DilParser.Parantez1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code do_while_loop}
	 * labeled alternative in {@link DilParser#ikinci_loop_yapisi}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_loop(DilParser.Do_while_loopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code do_while_loop}
	 * labeled alternative in {@link DilParser#ikinci_loop_yapisi}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_loop(DilParser.Do_while_loopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_loop}
	 * labeled alternative in {@link DilParser#loop_yapisi}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(DilParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_loop}
	 * labeled alternative in {@link DilParser#loop_yapisi}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(DilParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_list_hazirlandi}
	 * labeled alternative in {@link DilParser#array_listesi}.
	 * @param ctx the parse tree
	 */
	void enterArray_list_hazirlandi(DilParser.Array_list_hazirlandiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_list_hazirlandi}
	 * labeled alternative in {@link DilParser#array_listesi}.
	 * @param ctx the parse tree
	 */
	void exitArray_list_hazirlandi(DilParser.Array_list_hazirlandiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_deger_al}
	 * labeled alternative in {@link DilParser#array_degiskeni}.
	 * @param ctx the parse tree
	 */
	void enterArray_deger_al(DilParser.Array_deger_alContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_deger_al}
	 * labeled alternative in {@link DilParser#array_degiskeni}.
	 * @param ctx the parse tree
	 */
	void exitArray_deger_al(DilParser.Array_deger_alContext ctx);
	/**
	 * Enter a parse tree produced by the {@code degisken_deger}
	 * labeled alternative in {@link DilParser#degisken_ismi}.
	 * @param ctx the parse tree
	 */
	void enterDegisken_deger(DilParser.Degisken_degerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code degisken_deger}
	 * labeled alternative in {@link DilParser#degisken_ismi}.
	 * @param ctx the parse tree
	 */
	void exitDegisken_deger(DilParser.Degisken_degerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DilParser#sabit_rakam_degeri}.
	 * @param ctx the parse tree
	 */
	void enterSabit_rakam_degeri(DilParser.Sabit_rakam_degeriContext ctx);
	/**
	 * Exit a parse tree produced by {@link DilParser#sabit_rakam_degeri}.
	 * @param ctx the parse tree
	 */
	void exitSabit_rakam_degeri(DilParser.Sabit_rakam_degeriContext ctx);
}