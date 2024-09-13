package Demo;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Demo1 implements ActionListener {
	JFrame frame;
	
	JPanel p1;
	JPanel p2;
	JPanel p3;
	
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	
	JTextField t1;
	JTextField t2;
	JTextField t3;
	
	JButton b;
	JButton r;
	
	
	public demo1() {
		
		frame = new JFrame("Color chooser");
		frame.setSize(600,400);
		frame.setLocation(200,150);
		
		p1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 40));
		l1 = new JLabel("this is a demo txt");
		
		p1.add(l1);
		
		p2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
		
		l2 = new JLabel("R");
		l2 = new JLabel("R");
		l2 = new JLabel("R");
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		
		p2.add(l2);
		p2.add(t1);
		
		p2.add(l4);
		p2.add(t3);
		
		
		p3 = new JPanel(new FloeLayout,)
	}
	
	
	
}
