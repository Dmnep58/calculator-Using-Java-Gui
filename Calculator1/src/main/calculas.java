package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class calculas  implements ActionListener {

	JFrame frame;
	JLabel l1, l2,l3;
	TextField t1;
	JButton mul,add,sub,div,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,equal,clear;
	double num,ans;
	int calculation;

	
	
	
	public calculas() {
		// TODO Auto-generated constructor stub
		
		mainframe();
		framelable();
		buttonfun();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new calculas();
	}

	private void mainframe() {
		
		// TODO Auto-generated method stub
		frame = new JFrame("Made by Devi Prasad");
		frame.setLayout(null);
		frame.setSize(300,470);
//		frame.setUndecorated(true);
		frame.setLocation(400, 40);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);		
		
	}
	
	private void framelable() {
		// TODO Auto-generated method stub
		l1 = new JLabel("Simple calculator GUI");
		l1.setBounds(20,50,300,30);
		l1.setFont(new Font("system",Font.HANGING_BASELINE,16));
		l1.setForeground(Color.RED);
		frame.add(l1);
		
     	t1 = new TextField();
		t1.setBounds(10,120,260,40);
		t1.setFont(new Font("system",Font.HANGING_BASELINE,25));
		t1.setForeground(Color.RED);	
		frame.add(t1);
		
		l2 = new JLabel();
		l2.setBounds(30,80,80,40);
		l2.setFont(new Font("system",Font.HANGING_BASELINE,15));
		l2.setForeground(Color.RED);
		frame.add(l2);
		
		
		l3 = new JLabel("CREATED BY DEVI PRASAD MISHRA");
		l3.setBounds(20,20,300,30);
		l3.setFont(new Font("system",Font.ROMAN_BASELINE,14));
		l3.setForeground(Color.RED);
		frame.add(l3);
	}

	private void buttonfun() {
		// TODO Auto-generated method stub

		b7 = new JButton("7");
		b7.setBounds(10,180,50,50);
		b7.setForeground(Color.cyan);
		b7.setBackground(Color.BLACK);
		b7.setBorderPainted(false);
		b7.setFocusPainted(false);
		b7.addActionListener(this);
		frame.add(b7);
		

		b8 = new JButton("8");
		b8.setBounds(80,180,50,50);
		b8.setForeground(Color.cyan);
		b8.setBackground(Color.black);
		b8.setBorderPainted(false);
		b8.setFocusPainted(false);
		b8.addActionListener(this);
		frame.add(b8);
		

		b9 = new JButton("9");
		b9.setBounds(150,180,50,50);
		b9.setForeground(Color.cyan);
		b9.setBackground(Color.black);
		b9.setBorderPainted(false);
		b9.addActionListener(this);
		b9.setFocusPainted(false);
		frame.add(b9);
		
		add = new JButton("+");
		add.setBounds(213,180,50,50);
		add.setForeground(Color.cyan);
		add.addActionListener(this);
		add.setBackground(Color.black);
		add.setBorderPainted(false);
		add.setFocusPainted(false);
		frame.add(add);
		
		
		b4 = new JButton("4");
		b4.setBounds(10,240,50,50);
		b4.setForeground(Color.cyan);
		b4.setBackground(Color.BLACK);
		b4.setBorderPainted(false);
		b4.addActionListener(this);
		b4.setFocusPainted(false);
		frame.add(b4);
		

		b5 = new JButton("5");
		b5.setBounds(80,240,50,50);
		b5.setForeground(Color.cyan);
		b5.setBackground(Color.black);
		b5.setBorderPainted(false);
		b5.addActionListener(this);
		b5.setFocusPainted(false);
		frame.add(b5);
		

		b6 = new JButton("6");
		b6.setBounds(150,240,50,50);
		b6.setForeground(Color.cyan);
		b6.setBackground(Color.black);
		b6.setBorderPainted(false);
		b6.addActionListener(this);
		b6.setFocusPainted(false);
		frame.add(b6);
		
		sub = new JButton("-");
		sub.setBounds(213,240,50,50);
		sub.setForeground(Color.cyan);
		sub.setBackground(Color.black);
		sub.setBorderPainted(false);
		sub.addActionListener(this);
		sub.setFocusPainted(false);
		frame.add(sub);
		
		b3 = new JButton("3");
		b3.setBounds(10,300,50,50);
		b3.setForeground(Color.cyan);
		b3.setBackground(Color.BLACK);
		b3.setBorderPainted(false);
		b3.addActionListener(this);
		b3.setFocusPainted(false);
		frame.add(b3);
		

		b2 = new JButton("2");
		b2.setBounds(80,300,50,50);
		b2.setForeground(Color.cyan);
		b2.setBackground(Color.black);
		b2.setBorderPainted(false);
		b2.addActionListener(this);
		b2.setFocusPainted(false);
		frame.add(b2);
		

		b1 = new JButton("1");
		b1.setBounds(150,300,50,50);
		b1.setForeground(Color.cyan);
		b1.setBackground(Color.black);
		b1.setBorderPainted(false);
		b1.setFocusPainted(false);
		b1.addActionListener(this);
		frame.add(b1);
		
		mul = new JButton("*");
		mul.setBounds(213,300,50,50);
		mul.setForeground(Color.cyan);
		mul.setBackground(Color.black);
		mul.setBorderPainted(false);
		mul.setFocusPainted(false);
		mul.addActionListener(this);
		frame.add(mul);
		
		b0 = new JButton("0");
		b0.setBounds(10,360,50,50);
		b0.setForeground(Color.cyan);
		b0.setBackground(Color.BLACK);
		b0.setBorderPainted(false);
		b0.setFocusPainted(false);
		b0.addActionListener(this);
		frame.add(b0);
		
		
		clear = new JButton("C");
		clear.setBounds(80,360,50,50);
		clear.setForeground(Color.cyan);
		clear.setBackground(Color.BLACK);
		clear.setBorderPainted(false);
	    clear.setFocusPainted(false);
		clear.addActionListener(this);
		frame.add(clear);
		
		div = new JButton("/");
		div.setBounds(150,360,50,50);
		div.setForeground(Color.cyan);
		div.setBackground(Color.BLACK);
		div.setBorderPainted(false);
	    div.setFocusPainted(false);
		div.addActionListener(this);
		frame.add(div);
		
		
        equal = new JButton("=");
		equal.setBounds(213,360,50,50);
		equal.setForeground(Color.cyan);
		equal.setBackground(Color.black);
		equal.setBorderPainted(false);
		equal.setFocusPainted(false);
		equal.addActionListener(this);
		frame.add(equal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		
		if(e.getSource()==b0) {
			t1.setText(t1.getText()+"0");
		}
		 
		if(e.getSource()==b1) {
			t1.setText(t1.getText()+"1");
		}
		
		if(e.getSource()==b2) {
			t1.setText(t1.getText()+"2");
		}
		
		if(e.getSource()==b3) {
			t1.setText(t1.getText()+"3");
		}
		
		if(e.getSource()==b4) {
			t1.setText(t1.getText()+"4");
		}
		
		if(e.getSource()==b5) {
			t1.setText(t1.getText()+"5");
		}
		
		if(e.getSource()==b6) {
			t1.setText(t1.getText()+"6");
		}
		
		if(e.getSource()==b7) {
			t1.setText(t1.getText()+"7");
		}
		
		if(e.getSource()==b8) {
			t1.setText(t1.getText()+"8");
		}
		if(e.getSource()==b9) {
			t1.setText(t1.getText()+"9");
		}
		
		if(e.getSource()==add) {

			num = Double.parseDouble(t1.getText());
			calculation=1;
			t1.setText(" ");
			l2.setText(num + "+");
		}
		
		if(e.getSource()==mul) {
			num = Double.parseDouble(t1.getText());
			calculation=3;
			t1.setText(" ");
			l2.setText(num + "8");
		}
		
		if(e.getSource()==sub) {
			num = Double.parseDouble(t1.getText());
			calculation=2;
			t1.setText(" ");
			l2.setText(num + "-");
		}
		
		if(e.getSource()==div) {
			num = Double.parseDouble(t1.getText());
			calculation=4;
			t1.setText(" ");
			l2.setText(num + "/");
		}
		
		if(e.getSource()==clear) {
			t1.setText("");
		}
		
		if(e.getSource()==equal) {
		 arithmetic_calculation();
		}
		
	}
	
	public void arithmetic_calculation() {
		switch(calculation) {
		case 1:
			ans= num + Double.parseDouble(t1.getText());
			t1.setText(Double.toString(ans));
			break;
			
		case 2:
			ans= num - Double.parseDouble(t1.getText());
			t1.setText(Double.toString(ans));
			break;
		case 3:
			ans= num * Double.parseDouble(t1.getText());
			t1.setText(Double.toString(ans));
			break;
			
		case 4:
			ans= num / Double.parseDouble(t1.getText());
			t1.setText(Double.toString(ans));
			break;
		}
	}

}

