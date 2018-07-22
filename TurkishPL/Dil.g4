/**
 * Define a grammar called Hello
 */

/*  * 
 * ð – \u011f
* Ð – \u011e
* ý – \u0131
* Ý – \u0130
* ö – \u00f6
* Ö – \u00d6
* ü – \u00fc
* Ü – \u00dc
* þ – \u015f
* Þ – \u015e
* ç – \u00e7
* Ç – \u00c7 */

/*Array silme ve sort etme bekliyor.... */
/*
 * iflerin yada whilerin içinde gramer olarak bir fonksiyon tanýmlanabilir
 * Bunu her bir yapý için yeni bir kural oluþturup fonksiyon tanýmlamanýn olmadý  yapýlar oluþtur
 * o þekilde syntax a ekle...
 * 
 * 
 * 
 */


grammar Dil;
program  :  ( bildirimler ( ';' |  ) )+ ;         

 
bildirimler:
sinif_tanimi
| goster_komutu
 | referans_tanimi  //anlatýldý..
 |degisken_tanimi //anlatýldý
| deger_atama //anlatýldý
| program_bitir 
| arraye_ekleme //anlatýldý
| sart_ifadesi //return tamam  break ve continue kontrolleri tamam //anlatýldý
| loop_yapisi //while döngüsü - return tamam break continue tamam //anlatýldý
| ikinci_loop_yapisi //do-while döngüsü - return tamam - break continue tamam... //anlatýldý
| case_yapisi //return tamam break ve continue kontrolleri tamam //Anlatýldý
| referans_atama_yapisi //Anlatýldý
| degisken_grubu //Anlatýldý
| fonksiyon_tanimi //tamam //anlatýldý
| matematik_fonksiyon_tanimi
| fonksiyon_cagirilmasi//tamam
| return_deyimi //tamam anlatýldý
| donguden_cik //Anlatýldý
| for_dongusu //anlatýldý...
| continue_komutu //anlatýldý
| hata_gonder //anlatýldý...
| try_yapisi  //anlatýldý
| sinif_fonksiyon_cagirma //anlatýldý
| tus_bekle

| COMMENT
;


tur_fonksiyonu:

't\u00fcr' '(' ifadeler  ')' #turu_ne

;
//implemente edilecek

//Tür dönüþtürme iþleçleri yazýlacak...
tur_donusturme_islec:
'(' ')' ifadeler 
;


//fonksiyon tanýmlarý da global alanda tanýmlanacak...
//Tüm fonksyion tanýmlarýný bir mapte tutacaðýz...
fonksiyon_tanimi:

'fonksiyon'  degisken_ismi '(' (  | (fonksiyon_parametreleri ( ',' fonksiyon_parametreleri)* ) )    ')' 
'{'
	
( fonksiyon_bildirimleri )*

	
	
	
'}'#fonksiyon_tanimi_

;
//Bunu implemente et...
return_deyimi:

'sonu\u00e7' ifadeler #return_komutu
;


donguden_cik:
'd\u00f6ng\u00fcden' '\u00e7\u0131k' #break_komutu
;


continue_komutu:

'ba\u015ftan' 'devam' 'et'#continue_komut

;



matematik_fonksiyon_tanimi:

degisken_ismi '(' degisken_ismi ( ',' degisken_ismi )* ')' '=' ifadeler  #matematik_fonksiyon_kaydi


;



fonksiyon_cagirilmasi:

degisken_ismi '('  ( |  ( ifadeler ( ',' ifadeler)* ) )  ')' #fonksiyon_call
;


//Fonksyionlarda tüm programdaki stamentler kullanýlamayacak
//Mesela fonksiyon içinde fonksiyon tanýmý...
//Fonksiyobnlarýn daha az statement çeþidi olmalý...
fonksiyon_bildirimleri: 
 goster_komutu
 | referans_tanimi
 |degisken_tanimi
| deger_atama
| program_bitir 
| arraye_ekleme
| sart_ifadesi //return tamam  break ve continue kontrolleri tamam
| loop_yapisi //while döngüsü - return tamam break continue tamam
| ikinci_loop_yapisi //do-while döngüsü - return tamam - break continue tamam...
| case_yapisi //return tamam break ve continue kontrolleri tamam
| referans_atama_yapisi
| fonksiyon_cagirilmasi
| return_deyimi
| donguden_cik
| for_dongusu
| continue_komutu
| hata_gonder
| try_yapisi
| oku_komutu
| tus_bekle
| COMMENT

;

tus_bekle:
'tu\u015f' 'bekle'#getch_komutu

;


fonksiyon_parametreleri :

degisken_tanimi | referans_tanimi

;



