
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


D�ng� ( d�ng� l = ... ) burada d�ng� l de�i�kenini olu�turuyor
daha �nce l de�i�kenin olmas� problem ��z�m ?

*/





/*
 * S�n�flar�n fonksiyonlar�n� �a��r�rken ayr� bir class sta�� olu�turaca��z
 * a.fnc ( ) bu oldu�unda class sta��na a eleman�n ( sanki grup de�i�kleniymi� gibi sta�a basaca��z )
 * fonksiyonun i�indeki de�i�kenler �nce sta�a daha sonra sadece global alana bakacak de�i�kenler i�in...
 * Yoksa hata verilecek...
 * Stacka bir arraylist ataca��z
 *
 * class fonksiyonun i�inde global bir de�i�ken �a�r�lmas� problem olu�turabilir...
 * 
 * Ayr�ca enson �a�r�lan fonksiyon class fonksiyonumu yoksa global mi bunu da bir stackta tut....
 * Elemanlara eri�irken en son �a�r�lan fonksiyonun t�r�ne g�re global alana yada class�n alan�na eri�im sa�la...
 * 
 * 
 * 
 * 
 */

//Her bir de�i�kenin yada sabit de�erlerin bir t�r� ve de�eri olacak...
//�rne�in "saim" bu bir string t�r�nde ve value su = saim
class �zellikler implements Serializable,Cloneable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String t�r ;
	Object de�er ;
	//S�n�f de�i�kenleri i�in ....
	String eri�im_bi�imi = ""  ;
	public �zellikler ( ) 
	{
		
	}
	public �zellikler ( String t�r , Object de�er ) 
	{
		this.t�r = t�r ;
		this.de�er = de�er ;
	}
	public Object clone ( String t�r , Object de�er )
	{
		return new �zellikler (t�r, de�er );
		
		
	}
	
	public String toString ( ) 
	{
		return "[t�r:" + this.t�r + "-de�er:"+ this.de�er + "]" ;
 		
		
	}
	
	
}



public class TreeWalker extends DilBaseVisitor<Object>  {
private TurkishPLOutput pencere ;
	public TreeWalker ( TurkishPLOutput pencere )
	{this.pencere = pencere ;
		
		FunctionTable main_stack = new FunctionTable() ;
		main_stack.lokal_de�i�ken_memory = new HashMap ( ) ;
		main_stack.previous_function_table = null ;
		main_stack.number = 0 ;
		
		this.fonksiyon_stack.push( main_stack ) ;
		
	}
	
	private boolean array_elaman�na_de�er_atama = false ;
	
	
	
	
	class FunctionTable {
		
		
		HashMap lokal_de�i�ken_memory ;
		FunctionTable previous_function_table ;
		Object return_values ;
		
		int number ;
		
		
		
		
		
	}
	
	
	HashMap <String , String > de�i�ken_ismi_ve_t�r�_map = new HashMap<String, String> ( ) ;
	
	
	
	final String STRING="STRING" , TAMSAYI="TAMSAYI" , NOKTALISAYI="NOKTALISAYI" , ARRAY="ARRAY" , REFERANS = "REFERANS" , D�NAM�K = "D�NAM�K";
	
	private HashMap ekleme_i�in ;
	
	
	
	/*
	 * { 123 , 1254 , 14 } [2 ] b�yle bir yap� , f ( x ) [ 23 ] fonksiyon geri bir array d�nd�r�rse ?
	 * 
	 * 
	 */
	
	
	
	
	//De�i�kenin kendisi sade x -> a durumunda �a�r�lacak bunun d���nda hep refer edilen de�i�ken d�n�lecek...
	//Referans�n referans� yok ... Bu durumda referans�n refer etti�i de�i�ken refer edilecek...
	final String KEND�S� = "KEND�S�" , REFER_ETT��� = "REFERED�LEN" ;
	
	String referans_de�i�keni_durumu = REFER_ETT��� ;
	String dinamik_de�i�keni_durumu = REFER_ETT��� ;
	
	
	//Her bir fonksiyon �a�r�ld���nda ilgi fonksiyon i�in bir kay�t olu�turaca��z bu yap�yla fonksiyon i�lemini
	//bitirince pop edece�iz...
	//Her zaman program �al��maya ba�lay�nca bir tane kesin olu�turacak main fonksiyondaki de�i�kenler i�in...
	Stack<FunctionTable> fonksiyon_stack = new Stack<FunctionTable> ( );
	
	//Bu mapin i�erisinde tan�mlanan t�m structure yap�lar�n� bunun i�inde tutataca��z....
	//Structur�n ismi yap�n�n indexi olacak...
	HashMap<String , DilParser.Degisken_grubu_tanimiContext> structure_tan�mlar� = new HashMap<String, DilParser.Degisken_grubu_tanimiContext>() ; 
	
	//Bu �ok istisnai bir durumuda kullan�l�yor e�er bir structur�n i�inde bir structure de�i�keni tan�mlan�yor ise
	//de�i�ken olu�turma y�ndemi recursive e�er bir tane global de�i�kende tutarsak ikincisi global de�i�keni 
	//de�i�tiriyor onun yeri bir stack olu�turuyoruz her ekleme bunun peek teki de�i�ken ismine yap�l�yor...
	
	Stack<HashMap<String,�zellikler>> ekleme_yap�lcak_structure_ismi = new Stack <HashMap<String,�zellikler>> ( ) ;
	
	
	//Structure eleman�na eri�irken structur�n mapi bunun i�ine push edilecek , elemanlara eri�irken peek edilecek bu 
	//mem den al�nacak...
	Stack<�zellikler> structure_current_mem= new Stack<�zellikler> ( );
	HashMap<String , DilParser.Fonksiyon_tanimi_Context > tan�mlanm��_fonksiyonlar = new HashMap<String, DilParser.Fonksiyon_tanimi_Context> ( ) ;
	
	HashMap <String , DilParser.Matematik_fonksiyon_kaydiContext > matematik_fonksiyonlar� = new HashMap<String, DilParser.Matematik_fonksiyon_kaydiContext>  ( ) ;
	
	
	/*Daha �nce hi� yakalanmam�� hatay� en son main programda hata mesaj� vermek i�in program kural�n�n i�inde bildirimleri for loop 
	 * ile dola� e�er herhangi bir hata nesnesi d�nerse hata mesaj� ver ve program� kapat...
	 * 
	 * 
	 * 
	 * 
	*/
	
