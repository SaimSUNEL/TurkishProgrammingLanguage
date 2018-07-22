
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;




/*


Döngü ( döngü l = ... ) burada döngü l deðiþkenini oluþturuyor
daha önce l deðiþkenin olmasý problem çözüm ?

*/





/*
 * Sýnýflarýn fonksiyonlarýný çaðýrýrken ayrý bir class staðý oluþturacaðýz
 * a.fnc ( ) bu olduðunda class staðýna a elemanýn ( sanki grup deðiþkleniymiþ gibi staða basacaðýz )
 * fonksiyonun içindeki deðiþkenler önce staða daha sonra sadece global alana bakacak deðiþkenler için...
 * Yoksa hata verilecek...
 * Stacka bir arraylist atacaðýz
 *
 * class fonksiyonun içinde global bir deðiþken çaðrýlmasý problem oluþturabilir...
 * 
 * Ayrýca enson çaðrýlan fonksiyon class fonksiyonumu yoksa global mi bunu da bir stackta tut....
 * Elemanlara eriþirken en son çaðrýlan fonksiyonun türüne göre global alana yada classýn alanýna eriþim saðla...
 * 
 * 
 * 
 * 
 */

//Her bir deðiþkenin yada sabit deðerlerin bir türü ve deðeri olacak...
//Örneðin "saim" bu bir string türünde ve value su = saim
class Özellikler implements Serializable,Cloneable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String tür ;
	Object deðer ;
	//Sýnýf deðiþkenleri için ....
	String eriþim_biçimi = ""  ;
	public Özellikler ( ) 
	{
		
	}
	public Özellikler ( String tür , Object deðer ) 
	{
		this.tür = tür ;
		this.deðer = deðer ;
	}
	public Object clone ( String tür , Object deðer )
	{
		return new Özellikler (tür, deðer );
		
		
	}
	
	public String toString ( ) 
	{
		return "[tür:" + this.tür + "-deðer:"+ this.deðer + "]" ;
 		
		
	}
	
	
}



public class TreeWalker extends DilBaseVisitor<Object>  {
private TurkishPLOutput pencere ;
	public TreeWalker ( TurkishPLOutput pencere )
	{this.pencere = pencere ;
		
		FunctionTable main_stack = new FunctionTable() ;
		main_stack.lokal_deðiþken_memory = new HashMap ( ) ;
		main_stack.previous_function_table = null ;
		main_stack.number = 0 ;
		
		this.fonksiyon_stack.push( main_stack ) ;
		
	}
	
	private boolean array_elamanýna_deðer_atama = false ;
	
	
	
	
	class FunctionTable {
		
		
		HashMap lokal_deðiþken_memory ;
		FunctionTable previous_function_table ;
		Object return_values ;
		
		int number ;
		
		
		
		
		
	}
	
	
	HashMap <String , String > deðiþken_ismi_ve_türü_map = new HashMap<String, String> ( ) ;
	
	
	
	final String STRING="STRING" , TAMSAYI="TAMSAYI" , NOKTALISAYI="NOKTALISAYI" , ARRAY="ARRAY" , REFERANS = "REFERANS" , DÝNAMÝK = "DÝNAMÝK";
	
	private HashMap ekleme_için ;
	
	
	
	/*
	 * { 123 , 1254 , 14 } [2 ] böyle bir yapý , f ( x ) [ 23 ] fonksiyon geri bir array döndürürse ?
	 * 
	 * 
	 */
	
	
	
	
	//Deðiþkenin kendisi sade x -> a durumunda çaðrýlacak bunun dýþýnda hep refer edilen deðiþken dönülecek...
	//Referansýn referansý yok ... Bu durumda referansýn refer ettiði deðiþken refer edilecek...
	final String KENDÝSÝ = "KENDÝSÝ" , REFER_ETTÝÐÝ = "REFEREDÝLEN" ;
	
	String referans_deðiþkeni_durumu = REFER_ETTÝÐÝ ;
	String dinamik_deðiþkeni_durumu = REFER_ETTÝÐÝ ;
	
	
	//Her bir fonksiyon çaðrýldýðýnda ilgi fonksiyon için bir kayýt oluþturacaðýz bu yapýyla fonksiyon iþlemini
	//bitirince pop edeceðiz...
	//Her zaman program çalýþmaya baþlayýnca bir tane kesin oluþturacak main fonksiyondaki deðiþkenler için...
	Stack<FunctionTable> fonksiyon_stack = new Stack<FunctionTable> ( );
	
	//Bu mapin içerisinde tanýmlanan tüm structure yapýlarýný bunun içinde tutatacaðýz....
	//Structurýn ismi yapýnýn indexi olacak...
	HashMap<String , DilParser.Degisken_grubu_tanimiContext> structure_tanýmlarý = new HashMap<String, DilParser.Degisken_grubu_tanimiContext>() ; 
	
	//Bu çok istisnai bir durumuda kullanýlýyor eðer bir structurýn içinde bir structure deðiþkeni tanýmlanýyor ise
	//deðiþken oluþturma yöndemi recursive eðer bir tane global deðiþkende tutarsak ikincisi global deðiþkeni 
	//deðiþtiriyor onun yeri bir stack oluþturuyoruz her ekleme bunun peek teki deðiþken ismine yapýlýyor...
	
	Stack<HashMap<String,Özellikler>> ekleme_yapýlcak_structure_ismi = new Stack <HashMap<String,Özellikler>> ( ) ;
	
	
	//Structure elemanýna eriþirken structurýn mapi bunun içine push edilecek , elemanlara eriþirken peek edilecek bu 
	//mem den alýnacak...
	Stack<Özellikler> structure_current_mem= new Stack<Özellikler> ( );
	HashMap<String , DilParser.Fonksiyon_tanimi_Context > tanýmlanmýþ_fonksiyonlar = new HashMap<String, DilParser.Fonksiyon_tanimi_Context> ( ) ;
	
	HashMap <String , DilParser.Matematik_fonksiyon_kaydiContext > matematik_fonksiyonlarý = new HashMap<String, DilParser.Matematik_fonksiyon_kaydiContext>  ( ) ;
	
	
	/*Daha önce hiç yakalanmamýþ hatayý en son main programda hata mesajý vermek için program kuralýnýn içinde bildirimleri for loop 
	 * ile dolaþ eðer herhangi bir hata nesnesi dönerse hata mesajý ver ve programý kapat...
	 * 
	 * 
	 * 
	 * 
	*/
	
	//Döngülerin dýþýnda break yada continue komutlarýnýn kullanýmýný engellemek için
	//Kullanacaðýz...
	Stack< Integer > döngü_stack = new Stack< Integer > ( ) ;
	
	
//Break ve continue için birden fazla looptan çýkmak gerekiyor , bunun için hata nesnes atýyoruz...
	class Goto extends Exception {
		public Goto ( String mes )
		{
			this.hata = mes ;
		}
		public String hata ;
		
		
	}

	
	public Object visitGetch_komutu(DilParser.Getch_komutuContext ctx) {

		this.pencere.ekrana_yaz( "" );
		
		this.pencere.wait_key = true ;
		this.pencere.tuþ_bekle ( ) ;
		while( this.pencere.b.tryAcquire() != true ) ;
			this.pencere.b.release(); 
			this.pencere.wait_key = false ;
			
			
			return new Özellikler  ( )
	 ;	
		
		
		
		
		
	
	}
	
	

	
	
	
	
	
	
	
	
	
	//Klavyeden veri almak için kullanýlan komut oku ( "comments" )
	
	public Object visitRead_komutu(DilParser.Read_komutuContext ctx) {
		
		
		return visit(ctx.oku_komutu()); 
		
	
	}
	
	
	
	
	Scanner klavye  = new Scanner ( System.in ) ;
	
	
	//Klavyeden input almak için 
	//Devamlý Karakter türünde bilgi dönüyor...
	public Object visitOku_command(DilParser.Oku_commandContext ctx) {
		
		
Özellikler yeni = new Özellikler ( ) ;
String inputtan_once ;
yeni.tür = STRING ; //Klavyeden her girilen Karakter türünden olacak...
Özellikler mesaj =  ( Özellikler )  visit ( ctx.ifadeler() ) ;
if ( !mesaj.tür.equals ( STRING )  )
{
	System.out.println ( "oku komutunun parametresi Karakter türünden olmak zorundadýr..." )  ;
	Özellikler yen = new Özellikler ( )  ;
	yen.tür = "HATA" ;
	yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
	
	return yen ;
}

//Burada windowa da yazdýrýlacak...

System.out.print ( mesaj.deðer  ) ;
this.pencere.ekrana_yaz( ""+ mesaj.deðer );


System.out.print( "> ");
this.pencere.textArea.append ( "> ") ;
pencere.veri_alýnacak();

inputtan_once = this.pencere.textArea.getText();



while ( pencere.a.tryAcquire() == false 	) ;

pencere.a.release();
String inputtan_sonra = pencere.textArea.getText();

String fark = new String ( inputtan_sonra.toCharArray() , inputtan_once.length() , inputtan_sonra.length() - inputtan_once.length()-2) ;

System.out.println ( "Ýnputtan önce : " + inputtan_once ) ;
System.out.println ( "Ýnputtan sonra : " + inputtan_sonra ) ;


System.out.println ( "Size : " + fark.length() ) ;

System.out.println( "Fark : " + fark + "----" );



yeni.deðer = fark ;


return yeni ;


		
	
	
	}
	
	//NULL ifadesinin karþýlýðý
	
	public Object visitYok_command(DilParser.Yok_commandContext ctx) {
		Özellikler yeni = new Özellikler ( ) ;
		 yeni.tür = "YOK" ;
		 yeni.deðer = null ;
		 
		 return yeni ;
	}

	
	
	
	
	//Tür dönüþümleri yapýlýyor....
	//Kopyalama yapýlacak...
	public Object visitTur_degistir(DilParser.Tur_degistirContext ctx) { 
		
		String dönüþtürülecek_tür = ctx.degisken_turu().getText ( ) ;
		Özellikler deðiþtirilecek_deðer = ( Özellikler ) visit ( ctx.ifadeler() ) ;
		Özellikler yeni = new Özellikler () ;
		
		switch ( dönüþtürülecek_tür )
		{
		
		case "Karakter":
			
			switch ( deðiþtirilecek_deðer.tür ) 
			{
			
			case TAMSAYI:		
				yeni.tür = STRING ;
				yeni.deðer =  "" + deðiþtirilecek_deðer.deðer  ;
				
				break;
				
				
			case NOKTALISAYI:
				
				yeni.tür = STRING ;
				yeni.deðer =  ""  + deðiþtirilecek_deðer.deðer   ;
				
				
				
				break ;
				
				
			case "BOOL":
				yeni.tür = STRING ;
				
				if (   ( ( boolean ) deðiþtirilecek_deðer.deðer  ) == false ) yeni.deðer = "0" ;
				else yeni.deðer = "1" ;
				
				
				
				break;
				
				
			case STRING:
				yeni.tür = STRING ;
				yeni.deðer = deðiþtirilecek_deðer.deðer ;
				
				
				
				
				break;
			
			
			
			
			
			}
		
			
			
			
			
			break;
			
			
		case "Tamsayý":
			
			
			switch ( deðiþtirilecek_deðer.tür ) 
			{
			
			case TAMSAYI:		
				yeni.tür = TAMSAYI ;
				yeni.deðer = deðiþtirilecek_deðer.deðer  ;
				
				break;
				
				
			case NOKTALISAYI:
				
				yeni.tür = TAMSAYI ;
				yeni.deðer =   ( ( Double ) deðiþtirilecek_deðer.deðer ).intValue()  ;
				
				
				
				break ;
				
				
			case "BOOL":
				yeni.tür = TAMSAYI;
				
				if ( ( ( boolean ) deðiþtirilecek_deðer.deðer ) == false  ) 
					yeni.deðer = 0 ;
				else yeni.deðer = 1 ;
				
				
				
				break;
				
				
			case STRING:
				yeni.tür = TAMSAYI ;
				
				String deðer = ""+deðiþtirilecek_deðer.deðer ;
				//String tamamen rakam içeriyor mu bak...
				try 
				{
				yeni.deðer = Integer.parseInt ( ""+ deðiþtirilecek_deðer.deðer ) ;
				}
				catch ( Exception u )
				{ 
					
					System.out.println ( "Tür dönüþtürme hatasý ,Tür dönüþümü yaparken Karakter tipindeki deðer tamamen rakamlardan oluþmalýdýr..");
					Özellikler yen = new Özellikler ( )  ;
					yen.tür = "HATA" ;
					yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
					
					return yen ;
				}
				
				
				
				break;
			
			
			
			
			
			}
		
			
			
			
			
			
			
			break ;
			
			
			
		case "NoktalýSayý":
			
			switch ( deðiþtirilecek_deðer.tür ) 
			{
			
			case "TAMSAYI":		
				yeni.tür = NOKTALISAYI ;
				yeni.deðer = Double.parseDouble( ""+ deðiþtirilecek_deðer.deðer ) ;
				
			break	;
				
				
			case NOKTALISAYI:
				
				yeni.tür = NOKTALISAYI ;
				yeni.deðer = deðiþtirilecek_deðer.deðer ;
				
				
				
				break ;
				
				
			case "BOOL":
				yeni.tür = NOKTALISAYI ;
				
				if ( ( ( boolean) deðiþtirilecek_deðer.deðer ) == false  ) 
					yeni.deðer = 0.0 ;
				else yeni.deðer = 1.0 ;
				
				
				
				break;
				
				
			case STRING:
				yeni.tür = NOKTALISAYI ;
				try 
				{
				yeni.deðer =  Double.parseDouble( ""+deðiþtirilecek_deðer.deðer ) ;
				}
				catch ( Exception err ) 
				{
					System.out.println ( "Tür dönüþüm hatasý...Karakter türünü Noktalý sayýya dönüþtürülürken Karakter deðerinin tamamen rakam ve bir adet .  içerdiðine emin olun..." ) ;
					Özellikler yen = new Özellikler ( )  ;
					yen.tür = "HATA" ;
					yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
					
					return yen ;
					
				}
				
				
				
				break;
			
			
			
			
			
			}
		
			
			
			
			
			
			
			
			break; 
			
			
			
		case "Bool":
			switch ( deðiþtirilecek_deðer.tür ) 
			{
			
			case TAMSAYI:		
				yeni.tür = "BOOL" ;
				if ( ( (int  ) deðiþtirilecek_deðer.deðer  ) != 0 ) yeni.deðer = true ;
				else yeni.deðer = false  ;
				
				break ;
				
				
			case NOKTALISAYI:
				
				yeni.tür ="BOOL" ;
				if ( !( ( Double  ) deðiþtirilecek_deðer.deðer  ).equals  ( 0.0 ) ) yeni.deðer = true ;
				else yeni.deðer = false  ;
				
				
				
				break ;
				
				
			case "BOOL":
				yeni.tür = "BOOL";
			    yeni.deðer = deðiþtirilecek_deðer.deðer ;
				
				
				
				break;
				
				
			case STRING:
				yeni.tür = "BOOL" ;
				if (! ( (String  ) deðiþtirilecek_deðer.deðer  ) .equals("") ) yeni.deðer = true ;
				else yeni.deðer = false  ;				
				
				
				
				break;
			
			
			
			
			
			}
		
			
			
			
			
			
			break ;
		
		
		
		}
		
		
	return yeni ;
	
	}

	
	 public Object visitSinif_fonksiyon_deger(DilParser.Sinif_fonksiyon_degerContext ctx) { 
		 
		
		 
		 return visit(ctx.sinif_fonksiyon_cagirma()); 
		 
	 
	 }
		
	
	
	
	
	//Globalde tanýmlanan bütün sýnýflar bunun içine atýlacak...
	HashMap <String , DilParser.Sinif_tanimlanmasiContext> sýnýf_tanýmlarý = new HashMap<String, DilParser.Sinif_tanimlanmasiContext>() ;
	
	 public Object visitSinif_tanimlanmasi(DilParser.Sinif_tanimlanmasiContext ctx) { 
	
		 String sýnýf_ismi = ctx.degisken_ismi().getText ( ) ;
		 
		 this.sýnýf_tanýmlarý.put( sýnýf_ismi , ctx ) ;
		 
		 //Geri bir þey dönmeye gerek yok...
		 return new Özellikler ( "","" );
			 
	 }

	 

	 //En son global mi yoksa bir sýnýfýn fonksiyonu mu çaðrýldý
	 //elemanlara eriþirken önemli...
	 Stack<String> son_çaðrýlan_fonksiyon_türü = new Stack<String > ( ) ;
	 
	 Stack<HashMap> sýnýf_memory_stack = new Stack<HashMap> ( ) ;
	 