//Sýnýf tanýmlarý burada yapýlýyor...

//Sýnýf tanýmlamalarý sadece global alanda yapýlacak....

sinif_tanimi:

'S\u0131n\u0131f' degisken_ismi '{'

 ( sinif_fonksiyon_tanimi | sinif_degisken_tanimi ) +



'}' #sinif_tanimlanmasi



;

yeni_sinif_objesi:

'yeni' fonksiyon_cagirilmasi #sinif_elema_olusturma

; 

sinif_degisken_tanimi :
//structure da eleman tanýmlama gibi...
ulasim_anahtarlari grup_degiskeni#sinif_eleman_olusturma 
;

sinif_fonksiyon_tanimi:

ulasim_anahtarlari fonksiyon_tanimi

;



ulasim_anahtarlari:
'\u00f6zel' | 'genel'

;

oku_komutu:

'oku' '(' ifadeler ')'#oku_command


;



//C deki structure yapýsý

//Global bir deðiþkeni set et grup deðiþkenleri oluþturulurken 
//structurýn elemanýný current meme deðiþken_ismi.deðiþken þeklinde bir string olarak normal bir deðiþkenmiþ gibi
//kaydet...
degisken_grubu: 'De\u011fi\u015fken' 'Grubu' degisken_ismi  '<'  


grup_degiskeni ( ',' grup_degiskeni )*



'>'#degisken_grubu_tanimi //Bunda tüm yapý tanýmlamalarýný bir arraya atacaðýz tanýmlama yapýlýdýðýnda bu arraydan yapýyý 
//Alacaðýz...
;

grup_degiskeni:
referans_tanimi | degisken_tanimi
;






referans_tanimi : 'Referans'  referans_durum  ( ',' referans_durum )* ;


referans_durum :
//structurýn elemaný olabilir o yüzden structura ekleme kýsýmlarýný ekle...

degisken_ismi #sadece_referans_ismi
| 
degisken_ismi '->' degisken_ismi #atamali_referans_ismi
;


referans_atama_yapisi :
referans_olabilenler '->' referans_olabilenler #referans_atama;
 

referans_olabilenler:
degisken_ismi | degisken_grubu_elemani | array_degiskeni | yok_ifadesi
;




//Tamsayý a , b = 125 , c , d = 36 , e = 1478 vb. saðlamak için...
degisken_tanimi: degisken_turu  degisken_durum  (',' degisken_durum  )*#degisken_tanimla
 ;
degisken_durum:

degisken_ismi #sadece_isim
| 
//strucuture ekelemsi yapýlacak...
degisken_ismi '=' ifadeler#ilk_degerli

;
 
mantik:
'do\u011fru' #dogru

| 

'yanl\u0131\u015f'#yanlis

; 
 
yok_ifadesi:

'yok'
;



degisken_grub_eleman:


degisken_grub_eleman '.' degisken_grub_eleman
| degisken_ismi
| array_degiskeni
| yeni_sinif_objesi


;



sinif_fonksiyon_cagirma:

structure_eleman '.' fonksiyon_cagirilmasi #sinif_fonksiyon_cagirmasi

;


 
degisken_grubu_elemani:

degisken_grubu_elemani '.' structure_eleman #degisken_grub

| 

structure_eleman '.' structure_eleman#degisken_grubu_elemani_elemani 
; 


structure_eleman:
array_degiskeni | degisken_ismi  | yeni_sinif_objesi ;



sart_ifadesi:


mantik_ifadeleri ( 'do\u011fru' 'ise' | 'do\u011fruysa' )
'<'

 ( bildirimler ) *

'>'
 ( veya_dogruysa_yapisi ) *
 
 ( | dogru_degilse_yapisi ) #sart_komutu



;

dogru_degilse_yapisi:

'do\u011fru' 'de\u011filse' '<' 

(bildirimler ) *

'>' #dogru_degil
;
 

veya_dogruysa_yapisi:

 ( 'veya' | 'VEYA' )  mantik_ifadeleri  ( 'do\u011fru' 'ise' | 'do\u011fruysa' ) '<'
 
 ( bildirimler ) * 
 
 '>'
 ;


//short cut mantýðý uygulanacak or ve and için...
mantik_ifadeleri:
//Parantezler en yüksek önceliðe sahip
 '(' mantik_ifadeleri ')' #parantezli_mantik //tamam
| mantik_ifadeleri ('&&' | 'VE' | 've' ) mantik_ifadeleri#ve_islec //tamam
| mantik_ifadeleri ( '||' | 'veya' | 'VEYA' ) mantik_ifadeleri#veya_islec //tamam
| dogruluk_ifadeleri #normal_dogru_ifade