	//D�ng�lerin d���nda break yada continue komutlar�n�n kullan�m�n� engellemek i�in
	//Kullanaca��z...
	Stack< Integer > d�ng�_stack = new Stack< Integer > ( ) ;
	
	
//Break ve continue i�in birden fazla looptan ��kmak gerekiyor , bunun i�in hata nesnes at�yoruz...
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
		this.pencere.tu�_bekle ( ) ;
		while( this.pencere.b.tryAcquire() != true ) ;
			this.pencere.b.release(); 
			this.pencere.wait_key = false ;
			
			
			return new �zellikler  ( )
	 ;	
		
		
		
		
		
	
	}
	
	

	
	
	
	
	
	
	
	
	
	//Klavyeden veri almak i�in kullan�lan komut oku ( "comments" )
	
	public Object visitRead_komutu(DilParser.Read_komutuContext ctx) {
		
		
		return visit(ctx.oku_komutu()); 
		
	
	}
	
	
	
	
	Scanner klavye  = new Scanner ( System.in ) ;
	
	
	//Klavyeden input almak i�in 
	//Devaml� Karakter t�r�nde bilgi d�n�yor...
	public Object visitOku_command(DilParser.Oku_commandContext ctx) {
		
		
�zellikler yeni = new �zellikler ( ) ;
String inputtan_once ;
yeni.t�r = STRING ; //Klavyeden her girilen Karakter t�r�nden olacak...
�zellikler mesaj =  ( �zellikler )  visit ( ctx.ifadeler() ) ;
if ( !mesaj.t�r.equals ( STRING )  )
{
	System.out.println ( "oku komutunun parametresi Karakter t�r�nden olmak zorundad�r..." )  ;
	�zellikler yen = new �zellikler ( )  ;
	yen.t�r = "HATA" ;
	yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
	
	return yen ;
}

//Burada windowa da yazd�r�lacak...

System.out.print ( mesaj.de�er  ) ;
this.pencere.ekrana_yaz( ""+ mesaj.de�er );


System.out.print( "> ");
this.pencere.textArea.append ( "> ") ;
pencere.veri_al�nacak();

inputtan_once = this.pencere.textArea.getText();



while ( pencere.a.tryAcquire() == false 	) ;

pencere.a.release();
String inputtan_sonra = pencere.textArea.getText();

String fark = new String ( inputtan_sonra.toCharArray() , inputtan_once.length() , inputtan_sonra.length() - inputtan_once.length()-2) ;

System.out.println ( "�nputtan �nce : " + inputtan_once ) ;
System.out.println ( "�nputtan sonra : " + inputtan_sonra ) ;


System.out.println ( "Size : " + fark.length() ) ;

System.out.println( "Fark : " + fark + "----" );



yeni.de�er = fark ;


return yeni ;


		
	
	
	}
	
	//NULL ifadesinin kar��l���
	
	public Object visitYok_command(DilParser.Yok_commandContext ctx) {
		�zellikler yeni = new �zellikler ( ) ;
		 yeni.t�r = "YOK" ;
		 yeni.de�er = null ;
		 
		 return yeni ;
	}

	
	
	
	
	//T�r d�n���mleri yap�l�yor....
	//Kopyalama yap�lacak...
	public Object visitTur_degistir(DilParser.Tur_degistirContext ctx) { 
		
		String d�n��t�r�lecek_t�r = ctx.degisken_turu().getText ( ) ;
		�zellikler de�i�tirilecek_de�er = ( �zellikler ) visit ( ctx.ifadeler() ) ;
		�zellikler yeni = new �zellikler () ;
		
		switch ( d�n��t�r�lecek_t�r )
		{
		
		case "Karakter":
			
			switch ( de�i�tirilecek_de�er.t�r ) 
			{
			
			case TAMSAYI:		
				yeni.t�r = STRING ;
				yeni.de�er =  "" + de�i�tirilecek_de�er.de�er  ;
				
				break;
				
				
			case NOKTALISAYI:
				
				yeni.t�r = STRING ;
				yeni.de�er =  ""  + de�i�tirilecek_de�er.de�er   ;
				
				
				
				break ;
				
				
			case "BOOL":
				yeni.t�r = STRING ;
				
				if (   ( ( boolean ) de�i�tirilecek_de�er.de�er  ) == false ) yeni.de�er = "0" ;
				else yeni.de�er = "1" ;
				
				
				
				break;
				
				
			case STRING:
				yeni.t�r = STRING ;
				yeni.de�er = de�i�tirilecek_de�er.de�er ;
				
				
				
				
				break;
			
			
			
			
			
			}
		
			
			
			
			
			break;
			
			
		case "Tamsay�":
			
			
			switch ( de�i�tirilecek_de�er.t�r ) 
			{
			
			case TAMSAYI:		
				yeni.t�r = TAMSAYI ;
				yeni.de�er = de�i�tirilecek_de�er.de�er  ;
				
				break;
				
				
			case NOKTALISAYI:
				
				yeni.t�r = TAMSAYI ;
				yeni.de�er =   ( ( Double ) de�i�tirilecek_de�er.de�er ).intValue()  ;
				
				
				
				break ;
				
				
			case "BOOL":
				yeni.t�r = TAMSAYI;
				
				if ( ( ( boolean ) de�i�tirilecek_de�er.de�er ) == false  ) 
					yeni.de�er = 0 ;
				else yeni.de�er = 1 ;
				
				
				
				break;
				
				
			case STRING:
				yeni.t�r = TAMSAYI ;
				
				String de�er = ""+de�i�tirilecek_de�er.de�er ;
				//String tamamen rakam i�eriyor mu bak...
				try 
				{
				yeni.de�er = Integer.parseInt ( ""+ de�i�tirilecek_de�er.de�er ) ;
				}
				catch ( Exception u )
				{ 
					
					System.out.println ( "T�r d�n��t�rme hatas� ,T�r d�n���m� yaparken Karakter tipindeki de�er tamamen rakamlardan olu�mal�d�r..");
					�zellikler yen = new �zellikler ( )  ;
					yen.t�r = "HATA" ;
					yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
					
					return yen ;
				}
				
				
				
				break;
			
			
			
			
			
			}
		
			
			
			
			
			
			
			break ;
			
			
			
		case "Noktal�Say�":
			
			switch ( de�i�tirilecek_de�er.t�r ) 
			{
			
			case "TAMSAYI":		
				yeni.t�r = NOKTALISAYI ;
				yeni.de�er = Double.parseDouble( ""+ de�i�tirilecek_de�er.de�er ) ;
				
			break	;
				
				
			case NOKTALISAYI:
				
				yeni.t�r = NOKTALISAYI ;
				yeni.de�er = de�i�tirilecek_de�er.de�er ;
				
				
				
				break ;
				
				
			case "BOOL":
				yeni.t�r = NOKTALISAYI ;
				
				if ( ( ( boolean) de�i�tirilecek_de�er.de�er ) == false  ) 
					yeni.de�er = 0.0 ;
				else yeni.de�er = 1.0 ;
				
				
				
				break;
				
				
			case STRING:
				yeni.t�r = NOKTALISAYI ;
				try 
				{
				yeni.de�er =  Double.parseDouble( ""+de�i�tirilecek_de�er.de�er ) ;
				}
				catch ( Exception err ) 
				{
					System.out.println ( "T�r d�n���m hatas�...Karakter t�r�n� Noktal� say�ya d�n��t�r�l�rken Karakter de�erinin tamamen rakam ve bir adet .  i�erdi�ine emin olun..." ) ;
					�zellikler yen = new �zellikler ( )  ;
					yen.t�r = "HATA" ;
					yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
					
					return yen ;
					
				}
				
				
				
				break;
			
			
			
			
			
			}
		
			
			
			
			
			
			
			
			break; 
			
			
			
		case "Bool":
			switch ( de�i�tirilecek_de�er.t�r ) 
			{
			
			case TAMSAYI:		
				yeni.t�r = "BOOL" ;
				if ( ( (int  ) de�i�tirilecek_de�er.de�er  ) != 0 ) yeni.de�er = true ;
				else yeni.de�er = false  ;
				
				break ;
				
				
			case NOKTALISAYI:
				
				yeni.t�r ="BOOL" ;
				if ( !( ( Double  ) de�i�tirilecek_de�er.de�er  ).equals  ( 0.0 ) ) yeni.de�er = true ;
				else yeni.de�er = false  ;
				
				
				
				break ;
				
				
			case "BOOL":
				yeni.t�r = "BOOL";
			    yeni.de�er = de�i�tirilecek_de�er.de�er ;
				
				
				
				break;
				
				
			case STRING:
				yeni.t�r = "BOOL" ;
				if (! ( (String  ) de�i�tirilecek_de�er.de�er  ) .equals("") ) yeni.de�er = true ;
				else yeni.de�er = false  ;				
				
				
				
				break;
			
			
			
			
			
			}
		
			
			
			
			
			
			break ;
		
		
		
		}
		
		
	return yeni ;
	
	}

	
	 public Object visitSinif_fonksiyon_deger(DilParser.Sinif_fonksiyon_degerContext ctx) { 
		 
		
		 
		 return visit(ctx.sinif_fonksiyon_cagirma()); 
		 
	 
	 }
		
	
	
	
	
	//Globalde tan�mlanan b�t�n s�n�flar bunun i�ine at�lacak...
	HashMap <String , DilParser.Sinif_tanimlanmasiContext> s�n�f_tan�mlar� = new HashMap<String, DilParser.Sinif_tanimlanmasiContext>() ;
	
	 public Object visitSinif_tanimlanmasi(DilParser.Sinif_tanimlanmasiContext ctx) { 
	
		 String s�n�f_ismi = ctx.degisken_ismi().getText ( ) ;
		 
		 this.s�n�f_tan�mlar�.put( s�n�f_ismi , ctx ) ;
		 
		 //Geri bir �ey d�nmeye gerek yok...
		 return new �zellikler ( "","" );
			 
	 }

	 

	 //En son global mi yoksa bir s�n�f�n fonksiyonu mu �a�r�ld�
	 //elemanlara eri�irken �nemli...
	 Stack<String> son_�a�r�lan_fonksiyon_t�r� = new Stack<String > ( ) ;
	 
	 Stack<HashMap> s�n�f_memory_stack = new Stack<HashMap> ( ) ;
	 
	 public Object visitSinif_fonksiyon_cagirmasi(DilParser.Sinif_fonksiyon_cagirmasiContext ctx) {
		 
	�zellikler de�i�ken = ( �zellikler ) visit ( ctx.structure_eleman() ) ;
	if ( !de�i�ken.t�r.contains (  "SINIF-") )
	{
		System.out.println ( ctx.structure_eleman().getText ( ) + " bir S�n�f t�r�nden bir de�i�ken de�ildir..." ) ;
		�zellikler yeni = new �zellikler ( )  ;
		yeni.t�r = "HATA" ;
		yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
		
		
	}
	//*System.out.println ( "T�r : " + de�i�ken.t�r ) ;
	
	String s�n�f_ismi = de�i�ken.t�r.substring(6) ;
	
	//*System.out.println ( "S�n�f ismi : " + s�n�f_ismi ) ;
	
	
DilParser.Sinif_tanimlanmasiContext s�n�f_tan�m� = this.s�n�f_tan�mlar�.get( s�n�f_ismi ) ;
	

this.s�n�f_memory_stack.push ( (HashMap) de�i�ken.de�er );
this.son_�a�r�lan_fonksiyon_t�r�.push( "SINIF" ) ;

DilParser.Fonksiyon_callContext fnc_contex = (DilParser.Fonksiyon_callContext) ctx.fonksiyon_cagirilmasi() ;

//�a�r�lan fonksiyonun ismi al�yoruz...
String �a�r�lan_fonksiyon_ismi =fnc_contex.degisken_ismi().getText ( ) ;


DilParser.Sinif_fonksiyon_tanimiContext fnc_tanim = null ;
DilParser.Fonksiyon_tanimi_Context f_tanimi ;
boolean bulundu = false ;
//S�n�f tan�m�nda tan�mlanm�� fonksiyonlar� gezip i�inde �a�r�lan fonksiyon var m� diye bakaca��z...
for ( int  i = 0 ; i < s�n�f_tan�m�.sinif_fonksiyon_tanimi().size ( ) ; i ++ ) 

{
	fnc_tanim = s�n�f_tan�m�.sinif_fonksiyon_tanimi( i ) ;
	f_tanimi = (DilParser.Fonksiyon_tanimi_Context) fnc_tanim.fonksiyon_tanimi() ;
if ( �a�r�lan_fonksiyon_ismi.equals ( f_tanimi.degisken_ismi().getText() ) ) { bulundu = true ; break ; }

	
	
	
	
	
	
}


//E�er �a�r�lan s�n�f�n bir fonksiyonu de�ilse hata ver...
if ( bulundu==false )
{
	System.out.println ( �a�r�lan_fonksiyon_ismi + " " + s�n�f_ismi + " t�r�ne ait bir fonksiyon de�ildir..." ) ;
	�zellikler yeni = new �zellikler ( )  ;
	yeni.t�r = "HATA" ;
	yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
	
	return yeni ;
}

DilParser.Fonksiyon_callContext fonksiyon = (DilParser.Fonksiyon_callContext) ctx.fonksiyon_cagirilmasi() ;



//DEvam 


String fonksiyon_ismi = fonksiyon.degisken_ismi().getText ( ) ;
		
ArrayList ge�ilen_parametreler = new ArrayList () ;

if ( fonksiyon.ifadeler().isEmpty() == false )
{

//Ge�ilen parametreleri sonra kullanmak i�in array ekliyoruz...
for ( int b = 0 ; b < fonksiyon.ifadeler().size() ; b++ )
ge�ilen_parametreler.add(  visit ( fonksiyon.ifadeler( b ) ) ) ;
}
//System.out.println ( "parametreler" ) ;
//System.out.println ( ge�ilen_parametreler ) ;

DilParser.Fonksiyon_tanimi_Context �a�r�lan_fonksiyon = (DilParser.Fonksiyon_tanimi_Context) fnc_tanim.fonksiyon_tanimi();



HashMap<String , �zellikler > yeni_fonksiyonun_memorisi = new HashMap <String , �zellikler > (  ) ;

FunctionTable yeni_fonksiyon_tablosu = new FunctionTable ( )  ;
yeni_fonksiyon_tablosu.lokal_de�i�ken_memory = yeni_fonksiyonun_memorisi ;
yeni_fonksiyon_tablosu.previous_function_table = this.fonksiyon_stack.peek() ;
yeni_fonksiyon_tablosu.number = fonksiyon_stack.peek() .number + 1 ;
this.fonksiyon_stack.push( yeni_fonksiyon_tablosu ) ;

ArrayList<�zellikler> yeni_olu�turulan_de�i�kenler ;

//yeni fonksiyonda de�i�kenler olu�turuluyor...
for ( int j = 0 ; j < �a�r�lan_fonksiyon.fonksiyon_parametreleri().size ( ) ; j ++  )
{visit (  �a�r�lan_fonksiyon.fonksiyon_parametreleri( j ) ) ;
}

yeni_olu�turulan_de�i�kenler = new ArrayList<�zellikler> ( yeni_fonksiyonun_memorisi.values() ) ;
//System.out.println ( "Yeni olu�turulan de�i�kenler\n" + yeni_olu�turulan_de�i�kenler ) ;

//Hi� parametre ge�ilmese bile  , parametrelerin ge�erli de�erleri ou�turulurken otomatik ayarlanacak
//E�er kullan�c� isterse kendi de�erini default olarak atayabilir..
//Soldan sa�a do�ru kontrol edilecek...

//Parametre say�s�  az olabilir...

�zellikler sol_taraf , sa�_taraf  , tempo ;
for ( int n = 0 ; n < ge�ilen_parametreler.size() ; n++ ) 
{
�zellikler ge�ilen_par = (�zellikler) ge�ilen_parametreler.get( n ) ; 
�zellikler para = yeni_olu�turulan_de�i�kenler .get( n ) ;

//System.out.println ( "Ge�irilen parametre : " + ge�ilen_par ) ;
//System.out.println ( "Parametre de�i�keni : " + para ) ; 
sa�_taraf = ge�ilen_par ;
sol_taraf  = para;

tempo = sa�_taraf ;

if ( sa�_taraf.t�r.equals( "ARRAY") ) 
{
//System.out.println ( "Array objesi e�itleme "  ) ;

	
	
	//E�er array varsa bir tek bunun kopyas� olu�turulacak...
	
tempo = new �zellikler ( ) ;
tempo.t�r = sa�_taraf.t�r ;

ObjectOutputStream object_output = null ;
ByteArrayOutputStream output = new ByteArrayOutputStream() ;
try {
	 object_output = new ObjectOutputStream( output ) ;
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//System.out.println ( "Sa� taraf : " + sa�_taraf ) ;

try {
	object_output.writeObject( sa�_taraf );
} catch (IOException e1) {
	// TODO Auto-generated catch block
	System.out.println ( "Dosya yazma error " ) ;
	�zellikler yeni = new �zellikler ( )  ;
	yeni.t�r = "HATA" ;
	yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
	
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
�zellikler yeni = new �zellikler ( )  ;
yeni.t�r = "HATA" ;
yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 

return yeni ;
}


�zellikler copied = null ;

try {
	copied = (�zellikler) object_input.readObject( ) ;
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//	System.out.println ( "Clonlana array : " + cloned ) ;
//	System.out.println ( "Orjinal array : " + sa�_taraf.de�er ) ;
tempo.de�er = copied.de�er ;


}

//Sa� taraf array hari�se aynen kalacak...
sa�_taraf = tempo ;

//Burada Referans ve Dinamik veri t�rlerine dikkat edilecek....
//Bu hen�z o indekse de�er at�lmam�� array elemanlar�nda YOK t�r�nde bir �zellikler geri d�n�l�yor...
if ( sol_taraf.t�r.equals( "YOK" ) )
{
	sol_taraf.t�r = sa�_taraf.t�r ;
	sol_taraf.de�er = sa�_taraf.de�er ;
	
}
else if ( sol_taraf.t�r.equals("D�NAM�K") )
{
	
	((�zellikler)sol_taraf.de�er).de�er = sa�_taraf.de�er ;
	((�zellikler)sol_taraf.de�er).t�r  = sa�_taraf.t�r ;
	this.array_elaman�na_de�er_atama = false ;
	//sadece bo� bir nesne d�n�yoruz...
	
	this.dinamik_de�i�keni_durumu = REFER_ETT��� ;
	return new �zellikler ( ) ;
	
}
else if ( sol_taraf.t�r.equals( "REFERANS" ) ) 
{//System.out.println ( "Ref" );
	//Referab

	
	//System.out.println ( "Sol taraf : " + sol_taraf )  ;
//Bu durumda kontrol edilmesine gerek yok ��nk� referans�n ilk bir de�eri yok ...	
	(( �zellikler)sol_taraf).de�er = sa�_taraf ;
 	//sadece bo� bir nesne d�n�yoruz...
	
	
	
	�zellikler ret ;
	for ( int j = 0 ; j < �a�r�lan_fonksiyon.fonksiyon_bildirimleri().size() ; j++ )
	{
		
	ret = ( �zellikler )	visit ( �a�r�lan_fonksiyon.fonksiyon_bildirimleri( j ) ) ;
		
		
		
	}
	
	
	
	
	//Fonksiyonun kayd�n� siliyoruz...
	this.fonksiyon_stack.pop() ;
	
	
return new �zellikler ( ) ;	
	
	
	
}
else 
if ( !sol_taraf.t�r.equals( sa�_taraf.t�r ) )
{
	System.out.println ( "Atama hatas� : "+  " de�i�keninin t�r�" + sol_taraf.t�r + " atanan de�erin t�r� : " + sa�_taraf.t�r );
	�zellikler yeni = new �zellikler ( )  ;
	yeni.t�r = "HATA" ;
	yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
	
	return yeni ;
}

//atama yap�l�yor..
sol_taraf.de�er = sa�_taraf.de�er ;
//	System.out.println ( "Atanan sa� taraf de�eri : " + sol_taraf.de�er ) ;













}
//dfgdfgdfg
//Geri d�n�� de�erleri �nemli...


�zellikler ret = null ;
for ( int j = 0 ; j < �a�r�lan_fonksiyon.fonksiyon_bildirimleri().size() ; j++ )
{

ret = ( �zellikler )	visit ( �a�r�lan_fonksiyon.fonksiyon_bildirimleri( j ) ) ;

//Bir return deyimi gelirse 
if ( ret != null )
if ( ret.t�r != null )
//Fonksiyonda da throw edilebilir .....Direk geri d�nece�iz...
if ( ret.t�r.equals ( "HATA" ) ) return ret ;
else	if ( ret.t�r.equals( "RETURN" ) ) break;


}




//Fonksiyonun kayd�n� siliyoruz...
this.fonksiyon_stack.pop() ;
this.s�n�f_memory_stack.pop ( );
this.son_�a�r�lan_fonksiyon_t�r�.pop ( );
if ( ret != null )
if ( ret.t�r != null )
{
if ( ret.t�r != null )
{
	if ( ret.t�r.equals( "RETURN" ) )
		return ret.de�er ;
	
	
	
}


}

return new �zellikler ( ) ;	


//S�n�f fonksiyon �a��rma son..........




























//Ret te hata nesnesi olabilir 
//Pop yapmay� unutma

	
	
	 
	 }
		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public Object visitYeni_sinif(DilParser.Yeni_sinifContext ctx) { return visit(ctx.yeni_sinif_objesi()); }

	 
	 
	 
	 
	 
	 
	 
	 
	 
Stack<String> s�n�f_eri�im_stack = new Stack <String > ( ) ;

	 





	 
	//S�n�f elemanlar� olu�turulacak burada...
	 public Object visitSinif_eleman_olusturma(DilParser.Sinif_eleman_olusturmaContext ctx) { 
		 String eri�im_anahtar� = ctx.ulasim_anahtarlari().getText() ;
s�n�f_eri�im_stack.push( eri�im_anahtar� ) ;
�zellikler yeni = (�zellikler) visit ( ctx.grup_degiskeni() ) ;
s�n�f_eri�im_stack.pop ( ) ;

//this.de�i�ken_getir( "" ) ;


if ( eri�im_anahtar�.equals( "�zel" ) )
	yeni.eri�im_bi�imi = "�ZEL" ;
else yeni.eri�im_bi�imi = "GENEL" ;



return new �zellikler ("","" ) ;

		
	 }
		
	 
	 
	 
	
	 public Object visitSinif_elema_olusturma(DilParser.Sinif_elema_olusturmaContext ctx) { 
		 
	
		 DilParser.Fonksiyon_callContext �a�r�lacak_fonksiyon = (DilParser.Fonksiyon_callContext) ctx.fonksiyon_cagirilmasi() ;
		 DilParser.Sinif_tanimlanmasiContext olu�turulacak_s�n�f = null ;
		 String s�n�f_t�r� = �a�r�lacak_fonksiyon.degisken_ismi().getText ( ) ;
		 if  ( this.s�n�f_tan�mlar�.containsKey( s�n�f_t�r� ) ) 
		 {
			 olu�turulacak_s�n�f = this.s�n�f_tan�mlar�.get(  s�n�f_t�r�  ) ;
		 }
		 
		 else
		 {
			 System.out.println ( "Daha �nce " + s�n�f_t�r� + " t�r�nde bir S�n�f tan�mlanmam��..." ) ;
			 �zellikler yeni = new �zellikler ( )  ;
				yeni.t�r = "HATA" ;
				yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
		 }
		 
		 
		 HashMap <String , �zellikler > class_memory = new HashMap<String, �zellikler>() ;
		 
		
			
		//S�n�f�n tan�ml� de�i�kenlerini olu�turuyoruz...	
		 this.ekleme_yap�lcak_structure_ismi.push ( class_memory ) ;
			
			for ( int a = 0 ; a < olu�turulacak_s�n�f.sinif_degisken_tanimi().size() ; a++ )
			{
				
				visit ( olu�turulacak_s�n�f.sinif_degisken_tanimi( a ) ) ;
				
				
				
			}
			//Stack� eski haline getiriyoruz..
			this.ekleme_yap�lcak_structure_ismi.pop ( ) ;
		 
		 //Constructor �a�r�lacak....
		 
		 
		 
		 
		 
		 
		 
		 
		 �zellikler yeni = new �zellikler ( )  ;
		 yeni.t�r ="SINIF-" + s�n�f_t�r� ;
		 yeni.de�er = class_memory ;
		 return yeni ;
		 
		 
	 
	 
	 }
		
	
	
	public Object visitKolay_artis(DilParser.Kolay_artisContext ctx) { return visit(ctx.basit_artis()); }
	
	
	
	
	
	public Object visitBasit_bir_artirma(DilParser.Basit_bir_artirmaContext ctx) { 
	
		//Referans ve Dinamik de�i�kenlerde de problem olmaz...��nk� direk refer edilen 
//De�i�ken gelecek
		
		//De�i�keni al�yoruz...
		�zellikler de�i�ken = ( �zellikler ) visit ( ctx.sol_taraf_degiskenleri() );
		if ( de�i�ken.t�r.equals( TAMSAYI ) )
		{
			de�i�ken.de�er = ( int ) de�i�ken.de�er + 1 ;
			
			
		}
		else if ( de�i�ken.t�r.equals ( NOKTALISAYI ) ) 
		{
			de�i�ken.de�er = ( float )de�i�ken.de�er + 1.0 ;
			
		}
		
		
		return de�i�ken ;
		
	}
	
	
	//Program i�inde hi� yakalanmam�� hatalar olabilir , yada user sonu� de�ip geri d�nmeye kalkabilir bunlar�
	//hata olarak g�steriyoruz...
	public Object visitProgram(DilParser.ProgramContext ctx) { 
		�zellikler ret = null 
				;
		for ( int k = 0 ; k < ctx.bildirimler().size ( ) ; k++ )
		{
			
			ret = (�zellikler) visit ( ctx.bildirimler( k ) );
			if ( ret != null )
				if( ret.t�r != null )
					if ( ret.t�r.equals( "HATA" ) )
					{
						if ( ret.de�er != null )
						{
							if (  ((�zellikler)ret.de�er ).t�r.equals ( "KAPATMA") )
							{
								return null;
								
								
							}
							
						}
						
						
						System.out.println ( "Yakalanmam�� Hata Nesnesi Hatas�...." );
						�zellikler yeni = new �zellikler ( )  ;
						yeni.t�r = "HATA" ;
						yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
						
						return yeni ;
					}
					else if ( ret.t�r.equals ( " " ) )
					{
						
						System.out.println ( "L�tfen sonu� komutunu fonksiyonalar�n i�inde kullan�n..." ) ;
						�zellikler yeni = new �zellikler ( )  ;
						yeni.t�r = "HATA" ;
						yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
						
						return yeni ;
						
					}
			
		}
		
		
		return visitChildren(ctx); 
		
	
	}
	
	
	
	
	
	 public Object visitTry_catch_yapisi(DilParser.Try_catch_yapisiContext ctx) {
		 
		 �zellikler ret = null  ;
		 try {
		 for ( int a = 0 ; a < ctx.bildirimler().size ( ) ; a++ )
		 {
			 
			 ret =  ( �zellikler ) visit ( ctx.bildirimler( a )  ) ;
			
			 //Return break ve devam normal geri d�nd�r�lecek...
			 if ( ret != null )
					if ( ret.t�r != null )
						if ( ret.t�r.equals( "HATA" ) ) { throw new Goto ( "Hata" ) ; }
					else if ( ret.t�r.equals ( "RETURN" ) ) { return ret  ; }
						else if ( ret.t�r.equals( "BREAK" ) ) return ret ;
						else if ( ret.t�r.equals( "DEVAM" ) )  { return ret ; }
						
			 
			 
			 
			 
		 }
		 }
		 catch ( Goto x )
		 {
			 if ( x.hata.equals( "Hata" ) ) 
			 {//System.out.println ( "Hata nesnesi geldi.." );
				 
			 //Hata nesnesin kendisi
				 �zellikler de�i�ken = ret ;
				 
				 
				DilParser.Catch_yapisiContext catch_yap�s� = null ;
				
				boolean bulundu = false ;
				for  (int b = 0 ; b < ctx.catch_yapisi().size() ; b++ )
				{
					catch_yap�s� = ctx.catch_yapisi( b ) ;
					
					DilParser.Degisken_tanimlaContext var  =  null ;
					
					 var =  ( DilParser.Degisken_tanimlaContext )catch_yap�s�.degisken_tanimi() ;
					 
					String t�r = "" 
							;
					if ( var.degisken_turu ().getText ( ).equals( "Karakter" ) ) 
							t�r = "STRING" ;
					else t�r = var.degisken_turu().getText().toUpperCase() ;
					
					 //System.out.println (t�r   + " t�r in hata : " + ret.de�er );
					if ( t�r. equals(  ( (�zellikler) de�i�ken.de�er ).t�r ) )
					{
						�zellikler de� = null ;
						
						DilParser.Degisken_tanimlaContext de�i�ken_durum = (DilParser.Degisken_tanimlaContext) catch_yap�s�.degisken_tanimi() ;
						visit ( catch_yap�s�.degisken_tanimi() );
					String var_isim =	de�i�ken_durum.getChild( 1 ) .getText();
					de� =	(�zellikler) this.de�i�ken_getir( var_isim );
						
						//System.out.println ( "Var isim : " + var_isim ) ;
						//System.out.println ( "hata nesnesi : " + de�i�ken) ;
					//	System.out.println ( "olu�turulan : " + de� ) ;
						de�.de�er = ((�zellikler)de�i�ken.de�er).de�er ;
						
						 for ( int a = 0 ; a < catch_yap�s�.bildirimler().size ( ) ; a++ )
						 {
							 
							 ret =  ( �zellikler ) visit ( catch_yap�s�.bildirimler( a )  ) ;
							
							 //Return break ve devam normal geri d�nd�r�lecek...
							 if ( ret != null )
									if ( ret.t�r != null )
										if ( ret.t�r.equals( "HATA" ) ) { return ret  ; }
									else if ( ret.t�r.equals ( "RETURN" ) ) { return ret  ; }
										else if ( ret.t�r.equals( "BREAK" ) ) return ret ;
										else if ( ret.t�r.equals( "DEVAM" ) )  { return ret ; }
										
							 
							 
							 
							 
						 }
						
						
						
						bulundu = true ;
						
						
					}
					
					
					
					
				}
				 
				 
				 
				 //e�er hi�bir catch yap�s� yoksa kendisi bunu bir �st seviyede g�nderecek...
				 
				if ( bulundu == false ) return de�i�ken ;
				 
				 
				 
				 
				 
				 
				 
			 }
			 			 
			 
			 
		 }
		 
		 
		 return new �zellikler ( ) ;
	 }

	
	public Object visitHata_at(DilParser.Hata_atContext ctx) { 
		
		
		�zellikler yeni = new �zellikler ( )  ;
		yeni.t�r = "HATA" ;
		yeni.de�er = visit ( ctx.ifadeler() ) ; 
		
		return yeni ;
	
	}

	
	
	
	
	
	
	public Object visitFor_dongu(DilParser.For_donguContext ctx) { 
	
	String d�ng�_de�i�keni = ctx.degisken_ismi().getText ( ) ; 
	
	HashMap < String , �zellikler > mem =  ( ( FunctionTable  ) this.fonksiyon_stack.peek() ).lokal_de�i�ken_memory ; 
	
	�zellikler de�i�ken = ( �zellikler )  visit ( ctx.ifadeler() )  ;
	
	if ( mem.containsKey( d�ng�_de�i�keni ) ) 
	{
	System.out.println ( "D�ng� de�i�keni ad�yla ayn� isimli bir de�i�ken daha �nce tan�mlanm��..."  ) ;
	System . exit ( 0 ) ;
	}
	
	
	mem.put( d�ng�_de�i�keni  ,  de�i�ken ) ;
	
	
	�zellikler ret = null ;
	
	�zellikler deger = null  ;
	if ( this.d�ng�_stack.empty())
		this.d�ng�_stack.push ( 0 ) ;
	else
	this.d�ng�_stack.push ( (int)d�ng�_stack.peek() +1  ) ;
	
	do 
	{
	
		try {
		

�zellikler dogruluk = ( �zellikler ) visit ( ctx.mantik_ifadeleri() ) ;
		
	
if ( (boolean ) dogruluk.de�er == true )
{
	
	
}
else break ;	
	
		
	for ( int a = 0 ; a < ctx.bildirimler().size ( ) ; a ++ )
		
	{
		
		ret = ( �zellikler ) visit ( ctx.bildirimler( a )  );
		//Sadece fonksiyonlar ret.de�eri d�nd�recek onun d���ndakiler return objesini oldu�u gibi geri d�nd�recek...
		if ( ret != null )
		if ( ret.t�r != null )
			if  ( ret.t�r.equals( "HATA"  )  ){this.d�ng�_stack.pop ( )  ; return ret ;  }
		else if ( ret.t�r.equals ( "RETURN" ) ){ this.d�ng�_stack.pop () ; return ret   ; }
			else if ( ret.t�r.equals( "BREAK" ) ) throw new Goto ( "BREAK" ) ;
			else if ( ret.t�r.equals( "DEVAM" ) )  {if ( ctx.for_dongu_degisim()!=null ){visit ( ctx.for_dongu_degisim() ); } throw new Goto ( "DEVAM" ) ; }
		
		
		
		
		}
	
	
	
	
	
	}
	
	catch ( Goto x )
	{
		if ( x.hata.equals( "BREAK" ) ) break ;
		//Ayn� sonu�ta continue edecek onun i�in tekrar �a��r�yoruz bir sonraki sonu� i�in...
		
		else if ( x.hata.equals( "DEVAM" ) ) {    continue ; }  
		
		
	}
	
	
	
	
	
	
	
	
	
	if ( ctx.for_dongu_degisim() != null )
	
	{
		
		
	//d�ng� de�i�kenin de�i�mesi i�in....
visit ( ctx.for_dongu_degisim() ) ;
	
	
		
	}
	
	
	
	}
	while ( true ) ;
	
	
	
	mem.remove( d�ng�_de�i�keni ) ;
	
	this.d�ng�_stack.pop() ;
	
	
	
	
		return new �zellikler ("" , ""  ) ; 
		
	}
	
	
	
	
	
	
	public Object visitTur_fonksiyon(DilParser.Tur_fonksiyonContext ctx) { return visit(ctx.tur_fonksiyonu()); }
	
	
	
	public Object visitTuru_ne(DilParser.Turu_neContext ctx) { 
	
		
		//t�r ifadesinde de�i�kenin kendi t�r� �nemli
		
		�zellikler yeni = new �zellikler ( ) ;
		//T�m t�r bilgisi string de�i�keniyle olu�turulacak...
		yeni.t�r = STRING ;
		
		
		this.dinamik_de�i�keni_durumu = KEND�S� ;
		this.referans_de�i�keni_durumu = KEND�S� ;
		
		�zellikler ifade = ( �zellikler ) visit ( ctx.ifadeler() )  ;
		
		this.dinamik_de�i�keni_durumu = REFER_ETT��� ;
		this.referans_de�i�keni_durumu = REFER_ETT��� ;
		yeni.de�er = ifade.t�r ;
		
		
		
		return yeni ;
		
	
	}

	
	
	
	//De�i�kenlerin tuttu�u de�erlerin uzunlu�unu veriyor arrayin boyutu stringin uzunlu�u vb...
	 public Object visitLen_fonksiyonu(DilParser.Len_fonksiyonuContext ctx) { 
		�zellikler yeni  = new �zellikler ( ) ;
		//Bir tamsay� geri d�nd�rece�iz... 
		yeni.t�r = TAMSAYI ;
		 
		
		int boyut = 0 ;
		�zellikler nesne = ( �zellikler ) visit ( ctx.ifadeler ( ) ) ;
		 switch ( nesne.t�r )
		 {
		 case ARRAY:
		
			 boyut = ( ( HashMap ) nesne.de�er ).size() ;
			 break ;
			 
		 case STRING:
			 boyut = ( ( String ) nesne.de�er ) .length() ;
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
		 
		 
		yeni.de�er = boyut ;
		
		return yeni ;
	 
	 }
		
	
	
	
	
	
	public Object visitBreak_komutu(DilParser.Break_komutuContext ctx) { 
		
		�zellikler yeni = new �zellikler ( ) ;
		yeni.t�r  = "BREAK" ;
		yeni.de�er = "" ;
		
		return yeni ;
		
		
	
	}
	
	public Object visitContinue_komut(DilParser.Continue_komutContext ctx) { 
		
		

		�zellikler yeni = new �zellikler ( ) ;
		yeni.t�r  = "DEVAM" ;
		yeni.de�er = "" ;
		
		return yeni ;
		
	
	
	}
	
	
	
	/*
	 * Return yap�l�rken fonksiyon stack � temizlemeyi unutma ....
	*/
	 public Object visitReturn_komutu(DilParser.Return_komutuContext ctx) { 
	
		 �zellikler yeni = new �zellikler ( ) ;
		 yeni.t�r = "RETURN" ;
		 �zellikler geri_d�n�lecek = ( �zellikler ) visit ( ctx.ifadeler() ) ;
		 yeni.de�er = geri_d�n�lecek;
		 
		 return yeni ;
		 
		 
	 }
		
	
	public Object visitMatematik_fonksiyon_kaydi(DilParser.Matematik_fonksiyon_kaydiContext ctx) {
	
		String fonksiyonun_ismi  = ctx.degisken_ismi( 0 ).getText ( ) ;
		if ( this.tan�mlanm��_fonksiyonlar.containsKey( fonksiyonun_ismi ) || this.matematik_fonksiyonlar�.containsKey( fonksiyonun_ismi ) )
			{
		System.out.println(fonksiyonun_ismi + " fonksiyonu daha �nce tan�mlanm�� bir fonksiyon..." );
		�zellikler yeni = new �zellikler ( )  ;
		yeni.t�r = "HATA" ;
		yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
			
		}
		
		this.matematik_fonksiyonlar�.put( fonksiyonun_ismi , ctx ) ;
		
		
	
		return new �zellikler ( ) ;
	
	}
	
	
	public Object visitFonk_cagri(DilParser.Fonk_cagriContext ctx) { return visit(ctx.fonksiyon_cagirilmasi()); }
	
	
	
	
	public Object visitMod_islemi(DilParser.Mod_islemiContext ctx) {
		
		�zellikler ilk_ifade = ( �zellikler ) visit ( ctx.ifadeler( 0 ) ) ;
		�zellikler ikinci_ifade = ( �zellikler ) visit ( ctx.ifadeler ( 1 ) ) ;
		
		�zellikler yeni = new �zellikler ( ) ;
		
		if ( ilk_ifade.t�r.equals( STRING ) || ikinci_ifade.t�r.equals( STRING  ) ) 
		{
			System.out.println ( "Stringler mod alma i�leciyle kullan�lamazlar..." );
			�zellikler yen = new �zellikler ( )  ;
			yen.t�r = "HATA" ;
			yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yen ;
			
			
		}
		
		else if ( ilk_ifade.t�r.equals( NOKTALISAYI ) || ikinci_ifade.t�r.equals( NOKTALISAYI ) ) 
		{
			
			
			double ilk_say� =  ilk_ifade.t�r.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf( ilk_ifade.de�er ) ) : (Double)ilk_ifade.de�er  ;
			double ikinci_say� = ikinci_ifade.t�r.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf ( ikinci_ifade.de�er ) ) : ( Double ) ikinci_ifade.de�er ;
			
			
			yeni.t�r = NOKTALISAYI ;
			yeni.de�er =ilk_say� % ikinci_say� ;
			
	
			
		}
		else
		{
			Double ilk_say� =  ilk_ifade.t�r.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf( ilk_ifade.de�er ) ) : (Double)ilk_ifade.de�er  ;
			Double ikinci_say� = ikinci_ifade.t�r.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf ( ikinci_ifade.de�er ) ) : ( Double ) ikinci_ifade.de�er ;
			
			Double res = ilk_say� % ikinci_say� ;
			yeni.t�r = TAMSAYI ;
			yeni.de�er =  res.intValue()  ;
			 
	
			
		}
		
		
		return yeni ;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public Object visitFonksiyon_call(DilParser.Fonksiyon_callContext ctx) { 
					
		String fonksiyon_ismi = ctx.degisken_ismi().getText ( ) ;
				
		if ( this.tan�mlanm��_fonksiyonlar.containsKey( fonksiyon_ismi ) || this.matematik_fonksiyonlar�.containsKey( fonksiyon_ismi ) )
		{
			
			if ( this.matematik_fonksiyonlar�.containsKey( fonksiyon_ismi ) ) 
			{
				FunctionTable yeni_kay�t = new FunctionTable ( ) ;
				 HashMap <String , �zellikler> yeni_map = new HashMap <String , �zellikler > ()  ;
				 yeni_kay�t.number = this.fonksiyon_stack.peek().number + 1 ;
				 yeni_kay�t.lokal_de�i�ken_memory = yeni_map ;
				 yeni_kay�t.previous_function_table = fonksiyon_stack.peek() ;
				 DilParser.Matematik_fonksiyon_kaydiContext mat_fonksiyonu = this.matematik_fonksiyonlar�.get( fonksiyon_ismi ) ;
				 
				
				 //Bir tanesi fonksiyon ismi geri kalan parametre say�s�...
				 int fonksiyon_parametre_say�s� = mat_fonksiyonu.degisken_ismi().size() -1 ;
				int ge�ilen_parametre_say�s� = ctx.ifadeler().size ( ) ;
				
				if ( fonksiyon_parametre_say�s� != ge�ilen_parametre_say�s� )
				{
					System.out.println ( "Matematik fonksiyonuna ge�ilen parametre say�s� ile fonksiyonun parametre say�lar� farkl�..." ) ;
					�zellikler yeni = new �zellikler ( )  ;
					yeni.t�r = "HATA" ;
					yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
					
					return yeni ;
				}
				
				ArrayList parametreler = new ArrayList ( ) ;
				//Ge�ilen parametreler al�n�yor....
				for ( int jj = 0 ; jj < fonksiyon_parametre_say�s� ; jj++ )
				{
					parametreler.add(  visit ( ctx.ifadeler ( jj ) ) ) ;	
				}
				this.fonksiyon_stack.push( yeni_kay�t ) ;
				
				//yeni fonksiyon kayd�nda map i olu�turduk parametrelerin isimleriyle yeni map at�yoruz...
				
				
				for ( int a = 0 ; a < fonksiyon_parametre_say�s� ; a++ )
				{
					//Bir fazlas� ��nk� ilki fonksiyonun ismi
		//	System.out.println (mat_fonksiyonu.degisken_ismi( a + 1 ).getText () +  " - "  + (�zellikler)parametreler.get( a   )  + "olarak eklendi..."  ) ;
					yeni_map.put( mat_fonksiyonu.degisken_ismi( a + 1 ).getText ()  , (�zellikler)parametreler.get( a   ) ) ;
					
					
				}
				
				//en sonda matematik fonksiyonunun de�erini geri d�nd�r�yoruz...
				�zellikler ret = (�zellikler) visit ( mat_fonksiyonu.ifadeler() ) ;
				this.fonksiyon_stack.pop ( ) ;
				return ret  ;
				
				
				
				
			}
			else 
			{
				//Devam edecek buradan normal fonksiyon �a�r�lm��:..
			}
			
			
			
		}
		else
		{
			System.out.println ( fonksiyon_ismi + " ad�yla daha �nce bir fonksiyon tan�mlanmam��" ) ;
			�zellikler yeni = new �zellikler ( )  ;
			yeni.t�r = "HATA" ;
			yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
		}
		
		
		
		
	ArrayList ge�ilen_parametreler = new ArrayList () ;
	
	if ( ctx.ifadeler().isEmpty() == false )
	{
	
		//Ge�ilen parametreleri sonra kullanmak i�in array ekliyoruz...
		for ( int b = 0 ; b < ctx.ifadeler().size() ; b++ )
		ge�ilen_parametreler.add(  visit ( ctx.ifadeler( b ) ) ) ;
	}
	//System.out.println ( "parametreler" ) ;
	//System.out.println ( ge�ilen_parametreler ) ;
	
	DilParser.Fonksiyon_tanimi_Context �a�r�lan_fonksiyon = null;
	
	if ( this.tan�mlanm��_fonksiyonlar.containsKey( fonksiyon_ismi ) )
	{
	
	�a�r�lan_fonksiyon  = this.tan�mlanm��_fonksiyonlar.get( fonksiyon_ismi    ) ;
	
	}
	else
	{
		System.out.println ( fonksiyon_ismi + " ad�nda bir fonksiyon tan�mlanmam��..."   ) ;
		;
		�zellikler yeni = new �zellikler ( )  ;
		yeni.t�r = "HATA" ;
		yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
		
	}
	
	
	HashMap<String , �zellikler > yeni_fonksiyonun_memorisi = new HashMap <String , �zellikler > (  ) ;
 
	FunctionTable yeni_fonksiyon_tablosu = new FunctionTable ( )  ;
	yeni_fonksiyon_tablosu.lokal_de�i�ken_memory = yeni_fonksiyonun_memorisi ;
	yeni_fonksiyon_tablosu.previous_function_table = this.fonksiyon_stack.peek() ;
	yeni_fonksiyon_tablosu.number = fonksiyon_stack.peek() .number + 1 ;
	this.fonksiyon_stack.push( yeni_fonksiyon_tablosu ) ;
	
	ArrayList<�zellikler> yeni_olu�turulan_de�i�kenler ;
	
	//yeni fonksiyonda de�i�kenler olu�turuluyor...
	for ( int j = 0 ; j < �a�r�lan_fonksiyon.fonksiyon_parametreleri().size ( ) ; j ++  )
	{visit (  �a�r�lan_fonksiyon.fonksiyon_parametreleri( j ) ) ;
	}
	
	yeni_olu�turulan_de�i�kenler = new ArrayList<�zellikler> ( yeni_fonksiyonun_memorisi.values() ) ;
	//System.out.println ( "Yeni olu�turulan de�i�kenler\n" + yeni_olu�turulan_de�i�kenler ) ;
	
	//Hi� parametre ge�ilmese bile  , parametrelerin ge�erli de�erleri ou�turulurken otomatik ayarlanacak
	//E�er kullan�c� isterse kendi de�erini default olarak atayabilir..
	//Soldan sa�a do�ru kontrol edilecek...
	
	//Parametre say�s�  az olabilir...
	
	�zellikler sol_taraf , sa�_taraf  , tempo ;
	for ( int n = 0 ; n < ge�ilen_parametreler.size() ; n++ ) 
	{
		�zellikler ge�ilen_par = (�zellikler) ge�ilen_parametreler.get( n ) ; 
		�zellikler para = yeni_olu�turulan_de�i�kenler .get( n ) ;
		
		//System.out.println ( "Ge�irilen parametre : " + ge�ilen_par ) ;
		//System.out.println ( "Parametre de�i�keni : " + para ) ; 
sa�_taraf = ge�ilen_par ;
sol_taraf  = para;
	
		tempo = sa�_taraf ;

		if ( sa�_taraf.t�r.equals( "ARRAY") ) 
		{
		//System.out.println ( "Array objesi e�itleme "  ) ;
		
			
			
			//E�er array varsa bir tek bunun kopyas� olu�turulacak...
			
	   tempo = new �zellikler ( ) ;
	   tempo.t�r = sa�_taraf.t�r ;
	   
		ObjectOutputStream object_output = null ;
		ByteArrayOutputStream output = new ByteArrayOutputStream() ;
		try {
			 object_output = new ObjectOutputStream( output ) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//System.out.println ( "Sa� taraf : " + sa�_taraf ) ;

		try {
			object_output.writeObject( sa�_taraf );
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println ( "Dosya yazma error " ) ;
			�zellikler yeni = new �zellikler ( )  ;
			yeni.t�r = "HATA" ;
			yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
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
		�zellikler yeni = new �zellikler ( )  ;
		yeni.t�r = "HATA" ;
		yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
		}


		�zellikler copied = null ;

		try {
			copied = (�zellikler) object_input.readObject( ) ;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	System.out.println ( "Clonlana array : " + cloned ) ;
	//	System.out.println ( "Orjinal array : " + sa�_taraf.de�er ) ;
		tempo.de�er = copied.de�er ;
		
		
		}
		
		//Sa� taraf array hari�se aynen kalacak...
		sa�_taraf = tempo ;
		
		//Burada Referans ve Dinamik veri t�rlerine dikkat edilecek....
	    //Bu hen�z o indekse de�er at�lmam�� array elemanlar�nda YOK t�r�nde bir �zellikler geri d�n�l�yor...
		if ( sol_taraf.t�r.equals( "YOK" ) )
		{
			sol_taraf.t�r = sa�_taraf.t�r ;
			sol_taraf.de�er = sa�_taraf.de�er ;
			
		}
		else if ( sol_taraf.t�r.equals("D�NAM�K") )
		{
			
			((�zellikler)sol_taraf.de�er).de�er = sa�_taraf.de�er ;
			((�zellikler)sol_taraf.de�er).t�r  = sa�_taraf.t�r ;
			this.array_elaman�na_de�er_atama = false ;
			//sadece bo� bir nesne d�n�yoruz...
			
			this.dinamik_de�i�keni_durumu = REFER_ETT��� ;
			return new �zellikler ( ) ;
			
		}
		else if ( sol_taraf.t�r.equals( "REFERANS" ) ) 
		{//System.out.println ( "Ref" );
			//Referab
		
			
	//		System.out.println ( "Sol taraf : " + sol_taraf )  ;
		//Bu durumda kontrol edilmesine gerek yok ��nk� referans�n ilk bir de�eri yok ...	
			(( �zellikler)sol_taraf).de�er = sa�_taraf ;
         	//sadece bo� bir nesne d�n�yoruz...
			
			
			
			�zellikler ret ;
			for ( int j = 0 ; j < �a�r�lan_fonksiyon.fonksiyon_bildirimleri().size() ; j++ )
			{
				
			ret = ( �zellikler )	visit ( �a�r�lan_fonksiyon.fonksiyon_bildirimleri( j ) ) ;
				
				
				
			}
			
			
			
			
			//Fonksiyonun kayd�n� siliyoruz...
			this.fonksiyon_stack.pop() ;
			
			
		return new �zellikler ( ) ;	
			
			
			
		}
		else 
		if ( !sol_taraf.t�r.equals( sa�_taraf.t�r ) )
		{
			System.out.println ( "Atama hatas� : "+  " de�i�keninin t�r�" + sol_taraf.t�r + " atanan de�erin t�r� : " + sa�_taraf.t�r );
			�zellikler yeni = new �zellikler ( )  ;
			yeni.t�r = "HATA" ;
			yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
		}
		
		//atama yap�l�yor..
		sol_taraf.de�er = sa�_taraf.de�er ;
	//	System.out.println ( "Atanan sa� taraf de�eri : " + sol_taraf.de�er ) ;
		
		
		
		
		
		
		
		
		
		
	
		
	
	}
	//dfgdfgdfg
	//Geri d�n�� de�erleri �nemli...
	�zellikler ret = null ;
	for ( int j = 0 ; j < �a�r�lan_fonksiyon.fonksiyon_bildirimleri().size() ; j++ )
	{
		
	ret = ( �zellikler )	visit ( �a�r�lan_fonksiyon.fonksiyon_bildirimleri( j ) ) ;
		
	//Bir return deyimi gelirse 
	if ( ret != null )
	if ( ret.t�r != null )
		//Fonksiyonda da throw edilebilir .....Direk geri d�nece�iz...
	 if ( ret.t�r.equals ( "HATA" ) ) return ret ;
	 else	if ( ret.t�r.equals( "RETURN" ) ) break;
		
		
	}
	
	
	
	
	//Fonksiyonun kayd�n� siliyoruz...
	this.fonksiyon_stack.pop() ;
	if ( ret != null )
	if ( ret.t�r != null )
	{
		if ( ret.t�r != null )
		{
			if ( ret.t�r.equals( "RETURN" ) )
				return ret.de�er ;
			
			
			
		}
		
		
	}
	
return new �zellikler ( ) ;	
	
	}
	
	
	public Object visitFonksiyon_tanimi_(DilParser.Fonksiyon_tanimi_Context ctx) {
		
		String fonksiyonun_ismi = ctx.degisken_ismi().getText ( )  ;
		
		if ( this.tan�mlanm��_fonksiyonlar.containsKey( fonksiyonun_ismi ) || this.matematik_fonksiyonlar�.containsKey( fonksiyonun_ismi  )  ) 
		{//E�er ayn� isimde fonksiyon tan�mlanm��sa hata ver....
			System.out.println ( "Daha �nce " + fonksiyonun_ismi + " ad�yla tan�mlanm�� bir fonksiyon var...." ) ;
			�zellikler yeni = new �zellikler ( )  ;
			yeni.t�r = "HATA" ;
			yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
			
		}
		this.tan�mlanm��_fonksiyonlar.put( fonksiyonun_ismi ,  ctx  ) ;
		
		
		//Bir �ey d�n�lmesine gerek yok..
	return new �zellikler ( ) ;
	}
	
	
	
	
	
	
	
	
	
public Object visitYanlis(DilParser.YanlisContext  ctx) { 
		
		
		�zellikler yeni = new �zellikler ( ) ;
		yeni.t�r = "BOOL" ;
		yeni.de�er = false ;
		return yeni  ;
	
	
	}
	
	public Object visitDogru(DilParser.DogruContext ctx) { 
		
		
		�zellikler yeni = new �zellikler ( ) ;
		yeni.t�r = "BOOL" ;
		yeni.de�er = true ;
		return yeni  ;
	
	
	}
	
	
	
	
	public Object visitDegisken_grubu_tanimi(DilParser.Degisken_grubu_tanimiContext ctx) {
	
		String structur�n_ismi  = ctx.degisken_ismi().getText() ;
		//Structur�n isiminin bizim normal ilkel t�rlerin ad�n� ta��mad���na emin oluncacak burada kontrol
		// e�er bizim t�rlerden birinin ismi verilirse hata mesaj� ver...
		/********* Herhangi bir structure tan�m� daha �nce yap�lm��sa da hata ver...
		
		
		*/
		
		
		
		this.structure_tan�mlar�.put( structur�n_ismi , ctx ) ;
		
		
		//Geri bir �ey d�n�lmesine gerek yok..
		return new �zellikler ( ) ;
		
	
	
	}
	
	
	
	public Object visitReferans_atama(DilParser.Referans_atamaContext ctx) { 
	
		this.referans_de�i�keni_durumu = KEND�S� ;
		
		�zellikler  referans_de�i�keni = ( �zellikler ) visit ( ctx.referans_olabilenler( 0 )  )  ;
		
		this.referans_de�i�keni_durumu = REFER_ETT��� ;
		 
		//burada referansa referans edilse bile ikincinin tuttu�u obje referans edilecek...
		
	
		
		�zellikler referans_olunan =  ( �zellikler ) visit ( ctx.referans_olabilenler( 1 )  ) ;
		
		�zellikler ek = new �zellikler ( ) ;
		if ( referans_olunan == null  )
			 { ek.t�r = "YOK" ;  ek.de�er = null; }
		
		else ek = referans_olunan ;
		
		//System.out.println (  "Referans olunan : " + referans_olunan ) ;
		
		//System.out.println ( "Refer edilen : " + referans_olunan ) ;
		referans_de�i�keni.de�er = ek ;
		
		return new �zellikler ( ) ;
		
	
	
	}

	
	
	
	
	
	//T�rden ba��ms�z referans uygulayaca��z...
	
	 public Object visitAtamali_referans_ismi(DilParser.Atamali_referans_ismiContext ctx) {
		 
		 �zellikler atanm��_de�er = ( �zellikler ) visit ( ctx.degisken_ismi().get( 1 ) ) ;
			�zellikler yeni = new �zellikler ( ) ;
			String de�i�ken_ismi = ctx.degisken_ismi(0 ) .getText() ;
					
					//yeni olu�acak de�i�ken sta��n en tepesindeki kayda olu�turulacak...
					FunctionTable son_kay�t = this.fonksiyon_stack.peek() ;
					
					HashMap ekleme_yapilacak_mem = son_kay�t.lokal_de�i�ken_memory ;
					
					if ( this.ekleme_yap�lcak_structure_ismi.size() == 0 )
					if ( ekleme_yapilacak_mem.containsKey( de�i�ken_ismi ) )
					{
					System.out.println ( "Daha �nce " + de�i�ken_ismi + " tan�mlanm�� bir de�i�ken var..." ) ;
					�zellikler yen = new �zellikler ( )  ;
					yen.t�r = "HATA" ;
					yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
					
					return yen ;
						
						
					}
					
					
					
				
						yeni.t�r = REFERANS ;
						//Burada yeni bir   olu�turmaya gerek yok ��nk� assignment yap�ld���nda zaten  gelecek...
				
					yeni.de�er = atanm��_de�er  ;
					if ( !this.s�n�f_eri�im_stack.empty() )
					{
						yeni.eri�im_bi�imi = this.s�n�f_eri�im_stack.peek() ;
					}
					
					
					if ( this.ekleme_yap�lcak_structure_ismi.size() != 0 )
					{ekleme_yapilacak_mem = this.ekleme_yap�lcak_structure_ismi.peek() ;
						ekleme_yapilacak_mem.put( de�i�ken_ismi , yeni ) ; 
					}
					else
					ekleme_yapilacak_mem.put( de�i�ken_ismi , yeni ) ; 
					return new �zellikler ( ) ;
		 
		
		 
	 
	 
	 }
		
	
	
	public Object visitSadece_referans_ismi(DilParser.Sadece_referans_ismiContext ctx) { 
	
		
		

		�zellikler yeni = new �zellikler ( ) ;
String de�i�ken_ismi = ctx.degisken_ismi().getText();
		
		//yeni olu�acak de�i�ken sta��n en tepesindeki kayda olu�turulacak...
		FunctionTable son_kay�t = this.fonksiyon_stack.peek() ;
		
		HashMap ekleme_yapilacak_mem = son_kay�t.lokal_de�i�ken_memory ;
		
		if ( this.ekleme_yap�lcak_structure_ismi.size() == 0 )
		if ( ekleme_yapilacak_mem.containsKey( de�i�ken_ismi ) )
		{
		System.out.println ( "Daha �nce " + de�i�ken_ismi + " tan�mlanm�� bir de�i�ken var..." ) ;
		�zellikler yen = new �zellikler ( )  ;
		yen.t�r = "HATA" ;
		yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
		
		return yen ;
			
			
		}
		
		

		
			yeni.t�r = REFERANS ;
		�zellikler _g = new �zellikler ( ) ;
	//	System.out.println ( "referans olu�turuldu:.." ) ;
		_g.t�r = "YOK" ;
		
			yeni.de�er = _g ;

		
		
			if ( !this.s�n�f_eri�im_stack.empty() )
			{
				yeni.eri�im_bi�imi = this.s�n�f_eri�im_stack.peek() ;
			}
		
			if ( this.ekleme_yap�lcak_structure_ismi.size() != 0 )
			{ekleme_yapilacak_mem = this.ekleme_yap�lcak_structure_ismi.peek() ;
				ekleme_yapilacak_mem.put(  de�i�ken_ismi , yeni ) ; 
			}
			else
			ekleme_yapilacak_mem.put( de�i�ken_ismi , yeni ) ; 
		
	
	//Geri bir �ey d�nmeye gerek yok..
	return new �zellikler ( ) ;
	}
	
	
	
	
	
	
	public Object visitCase_komutu(DilParser.Case_komutuContext ctx) { 
	
		�zellikler se�ilen_de�i�ken = ( �zellikler ) visit ( ctx.secilen() ) ;
		
		//Ard�ndan tek tek case leri dola�aca��z...
		//E�er caselerden birinde e�le�me varsa defaultu �a��rmamak i�in...
		boolean de�er_bulundu = false ;
		
		
		�zellikler ret = null ;
		
		//Se�enekler yap�s�n� gezebilmek i�in...
		DilParser.SeceneklerContext se�enekler ;
		for ( int a = 0 ; a < ctx.secenekler().size() ; a++ ) 
		{
			
			se�enekler = ctx.secenekler( a ) ;
			//tek tek �u andaki se�eneklerin ifadelerine bakaca��z se�ilen de�erle uyu�uyor mu diye...
			for ( int h = 0 ; h < se�enekler.ifadeler().size() ; h++ )
			{
				�zellikler sorgulanan = ( �zellikler ) visit ( se�enekler.ifadeler( h ) ) ;
				//E�er herhangi bir ifade ile e�leme�me sa�lan�yorsa...
				
			/*	System.out.println ( "Sorgulanan t�r : " + sorgulanan.t�r  );
				System.out.println ( "Sorgulanan de�er : " + sorgulanan.de�er  ) ;
				System.out.println (  "Se�ilen t�r : "  +se�ilen_de�i�ken.t�r );
				System.out.println ( "Se�ilen de�er : " + se�ilen_de�i�ken.de�er ) ;
				*/
				if ( se�ilen_de�i�ken.t�r.equals( sorgulanan.t�r ) && se�ilen_de�i�ken.de�er.equals( sorgulanan.de�er ) )
				{
					//Hi� yoksa k�sm�na girmemek i�in...
					de�er_bulundu = true ;
					
					//Geri d�n�� de�eri �nemli olabilir...
					for ( int g = 0 ; g < se�enekler.bildirimler().size ( ) ; g++ )
					{
						
					ret = ( �zellikler )	visit ( se�enekler.bildirimler( g )  ) ;
					//Sadece fonksiyonlar ret.de�eri d�nd�recek onun d���ndakiler return objesini oldu�u gibi geri d�nd�recek...
					if ( ret.t�r != null )
						if ( ret.t�r.equals ( "RETURN" ) ) return ret  ;
					
						else if ( ret.t�r.equals( "HATA" ) ) return ret ;
						else if ( ret.t�r.equals( "BREAK" ) || ret.t�r.equals( "DEVAM") )
						{
							
							if ( this.d�ng�_stack.empty() )
							{
								System.out.println ( "ba�tan devam et ve d�ng�den ��k komutlar� kull�labilmesi  i�in en az�ndan bir d�ng�n�n i�ine girilmesi gerekmetedir.Kullan�m hatas�..." );
								�zellikler yeni = new �zellikler ( )  ;
								yeni.t�r = "HATA" ;
								yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
								
								return yeni ;
								
							}
							else
							{
								return ret ;
							}
						}
					
					}
					//Bildirimleri de i�ledikten sonra t�m se� yap�s�ndan ��kaca��z...
					break ;
					
					
					
				}
				}
		}
		
		
		//E�er aran�lan de�er se�eneklerin hi� birinde yokse e�er yaz�lm��sa hi� yoksa k�sm� onu i�letece�iz...
		if ( de�er_bulundu == false ) 
		{
			
			if ( ctx.hic_yoksa() != null )
			{
				DilParser.Hic_yoksaContext yap� = ctx.hic_yoksa() ;
				
				//Geri d�n�� de�erleri �nemli olabilir....
				for ( int hh = 0 ; hh < yap�.bildirimler().size() ; hh++ ) 
				{
					
					ret = ( �zellikler ) visit ( yap�.bildirimler( hh )  ) ;
					//Sadece fonksiyonlar ret.de�eri d�nd�recek onun d���ndakiler return objesini oldu�u gibi geri d�nd�recek...
					if ( ret!= null )
					if ( ret.t�r != null )
						if ( ret.t�r.equals ( "RETURN" ) ) return ret  ;
						else if ( ret.t�r.equals( "HATA" ) ) return ret ;
						else if ( ret.t�r.equals( "BREAK" ) || ret.t�r.equals( "DEVAM") )
						{
							
							if ( this.d�ng�_stack.empty() )
							{
								System.out.println ( "ba�tan devam et ve d�ng�den ��k komutlar� kull�labilmesi  i�in en az�ndan bir d�ng�n�n i�ine girilmesi gerekmetedir.Kullan�m hatas�..." );
								�zellikler yeni = new �zellikler ( )  ;
								yeni.t�r = "HATA" ;
								yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
								
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
		
		
		//Switch problemsiz �al���rsa bir �ey d�nmesine gerek yok...
	return new �zellikler ( ) ;
	}
	
	
	
	public Object visitDo_while_loop(DilParser.Do_while_loopContext ctx) { 
	
		�zellikler sonu� = null ;
		//Bura �nce ifadeleri i�leyece�iz...
		
		//Geri d�n�� gene �nemli burada...
	�zellikler ret = null ;
	
	
	if ( this.d�ng�_stack.empty() )
	this.d�ng�_stack.push( 0 ) ;
	else this.d�ng�_stack.push( this.d�ng�_stack.peek() +1 ) ;
	
	
	do
		{
		
		try {
		for ( int a = 0 ; a < ctx.bildirimler().size() ; a++ )
		{
			
		ret = ( �zellikler )	visit ( ctx.bildirimler( a )  );
		//Sadece fonksiyonlar ret.de�eri d�nd�recek onun d���ndakiler return objesini oldu�u gibi geri d�nd�recek...
		if ( ret != null )
		if ( ret.t�r != null )
			if ( ret.t�r.equals ( "RETURN" ) ) {this.d�ng�_stack.pop ( ) ; return ret  ; }
			else if ( ret.t�r.equals( "HATA" ) ) { this.d�ng�_stack.pop ( ) ; return ret ; }
			else if ( ret.t�r.equals( "BREAK" ) ) throw new Goto ( "BREAK" ) ;
			else if ( ret.t�r.equals( "DEVAM" ) )  { throw new Goto ( "DEVAM" ) ; }
			
			
		}
		//do daki her statement � i�ledikten sonra do�ruluk de�erine bakaca��z..
		
		
		sonu� = ( �zellikler ) visit ( ctx.mantik_ifadeleri() ) ;
		}
		catch ( Goto x )
		{
			if ( x.hata.equals( "BREAK" ) ) break ;
			//Ayn� sonu�ta continue edecek onun i�in tekrar �a��r�yoruz bir sonraki sonu� i�in...
			
			else if ( x.hata.equals( "DEVAM" ) ) {  sonu� = ( �zellikler ) visit ( ctx.mantik_ifadeleri( ) ) ;  continue ; }  
			
			
		}
		
		
		}
		while ( ( boolean ) sonu�.de�er == true   ) ;
		// e�er her �ey yolunda giderse geri bir �ey d�nmeye gerek yok....
		
	
	this.d�ng�_stack.pop ( ) ;
	
	
		return new �zellikler ( ) ;
	}
	
	public Object visitWhile_loop(DilParser.While_loopContext ctx) { 
		// ilk ba�ta kontrol etmek i�in do�ruluk ifadesinin de�erini al�yoruz..
		�zellikler sonu� = ( �zellikler ) visit ( ctx.mantik_ifadeleri() ) ;
		�zellikler ret = null ;
		
		if ( this.d�ng�_stack.empty() )
			this.d�ng�_stack.push( 0 ) ;
			else this.d�ng�_stack.push( this.d�ng�_stack.peek() +1 ) ;
		//System.out.println ( "Sonu� : "  + sonu� ) ;
		
		while ( ( boolean ) sonu�.de�er == true )
		{
			try 
			{
			//Burada geri d�n��ler �nemli break ve continuedaki gibi...
			for ( int b = 0 ; b  < ctx.bildirimler().size ( ) ; b++ )
			{
			ret = ( �zellikler )	visit ( ctx.bildirimler( b )  ) ;
			//Sadece fonksiyonlar ret.de�eri d�nd�recek onun d���ndakiler return objesini oldu�u gibi geri d�nd�recek...
			if ( ret != null )
			if ( ret.t�r != null )
				if ( ret.t�r.equals ( "RETURN" ) )   {  this.d�ng�_stack.pop ( )  ; return ret  ; }
				else if ( ret.t�r.equals ( "HATA" ) ) { this.d�ng�_stack.pop ( ) ; return ret ; }
				else if ( ret.t�r.equals( "BREAK" ) ) throw new Goto ( "BREAK" ) ;
				else if ( ret.t�r.equals( "DEVAM" ) )  { throw new Goto ( "DEVAM" ) ; }
				
			}
			
			//Tekrar mant�k ifadesini elde ediyoruz kontrol etmek i�in...
			sonu� = ( �zellikler ) visit ( ctx.mantik_ifadeleri( ) ) ;
			
			}
			catch ( Goto x  ) 
			{
				if ( x.hata.equals( "BREAK" ) ) break ;
				//Ayn� sonu�ta continue edecek onun i�in tekrar �a��r�yoruz bir sonraki sonu� i�in...
				
				else if ( x.hata.equals( "DEVAM" ) ) {  sonu� = ( �zellikler ) visit ( ctx.mantik_ifadeleri( ) ) ;  continue ; }  
				
			}
		}
	
		
		
	this.d�ng�_stack.pop ( ) ; 
		//while d�ng�s�n�n ne d�nd��� �nemli de�il...
	return new �zellikler ( ) ;
		 
		
	}

	
	
	
	
	public Object visitDogru_yanlis(DilParser.Dogru_yanlisContext ctx) { 
		
		
		return visit(ctx.mantik()); 
		
	
	
	}
	
	
	
	public Object visitEsit_degil(DilParser.Esit_degilContext ctx) { 
	
		�zellikler yeni = new �zellikler ( ) ;
		yeni.t�r = "BOOL" ;
		�zellikler sol_taraf = ( �zellikler ) visit ( ctx.ifadeler( 0 ) ) ;
		�zellikler sa�_taraf = ( �zellikler ) visit ( ctx.ifadeler( 1 ) ) ;
		
	//	System.out.println ( "Sol taraf : " + sol_taraf );
		if ( sol_taraf.t�r.equals ( "YOK" ) || sa�_taraf.t�r.equals ( "YOK" ) )
		{
			if  ( sol_taraf.t�r.equals ( sa�_taraf.t�r ) )
				yeni.de�er = false ;
			else yeni.de�er = true ;
			
			
			return yeni ;
			
			
		}
		else
		if ( !sol_taraf.t�r .equals( sa�_taraf.t�r))
		{
			System.out.println ( sol_taraf.t�r + " ile " + sa�_taraf.t�r + " ayn� de�il kar��la�t�r�lamazlar..." );
			�zellikler yen = new �zellikler ( )  ;
			yen.t�r = "HATA" ;
			yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yen ;
		}
		
switch ( sol_taraf.t�r )
{

case "YOK":
	if ( sa�_taraf.t�r.equals("YOK" )) 
	{
		
		yeni.de�er = false ;
	}
	else yeni.de�er = true ;
	
	break ;

case TAMSAYI:
	if ( (int)sol_taraf.de�er != (int) sa�_taraf.de�er )
		yeni.de�er = true ;
	else yeni.de�er = false ;
	
	break;

case STRING:
	if ( ((String )sol_taraf.de�er).compareTo(  (String)sa�_taraf.de�er ) != 0 )
		yeni.de�er = true ;
	else yeni.de�er = false ;
	break;
case NOKTALISAYI:
	if ( !((Double)sol_taraf.de�er).equals((Double)sa�_taraf.de�er ) ) 
		yeni.de�er = true ;
	else yeni.de�er = false ;
	break
	
	;
case "BOOL":
	if ( ((boolean)sol_taraf.de�er) !=((boolean)sa�_taraf.de�er ) ) 
		yeni.de�er = true ;
	else yeni.de�er = false ;
	break ;
	

}
		
		return yeni ;
		
	}
	
	 
		
	public Object visitEksi_sayi(DilParser.Eksi_sayiContext ctx) { 
		
		�zellikler gelen = ( �zellikler ) visit ( ctx.ifadeler() ) ;
	
		switch ( gelen.t�r )
		{
		case STRING :
			
			System.out.println ( "- i�areti Stringlerle kullan�lamaz..." ) ;
			�zellikler yeni = new �zellikler ( )  ;
			yeni.t�r = "HATA" ;
			yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
			
		case TAMSAYI:
			gelen.de�er = -1 *  ( int )gelen.de�er ;
		break ;
		
		case NOKTALISAYI:
			gelen.de�er = -1 * (Double)gelen.de�er ;
break ;
		
		}
		
		return gelen ;
		
	
	}
	
	
	
	public Object visitDogru_degil(DilParser.Dogru_degilContext ctx) {
		
		//E�er else yap�s�nda return varsa o nesneyi geri d�nd�rmemiz gerekir...
		
		�zellikler yeni = new �zellikler ( ); 
		�zellikler ret = null ;
		for ( int a = 0 ; a < ctx.bildirimler().size()  ; a++ ) 
		{
		ret = ( �zellikler )	visit( ctx.bildirimler( a )  );
		//Sadece fonksiyonlar ret.de�eri d�nd�recek onun d���ndakiler return objesini oldu�u gibi geri d�nd�recek...
		if ( ret != null )
		if ( ret.t�r != null )
			if ( ret.t�r.equals ( "RETURN" ) ) return ret  ;
			else if ( ret.t�r.equals ( "HATA" ) ) return ret ;
			
			
		}
		
		return yeni ;
		
	}
	
	
	
	
	
	public Object visitSart_komutu(DilParser.Sart_komutuContext ctx) {
		//if in do�ru oldu�u yada else if ler de return olabilir else de de ...
		
		
		�zellikler sonu� = ( �zellikler ) visit ( ctx.mantik_ifadeleri() ) ;
//	System.out.println ( "Sart Komutu Sonuc : " + sonu� ) ;
		�zellikler ret = null ;
		
		if ( (boolean )sonu�.de�er == true ) 
		{
			for ( int a = 0 ; a < ctx.bildirimler().size() ; a++ )
			{
				
				
				
				ret = ( �zellikler ) visit ( ctx.bildirimler( a ) ) ;
				
				//Sadece fonksiyonlar ret.de�eri d�nd�recek onun d���ndakiler return objesini oldu�u gibi geri d�nd�recek...
				if ( ret!= null )
				if ( ret.t�r != null )
					if ( ret.t�r.equals ( "RETURN" ) ) return ret  ;
					else if ( ret.t�r.equals( "HATA" )  ) return ret ;
					else if ( ret.t�r.equals( "BREAK" ) || ret.t�r.equals( "DEVAM") )
					{
						
						if ( this.d�ng�_stack.empty() )
						{
							System.out.println ( "ba�tan devam et ve d�ng�den ��k komutlar� kull�labilmesi  i�in en az�ndan bir d�ng�n�n i�ine girilmesi gerekmetedir.Kullan�m hatas�..." );
							�zellikler yeni = new �zellikler ( )  ;
							yeni.t�r = "HATA" ;
							yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
							
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
			//Buralarda geri d�n�� de�erleri �nemli olacak....
			boolean bulundu = false ;
				DilParser.Veya_dogruysa_yapisiContext veya_yapisi ;
			for ( int a = 0 ;  a < ctx.veya_dogruysa_yapisi().size() ; a++  )
			{
				veya_yapisi = ctx.veya_dogruysa_yapisi( a  ) ;
				�zellikler sonuc = (�zellikler ) visit ( veya_yapisi.mantik_ifadeleri() ) ;
				if ( (boolean ) sonuc.de�er == true )
				{
					bulundu = true ;
					
					for ( int h = 0 ; h < veya_yapisi.bildirimler().size() ; h++ )
					{
						
						ret = ( �zellikler ) visit ( veya_yapisi.bildirimler( h ) ) ;
						//Sadece fonksiyonlar ret.de�eri d�nd�recek onun d���ndakiler return objesini oldu�u gibi geri d�nd�recek...
						if ( ret.t�r != null )
							if ( ret.t�r.equals ( "RETURN" ) ) return ret  ;
							else if (ret.t�r.equals ( "HATA" ) ) return ret ;
							else if ( ret.t�r.equals( "BREAK" ) || ret.t�r.equals( "DEVAM") )
							{
								
								if ( this.d�ng�_stack.empty() )
								{
									System.out.println ( "ba�tan devam et ve d�ng�den ��k komutlar� kull�labilmesi  i�in en az�ndan bir d�ng�n�n i�ine girilmesi gerekmetedir.Kullan�m hatas�..." );
									�zellikler yeni = new �zellikler ( )  ;
									yeni.t�r = "HATA" ;
									yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
									
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
				
			ret = ( �zellikler ) 	visit ( ctx.dogru_degilse_yapisi() ) ;
				
			//Sadece fonksiyonlar ret.de�eri d�nd�recek onun d���ndakiler return objesini oldu�u gibi geri d�nd�recek...
			if ( ret.t�r != null )
				if ( ret.t�r.equals ( "RETURN" ) ) return ret  ;
				else if ( ret.t�r.equals( "HATA" ) ) return ret ;
				else if ( ret.t�r.equals( "BREAK" ) || ret.t�r.equals( "DEVAM") )
				{
					
					if ( this.d�ng�_stack.empty() )
					{
						System.out.println ( "ba�tan devam et ve d�ng�den ��k komutlar� kull�labilmesi  i�in en az�ndan bir d�ng�n�n i�ine girilmesi gerekmetedir.Kullan�m hatas�..." );
						�zellikler yeni = new �zellikler ( )  ;
						yeni.t�r = "HATA" ;
						yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
						
						return yeni ;
						
					}
					else
					{
						return ret ;
					}
				}
			
			}
			
			
		
			
			
			
		}
		
		
		
		
		
	
	//�art ifadesinin bir �ey d�nmesine gerek yok
	return new �zellikler ( ) ;
	}
	
	
	public Object visitKucuk(DilParser.KucukContext ctx) { 
		�zellikler yeni = new �zellikler ( ) ;
		yeni.t�r = "BOOL" ;
		�zellikler sol_taraf = ( �zellikler ) visit ( ctx.ifadeler( 0 ) ) ;
		�zellikler sa�_taraf = ( �zellikler ) visit ( ctx.ifadeler( 1 ) ) ;
		
		
	
		
		if ( !sol_taraf.t�r .equals( sa�_taraf.t�r))
		{
			System.out.println ( sol_taraf.t�r + " ile " + sa�_taraf.t�r + " ayn� de�il kar��la�t�r�lamazlar..." );
			�zellikler yen = new �zellikler ( )  ;
			yen.t�r = "HATA" ;
			yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yen ;
		}
		
switch ( sol_taraf.t�r )
{
case TAMSAYI:
	if ( (int)sol_taraf.de�er < (int) sa�_taraf.de�er )
		yeni.de�er = true ;
	else yeni.de�er = false ;
	
	break;

case STRING:
	if ( ((String )sol_taraf.de�er).compareTo(  (String)sa�_taraf.de�er )< 0 )
		yeni.de�er = true ;
	else yeni.de�er = false ;
	break;
case NOKTALISAYI:
	if ( (Double)sol_taraf.de�er < (Double)sa�_taraf.de�er )
		yeni.de�er = true ;
	else yeni.de�er = false ;
	
	
	
	

}
		
		return yeni ;
	
	}

	public Object visitNormal_dogru_ifade(DilParser.Normal_dogru_ifadeContext ctx) { return visit(ctx.dogruluk_ifadeleri()); }
	
	
	
	public Object visitVeya_islec(DilParser.Veya_islecContext ctx) { 
	
		
		�zellikler sol_taraf = ( �zellikler ) visit ( ctx.mantik_ifadeleri( 0 ) ) ;
		   �zellikler sa�_taraf = ( �zellikler ) visit ( ctx.mantik_ifadeleri( 1 )  );
		�zellikler yeni = new �zellikler ( );
		yeni.t�r = "BOOL" ;
		
		//Otomatik short cut sa�lan�yor java n�n if yap�s�yla...
		if ( (boolean ) sol_taraf.de�er || ( boolean )sa�_taraf.de�er )
		{
			yeni.de�er = true ;
			
		}
		else yeni.de�er = false ;
		
			
			
			
			return yeni ;
		
	}
	
	
	
	
	
	public Object visitVe_islec(DilParser.Ve_islecContext ctx) {
	
		�zellikler sol_taraf = ( �zellikler ) visit ( ctx.mantik_ifadeleri( 0 ) ) ;
	   �zellikler sa�_taraf = ( �zellikler ) visit ( ctx.mantik_ifadeleri( 1 )  );
	�zellikler yeni = new �zellikler ( );
	yeni.t�r = "BOOL" ;
	
	//Otomatik short cut sa�lan�yor java n�n if yap�s�yla...
	
	if ( sol_taraf.t�r.equals ( "YOK" ) || sa�_taraf.t�r.equals( "YOK" ) )
	{
		yeni.de�er = false ;
		
		
	}
		else
	if ( (boolean ) sol_taraf.de�er && ( boolean )sa�_taraf.de�er )
	{
		yeni.de�er = true ;
		
	}
	else yeni.de�er = false ;
	
		
		
		
		return yeni ;
		
	}
	
	public Object visitParantezli_mantik(DilParser.Parantezli_mantikContext ctx) { 
		
		return visit(ctx.mantik_ifadeleri()); 
		
	}
	
	
	
	
	
	
	public Object visitSaf_deger(DilParser.Saf_degerContext ctx) { 
		
		�zellikler de�i�ken = ( �zellikler ) visit ( ctx.ifadeler() ) ;
		�zellikler yeni = new �zellikler  ( ) ;
		yeni.t�r = "BOOL" ;
		
		
		switch ( de�i�ken.t�r )
		{
		case TAMSAYI:
			if ( (int) de�i�ken.de�er != 0 ) yeni.de�er = true ;
			else yeni.de�er = false ;
			
			break;
		case NOKTALISAYI:
			if ( (Double) de�i�ken.de�er != 0 ) yeni.de�er = true ;
			else yeni.de�er = false ;
			
			break;
		case STRING:
			if ( !((String) de�i�ken.de�er).equals( "" ) ) yeni.de�er = true ;
			else yeni.de�er = false ;
			
			break;	
		
			//Object yok objesi ise do�ruluk de�eri yanl��
		case "YOK":
			if ( de�i�ken.t�r.equals( "YOK" ) ) yeni.de�er = false ;
			else yeni.de�er = true ;
			
			break;
		
		
		
		
		}

		
		return yeni ;
		
		
	}
	
	
	
	
	public Object visitKucuk_esit(DilParser.Kucuk_esitContext ctx) {
		
		 �zellikler yeni = new �zellikler ( ) ;
			yeni.t�r = "BOOL" ;
			�zellikler sol_taraf = ( �zellikler ) visit ( ctx.ifadeler( 0 ) ) ;
			�zellikler sa�_taraf = ( �zellikler ) visit ( ctx.ifadeler( 1 ) ) ;
			
			if ( !sol_taraf.t�r .equals( sa�_taraf.t�r))
			{
				System.out.println ( sol_taraf.t�r + " ile " + sa�_taraf.t�r + " ayn� de�il kar��la�t�r�lamazlar..." );
				�zellikler yen = new �zellikler ( )  ;
				yen.t�r = "HATA" ;
				yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yen ;
			}
			
	switch ( sol_taraf.t�r )
	{
	case TAMSAYI:
		if ( (int)sol_taraf.de�er <= (int) sa�_taraf.de�er )
			yeni.de�er = true ;
		else yeni.de�er = false ;
		
		break;

	case STRING:
		if ( ((String )sol_taraf.de�er).compareTo(  (String)sa�_taraf.de�er ) <= 0 )
			yeni.de�er = true ;
		else yeni.de�er = false ;
		break;
	case NOKTALISAYI:
		if ( (Double)sol_taraf.de�er <= (Double)sa�_taraf.de�er )
			yeni.de�er = true ;
		else yeni.de�er = false ;
		break;
	case "YOK":
		
		System.out.println ( "yok de�eri ba�ka bir veri t�r�yle kar��la�t�r�lamaz..." ) ;
		�zellikler yen = new �zellikler ( )  ;
		yen.t�r = "HATA" ;
		yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
		
		return yen ;
		
		
		

	}
			
			
			
		return yeni ;
	
		
	
	}
	
	
	
	
	 public Object visitBuyuk_esit(DilParser.Buyuk_esitContext ctx) { 
		 
	 
		 �zellikler yeni = new �zellikler ( ) ;
			yeni.t�r = "BOOL" ;
			�zellikler sol_taraf = ( �zellikler ) visit ( ctx.ifadeler( 0 ) ) ;
			�zellikler sa�_taraf = ( �zellikler ) visit ( ctx.ifadeler( 1 ) ) ;
			
			if ( !sol_taraf.t�r .equals( sa�_taraf.t�r))
			{
				System.out.println ( sol_taraf.t�r + " ile " + sa�_taraf.t�r + " ayn� de�il kar��la�t�r�lamazlar..." );
				�zellikler yen = new �zellikler ( )  ;
				yen.t�r = "HATA" ;
				yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yen ;
			}
			
	switch ( sol_taraf.t�r )
	{
	case TAMSAYI:
		if ( (int)sol_taraf.de�er >= (int) sa�_taraf.de�er )
			yeni.de�er = true ;
		else yeni.de�er = false ;
		
		break;

	case STRING:
		if ( ((String )sol_taraf.de�er).compareTo(  (String)sa�_taraf.de�er ) >= 0 )
			yeni.de�er = true ;
		else yeni.de�er = false ;
		break;
	case NOKTALISAYI:
		if ( (Double)sol_taraf.de�er >= (Double)sa�_taraf.de�er )
			yeni.de�er = true ;
		else yeni.de�er = false ;
		break;
		
	case "YOK":
		
		System.out.println ( "yok de�eri ba�ka bir veri t�r�yle kar��la�t�r�lamaz..." ) ;
		�zellikler yen = new �zellikler ( )  ;
		yen.t�r = "HATA" ;
		yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
		
		return yen ;
		
		
		

	}
			
			
			
		return yeni ;
	 
	 }
		
	

	 public Object visitEsit(DilParser.EsitContext ctx) { 
		 �zellikler yeni = new �zellikler ( ) ;
			yeni.t�r = "BOOL" ;
			�zellikler sol_taraf = ( �zellikler ) visit ( ctx.ifadeler( 0 ) ) ;
			�zellikler sa�_taraf = ( �zellikler ) visit ( ctx.ifadeler( 1 ) ) ;
			if ( sol_taraf.t�r.equals ( "YOK" ) || sa�_taraf.t�r.equals ( "YOK" ) )
			{
				if  ( sol_taraf.t�r.equals ( sa�_taraf.t�r ) )
					yeni.de�er = true  ;
				else yeni.de�er = false ;
				
				
				return yeni ;
				
				
			}
			else
			if ( !sol_taraf.t�r .equals( sa�_taraf.t�r))
			{
				System.out.println ( sol_taraf.t�r + " ile " + sa�_taraf.t�r + " ayn� de�il kar��la�t�r�lamazlar..." );
				�zellikler yen = new �zellikler ( )  ;
				yen.t�r = "HATA" ;
				yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yen ;
			}
			
	switch ( sol_taraf.t�r )
	{
	case TAMSAYI:
		if ( (int)sol_taraf.de�er == (int) sa�_taraf.de�er )
			yeni.de�er = true ;
		else yeni.de�er = false ;
		
		break;

	case STRING:
		if ( ((String )sol_taraf.de�er).compareTo(  (String)sa�_taraf.de�er ) == 0 )
			yeni.de�er = true ;
		else yeni.de�er = false ;
		break;
	case NOKTALISAYI:
		if ( (Double)sol_taraf.de�er == (Double)sa�_taraf.de�er )
			yeni.de�er = true ;
		else yeni.de�er = false ;
		break ;
	case "BOOL":
		if ( (boolean)sol_taraf.de�er == (boolean)sa�_taraf.de�er )
			yeni.de�er = true ;
		else yeni.de�er = false ;
		break;
	case "YOK":
		//E�er bir NULL de�erle bir null de�er olmayan kar��la�t�r�l�yorsa sonu� yanl�� aksi halde do�ru...
		if ( !sa�_taraf.t�r.equals ( "YOK") )
		{
			yeni.de�er = false ;
			
		}
		else yeni.de�er = true ;
		
		
		
		break;
		
		

	}
			
			
			
		return yeni ;
		 
	 
	 }
		
	
	
	public Object visitBuyuk(DilParser.BuyukContext ctx) { 
		�zellikler yeni = new �zellikler ( ) ;
		yeni.t�r = "BOOL" ;
		�zellikler sol_taraf = ( �zellikler ) visit ( ctx.ifadeler( 0 ) ) ;
		�zellikler sa�_taraf = ( �zellikler ) visit ( ctx.ifadeler( 1 ) ) ;
		
		if ( !sol_taraf.t�r .equals( sa�_taraf.t�r))
		{
			System.out.println ( sol_taraf.t�r + " ile " + sa�_taraf.t�r + " ayn� de�il kar��la�t�r�lamazlar..." );
			�zellikler yen = new �zellikler ( )  ;
			yen.t�r = "HATA" ;
			yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yen ;
		}
		
switch ( sol_taraf.t�r )
{
case TAMSAYI:
	if ( (int)sol_taraf.de�er > (int) sa�_taraf.de�er )
		yeni.de�er = true ;
	else yeni.de�er = false ;
	
	break;

case STRING:
	if ( ((String )sol_taraf.de�er).compareTo(  (String)sa�_taraf.de�er ) > 0 )
		yeni.de�er = true ;
	else yeni.de�er = false ;
	break;
case NOKTALISAYI:
	if ( (Double)sol_taraf.de�er > (Double)sa�_taraf.de�er )
		yeni.de�er = true ;
	else yeni.de�er = false ;
	break;
	
case "YOK":
	
	System.out.println ( "yok de�eri ba�ka bir veri t�r�yle kar��la�t�r�lamaz..." ) ;
	�zellikler yen = new �zellikler ( )  ;
	yen.t�r = "HATA" ;
	yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
	
	return yen ;

	
	
	
	

}
		
		
		
	return yeni ;
	
	}
	
	
	
	
	public Object visitParantezli_dogru(DilParser.Parantezli_dogruContext ctx) { return visit(ctx.dogruluk_ifadeleri()); }
	
	public Object visitDegili(DilParser.DegiliContext ctx) { 
		
		//Bu bir ifadenin sonucunu geri d�nd�recek..
		�zellikler sonu� = ( �zellikler ) visit ( ctx.dogruluk_ifadeleri() ) ;
		
		sonu�.de�er = !(boolean) (sonu�.de�er) ;
		
		return sonu� ;
		
		
		
	
	}
	
	
	
	
	
	
	
	
	public Object visitArray_eleman_ekleme(DilParser.Array_eleman_eklemeContext ctx) { 
		
		�zellikler array_de�i�keni = ( �zellikler ) visit ( ctx.sol_taraf_degiskenleri() ) ;
		//Ekleme yap�lacak array de�i�keni de�ilse hata ver....
		if ( !array_de�i�keni.t�r.equals( "ARRAY" ) ) 
		{
			System.out.println ( ctx.sol_taraf_degiskenleri().getText() +" de�i�keni bir array de�il bu y�zden ekleme yap�lamaz..." ) ;
			�zellikler yeni = new �zellikler ( )  ;
			yeni.t�r = "HATA" ;
			yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
			
		}
	
		//Bir problem yoksa ....
		HashMap <String , �zellikler > ekleme_yap�lacak_map = (HashMap<String, �zellikler>) array_de�i�keni.de�er ;
		�zellikler eklenecek_veri = ( �zellikler ) visit ( ctx.ifadeler() ) ;
		
		
		//Hi� eleman olmasa bile 0. indeksten ba�lanarak ekleme yap�lacak...
	int index  = 0 ;
		do
		{
			if ( ekleme_yap�lacak_map.containsKey(""+ index) ) ;
			else
			{
				//System.out.println( "Ekleme yap�lan index : " + index );
				ekleme_yap�lacak_map.put( ""+index , eklenecek_veri ) ;
				
				break ;
			}
			index ++ ;
			
		}
		while ( true ) ;
		
		
		
		
	
	return new �zellikler ( );
	}
	
	
	
	
	
	
	
	
	public Object visitProgram_sonlandir(DilParser.Program_sonlandirContext ctx) 
	{ 
		
		�zellikler yeni = new �zellikler ( )  ;
		yeni.t�r = "HATA" ;
		yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
	
	}
	
	
	
	
	
	public Object visitArray_degiske(DilParser.Array_degiskeContext ctx) {
		
		
		//System.out.println ( "Array degiske"  );
	
		
		
	return visit( ctx.array_degiskeni() ) ;
	
	}

	
	
	public Object visitDeger_ata(DilParser.Deger_ataContext ctx) { 
		
		
		//ilk �nce soldaki atanacak olanlar�n say�s� ile sa�daki atananlar�n say�s� ayn�m� diye kontrol edilecek
		int sol_taraf_say� = ctx.sol_taraf_degiskenleri().size() ;
		int sa�_taraf_say� = ctx.ifadeler().size( ); 
		
		if ( sol_taraf_say� > sa�_taraf_say� )
		{
			System.out.println ( "Atananlar�n say�s� yetersiz...." ) ;
			
			�zellikler yeni = new �zellikler ( )  ;
			yeni.t�r = "HATA" ;
			yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
			
			
		}
		else if ( sol_taraf_say� < sa�_taraf_say� )
		{
		//	System.out.println ( "Sol taraftaki de�i�kenlerin say�s� yetersiz" ) ;
			�zellikler yeni = new �zellikler ( )  ;
			yeni.t�r = "HATA" ;
			yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
		}
		
		//Sa� sol say�lar� e�it ve atamalar� ger�ekle�tiriyoruz..
		
		//Sol tarafta daha hen�z de�eri atanmam��  array elemanlar� olabilir bunu sa�lamak i�in bu de�i�keni set ediyoruz..
		//B�ylece array eleman�na ziyaret ederken e�er o indekse ait eleman yoksa hemen orada o index olu�turulacak...
		this.array_elaman�na_de�er_atama = true ;
		
		//*****Referans ve Dinamik veri t�rlerine dikkat edilecek...*****
		�zellikler tempo =new �zellikler ( ) ;
		for ( int b = 0 ; b < sol_taraf_say� ; b++ )
		{
			HashMap temporary ;
			this.dinamik_de�i�keni_durumu = KEND�S� ;
		
			this.referans_de�i�keni_durumu = KEND�S� ;
			�zellikler sol_taraf = ( �zellikler ) visit ( ctx.sol_taraf_degiskenleri( b ) ) ;
			//System.out.println ( "Sol taraf : " + sol_taraf ) ;
			
			//Dinamik bir de�i�kene referans edilince exception bir durum oluyor...
			
			this.dinamik_de�i�keni_durumu = REFER_ETT��� ;
			
			
			this.referans_de�i�keni_durumu = REFER_ETT���; ;
			�zellikler sa�_taraf = ( �zellikler ) visit ( ctx.ifadeler( b )  );
			
			tempo = sa�_taraf ;
			
			//System.out.println ( "Sa� : " + sa�_taraf ) ;
		//	tempo.t�r = sa�_taraf.t�r ;
		//	tempo.de�er = sa�_taraf.de�er ;
			
			if ( sa�_taraf.t�r.equals( "ARRAY") ) 
			{
			//System.out.println ( "Array objesi e�itleme "  ) ;
			
				
				
				//E�er array varsa bir tek bunun kopyas� olu�turulacak...
				
		   tempo = new �zellikler ( ) ;
		   tempo.t�r = sa�_taraf.t�r ;
		   
			ObjectOutputStream object_output = null ;
			ByteArrayOutputStream output = new ByteArrayOutputStream() ;
			try {
				 object_output = new ObjectOutputStream( output ) ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//System.out.println ( "Sa� taraf : " + sa�_taraf ) ;

			try {
				object_output.writeObject( sa�_taraf );
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println ( "Dosya yazma error " ) ;
				�zellikler yeni = new �zellikler ( )  ;
				yeni.t�r = "HATA" ;
				yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
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
			�zellikler yeni = new �zellikler ( )  ;
			yeni.t�r = "HATA" ;
			yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
			}


			�zellikler copied = null ;

			try {
				copied = (�zellikler) object_input.readObject( ) ;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//	System.out.println ( "Clonlana array : " + cloned ) ;
		//	System.out.println ( "Orjinal array : " + sa�_taraf.de�er ) ;
			tempo.de�er = copied.de�er ;
			
			
			}
			
			//Sa� taraf array hari�se aynen kalacak...
			sa�_taraf = tempo ;
			
			//Burada Referans ve Dinamik veri t�rlerine dikkat edilecek....
		    //Bu hen�z o indekse de�er at�lmam�� array elemanlar�nda YOK t�r�nde bir �zellikler geri d�n�l�yor...
			if ( sol_taraf.t�r.equals( "YOK" ) )
			{
				sol_taraf.t�r = sa�_taraf.t�r ;
				sol_taraf.de�er = sa�_taraf.de�er ;
				
			}
			else if ( sol_taraf.t�r.equals("D�NAM�K") )
			{
			//	System.out.print ( "Sol taraf : " + sol_taraf ) ;
				((�zellikler)sol_taraf.de�er).de�er = sa�_taraf.de�er ;
				((�zellikler)sol_taraf.de�er).t�r  = sa�_taraf.t�r ;
				this.array_elaman�na_de�er_atama = false ;
				//sadece bo� bir nesne d�n�yoruz...
				
				this.dinamik_de�i�keni_durumu = REFER_ETT��� ;
				return new �zellikler ( ) ;
				
			}
			else if ( sol_taraf.t�r.equals( "REFERANS" ) ) 
			{//System.out.println ( "Ref" );
				//Referab
			
				
				
				
			if ( ( (�zellikler)sol_taraf.de�er).t�r .equals( sa�_taraf.t�r ))
			{
				
			}
			else
			{
				System.out.println ( "Refans de�i�kenin refer etti�i de�i�kenin t�r� : " +  ((�zellikler)sol_taraf.de�er).t�r + " buna atanan t�r : " +sa�_taraf.t�r   )  ;
				�zellikler yeni = new �zellikler ( )  ;
				yeni.t�r = "HATA" ;
				yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
			}
				(( �zellikler)sol_taraf.de�er).de�er = sa�_taraf.de�er ;
				this.array_elaman�na_de�er_atama = false ;
				
				this.dinamik_de�i�keni_durumu = REFER_ETT��� ;
				
				
				
				//sadece bo� bir nesne d�n�yoruz...
				return new �zellikler ( ) ;
				
			}
			else 
			if ( !sol_taraf.t�r.equals( sa�_taraf.t�r ) )
			{
				System.out.println ( "Atama hatas� : "+ ctx.sol_taraf_degiskenleri(b).getText() + " de�i�keninin t�r�" + sol_taraf.t�r + " atanan de�erin t�r� : " + sa�_taraf.t�r );
				�zellikler yeni = new �zellikler ( )  ;
				yeni.t�r = "HATA" ;
				yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
			}
			
			//atama yap�l�yor..
			sol_taraf.de�er = sa�_taraf.de�er ;
		//	System.out.println ( "Atanan sa� taraf de�eri : " + sol_taraf.de�er ) ;
			
		}
		
		
		//Bu sadece elemanlara de�er atan�rken true olmal�d�r aksi halde false ...
		this.array_elaman�na_de�er_atama = false ;
		
		this.dinamik_de�i�keni_durumu = REFER_ETT��� ;
	
		
		
		
		//sadece bo� bir nesne d�n�yoruz...
		return new �zellikler ( ) ;
	
	}
	
	
	
	
	
	
	
	
	
	//*******�imdilik array [ 0 ]  ile array [ "0"] aras�nda fark yok....
	//Array indeksleri string olabilir veya tamsay� olabilir...
	public Object visitArray_deger_al(DilParser.Array_deger_alContext ctx) 
	
	{ 
		//�ncelikle memoriden de�i�keni al�yoruz....
		
		//System.out.println ( "visitArray_deger_al day�z ...  " ) ;
		//System.out.print ( "Al�nacak de�i�ken ismi : " + ctx.degisken_ismi().getText() ) ;
		
		this.referans_de�i�keni_durumu = REFER_ETT��� ;
		this.dinamik_de�i�keni_durumu = REFER_ETT��� ;
		�zellikler de�i�ken = ( �zellikler ) visit ( ctx.degisken_ismi() ) ;
		
		String de�i�ken_ismi = ctx.degisken_ismi().getText() ;
		
	//System.out.println ( "array de�i�ken t�r : " + de�i�ken.t�r ) ;
	//System.out.println ( "array de�eri : " + de�i�ken.de�er ) ;
		
	
		if  ( de�i�ken.t�r.equals(  this.STRING ) ) 
		{
			�zellikler yen = new �zellikler ( ) ;
			
			if  ( ctx.ifadeler().size() != 1 )
			{
				System.out.println ( "Karakter t�r�n�n yanl�zca bir boyutta indeksi olabilir..." ) ;
				�zellikler yeni = new �zellikler ( )  ;
				yeni.t�r = "HATA" ;
				yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
				
			}
			�zellikler index = ( �zellikler ) visit ( ctx.ifadeler( 0 ) ) ;
			
			if ( !index.t�r.equals( "TAMSAYI") )
			{
				System.out.println( "Karakter t�r�yle yanl�zca Tamsay� t�r�nden indeksler kullan�labilir.�rn: 1 , 2 ... " ); 
				�zellikler yeni = new �zellikler ( )  ;
				yeni.t�r = "HATA" ;
				yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
			}
			
			yen.t�r = STRING ;
			yen.de�er =  ( ( String )de�i�ken.de�er ).charAt( (int) index.de�er ) + "" ; 
			//System.out.println ( "de�i�ken de�er : " + ( ( String )de�i�ken.de�er ).charAt( (int) index.de�er )) ;
			//System.out.println ( "Geri d�n�len karakter : " + yen ) ;
			return yen ;
		}
		else 
		if ( !de�i�ken.t�r.equals( "ARRAY") )
	{
		System.out.println ( ctx.degisken_ismi().getText() + " de�i�keni bir array de��keni de�il ve [ ] i�le�leriyle kullan�lamaz..." ) ;
		�zellikler yeni = new �zellikler ( )  ;
		yeni.t�r = "HATA" ;
		yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
	}
	
	ArrayList eleman_indeks_s�ras� = new ArrayList ( ) ;
	
	
	//Buras� arrayin elemanlar�na kademe kademe ula�t���m�z yer
	//E�er array olmayan bir elemanla kar��la��l�rsa ve hala [] i�leci varsa hata veriyoruz...
	for ( int a = 0 ; a< ctx.ifadeler().size() ; a++  )
	{
		�zellikler index = ( �zellikler ) visit ( ctx.ifadeler( a ) ) ;
		if ( !index.t�r.equals(TAMSAYI) && !index.t�r.equals(STRING) )
		{
			System.out.println ( "Arrayin indeksi bir tamsay� yada string olmal�d�r..." ) ;
			�zellikler yeni = new �zellikler ( )  ;
			yeni.t�r = "HATA" ;
			yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
		}
		
		//System.out.println ( "�ndex de�er : " + index.de�er ) ;
	
		if ( de�i�ken.t�r.equals( STRING ) )
		{
			�zellikler c = new �zellikler ( ) ;
			c.t�r = STRING ;
			
			if ( index.t�r.equals( "TAMSAYI" ) ) 
			{
				try
				{
				c.de�er = ( ( String ) de�i�ken.de�er).charAt( ( int ) index.de�er ) +"" ;  
				}
				catch ( Exception err )
				{
					System.out.println ( "indekleme hatas� Karakter de�erinde " + index.de�er + " indeksi bulunmamaktad�r..." ) ;
					�zellikler yeni = new �zellikler ( )  ;
					yeni.t�r = "HATA" ;
					yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
					
					return yeni ;
				}
				de�i�ken = c ;
				continue ;
			}
			else
			{
				System.out.println ( "�u anda indeksleme yap�lan t�r Karakter. Karakter i�in " + index.t�r + " ile indeksleme yap�lamaz Tamsay� olmal�d�r..." ) ;
				�zellikler yeni = new �zellikler ( )  ;
				yeni.t�r = "HATA" ;
				yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
			}
			
		}else 
		if ( !de�i�ken.t�r.equals( "ARRAY" ) )
	{
		System.out.println ( "�u an ki de�i�ken bir array de�il bu y�zden '" + index.de�er + "' ile indekslenemez..." ) ;
		�zellikler yeni = new �zellikler ( )  ;
		yeni.t�r = "HATA" ;
		yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
		
	}
		
		�zellikler array_eleman� = null;
		try
		{
		array_eleman� = ( �zellikler )  ( ( HashMap ) de�i�ken.de�er ).get( "" +  index.de�er ) ;
	
		if ( array_eleman� == null ) 
		{
		//E�er atama i�lemi yap�lm�yorsa hata verilecek bu durumda ��nk� eleman yok indekste...
			if ( this.array_elaman�na_de�er_atama == false )
			throw new IndexOutOfBoundsException ( ) ;
			
			//yeni olu�turulan eleman�n t�r� YOK olacak bu t�r her t�re atanabilir olacak...
		�zellikler temp = new �zellikler ( ) ;
		
		//Buras� �nemli; olmayan bir indekse olmayan bir indeks at�l�rsa bir �nceki mutlaka HashMap olmal�....
		//E�er sadece olmayan indeks var buraya da t�r� olmayan bo� bir eleman at�lacak ve atamada bu bo� eleman doldurulacak..
		if ( a +1 == ctx.ifadeler().size() )
		{
		temp.t�r = "YOK" ;
		temp.de�er = null ;
		}
		else
		{temp.t�r = "ARRAY" ;
		temp.de�er = new HashMap<String, �zellikler> ( );
			
		}
			( ( HashMap ) de�i�ken.de�er ).put( ""+index.de�er , temp  ) ;
			array_eleman� = temp ;
		//	return temp ;
		
		
		
		}
		
	//	System.out.println( "Array eleman� : " + array_eleman�.de�er );
		
		eleman_indeks_s�ras�.add( index.de�er  ) ;
		}
		catch ( java.lang.IndexOutOfBoundsException err )
		{
			eleman_indeks_s�ras�.add ( index.de�er ) ;
			String message = "" + de�i�ken_ismi;
			for ( int b = 0 ; b< eleman_indeks_s�ras�.size() ; b++ )
		    {
			message += "["+eleman_indeks_s�ras�.get(b)+"]" ;
				
			}
			
		//	System.out.println ( "Current hash : " + ( ( HashMap ) de�i�ken.de�er ) ) ;
			System.out.println ( message+ " eleman� arrayda bulunmuyor indeks s�n�r a��m�..." ) ;
			�zellikler yeni = new �zellikler ( )  ;
			yeni.t�r = "HATA" ;
			yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
		}
	    
	    de�i�ken = array_eleman� ;
		
	
	
	}
	
	
	
	
	
	return de�i�ken ;
	
	}
	
	
	
	
	
	
	
	
	public Object visitArray_list_hazirlandi(DilParser.Array_list_hazirlandiContext ctx) { 
	
		�zellikler yeni = new �zellikler ( ) ;
		
		yeni.t�r = ARRAY ;
		HashMap<String , �zellikler> liste = new HashMap<String , �zellikler> ( ) ;
		
		//�fadeleri tek tek array liste at�yoruz....
		for ( int a = 0 ; a < ctx.ifadeler().size() ; a++ ) 
		{
			//Burada indexler 0 dan ba�lay�p elemanlar� hashmap yerle�tiriyoruz...
			liste.put( ""+a , (�zellikler) visit ( ctx.ifadeler( a ) ) ) ;
			
		}
	yeni.de�er = liste ;
		
		//System.out.println ( "array list haz�rland� : " + yeni.de�er) ;
		
		
		//Olu�turulan listeyi geri d�nd�r�yoruz...
	return yeni ;
	
	}
	
	public Object visitDegisken_deger_al(DilParser.Degisken_deger_alContext ctx) { 
		
		return visit(ctx.degisken_ismi());
		
	
	}
	
	
//�u anki scopta de�i�kenin kendisini elde edebilmek i�in yaz�ld�...
	//Visit yeni olu�turulan de�i�kenin kendisini geri d�nd�rm�yor...
	//try catch yap�s�nda kullan�l�yor...
public Object de�i�ken_getir ( String de�i�ken_ismi) { 
	

		
		
		
		//System.out.println ( "visitDe�i�ken_deger_Al" ) ;
		String de�i�ken = de�i�ken_ismi ;
		FunctionTable son_kay�t = this.fonksiyon_stack.peek() ;
		
		//System.out.println ( "�stenilen de�i�ken ismi : " + de�i�ken ) ;
		
		
		HashMap eleman_al�nacak_mem = son_kay�t.lokal_de�i�ken_memory ;
		if  ( this.structure_current_mem.empty() )
		{
			
		}
		else
		{
			eleman_al�nacak_mem = (HashMap) this.structure_current_mem.peek().de�er ;
	//	System.out.println ( "structure eleman mem : " + eleman_al�nacak_mem ) ;
	//	System.out.println ( "structure da Aranan de�i�ken " + de�i�ken )  ;
		
		if ( eleman_al�nacak_mem.containsKey ( de�i�ken ))
		{
			
		}
		else
		{
		System.out.println ( de�i�ken + " "  +  this.structure_current_mem.peek().t�r + " yap�s�n�n bir eleman� de�il..." ) ;	
		�zellikler yeni = new �zellikler ( )  ;
		yeni.t�r = "HATA" ;
		yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
		}
		
		
		�zellikler bulunan__ =  (�zellikler) eleman_al�nacak_mem.get( de�i�ken ) ;
		if ( bulunan__.t�r == "REFERANS" )
		{
			if ( this.referans_de�i�keni_durumu.equals( KEND�S� ) )
			{
				
			}
			else
			{//System.out.println ( "refer edilen d�necek..." ) ;
			
				
				bulunan__ = (�zellikler) bulunan__.de�er ;
				//System.out.println ( "Refer edilen : " + bulunan__) ;
			}
			
		}
		else if ( bulunan__.t�r.equals( "D�NAM�K" ) )
		{
			if ( this.dinamik_de�i�keni_durumu.equals( KEND�S�))
		{
			
			
		}else 
		{
			bulunan__ = ( �zellikler ) bulunan__.de�er ;
		}
		
		}
		
		return bulunan__ ;
		
		
		
		
		}
		if ( !eleman_al�nacak_mem.containsKey( de�i�ken ) )
		{
		
			//E�er hi� bir fonksiyon �a�r�lmad�ysa hata mesaj� ver...
			if ( son_kay�t.number == 0 )
			{
		System.out.println ( "Daha �nce " + de�i�ken + " tan�mlanmam��..." ) ;
		�zellikler yeni = new �zellikler ( )  ;
		yeni.t�r = "HATA" ;
		yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
			}
			else if ( son_kay�t.number == 1 )
			{
				if ( !son_kay�t.previous_function_table.lokal_de�i�ken_memory.containsKey( de�i�ken ) )
				{System.out.println ( "Daha �nce " + de�i�ken + " tan�mlanm��..." ) ;
				�zellikler yeni = new �zellikler ( )  ;
				yeni.t�r = "HATA" ;
				yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
					
				}
				
				
				
				
				�zellikler bulunan__ =  (�zellikler) son_kay�t.previous_function_table.lokal_de�i�ken_memory.get( de�i�ken ) ;
				if ( bulunan__.t�r == "REFERANS" )
				{
					if ( this.referans_de�i�keni_durumu.equals( KEND�S� ) )
					{
						
					}
					else
					{//System.out.println ( "refer edilen d�necek..." ) ;
					
						
						bulunan__ = (�zellikler) bulunan__.de�er ;
						//System.out.println ( "Refer edilen : " + bulunan__) ;
					}
					
				}
				else if ( bulunan__.t�r.equals( "D�NAM�K" ) )
				{
					if ( this.dinamik_de�i�keni_durumu.equals( KEND�S�))
				{
					
					
				}else 
				{
					bulunan__ = ( �zellikler ) bulunan__.de�er ;
				}
				
				}
				
				return bulunan__ ;
				
			}
			else if ( son_kay�t.number>=2)
			{
				
				if ( !this.fonksiyon_stack.get(0) .lokal_de�i�ken_memory.containsKey( de�i�ken ))
				{
					System.out.println ( "Daha �nce " + de�i�ken + " tan�mlanm��..." ) ;
					�zellikler yeni = new �zellikler ( )  ;
					yeni.t�r = "HATA" ;
					yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
					
					return yeni ;
				}
				
				
				
				
			//�u k�sm� fonksiyonlara parametre ge�iriken kullanaca��z...	
				/* if ( !son_kay�t.previous_function_table.lokal_de�i�ken_memory.containsKey(de�i�ken) )
				{
					if ( !this.fonksiyon_stack.get(0) .lokal_de�i�ken_memory.containsKey( de�i�ken ))
					{
						System.out.println ( "Daha �nce " + de�i�ken + " tan�mlanm��..." ) ;
						System.exit( 0 ); 
					}
					
					return this.fonksiyon_stack.get(0 ).lokal_de�i�ken_memory.get( de�i�ken ) ;
							
					
				}
				*/
				
				�zellikler bulunan__ =  (�zellikler) this.fonksiyon_stack.get(0 ).lokal_de�i�ken_memory.get( de�i�ken ) ;
				if ( bulunan__.t�r.equals( "REFERANS"))
				{	if ( referans_de�i�keni_durumu .equals( KEND�S� ) )
					{
						
						
					}
					else {
						
						bulunan__ = (�zellikler) bulunan__.de�er ;
					///System.out.println( "Refer edilen : d�n�lecek  de�eri : " + bulunan__ );
					}
				}
				else if (  bulunan__.t�r.equals( "D�NAM�K" ) )
					{
					
					if ( this.dinamik_de�i�keni_durumu.equals( KEND�S� ) ) 
					{
						
						
					}
					else {
						bulunan__ = (�zellikler) bulunan__.de�er ;
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
				System.out.println ( de�i�ken + " "  + this.structure_current_mem.peek().t�r + " eleman� de�ildir..."  ) ;
				�zellikler yeni = new �zellikler ( )  ;
				yeni.t�r = "HATA" ;
				yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
			}
			
			
		}
	
	
		�zellikler bulunan__ = ( �zellikler)  eleman_al�nacak_mem.get( de�i�ken ) ;
	if ( bulunan__.t�r.equals( "REFERANS"))
	{
		if ( referans_de�i�keni_durumu .equals( KEND�S� ) )
		{
			///System.out.println ( "Kendisi isteniyor..." ) ;
			
		}
		else {
			bulunan__ = (�zellikler) bulunan__.de�er ;
			//System.out.println( "Refer edilen : d�n�lecek  de�eri : " + bulunan__ );
			return bulunan__ ;
			
		}
	}
	else if (  bulunan__.t�r.equals( "D�NAM�K" ) )
	{
	
	if ( this.dinamik_de�i�keni_durumu.equals( KEND�S� ) ) 
	{
		
		
	}
	else {
	
		bulunan__ = (�zellikler) bulunan__.de�er ;
	//	System.out.println( "Dinamik de�i�kenin tutttu�u de�er d�nd�r�lecek de�er : " + bulunan__  );
		
	
	
	}
	
	
	
}

	
	
	
		return bulunan__  ;
		
		
		
		
	}
	
	
	
	
	public Object visitDegisken_deger(DilParser.Degisken_degerContext ctx) { 
	

		
		
		
		
		
		
		//System.out.println ( "visitDe�i�ken_deger_Al" ) ;
		String de�i�ken = ctx.getText() ;
		FunctionTable son_kay�t = this.fonksiyon_stack.peek() ;
		
		//System.out.println ( "�stenilen de�i�ken ismi : " + de�i�ken ) ;
		if ( this.son_�a�r�lan_fonksiyon_t�r�.isEmpty() == false );
		//System.out.println ( "En son �a�r�lan fonksiyon t�r� : " + this.son_�a�r�lan_fonksiyon_t�r�.peek() );
		
		// System.println ( "this.strucutre_current_mem : " + this.structure_current_mem.empty() ) ;
		
		
		
		
		
		HashMap eleman_al�nacak_mem = son_kay�t.lokal_de�i�ken_memory ;
		if  ( this.structure_current_mem.empty() )
		{
			
		}
		else
		{
			eleman_al�nacak_mem = (HashMap) this.structure_current_mem.peek().de�er ;
	//	System.out.println ( "structure eleman mem : " + eleman_al�nacak_mem ) ;
	//	System.out.println ( "structure da Aranan de�i�ken " + de�i�ken )  ;
		
		if ( eleman_al�nacak_mem.containsKey ( de�i�ken ))
		{
			
		}
		else
		{
		System.out.println ( de�i�ken + " "  +  this.structure_current_mem.peek().t�r + " yap�s�n�n bir eleman� de�il..." ) ;	
		�zellikler yeni = new �zellikler ( )  ;
		yeni.t�r = "HATA" ;
		yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
		}
		
		
		�zellikler bulunan__ =  (�zellikler) eleman_al�nacak_mem.get( de�i�ken ) ;
	//	System.out.println ("Aranan de� : " + bulunan__ ) ;
		if ( bulunan__.t�r == "REFERANS" )
		{
			if ( this.referans_de�i�keni_durumu.equals( KEND�S� ) )
			{
				
			}
			else
			{//System.out.println ( "refer edilen d�necek..." ) ;
			
				
				bulunan__ = (�zellikler) bulunan__.de�er ;
				//System.out.println ( "Refer edilen : " + bulunan__) ;
			}
			
		}
		else if ( bulunan__.t�r.equals( "D�NAM�K" ) )
		{
			if ( this.dinamik_de�i�keni_durumu.equals( KEND�S�))
		{
			
			
		}else 
		{
			bulunan__ = ( �zellikler ) bulunan__.de�er ;
		}
		
		}
		
		return bulunan__ ;
		
		
		
		
		}
		
		
		if ( !eleman_al�nacak_mem.containsKey( de�i�ken ) )
		{
		
			//E�er hi� bir fonksiyon �a�r�lmad�ysa hata mesaj� ver...
			if ( son_kay�t.number == 0 )
			{
		System.out.println ( "Daha �nce " + de�i�ken + " tan�mlanmam��..." ) ;
		�zellikler yeni = new �zellikler ( )  ;
		yeni.t�r = "HATA" ;
		yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
		
		return yeni ;
			}
			else if ( son_kay�t.number == 1 )
			{
				
				boolean s�n�fta = false ;
				�zellikler s�n�fta_bulunan = null ;
				
				if ( !son_kay�t.previous_function_table.lokal_de�i�ken_memory.containsKey( de�i�ken ) )
				{
					//��erde yapmakla local de�i�kenler s�n�f de�i�kenlerini bloke ediyorlar...
				//	System.out.println ( "**********S�n�fta Aranacak...*********" ) ;
			if ( this.son_�a�r�lan_fonksiyon_t�r�.peek().equals ( "SINIF" ) )
			{
				//System.out.println ( "de�i�ken__ : " + de�i�ken ) ;
			//	System.out.println ( "s�n�f�n memorisi : " + this.s�n�f_memory_stack.peek ( ) );
				
				
			//	System.out.println ( "Saim SUNEL" ) ;
			if ( this.s�n�f_memory_stack.peek().containsKey( de�i�ken ) )
			{
				s�n�fta_bulunan = ( �zellikler) this.s�n�f_memory_stack.peek ().get( de�i�ken ) ;
		//	System.out.println ( "S�nfta bulunan : " + s�n�fta_bulunan ) ;
				s�n�fta = true;
			}
			else
			{
					
					
					System.out.println ( "Daha �nce " + de�i�ken + " tan�mlanmam��..." ) ;
					�zellikler yeni = new �zellikler ( )  ;
					yeni.t�r = "HATA" ;
					yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
					
					return yeni ;
			}
				
				
			}
			else
			{
					
					
					System.out.println ( "Daha �nce " + de�i�ken + " tan�mlanmam��..." ) ;
					�zellikler yeni = new �zellikler ( )  ;
					yeni.t�r = "HATA" ;
					yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
					
					return yeni ;
			}
				
				
				}
				
				
				
				
				�zellikler bulunan__ =  (�zellikler) son_kay�t.previous_function_table.lokal_de�i�ken_memory.get( de�i�ken ) ;
				if ( s�n�fta == true  ) bulunan__ = s�n�fta_bulunan ;
			//	System.out.println ( "s�n�fta = " + s�n�fta ) ;
			//	System.out.println ( "Bulunan : " + bulunan__ ) ;
				
				
				if ( bulunan__.t�r == "REFERANS" )
				{
					if ( this.referans_de�i�keni_durumu.equals( KEND�S� ) )
					{
						
					}
					else
					{//System.out.println ( "refer edilen d�necek..." ) ;
					
						
						bulunan__ = (�zellikler) bulunan__.de�er ;
						//System.out.println ( "Refer edilen : " + bulunan__) ;
					}
					
				}
				else if ( bulunan__.t�r.equals( "D�NAM�K" ) )
				{
					if ( this.dinamik_de�i�keni_durumu.equals( KEND�S�))
				{
					
					
				}else 
				{
					bulunan__ = ( �zellikler ) bulunan__.de�er ;
				}
				
				}
				
				return bulunan__ ;
				
			}
			else if ( son_kay�t.number>=2)
			{
				
				boolean s�n�fta = false ;
				�zellikler s�n�fta_bulunan = null ;
				
				if ( !this.fonksiyon_stack.get(0) .lokal_de�i�ken_memory.containsKey( de�i�ken ))
				{
					
					if ( this.son_�a�r�lan_fonksiyon_t�r�.peek().equals ( "SINIF" ) )
					{
					if ( this.s�n�f_memory_stack.peek().containsKey(de�i�ken ))
					{
						s�n�fta = true ;
						s�n�fta_bulunan = ( �zellikler ) this.s�n�f_memory_stack.peek().get( de�i�ken ) ;
						
					}else
					{
						
						
						System.out.println ( "Daha �nce " + de�i�ken + " tan�mlanmam��..." ) ;
						�zellikler yeni = new �zellikler ( )  ;
						yeni.t�r = "HATA" ;
						yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
						
						return yeni ;
				}
					
						
					}
					else
					{
						System.out.println ( "Daha �nce " + de�i�ken + " tan�mlanmam��..." ) ;
						�zellikler yeni = new �zellikler ( )  ;
						yeni.t�r = "HATA" ;
						yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
						
						return yeni ;
					}
				
				}
				
				
				
				
			//�u k�sm� fonksiyonlara parametre ge�iriken kullanaca��z...	
				/* if ( !son_kay�t.previous_function_table.lokal_de�i�ken_memory.containsKey(de�i�ken) )
				{
					if ( !this.fonksiyon_stack.get(0) .lokal_de�i�ken_memory.containsKey( de�i�ken ))
					{
						System.out.println ( "Daha �nce " + de�i�ken + " tan�mlanm��..." ) ;
						System.exit( 0 ); 
					}
					
					return this.fonksiyon_stack.get(0 ).lokal_de�i�ken_memory.get( de�i�ken ) ;
							
					
				}
				*/
				
				�zellikler bulunan__ =  (�zellikler) this.fonksiyon_stack.get(0 ).lokal_de�i�ken_memory.get( de�i�ken ) ;
				if ( s�n�fta == true ) bulunan__ = s�n�fta_bulunan ;
				
				if ( bulunan__.t�r.equals( "REFERANS"))
				{	if ( referans_de�i�keni_durumu .equals( KEND�S� ) )
					{
						
						
					}
					else {
						
						bulunan__ = (�zellikler) bulunan__.de�er ;
					///System.out.println( "Refer edilen : d�n�lecek  de�eri : " + bulunan__ );
					}
				}
				else if (  bulunan__.t�r.equals( "D�NAM�K" ) )
					{
					
					if ( this.dinamik_de�i�keni_durumu.equals( KEND�S� ) ) 
					{
						
						
					}
					else {
						bulunan__ = (�zellikler) bulunan__.de�er ;
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
				System.out.println ( de�i�ken + " "  + this.structure_current_mem.peek().t�r + " eleman� de�ildir..."  ) ;
				�zellikler yeni = new �zellikler ( )  ;
				yeni.t�r = "HATA" ;
				yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
			}
			
			
		}
	
	
		�zellikler bulunan__ = ( �zellikler)  eleman_al�nacak_mem.get( de�i�ken ) ;
	if ( bulunan__.t�r.equals( "REFERANS"))
	{
		if ( referans_de�i�keni_durumu .equals( KEND�S� ) )
		{
			///System.out.println ( "Kendisi isteniyor..." ) ;
			
		}
		else {
			bulunan__ = (�zellikler) bulunan__.de�er ;
			//System.out.println( "Refer edilen : d�n�lecek  de�eri : " + bulunan__ );
			return bulunan__ ;
			
		}
	}
	else if (  bulunan__.t�r.equals( "D�NAM�K" ) )
	{
	
	if ( this.dinamik_de�i�keni_durumu.equals( KEND�S� ) ) 
	{
		
		
	}
	else {
	
		bulunan__ = (�zellikler) bulunan__.de�er ;
	//	System.out.println( "Dinamik de�i�kenin tutttu�u de�er d�nd�r�lecek de�er : " + bulunan__  );
		
	
	
	}
	
	
	
}

	
	
	
		return bulunan__  ;
		
		
		
		
	}
	
	
	public Object visitArray_deger(DilParser.Array_degerContext ctx) { return visit(ctx.array_listesi()); }
	
	
	
	 public Object visitIlk_degerli(DilParser.Ilk_degerliContext ctx) {
		 
		 �zellikler atanm��_de�er = ( �zellikler ) visit ( ctx.ifadeler() ) ;
			�zellikler yeni = new �zellikler ( ) ;
			String de�i�ken_ismi = ctx.degisken_ismi().getText();
			de�i�ken_t�r� = this.de�i�ken_t�r�_stack.peek();
			boolean atand� = false ;
					//yeni olu�acak de�i�ken sta��n en tepesindeki kayda olu�turulacak...
					FunctionTable son_kay�t = this.fonksiyon_stack.peek() ;
					
					HashMap ekleme_yapilacak_mem = son_kay�t.lokal_de�i�ken_memory ;
					
					if ( this.ekleme_yap�lcak_structure_ismi.size() == 0 )
					if ( ekleme_yapilacak_mem.containsKey( de�i�ken_ismi ) )
					{
					System.out.println ( "Daha �nce " + de�i�ken_ismi + " tan�mlanm�� bir de�i�ken var..." ) ;
					�zellikler yen = new �zellikler ( )  ;
					yen.t�r = "HATA" ;
					yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
					
					return yen ;
						
						
					}
					
					if ( de�i�ken_t�r�.equals( "Tamsay�" ) )
					{
						yeni.t�r = TAMSAYI ;
						yeni.de�er = 0 ;
					}
					else if ( de�i�ken_t�r�.equals( "Noktal�Say�"))
					{
						yeni.t�r = NOKTALISAYI ;
						yeni.de�er = 0.0 ;
					}
					else if ( de�i�ken_t�r�.equals ( "Bool" ) ) 
					{
						yeni.t�r = "BOOL" ;
						yeni.de�er = false ;
					}
					else if ( de�i�ken_t�r�.equals( "Karakter"  ) )
					{
						yeni.t�r = STRING ;
						yeni.de�er = "" ;
					}
					else if ( de�i�ken_t�r�.equals(  "Array" ) )
						
					{
						yeni.t�r = ARRAY ;
						//Burada yeni bir array list olu�turmaya gerek yok ��nk� assignment yap�ld���nda zaten bir array list gelecek...
						yeni.de�er = null ;
						
					}
					else if ( de�i�ken_t�r�.equals( "Dinamik"))
					{
						yeni.t�r = D�NAM�K ;
						yeni.de�er = new �zellikler ( ) ;
					}
					else if ( this.s�n�f_tan�mlar�.containsKey( de�i�ken_t�r� )  )
					{
					yeni.t�r = "SINIF-" + de�i�ken_t�r� ;
					yeni.de�er  = null ;				
						
						
					}
					else if ( this.structure_tan�mlar�.containsKey( de�i�ken_t�r� ) )
					{
						DilParser.Degisken_grubu_tanimiContext yap� = this.structure_tan�mlar�.get( de�i�ken_t�r� ) ;
						//iki global verimiz olacak biri structure de�ikeninin ismi 
						//Stack�n i�inde eleman olmas� de�i�kenlerin bir structureleman oldu�unu g�steriyor...
					this.de�i�ken_t�r�_stack.push( de�i�ken_t�r� ) ;
						HashMap <String , �zellikler > memorisi = new HashMap <String , �zellikler> ( ) ;
						
						this.ekleme_yap�lcak_structure_ismi.push ( memorisi ) ;
						
						for ( int a  = 0 ; a < yap�.grup_degiskeni().size() ; a ++ )
						{
							
							visit ( yap�.grup_degiskeni(a ) ) ;
							
							
							
						}
						
						
						this.ekleme_yap�lcak_structure_ismi.pop ( );
						//�u anki de�i�kenin ..
						//En son bu de�i�ken eklenecek....
						
						yeni.t�r = "STRUCTURE" + this.de�i�ken_t�r�_stack.pop( ) ;
						yeni.de�er = memorisi ;
						//Ayn� isim eleman var m� yada de�i�kenin t�r�n� al�rken kullanaca��z...
						
						//Kullan�c� Tamsay� a,b �eklinde iki de�i�ken yaratm�� olabilir bunlara dikkat et..
						
						if ( atanm��_de�er.t�r == ARRAY )
						{
							
							
							//Atama i�lemleri s�ra ile yap�lacak structure elemanlar�n�n
							//Dinamik ver Referans t�rlerine dikkat edilecek...
							int sa�_taraf_index  = 0 ;
							for ( int a  = 0 ; a < yap�.grup_degiskeni().size() ; a ++ )
							{
								DilParser.Grup_degiskeniContext tanimlar = yap�.grup_degiskeni( a ) ;
							//	System.out.println ( tanimlar.getChild( 0 ).getChild( 0 ).getText() ) ;
								int h__ = 1 ;
								for ( int h = 0 ; h < tanimlar.getChild(0).getChildCount() /2 ; h +=1   )
								{
									String de�i�ken_t�r� = tanimlar.getChild( 0 ).getChild(0).getText ( );
									String de�i�ken_i = tanimlar.getChild ( 0 ).getChild( h__ ).getText () ;
									//System.out.println ( "de�i�ken_i : " + de�i�ken_i ) ;
									�zellikler sa�_ = 
											(  (HashMap<String , �zellikler> ) ( atanm��_de�er.de�er ) ).get("" + sa�_taraf_index ++); 
									
									//Referans ve Dinamikler burada atanacak...
									de�i�ken_t�r� = de�i�ken_t�r�.toUpperCase();
									if ( de�i�ken_t�r�.equals ( "KARAKTER" ) ) de�i�ken_t�r� = "STRING" ;
									if ( de�i�ken_t�r�.equals( sa�_.t�r ) == false   )
									{
										System.out.println ( "De�i�ken Grubu eleman� " + de�i�ken_i + " " + de�i�ken_t�r� + " ona atanan de�er " + sa�_.t�r );
										�zellikler yen = new �zellikler ( )  ;
										yen.t�r = "HATA" ;
										yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
										
										return yen ;
										
										
									}
									//Burada shallow copy problemi var d�zelt...
									else 
									{
										
										�zellikler haf�zadaki = memorisi.get( de�i�ken_i);
										haf�zadaki.de�er = sa�_.de�er ;
										//System.out.println( "Haf�zadaki : " + haf�zadaki + " : sa� taraf� : " + sa�_.de�er ) ;
										
										
										
									}
									
									h__ += 2 ;
								}
								
								
							}
							
							
							
							
							
							atand� = true ;
							
							
						}
						else if ( atanm��_de�er.t�r.contains( "STRUCTURE" ) )
						{
							 //Bir structure eleman� ba�ka bir structure eleman� ile olu�turulabilir...
							//Elemanlar� kar��l�kl� olarak atanacak:....""
							
							
							
						}
						
						
						
						
						
					}
				//ba�ka yere eleman ekleme dikkat et structurea eleman ekleme	
				if ( yeni.t�r.contains( "STRUCTURE" ) )
				{
					ekleme_yapilacak_mem.put( de�i�ken_ismi , yeni ) ; 
					return new �zellikler ( ) ;
					
					
				}
				else
						
						if (   yeni.t�r.equals( "D�NAM�K" ) )
					{
						
						yeni.de�er = atanm��_de�er ;
					
						ekleme_yapilacak_mem.put( de�i�ken_ismi , yeni ) ; 
						return new �zellikler () ; 
						
						
					}else
					if ( atanm��_de�er.t�r.equals( yeni.t�r ) )
					{
						
						
						
					}
					
					else
					{
						System.out.println ( de�i�ken_ismi + " de�i�keni "+ de�i�ken_t�r� + " olarak tan�mlanm�� ancak atanan de�erin t�r� : " + atanm��_de�er.t�r ) ;
						�zellikler yen = new �zellikler ( )  ;
						yen.t�r = "HATA" ;
						yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
						
						return yen ;
						
					}
					
				//	yeni.t�r = atanm��_de�er.t�r ;
					//System.out.println ("Atanm�� de�er : " + atanm��_de�er.de�er ) ;
					
					yeni.de�er = atanm��_de�er.de�er ;
					
					if ( !this.s�n�f_eri�im_stack.empty() )
					{
						yeni.eri�im_bi�imi = this.s�n�f_eri�im_stack.peek() ;
					}
					
					if ( this.ekleme_yap�lcak_structure_ismi.size() != 0 )
					{
						ekleme_yapilacak_mem = this.ekleme_yap�lcak_structure_ismi.peek() ;
						ekleme_yapilacak_mem.put(  de�i�ken_ismi , yeni ) ; 
					}
					else
					ekleme_yapilacak_mem.put( de�i�ken_ismi , yeni ) ; 
					return  yeni  ;
					
					
					

	 }
		
	 public Object visitDegisken_grub(DilParser.Degisken_grubContext ctx) { 
		 
		�zellikler de�i�ken = ( �zellikler ) visit ( ctx.degisken_grubu_elemani() ) ;
		this.structure_current_mem.push(  de�i�ken ) ;
		if ( de�i�ken.t�r.substring(  0 ,9 ).equals( "STRUCTURE" ) )
		{
			
			
				�zellikler kl = ( �zellikler )  visit( ctx.structure_eleman() ) ;
				this.structure_current_mem.pop ( ) ;
				return kl ; 
			
			
		}
		else if ( de�i�ken.t�r.contains( "SINIF-" ) )
		{
			�zellikler kl = ( �zellikler ) visit ( ctx.structure_eleman() ) ;
			//System.out.println ( "De�i�kenin eri�im bi�imi : " + kl.eri�im_bi�imi ) ;
			if ( kl.eri�im_bi�imi .equals ("�zel") ) 
			{
				System.out.println ( ctx.structure_eleman().getText () + " �zel bir eleman, d��ar�dan eri�ilemez..." ) ; 
				�zellikler yeni = new �zellikler ( )  ;
				yeni.t�r = "HATA" ;
				yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
				
			}
			
			this.structure_current_mem.pop ( ) ;
			return kl ;
			
			
		}
		else
		{
			System.out.println ( ctx.degisken_grubu_elemani().getText() + " ifadesi bir de�i�ken grubuna denk gelmiyor..." ) ; 
			
			�zellikler yen = new �zellikler ( )  ;
			yen.t�r = "HATA" ;
			yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yen ;

		}
		
		
		//Buraya asla gelemeyecek....
		// return new �zellikler ( ) ;
	 
	 }
		
	 
	 
	 
	
	 public Object visitDegisken_grubu_elemani_elemani(DilParser.Degisken_grubu_elemani_elemaniContext ctx) {
		 String temp = this.referans_de�i�keni_durumu ;
		 this.referans_de�i�keni_durumu = REFER_ETT��� ;
		�zellikler de�i�ken = ( �zellikler ) visit ( ctx.structure_eleman( 0 ) ) ;
		this.referans_de�i�keni_durumu = temp ;
		this.structure_current_mem.push( de�i�ken ) ;
	//	System.out.println ( "d�ei�ken t�r : " + de�i�ken.t�r ) ;
		
		//Buras� problemli buras� d�zeltilecek....
		if ( de�i�ken.t�r.contains("STRUCTURE" ) )
		{
			
				
				
				�zellikler k = (�zellikler) visit ( ctx.structure_eleman( 1 ) ) ;
				this.structure_current_mem.pop ( );
				return k ;
				
			
			
			
		}
		else if ( de�i�ken.t�r.contains ( "SINIF-" ) )
		{
			�zellikler k = (�zellikler) visit ( ctx.structure_eleman( 1 ) ) ;
			//System.out.println ( "De�i�kenin eri�im bi�imi : " + k.eri�im_bi�imi ) ;
			
			if ( k.eri�im_bi�imi .equals ("�zel") ) 
			{
				System.out.println ( ctx.structure_eleman(1).getText () + " �zel bir eleman, d��ar�dan eri�ilemez..." ) ; 
				�zellikler yeni = new �zellikler ( )  ;
				yeni.t�r = "HATA" ;
				yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yeni ;
				
			}
			
			this.structure_current_mem.pop ( );
			return k ;
			
		}
		else
		{
			System.out.println ( ctx.structure_eleman(0).getText ( ) + " bir de�i�ken grubu de�il" ) ;
			�zellikler yeni = new �zellikler ( )  ;
			yeni.t�r = "HATA" ;
			yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
			
		}
		 
		 //Asla buraya gelemeyecek ama derleyicinin hatas� i�in...
		// return new �zellikler ( ) ;
		 
	 }
		
	 
	 
	 
	 public Object visitDegisken_grubu_eleman(DilParser.Degisken_grubu_elemanContext ctx) { 
		 return visit(ctx.degisken_grubu_elemani()); 
		 
	 }
		
	 
	 
	 
	 
	
	
	public Object visitSadece_isim(DilParser.Sadece_isimContext ctx) { 
		
		
		�zellikler yeni = new �zellikler ( ) ;
String de�i�ken_ismi = ctx.degisken_ismi().getText();
de�i�ken_t�r� = this.de�i�ken_t�r�_stack.peek();
		//yeni olu�acak de�i�ken sta��n en tepesindeki kayda olu�turulacak...
		FunctionTable son_kay�t = this.fonksiyon_stack.peek() ;
		
		HashMap ekleme_yapilacak_mem = son_kay�t.lokal_de�i�ken_memory ;
		
		if ( this.ekleme_yap�lcak_structure_ismi.size() == 0 )
		if ( ekleme_yapilacak_mem.containsKey( de�i�ken_ismi ) )
		{
		System.out.println ( "Daha �nce " + de�i�ken_ismi + " tan�mlanm�� bir de�i�ken var..." ) ;
		�zellikler yen = new �zellikler ( )  ;
		yen.t�r = "HATA" ;
		yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
		
		return yen ; 
			
			
		}
		
		if ( de�i�ken_t�r�.equals( "Tamsay�" ) )
		{
		
			yeni.t�r = TAMSAYI ;
			yeni.de�er = 0 ;
	
		
		}
		else if ( de�i�ken_t�r�.equalsIgnoreCase( "Bool" ))
		{
			yeni.de�er = "BOOL" ;
		yeni.de�er = false ;	
		
		}
		else if ( de�i�ken_t�r�.equals( "Noktal�Say�"))
		{
		
			yeni.t�r = NOKTALISAYI ;
			yeni.de�er = 0.0 ;
	
		}
		else if ( de�i�ken_t�r�.equals( "Karakter"  ) )
		{
			yeni.t�r = STRING ;
			yeni.de�er = "" ;
		}
		else if ( de�i�ken_t�r�.equals ( "Array" ) )
		{
			yeni.t�r = ARRAY ;
			yeni.de�er = new HashMap<String , �zellikler> ( );
		
		}
		else if ( de�i�ken_t�r�.equals("Dinamik") )
		{
			yeni.t�r = "D�NAM�K" ;
			yeni.de�er = new �zellikler () ; 
		}
		else  //structure tan�m� ise  
		{
			//�nce tan�ml� diye bak�yoruz...
			
			
			if ( this.s�n�f_tan�mlar�.containsKey( de�i�ken_t�r� ) && this.structure_tan�mlar�.containsKey ( de�i�ken_t�r� ) )
			{
				System.out.println(  de�i�ken_t�r� + " hem S�n�f hem de de�i�ken t�r� olarak tan�mlanm��...."   );
				�zellikler yen = new �zellikler ( )  ;
				yen.t�r = "HATA" ;
				yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yen ;
			}
		else if ( this.s�n�f_tan�mlar�.containsKey ( de�i�ken_t�r� ) )
			{
				
			yeni.t�r = "SINIF-" + de�i�ken_t�r� ;
			yeni.de�er = null ;
			
			
			
			
			}
			else			
			if ( this .structure_tan�mlar�.containsKey( de�i�ken_t�r� ) )
			{
				
				DilParser.Degisken_grubu_tanimiContext yap� = this.structure_tan�mlar�.get( de�i�ken_t�r� ) ;
				//iki global verimiz olacak biri structure de�ikeninin ismi 
				//Stack�n i�inde eleman olmas� de�i�kenlerin bir structureleman oldu�unu g�steriyor...
			this.de�i�ken_t�r�_stack.push( de�i�ken_t�r� ) ;
				HashMap <String , �zellikler > memorisi = new HashMap <String , �zellikler> ( ) ;
				
				this.ekleme_yap�lcak_structure_ismi.push ( memorisi ) ;
				
				for ( int a  = 0 ; a < yap�.grup_degiskeni().size() ; a ++ )
				{
					
					visit ( yap�.grup_degiskeni(a ) ) ;
					
					
					
				}
				
				
				this.ekleme_yap�lcak_structure_ismi.pop ( );
				//�u anki de�i�kenin ..
				//En son bu de�i�ken eklenecek....
				
				yeni.t�r = "STRUCTURE" + this.de�i�ken_t�r�_stack.pop( ) ;
				yeni.de�er = memorisi ;
				//Ayn� isim eleman var m� yada de�i�kenin t�r�n� al�rken kullanaca��z...
				
			}
			else
			{
				
				System.out.println( de�i�ken_t�r� + " ismi ile bir de�i�ken grubu tan�mlanmam��...." );
				�zellikler yen = new �zellikler ( )  ;
				yen.t�r = "HATA" ;
				yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yen ;
				
			}
			
			
			
		}
		
		if ( !this.s�n�f_eri�im_stack.empty() )
		{
			yeni.eri�im_bi�imi = this.s�n�f_eri�im_stack.peek() ;
		}
		
		
		
		if ( this.ekleme_yap�lcak_structure_ismi.size() != 0 )
		{
			ekleme_yapilacak_mem = this.ekleme_yap�lcak_structure_ismi.peek() ;
			ekleme_yapilacak_mem.put(  de�i�ken_ismi , yeni ) ; 
		}
		else
		ekleme_yapilacak_mem.put( de�i�ken_ismi , yeni ) ; 
		return yeni ;
		
		
		
		
		
		
	
	}

	
	
	private String de�i�ken_t�r� ;
	Stack<String> de�i�ken_t�r�_stack = new Stack <String >() ;
	public Object visitDegisken_tanimla(DilParser.Degisken_tanimlaContext ctx) {
		
		//System.out.println ( "De�i�ken tan�mla..." ) ;
		
		de�i�ken_t�r�  = ctx.degisken_turu().getText() ;
		//System.out.println ( "T�R : " + de�i�ken_t�r� ) ;
		de�i�ken_t�r�_stack.push( de�i�ken_t�r� ) ;
		for ( int a = 0 ; a < ctx.degisken_durum().size() ; a++ )
			visit ( ctx.degisken_durum( a ) ) ;
		
		
		
		this.de�i�ken_t�r�_stack.pop() ;
		return new �zellikler ( ) ;
	}
	

	
	//G�ster komutu kendinden sonra yaz�lm�� ifadeleri yada ifadeyi ekrana yazd�r�r...
	
	public Object visitGoster_command(DilParser.Goster_commandContext ctx) {
	
		//G�ster komutundan sonra birden fazla ifade olabilir her birini soldan sa�a gezerek ekrana yazd�r�yoruz...
		for ( int a = 0 ; a < ctx.ifadeler().size() ; a++ )
		{
			�zellikler ifade_ = ( �zellikler ) visit ( ctx.ifadeler( a )  ); 
		
			
			
		   
			System.out.println ( ifade_.de�er ) ;
			//JOptionPane.showMessageDialog ( null , "Ekrana yaz�lacak.." );		
		if(this.pencere != null)
			this.pencere.ekrana_yaz( "" + ifade_.de�er  );
		}
		
		//Bu fonksiyonun bir �ey d�nd�rmesine gerek yok...
		return null ;
		
		
	
	}
	
	//Bu iki ifadeyi �arpacak yada b�lecek ( tabiki stringler dahil de�il ) ve sonucu gene tamsay� yada noktal� say� olarak geri
	//D�nd�recek...
	public Object visitCarpma_bolme(DilParser.Carpma_bolmeContext ctx) { 
		
		�zellikler ilk_ifade = ( �zellikler )visit ( ctx.ifadeler( 0 ) ) ; //Soldaki ifadeyi elde ediyoruz �nce..
		�zellikler ikinci_ifade = ( �zellikler ) visit ( ctx.ifadeler ( 1 ) ) ; //Sa�daki ifadeyide elde ediyoruz...
		//E�er ifadelerden herhangi biri stringse hata ver ��nk� �arpma ve b�lme stringler i�in tan�ml� de�il...
		if  ( ilk_ifade.t�r.equals( STRING ) || ikinci_ifade.t�r.equals( STRING ) ) 
		{
			if ( ctx.opt.getText().equals( "*" ) )
			System.out.println ( "Stringlerle �arma i�lemi yap�lamaz...."  );
			else System.out.println ( "Stringlerle b�lme i�lemi yap�lamaz..." ) ;
			�zellikler yeni = new �zellikler ( )  ;
			yeni.t�r = "HATA" ;
			yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
		}
		
		// double * integer = double ( hata vermeyece�iz... )
		//double + integer = double ( hata vermeyece�iz... )
		//integer / double or double / integer = double
		//integer / integer = integer....
	
		//Sonucun at�laca�� de�i�ken
		�zellikler yeni = new �zellikler ( ) ;
		
		//E�er herhangi bir taraf noktal� say� ise sonu�ta noktal� say� olacak...
		if ( ilk_ifade.t�r.equals( NOKTALISAYI )  || ikinci_ifade.equals(NOKTALISAYI) ) 
		{
			
			double ilk_say� =  ilk_ifade.t�r.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf( ilk_ifade.de�er ) ) : (Double)ilk_ifade.de�er ;
			double ikinci_say� = ikinci_ifade.t�r.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf( ikinci_ifade.de�er ) ) : (Double)ikinci_ifade.de�er ;
			yeni.t�r = NOKTALISAYI ;
			
			if ( ctx.opt.getText().equals("*" ) )
				yeni.de�er = ilk_say� * ikinci_say� ;
			else yeni.de�er = ilk_say� / ikinci_say� ;
				
			
			
		}
		else
		{
			yeni.t�r = TAMSAYI ;
			int ilk_say� = ( int ) ilk_ifade.de�er ;
			int ikinci_say� = ( int ) ikinci_ifade.de�er ;
			
		if ( ctx.opt.getText().equals("*" ) )
			yeni.de�er = ilk_say� * ikinci_say� ;
		else yeni.de�er= ilk_say� / ikinci_say� ;
			
			
		}
		
		
		
		return yeni ;
		
		
	
	}
	
	
	public Object visitToplama_cikarma(DilParser.Toplama_cikarmaContext ctx) {
		
		�zellikler ilk_ifade  = ( �zellikler ) visit ( ctx.ifadeler(  0 ) ) ; //soldaki ifadenin de�erinin al�yoruz...
		�zellikler ikinci_ifade = ( �zellikler ) visit ( ctx.ifadeler( 1 ) ) ; //Sa�daki ifadeninin de�erinin al�yoruz...
		//E�er her hangi biri STRING ise + i�lemi ge�erli - i�lemi ge�ersiz...
		
		//System.out.println ( "ilk ifade t�r : " + ilk_ifade.t�r + " de�er : " + ilk_ifade.de�er + " ikinci ifade t�r : " + ikinci_ifade.t�r + 
	//	"ikinci ifade de�er :" + ikinci_ifade.de�er) ;
		
		�zellikler yeni = new �zellikler ( ) ;
		
		
		if ( ilk_ifade.t�r.equals( STRING ) || ikinci_ifade.t�r.equals( STRING ) )
		{  //- i�lemiyse bu stringler i�in tan�ml� de�il...
			
			//System.out.println ( "Biri string..."  ) ;
			
			if ( ctx.opt.getText().equals("-" ) )
			{
				System.out.println ( "Stringlerle - i�lemi tan�ml� de�ildir..." ) ;
				�zellikler yen = new �zellikler ( )  ;
				yen.t�r = "HATA" ;
				yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
				
				return yen ;
			}
			else 
			{
				//E�er bir string varsa ve i�lem + ise string concatanate yap....
			yeni.t�r = STRING ;
			String g�sterilecek ="";
			if  ( ilk_ifade.t�r.equals ( "BOOL" ) )
			{
				if ( ( boolean ) ilk_ifade.de�er  == true )g�sterilecek +="DO�RU" ;
				else g�sterilecek += "YANLI�" ;
			}
			else 
				g�sterilecek += "" +ilk_ifade.de�er ;
			
			//System.out.println ( "�kinci_ifade : " + ikinci_ifade ) ;
			
			
			if  ( ikinci_ifade.t�r.equals ( "BOOL" ) )
			{
				if ( ( boolean ) ikinci_ifade.de�er  == true )g�sterilecek +="DO�RU" ;
				else g�sterilecek += "YANLI�" ;
			}
			else 
				g�sterilecek += "" +ikinci_ifade.de�er ;
			
			
			
			yeni.de�er = "" + g�sterilecek;
				
				
				
			}
			
			
		}
		
		else //E�er hi�biri string de�ilse
		{
			//double + integer = double
			//integer + integer = integer
			
			if ( ilk_ifade.t�r.equals( TAMSAYI) && ikinci_ifade.t�r.equals( TAMSAYI ) ) 
			{
				int ilk_say� = (int ) ilk_ifade.de�er ;
				int ikinci_say� = (int) ikinci_ifade.de�er ;
				
				yeni.t�r = TAMSAYI ;
				if ( ctx.opt.getText().equals( "+" ) )
					yeni.de�er = ilk_say� + ikinci_say�;
				else yeni.de�er = ilk_say� - ikinci_say� ;
				
			}
			else
			{
				double ilk_say� = ilk_ifade.t�r.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf(ilk_ifade.de�er ) ) : ( Double ) ilk_ifade.de�er ;
				double ikinci_say� = ikinci_ifade.t�r.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf(ikinci_ifade.de�er ) ) : ( Double ) ikinci_ifade.de�er ;
				yeni.t�r = NOKTALISAYI ;
				if ( ctx.opt.getText().equals( "+" ) )
					yeni.de�er = ilk_say� + ikinci_say� ;
				else
					yeni.de�er = ilk_say� - ikinci_say� ;
				
				
				
			}
			
			
			
			
			
		}
		
		
		
		
	return yeni  ;
	}
	
	
	
	
	
	
	//Bu ( expr ) �eklindeki ifadeleri gezmek i�in
	public Object visitParantezli_ifade(DilParser.Parantezli_ifadeContext ctx) { 
		
		 //Sadece ifadeler kural� ziyaret edilecek t�m childler de�il...
		return visit( ctx.ifadeler() ) ; 
		}
	
	//Bu fonksiyon noktal� say�lar ya da tamsay�lar i�in karek�k bulacak
	//Sonu� double t�r�nden olacak
	public Object visitKarekok_islemi(DilParser.Karekok_islemiContext ctx) { 
		
		�zellikler de�er = ( �zellikler ) visit ( ctx.ifadeler() ) ;
		if ( de�er.t�r == STRING )
		{
			System.out.println ( "Stringler sqrt i�lemiyle kullan�lamaz..." );
			�zellikler yeni = new �zellikler ( )  ;
			yeni.t�r = "HATA" ;
			yeni.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yeni ;
		}
		
		�zellikler yeni = new �zellikler ( ) ;
		yeni.t�r = NOKTALISAYI ;
		
		yeni.de�er = Math.sqrt( Double.parseDouble (String.valueOf(de�er.de�er )  ) ) ;

	return yeni ;
	}

	//Fonksin �s alma i�lemini ger�e�le�tirecek...
	//int ^ int = int her hangi biri double olur sa sonu� da double
	public Object visitUslu_ifade(DilParser.Uslu_ifadeContext ctx) {
		
		�zellikler ilk_ifade = ( �zellikler ) visit ( ctx.ifadeler( 0 ) ) ;
		�zellikler ikinci_ifade = ( �zellikler ) visit ( ctx.ifadeler ( 1 ) ) ;
		
		�zellikler yeni = new �zellikler ( ) ;
		
		if ( ilk_ifade.t�r.equals( STRING ) || ikinci_ifade.t�r.equals( STRING  ) ) 
		{
			System.out.println ( "Stringler �s alma i�leciyle kullan�lamazlar..." );
			�zellikler yen = new �zellikler ( )  ;
			yen.t�r = "HATA" ;
			yen.de�er = new �zellikler ( "KAPATMA" , null) ; 
			
			return yen ;
			
			
		}
		
		else if ( ilk_ifade.t�r.equals( NOKTALISAYI ) || ikinci_ifade.t�r.equals( NOKTALISAYI ) ) 
		{
			
			
			double ilk_say� =  ilk_ifade.t�r.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf( ilk_ifade.de�er ) ) : (Double)ilk_ifade.de�er  ;
			double ikinci_say� = ikinci_ifade.t�r.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf ( ikinci_ifade.de�er ) ) : ( Double ) ikinci_ifade.de�er ;
			
			
			yeni.t�r = NOKTALISAYI ;
			yeni.de�er = Math.pow( ilk_say� , ikinci_say�  ) ;
			
	
			
		}
		else
		{
			Double ilk_say� =  ilk_ifade.t�r.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf( ilk_ifade.de�er ) ) : (Double)ilk_ifade.de�er  ;
			Double ikinci_say� = ikinci_ifade.t�r.equals( TAMSAYI ) ? Double.parseDouble( String.valueOf ( ikinci_ifade.de�er ) ) : ( Double ) ikinci_ifade.de�er ;
			
			Double res = ( Math.pow( ilk_say� , ikinci_say�  ) );
			yeni.t�r = TAMSAYI ;
			yeni.de�er =  res.intValue()  ;
			 
	
			
		}
		
		
		return yeni ;
		
	}
	
	
	
	
	//Bu fonksiyonda string t�r�nde value su kullan�c�n�n yazd��� text olan bir yap� geri d�nd�recek...
	public Object visitString_deger(DilParser.String_degerContext ctx) {
		
		�zellikler yeni = new �zellikler ( ) ;
		//Bu bir string de�eri
		yeni.t�r = STRING ;
		yeni.de�er = "" ;
		//" i�aretlerini ba�tan sondan siliniyor...
		String temp = ctx.getText().substring( 1 , ctx.getText().length() -1 );
		for ( int a = 0 ; a < temp.length() ; a++  )
		{
			if ( temp.charAt( a ) == '\\' )
			{
				if ( a < temp.length() )
					if ( temp.charAt( a+1 ) == 'n' )
					{	yeni.de�er += "\n" ;  a++ ;  continue ; }
				
			}
			
			yeni.de�er +=""+ temp.charAt( a ) ;
			
			
			
			
		}
		
		return yeni ;
	}
	
	//Bu fonksiyon geri TAMSAYI yada NOKTALI SAYI t�r�nde bir de�er geri d�nd�recek
	//Tam say� ve noktal� say� ayr�m�n� . karekterininin varl���ndan ay�rt edece�iz...
	public Object visitSabit_rakam_deger(DilParser.Sabit_rakam_degerContext ctx) { 
		String de�er = ctx.getText() ;
		�zellikler yeni = new �zellikler ( )  ;
		if ( de�er.contains( "." ) ) 
		{
			yeni.t�r = NOKTALISAYI ;
			yeni.de�er = Double.parseDouble( de�er ) ;
		}
			else 
		{
			
				yeni.t�r = TAMSAYI ;
				yeni.de�er = Integer.parseInt(  de�er ) ;
		}
		
		
		return yeni ;
		 
		
	}
	
	
	
}
