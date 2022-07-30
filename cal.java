package integralcalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Rectangle;

public class cal {

	private JFrame frame;
	private JTextField result;
	double num,ans,endans;
	int calculation;
	private JTextField txtDevi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal window = new cal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);	
		frame.setUndecorated(true);
		frame.setLocation(new Point(400, 200));
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Vivaldi", Font.BOLD, 17));
		frame.setBounds(100, 100, 384, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton module = new JButton("%");
		module.setBorderPainted(false);
		module.setFocusPainted(false);
		module.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(result.getText());
				calculation=5;
				result.setText(" ");
				txtDevi.setText(num+"%");
			}
		});
		module.setFont(new Font("Ubuntu", Font.BOLD, 19));
		module.setBackground(Color.black);
		module.setForeground(Color.white);
		module.setBounds(200, 89, 73, 63);
		frame.getContentPane().add(module);
		
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"9");
			}
		});
		nine.setFocusPainted(false);
		nine.setBorderPainted(false);
		nine.setBackground(Color.black);
		nine.setForeground(Color.white);
		nine.setFont(new Font("Ubuntu", Font.BOLD, 19));
		nine.setBounds(200, 165, 73, 63);
		frame.getContentPane().add(nine);
		
		
		
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"6");
			}
		});
		six.setFocusPainted(false);
		six.setBorderPainted(false);
		six.setBackground(Color.black);
		six.setForeground(Color.white);
		six.setFont(new Font("Ubuntu", Font.BOLD, 19));
		six.setBounds(200, 239, 73, 63);
		frame.getContentPane().add(six);
		
		
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_calculation();
			}
		});
		equal.setFocusPainted(false);
		equal.setBorderPainted(false);
		equal.setBackground(Color.black);
		equal.setForeground(Color.white);
		equal.setFont(new Font("Ubuntu", Font.BOLD, 21));
		equal.setBounds(221, 400, 136, 63);
		frame.getContentPane().add(equal);
		
		
		
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"7");
			}
		});
		seven.setFocusPainted(false);
		seven.setBorderPainted(false);
		seven.setBackground(Color.black);
		seven.setForeground(Color.white);
		seven.setFont(new Font("Ubuntu", Font.BOLD, 19));
		seven.setBounds(10, 165, 73, 63);
		frame.getContentPane().add(seven);
		
		
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"1");
			}
		});
		one.setFocusPainted(false);
		one.setBorderPainted(false);
		one.setBackground(Color.black);
		one.setForeground(Color.white);
		one.setFont(new Font("Ubuntu", Font.BOLD, 19));
		one.setBounds(10, 312, 73, 63);
		frame.getContentPane().add(one);
		
		
		
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"5");
			}
		});
		five.setFocusPainted(false);
		five.setBorderPainted(false);
		five.setBackground(Color.black);
		five.setForeground(Color.white);
		five.setFont(new Font("Ubuntu", Font.BOLD, 19));
		five.setBounds(105, 238, 73, 63);
		frame.getContentPane().add(five);
		
		
		
		JButton btnExit = new JButton("exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFocusPainted(false);
		btnExit.setBorderPainted(false);
		btnExit.setBackground(Color.black);
		btnExit.setForeground(Color.white);
		btnExit.setFont(new Font("Ubuntu", Font.BOLD, 19));
		btnExit.setBounds(105, 89, 73, 63);
		frame.getContentPane().add(btnExit);
		
		
		
		JButton clear = new JButton("C");
		clear.setBackground(Color.WHITE);
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(" ");
				txtDevi.setText(null);
			}
		});
		clear.setFocusPainted(false);
		clear.setBorderPainted(false);
		clear.setBackground(Color.black);
		clear.setForeground(Color.white);
		clear.setFont(new Font("Ubuntu", Font.BOLD, 19));
		clear.setBounds(10, 89, 73, 63);
		frame.getContentPane().add(clear);
		
		
		
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"4");
			}
		});
		four.setFocusPainted(false);
		four.setBorderPainted(false);
		four.setBackground(Color.black);
		four.setForeground(Color.white);
		four.setFont(new Font("Ubuntu", Font.BOLD, 19));
		four.setBounds(10, 238, 73, 63);
		frame.getContentPane().add(four);
		
		
		
		JButton tw0 = new JButton("2");
		tw0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"2");
			}
		});
		tw0.setFocusPainted(false);
		tw0.setBorderPainted(false);
		tw0.setBackground(Color.black);
		tw0.setForeground(Color.white);
		tw0.setFont(new Font("Ubuntu", Font.BOLD, 19));
		tw0.setBounds(105, 312, 73, 63);
		frame.getContentPane().add(tw0);
		
		
		
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"8");
			}
		});
		eight.setFocusPainted(false);
		eight.setBorderPainted(false);
		eight.setBackground(Color.black);
		eight.setForeground(Color.white);
		eight.setFont(new Font("Ubuntu", Font.BOLD, 18));
		eight.setBounds(105, 165, 73, 63);
		frame.getContentPane().add(eight);
		
		
		
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"3");
			}
		});
		three.setFocusPainted(false);
		three.setBorderPainted(false);
		three.setBackground(Color.black);
		three.setForeground(Color.white);
		three.setFont(new Font("Ubuntu", Font.BOLD, 19));
		three.setBounds(200, 313, 73, 63);
		frame.getContentPane().add(three);
		
		
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(result.getText());
				calculation=4;
				result.setText(" ");
				txtDevi.setText(num+"/");
			}
		});
		div.setFocusPainted(false);
		div.setBorderPainted(false);
		div.setBackground(Color.black);
		div.setForeground(Color.white);
		div.setFont(new Font("Ubuntu", Font.BOLD, 19));
		div.setBounds(296, 89, 73, 63);
		frame.getContentPane().add(div);
		
		
		
		JButton mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(result.getText());
				calculation=3;
				result.setText(" ");
				txtDevi.setText(num+"*");
			}
		});
		mul.setFocusPainted(false);
		mul.setBorderPainted(false);
		mul.setBackground(Color.black);
		mul.setForeground(Color.white);
		mul.setFont(new Font("Ubuntu", Font.BOLD, 19));
		mul.setBounds(296, 165, 73, 63);
		frame.getContentPane().add(mul);
		
		
		
		JButton sub = new JButton("-");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(result.getText());
				calculation=2;
				result.setText(" ");
				txtDevi.setText(num+"-");
			}
		});
		sub.setFocusPainted(false);
		sub.setBorderPainted(false);
		sub.setBackground(Color.black);
		sub.setForeground(Color.white);
		sub.setFont(new Font("Ubuntu", Font.BOLD, 19));
		sub.setBounds(296, 239, 73, 63);
		frame.getContentPane().add(sub);
		
		
		
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(result.getText());
				calculation=1;
				result.setText(" ");
				txtDevi.setText(num+"+");
				
			}
		});
		add.setFocusPainted(false);
		add.setBorderPainted(false);
		add.setBackground(Color.black);
		add.setForeground(Color.white);
		add.setFont(new Font("Ubuntu", Font.BOLD, 19));
		add.setBounds(296, 312, 73, 63);
		frame.getContentPane().add(add);
		
		
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+"0");
			}
		});
		zero.setFocusPainted(false);
		zero.setBorderPainted(false);
		zero.setBackground(Color.black);
		zero.setForeground(Color.white);
		zero.setFont(new Font("Ubuntu", Font.BOLD, 19));
		zero.setBounds(10, 400, 84, 63);
		frame.getContentPane().add(zero);
		
		
		
		JButton power = new JButton("^");
		power.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(result.getText());
				calculation=6;
				result.setText(" ");
				txtDevi.setText(num+"^");
			}
			
		});
		power.setFocusPainted(false);
		power.setBorderPainted(false);
		power.setBackground(Color.black);
		power.setForeground(Color.white);
		power.setFont(new Font("Ubuntu", Font.BOLD, 19));
		power.setBounds(115, 400, 84, 63);
		frame.getContentPane().add(power);
		
		result = new JTextField();
		result.setBounds(new Rectangle(2, 2, 2, 2));
		result.setBackground(Color.WHITE);
		result.setEditable(false);
		result.setHorizontalAlignment(SwingConstants.RIGHT);
		result.setFont(new Font("Ubuntu", Font.BOLD, 22));
		result.setBounds(10, 41, 359, 37);
		result.setBorder(null);
		frame.getContentPane().add(result);
		result.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Made By Devi Prasad MIshra");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(73, 474, 240, 30);
		frame.getContentPane().add(lblNewLabel);
		
		txtDevi = new JTextField();
		txtDevi.setMargin(new Insets(0, 0, 0, 0));
		txtDevi.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDevi.setText("  ");
		txtDevi.setBackground(Color.WHITE);
		txtDevi.setFocusable(false);
		txtDevi.setEditable(false);
		txtDevi.setBorder(null);
		txtDevi.setFont(new Font("Ubuntu", Font.BOLD, 21));
		txtDevi.setBounds(10, 11, 359, 30);
		frame.getContentPane().add(txtDevi);
		txtDevi.setColumns(10);
	}
	
	
	public void arithmetic_calculation() {
		
		switch(calculation) {
		case 1:
			ans= num + Double.parseDouble(result.getText());
			txtDevi.setText(num+"+"+result.getText());
			result.setText(Double.toString(ans));
			break;
			
		case 2:
			ans= num - Double.parseDouble(result.getText());
			txtDevi.setText(num+"-"+result.getText());
			result.setText(Double.toString(ans));
			break;
		case 3:
			ans= num * Double.parseDouble(result.getText());
			txtDevi.setText(num+"*"+result.getText());
			result.setText(Double.toString(ans));
			break;
			
		case 4:
			ans= num / Double.parseDouble(result.getText());
			txtDevi.setText(num+"/"+result.getText());
			result.setText(Double.toString(ans));
			break;
		
		case 5:
			ans= num % Double.parseDouble(result.getText());
			txtDevi.setText(num+"%"+result.getText());
			result.setText(Double.toString(ans));
			break;
			
		case 6:
			ans= Math.pow(num, Double.parseDouble(result.getText()));
			txtDevi.setText(num+"^"+result.getText());
			result.setText(Double.toString(ans));
			break;
					
	
		}
	}
}