;
 //Sayýlar sýfýr dýþý ise ve string "" ise 
 
dogruluk_ifadeleri:
 
 '('dogruluk_ifadeleri ')'#parantezli_dogru //bu tamam
|'!' dogruluk_ifadeleri #degili //bu tamam
|ifadeler ( '>'  ) ifadeler  #buyuk //bu tamam
| ifadeler '<' ifadeler #kucuk //bu tamam
| ifadeler '==' ifadeler #esit //bu tamam
| ifadeler '>=' ifadeler #buyuk_esit //bu tamam
| ifadeler '<=' ifadeler #kucuk_esit //bu da tamam
| ifadeler '!=' ifadeler #esit_degil//bu tamam
| ifadeler #saf_deger // bu tamam
;
 
 



//sol tarafta [] olmak zorunda deðil normal bir deðiþken de olabilir array. gibi
arraye_ekleme:
sol_taraf_degiskenleri '.' 'ekle' '(' ifadeler ')' #array_eleman_ekleme
 ;


degisken_turu:  'Array' | 'Tamsay\u0131'    | 'Noktal\u0131Say\u0131' | 'Karakter'  | 'Dinamik' | 'Bool' | degisken_ismi ;

goster_komutu:
'g\u00F6ster' ifadeler  ( ','  ifadeler )* #goster_command ;

 
 program_bitir :
  'kapat' #program_sonlandir
 ;
 
 deger_atama : 
 //Sayýlarýný daha kolay elde edebilmek için iki ayrý deðiþkeni birleþtirdik...
  sol_taraf_degiskenleri ( ',' sol_taraf_degiskenleri )* '='   ifadeler  ( ',' ifadeler )* #deger_ata
 
 ;
 
 
 //Buraya sonradan struct da eklenebilir...
 sol_taraf_degiskenleri :
 
 ( degisken_ismi | array_degiskeni  | degisken_grubu_elemani ) 
 ;
 
 
  
  //*****Trigonometri fonksiyonlarý , log fonksiyonu , e ve PI sayýlarýný da ekle....
  
  
ifadeler: 
 

 '(' degisken_turu ')' ifadeler #tur_degistir

|'(' ifadeler ')' #parantezli_ifade //bu tamam
 |'-' ifadeler #eksi_sayi
//çarpma bölme diðer ikisinden daha öncelikli

| 'karek\u00F6k' '(' ifadeler ')' #karekok_islemi //bu tamam
| 'sin' '(' ifadeler ')' #sinus_fonksiyonu
| 'cos' '(' ifadeler ')'#cosinus_fonksiyonu
| 'tan' '(' ifadeler ')'#tanjant_fonksiyonu
| 'cot' '(' ifadeler ')' #cotanjant_fonksiyonu
| 'ln' '(' ifadeler ')'#ln_fonksiyonu
| 'Matematik' '.' 'E' #euler_sayisi
| 'Matematik' '.' 'P\u0130' #pi_sayisi
| 'log' ifadeler '^' ifadeler #log_fonksiyonu
| ifadeler '%' ifadeler#mod_islemi
| ifadeler '^' ifadeler #uslu_ifade //bu tamam
| ifadeler opt=( '*' | '/' ) ifadeler #carpma_bolme //bu tamam
| ifadeler opt=( '+' | '-' ) ifadeler#toplama_cikarma
|  mantik #dogru_yanlis
| degisken_ismi #degisken_deger_al
| array_degiskeni #array_degiske
| sabit_rakam_degeri  #sabit_rakam_deger //bu tamam
//String için bazý iþlemler geçerli deðil bunlarla karþýlaþýnca hata vereceðiz...
| STRING #string_deger //bu tamam
| array_listesi #array_deger 
| fonksiyon_cagirilmasi #fonk_cagri
| degisken_grubu_elemani #degisken_grubu_eleman
| 'boyut' '(' ifadeler ')' #len_fonksiyonu
| tur_fonksiyonu #tur_fonksiyon
| basit_artis #kolay_artis
| yeni_sinif_objesi #yeni_sinif
|  oku_komutu #read_komutu
| yok_ifadesi#yok_command
| sinif_fonksiyon_cagirma#sinif_fonksiyon_deger


;

basit_artis:
sol_taraf_degiskenleri '++' #basit_bir_artirma
;
 

try_yapisi:

'hata' 'olabilir' '<' 

 ( bildirimler ) * 


'>'
 ( catch_yapisi  )+  #try_catch_yapisi

 
;

hata_gonder :

'hata' 'g\u00f6nder' ifadeler #hata_at

;




//Devam et..
catch_yapisi:

