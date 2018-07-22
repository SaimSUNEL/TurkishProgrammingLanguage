import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Ana {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		

		String file_path = "program2.txt" ;
		//DilLexer lexer = new DilLexer( new ANTLRFileStream( file_path , "UTF-8") ) ;
			DilLexer lexer = new DilLexer( new ANTLRFileStream( file_path , "UTF-8") ) ;
			CommonTokenStream token_stream = new CommonTokenStream( lexer ) ;
			DilParser parser = new DilParser( token_stream ) ;
			ParseTree tree = parser.program();
			//Console windows = new Console(  );
			
			
			
			
			/*
	           
	            	TurkishPLOutput pencere =   new TurkishPLOutput( );
	            	 pencere.setVisible(true) ;
	          
	       
	          
	           pencere.addWindowListener( new WindowListener() {
			
				@Override
				public void windowOpened(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowIconified(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeiconified(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowClosing(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowClosed(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowActivated(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			});
	           
	          */ 
	           
	       //   System.out.println ( "Walking has started.." ) ;
	         
	          
	           TreeWalker walker = new TreeWalker ( null );
				
	    //       JOptionPane.showMessageDialog( null , "walker tamam" );
	           walker.visit( tree ) ;
			//System.out.println ( "Walking has finished..." ) ;
			//windows.setVisible( true );
		//System.out.println ( "Program bitti" ) ;
		//JOptionPane.showMessageDialog( null , "Walk started"  ) ;
			//ParseTreeWalker walker = new ParseTreeWalker() ;
			//System.out.println( "Walker " ) ;
		//walker.walk( new TreeWalker () , tree ) ;
	System.exit( 0 ); ;
	
	}

}
