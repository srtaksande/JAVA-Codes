package colourchooser;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

	public class Calculator implements ActionListener {

		   JFrame f = new JFrame();
		
		   JLabel l1 = new JLabel("Num1");
		   JLabel l2 = new JLabel("Num2");
		   JLabel l3 = new JLabel("Result");
			
			
		  
		   JTextField t1=new JTextField(10);
			JTextField t2=new JTextField(10);
			JTextField t3=new JTextField(10);
		
			JButton b1 = new JButton ("+");
			JButton b2 = new JButton("-");
			JButton b3 = new JButton("/");
			JButton b4 = new JButton("*");
			
				
	
	public  Calculator() {
		
		l1.setBounds(50,100,100,20);
		l2.setBounds(50,140,100,20);
		l3.setBounds(50,180,100,20);
	
	t1.setBounds(200,100,100,20);
	t2.setBounds(200,140,100,20);
	t3.setBounds(200,180,100,20);
	

	b1.setBounds(50,250,50,20);
	b2.setBounds(110,250,50,20);
	b3.setBounds(170,250,50,20);
	b4.setBounds(230,250,50,20);

	 f.add(l1);
	 f.add(l2);
	 f.add(l3);
			
	f.add(t1);
	f.add(t2);
	f.add(t3);
		
    f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
    f.setLayout(null);
    f.setVisible(true);
    f.setSize(400,350);	
	
	}
	
   public void actionPerformed(ActionEvent e)
   {
	 
	  int n1=Integer.parseInt(t1.getText());
	  int n2=Integer.parseInt(t2.getText());
	  Float Res=(float) Integer.parseInt(t2.getText());
	  if(e.getSource()==b1)
	  {
		   t3.setText(String.valueOf(Res=(float) (n1+n2)));
	  }
	  if(e.getSource()==b2)
	  {
		   t3.setText(String.valueOf(Res=(float) (n1-n2)));
	  }
	  if(e.getSource()==b3)
	  {
		   t3.setText(String.valueOf(Res=(float) (n1/n2)));
		
	  }
	  if(e.getSource()==b4)
	  {
		   t3.setText(String.valueOf(Res=(float) (n1*n2)));
		 
	  }
          
   }
  
	}   
    	
   	