'hata' degisken_tanimi '<' 
   
   //Bu fonksiyon ifadeleri ile ayný olacak...
 ( bildirimler )*



'>'

;




case_yapisi: 

'se\u00e7' '(' secilen ')'
'<'
	
	
( secenekler )*	
	
	
( | hic_yoksa)

	
'>'  #case_komutu




;
//diðer ifadelerden ayrým için...
secilen :
ifadeler
;

hic_yoksa:'hi\u00e7biri' 'de\u011filse' ':' 
(bildirimler)*


;


secenekler :
ifadeler ( 'veya' ifadeler )*  'ise'':' 
 ( bildirimler )+

;

for_dongu_degisim :

deger_atama | basit_artis

;


//for döngüsü syntax i bitir
for_dongusu:


'd\u00f6ng\u00fc' degisken_ismi '=' ifadeler ',' mantik_ifadeleri  'do\u011fru' 'oldu\u011fu' 's\u00fcrece' ( | ',' for_dongu_degisim )

'<'

 ( bildirimler ) *

'>' #for_dongu

;

dongu_artis:

'|' degisken_ismi '=' ifadeler

;

parantez2:
')' | ']' 
;
parantez1:
'('  | '[' 
;
 //do { } while 
ikinci_loop_yapisi:
'buradan' 'itibaren'
'<'
(bildirimler)+

'>'
mantik_ifadeleri 'do\u011fru' 'oldu\u011fu' 's\u00fcrece' #do_while_loop

;
//while ( ) {  }
loop_yapisi:
mantik_ifadeleri 'do\u011fru' 'oldu\u011fu' 's\u00fcrece' '<'
( bildirimler ) *

'>' #while_loop
; 
 
 //Array list boþ da olabilir , bir yada daha fazla elemanlý da virgülle ayrýlmýþ olmak kaydýyla...
array_listesi: '{'(  |  ( ifadeler ( ',' ifadeler )*)) '}' #array_list_hazirlandi 

;
 
 array_degiskeni:
 
 //Array deðiþkeni hiç [] iþleci kullanýlmazsa normal variable iþlemleri gibi zaten yapýlacak
degisken_ismi ('[' ifadeler ']')+  #array_deger_al 
;
 
 degisken_ismi: DEGISKEN_ISMI #degisken_deger;

//Tüm stringler "" arasýnda olacaktýr..
STRING : '"' ( '=' | '!' | '['  | ']' | '/' | '.' |'\\n' | '\u011f' | '\u011e' | '\u0131' | '\u0130' | '\u00f6' | '\u00d6' | '\u00fc' | '\u00dc' | '\u015f' | '\u015e' | '\u00e7' |  '\u00c7' | 'a'..'z' | 'A'..'Z' | ' ' | '*' | ':' | '?' | ',' | '&' | '0' |'1' |'2' |'3' | '4' | '5' |'6' | '7' | '8' | '9' )*'"';

sabit_rakam_degeri: RAKAM ;

COMMENT: '/*' (  '\\n' | '\u011f' | '\u011e' | '\u0131' | '\u0130' | '\u00f6' | '\u00d6' | '\u00fc' | '\u00dc' | '\u015f' | '\u015e' | '\u00e7' |  '\u00c7' | 'a'..'z' | 'A'..'Z' | ' ' |'.' | '*' | ':' | '?' | ',' |'+' | '-' | '&' | '0' |'1' |'2' |'3' | '4' | '5' |'6' | '7' | '8' | '9' | '!' |'=' | [\r\n])* '*/' ;

//Rakam eksi de olabilir pozitif de...kesirli sayýda olabilir tam sayýda...
//*** rakamýn eksi olmasý burada deðil ifadeler: '-' ifadeler ile saðlanmakta...
RAKAM:  [0-9]+ ( | '.') ( |  [0-9]+   ) ;
 
  
//Deðiþken isimleri boþluk , * , . , * vb. karakterlerden oluþamaz...
//deðiþkenin ilk karakteri alfabetik olamalý gerisi nümerik olabilir...
DEGISKEN_ISMI: ('\u011f' | '\u011e' | '\u0131' | '\u0130' | '\u00f6' | '\u00d6' | '\u00fc' | '\u00dc' | '\u015f' | '\u015e' | '\u00e7' |  '\u00c7' | 'a'..'z' | 'A'..'Z' )  ('\u011f' | '\u011e' | '\u0131' | '\u0130' | '\u00f6' | '\u00d6' | '\u00fc' | '\u00dc' | '\u015f' | '\u015e' | '\u00e7' |  '\u00c7' | 'a'..'z' | 'A'..'Z' | '1'..'9' )*  ;             // match lower-case identifiers

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

