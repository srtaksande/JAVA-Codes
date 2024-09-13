package colourchooser;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

	public class SelectColour implements ActionListener {

		   JFrame frame;
		
			JPanel p1;
			JPanel p2;
			JPanel p3;
			
			
			
			JTextField t1;
			JTextField t2;
			JTextField t3;
		
			JButton b1;
			JButton b2;
			JButton b3;
			JButton b4;
			JLabel l1 = new JLabel("Num1");
			JLabel l2 = new JLabel("Num2");
			JLabel l3 = new JLabel("Result");
			
			
			
			
	
	public  SelectColour() {
		l1.setBounds(50,100,100,20);
		l2.setBounds(50,100,100,20);
		l3.setBounds(50,100,100,20);
		
		frame.setSize(600,300);
		frame.setLocation(200,150);
		
		p1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 40,40));
	
		 
		
		p2 = new JPanel(new FlowLayout(FlowLayout.CENTER,20,10));
		
		
		
	t1 = new JTextField(10);
	t2 = new JTextField(10);
	t3 = new JTextField(10);
	
	
	p2.add(l1);
	p2.add(t1);
	
	p2.add(l2);	
	p2.add(t2);	
	
	p2.add(l3);	
	p2.add(t3);	
	
	p3 = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 30));
	b1 = new JButton ("+");
	b2 = new JButton("-");
	b2 = new JButton("/");
	b2 = new JButton("*");
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
	
	p3.add(b1);
	p3.add(b2);
	p3.add(b3);
	p3.add(b4);
	
	p3.add(l1);
	p3.add(l2);
	p3.add(l3);
	
	
	
	
	frame.setLayout(new FlowLayout(FlowLayout.CENTER));
	frame.add(p1);
	frame.add(p2);
	frame.add(p3);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
	}
   public void actionPerformed(ActionEvent e)
   {
	 
	  int n1=Integer.parseInt(t1.getText());
	  int n2=Integer.parseInt(t2.getText());
	  if(e.getSource()==b1)
	  {
		   t3.setText(String.valueOf(n1+n2));
	  }
	  if(e.getSource()==b2)
	  {
		   t3.setText(String.valueOf(n1-n2));
	  }
	  if(e.getSource()==b3)
	  {
		   t3.setText(String.valueOf(n1/n2));
	  }
	  if(e.getSource()==b4)
	  {
		   t3.setText(String.valueOf(n1*n2));
	  }
      System.exit(0);
   }}
    	
   	
