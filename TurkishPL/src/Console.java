import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.Label;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JTextPane;

import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.util.concurrent.Semaphore;


public class Console extends JFrame {

	private JPanel contentPane;
	
	public boolean wait_key = false ;
	@Override
	
	protected void processWindowEvent(WindowEvent arg0) {
		// TODO Auto-generated method stub
		super.processWindowEvent(arg0);

	}
	
	Semaphore a = new Semaphore( 1 ) ;
	Semaphore b = new Semaphore( 2 );
	
	
	/**
	 * Launch the application.
	 */
	
	
	
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Console frame = new Console();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	public TextArea textArea ;
	public TreeWalker walk ;
	public Console(  ) {
		
		
		
	try {
		a.acquire(  );
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textArea = new TextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
		
	textArea.addKeyListener( new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			if( arg0.getKeyChar() == '\n' ) 
			{
				a.release(  );
				System.out.println( "Releases"  ) ;
			}
		}
		
		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyPressed(KeyEvent arg0) {
	if( wait_key == true ) b.release ( ) ;	
			
			
			// TODO Auto-generated method stub
			
		}
	});
	
	
	
	}

	private String gösterilecek_string = "" ;
	public void ekrana_yaz ( String data ) 
	{
		if( b.tryAcquire() == true )
			try {
				wait_key = false  ;
				b.acquire();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		
		
		
		
		
		if( a.tryAcquire() == true )
		
		
			try {
				a.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	if( data.equals( "\n" ) )
		//textArea.setForeground( Color.green);
	;
		else textArea.setForeground( Color.black);	textArea.append( data );
	
	}
	
public void yenile()
{
	
	textArea.getParent().revalidate();
}
	
	
	
private boolean yazý = true ;
	private int y = 5 ;
	private int x = 5 ;
	
	
	
}
