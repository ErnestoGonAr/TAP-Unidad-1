import javax.swing.*;
import java.awt.*;


public class Ventana extends JFrame{

	JLabel userName = new JLabel("Username");
	JLabel password = new JLabel("Password");
	JLabel comments = new JLabel("Comments");
	JTextField user = new JTextField(10);
	JPasswordField pass = new JPasswordField(10);
	JTextArea commentsA = new JTextArea(5,10);
	JButton ok = new JButton("OK");
	JButton cancel = new JButton("CANCEL");
	JPanel pane1,pane2,pane3,pane4;
	
	public Ventana(){

		super("Account Information");
		setSize(300,200);
	
		pane1 = new JPanel();
		pane1.setLayout(new FlowLayout());
		pane1.add(userName);
		pane1.add(user);
		
		pane2 = new JPanel();
		pane2.setLayout(new FlowLayout());
		pane2.add(password);
		pane2.add(pass);

		pane3 = new JPanel();
		pane3.setLayout(new FlowLayout());
		pane3.add(comments);
		pane3.add(commentsA);
		
		pane4 = new JPanel();
		pane4.setLayout(new FlowLayout());
		pane4.add(ok);
		pane4.add(cancel);

		setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
		add(pane1);
		add(pane2);
		add(pane3);
		add(pane4);
		
		setVisible(true);
		setResizable(false);			
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String ar[]){

		new Ventana();

	}

}
