// Generated from Dil.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DilParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DilVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DilParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DilParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#bildirimler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBildirimler(DilParser.BildirimlerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code turu_ne}
	 * labeled alternative in {@link DilParser#tur_fonksiyonu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuru_ne(DilParser.Turu_neContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#tur_donusturme_islec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTur_donusturme_islec(DilParser.Tur_donusturme_islecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fonksiyon_tanimi_}
	 * labeled alternative in {@link DilParser#fonksiyon_tanimi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFonksiyon_tanimi_(DilParser.Fonksiyon_tanimi_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code return_komutu}
	 * labeled alternative in {@link DilParser#return_deyimi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_komutu(DilParser.Return_komutuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code break_komutu}
	 * labeled alternative in {@link DilParser#donguden_cik}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_komutu(DilParser.Break_komutuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continue_komut}
	 * labeled alternative in {@link DilParser#continue_komutu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_komut(DilParser.Continue_komutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matematik_fonksiyon_kaydi}
	 * labeled alternative in {@link DilParser#matematik_fonksiyon_tanimi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatematik_fonksiyon_kaydi(DilParser.Matematik_fonksiyon_kaydiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fonksiyon_call}
	 * labeled alternative in {@link DilParser#fonksiyon_cagirilmasi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFonksiyon_call(DilParser.Fonksiyon_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#fonksiyon_bildirimleri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFonksiyon_bildirimleri(DilParser.Fonksiyon_bildirimleriContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getch_komutu}
	 * labeled alternative in {@link DilParser#tus_bekle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetch_komutu(DilParser.Getch_komutuContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#fonksiyon_parametreleri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFonksiyon_parametreleri(DilParser.Fonksiyon_parametreleriContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sinif_tanimlanmasi}
	 * labeled alternative in {@link DilParser#sinif_tanimi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinif_tanimlanmasi(DilParser.Sinif_tanimlanmasiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sinif_elema_olusturma}
	 * labeled alternative in {@link DilParser#yeni_sinif_objesi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinif_elema_olusturma(DilParser.Sinif_elema_olusturmaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sinif_eleman_olusturma}
	 * labeled alternative in {@link DilParser#sinif_degisken_tanimi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinif_eleman_olusturma(DilParser.Sinif_eleman_olusturmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#sinif_fonksiyon_tanimi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinif_fonksiyon_tanimi(DilParser.Sinif_fonksiyon_tanimiContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#ulasim_anahtarlari}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUlasim_anahtarlari(DilParser.Ulasim_anahtarlariContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oku_command}
	 * labeled alternative in {@link DilParser#oku_komutu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOku_command(DilParser.Oku_commandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code degisken_grubu_tanimi}
	 * labeled alternative in {@link DilParser#degisken_grubu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegisken_grubu_tanimi(DilParser.Degisken_grubu_tanimiContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#grup_degiskeni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrup_degiskeni(DilParser.Grup_degiskeniContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#referans_tanimi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferans_tanimi(DilParser.Referans_tanimiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sadece_referans_ismi}
	 * labeled alternative in {@link DilParser#referans_durum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSadece_referans_ismi(DilParser.Sadece_referans_ismiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atamali_referans_ismi}
	 * labeled alternative in {@link DilParser#referans_durum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtamali_referans_ismi(DilParser.Atamali_referans_ismiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code referans_atama}
	 * labeled alternative in {@link DilParser#referans_atama_yapisi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferans_atama(DilParser.Referans_atamaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#referans_olabilenler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferans_olabilenler(DilParser.Referans_olabilenlerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code degisken_tanimla}
	 * labeled alternative in {@link DilParser#degisken_tanimi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegisken_tanimla(DilParser.Degisken_tanimlaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sadece_isim}
	 * labeled alternative in {@link DilParser#degisken_durum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSadece_isim(DilParser.Sadece_isimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ilk_degerli}
	 * labeled alternative in {@link DilParser#degisken_durum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIlk_degerli(DilParser.Ilk_degerliContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dogru}
	 * labeled alternative in {@link DilParser#mantik}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDogru(DilParser.DogruContext ctx);
	/**
	 * Visit a parse tree produced by the {@code yanlis}
	 * labeled alternative in {@link DilParser#mantik}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYanlis(DilParser.YanlisContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#yok_ifadesi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYok_ifadesi(DilParser.Yok_ifadesiContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#degisken_grub_eleman}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegisken_grub_eleman(DilParser.Degisken_grub_elemanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sinif_fonksiyon_cagirmasi}
	 * labeled alternative in {@link DilParser#sinif_fonksiyon_cagirma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinif_fonksiyon_cagirmasi(DilParser.Sinif_fonksiyon_cagirmasiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code degisken_grubu_elemani_elemani}
	 * labeled alternative in {@link DilParser#degisken_grubu_elemani}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegisken_grubu_elemani_elemani(DilParser.Degisken_grubu_elemani_elemaniContext ctx);
	/**
	 * Visit a parse tree produced by the {@code degisken_grub}
	 * labeled alternative in {@link DilParser#degisken_grubu_elemani}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegisken_grub(DilParser.Degisken_grubContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#structure_eleman}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure_eleman(DilParser.Structure_elemanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sart_komutu}
	 * labeled alternative in {@link DilParser#sart_ifadesi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSart_komutu(DilParser.Sart_komutuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dogru_degil}
	 * labeled alternative in {@link DilParser#dogru_degilse_yapisi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDogru_degil(DilParser.Dogru_degilContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#veya_dogruysa_yapisi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVeya_dogruysa_yapisi(DilParser.Veya_dogruysa_yapisiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normal_dogru_ifade}
	 * labeled alternative in {@link DilParser#mantik_ifadeleri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_dogru_ifade(DilParser.Normal_dogru_ifadeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parantezli_mantik}
	 * labeled alternative in {@link DilParser#mantik_ifadeleri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParantezli_mantik(DilParser.Parantezli_mantikContext ctx);
	/**
	 * Visit a parse tree produced by the {@code veya_islec}
	 * labeled alternative in {@link DilParser#mantik_ifadeleri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVeya_islec(DilParser.Veya_islecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ve_islec}
	 * labeled alternative in {@link DilParser#mantik_ifadeleri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVe_islec(DilParser.Ve_islecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parantezli_dogru}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParantezli_dogru(DilParser.Parantezli_dogruContext ctx);
	/**
	 * Visit a parse tree produced by the {@code degili}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegili(DilParser.DegiliContext ctx);
	/**
	 * Visit a parse tree produced by the {@code buyuk}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuyuk(DilParser.BuyukContext ctx);
	/**
	 * Visit a parse tree produced by the {@code kucuk}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKucuk(DilParser.KucukContext ctx);
	/**
	 * Visit a parse tree produced by the {@code esit}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsit(DilParser.EsitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code buyuk_esit}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuyuk_esit(DilParser.Buyuk_esitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code kucuk_esit}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKucuk_esit(DilParser.Kucuk_esitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code esit_degil}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsit_degil(DilParser.Esit_degilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code saf_deger}
	 * labeled alternative in {@link DilParser#dogruluk_ifadeleri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaf_deger(DilParser.Saf_degerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_eleman_ekleme}
	 * labeled alternative in {@link DilParser#arraye_ekleme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_eleman_ekleme(DilParser.Array_eleman_eklemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#degisken_turu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegisken_turu(DilParser.Degisken_turuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goster_command}
	 * labeled alternative in {@link DilParser#goster_komutu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoster_command(DilParser.Goster_commandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code program_sonlandir}
	 * labeled alternative in {@link DilParser#program_bitir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_sonlandir(DilParser.Program_sonlandirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deger_ata}
	 * labeled alternative in {@link DilParser#deger_atama}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeger_ata(DilParser.Deger_ataContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#sol_taraf_degiskenleri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSol_taraf_degiskenleri(DilParser.Sol_taraf_degiskenleriContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sinif_fonksiyon_deger}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinif_fonksiyon_deger(DilParser.Sinif_fonksiyon_degerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dogru_yanlis}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDogru_yanlis(DilParser.Dogru_yanlisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_deger}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_deger(DilParser.Array_degerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code karekok_islemi}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKarekok_islemi(DilParser.Karekok_islemiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code euler_sayisi}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEuler_sayisi(DilParser.Euler_sayisiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code degisken_grubu_eleman}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegisken_grubu_eleman(DilParser.Degisken_grubu_elemanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cosinus_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCosinus_fonksiyonu(DilParser.Cosinus_fonksiyonuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code kolay_artis}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKolay_artis(DilParser.Kolay_artisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parantezli_ifade}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParantezli_ifade(DilParser.Parantezli_ifadeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tur_fonksiyon}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTur_fonksiyon(DilParser.Tur_fonksiyonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mod_islemi}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_islemi(DilParser.Mod_islemiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uslu_ifade}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUslu_ifade(DilParser.Uslu_ifadeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code carpma_bolme}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCarpma_bolme(DilParser.Carpma_bolmeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read_komutu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_komutu(DilParser.Read_komutuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_degiske}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_degiske(DilParser.Array_degiskeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tanjant_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTanjant_fonksiyonu(DilParser.Tanjant_fonksiyonuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_deger}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_deger(DilParser.String_degerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code yok_command}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYok_command(DilParser.Yok_commandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toplama_cikarma}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToplama_cikarma(DilParser.Toplama_cikarmaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eksi_sayi}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEksi_sayi(DilParser.Eksi_sayiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sinus_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinus_fonksiyonu(DilParser.Sinus_fonksiyonuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fonk_cagri}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFonk_cagri(DilParser.Fonk_cagriContext ctx);
	/**
	 * Visit a parse tree produced by the {@code degisken_deger_al}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegisken_deger_al(DilParser.Degisken_deger_alContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tur_degistir}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTur_degistir(DilParser.Tur_degistirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pi_sayisi}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPi_sayisi(DilParser.Pi_sayisiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ln_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLn_fonksiyonu(DilParser.Ln_fonksiyonuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code log_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_fonksiyonu(DilParser.Log_fonksiyonuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code yeni_sinif}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYeni_sinif(DilParser.Yeni_sinifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cotanjant_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCotanjant_fonksiyonu(DilParser.Cotanjant_fonksiyonuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sabit_rakam_deger}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSabit_rakam_deger(DilParser.Sabit_rakam_degerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code len_fonksiyonu}
	 * labeled alternative in {@link DilParser#ifadeler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen_fonksiyonu(DilParser.Len_fonksiyonuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basit_bir_artirma}
	 * labeled alternative in {@link DilParser#basit_artis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasit_bir_artirma(DilParser.Basit_bir_artirmaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code try_catch_yapisi}
	 * labeled alternative in {@link DilParser#try_yapisi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_yapisi(DilParser.Try_catch_yapisiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hata_at}
	 * labeled alternative in {@link DilParser#hata_gonder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHata_at(DilParser.Hata_atContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#catch_yapisi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_yapisi(DilParser.Catch_yapisiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case_komutu}
	 * labeled alternative in {@link DilParser#case_yapisi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_komutu(DilParser.Case_komutuContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#secilen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecilen(DilParser.SecilenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#hic_yoksa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHic_yoksa(DilParser.Hic_yoksaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#secenekler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecenekler(DilParser.SeceneklerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#for_dongu_degisim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_dongu_degisim(DilParser.For_dongu_degisimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_dongu}
	 * labeled alternative in {@link DilParser#for_dongusu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_dongu(DilParser.For_donguContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#dongu_artis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDongu_artis(DilParser.Dongu_artisContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#parantez2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParantez2(DilParser.Parantez2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#parantez1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParantez1(DilParser.Parantez1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code do_while_loop}
	 * labeled alternative in {@link DilParser#ikinci_loop_yapisi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_loop(DilParser.Do_while_loopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_loop}
	 * labeled alternative in {@link DilParser#loop_yapisi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(DilParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_list_hazirlandi}
	 * labeled alternative in {@link DilParser#array_listesi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_list_hazirlandi(DilParser.Array_list_hazirlandiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_deger_al}
	 * labeled alternative in {@link DilParser#array_degiskeni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_deger_al(DilParser.Array_deger_alContext ctx);
	/**
	 * Visit a parse tree produced by the {@code degisken_deger}
	 * labeled alternative in {@link DilParser#degisken_ismi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegisken_deger(DilParser.Degisken_degerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DilParser#sabit_rakam_degeri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSabit_rakam_degeri(DilParser.Sabit_rakam_degeriContext ctx);
}