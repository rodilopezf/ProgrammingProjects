import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Form implements ActionListener {

private JFrame mainFrame;
private JTextField t1, t2, t3, t4, t5, t6;
private JLabel l1, l2, l3, l4, l5, l6;

public Form(){
	mainFrame = new JFrame();
	mainFrame.setLayout(new GridLayout(6,2));
	mainFrame.setSize(900,300);
	
	t1 = new JTextField("Name");
	l1 = new JLabel("Name");
	mainFrame.add(l1);
	mainFrame.add(t1);
	
	t2 = new JTextField("Address");
	l2 = new JLabel("Address");
	mainFrame.add(l2);
	mainFrame.add(t2);
	
	t3 = new JTextField("City");
	l3 = new JLabel("City");
	mainFrame.add(l3);
	mainFrame.add(t3);
	
	t4 = new JTextField("State");
	l4 = new JLabel("State");
	mainFrame.add(l4);
	mainFrame.add(t4);
	
	t5 = new JTextField("Enter Zip");
	l5 = new JLabel("Zip");
	mainFrame.add(l5);
	mainFrame.add(t5);
	
	t6 = new JTextField("Phone");
	l6 = new JLabel("Phone number");
	mainFrame.add(l6);
	mainFrame.add(t6);
	
	mainFrame.pack();
	mainFrame.setVisible(true);
	mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
}
public static void main(String args[]){
	new Form();
}

@Override
	public void actionPerformed(ActionEvent e) {
		String ac =  e.getActionCommand();
	}


}