	 public Object visitSinif_fonksiyon_cagirmasi(DilParser.Sinif_fonksiyon_cagirmasiContext ctx) {
		 
	Özellikler deðiþken = ( Özellikler ) visit ( ctx.structure_eleman() ) ;
	if ( !deðiþken.tür.contains (  "SINIF-") )
	{
		System.out.println ( ctx.structure_eleman().getText ( ) + " bir Sýnýf türünden bir deðiþken deðildir..." ) ;
		Özellikler yeni = new Özellikler ( )  ;
		yeni.tür = "HATA" ;
		yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
		
		
	}
	//*System.out.println ( "Tür : " + deðiþken.tür ) ;
	
	String sýnýf_ismi = deðiþken.tür.substring(6) ;
	
	//*System.out.println ( "Sýnýf ismi : " + sýnýf_ismi ) ;
	
	
DilParser.Sinif_tanimlanmasiContext sýnýf_tanýmý = this.sýnýf_tanýmlarý.get( sýnýf_ismi ) ;
	

this.sýnýf_memory_stack.push ( (HashMap) deðiþken.deðer );
this.son_çaðrýlan_fonksiyon_türü.push( "SINIF" ) ;

DilParser.Fonksiyon_callContext fnc_contex = (DilParser.Fonksiyon_callContext) ctx.fonksiyon_cagirilmasi() ;

//Çaðrýlan fonksiyonun ismi alýyoruz...
String çaðrýlan_fonksiyon_ismi =fnc_contex.degisken_ismi().getText ( ) ;


DilParser.Sinif_fonksiyon_tanimiContext fnc_tanim = null ;
DilParser.Fonksiyon_tanimi_Context f_tanimi ;
boolean bulundu = false ;
//Sýnýf tanýmýnda tanýmlanmýþ fonksiyonlarý gezip içinde çaðrýlan fonksiyon var mý diye bakacaðýz...
for ( int  i = 0 ; i < sýnýf_tanýmý.sinif_fonksiyon_tanimi().size ( ) ; i ++ ) 

{
	fnc_tanim = sýnýf_tanýmý.sinif_fonksiyon_tanimi( i ) ;
	f_tanimi = (DilParser.Fonksiyon_tanimi_Context) fnc_tanim.fonksiyon_tanimi() ;
if ( çaðrýlan_fonksiyon_ismi.equals ( f_tanimi.degisken_ismi().getText() ) ) { bulundu = true ; break ; }

	
	
	
	
	
	
}


//Eðer çaðrýlan sýnýfýn bir fonksiyonu deðilse hata ver...
if ( bulundu==false )
{
	System.out.println ( çaðrýlan_fonksiyon_ismi + " " + sýnýf_ismi + " türüne ait bir fonksiyon deðildir..." ) ;
	Özellikler yeni = new Özellikler ( )  ;
	yeni.tür = "HATA" ;
	yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
	
	return yeni ;
}

DilParser.Fonksiyon_callContext fonksiyon = (DilParser.Fonksiyon_callContext) ctx.fonksiyon_cagirilmasi() ;



//DEvam 


String fonksiyon_ismi = fonksiyon.degisken_ismi().getText ( ) ;
		
ArrayList geçilen_parametreler = new ArrayList () ;

if ( fonksiyon.ifadeler().isEmpty() == false )
{

//Geçilen parametreleri sonra kullanmak için array ekliyoruz...
for ( int b = 0 ; b < fonksiyon.ifadeler().size() ; b++ )
geçilen_parametreler.add(  visit ( fonksiyon.ifadeler( b ) ) ) ;
}
//System.out.println ( "parametreler" ) ;
//System.out.println ( geçilen_parametreler ) ;

DilParser.Fonksiyon_tanimi_Context çaðrýlan_fonksiyon = (DilParser.Fonksiyon_tanimi_Context) fnc_tanim.fonksiyon_tanimi();



HashMap<String , Özellikler > yeni_fonksiyonun_memorisi = new HashMap <String , Özellikler > (  ) ;

FunctionTable yeni_fonksiyon_tablosu = new FunctionTable ( )  ;
yeni_fonksiyon_tablosu.lokal_deðiþken_memory = yeni_fonksiyonun_memorisi ;
yeni_fonksiyon_tablosu.previous_function_table = this.fonksiyon_stack.peek() ;
yeni_fonksiyon_tablosu.number = fonksiyon_stack.peek() .number + 1 ;
this.fonksiyon_stack.push( yeni_fonksiyon_tablosu ) ;

ArrayList<Özellikler> yeni_oluþturulan_deðiþkenler ;

//yeni fonksiyonda deðiþkenler oluþturuluyor...
for ( int j = 0 ; j < çaðrýlan_fonksiyon.fonksiyon_parametreleri().size ( ) ; j ++  )
{visit (  çaðrýlan_fonksiyon.fonksiyon_parametreleri( j ) ) ;
}

yeni_oluþturulan_deðiþkenler = new ArrayList<Özellikler> ( yeni_fonksiyonun_memorisi.values() ) ;
//System.out.println ( "Yeni oluþturulan deðiþkenler\n" + yeni_oluþturulan_deðiþkenler ) ;

//Hiç parametre geçilmese bile  , parametrelerin geçerli deðerleri ouþturulurken otomatik ayarlanacak
//Eðer kullanýcý isterse kendi deðerini default olarak atayabilir..
//Soldan saða doðru kontrol edilecek...

//Parametre sayýsý  az olabilir...

Özellikler sol_taraf , sað_taraf  , tempo ;
for ( int n = 0 ; n < geçilen_parametreler.size() ; n++ ) 
{
Özellikler geçilen_par = (Özellikler) geçilen_parametreler.get( n ) ; 
Özellikler para = yeni_oluþturulan_deðiþkenler .get( n ) ;

//System.out.println ( "Geçirilen parametre : " + geçilen_par ) ;
//System.out.println ( "Parametre deðiþkeni : " + para ) ; 
sað_taraf = geçilen_par ;
sol_taraf  = para;

tempo = sað_taraf ;

if ( sað_taraf.tür.equals( "ARRAY") ) 
{
//System.out.println ( "Array objesi eþitleme "  ) ;

	
	
	//Eðer array varsa bir tek bunun kopyasý oluþturulacak...
	
tempo = new Özellikler ( ) ;
tempo.tür = sað_taraf.tür ;

ObjectOutputStream object_output = null ;
ByteArrayOutputStream output = new ByteArrayOutputStream() ;
try {
	 object_output = new ObjectOutputStream( output ) ;
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//System.out.println ( "Sað taraf : " + sað_taraf ) ;

try {
	object_output.writeObject( sað_taraf );
} catch (IOException e1) {
	// TODO Auto-generated catch block
	System.out.println ( "Dosya yazma error " ) ;
	Özellikler yeni = new Özellikler ( )  ;
	yeni.tür = "HATA" ;
	yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
	
	return yeni ;
}


ObjectInputStream object_input = null ;
ByteArrayInputStream input = new ByteArrayInputStream( output.toByteArray() ) ;
try {
	 object_input = new ObjectInputStream ( input ) ;
} catch (IOException e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();

System.out.println ( "Dosya yazma error " ) ;
Özellikler yeni = new Özellikler ( )  ;
yeni.tür = "HATA" ;
yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 

return yeni ;
}


Özellikler copied = null ;

try {
	copied = (Özellikler) object_input.readObject( ) ;
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//	System.out.println ( "Clonlana array : " + cloned ) ;
//	System.out.println ( "Orjinal array : " + sað_taraf.deðer ) ;
tempo.deðer = copied.deðer ;


}

//Sað taraf array hariçse aynen kalacak...
sað_taraf = tempo ;

//Burada Referans ve Dinamik veri türlerine dikkat edilecek....
//Bu henüz o indekse deðer atýlmamýþ array elemanlarýnda YOK türünde bir Özellikler geri dönülüyor...
if ( sol_taraf.tür.equals( "YOK" ) )
{
	sol_taraf.tür = sað_taraf.tür ;
	sol_taraf.deðer = sað_taraf.deðer ;
	
}
else if ( sol_taraf.tür.equals("DÝNAMÝK") )
{
	
	((Özellikler)sol_taraf.deðer).deðer = sað_taraf.deðer ;
	((Özellikler)sol_taraf.deðer).tür  = sað_taraf.tür ;
	this.array_elamanýna_deðer_atama = false ;
	//sadece boþ bir nesne dönüyoruz...
	
	this.dinamik_deðiþkeni_durumu = REFER_ETTÝÐÝ ;
	return new Özellikler ( ) ;
	
}
else if ( sol_taraf.tür.equals( "REFERANS" ) ) 
{//System.out.println ( "Ref" );
	//Referab

	
	//System.out.println ( "Sol taraf : " + sol_taraf )  ;
//Bu durumda kontrol edilmesine gerek yok çünkü referansýn ilk bir deðeri yok ...	
	(( Özellikler)sol_taraf).deðer = sað_taraf ;
 	//sadece boþ bir nesne dönüyoruz...
	
	
	
	Özellikler ret ;
	for ( int j = 0 ; j < çaðrýlan_fonksiyon.fonksiyon_bildirimleri().size() ; j++ )
	{
		
	ret = ( Özellikler )	visit ( çaðrýlan_fonksiyon.fonksiyon_bildirimleri( j ) ) ;
		
		
		
	}
	
	
	
	
	//Fonksiyonun kaydýný siliyoruz...
	this.fonksiyon_stack.pop() ;
	
	
return new Özellikler ( ) ;	
	
	
	
}
else 
if ( !sol_taraf.tür.equals( sað_taraf.tür ) )
{
	System.out.println ( "Atama hatasý : "+  " deðiþkeninin türü" + sol_taraf.tür + " atanan deðerin türü : " + sað_taraf.tür );
	Özellikler yeni = new Özellikler ( )  ;
	yeni.tür = "HATA" ;
	yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
	
	return yeni ;
}

//atama yapýlýyor..
sol_taraf.deðer = sað_taraf.deðer ;
//	System.out.println ( "Atanan sað taraf deðeri : " + sol_taraf.deðer ) ;













}
//dfgdfgdfg
//Geri dönüþ deðerleri önemli...


Özellikler ret = null ;
for ( int j = 0 ; j < çaðrýlan_fonksiyon.fonksiyon_bildirimleri().size() ; j++ )
{

ret = ( Özellikler )	visit ( çaðrýlan_fonksiyon.fonksiyon_bildirimleri( j ) ) ;

//Bir return deyimi gelirse 
if ( ret != null )
if ( ret.tür != null )
//Fonksiyonda da throw edilebilir .....Direk geri döneceðiz...
if ( ret.tür.equals ( "HATA" ) ) return ret ;
else	if ( ret.tür.equals( "RETURN" ) ) break;


}




//Fonksiyonun kaydýný siliyoruz...
this.fonksiyon_stack.pop() ;
this.sýnýf_memory_stack.pop ( );
this.son_çaðrýlan_fonksiyon_türü.pop ( );
if ( ret != null )
if ( ret.tür != null )
{
if ( ret.tür != null )
{
	if ( ret.tür.equals( "RETURN" ) )
		return ret.deðer ;
	
	
	
}


}

return new Özellikler ( ) ;	


//Sýnýf fonksiyon çaðýrma son..........




























//Ret te hata nesnesi olabilir 
//Pop yapmayý unutma

	
	
	 
	 }
		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public Object visitYeni_sinif(DilParser.Yeni_sinifContext ctx) { return visit(ctx.yeni_sinif_objesi()); }

	 
	 
	 
	 
	 
	 
	 
	 
	 
Stack<String> sýnýf_eriþim_stack = new Stack <String > ( ) ;

	 





	 
	//Sýnýf elemanlarý oluþturulacak burada...
	 public Object visitSinif_eleman_olusturma(DilParser.Sinif_eleman_olusturmaContext ctx) { 
		 String eriþim_anahtarý = ctx.ulasim_anahtarlari().getText() ;
sýnýf_eriþim_stack.push( eriþim_anahtarý ) ;
Özellikler yeni = (Özellikler) visit ( ctx.grup_degiskeni() ) ;
sýnýf_eriþim_stack.pop ( ) ;

//this.deðiþken_getir( "" ) ;


if ( eriþim_anahtarý.equals( "özel" ) )
	yeni.eriþim_biçimi = "ÖZEL" ;
else yeni.eriþim_biçimi = "GENEL" ;



return new Özellikler ("","" ) ;

		
	 }
		
	 
	 
	 
	
	 public Object visitSinif_elema_olusturma(DilParser.Sinif_elema_olusturmaContext ctx) { 
		 
	
		 DilParser.Fonksiyon_callContext çaðrýlacak_fonksiyon = (DilParser.Fonksiyon_callContext) ctx.fonksiyon_cagirilmasi() ;
		 DilParser.Sinif_tanimlanmasiContext oluþturulacak_sýnýf = null ;
		 String sýnýf_türü = çaðrýlacak_fonksiyon.degisken_ismi().getText ( ) ;
		 if  ( this.sýnýf_tanýmlarý.containsKey( sýnýf_türü ) ) 
		 {
			 oluþturulacak_sýnýf = this.sýnýf_tanýmlarý.get(  sýnýf_türü  ) ;
		 }
		 
		 else
		 {
			 System.out.println ( "Daha önce " + sýnýf_türü + " türünde bir Sýnýf tanýmlanmamýþ..." ) ;
			 Özellikler yeni = new Özellikler ( )  ;
				yeni.tür = "HATA" ;
				yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
		 }
		 
		 
		 HashMap <String , Özellikler > class_memory = new HashMap<String, Özellikler>() ;
		 
		
			
		//Sýnýfýn tanýmlý deðiþkenlerini oluþturuyoruz...	
		 this.ekleme_yapýlcak_structure_ismi.push ( class_memory ) ;
			
			for ( int a = 0 ; a < oluþturulacak_sýnýf.sinif_degisken_tanimi().size() ; a++ )
			{
				
				visit ( oluþturulacak_sýnýf.sinif_degisken_tanimi( a ) ) ;
				
				
				
			}
			//Stacký eski haline getiriyoruz..
			this.ekleme_yapýlcak_structure_ismi.pop ( ) ;
		 
		 //Constructor çaðrýlacak....
		 
		 
		 
		 
		 
		 
		 
		 
		 Özellikler yeni = new Özellikler ( )  ;
		 yeni.tür ="SINIF-" + sýnýf_türü ;
		 yeni.deðer = class_memory ;
		 return yeni ;
		 
		 
	 
	 
	 }
		
	
	
	public Object visitKolay_artis(DilParser.Kolay_artisContext ctx) { return visit(ctx.basit_artis()); }
	
	
	
	
	
	public Object visitBasit_bir_artirma(DilParser.Basit_bir_artirmaContext ctx) { 
	
		//Referans ve Dinamik deðiþkenlerde de problem olmaz...Çünkü direk refer edilen 
//Deðiþken gelecek
		
		//Deðiþkeni alýyoruz...
		Özellikler deðiþken = ( Özellikler ) visit ( ctx.sol_taraf_degiskenleri() );
		if ( deðiþken.tür.equals( TAMSAYI ) )
		{
			deðiþken.deðer = ( int ) deðiþken.deðer + 1 ;
			
			
		}
		else if ( deðiþken.tür.equals ( NOKTALISAYI ) ) 
		{
			deðiþken.deðer = ( float )deðiþken.deðer + 1.0 ;
			
		}
		
		
		return deðiþken ;
		
	}
	
	
	//Program içinde hiç yakalanmamýþ hatalar olabilir , yada user sonuç deðip geri dönmeye kalkabilir bunlarý
	//hata olarak gösteriyoruz...
	public Object visitProgram(DilParser.ProgramContext ctx) { 
		Özellikler ret = null 
				;
		for ( int k = 0 ; k < ctx.bildirimler().size ( ) ; k++ )
		{
			
			ret = (Özellikler) visit ( ctx.bildirimler( k ) );
			if ( ret != null )
				if( ret.tür != null )
					if ( ret.tür.equals( "HATA" ) )
					{
						if ( ret.deðer != null )
						{
							if (  ((Özellikler)ret.deðer ).tür.equals ( "KAPATMA") )
							{
								return null;
								
								
							}
							
						}
						
						
						System.out.println ( "Yakalanmamýþ Hata Nesnesi Hatasý...." );
						Özellikler yeni = new Özellikler ( )  ;
						yeni.tür = "HATA" ;
						yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
						
						return yeni ;
					}
					else if ( ret.tür.equals ( " " ) )
					{
						
						System.out.println ( "Lütfen sonuç komutunu fonksiyonalarýn içinde kullanýn..." ) ;
						Özellikler yeni = new Özellikler ( )  ;
						yeni.tür = "HATA" ;
						yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
						
						return yeni ;
						
					}
			
		}
		
		
		return visitChildren(ctx); 
		
	
	}
	
	
	
	
	
	 public Object visitTry_catch_yapisi(DilParser.Try_catch_yapisiContext ctx) {
		 
		 Özellikler ret = null  ;
		 try {
		 for ( int a = 0 ; a < ctx.bildirimler().size ( ) ; a++ )
		 {
			 
			 ret =  ( Özellikler ) visit ( ctx.bildirimler( a )  ) ;
			
			 //Return break ve devam normal geri döndürülecek...
			 if ( ret != null )
					if ( ret.tür != null )
						if ( ret.tür.equals( "HATA" ) ) { throw new Goto ( "Hata" ) ; }
					else if ( ret.tür.equals ( "RETURN" ) ) { return ret  ; }
						else if ( ret.tür.equals( "BREAK" ) ) return ret ;
						else if ( ret.tür.equals( "DEVAM" ) )  { return ret ; }
						
			 
			 
			 
			 
		 }
		 }
		 catch ( Goto x )
		 {
			 if ( x.hata.equals( "Hata" ) ) 
			 {//System.out.println ( "Hata nesnesi geldi.." );
				 
			 //Hata nesnesin kendisi
				 Özellikler deðiþken = ret ;
				 
				 
				DilParser.Catch_yapisiContext catch_yapýsý = null ;
				
				boolean bulundu = false ;
				for  (int b = 0 ; b < ctx.catch_yapisi().size() ; b++ )
				{
					catch_yapýsý = ctx.catch_yapisi( b ) ;
					
					DilParser.Degisken_tanimlaContext var  =  null ;
					
					 var =  ( DilParser.Degisken_tanimlaContext )catch_yapýsý.degisken_tanimi() ;
					 
					String tür = "" 
							;
					if ( var.degisken_turu ().getText ( ).equals( "Karakter" ) ) 
							tür = "STRING" ;
					else tür = var.degisken_turu().getText().toUpperCase() ;
					
					 //System.out.println (tür   + " tür in hata : " + ret.deðer );
					if ( tür. equals(  ( (Özellikler) deðiþken.deðer ).tür ) )
					{
						Özellikler deð = null ;
						
						DilParser.Degisken_tanimlaContext deðiþken_durum = (DilParser.Degisken_tanimlaContext) catch_yapýsý.degisken_tanimi() ;
						visit ( catch_yapýsý.degisken_tanimi() );
					String var_isim =	deðiþken_durum.getChild( 1 ) .getText();
					deð =	(Özellikler) this.deðiþken_getir( var_isim );
						
						//System.out.println ( "Var isim : " + var_isim ) ;
						//System.out.println ( "hata nesnesi : " + deðiþken) ;
					//	System.out.println ( "oluþturulan : " + deð ) ;
						deð.deðer = ((Özellikler)deðiþken.deðer).deðer ;
						
						 for ( int a = 0 ; a < catch_yapýsý.bildirimler().size ( ) ; a++ )
						 {
							 
							 ret =  ( Özellikler ) visit ( catch_yapýsý.bildirimler( a )  ) ;
							
							 //Return break ve devam normal geri döndürülecek...
							 if ( ret != null )
									if ( ret.tür != null )
										if ( ret.tür.equals( "HATA" ) ) { return ret  ; }
									else if ( ret.tür.equals ( "RETURN" ) ) { return ret  ; }
										else if ( ret.tür.equals( "BREAK" ) ) return ret ;
										else if ( ret.tür.equals( "DEVAM" ) )  { return ret ; }
										
							 
							 
							 
							 
						 }
						
						
						
						bulundu = true ;
						
						
					}
					
					
					
					
				}
				 
				 
				 
				 //eðer hiçbir catch yapýsý yoksa kendisi bunu bir üst seviyede gönderecek...
				 
				if ( bulundu == false ) return deðiþken ;
				 
				 
				 
				 
				 
				 
				 
			 }
			 			 
			 
			 
		 }
		 
		 
		 return new Özellikler ( ) ;
	 }

	
	public Object visitHata_at(DilParser.Hata_atContext ctx) { 
		
		
		Özellikler yeni = new Özellikler ( )  ;
		yeni.tür = "HATA" ;
		yeni.deðer = visit ( ctx.ifadeler() ) ; 
		
		return yeni ;
	
	}

	
	
	
	
	
	
	public Object visitFor_dongu(DilParser.For_donguContext ctx) { 
	
	String döngü_deðiþkeni = ctx.degisken_ismi().getText ( ) ; 
	
	HashMap < String , Özellikler > mem =  ( ( FunctionTable  ) this.fonksiyon_stack.peek() ).lokal_deðiþken_memory ; 
	
	Özellikler deðiþken = ( Özellikler )  visit ( ctx.ifadeler() )  ;
	
	if ( mem.containsKey( döngü_deðiþkeni ) ) 
	{
	System.out.println ( "Döngü deðiþkeni adýyla ayný isimli bir deðiþken daha önce tanýmlanmýþ..."  ) ;
	System . exit ( 0 ) ;
	}
	
	
	mem.put( döngü_deðiþkeni  ,  deðiþken ) ;
	
	
	Özellikler ret = null ;
	
	Özellikler deger = null  ;
	if ( this.döngü_stack.empty())
		this.döngü_stack.push ( 0 ) ;
	else
	this.döngü_stack.push ( (int)döngü_stack.peek() +1  ) ;
	
	do 
	{
	
		try {
		

Özellikler dogruluk = ( Özellikler ) visit ( ctx.mantik_ifadeleri() ) ;
		
	
if ( (boolean ) dogruluk.deðer == true )
{
	
	
}
else break ;	
	
		
	for ( int a = 0 ; a < ctx.bildirimler().size ( ) ; a ++ )
		
	{
		
		ret = ( Özellikler ) visit ( ctx.bildirimler( a )  );
		//Sadece fonksiyonlar ret.deðeri döndürecek onun dýþýndakiler return objesini olduðu gibi geri döndürecek...
		if ( ret != null )
		if ( ret.tür != null )
			if  ( ret.tür.equals( "HATA"  )  ){this.döngü_stack.pop ( )  ; return ret ;  }
		else if ( ret.tür.equals ( "RETURN" ) ){ this.döngü_stack.pop () ; return ret   ; }
			else if ( ret.tür.equals( "BREAK" ) ) throw new Goto ( "BREAK" ) ;
			else if ( ret.tür.equals( "DEVAM" ) )  {if ( ctx.for_dongu_degisim()!=null ){visit ( ctx.for_dongu_degisim() ); } throw new Goto ( "DEVAM" ) ; }
		
		
		
		
		}
	
	
	
	
	
	}
	
	catch ( Goto x )
	{
		if ( x.hata.equals( "BREAK" ) ) break ;
		//Ayný sonuçta continue edecek onun için tekrar çaðýrýyoruz bir sonraki sonuç için...
		
		else if ( x.hata.equals( "DEVAM" ) ) {    continue ; }  
		
		
	}
	
	
	
	
	
	
	
	
	
	if ( ctx.for_dongu_degisim() != null )
	
	{
		
		
	//döngü deðiþkenin deðiþmesi için....
visit ( ctx.for_dongu_degisim() ) ;
	
	
		
	}
	
	
	
	}
	while ( true ) ;
	
	
	
	mem.remove( döngü_deðiþkeni ) ;
	
	this.döngü_stack.pop() ;
	
	
	
	
		return new Özellikler ("" , ""  ) ; 
		
	}
	
	
	
	
	
	
	public Object visitTur_fonksiyon(DilParser.Tur_fonksiyonContext ctx) { return visit(ctx.tur_fonksiyonu()); }
	
	
	
	public Object visitTuru_ne(DilParser.Turu_neContext ctx) { 
	
		
		//tür ifadesinde deðiþkenin kendi türü önemli
		
		Özellikler yeni = new Özellikler ( ) ;
		//Tüm tür bilgisi string deðiþkeniyle oluþturulacak...
		yeni.tür = STRING ;
		
		
		this.dinamik_deðiþkeni_durumu = KENDÝSÝ ;
		this.referans_deðiþkeni_durumu = KENDÝSÝ ;
		
		Özellikler ifade = ( Özellikler ) visit ( ctx.ifadeler() )  ;
		
		this.dinamik_deðiþkeni_durumu = REFER_ETTÝÐÝ ;
		this.referans_deðiþkeni_durumu = REFER_ETTÝÐÝ ;
		yeni.deðer = ifade.tür ;
		
		
		
		return yeni ;
		
	
	}

	
	
	
	//Deðiþkenlerin tuttuðu deðerlerin uzunluðunu veriyor arrayin boyutu stringin uzunluðu vb...
	 public Object visitLen_fonksiyonu(DilParser.Len_fonksiyonuContext ctx) { 
		Özellikler yeni  = new Özellikler ( ) ;
		//Bir tamsayý geri döndüreceðiz... 
		yeni.tür = TAMSAYI ;
		 
		
		int boyut = 0 ;
		Özellikler nesne = ( Özellikler ) visit ( ctx.ifadeler ( ) ) ;
		 switch ( nesne.tür )
		 {
		 case ARRAY:
		
			 boyut = ( ( HashMap ) nesne.deðer ).size() ;
			 break ;
			 
		 case STRING:
			 boyut = ( ( String ) nesne.deðer ) .length() ;
			 break ;
			 
		 case TAMSAYI:
			
			 boyut = Integer.SIZE ;
			 break ;
		 case NOKTALISAYI:
			 boyut = Double.SIZE ;
			 break ;
			 
		 case "BOOL":
			 boyut = 1;
			 
			 
			 break ;
		 
		 
		 
		 
		 }
		 
		 
		yeni.deðer = boyut ;
		
		return yeni ;
	 
	 }
		
	
	
	
	
	
	public Object visitBreak_komutu(DilParser.Break_komutuContext ctx) { 
		
		Özellikler yeni = new Özellikler ( ) ;
		yeni.tür  = "BREAK" ;
		yeni.deðer = "" ;
		
		return yeni ;
		
		
	
	}
	
	public Object visitContinue_komut(DilParser.Continue_komutContext ctx) { 
		
		

		Özellikler yeni = new Özellikler ( ) ;
		yeni.tür  = "DEVAM" ;
		yeni.deðer = "" ;
		
		return yeni ;
		
	
	
	}
	
	
	
	/*
	 * Return yapýlýrken fonksiyon stack ý temizlemeyi unutma ....
	*/
	 public Object visitReturn_komutu(DilParser.Return_komutuContext ctx) { 
	
		 Özellikler yeni = new Özellikler ( ) ;
		 yeni.tür = "RETURN" ;
		 Özellikler geri_dönülecek = ( Özellikler ) visit ( ctx.ifadeler() ) ;
		 yeni.deðer = geri_dönülecek;
		 
		 return yeni ;
		 
		 
	 }
		
	
	public Object visitMatematik_fonksiyon_kaydi(DilParser.Matematik_fonksiyon_kaydiContext ctx) {
	
		String fonksiyonun_ismi  = ctx.degisken_ismi( 0 ).getText ( ) ;
		if ( this.tanýmlanmýþ_fonksiyonlar.containsKey( fonksiyonun_ismi ) || this.matematik_fonksiyonlarý.containsKey( fonksiyonun_ismi ) )
			{
		System.out.println(fonksiyonun_ismi + " fonksiyonu daha önce tanýmlanmýþ bir fonksiyon..." );
		Özellikler yeni = new Özellikler ( )  ;
		yeni.tür = "HATA" ;
		yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
			
		}
		
		this.matematik_fonksiyonlarý.put( fonksiyonun_ismi , ctx ) ;
		
		
	
		return new Özellikler ( ) ;
	
	}
	
	
	public Object visitFonk_cagri(DilParser.Fonk_cagriContext ctx) { return visit(ctx.fonksiyon_cagirilmasi()); }
	
	
	
	
	public Object visitMod_islemi(DilParser.Mod_islemiContext ctx) {
		
		Özellikler ilk_ifade = ( Özellikler ) visit ( ctx.ifadeler( 0 ) ) ;
		Özellikler ikinci_ifade = ( Özellikler ) visit ( ctx.ifadeler ( 1 ) ) ;
		
		Özellikler yeni = new Özellikler ( ) ;
		
		if ( ilk_ifade.tür.equals( STRING ) || ikinci_ifade.tür.equals( STRING  ) ) 
		{
			System.out.println ( "Stringler mod alma iþleciyle kullanýlamazlar..." );
			Özellikler yen = new Özellikler ( )  ;
			yen.tür = "HATA" ;
			yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yen ;
			
			
		}
		
		else if ( ilk_ifade.tür.equals( NOKTALISAYI ) || ikinci_ifade.tür.equals( NOKTALISAYI ) ) 
		{
			
			
			double ilk_sayý =  ilk_ifade.tür.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf( ilk_ifade.deðer ) ) : (Double)ilk_ifade.deðer  ;
			double ikinci_sayý = ikinci_ifade.tür.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf ( ikinci_ifade.deðer ) ) : ( Double ) ikinci_ifade.deðer ;
			
			
			yeni.tür = NOKTALISAYI ;
			yeni.deðer =ilk_sayý % ikinci_sayý ;
			
	
			
		}
		else
		{
			Double ilk_sayý =  ilk_ifade.tür.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf( ilk_ifade.deðer ) ) : (Double)ilk_ifade.deðer  ;
			Double ikinci_sayý = ikinci_ifade.tür.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf ( ikinci_ifade.deðer ) ) : ( Double ) ikinci_ifade.deðer ;
			
			Double res = ilk_sayý % ikinci_sayý ;
			yeni.tür = TAMSAYI ;
			yeni.deðer =  res.intValue()  ;
			 
	
			
		}
		
		
		return yeni ;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public Object visitFonksiyon_call(DilParser.Fonksiyon_callContext ctx) { 
					
		String fonksiyon_ismi = ctx.degisken_ismi().getText ( ) ;
				
		if ( this.tanýmlanmýþ_fonksiyonlar.containsKey( fonksiyon_ismi ) || this.matematik_fonksiyonlarý.containsKey( fonksiyon_ismi ) )
		{
			
			if ( this.matematik_fonksiyonlarý.containsKey( fonksiyon_ismi ) ) 
			{
				FunctionTable yeni_kayýt = new FunctionTable ( ) ;
				 HashMap <String , Özellikler> yeni_map = new HashMap <String , Özellikler > ()  ;
				 yeni_kayýt.number = this.fonksiyon_stack.peek().number + 1 ;
				 yeni_kayýt.lokal_deðiþken_memory = yeni_map ;
				 yeni_kayýt.previous_function_table = fonksiyon_stack.peek() ;
				 DilParser.Matematik_fonksiyon_kaydiContext mat_fonksiyonu = this.matematik_fonksiyonlarý.get( fonksiyon_ismi ) ;
				 
				
				 //Bir tanesi fonksiyon ismi geri kalan parametre sayýsý...
				 int fonksiyon_parametre_sayýsý = mat_fonksiyonu.degisken_ismi().size() -1 ;
				int geçilen_parametre_sayýsý = ctx.ifadeler().size ( ) ;
				
				if ( fonksiyon_parametre_sayýsý != geçilen_parametre_sayýsý )
				{
					System.out.println ( "Matematik fonksiyonuna geçilen parametre sayýsý ile fonksiyonun parametre sayýlarý farklý..." ) ;
					Özellikler yeni = new Özellikler ( )  ;
					yeni.tür = "HATA" ;
					yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
					
					return yeni ;
				}
				
				ArrayList parametreler = new ArrayList ( ) ;
				//Geçilen parametreler alýnýyor....
				for ( int jj = 0 ; jj < fonksiyon_parametre_sayýsý ; jj++ )
				{
					parametreler.add(  visit ( ctx.ifadeler ( jj ) ) ) ;	
				}
				this.fonksiyon_stack.push( yeni_kayýt ) ;
				
				//yeni fonksiyon kaydýnda map i oluþturduk parametrelerin isimleriyle yeni map atýyoruz...
				
				
				for ( int a = 0 ; a < fonksiyon_parametre_sayýsý ; a++ )
				{
					//Bir fazlasý çünkü ilki fonksiyonun ismi
		//	System.out.println (mat_fonksiyonu.degisken_ismi( a + 1 ).getText () +  " - "  + (Özellikler)parametreler.get( a   )  + "olarak eklendi..."  ) ;
					yeni_map.put( mat_fonksiyonu.degisken_ismi( a + 1 ).getText ()  , (Özellikler)parametreler.get( a   ) ) ;
					
					
				}
				
				//en sonda matematik fonksiyonunun deðerini geri döndürüyoruz...
				Özellikler ret = (Özellikler) visit ( mat_fonksiyonu.ifadeler() ) ;
				this.fonksiyon_stack.pop ( ) ;
				return ret  ;
				
				
				
				
			}
			else 
			{
				//Devam edecek buradan normal fonksiyon çaðrýlmýþ:..
			}
			
			
			
		}
		else
		{
			System.out.println ( fonksiyon_ismi + " adýyla daha önce bir fonksiyon tanýmlanmamýþ" ) ;
			Özellikler yeni = new Özellikler ( )  ;
			yeni.tür = "HATA" ;
			yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
		}
		
		
		
		
	ArrayList geçilen_parametreler = new ArrayList () ;
	
	if ( ctx.ifadeler().isEmpty() == false )
	{
	
		//Geçilen parametreleri sonra kullanmak için array ekliyoruz...
		for ( int b = 0 ; b < ctx.ifadeler().size() ; b++ )
		geçilen_parametreler.add(  visit ( ctx.ifadeler( b ) ) ) ;
	}
	//System.out.println ( "parametreler" ) ;
	//System.out.println ( geçilen_parametreler ) ;
	
	DilParser.Fonksiyon_tanimi_Context çaðrýlan_fonksiyon = null;
	
	if ( this.tanýmlanmýþ_fonksiyonlar.containsKey( fonksiyon_ismi ) )
	{
	
	çaðrýlan_fonksiyon  = this.tanýmlanmýþ_fonksiyonlar.get( fonksiyon_ismi    ) ;
	
	}
	else
	{
		System.out.println ( fonksiyon_ismi + " adýnda bir fonksiyon tanýmlanmamýþ..."   ) ;
		;
		Özellikler yeni = new Özellikler ( )  ;
		yeni.tür = "HATA" ;
		yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
		
	}
	
	
	HashMap<String , Özellikler > yeni_fonksiyonun_memorisi = new HashMap <String , Özellikler > (  ) ;
 
	FunctionTable yeni_fonksiyon_tablosu = new FunctionTable ( )  ;
	yeni_fonksiyon_tablosu.lokal_deðiþken_memory = yeni_fonksiyonun_memorisi ;
	yeni_fonksiyon_tablosu.previous_function_table = this.fonksiyon_stack.peek() ;
	yeni_fonksiyon_tablosu.number = fonksiyon_stack.peek() .number + 1 ;
	this.fonksiyon_stack.push( yeni_fonksiyon_tablosu ) ;
	
	ArrayList<Özellikler> yeni_oluþturulan_deðiþkenler ;
	
	//yeni fonksiyonda deðiþkenler oluþturuluyor...
	for ( int j = 0 ; j < çaðrýlan_fonksiyon.fonksiyon_parametreleri().size ( ) ; j ++  )
	{visit (  çaðrýlan_fonksiyon.fonksiyon_parametreleri( j ) ) ;
	}
	
	yeni_oluþturulan_deðiþkenler = new ArrayList<Özellikler> ( yeni_fonksiyonun_memorisi.values() ) ;
	//System.out.println ( "Yeni oluþturulan deðiþkenler\n" + yeni_oluþturulan_deðiþkenler ) ;
	
	//Hiç parametre geçilmese bile  , parametrelerin geçerli deðerleri ouþturulurken otomatik ayarlanacak
	//Eðer kullanýcý isterse kendi deðerini default olarak atayabilir..
	//Soldan saða doðru kontrol edilecek...
	
	//Parametre sayýsý  az olabilir...
	
	Özellikler sol_taraf , sað_taraf  , tempo ;
	for ( int n = 0 ; n < geçilen_parametreler.size() ; n++ ) 
	{
		Özellikler geçilen_par = (Özellikler) geçilen_parametreler.get( n ) ; 
		Özellikler para = yeni_oluþturulan_deðiþkenler .get( n ) ;
		
		//System.out.println ( "Geçirilen parametre : " + geçilen_par ) ;
		//System.out.println ( "Parametre deðiþkeni : " + para ) ; 
sað_taraf = geçilen_par ;
sol_taraf  = para;
	
		tempo = sað_taraf ;

		if ( sað_taraf.tür.equals( "ARRAY") ) 
		{
		//System.out.println ( "Array objesi eþitleme "  ) ;
		
			
			
			//Eðer array varsa bir tek bunun kopyasý oluþturulacak...
			
	   tempo = new Özellikler ( ) ;
	   tempo.tür = sað_taraf.tür ;
	   
		ObjectOutputStream object_output = null ;
		ByteArrayOutputStream output = new ByteArrayOutputStream() ;
		try {
			 object_output = new ObjectOutputStream( output ) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//System.out.println ( "Sað taraf : " + sað_taraf ) ;

		try {
			object_output.writeObject( sað_taraf );
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println ( "Dosya yazma error " ) ;
			Özellikler yeni = new Özellikler ( )  ;
			yeni.tür = "HATA" ;
			yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
		}


		ObjectInputStream object_input = null ;
		ByteArrayInputStream input = new ByteArrayInputStream( output.toByteArray() ) ;
		try {
			 object_input = new ObjectInputStream ( input ) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
	
		System.out.println ( "Dosya yazma error " ) ;
		Özellikler yeni = new Özellikler ( )  ;
		yeni.tür = "HATA" ;
		yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
		}


		Özellikler copied = null ;

		try {
			copied = (Özellikler) object_input.readObject( ) ;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	System.out.println ( "Clonlana array : " + cloned ) ;
	//	System.out.println ( "Orjinal array : " + sað_taraf.deðer ) ;
		tempo.deðer = copied.deðer ;
		
		
		}
		
		//Sað taraf array hariçse aynen kalacak...
		sað_taraf = tempo ;
		
		//Burada Referans ve Dinamik veri türlerine dikkat edilecek....
	    //Bu henüz o indekse deðer atýlmamýþ array elemanlarýnda YOK türünde bir Özellikler geri dönülüyor...
		if ( sol_taraf.tür.equals( "YOK" ) )
		{
			sol_taraf.tür = sað_taraf.tür ;
			sol_taraf.deðer = sað_taraf.deðer ;
			
		}
		else if ( sol_taraf.tür.equals("DÝNAMÝK") )
		{
			
			((Özellikler)sol_taraf.deðer).deðer = sað_taraf.deðer ;
			((Özellikler)sol_taraf.deðer).tür  = sað_taraf.tür ;
			this.array_elamanýna_deðer_atama = false ;
			//sadece boþ bir nesne dönüyoruz...
			
			this.dinamik_deðiþkeni_durumu = REFER_ETTÝÐÝ ;
			return new Özellikler ( ) ;
			
		}
		else if ( sol_taraf.tür.equals( "REFERANS" ) ) 
		{//System.out.println ( "Ref" );
			//Referab
		
			
	//		System.out.println ( "Sol taraf : " + sol_taraf )  ;
		//Bu durumda kontrol edilmesine gerek yok çünkü referansýn ilk bir deðeri yok ...	
			(( Özellikler)sol_taraf).deðer = sað_taraf ;
         	//sadece boþ bir nesne dönüyoruz...
			
			
			
			Özellikler ret ;
			for ( int j = 0 ; j < çaðrýlan_fonksiyon.fonksiyon_bildirimleri().size() ; j++ )
			{
				
			ret = ( Özellikler )	visit ( çaðrýlan_fonksiyon.fonksiyon_bildirimleri( j ) ) ;
				
				
				
			}
			
			
			
			
			//Fonksiyonun kaydýný siliyoruz...
			this.fonksiyon_stack.pop() ;
			
			
		return new Özellikler ( ) ;	
			
			
			
		}
		else 
		if ( !sol_taraf.tür.equals( sað_taraf.tür ) )
		{
			System.out.println ( "Atama hatasý : "+  " deðiþkeninin türü" + sol_taraf.tür + " atanan deðerin türü : " + sað_taraf.tür );
			Özellikler yeni = new Özellikler ( )  ;
			yeni.tür = "HATA" ;
			yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
		}
		
		//atama yapýlýyor..
		sol_taraf.deðer = sað_taraf.deðer ;
	//	System.out.println ( "Atanan sað taraf deðeri : " + sol_taraf.deðer ) ;
		
		
		
		
		
		
		
		
		
		
	
		
	
	}
	//dfgdfgdfg
	//Geri dönüþ deðerleri önemli...
	Özellikler ret = null ;
	for ( int j = 0 ; j < çaðrýlan_fonksiyon.fonksiyon_bildirimleri().size() ; j++ )
	{
		
	ret = ( Özellikler )	visit ( çaðrýlan_fonksiyon.fonksiyon_bildirimleri( j ) ) ;
		
	//Bir return deyimi gelirse 
	if ( ret != null )
	if ( ret.tür != null )
		//Fonksiyonda da throw edilebilir .....Direk geri döneceðiz...
	 if ( ret.tür.equals ( "HATA" ) ) return ret ;
	 else	if ( ret.tür.equals( "RETURN" ) ) break;
		
		
	}
	
	
	
	
	//Fonksiyonun kaydýný siliyoruz...
	this.fonksiyon_stack.pop() ;
	if ( ret != null )
	if ( ret.tür != null )
	{
		if ( ret.tür != null )
		{
			if ( ret.tür.equals( "RETURN" ) )
				return ret.deðer ;
			
			
			
		}
		
		
	}
	
return new Özellikler ( ) ;	
	
	}
	
	
	public Object visitFonksiyon_tanimi_(DilParser.Fonksiyon_tanimi_Context ctx) {
		
		String fonksiyonun_ismi = ctx.degisken_ismi().getText ( )  ;
		
		if ( this.tanýmlanmýþ_fonksiyonlar.containsKey( fonksiyonun_ismi ) || this.matematik_fonksiyonlarý.containsKey( fonksiyonun_ismi  )  ) 
		{//Eðer ayný isimde fonksiyon tanýmlanmýþsa hata ver....
			System.out.println ( "Daha önce " + fonksiyonun_ismi + " adýyla tanýmlanmýþ bir fonksiyon var...." ) ;
			Özellikler yeni = new Özellikler ( )  ;
			yeni.tür = "HATA" ;
			yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
			
		}
		this.tanýmlanmýþ_fonksiyonlar.put( fonksiyonun_ismi ,  ctx  ) ;
		
		
		//Bir þey dönülmesine gerek yok..
	return new Özellikler ( ) ;
	}
	
	
	
	
	
	
	
	
	
public Object visitYanlis(DilParser.YanlisContext  ctx) { 
		
		
		Özellikler yeni = new Özellikler ( ) ;
		yeni.tür = "BOOL" ;
		yeni.deðer = false ;
		return yeni  ;
	
	
	}
	
	public Object visitDogru(DilParser.DogruContext ctx) { 
		
		
		Özellikler yeni = new Özellikler ( ) ;
		yeni.tür = "BOOL" ;
		yeni.deðer = true ;
		return yeni  ;
	
	
	}
	
	
	
	
	public Object visitDegisken_grubu_tanimi(DilParser.Degisken_grubu_tanimiContext ctx) {
	
		String structurýn_ismi  = ctx.degisken_ismi().getText() ;
		//Structurýn isiminin bizim normal ilkel türlerin adýný taþýmadýðýna emin oluncacak burada kontrol
		// eðer bizim türlerden birinin ismi verilirse hata mesajý ver...
		/********* Herhangi bir structure tanýmý daha önce yapýlmýþsa da hata ver...
		
		
		*/
		
		
		
		this.structure_tanýmlarý.put( structurýn_ismi , ctx ) ;
		
		
		//Geri bir þey dönülmesine gerek yok..
		return new Özellikler ( ) ;
		
	
	
	}
	
	
	
	public Object visitReferans_atama(DilParser.Referans_atamaContext ctx) { 
	
		this.referans_deðiþkeni_durumu = KENDÝSÝ ;
		
		Özellikler  referans_deðiþkeni = ( Özellikler ) visit ( ctx.referans_olabilenler( 0 )  )  ;
		
		this.referans_deðiþkeni_durumu = REFER_ETTÝÐÝ ;
		 
		//burada referansa referans edilse bile ikincinin tuttuðu obje referans edilecek...
		
	
		
		Özellikler referans_olunan =  ( Özellikler ) visit ( ctx.referans_olabilenler( 1 )  ) ;
		
		Özellikler ek = new Özellikler ( ) ;
		if ( referans_olunan == null  )
			 { ek.tür = "YOK" ;  ek.deðer = null; }
		
		else ek = referans_olunan ;
		
		//System.out.println (  "Referans olunan : " + referans_olunan ) ;
		
		//System.out.println ( "Refer edilen : " + referans_olunan ) ;
		referans_deðiþkeni.deðer = ek ;
		
		return new Özellikler ( ) ;
		
	
	
	}

	
	
	
	
	
	//Türden baðýmsýz referans uygulayacaðýz...
	
	 public Object visitAtamali_referans_ismi(DilParser.Atamali_referans_ismiContext ctx) {
		 
		 Özellikler atanmýþ_deðer = ( Özellikler ) visit ( ctx.degisken_ismi().get( 1 ) ) ;
			Özellikler yeni = new Özellikler ( ) ;
			String deðiþken_ismi = ctx.degisken_ismi(0 ) .getText() ;
					
					//yeni oluþacak deðiþken staðýn en tepesindeki kayda oluþturulacak...
					FunctionTable son_kayýt = this.fonksiyon_stack.peek() ;
					
					HashMap ekleme_yapilacak_mem = son_kayýt.lokal_deðiþken_memory ;
					
					if ( this.ekleme_yapýlcak_structure_ismi.size() == 0 )
					if ( ekleme_yapilacak_mem.containsKey( deðiþken_ismi ) )
					{
					System.out.println ( "Daha önce " + deðiþken_ismi + " tanýmlanmýþ bir deðiþken var..." ) ;
					Özellikler yen = new Özellikler ( )  ;
					yen.tür = "HATA" ;
					yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
					
					return yen ;
						
						
					}
					
					
					
				
						yeni.tür = REFERANS ;
						//Burada yeni bir   oluþturmaya gerek yok çünkü assignment yapýldýðýnda zaten  gelecek...
				
					yeni.deðer = atanmýþ_deðer  ;
					if ( !this.sýnýf_eriþim_stack.empty() )
					{
						yeni.eriþim_biçimi = this.sýnýf_eriþim_stack.peek() ;
					}
					
					
					if ( this.ekleme_yapýlcak_structure_ismi.size() != 0 )
					{ekleme_yapilacak_mem = this.ekleme_yapýlcak_structure_ismi.peek() ;
						ekleme_yapilacak_mem.put( deðiþken_ismi , yeni ) ; 
					}
					else
					ekleme_yapilacak_mem.put( deðiþken_ismi , yeni ) ; 
					return new Özellikler ( ) ;
		 
		
		 
	 
	 
	 }
		
	
	
	public Object visitSadece_referans_ismi(DilParser.Sadece_referans_ismiContext ctx) { 
	
		
		

		Özellikler yeni = new Özellikler ( ) ;
String deðiþken_ismi = ctx.degisken_ismi().getText();
		
		//yeni oluþacak deðiþken staðýn en tepesindeki kayda oluþturulacak...
		FunctionTable son_kayýt = this.fonksiyon_stack.peek() ;
		
		HashMap ekleme_yapilacak_mem = son_kayýt.lokal_deðiþken_memory ;
		
		if ( this.ekleme_yapýlcak_structure_ismi.size() == 0 )
		if ( ekleme_yapilacak_mem.containsKey( deðiþken_ismi ) )
		{
		System.out.println ( "Daha önce " + deðiþken_ismi + " tanýmlanmýþ bir deðiþken var..." ) ;
		Özellikler yen = new Özellikler ( )  ;
		yen.tür = "HATA" ;
		yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
		
		return yen ;
			
			
		}
		
		

		
			yeni.tür = REFERANS ;
		Özellikler _g = new Özellikler ( ) ;
	//	System.out.println ( "referans oluþturuldu:.." ) ;
		_g.tür = "YOK" ;
		
			yeni.deðer = _g ;

		
		
			if ( !this.sýnýf_eriþim_stack.empty() )
			{
				yeni.eriþim_biçimi = this.sýnýf_eriþim_stack.peek() ;
			}
		
			if ( this.ekleme_yapýlcak_structure_ismi.size() != 0 )
			{ekleme_yapilacak_mem = this.ekleme_yapýlcak_structure_ismi.peek() ;
				ekleme_yapilacak_mem.put(  deðiþken_ismi , yeni ) ; 
			}
			else
			ekleme_yapilacak_mem.put( deðiþken_ismi , yeni ) ; 
		
	
	//Geri bir þey dönmeye gerek yok..
	return new Özellikler ( ) ;
	}
	
	
	
	
	
	
	public Object visitCase_komutu(DilParser.Case_komutuContext ctx) { 
	
		Özellikler seçilen_deðiþken = ( Özellikler ) visit ( ctx.secilen() ) ;
		
		//Ardýndan tek tek case leri dolaþacaðýz...
		//Eðer caselerden birinde eþleþme varsa defaultu çaðýrmamak için...
		boolean deðer_bulundu = false ;
		
		
		Özellikler ret = null ;
		
		//Seçenekler yapýsýný gezebilmek için...
		DilParser.SeceneklerContext seçenekler ;
		for ( int a = 0 ; a < ctx.secenekler().size() ; a++ ) 
		{
			
			seçenekler = ctx.secenekler( a ) ;
			//tek tek þu andaki seçeneklerin ifadelerine bakacaðýz seçilen deðerle uyuþuyor mu diye...
			for ( int h = 0 ; h < seçenekler.ifadeler().size() ; h++ )
			{
				Özellikler sorgulanan = ( Özellikler ) visit ( seçenekler.ifadeler( h ) ) ;
				//Eðer herhangi bir ifade ile eþlemeþme saðlanýyorsa...
				
			/*	System.out.println ( "Sorgulanan tür : " + sorgulanan.tür  );
				System.out.println ( "Sorgulanan deðer : " + sorgulanan.deðer  ) ;
				System.out.println (  "Seçilen tür : "  +seçilen_deðiþken.tür );
				System.out.println ( "Seçilen deðer : " + seçilen_deðiþken.deðer ) ;
				*/
				if ( seçilen_deðiþken.tür.equals( sorgulanan.tür ) && seçilen_deðiþken.deðer.equals( sorgulanan.deðer ) )
				{
					//Hiç yoksa kýsmýna girmemek için...
					deðer_bulundu = true ;
					
					//Geri dönüþ deðeri önemli olabilir...
					for ( int g = 0 ; g < seçenekler.bildirimler().size ( ) ; g++ )
					{
						
					ret = ( Özellikler )	visit ( seçenekler.bildirimler( g )  ) ;
					//Sadece fonksiyonlar ret.deðeri döndürecek onun dýþýndakiler return objesini olduðu gibi geri döndürecek...
					if ( ret.tür != null )
						if ( ret.tür.equals ( "RETURN" ) ) return ret  ;
					
						else if ( ret.tür.equals( "HATA" ) ) return ret ;
						else if ( ret.tür.equals( "BREAK" ) || ret.tür.equals( "DEVAM") )
						{
							
							if ( this.döngü_stack.empty() )
							{
								System.out.println ( "baþtan devam et ve döngüden çýk komutlarý kullýlabilmesi  için en azýndan bir döngünün içine girilmesi gerekmetedir.Kullaným hatasý..." );
								Özellikler yeni = new Özellikler ( )  ;
								yeni.tür = "HATA" ;
								yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
								
								return yeni ;
								
							}
							else
							{
								return ret ;
							}
						}
					
					}
					//Bildirimleri de iþledikten sonra tüm seç yapýsýndan çýkacaðýz...
					break ;
					
					
					
				}
				}
		}
		
		
		//Eðer aranýlan deðer seçeneklerin hiç birinde yokse eðer yazýlmýþsa hiç yoksa kýsmý onu iþleteceðiz...
		if ( deðer_bulundu == false ) 
		{
			
			if ( ctx.hic_yoksa() != null )
			{
				DilParser.Hic_yoksaContext yapý = ctx.hic_yoksa() ;
				
				//Geri dönüþ deðerleri önemli olabilir....
				for ( int hh = 0 ; hh < yapý.bildirimler().size() ; hh++ ) 
				{
					
					ret = ( Özellikler ) visit ( yapý.bildirimler( hh )  ) ;
					//Sadece fonksiyonlar ret.deðeri döndürecek onun dýþýndakiler return objesini olduðu gibi geri döndürecek...
					if ( ret!= null )
					if ( ret.tür != null )
						if ( ret.tür.equals ( "RETURN" ) ) return ret  ;
						else if ( ret.tür.equals( "HATA" ) ) return ret ;
						else if ( ret.tür.equals( "BREAK" ) || ret.tür.equals( "DEVAM") )
						{
							
							if ( this.döngü_stack.empty() )
							{
								System.out.println ( "baþtan devam et ve döngüden çýk komutlarý kullýlabilmesi  için en azýndan bir döngünün içine girilmesi gerekmetedir.Kullaným hatasý..." );
								Özellikler yeni = new Özellikler ( )  ;
								yeni.tür = "HATA" ;
								yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
								
								return yeni ;
								
							}
							else
							{
								return ret ;
							}
						}
					
				}
				
				
				
				
				
			}
				 
			
			
			
		}
		
		
		//Switch problemsiz çalýþýrsa bir þey dönmesine gerek yok...
	return new Özellikler ( ) ;
	}
	
	
	
	public Object visitDo_while_loop(DilParser.Do_while_loopContext ctx) { 
	
		Özellikler sonuç = null ;
		//Bura önce ifadeleri iþleyeceðiz...
		
		//Geri dönüþ gene önemli burada...
	Özellikler ret = null ;
	
	
	if ( this.döngü_stack.empty() )
	this.döngü_stack.push( 0 ) ;
	else this.döngü_stack.push( this.döngü_stack.peek() +1 ) ;
	
	
	do
		{
		
		try {
		for ( int a = 0 ; a < ctx.bildirimler().size() ; a++ )
		{
			
		ret = ( Özellikler )	visit ( ctx.bildirimler( a )  );
		//Sadece fonksiyonlar ret.deðeri döndürecek onun dýþýndakiler return objesini olduðu gibi geri döndürecek...
		if ( ret != null )
		if ( ret.tür != null )
			if ( ret.tür.equals ( "RETURN" ) ) {this.döngü_stack.pop ( ) ; return ret  ; }
			else if ( ret.tür.equals( "HATA" ) ) { this.döngü_stack.pop ( ) ; return ret ; }
			else if ( ret.tür.equals( "BREAK" ) ) throw new Goto ( "BREAK" ) ;
			else if ( ret.tür.equals( "DEVAM" ) )  { throw new Goto ( "DEVAM" ) ; }
			
			
		}
		//do daki her statement ý iþledikten sonra doðruluk deðerine bakacaðýz..
		
		
		sonuç = ( Özellikler ) visit ( ctx.mantik_ifadeleri() ) ;
		}
		catch ( Goto x )
		{
			if ( x.hata.equals( "BREAK" ) ) break ;
			//Ayný sonuçta continue edecek onun için tekrar çaðýrýyoruz bir sonraki sonuç için...
			
			else if ( x.hata.equals( "DEVAM" ) ) {  sonuç = ( Özellikler ) visit ( ctx.mantik_ifadeleri( ) ) ;  continue ; }  
			
			
		}
		
		
		}
		while ( ( boolean ) sonuç.deðer == true   ) ;
		// eðer her þey yolunda giderse geri bir þey dönmeye gerek yok....
		
	
	this.döngü_stack.pop ( ) ;
	
	
		return new Özellikler ( ) ;
	}
	
	public Object visitWhile_loop(DilParser.While_loopContext ctx) { 
		// ilk baþta kontrol etmek için doðruluk ifadesinin deðerini alýyoruz..
		Özellikler sonuç = ( Özellikler ) visit ( ctx.mantik_ifadeleri() ) ;
		Özellikler ret = null ;
		
		if ( this.döngü_stack.empty() )
			this.döngü_stack.push( 0 ) ;
			else this.döngü_stack.push( this.döngü_stack.peek() +1 ) ;
		//System.out.println ( "Sonuç : "  + sonuç ) ;
		
		while ( ( boolean ) sonuç.deðer == true )
		{
			try 
			{
			//Burada geri dönüþler önemli break ve continuedaki gibi...
			for ( int b = 0 ; b  < ctx.bildirimler().size ( ) ; b++ )
			{
			ret = ( Özellikler )	visit ( ctx.bildirimler( b )  ) ;
			//Sadece fonksiyonlar ret.deðeri döndürecek onun dýþýndakiler return objesini olduðu gibi geri döndürecek...
			if ( ret != null )
			if ( ret.tür != null )
				if ( ret.tür.equals ( "RETURN" ) )   {  this.döngü_stack.pop ( )  ; return ret  ; }
				else if ( ret.tür.equals ( "HATA" ) ) { this.döngü_stack.pop ( ) ; return ret ; }
				else if ( ret.tür.equals( "BREAK" ) ) throw new Goto ( "BREAK" ) ;
				else if ( ret.tür.equals( "DEVAM" ) )  { throw new Goto ( "DEVAM" ) ; }
				
			}
			
			//Tekrar mantýk ifadesini elde ediyoruz kontrol etmek için...
			sonuç = ( Özellikler ) visit ( ctx.mantik_ifadeleri( ) ) ;
			
			}
			catch ( Goto x  ) 
			{
				if ( x.hata.equals( "BREAK" ) ) break ;
				//Ayný sonuçta continue edecek onun için tekrar çaðýrýyoruz bir sonraki sonuç için...
				
				else if ( x.hata.equals( "DEVAM" ) ) {  sonuç = ( Özellikler ) visit ( ctx.mantik_ifadeleri( ) ) ;  continue ; }  
				
			}
		}
	
		
		
	this.döngü_stack.pop ( ) ; 
		//while döngüsünün ne döndüðü önemli deðil...
	return new Özellikler ( ) ;
		 
		
	}

	
	
	
	
	public Object visitDogru_yanlis(DilParser.Dogru_yanlisContext ctx) { 
		
		
		return visit(ctx.mantik()); 
		
	
	
	}
	
	
	
	public Object visitEsit_degil(DilParser.Esit_degilContext ctx) { 
	
		Özellikler yeni = new Özellikler ( ) ;
		yeni.tür = "BOOL" ;
		Özellikler sol_taraf = ( Özellikler ) visit ( ctx.ifadeler( 0 ) ) ;
		Özellikler sað_taraf = ( Özellikler ) visit ( ctx.ifadeler( 1 ) ) ;
		
	//	System.out.println ( "Sol taraf : " + sol_taraf );
		if ( sol_taraf.tür.equals ( "YOK" ) || sað_taraf.tür.equals ( "YOK" ) )
		{
			if  ( sol_taraf.tür.equals ( sað_taraf.tür ) )
				yeni.deðer = false ;
			else yeni.deðer = true ;
			
			
			return yeni ;
			
			
		}
		else
		if ( !sol_taraf.tür .equals( sað_taraf.tür))
		{
			System.out.println ( sol_taraf.tür + " ile " + sað_taraf.tür + " ayný deðil karþýlaþtýrýlamazlar..." );
			Özellikler yen = new Özellikler ( )  ;
			yen.tür = "HATA" ;
			yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yen ;
		}
		
switch ( sol_taraf.tür )
{

case "YOK":
	if ( sað_taraf.tür.equals("YOK" )) 
	{
		
		yeni.deðer = false ;
	}
	else yeni.deðer = true ;
	
	break ;

case TAMSAYI:
	if ( (int)sol_taraf.deðer != (int) sað_taraf.deðer )
		yeni.deðer = true ;
	else yeni.deðer = false ;
	
	break;

case STRING:
	if ( ((String )sol_taraf.deðer).compareTo(  (String)sað_taraf.deðer ) != 0 )
		yeni.deðer = true ;
	else yeni.deðer = false ;
	break;
case NOKTALISAYI:
	if ( !((Double)sol_taraf.deðer).equals((Double)sað_taraf.deðer ) ) 
		yeni.deðer = true ;
	else yeni.deðer = false ;
	break
	
	;
case "BOOL":
	if ( ((boolean)sol_taraf.deðer) !=((boolean)sað_taraf.deðer ) ) 
		yeni.deðer = true ;
	else yeni.deðer = false ;
	break ;
	

}
		
		return yeni ;
		
	}
	
	 
		
	public Object visitEksi_sayi(DilParser.Eksi_sayiContext ctx) { 
		
		Özellikler gelen = ( Özellikler ) visit ( ctx.ifadeler() ) ;
	
		switch ( gelen.tür )
		{
		case STRING :
			
			System.out.println ( "- iþareti Stringlerle kullanýlamaz..." ) ;
			Özellikler yeni = new Özellikler ( )  ;
			yeni.tür = "HATA" ;
			yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
			
		case TAMSAYI:
			gelen.deðer = -1 *  ( int )gelen.deðer ;
		break ;
		
		case NOKTALISAYI:
			gelen.deðer = -1 * (Double)gelen.deðer ;
break ;
		
		}
		
		return gelen ;
		
	
	}
	
	
	
	public Object visitDogru_degil(DilParser.Dogru_degilContext ctx) {
		
		//Eðer else yapýsýnda return varsa o nesneyi geri döndürmemiz gerekir...
		
		Özellikler yeni = new Özellikler ( ); 
		Özellikler ret = null ;
		for ( int a = 0 ; a < ctx.bildirimler().size()  ; a++ ) 
		{
		ret = ( Özellikler )	visit( ctx.bildirimler( a )  );
		//Sadece fonksiyonlar ret.deðeri döndürecek onun dýþýndakiler return objesini olduðu gibi geri döndürecek...
		if ( ret != null )
		if ( ret.tür != null )
			if ( ret.tür.equals ( "RETURN" ) ) return ret  ;
			else if ( ret.tür.equals ( "HATA" ) ) return ret ;
			
			
		}
		
		return yeni ;
		
	}
	
	
	
	
	
	public Object visitSart_komutu(DilParser.Sart_komutuContext ctx) {
		//if in doðru olduðu yada else if ler de return olabilir else de de ...
		
		
		Özellikler sonuç = ( Özellikler ) visit ( ctx.mantik_ifadeleri() ) ;
//	System.out.println ( "Sart Komutu Sonuc : " + sonuç ) ;
		Özellikler ret = null ;
		
		if ( (boolean )sonuç.deðer == true ) 
		{
			for ( int a = 0 ; a < ctx.bildirimler().size() ; a++ )
			{
				
				
				
				ret = ( Özellikler ) visit ( ctx.bildirimler( a ) ) ;
				
				//Sadece fonksiyonlar ret.deðeri döndürecek onun dýþýndakiler return objesini olduðu gibi geri döndürecek...
				if ( ret!= null )
				if ( ret.tür != null )
					if ( ret.tür.equals ( "RETURN" ) ) return ret  ;
					else if ( ret.tür.equals( "HATA" )  ) return ret ;
					else if ( ret.tür.equals( "BREAK" ) || ret.tür.equals( "DEVAM") )
					{
						
						if ( this.döngü_stack.empty() )
						{
							System.out.println ( "baþtan devam et ve döngüden çýk komutlarý kullýlabilmesi  için en azýndan bir döngünün içine girilmesi gerekmetedir.Kullaným hatasý..." );
							Özellikler yeni = new Özellikler ( )  ;
							yeni.tür = "HATA" ;
							yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
							
							return yeni ;
							
						}
						else
						{
							return ret ;
						}
					}
				
				
				
				
			}
		
		}
		else 
		{
			//Buralarda geri dönüþ deðerleri önemli olacak....
			boolean bulundu = false ;
				DilParser.Veya_dogruysa_yapisiContext veya_yapisi ;
			for ( int a = 0 ;  a < ctx.veya_dogruysa_yapisi().size() ; a++  )
			{
				veya_yapisi = ctx.veya_dogruysa_yapisi( a  ) ;
				Özellikler sonuc = (Özellikler ) visit ( veya_yapisi.mantik_ifadeleri() ) ;
				if ( (boolean ) sonuc.deðer == true )
				{
					bulundu = true ;
					
					for ( int h = 0 ; h < veya_yapisi.bildirimler().size() ; h++ )
					{
						
						ret = ( Özellikler ) visit ( veya_yapisi.bildirimler( h ) ) ;
						//Sadece fonksiyonlar ret.deðeri döndürecek onun dýþýndakiler return objesini olduðu gibi geri döndürecek...
						if ( ret.tür != null )
							if ( ret.tür.equals ( "RETURN" ) ) return ret  ;
							else if (ret.tür.equals ( "HATA" ) ) return ret ;
							else if ( ret.tür.equals( "BREAK" ) || ret.tür.equals( "DEVAM") )
							{
								
								if ( this.döngü_stack.empty() )
								{
									System.out.println ( "baþtan devam et ve döngüden çýk komutlarý kullýlabilmesi  için en azýndan bir döngünün içine girilmesi gerekmetedir.Kullaným hatasý..." );
									Özellikler yeni = new Özellikler ( )  ;
									yeni.tür = "HATA" ;
									yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
									
									return yeni ;
									
								}
								else
								{
									return ret ;
								}
							}
						
						
					}
					
					
					
				}
				
				
				
			}
			
				
			if ( (bulundu == false) &&  ( ctx.dogru_degilse_yapisi() != null) ) 
			{
				
			ret = ( Özellikler ) 	visit ( ctx.dogru_degilse_yapisi() ) ;
				
			//Sadece fonksiyonlar ret.deðeri döndürecek onun dýþýndakiler return objesini olduðu gibi geri döndürecek...
			if ( ret.tür != null )
				if ( ret.tür.equals ( "RETURN" ) ) return ret  ;
				else if ( ret.tür.equals( "HATA" ) ) return ret ;
				else if ( ret.tür.equals( "BREAK" ) || ret.tür.equals( "DEVAM") )
				{
					
					if ( this.döngü_stack.empty() )
					{
						System.out.println ( "baþtan devam et ve döngüden çýk komutlarý kullýlabilmesi  için en azýndan bir döngünün içine girilmesi gerekmetedir.Kullaným hatasý..." );
						Özellikler yeni = new Özellikler ( )  ;
						yeni.tür = "HATA" ;
						yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
						
						return yeni ;
						
					}
					else
					{
						return ret ;
					}
				}
			
			}
			
			
		
			
			
			
		}
		
		
		
		
		
	
	//Þart ifadesinin bir þey dönmesine gerek yok
	return new Özellikler ( ) ;
	}
	
	
	public Object visitKucuk(DilParser.KucukContext ctx) { 
		Özellikler yeni = new Özellikler ( ) ;
		yeni.tür = "BOOL" ;
		Özellikler sol_taraf = ( Özellikler ) visit ( ctx.ifadeler( 0 ) ) ;
		Özellikler sað_taraf = ( Özellikler ) visit ( ctx.ifadeler( 1 ) ) ;
		
		
	
		
		if ( !sol_taraf.tür .equals( sað_taraf.tür))
		{
			System.out.println ( sol_taraf.tür + " ile " + sað_taraf.tür + " ayný deðil karþýlaþtýrýlamazlar..." );
			Özellikler yen = new Özellikler ( )  ;
			yen.tür = "HATA" ;
			yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yen ;
		}
		
switch ( sol_taraf.tür )
{
case TAMSAYI:
	if ( (int)sol_taraf.deðer < (int) sað_taraf.deðer )
		yeni.deðer = true ;
	else yeni.deðer = false ;
	
	break;

case STRING:
	if ( ((String )sol_taraf.deðer).compareTo(  (String)sað_taraf.deðer )< 0 )
		yeni.deðer = true ;
	else yeni.deðer = false ;
	break;
case NOKTALISAYI:
	if ( (Double)sol_taraf.deðer < (Double)sað_taraf.deðer )
		yeni.deðer = true ;
	else yeni.deðer = false ;
	
	
	
	

}
		
		return yeni ;
	
	}

	public Object visitNormal_dogru_ifade(DilParser.Normal_dogru_ifadeContext ctx) { return visit(ctx.dogruluk_ifadeleri()); }
	
	
	
	public Object visitVeya_islec(DilParser.Veya_islecContext ctx) { 
	
		
		Özellikler sol_taraf = ( Özellikler ) visit ( ctx.mantik_ifadeleri( 0 ) ) ;
		   Özellikler sað_taraf = ( Özellikler ) visit ( ctx.mantik_ifadeleri( 1 )  );
		Özellikler yeni = new Özellikler ( );
		yeni.tür = "BOOL" ;
		
		//Otomatik short cut saðlanýyor java nýn if yapýsýyla...
		if ( (boolean ) sol_taraf.deðer || ( boolean )sað_taraf.deðer )
		{
			yeni.deðer = true ;
			
		}
		else yeni.deðer = false ;
		
			
			
			
			return yeni ;
		
	}
	
	
	
	
	
	public Object visitVe_islec(DilParser.Ve_islecContext ctx) {
	
		Özellikler sol_taraf = ( Özellikler ) visit ( ctx.mantik_ifadeleri( 0 ) ) ;
	   Özellikler sað_taraf = ( Özellikler ) visit ( ctx.mantik_ifadeleri( 1 )  );
	Özellikler yeni = new Özellikler ( );
	yeni.tür = "BOOL" ;
	
	//Otomatik short cut saðlanýyor java nýn if yapýsýyla...
	
	if ( sol_taraf.tür.equals ( "YOK" ) || sað_taraf.tür.equals( "YOK" ) )
	{
		yeni.deðer = false ;
		
		
	}
		else
	if ( (boolean ) sol_taraf.deðer && ( boolean )sað_taraf.deðer )
	{
		yeni.deðer = true ;
		
	}
	else yeni.deðer = false ;
	
		
		
		
		return yeni ;
		
	}
	
	public Object visitParantezli_mantik(DilParser.Parantezli_mantikContext ctx) { 
		
		return visit(ctx.mantik_ifadeleri()); 
		
	}
	
	
	
	
	
	
	public Object visitSaf_deger(DilParser.Saf_degerContext ctx) { 
		
		Özellikler deðiþken = ( Özellikler ) visit ( ctx.ifadeler() ) ;
		Özellikler yeni = new Özellikler  ( ) ;
		yeni.tür = "BOOL" ;
		
		
		switch ( deðiþken.tür )
		{
		case TAMSAYI:
			if ( (int) deðiþken.deðer != 0 ) yeni.deðer = true ;
			else yeni.deðer = false ;
			
			break;
		case NOKTALISAYI:
			if ( (Double) deðiþken.deðer != 0 ) yeni.deðer = true ;
			else yeni.deðer = false ;
			
			break;
		case STRING:
			if ( !((String) deðiþken.deðer).equals( "" ) ) yeni.deðer = true ;
			else yeni.deðer = false ;
			
			break;	
		
			//Object yok objesi ise doðruluk deðeri yanlýþ
		case "YOK":
			if ( deðiþken.tür.equals( "YOK" ) ) yeni.deðer = false ;
			else yeni.deðer = true ;
			
			break;
		
		
		
		
		}

		
		return yeni ;
		
		
	}
	
	
	
	
	public Object visitKucuk_esit(DilParser.Kucuk_esitContext ctx) {
		
		 Özellikler yeni = new Özellikler ( ) ;
			yeni.tür = "BOOL" ;
			Özellikler sol_taraf = ( Özellikler ) visit ( ctx.ifadeler( 0 ) ) ;
			Özellikler sað_taraf = ( Özellikler ) visit ( ctx.ifadeler( 1 ) ) ;
			
			if ( !sol_taraf.tür .equals( sað_taraf.tür))
			{
				System.out.println ( sol_taraf.tür + " ile " + sað_taraf.tür + " ayný deðil karþýlaþtýrýlamazlar..." );
				Özellikler yen = new Özellikler ( )  ;
				yen.tür = "HATA" ;
				yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yen ;
			}
			
	switch ( sol_taraf.tür )
	{
	case TAMSAYI:
		if ( (int)sol_taraf.deðer <= (int) sað_taraf.deðer )
			yeni.deðer = true ;
		else yeni.deðer = false ;
		
		break;

	case STRING:
		if ( ((String )sol_taraf.deðer).compareTo(  (String)sað_taraf.deðer ) <= 0 )
			yeni.deðer = true ;
		else yeni.deðer = false ;
		break;
	case NOKTALISAYI:
		if ( (Double)sol_taraf.deðer <= (Double)sað_taraf.deðer )
			yeni.deðer = true ;
		else yeni.deðer = false ;
		break;
	case "YOK":
		
		System.out.println ( "yok deðeri baþka bir veri türüyle karþýlaþtýrýlamaz..." ) ;
		Özellikler yen = new Özellikler ( )  ;
		yen.tür = "HATA" ;
		yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
		
		return yen ;
		
		
		

	}
			
			
			
		return yeni ;
	
		
	
	}
	
	
	
	
	 public Object visitBuyuk_esit(DilParser.Buyuk_esitContext ctx) { 
		 
	 
		 Özellikler yeni = new Özellikler ( ) ;
			yeni.tür = "BOOL" ;
			Özellikler sol_taraf = ( Özellikler ) visit ( ctx.ifadeler( 0 ) ) ;
			Özellikler sað_taraf = ( Özellikler ) visit ( ctx.ifadeler( 1 ) ) ;
			
			if ( !sol_taraf.tür .equals( sað_taraf.tür))
			{
				System.out.println ( sol_taraf.tür + " ile " + sað_taraf.tür + " ayný deðil karþýlaþtýrýlamazlar..." );
				Özellikler yen = new Özellikler ( )  ;
				yen.tür = "HATA" ;
				yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yen ;
			}
			
	switch ( sol_taraf.tür )
	{
	case TAMSAYI:
		if ( (int)sol_taraf.deðer >= (int) sað_taraf.deðer )
			yeni.deðer = true ;
		else yeni.deðer = false ;
		
		break;

	case STRING:
		if ( ((String )sol_taraf.deðer).compareTo(  (String)sað_taraf.deðer ) >= 0 )
			yeni.deðer = true ;
		else yeni.deðer = false ;
		break;
	case NOKTALISAYI:
		if ( (Double)sol_taraf.deðer >= (Double)sað_taraf.deðer )
			yeni.deðer = true ;
		else yeni.deðer = false ;
		break;
		
	case "YOK":
		
		System.out.println ( "yok deðeri baþka bir veri türüyle karþýlaþtýrýlamaz..." ) ;
		Özellikler yen = new Özellikler ( )  ;
		yen.tür = "HATA" ;
		yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
		
		return yen ;
		
		
		

	}
			
			
			
		return yeni ;
	 
	 }
		
	

	 public Object visitEsit(DilParser.EsitContext ctx) { 
		 Özellikler yeni = new Özellikler ( ) ;
			yeni.tür = "BOOL" ;
			Özellikler sol_taraf = ( Özellikler ) visit ( ctx.ifadeler( 0 ) ) ;
			Özellikler sað_taraf = ( Özellikler ) visit ( ctx.ifadeler( 1 ) ) ;
			if ( sol_taraf.tür.equals ( "YOK" ) || sað_taraf.tür.equals ( "YOK" ) )
			{
				if  ( sol_taraf.tür.equals ( sað_taraf.tür ) )
					yeni.deðer = true  ;
				else yeni.deðer = false ;
				
				
				return yeni ;
				
				
			}
			else
			if ( !sol_taraf.tür .equals( sað_taraf.tür))
			{
				System.out.println ( sol_taraf.tür + " ile " + sað_taraf.tür + " ayný deðil karþýlaþtýrýlamazlar..." );
				Özellikler yen = new Özellikler ( )  ;
				yen.tür = "HATA" ;
				yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yen ;
			}
			
	switch ( sol_taraf.tür )
	{
	case TAMSAYI:
		if ( (int)sol_taraf.deðer == (int) sað_taraf.deðer )
			yeni.deðer = true ;
		else yeni.deðer = false ;
		
		break;

	case STRING:
		if ( ((String )sol_taraf.deðer).compareTo(  (String)sað_taraf.deðer ) == 0 )
			yeni.deðer = true ;
		else yeni.deðer = false ;
		break;
	case NOKTALISAYI:
		if ( (Double)sol_taraf.deðer == (Double)sað_taraf.deðer )
			yeni.deðer = true ;
		else yeni.deðer = false ;
		break ;
	case "BOOL":
		if ( (boolean)sol_taraf.deðer == (boolean)sað_taraf.deðer )
			yeni.deðer = true ;
		else yeni.deðer = false ;
		break;
	case "YOK":
		//Eðer bir NULL deðerle bir null deðer olmayan karþýlaþtýrýlýyorsa sonuç yanlýþ aksi halde doðru...
		if ( !sað_taraf.tür.equals ( "YOK") )
		{
			yeni.deðer = false ;
			
		}
		else yeni.deðer = true ;
		
		
		
		break;
		
		

	}
			
			
			
		return yeni ;
		 
	 
	 }
		
	
	
	public Object visitBuyuk(DilParser.BuyukContext ctx) { 
		Özellikler yeni = new Özellikler ( ) ;
		yeni.tür = "BOOL" ;
		Özellikler sol_taraf = ( Özellikler ) visit ( ctx.ifadeler( 0 ) ) ;
		Özellikler sað_taraf = ( Özellikler ) visit ( ctx.ifadeler( 1 ) ) ;
		
		if ( !sol_taraf.tür .equals( sað_taraf.tür))
		{
			System.out.println ( sol_taraf.tür + " ile " + sað_taraf.tür + " ayný deðil karþýlaþtýrýlamazlar..." );
			Özellikler yen = new Özellikler ( )  ;
			yen.tür = "HATA" ;
			yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yen ;
		}
		
switch ( sol_taraf.tür )
{
case TAMSAYI:
	if ( (int)sol_taraf.deðer > (int) sað_taraf.deðer )
		yeni.deðer = true ;
	else yeni.deðer = false ;
	
	break;

case STRING:
	if ( ((String )sol_taraf.deðer).compareTo(  (String)sað_taraf.deðer ) > 0 )
		yeni.deðer = true ;
	else yeni.deðer = false ;
	break;
case NOKTALISAYI:
	if ( (Double)sol_taraf.deðer > (Double)sað_taraf.deðer )
		yeni.deðer = true ;
	else yeni.deðer = false ;
	break;
	
case "YOK":
	
	System.out.println ( "yok deðeri baþka bir veri türüyle karþýlaþtýrýlamaz..." ) ;
	Özellikler yen = new Özellikler ( )  ;
	yen.tür = "HATA" ;
	yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
	
	return yen ;

	
	
	
	

}
		
		
		
	return yeni ;
	
	}
	
	
	
	
	public Object visitParantezli_dogru(DilParser.Parantezli_dogruContext ctx) { return visit(ctx.dogruluk_ifadeleri()); }
	
	public Object visitDegili(DilParser.DegiliContext ctx) { 
		
		//Bu bir ifadenin sonucunu geri döndürecek..
		Özellikler sonuç = ( Özellikler ) visit ( ctx.dogruluk_ifadeleri() ) ;
		
		sonuç.deðer = !(boolean) (sonuç.deðer) ;
		
		return sonuç ;
		
		
		
	
	}
	
	
	
	
	
	
	
	
	public Object visitArray_eleman_ekleme(DilParser.Array_eleman_eklemeContext ctx) { 
		
		Özellikler array_deðiþkeni = ( Özellikler ) visit ( ctx.sol_taraf_degiskenleri() ) ;
		//Ekleme yapýlacak array deðiþkeni deðilse hata ver....
		if ( !array_deðiþkeni.tür.equals( "ARRAY" ) ) 
		{
			System.out.println ( ctx.sol_taraf_degiskenleri().getText() +" deðiþkeni bir array deðil bu yüzden ekleme yapýlamaz..." ) ;
			Özellikler yeni = new Özellikler ( )  ;
			yeni.tür = "HATA" ;
			yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
			
		}
	
		//Bir problem yoksa ....
		HashMap <String , Özellikler > ekleme_yapýlacak_map = (HashMap<String, Özellikler>) array_deðiþkeni.deðer ;
		Özellikler eklenecek_veri = ( Özellikler ) visit ( ctx.ifadeler() ) ;
		
		
		//Hiç eleman olmasa bile 0. indeksten baþlanarak ekleme yapýlacak...
	int index  = 0 ;
		do
		{
			if ( ekleme_yapýlacak_map.containsKey(""+ index) ) ;
			else
			{
				//System.out.println( "Ekleme yapýlan index : " + index );
				ekleme_yapýlacak_map.put( ""+index , eklenecek_veri ) ;
				
				break ;
			}
			index ++ ;
			
		}
		while ( true ) ;
		
		
		
		
	
	return new Özellikler ( );
	}
	
	
	
	
	
	
	
	
	public Object visitProgram_sonlandir(DilParser.Program_sonlandirContext ctx) 
	{ 
		
		Özellikler yeni = new Özellikler ( )  ;
		yeni.tür = "HATA" ;
		yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
	
	}
	
	
	
	
	
	public Object visitArray_degiske(DilParser.Array_degiskeContext ctx) {
		
		
		//System.out.println ( "Array degiske"  );
	
		
		
	return visit( ctx.array_degiskeni() ) ;
	
	}

	
	
	public Object visitDeger_ata(DilParser.Deger_ataContext ctx) { 
		
		
		//ilk önce soldaki atanacak olanlarýn sayýsý ile saðdaki atananlarýn sayýsý aynýmý diye kontrol edilecek
		int sol_taraf_sayý = ctx.sol_taraf_degiskenleri().size() ;
		int sað_taraf_sayý = ctx.ifadeler().size( ); 
		
		if ( sol_taraf_sayý > sað_taraf_sayý )
		{
			System.out.println ( "Atananlarýn sayýsý yetersiz...." ) ;
			
			Özellikler yeni = new Özellikler ( )  ;
			yeni.tür = "HATA" ;
			yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
			
			
		}
		else if ( sol_taraf_sayý < sað_taraf_sayý )
		{
		//	System.out.println ( "Sol taraftaki deðiþkenlerin sayýsý yetersiz" ) ;
			Özellikler yeni = new Özellikler ( )  ;
			yeni.tür = "HATA" ;
			yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
		}
		
		//Sað sol sayýlarý eþit ve atamalarý gerçekleþtiriyoruz..
		
		//Sol tarafta daha henüz deðeri atanmamýþ  array elemanlarý olabilir bunu saðlamak için bu deðiþkeni set ediyoruz..
		//Böylece array elemanýna ziyaret ederken eðer o indekse ait eleman yoksa hemen orada o index oluþturulacak...
		this.array_elamanýna_deðer_atama = true ;
		
		//*****Referans ve Dinamik veri türlerine dikkat edilecek...*****
		Özellikler tempo =new Özellikler ( ) ;
		for ( int b = 0 ; b < sol_taraf_sayý ; b++ )
		{
			HashMap temporary ;
			this.dinamik_deðiþkeni_durumu = KENDÝSÝ ;
		
			this.referans_deðiþkeni_durumu = KENDÝSÝ ;
			Özellikler sol_taraf = ( Özellikler ) visit ( ctx.sol_taraf_degiskenleri( b ) ) ;
			//System.out.println ( "Sol taraf : " + sol_taraf ) ;
			
			//Dinamik bir deðiþkene referans edilince exception bir durum oluyor...
			
			this.dinamik_deðiþkeni_durumu = REFER_ETTÝÐÝ ;
			
			
			this.referans_deðiþkeni_durumu = REFER_ETTÝÐÝ; ;
			Özellikler sað_taraf = ( Özellikler ) visit ( ctx.ifadeler( b )  );
			
			tempo = sað_taraf ;
			
			//System.out.println ( "Sað : " + sað_taraf ) ;
		//	tempo.tür = sað_taraf.tür ;
		//	tempo.deðer = sað_taraf.deðer ;
			
			if ( sað_taraf.tür.equals( "ARRAY") ) 
			{
			//System.out.println ( "Array objesi eþitleme "  ) ;
			
				
				
				//Eðer array varsa bir tek bunun kopyasý oluþturulacak...
				
		   tempo = new Özellikler ( ) ;
		   tempo.tür = sað_taraf.tür ;
		   
			ObjectOutputStream object_output = null ;
			ByteArrayOutputStream output = new ByteArrayOutputStream() ;
			try {
				 object_output = new ObjectOutputStream( output ) ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//System.out.println ( "Sað taraf : " + sað_taraf ) ;

			try {
				object_output.writeObject( sað_taraf );
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println ( "Dosya yazma error " ) ;
				Özellikler yeni = new Özellikler ( )  ;
				yeni.tür = "HATA" ;
				yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
			}


			ObjectInputStream object_input = null ;
			ByteArrayInputStream input = new ByteArrayInputStream( output.toByteArray() ) ;
			try {
				 object_input = new ObjectInputStream ( input ) ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
		
			System.out.println ( "Dosya yazma error " ) ;
			Özellikler yeni = new Özellikler ( )  ;
			yeni.tür = "HATA" ;
			yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
			}


			Özellikler copied = null ;

			try {
				copied = (Özellikler) object_input.readObject( ) ;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//	System.out.println ( "Clonlana array : " + cloned ) ;
		//	System.out.println ( "Orjinal array : " + sað_taraf.deðer ) ;
			tempo.deðer = copied.deðer ;
			
			
			}
			
			//Sað taraf array hariçse aynen kalacak...
			sað_taraf = tempo ;
			
			//Burada Referans ve Dinamik veri türlerine dikkat edilecek....
		    //Bu henüz o indekse deðer atýlmamýþ array elemanlarýnda YOK türünde bir Özellikler geri dönülüyor...
			if ( sol_taraf.tür.equals( "YOK" ) )
			{
				sol_taraf.tür = sað_taraf.tür ;
				sol_taraf.deðer = sað_taraf.deðer ;
				
			}
			else if ( sol_taraf.tür.equals("DÝNAMÝK") )
			{
			//	System.out.print ( "Sol taraf : " + sol_taraf ) ;
				((Özellikler)sol_taraf.deðer).deðer = sað_taraf.deðer ;
				((Özellikler)sol_taraf.deðer).tür  = sað_taraf.tür ;
				this.array_elamanýna_deðer_atama = false ;
				//sadece boþ bir nesne dönüyoruz...
				
				this.dinamik_deðiþkeni_durumu = REFER_ETTÝÐÝ ;
				return new Özellikler ( ) ;
				
			}
			else if ( sol_taraf.tür.equals( "REFERANS" ) ) 
			{//System.out.println ( "Ref" );
				//Referab
			
				
				
				
			if ( ( (Özellikler)sol_taraf.deðer).tür .equals( sað_taraf.tür ))
			{
				
			}
			else
			{
				System.out.println ( "Refans deðiþkenin refer ettiði deðiþkenin türü : " +  ((Özellikler)sol_taraf.deðer).tür + " buna atanan tür : " +sað_taraf.tür   )  ;
				Özellikler yeni = new Özellikler ( )  ;
				yeni.tür = "HATA" ;
				yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
			}
				(( Özellikler)sol_taraf.deðer).deðer = sað_taraf.deðer ;
				this.array_elamanýna_deðer_atama = false ;
				
				this.dinamik_deðiþkeni_durumu = REFER_ETTÝÐÝ ;
				
				
				
				//sadece boþ bir nesne dönüyoruz...
				return new Özellikler ( ) ;
				
			}
			else 
			if ( !sol_taraf.tür.equals( sað_taraf.tür ) )
			{
				System.out.println ( "Atama hatasý : "+ ctx.sol_taraf_degiskenleri(b).getText() + " deðiþkeninin türü" + sol_taraf.tür + " atanan deðerin türü : " + sað_taraf.tür );
				Özellikler yeni = new Özellikler ( )  ;
				yeni.tür = "HATA" ;
				yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
			}
			
			//atama yapýlýyor..
			sol_taraf.deðer = sað_taraf.deðer ;
		//	System.out.println ( "Atanan sað taraf deðeri : " + sol_taraf.deðer ) ;
			
		}
		
		
		//Bu sadece elemanlara deðer atanýrken true olmalýdýr aksi halde false ...
		this.array_elamanýna_deðer_atama = false ;
		
		this.dinamik_deðiþkeni_durumu = REFER_ETTÝÐÝ ;
	
		
		
		
		//sadece boþ bir nesne dönüyoruz...
		return new Özellikler ( ) ;
	
	}
	
	
	
	
	
	
	
	
	
	//*******þimdilik array [ 0 ]  ile array [ "0"] arasýnda fark yok....
	//Array indeksleri string olabilir veya tamsayý olabilir...
	public Object visitArray_deger_al(DilParser.Array_deger_alContext ctx) 
	
	{ 
		//Öncelikle memoriden deðiþkeni alýyoruz....
		
		//System.out.println ( "visitArray_deger_al dayýz ...  " ) ;
		//System.out.print ( "Alýnacak deðiþken ismi : " + ctx.degisken_ismi().getText() ) ;
		
		this.referans_deðiþkeni_durumu = REFER_ETTÝÐÝ ;
		this.dinamik_deðiþkeni_durumu = REFER_ETTÝÐÝ ;
		Özellikler deðiþken = ( Özellikler ) visit ( ctx.degisken_ismi() ) ;
		
		String deðiþken_ismi = ctx.degisken_ismi().getText() ;
		
	//System.out.println ( "array deðiþken tür : " + deðiþken.tür ) ;
	//System.out.println ( "array deðeri : " + deðiþken.deðer ) ;
		
	
		if  ( deðiþken.tür.equals(  this.STRING ) ) 
		{
			Özellikler yen = new Özellikler ( ) ;
			
			if  ( ctx.ifadeler().size() != 1 )
			{
				System.out.println ( "Karakter türünün yanlýzca bir boyutta indeksi olabilir..." ) ;
				Özellikler yeni = new Özellikler ( )  ;
				yeni.tür = "HATA" ;
				yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
				
			}
			Özellikler index = ( Özellikler ) visit ( ctx.ifadeler( 0 ) ) ;
			
			if ( !index.tür.equals( "TAMSAYI") )
			{
				System.out.println( "Karakter türüyle yanlýzca Tamsayý türünden indeksler kullanýlabilir.Örn: 1 , 2 ... " ); 
				Özellikler yeni = new Özellikler ( )  ;
				yeni.tür = "HATA" ;
				yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
			}
			
			yen.tür = STRING ;
			yen.deðer =  ( ( String )deðiþken.deðer ).charAt( (int) index.deðer ) + "" ; 
			//System.out.println ( "deðiþken deðer : " + ( ( String )deðiþken.deðer ).charAt( (int) index.deðer )) ;
			//System.out.println ( "Geri dönülen karakter : " + yen ) ;
			return yen ;
		}
		else 
		if ( !deðiþken.tür.equals( "ARRAY") )
	{
		System.out.println ( ctx.degisken_ismi().getText() + " deðiþkeni bir array deðþkeni deðil ve [ ] iþleçleriyle kullanýlamaz..." ) ;
		Özellikler yeni = new Özellikler ( )  ;
		yeni.tür = "HATA" ;
		yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
	}
	
	ArrayList eleman_indeks_sýrasý = new ArrayList ( ) ;
	
	
	//Burasý arrayin elemanlarýna kademe kademe ulaþtýðýmýz yer
	//Eðer array olmayan bir elemanla karþýlaþýlýrsa ve hala [] iþleci varsa hata veriyoruz...
	for ( int a = 0 ; a< ctx.ifadeler().size() ; a++  )
	{
		Özellikler index = ( Özellikler ) visit ( ctx.ifadeler( a ) ) ;
		if ( !index.tür.equals(TAMSAYI) && !index.tür.equals(STRING) )
		{
			System.out.println ( "Arrayin indeksi bir tamsayý yada string olmalýdýr..." ) ;
			Özellikler yeni = new Özellikler ( )  ;
			yeni.tür = "HATA" ;
			yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
		}
		
		//System.out.println ( "Ýndex deðer : " + index.deðer ) ;
	
		if ( deðiþken.tür.equals( STRING ) )
		{
			Özellikler c = new Özellikler ( ) ;
			c.tür = STRING ;
			
			if ( index.tür.equals( "TAMSAYI" ) ) 
			{
				try
				{
				c.deðer = ( ( String ) deðiþken.deðer).charAt( ( int ) index.deðer ) +"" ;  
				}
				catch ( Exception err )
				{
					System.out.println ( "indekleme hatasý Karakter deðerinde " + index.deðer + " indeksi bulunmamaktadýr..." ) ;
					Özellikler yeni = new Özellikler ( )  ;
					yeni.tür = "HATA" ;
					yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
					
					return yeni ;
				}
				deðiþken = c ;
				continue ;
			}
			else
			{
				System.out.println ( "Þu anda indeksleme yapýlan tür Karakter. Karakter için " + index.tür + " ile indeksleme yapýlamaz Tamsayý olmalýdýr..." ) ;
				Özellikler yeni = new Özellikler ( )  ;
				yeni.tür = "HATA" ;
				yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
			}
			
		}else 
		if ( !deðiþken.tür.equals( "ARRAY" ) )
	{
		System.out.println ( "Þu an ki deðiþken bir array deðil bu yüzden '" + index.deðer + "' ile indekslenemez..." ) ;
		Özellikler yeni = new Özellikler ( )  ;
		yeni.tür = "HATA" ;
		yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
		
	}
		
		Özellikler array_elemaný = null;
		try
		{
		array_elemaný = ( Özellikler )  ( ( HashMap ) deðiþken.deðer ).get( "" +  index.deðer ) ;
	
		if ( array_elemaný == null ) 
		{
		//Eðer atama iþlemi yapýlmýyorsa hata verilecek bu durumda çünkü eleman yok indekste...
			if ( this.array_elamanýna_deðer_atama == false )
			throw new IndexOutOfBoundsException ( ) ;
			
			//yeni oluþturulan elemanýn türü YOK olacak bu tür her türe atanabilir olacak...
		Özellikler temp = new Özellikler ( ) ;
		
		//Burasý önemli; olmayan bir indekse olmayan bir indeks atýlýrsa bir önceki mutlaka HashMap olmalý....
		//Eðer sadece olmayan indeks var buraya da türü olmayan boþ bir eleman atýlacak ve atamada bu boþ eleman doldurulacak..
		if ( a +1 == ctx.ifadeler().size() )
		{
		temp.tür = "YOK" ;
		temp.deðer = null ;
		}
		else
		{temp.tür = "ARRAY" ;
		temp.deðer = new HashMap<String, Özellikler> ( );
			
		}
			( ( HashMap ) deðiþken.deðer ).put( ""+index.deðer , temp  ) ;
			array_elemaný = temp ;
		//	return temp ;
		
		
		
		}
		
	//	System.out.println( "Array elemaný : " + array_elemaný.deðer );
		
		eleman_indeks_sýrasý.add( index.deðer  ) ;
		}
		catch ( java.lang.IndexOutOfBoundsException err )
		{
			eleman_indeks_sýrasý.add ( index.deðer ) ;
			String message = "" + deðiþken_ismi;
			for ( int b = 0 ; b< eleman_indeks_sýrasý.size() ; b++ )
		    {
			message += "["+eleman_indeks_sýrasý.get(b)+"]" ;
				
			}
			
		//	System.out.println ( "Current hash : " + ( ( HashMap ) deðiþken.deðer ) ) ;
			System.out.println ( message+ " elemaný arrayda bulunmuyor indeks sýnýr aþýmý..." ) ;
			Özellikler yeni = new Özellikler ( )  ;
			yeni.tür = "HATA" ;
			yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
		}
	    
	    deðiþken = array_elemaný ;
		
	
	
	}
	
	
	
	
	
	return deðiþken ;
	
	}
	
	
	
	
	
	
	
	
	public Object visitArray_list_hazirlandi(DilParser.Array_list_hazirlandiContext ctx) { 
	
		Özellikler yeni = new Özellikler ( ) ;
		
		yeni.tür = ARRAY ;
		HashMap<String , Özellikler> liste = new HashMap<String , Özellikler> ( ) ;
		
		//Ýfadeleri tek tek array liste atýyoruz....
		for ( int a = 0 ; a < ctx.ifadeler().size() ; a++ ) 
		{
			//Burada indexler 0 dan baþlayýp elemanlarý hashmap yerleþtiriyoruz...
			liste.put( ""+a , (Özellikler) visit ( ctx.ifadeler( a ) ) ) ;
			
		}
	yeni.deðer = liste ;
		
		//System.out.println ( "array list hazýrlandý : " + yeni.deðer) ;
		
		
		//Oluþturulan listeyi geri döndürüyoruz...
	return yeni ;
	
	}
	
	public Object visitDegisken_deger_al(DilParser.Degisken_deger_alContext ctx) { 
		
		return visit(ctx.degisken_ismi());
		
	
	}
	
	
//Þu anki scopta deðiþkenin kendisini elde edebilmek için yazýldý...
	//Visit yeni oluþturulan deðiþkenin kendisini geri döndürmüyor...
	//try catch yapýsýnda kullanýlýyor...
public Object deðiþken_getir ( String deðiþken_ismi) { 
	

		
		
		
		//System.out.println ( "visitDeðiþken_deger_Al" ) ;
		String deðiþken = deðiþken_ismi ;
		FunctionTable son_kayýt = this.fonksiyon_stack.peek() ;
		
		//System.out.println ( "Ýstenilen deðiþken ismi : " + deðiþken ) ;
		
		
		HashMap eleman_alýnacak_mem = son_kayýt.lokal_deðiþken_memory ;
		if  ( this.structure_current_mem.empty() )
		{
			
		}
		else
		{
			eleman_alýnacak_mem = (HashMap) this.structure_current_mem.peek().deðer ;
	//	System.out.println ( "structure eleman mem : " + eleman_alýnacak_mem ) ;
	//	System.out.println ( "structure da Aranan deðiþken " + deðiþken )  ;
		
		if ( eleman_alýnacak_mem.containsKey ( deðiþken ))
		{
			
		}
		else
		{
		System.out.println ( deðiþken + " "  +  this.structure_current_mem.peek().tür + " yapýsýnýn bir elemaný deðil..." ) ;	
		Özellikler yeni = new Özellikler ( )  ;
		yeni.tür = "HATA" ;
		yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
		}
		
		
		Özellikler bulunan__ =  (Özellikler) eleman_alýnacak_mem.get( deðiþken ) ;
		if ( bulunan__.tür == "REFERANS" )
		{
			if ( this.referans_deðiþkeni_durumu.equals( KENDÝSÝ ) )
			{
				
			}
			else
			{//System.out.println ( "refer edilen dönecek..." ) ;
			
				
				bulunan__ = (Özellikler) bulunan__.deðer ;
				//System.out.println ( "Refer edilen : " + bulunan__) ;
			}
			
		}
		else if ( bulunan__.tür.equals( "DÝNAMÝK" ) )
		{
			if ( this.dinamik_deðiþkeni_durumu.equals( KENDÝSÝ))
		{
			
			
		}else 
		{
			bulunan__ = ( Özellikler ) bulunan__.deðer ;
		}
		
		}
		
		return bulunan__ ;
		
		
		
		
		}
		if ( !eleman_alýnacak_mem.containsKey( deðiþken ) )
		{
		
			//Eðer hiç bir fonksiyon çaðrýlmadýysa hata mesajý ver...
			if ( son_kayýt.number == 0 )
			{
		System.out.println ( "Daha önce " + deðiþken + " tanýmlanmamýþ..." ) ;
		Özellikler yeni = new Özellikler ( )  ;
		yeni.tür = "HATA" ;
		yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
			}
			else if ( son_kayýt.number == 1 )
			{
				if ( !son_kayýt.previous_function_table.lokal_deðiþken_memory.containsKey( deðiþken ) )
				{System.out.println ( "Daha önce " + deðiþken + " tanýmlanmýþ..." ) ;
				Özellikler yeni = new Özellikler ( )  ;
				yeni.tür = "HATA" ;
				yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
					
				}
				
				
				
				
				Özellikler bulunan__ =  (Özellikler) son_kayýt.previous_function_table.lokal_deðiþken_memory.get( deðiþken ) ;
				if ( bulunan__.tür == "REFERANS" )
				{
					if ( this.referans_deðiþkeni_durumu.equals( KENDÝSÝ ) )
					{
						
					}
					else
					{//System.out.println ( "refer edilen dönecek..." ) ;
					
						
						bulunan__ = (Özellikler) bulunan__.deðer ;
						//System.out.println ( "Refer edilen : " + bulunan__) ;
					}
					
				}
				else if ( bulunan__.tür.equals( "DÝNAMÝK" ) )
				{
					if ( this.dinamik_deðiþkeni_durumu.equals( KENDÝSÝ))
				{
					
					
				}else 
				{
					bulunan__ = ( Özellikler ) bulunan__.deðer ;
				}
				
				}
				
				return bulunan__ ;
				
			}
			else if ( son_kayýt.number>=2)
			{
				
				if ( !this.fonksiyon_stack.get(0) .lokal_deðiþken_memory.containsKey( deðiþken ))
				{
					System.out.println ( "Daha önce " + deðiþken + " tanýmlanmýþ..." ) ;
					Özellikler yeni = new Özellikler ( )  ;
					yeni.tür = "HATA" ;
					yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
					
					return yeni ;
				}
				
				
				
				
			//Þu kýsmý fonksiyonlara parametre geçiriken kullanacaðýz...	
				/* if ( !son_kayýt.previous_function_table.lokal_deðiþken_memory.containsKey(deðiþken) )
				{
					if ( !this.fonksiyon_stack.get(0) .lokal_deðiþken_memory.containsKey( deðiþken ))
					{
						System.out.println ( "Daha önce " + deðiþken + " tanýmlanmýþ..." ) ;
						System.exit( 0 ); 
					}
					
					return this.fonksiyon_stack.get(0 ).lokal_deðiþken_memory.get( deðiþken ) ;
							
					
				}
				*/
				
				Özellikler bulunan__ =  (Özellikler) this.fonksiyon_stack.get(0 ).lokal_deðiþken_memory.get( deðiþken ) ;
				if ( bulunan__.tür.equals( "REFERANS"))
				{	if ( referans_deðiþkeni_durumu .equals( KENDÝSÝ ) )
					{
						
						
					}
					else {
						
						bulunan__ = (Özellikler) bulunan__.deðer ;
					///System.out.println( "Refer edilen : dönülecek  deðeri : " + bulunan__ );
					}
				}
				else if (  bulunan__.tür.equals( "DÝNAMÝK" ) )
					{
					
					if ( this.dinamik_deðiþkeni_durumu.equals( KENDÝSÝ ) ) 
					{
						
						
					}
					else {
						bulunan__ = (Özellikler) bulunan__.deðer ;
					}
					
					
					
				}
				
					return bulunan__;
					
				
			}
			
			
			
			
		}
		else
		{
			if ( this.structure_current_mem.empty() )
			{
				
			}
			else
			{
				System.out.println ( deðiþken + " "  + this.structure_current_mem.peek().tür + " elemaný deðildir..."  ) ;
				Özellikler yeni = new Özellikler ( )  ;
				yeni.tür = "HATA" ;
				yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
			}
			
			
		}
	
	
		Özellikler bulunan__ = ( Özellikler)  eleman_alýnacak_mem.get( deðiþken ) ;
	if ( bulunan__.tür.equals( "REFERANS"))
	{
		if ( referans_deðiþkeni_durumu .equals( KENDÝSÝ ) )
		{
			///System.out.println ( "Kendisi isteniyor..." ) ;
			
		}
		else {
			bulunan__ = (Özellikler) bulunan__.deðer ;
			//System.out.println( "Refer edilen : dönülecek  deðeri : " + bulunan__ );
			return bulunan__ ;
			
		}
	}
	else if (  bulunan__.tür.equals( "DÝNAMÝK" ) )
	{
	
	if ( this.dinamik_deðiþkeni_durumu.equals( KENDÝSÝ ) ) 
	{
		
		
	}
	else {
	
		bulunan__ = (Özellikler) bulunan__.deðer ;
	//	System.out.println( "Dinamik deðiþkenin tutttuðu deðer döndürülecek deðer : " + bulunan__  );
		
	
	
	}
	
	
	
}

	
	
	
		return bulunan__  ;
		
		
		
		
	}
	
	
	
	
	public Object visitDegisken_deger(DilParser.Degisken_degerContext ctx) { 
	

		
		
		
		
		
		
		//System.out.println ( "visitDeðiþken_deger_Al" ) ;
		String deðiþken = ctx.getText() ;
		FunctionTable son_kayýt = this.fonksiyon_stack.peek() ;
		
		//System.out.println ( "Ýstenilen deðiþken ismi : " + deðiþken ) ;
		if ( this.son_çaðrýlan_fonksiyon_türü.isEmpty() == false );
		//System.out.println ( "En son çaðrýlan fonksiyon türü : " + this.son_çaðrýlan_fonksiyon_türü.peek() );
		
		// System.println ( "this.strucutre_current_mem : " + this.structure_current_mem.empty() ) ;
		
		
		
		
		
		HashMap eleman_alýnacak_mem = son_kayýt.lokal_deðiþken_memory ;
		if  ( this.structure_current_mem.empty() )
		{
			
		}
		else
		{
			eleman_alýnacak_mem = (HashMap) this.structure_current_mem.peek().deðer ;
	//	System.out.println ( "structure eleman mem : " + eleman_alýnacak_mem ) ;
	//	System.out.println ( "structure da Aranan deðiþken " + deðiþken )  ;
		
		if ( eleman_alýnacak_mem.containsKey ( deðiþken ))
		{
			
		}
		else
		{
		System.out.println ( deðiþken + " "  +  this.structure_current_mem.peek().tür + " yapýsýnýn bir elemaný deðil..." ) ;	
		Özellikler yeni = new Özellikler ( )  ;
		yeni.tür = "HATA" ;
		yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
		}
		
		
		Özellikler bulunan__ =  (Özellikler) eleman_alýnacak_mem.get( deðiþken ) ;
	//	System.out.println ("Aranan deð : " + bulunan__ ) ;
		if ( bulunan__.tür == "REFERANS" )
		{
			if ( this.referans_deðiþkeni_durumu.equals( KENDÝSÝ ) )
			{
				
			}
			else
			{//System.out.println ( "refer edilen dönecek..." ) ;
			
				
				bulunan__ = (Özellikler) bulunan__.deðer ;
				//System.out.println ( "Refer edilen : " + bulunan__) ;
			}
			
		}
		else if ( bulunan__.tür.equals( "DÝNAMÝK" ) )
		{
			if ( this.dinamik_deðiþkeni_durumu.equals( KENDÝSÝ))
		{
			
			
		}else 
		{
			bulunan__ = ( Özellikler ) bulunan__.deðer ;
		}
		
		}
		
		return bulunan__ ;
		
		
		
		
		}
		
		
		if ( !eleman_alýnacak_mem.containsKey( deðiþken ) )
		{
		
			//Eðer hiç bir fonksiyon çaðrýlmadýysa hata mesajý ver...
			if ( son_kayýt.number == 0 )
			{
		System.out.println ( "Daha önce " + deðiþken + " tanýmlanmamýþ..." ) ;
		Özellikler yeni = new Özellikler ( )  ;
		yeni.tür = "HATA" ;
		yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
			}
			else if ( son_kayýt.number == 1 )
			{
				
				boolean sýnýfta = false ;
				Özellikler sýnýfta_bulunan = null ;
				
				if ( !son_kayýt.previous_function_table.lokal_deðiþken_memory.containsKey( deðiþken ) )
				{
					//Ýçerde yapmakla local deðiþkenler sýnýf deðiþkenlerini bloke ediyorlar...
				//	System.out.println ( "**********Sýnýfta Aranacak...*********" ) ;
			if ( this.son_çaðrýlan_fonksiyon_türü.peek().equals ( "SINIF" ) )
			{
				//System.out.println ( "deðiþken__ : " + deðiþken ) ;
			//	System.out.println ( "sýnýfýn memorisi : " + this.sýnýf_memory_stack.peek ( ) );
				
				
			//	System.out.println ( "Saim SUNEL" ) ;
			if ( this.sýnýf_memory_stack.peek().containsKey( deðiþken ) )
			{
				sýnýfta_bulunan = ( Özellikler) this.sýnýf_memory_stack.peek ().get( deðiþken ) ;
		//	System.out.println ( "Sýnfta bulunan : " + sýnýfta_bulunan ) ;
				sýnýfta = true;
			}
			else
			{
					
					
					System.out.println ( "Daha önce " + deðiþken + " tanýmlanmamýþ..." ) ;
					Özellikler yeni = new Özellikler ( )  ;
					yeni.tür = "HATA" ;
					yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
					
					return yeni ;
			}
				
				
			}
			else
			{
					
					
					System.out.println ( "Daha önce " + deðiþken + " tanýmlanmamýþ..." ) ;
					Özellikler yeni = new Özellikler ( )  ;
					yeni.tür = "HATA" ;
					yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
					
					return yeni ;
			}
				
				
				}
				
				
				
				
				Özellikler bulunan__ =  (Özellikler) son_kayýt.previous_function_table.lokal_deðiþken_memory.get( deðiþken ) ;
				if ( sýnýfta == true  ) bulunan__ = sýnýfta_bulunan ;
			//	System.out.println ( "sýnýfta = " + sýnýfta ) ;
			//	System.out.println ( "Bulunan : " + bulunan__ ) ;
				
				
				if ( bulunan__.tür == "REFERANS" )
				{
					if ( this.referans_deðiþkeni_durumu.equals( KENDÝSÝ ) )
					{
						
					}
					else
					{//System.out.println ( "refer edilen dönecek..." ) ;
					
						
						bulunan__ = (Özellikler) bulunan__.deðer ;
						//System.out.println ( "Refer edilen : " + bulunan__) ;
					}
					
				}
				else if ( bulunan__.tür.equals( "DÝNAMÝK" ) )
				{
					if ( this.dinamik_deðiþkeni_durumu.equals( KENDÝSÝ))
				{
					
					
				}else 
				{
					bulunan__ = ( Özellikler ) bulunan__.deðer ;
				}
				
				}
				
				return bulunan__ ;
				
			}
			else if ( son_kayýt.number>=2)
			{
				
				boolean sýnýfta = false ;
				Özellikler sýnýfta_bulunan = null ;
				
				if ( !this.fonksiyon_stack.get(0) .lokal_deðiþken_memory.containsKey( deðiþken ))
				{
					
					if ( this.son_çaðrýlan_fonksiyon_türü.peek().equals ( "SINIF" ) )
					{
					if ( this.sýnýf_memory_stack.peek().containsKey(deðiþken ))
					{
						sýnýfta = true ;
						sýnýfta_bulunan = ( Özellikler ) this.sýnýf_memory_stack.peek().get( deðiþken ) ;
						
					}else
					{
						
						
						System.out.println ( "Daha önce " + deðiþken + " tanýmlanmamýþ..." ) ;
						Özellikler yeni = new Özellikler ( )  ;
						yeni.tür = "HATA" ;
						yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
						
						return yeni ;
				}
					
						
					}
					else
					{
						System.out.println ( "Daha önce " + deðiþken + " tanýmlanmamýþ..." ) ;
						Özellikler yeni = new Özellikler ( )  ;
						yeni.tür = "HATA" ;
						yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
						
						return yeni ;
					}
				
				}
				
				
				
				
			//Þu kýsmý fonksiyonlara parametre geçiriken kullanacaðýz...	
				/* if ( !son_kayýt.previous_function_table.lokal_deðiþken_memory.containsKey(deðiþken) )
				{
					if ( !this.fonksiyon_stack.get(0) .lokal_deðiþken_memory.containsKey( deðiþken ))
					{
						System.out.println ( "Daha önce " + deðiþken + " tanýmlanmýþ..." ) ;
						System.exit( 0 ); 
					}
					
					return this.fonksiyon_stack.get(0 ).lokal_deðiþken_memory.get( deðiþken ) ;
							
					
				}
				*/
				
				Özellikler bulunan__ =  (Özellikler) this.fonksiyon_stack.get(0 ).lokal_deðiþken_memory.get( deðiþken ) ;
				if ( sýnýfta == true ) bulunan__ = sýnýfta_bulunan ;
				
				if ( bulunan__.tür.equals( "REFERANS"))
				{	if ( referans_deðiþkeni_durumu .equals( KENDÝSÝ ) )
					{
						
						
					}
					else {
						
						bulunan__ = (Özellikler) bulunan__.deðer ;
					///System.out.println( "Refer edilen : dönülecek  deðeri : " + bulunan__ );
					}
				}
				else if (  bulunan__.tür.equals( "DÝNAMÝK" ) )
					{
					
					if ( this.dinamik_deðiþkeni_durumu.equals( KENDÝSÝ ) ) 
					{
						
						
					}
					else {
						bulunan__ = (Özellikler) bulunan__.deðer ;
					}
					
					
					
				}
				
					return bulunan__;
					
				
			}
			
			
			
			
		}
		else
		{
			if ( this.structure_current_mem.empty() )
			{
				
			}
			else
			{
				System.out.println ( deðiþken + " "  + this.structure_current_mem.peek().tür + " elemaný deðildir..."  ) ;
				Özellikler yeni = new Özellikler ( )  ;
				yeni.tür = "HATA" ;
				yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
			}
			
			
		}
	
	
		Özellikler bulunan__ = ( Özellikler)  eleman_alýnacak_mem.get( deðiþken ) ;
	if ( bulunan__.tür.equals( "REFERANS"))
	{
		if ( referans_deðiþkeni_durumu .equals( KENDÝSÝ ) )
		{
			///System.out.println ( "Kendisi isteniyor..." ) ;
			
		}
		else {
			bulunan__ = (Özellikler) bulunan__.deðer ;
			//System.out.println( "Refer edilen : dönülecek  deðeri : " + bulunan__ );
			return bulunan__ ;
			
		}
	}
	else if (  bulunan__.tür.equals( "DÝNAMÝK" ) )
	{
	
	if ( this.dinamik_deðiþkeni_durumu.equals( KENDÝSÝ ) ) 
	{
		
		
	}
	else {
	
		bulunan__ = (Özellikler) bulunan__.deðer ;
	//	System.out.println( "Dinamik deðiþkenin tutttuðu deðer döndürülecek deðer : " + bulunan__  );
		
	
	
	}
	
	
	
}

	
	
	
		return bulunan__  ;
		
		
		
		
	}
	
	
	public Object visitArray_deger(DilParser.Array_degerContext ctx) { return visit(ctx.array_listesi()); }
	
	
	
	 public Object visitIlk_degerli(DilParser.Ilk_degerliContext ctx) {
		 
		 Özellikler atanmýþ_deðer = ( Özellikler ) visit ( ctx.ifadeler() ) ;
			Özellikler yeni = new Özellikler ( ) ;
			String deðiþken_ismi = ctx.degisken_ismi().getText();
			deðiþken_türü = this.deðiþken_türü_stack.peek();
			boolean atandý = false ;
					//yeni oluþacak deðiþken staðýn en tepesindeki kayda oluþturulacak...
					FunctionTable son_kayýt = this.fonksiyon_stack.peek() ;
					
					HashMap ekleme_yapilacak_mem = son_kayýt.lokal_deðiþken_memory ;
					
					if ( this.ekleme_yapýlcak_structure_ismi.size() == 0 )
					if ( ekleme_yapilacak_mem.containsKey( deðiþken_ismi ) )
					{
					System.out.println ( "Daha önce " + deðiþken_ismi + " tanýmlanmýþ bir deðiþken var..." ) ;
					Özellikler yen = new Özellikler ( )  ;
					yen.tür = "HATA" ;
					yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
					
					return yen ;
						
						
					}
					
					if ( deðiþken_türü.equals( "Tamsayý" ) )
					{
						yeni.tür = TAMSAYI ;
						yeni.deðer = 0 ;
					}
					else if ( deðiþken_türü.equals( "NoktalýSayý"))
					{
						yeni.tür = NOKTALISAYI ;
						yeni.deðer = 0.0 ;
					}
					else if ( deðiþken_türü.equals ( "Bool" ) ) 
					{
						yeni.tür = "BOOL" ;
						yeni.deðer = false ;
					}
					else if ( deðiþken_türü.equals( "Karakter"  ) )
					{
						yeni.tür = STRING ;
						yeni.deðer = "" ;
					}
					else if ( deðiþken_türü.equals(  "Array" ) )
						
					{
						yeni.tür = ARRAY ;
						//Burada yeni bir array list oluþturmaya gerek yok çünkü assignment yapýldýðýnda zaten bir array list gelecek...
						yeni.deðer = null ;
						
					}
					else if ( deðiþken_türü.equals( "Dinamik"))
					{
						yeni.tür = DÝNAMÝK ;
						yeni.deðer = new Özellikler ( ) ;
					}
					else if ( this.sýnýf_tanýmlarý.containsKey( deðiþken_türü )  )
					{
					yeni.tür = "SINIF-" + deðiþken_türü ;
					yeni.deðer  = null ;				
						
						
					}
					else if ( this.structure_tanýmlarý.containsKey( deðiþken_türü ) )
					{
						DilParser.Degisken_grubu_tanimiContext yapý = this.structure_tanýmlarý.get( deðiþken_türü ) ;
						//iki global verimiz olacak biri structure deðikeninin ismi 
						//Stackýn içinde eleman olmasý deðiþkenlerin bir structureleman olduðunu gösteriyor...
					this.deðiþken_türü_stack.push( deðiþken_türü ) ;
						HashMap <String , Özellikler > memorisi = new HashMap <String , Özellikler> ( ) ;
						
						this.ekleme_yapýlcak_structure_ismi.push ( memorisi ) ;
						
						for ( int a  = 0 ; a < yapý.grup_degiskeni().size() ; a ++ )
						{
							
							visit ( yapý.grup_degiskeni(a ) ) ;
							
							
							
						}
						
						
						this.ekleme_yapýlcak_structure_ismi.pop ( );
						//Þu anki deðiþkenin ..
						//En son bu deðiþken eklenecek....
						
						yeni.tür = "STRUCTURE" + this.deðiþken_türü_stack.pop( ) ;
						yeni.deðer = memorisi ;
						//Ayný isim eleman var mý yada deðiþkenin türünü alýrken kullanacaðýz...
						
						//Kullanýcý Tamsayý a,b þeklinde iki deðiþken yaratmýþ olabilir bunlara dikkat et..
						
						if ( atanmýþ_deðer.tür == ARRAY )
						{
							
							
							//Atama iþlemleri sýra ile yapýlacak structure elemanlarýnýn
							//Dinamik ver Referans türlerine dikkat edilecek...
							int sað_taraf_index  = 0 ;
							for ( int a  = 0 ; a < yapý.grup_degiskeni().size() ; a ++ )
							{
								DilParser.Grup_degiskeniContext tanimlar = yapý.grup_degiskeni( a ) ;
							//	System.out.println ( tanimlar.getChild( 0 ).getChild( 0 ).getText() ) ;
								int h__ = 1 ;
								for ( int h = 0 ; h < tanimlar.getChild(0).getChildCount() /2 ; h +=1   )
								{
									String deðiþken_türü = tanimlar.getChild( 0 ).getChild(0).getText ( );
									String deðiþken_i = tanimlar.getChild ( 0 ).getChild( h__ ).getText () ;
									//System.out.println ( "deðiþken_i : " + deðiþken_i ) ;
									Özellikler sað_ = 
											(  (HashMap<String , Özellikler> ) ( atanmýþ_deðer.deðer ) ).get("" + sað_taraf_index ++); 
									
									//Referans ve Dinamikler burada atanacak...
									deðiþken_türü = deðiþken_türü.toUpperCase();
									if ( deðiþken_türü.equals ( "KARAKTER" ) ) deðiþken_türü = "STRING" ;
									if ( deðiþken_türü.equals( sað_.tür ) == false   )
									{
										System.out.println ( "Deðiþken Grubu elemaný " + deðiþken_i + " " + deðiþken_türü + " ona atanan deðer " + sað_.tür );
										Özellikler yen = new Özellikler ( )  ;
										yen.tür = "HATA" ;
										yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
										
										return yen ;
										
										
									}
									//Burada shallow copy problemi var düzelt...
									else 
									{
										
										Özellikler hafýzadaki = memorisi.get( deðiþken_i);
										hafýzadaki.deðer = sað_.deðer ;
										//System.out.println( "Hafýzadaki : " + hafýzadaki + " : sað tarafý : " + sað_.deðer ) ;
										
										
										
									}
									
									h__ += 2 ;
								}
								
								
							}
							
							
							
							
							
							atandý = true ;
							
							
						}
						else if ( atanmýþ_deðer.tür.contains( "STRUCTURE" ) )
						{
							 //Bir structure elemaný baþka bir structure elemaný ile oluþturulabilir...
							//Elemanlarý karþýlýklý olarak atanacak:....""
							
							
							
						}
						
						
						
						
						
					}
				//baþka yere eleman ekleme dikkat et structurea eleman ekleme	
				if ( yeni.tür.contains( "STRUCTURE" ) )
				{
					ekleme_yapilacak_mem.put( deðiþken_ismi , yeni ) ; 
					return new Özellikler ( ) ;
					
					
				}
				else
						
						if (   yeni.tür.equals( "DÝNAMÝK" ) )
					{
						
						yeni.deðer = atanmýþ_deðer ;
					
						ekleme_yapilacak_mem.put( deðiþken_ismi , yeni ) ; 
						return new Özellikler () ; 
						
						
					}else
					if ( atanmýþ_deðer.tür.equals( yeni.tür ) )
					{
						
						
						
					}
					
					else
					{
						System.out.println ( deðiþken_ismi + " deðiþkeni "+ deðiþken_türü + " olarak tanýmlanmýþ ancak atanan deðerin türü : " + atanmýþ_deðer.tür ) ;
						Özellikler yen = new Özellikler ( )  ;
						yen.tür = "HATA" ;
						yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
						
						return yen ;
						
					}
					
				//	yeni.tür = atanmýþ_deðer.tür ;
					//System.out.println ("Atanmýþ deðer : " + atanmýþ_deðer.deðer ) ;
					
					yeni.deðer = atanmýþ_deðer.deðer ;
					
					if ( !this.sýnýf_eriþim_stack.empty() )
					{
						yeni.eriþim_biçimi = this.sýnýf_eriþim_stack.peek() ;
					}
					
					if ( this.ekleme_yapýlcak_structure_ismi.size() != 0 )
					{
						ekleme_yapilacak_mem = this.ekleme_yapýlcak_structure_ismi.peek() ;
						ekleme_yapilacak_mem.put(  deðiþken_ismi , yeni ) ; 
					}
					else
					ekleme_yapilacak_mem.put( deðiþken_ismi , yeni ) ; 
					return  yeni  ;
					
					
					

	 }
		
	 public Object visitDegisken_grub(DilParser.Degisken_grubContext ctx) { 
		 
		Özellikler deðiþken = ( Özellikler ) visit ( ctx.degisken_grubu_elemani() ) ;
		this.structure_current_mem.push(  deðiþken ) ;
		if ( deðiþken.tür.substring(  0 ,9 ).equals( "STRUCTURE" ) )
		{
			
			
				Özellikler kl = ( Özellikler )  visit( ctx.structure_eleman() ) ;
				this.structure_current_mem.pop ( ) ;
				return kl ; 
			
			
		}
		else if ( deðiþken.tür.contains( "SINIF-" ) )
		{
			Özellikler kl = ( Özellikler ) visit ( ctx.structure_eleman() ) ;
			//System.out.println ( "Deðiþkenin eriþim biçimi : " + kl.eriþim_biçimi ) ;
			if ( kl.eriþim_biçimi .equals ("özel") ) 
			{
				System.out.println ( ctx.structure_eleman().getText () + " özel bir eleman, dýþarýdan eriþilemez..." ) ; 
				Özellikler yeni = new Özellikler ( )  ;
				yeni.tür = "HATA" ;
				yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
				
			}
			
			this.structure_current_mem.pop ( ) ;
			return kl ;
			
			
		}
		else
		{
			System.out.println ( ctx.degisken_grubu_elemani().getText() + " ifadesi bir deðiþken grubuna denk gelmiyor..." ) ; 
			
			Özellikler yen = new Özellikler ( )  ;
			yen.tür = "HATA" ;
			yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yen ;

		}
		
		
		//Buraya asla gelemeyecek....
		// return new Özellikler ( ) ;
	 
	 }
		
	 
	 
	 
	
	 public Object visitDegisken_grubu_elemani_elemani(DilParser.Degisken_grubu_elemani_elemaniContext ctx) {
		 String temp = this.referans_deðiþkeni_durumu ;
		 this.referans_deðiþkeni_durumu = REFER_ETTÝÐÝ ;
		Özellikler deðiþken = ( Özellikler ) visit ( ctx.structure_eleman( 0 ) ) ;
		this.referans_deðiþkeni_durumu = temp ;
		this.structure_current_mem.push( deðiþken ) ;
	//	System.out.println ( "dðeiþken tür : " + deðiþken.tür ) ;
		
		//Burasý problemli burasý düzeltilecek....
		if ( deðiþken.tür.contains("STRUCTURE" ) )
		{
			
				
				
				Özellikler k = (Özellikler) visit ( ctx.structure_eleman( 1 ) ) ;
				this.structure_current_mem.pop ( );
				return k ;
				
			
			
			
		}
		else if ( deðiþken.tür.contains ( "SINIF-" ) )
		{
			Özellikler k = (Özellikler) visit ( ctx.structure_eleman( 1 ) ) ;
			//System.out.println ( "Deðiþkenin eriþim biçimi : " + k.eriþim_biçimi ) ;
			
			if ( k.eriþim_biçimi .equals ("özel") ) 
			{
				System.out.println ( ctx.structure_eleman(1).getText () + " özel bir eleman, dýþarýdan eriþilemez..." ) ; 
				Özellikler yeni = new Özellikler ( )  ;
				yeni.tür = "HATA" ;
				yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
				
			}
			
			this.structure_current_mem.pop ( );
			return k ;
			
		}
		else
		{
			System.out.println ( ctx.structure_eleman(0).getText ( ) + " bir deðiþken grubu deðil" ) ;
			Özellikler yeni = new Özellikler ( )  ;
			yeni.tür = "HATA" ;
			yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
			
		}
		 
		 //Asla buraya gelemeyecek ama derleyicinin hatasý için...
		// return new Özellikler ( ) ;
		 
	 }
		
	 
	 
	 
	 public Object visitDegisken_grubu_eleman(DilParser.Degisken_grubu_elemanContext ctx) { 
		 return visit(ctx.degisken_grubu_elemani()); 
		 
	 }
		
	 
	 
	 
	 
	
	
	public Object visitSadece_isim(DilParser.Sadece_isimContext ctx) { 
		
		
		Özellikler yeni = new Özellikler ( ) ;
String deðiþken_ismi = ctx.degisken_ismi().getText();
deðiþken_türü = this.deðiþken_türü_stack.peek();
		//yeni oluþacak deðiþken staðýn en tepesindeki kayda oluþturulacak...
		FunctionTable son_kayýt = this.fonksiyon_stack.peek() ;
		
		HashMap ekleme_yapilacak_mem = son_kayýt.lokal_deðiþken_memory ;
		
		if ( this.ekleme_yapýlcak_structure_ismi.size() == 0 )
		if ( ekleme_yapilacak_mem.containsKey( deðiþken_ismi ) )
		{
		System.out.println ( "Daha önce " + deðiþken_ismi + " tanýmlanmýþ bir deðiþken var..." ) ;
		Özellikler yen = new Özellikler ( )  ;
		yen.tür = "HATA" ;
		yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
		
		return yen ; 
			
			
		}
		
		if ( deðiþken_türü.equals( "Tamsayý" ) )
		{
		
			yeni.tür = TAMSAYI ;
			yeni.deðer = 0 ;
	
		
		}
		else if ( deðiþken_türü.equalsIgnoreCase( "Bool" ))
		{
			yeni.deðer = "BOOL" ;
		yeni.deðer = false ;	
		
		}
		else if ( deðiþken_türü.equals( "NoktalýSayý"))
		{
		
			yeni.tür = NOKTALISAYI ;
			yeni.deðer = 0.0 ;
	
		}
		else if ( deðiþken_türü.equals( "Karakter"  ) )
		{
			yeni.tür = STRING ;
			yeni.deðer = "" ;
		}
		else if ( deðiþken_türü.equals ( "Array" ) )
		{
			yeni.tür = ARRAY ;
			yeni.deðer = new HashMap<String , Özellikler> ( );
		
		}
		else if ( deðiþken_türü.equals("Dinamik") )
		{
			yeni.tür = "DÝNAMÝK" ;
			yeni.deðer = new Özellikler () ; 
		}
		else  //structure tanýmý ise  
		{
			//önce tanýmlý diye bakýyoruz...
			
			
			if ( this.sýnýf_tanýmlarý.containsKey( deðiþken_türü ) && this.structure_tanýmlarý.containsKey ( deðiþken_türü ) )
			{
				System.out.println(  deðiþken_türü + " hem Sýnýf hem de deðiþken türü olarak tanýmlanmýþ...."   );
				Özellikler yen = new Özellikler ( )  ;
				yen.tür = "HATA" ;
				yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yen ;
			}
		else if ( this.sýnýf_tanýmlarý.containsKey ( deðiþken_türü ) )
			{
				
			yeni.tür = "SINIF-" + deðiþken_türü ;
			yeni.deðer = null ;
			
			
			
			
			}
			else			
			if ( this .structure_tanýmlarý.containsKey( deðiþken_türü ) )
			{
				
				DilParser.Degisken_grubu_tanimiContext yapý = this.structure_tanýmlarý.get( deðiþken_türü ) ;
				//iki global verimiz olacak biri structure deðikeninin ismi 
				//Stackýn içinde eleman olmasý deðiþkenlerin bir structureleman olduðunu gösteriyor...
			this.deðiþken_türü_stack.push( deðiþken_türü ) ;
				HashMap <String , Özellikler > memorisi = new HashMap <String , Özellikler> ( ) ;
				
				this.ekleme_yapýlcak_structure_ismi.push ( memorisi ) ;
				
				for ( int a  = 0 ; a < yapý.grup_degiskeni().size() ; a ++ )
				{
					
					visit ( yapý.grup_degiskeni(a ) ) ;
					
					
					
				}
				
				
				this.ekleme_yapýlcak_structure_ismi.pop ( );
				//Þu anki deðiþkenin ..
				//En son bu deðiþken eklenecek....
				
				yeni.tür = "STRUCTURE" + this.deðiþken_türü_stack.pop( ) ;
				yeni.deðer = memorisi ;
				//Ayný isim eleman var mý yada deðiþkenin türünü alýrken kullanacaðýz...
				
			}
			else
			{
				
				System.out.println( deðiþken_türü + " ismi ile bir deðiþken grubu tanýmlanmamýþ...." );
				Özellikler yen = new Özellikler ( )  ;
				yen.tür = "HATA" ;
				yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yen ;
				
			}
			
			
			
		}
		
		if ( !this.sýnýf_eriþim_stack.empty() )
		{
			yeni.eriþim_biçimi = this.sýnýf_eriþim_stack.peek() ;
		}
		
		
		
		if ( this.ekleme_yapýlcak_structure_ismi.size() != 0 )
		{
			ekleme_yapilacak_mem = this.ekleme_yapýlcak_structure_ismi.peek() ;
			ekleme_yapilacak_mem.put(  deðiþken_ismi , yeni ) ; 
		}
		else
		ekleme_yapilacak_mem.put( deðiþken_ismi , yeni ) ; 
		return yeni ;
		
		
		
		
		
		
	
	}

	
	
	private String deðiþken_türü ;
	Stack<String> deðiþken_türü_stack = new Stack <String >() ;
	public Object visitDegisken_tanimla(DilParser.Degisken_tanimlaContext ctx) {
		
		//System.out.println ( "Deðiþken tanýmla..." ) ;
		
		deðiþken_türü  = ctx.degisken_turu().getText() ;
		//System.out.println ( "TÜR : " + deðiþken_türü ) ;
		deðiþken_türü_stack.push( deðiþken_türü ) ;
		for ( int a = 0 ; a < ctx.degisken_durum().size() ; a++ )
			visit ( ctx.degisken_durum( a ) ) ;
		
		
		
		this.deðiþken_türü_stack.pop() ;
		return new Özellikler ( ) ;
	}
	

	
	//Göster komutu kendinden sonra yazýlmýþ ifadeleri yada ifadeyi ekrana yazdýrýr...
	
	public Object visitGoster_command(DilParser.Goster_commandContext ctx) {
	
		//Göster komutundan sonra birden fazla ifade olabilir her birini soldan saða gezerek ekrana yazdýrýyoruz...
		for ( int a = 0 ; a < ctx.ifadeler().size() ; a++ )
		{
			Özellikler ifade_ = ( Özellikler ) visit ( ctx.ifadeler( a )  ); 
		
			
			
		   
			System.out.println ( ifade_.deðer ) ;
			//JOptionPane.showMessageDialog ( null , "Ekrana yazýlacak.." );		
		if(this.pencere != null)
			this.pencere.ekrana_yaz( "" + ifade_.deðer  );
		}
		
		//Bu fonksiyonun bir þey döndürmesine gerek yok...
		return null ;
		
		
	
	}
	
	//Bu iki ifadeyi çarpacak yada bölecek ( tabiki stringler dahil deðil ) ve sonucu gene tamsayý yada noktalý sayý olarak geri
	//Döndürecek...
	public Object visitCarpma_bolme(DilParser.Carpma_bolmeContext ctx) { 
		
		Özellikler ilk_ifade = ( Özellikler )visit ( ctx.ifadeler( 0 ) ) ; //Soldaki ifadeyi elde ediyoruz önce..
		Özellikler ikinci_ifade = ( Özellikler ) visit ( ctx.ifadeler ( 1 ) ) ; //Saðdaki ifadeyide elde ediyoruz...
		//Eðer ifadelerden herhangi biri stringse hata ver çünkü çarpma ve bölme stringler için tanýmlý deðil...
		if  ( ilk_ifade.tür.equals( STRING ) || ikinci_ifade.tür.equals( STRING ) ) 
		{
			if ( ctx.opt.getText().equals( "*" ) )
			System.out.println ( "Stringlerle çarma iþlemi yapýlamaz...."  );
			else System.out.println ( "Stringlerle bölme iþlemi yapýlamaz..." ) ;
			Özellikler yeni = new Özellikler ( )  ;
			yeni.tür = "HATA" ;
			yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
		}
		
		// double * integer = double ( hata vermeyeceðiz... )
		//double + integer = double ( hata vermeyeceðiz... )
		//integer / double or double / integer = double
		//integer / integer = integer....
	
		//Sonucun atýlacaðý deðiþken
		Özellikler yeni = new Özellikler ( ) ;
		
		//Eðer herhangi bir taraf noktalý sayý ise sonuçta noktalý sayý olacak...
		if ( ilk_ifade.tür.equals( NOKTALISAYI )  || ikinci_ifade.equals(NOKTALISAYI) ) 
		{
			
			double ilk_sayý =  ilk_ifade.tür.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf( ilk_ifade.deðer ) ) : (Double)ilk_ifade.deðer ;
			double ikinci_sayý = ikinci_ifade.tür.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf( ikinci_ifade.deðer ) ) : (Double)ikinci_ifade.deðer ;
			yeni.tür = NOKTALISAYI ;
			
			if ( ctx.opt.getText().equals("*" ) )
				yeni.deðer = ilk_sayý * ikinci_sayý ;
			else yeni.deðer = ilk_sayý / ikinci_sayý ;
				
			
			
		}
		else
		{
			yeni.tür = TAMSAYI ;
			int ilk_sayý = ( int ) ilk_ifade.deðer ;
			int ikinci_sayý = ( int ) ikinci_ifade.deðer ;
			
		if ( ctx.opt.getText().equals("*" ) )
			yeni.deðer = ilk_sayý * ikinci_sayý ;
		else yeni.deðer= ilk_sayý / ikinci_sayý ;
			
			
		}
		
		
		
		return yeni ;
		
		
	
	}
	
	
	public Object visitToplama_cikarma(DilParser.Toplama_cikarmaContext ctx) {
		
		Özellikler ilk_ifade  = ( Özellikler ) visit ( ctx.ifadeler(  0 ) ) ; //soldaki ifadenin deðerinin alýyoruz...
		Özellikler ikinci_ifade = ( Özellikler ) visit ( ctx.ifadeler( 1 ) ) ; //Saðdaki ifadeninin deðerinin alýyoruz...
		//Eðer her hangi biri STRING ise + iþlemi geçerli - iþlemi geçersiz...
		
		//System.out.println ( "ilk ifade tür : " + ilk_ifade.tür + " deðer : " + ilk_ifade.deðer + " ikinci ifade tür : " + ikinci_ifade.tür + 
	//	"ikinci ifade deðer :" + ikinci_ifade.deðer) ;
		
		Özellikler yeni = new Özellikler ( ) ;
		
		
		if ( ilk_ifade.tür.equals( STRING ) || ikinci_ifade.tür.equals( STRING ) )
		{  //- iþlemiyse bu stringler için tanýmlý deðil...
			
			//System.out.println ( "Biri string..."  ) ;
			
			if ( ctx.opt.getText().equals("-" ) )
			{
				System.out.println ( "Stringlerle - iþlemi tanýmlý deðildir..." ) ;
				Özellikler yen = new Özellikler ( )  ;
				yen.tür = "HATA" ;
				yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
				
				return yen ;
			}
			else 
			{
				//Eðer bir string varsa ve iþlem + ise string concatanate yap....
			yeni.tür = STRING ;
			String gösterilecek ="";
			if  ( ilk_ifade.tür.equals ( "BOOL" ) )
			{
				if ( ( boolean ) ilk_ifade.deðer  == true )gösterilecek +="DOÐRU" ;
				else gösterilecek += "YANLIÞ" ;
			}
			else 
				gösterilecek += "" +ilk_ifade.deðer ;
			
			//System.out.println ( "Ýkinci_ifade : " + ikinci_ifade ) ;
			
			
			if  ( ikinci_ifade.tür.equals ( "BOOL" ) )
			{
				if ( ( boolean ) ikinci_ifade.deðer  == true )gösterilecek +="DOÐRU" ;
				else gösterilecek += "YANLIÞ" ;
			}
			else 
				gösterilecek += "" +ikinci_ifade.deðer ;
			
			
			
			yeni.deðer = "" + gösterilecek;
				
				
				
			}
			
			
		}
		
		else //Eðer hiçbiri string deðilse
		{
			//double + integer = double
			//integer + integer = integer
			
			if ( ilk_ifade.tür.equals( TAMSAYI) && ikinci_ifade.tür.equals( TAMSAYI ) ) 
			{
				int ilk_sayý = (int ) ilk_ifade.deðer ;
				int ikinci_sayý = (int) ikinci_ifade.deðer ;
				
				yeni.tür = TAMSAYI ;
				if ( ctx.opt.getText().equals( "+" ) )
					yeni.deðer = ilk_sayý + ikinci_sayý;
				else yeni.deðer = ilk_sayý - ikinci_sayý ;
				
			}
			else
			{
				double ilk_sayý = ilk_ifade.tür.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf(ilk_ifade.deðer ) ) : ( Double ) ilk_ifade.deðer ;
				double ikinci_sayý = ikinci_ifade.tür.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf(ikinci_ifade.deðer ) ) : ( Double ) ikinci_ifade.deðer ;
				yeni.tür = NOKTALISAYI ;
				if ( ctx.opt.getText().equals( "+" ) )
					yeni.deðer = ilk_sayý + ikinci_sayý ;
				else
					yeni.deðer = ilk_sayý - ikinci_sayý ;
				
				
				
			}
			
			
			
			
			
		}
		
		
		
		
	return yeni  ;
	}
	
	
	
	
	
	
	//Bu ( expr ) þeklindeki ifadeleri gezmek için
	public Object visitParantezli_ifade(DilParser.Parantezli_ifadeContext ctx) { 
		
		 //Sadece ifadeler kuralý ziyaret edilecek tüm childler deðil...
		return visit( ctx.ifadeler() ) ; 
		}
	
	//Bu fonksiyon noktalý sayýlar ya da tamsayýlar için karekök bulacak
	//Sonuç double türünden olacak
	public Object visitKarekok_islemi(DilParser.Karekok_islemiContext ctx) { 
		
		Özellikler deðer = ( Özellikler ) visit ( ctx.ifadeler() ) ;
		if ( deðer.tür == STRING )
		{
			System.out.println ( "Stringler sqrt iþlemiyle kullanýlamaz..." );
			Özellikler yeni = new Özellikler ( )  ;
			yeni.tür = "HATA" ;
			yeni.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
		}
		
		Özellikler yeni = new Özellikler ( ) ;
		yeni.tür = NOKTALISAYI ;
		
		yeni.deðer = Math.sqrt( Double.parseDouble (String.valueOf(deðer.deðer )  ) ) ;

	return yeni ;
	}

	//Fonksin üs alma iþlemini gerçeþleþtirecek...
	//int ^ int = int her hangi biri double olur sa sonuç da double
	public Object visitUslu_ifade(DilParser.Uslu_ifadeContext ctx) {
		
		Özellikler ilk_ifade = ( Özellikler ) visit ( ctx.ifadeler( 0 ) ) ;
		Özellikler ikinci_ifade = ( Özellikler ) visit ( ctx.ifadeler ( 1 ) ) ;
		
		Özellikler yeni = new Özellikler ( ) ;
		
		if ( ilk_ifade.tür.equals( STRING ) || ikinci_ifade.tür.equals( STRING  ) ) 
		{
			System.out.println ( "Stringler üs alma iþleciyle kullanýlamazlar..." );
			Özellikler yen = new Özellikler ( )  ;
			yen.tür = "HATA" ;
			yen.deðer = new Özellikler ( "KAPATMA" , null) ; 
			
			return yen ;
			
			
		}
		
		else if ( ilk_ifade.tür.equals( NOKTALISAYI ) || ikinci_ifade.tür.equals( NOKTALISAYI ) ) 
		{
			
			
			double ilk_sayý =  ilk_ifade.tür.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf( ilk_ifade.deðer ) ) : (Double)ilk_ifade.deðer  ;
			double ikinci_sayý = ikinci_ifade.tür.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf ( ikinci_ifade.deðer ) ) : ( Double ) ikinci_ifade.deðer ;
			
			
			yeni.tür = NOKTALISAYI ;
			yeni.deðer = Math.pow( ilk_sayý , ikinci_sayý  ) ;
			
	
			
		}
		else
		{
			Double ilk_sayý =  ilk_ifade.tür.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf( ilk_ifade.deðer ) ) : (Double)ilk_ifade.deðer  ;
			Double ikinci_sayý = ikinci_ifade.tür.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf ( ikinci_ifade.deðer ) ) : ( Double ) ikinci_ifade.deðer ;
			
			Double res = ( Math.pow( ilk_sayý , ikinci_sayý  ) );
			yeni.tür = TAMSAYI ;
			yeni.deðer =  res.intValue()  ;
			 
	
			
		}
		
		
		return yeni ;
		
	}
	
	
	
	
	//Bu fonksiyonda string türünde value su kullanýcýnýn yazdýðý text olan bir yapý geri döndürecek...
	public Object visitString_deger(DilParser.String_degerContext ctx) {
		
		Özellikler yeni = new Özellikler ( ) ;
		//Bu bir string deðeri
		yeni.tür = STRING ;
		yeni.deðer = "" ;
		//" iþaretlerini baþtan sondan siliniyor...
		String temp = ctx.getText().substring( 1 , ctx.getText().length() -1 );
		for ( int a = 0 ; a < temp.length() ; a++  )
		{
			if ( temp.charAt( a ) == '\\' )
			{
				if ( a < temp.length() )
					if ( temp.charAt( a+1 ) == 'n' )
					{	yeni.deðer += "\n" ;  a++ ;  continue ; }
				
			}
			
			yeni.deðer +=""+ temp.charAt( a ) ;
			
			
			
			
		}
		
		return yeni ;
	}
	
	//Bu fonksiyon geri TAMSAYI yada NOKTALI SAYI türünde bir deðer geri döndürecek
	//Tam sayý ve noktalý sayý ayrýmýný . karekterininin varlýðýndan ayýrt edeceðiz...
	public Object visitSabit_rakam_deger(DilParser.Sabit_rakam_degerContext ctx) { 
		String deðer = ctx.getText() ;
		Özellikler yeni = new Özellikler ( )  ;
		if ( deðer.contains( "." ) ) 
		{
			yeni.tür = NOKTALISAYI ;
			yeni.deðer = Double.parseDouble( deðer ) ;
		}
			else 
		{
			
				yeni.tür = TAMSAYI ;
				yeni.deðer = Integer.parseInt(  deðer ) ;
		}
		
		
		return yeni ;
		 
		
	}
	
	
	
}
