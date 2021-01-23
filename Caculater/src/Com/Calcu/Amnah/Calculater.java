package Com.Calcu.Amnah;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculater implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
    JTextArea textArea = new JTextArea(2,12);
    
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();
    JButton button0 = new JButton();
    JButton buttonAdd = new JButton();
    JButton buttonSub = new JButton();
    JButton buttonMult = new JButton();
    JButton buttonDiv = new JButton();
    JButton buttonRemn = new JButton();
    JButton buttonEqual = new JButton();
    JButton buttonDot = new JButton();
    JButton buttonClear = new JButton();
    JButton buttonSqrt = new JButton();
    JButton buttonBack = new JButton();
    JButton buttonPower = new JButton();
    JButton buttonSin = new JButton();
    JButton buttonCos = new JButton();
    JButton buttonTan = new JButton();
    java.awt.Image img ;
    double number1 ,number2 ,result ;
    int add=0 ,sub=0 ,mult=0 ,div=0 ,remain =0,sqrt = 0
    		,pow = 0 ,sin = 0 , cos = 0 ,tan = 0;
    
	public Calculater() {
		frame.setSize(375,440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Calculater");
		
		frame.add(panel);
		panel.setBackground(Color.BLACK);
		Border border = BorderFactory.createLineBorder(Color.RED,2);
		panel.setBorder(border);
		
		panel.add(textArea);
		textArea.setBackground(Color.LIGHT_GRAY);
		Border textBorder = BorderFactory.createLineBorder(Color.WHITE,1);
		textArea.setBorder(textBorder);
		
		Font font = new Font("arial",Font.BOLD,33);
		textArea.setFont(font);
		textArea.setForeground(Color.WHITE);
		textArea.setPreferredSize(new Dimension(2,12));
		textArea.setLineWrap(true);
		
		//The part of Button
		panel.add(buttonSin);
		panel.add(buttonCos);
		panel.add(buttonTan);
		panel.add(buttonClear);
		panel.add(buttonSqrt);
		panel.add(buttonPower);
		panel.add(buttonRemn);
		panel.add(buttonBack);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(buttonDiv);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(buttonMult);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(buttonSub);
		panel.add(buttonDot);
		panel.add(button0);
		panel.add(buttonEqual);
		panel.add(buttonAdd);
		
		
		button1.setPreferredSize(new Dimension(79,45));
		img = new ImageIcon(this.getClass().getResource("/111.jpg")).getImage();
		button1.setIcon(new ImageIcon(img));
		
		button2.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/222.jpg")).getImage();
		button2.setIcon(new ImageIcon(img));
		
		button3.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/333.jpg")).getImage();
		button3.setIcon(new ImageIcon(img));
		
		buttonAdd.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/add2.jpg")).getImage();
		buttonAdd.setIcon(new ImageIcon(img));
		
		button4.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/444.jpg")).getImage();
		button4.setIcon(new ImageIcon(img));
		
		button5.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/555.jpg")).getImage();
		button5.setIcon(new ImageIcon(img));
		
		button6.setPreferredSize(new Dimension(79,45));
		img = new ImageIcon(this.getClass().getResource("/666.jpg")).getImage();
		button6.setIcon(new ImageIcon(img));
		
		buttonSub.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/sub3.jpg")).getImage();
		buttonSub.setIcon(new ImageIcon(img));		
		
		button7.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/777.jpg")).getImage();
		button7.setIcon(new ImageIcon(img));
		
		button8.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/888.jpg")).getImage();
		button8.setIcon(new ImageIcon(img));
		
		button9.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/999.jpg")).getImage();
		button9.setIcon(new ImageIcon(img));
		
		buttonMult.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/mult2.jpg")).getImage();
		buttonMult.setIcon(new ImageIcon(img));
		
		buttonDot.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/dot.jpg")).getImage();
		buttonDot.setIcon(new ImageIcon(img));
		 
		button0.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/000.jpg")).getImage();
		button0.setIcon(new ImageIcon(img));
		
		buttonRemn.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/remain.jpg")).getImage();
		buttonRemn.setIcon(new ImageIcon(img));
		
		buttonDiv.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/div2.jpg")).getImage();
		buttonDiv.setIcon(new ImageIcon(img));
		
		buttonClear.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/clc.jpg")).getImage();
		buttonClear.setIcon(new ImageIcon(img));
		
		buttonEqual.setPreferredSize(new Dimension(79,45));
		img = new ImageIcon(this.getClass().getResource("/equal2.jpg")).getImage();
		buttonEqual.setIcon(new ImageIcon(img));
		
		buttonSqrt.setPreferredSize(new Dimension(79,45));
		img = new ImageIcon(this.getClass().getResource("/sqrt2.jpg")).getImage();
		buttonSqrt.setIcon(new ImageIcon(img));
		
		buttonPower.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/pow2.jpg")).getImage();
		buttonPower.setIcon(new ImageIcon(img));
		
		buttonBack.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/back.jpg")).getImage();
		buttonBack.setIcon(new ImageIcon(img));
		
		buttonSin.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/sin.jpg")).getImage();
		buttonSin.setIcon(new ImageIcon(img));
		
		buttonCos.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/cos.jpg")).getImage();
		buttonCos.setIcon(new ImageIcon(img));
		
		buttonTan.setPreferredSize(new Dimension(80,45));
		img = new ImageIcon(this.getClass().getResource("/tan.jpg")).getImage();
		buttonTan.setIcon(new ImageIcon(img));
		
		
		//Gave the action to buttons
		
		buttonSin.addActionListener(this);
		buttonCos.addActionListener(this);
		buttonTan.addActionListener(this);
		buttonBack.addActionListener(this);
		buttonPower.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		buttonAdd.addActionListener(this);
		buttonSub.addActionListener(this);
		buttonMult.addActionListener(this);
		buttonDiv.addActionListener(this);
		buttonRemn.addActionListener(this);
		buttonDot.addActionListener(this);
		buttonClear.addActionListener(this);
		buttonEqual.addActionListener(this);
		buttonSqrt.addActionListener(this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if (source == buttonClear) {
			number1 = 0.0;
			number2 = 0.0;
			textArea.setText("");
		}
		if (source == buttonBack) {
			String backSpace = null;
			if (textArea.getText().length()>0) {
				StringBuilder strB = new StringBuilder(textArea.getText());
				strB.deleteCharAt(textArea.getText().length() - 1);
				backSpace = strB.toString();
				textArea.setText(backSpace);
						
			}
		}
		
		if (source == button1) {
			textArea.append("1");
		}
		if (source == button2) {
			textArea.append("2");
		}
		if (source == button3) {
			textArea.append("3");
		}
		if (source == button4) {
			textArea.append("4");
		}
		if (source == button5) {
			textArea.append("5");
		}
		if (source == button6) {
			textArea.append("6");
		}
		if (source == button7) {
			textArea.append("7");
		}
		if (source == button8) {
			textArea.append("8");
		}
		if (source == button9) {
			textArea.append("9");
		}
		if (source == button0) {
			textArea.append("0");
		}
		if (source == buttonDot) {
			textArea.append(".");
		}
		if (source == buttonPower) {
			number1 = numberOperation();
			textArea.setText(Double.toString(Math.pow(number1,2)));
		}
		if (source == buttonSqrt) {
			number1 = numberOperation();
			textArea.setText(Double.toString(Math.sqrt(number1)));
		}
		if (source == buttonSin) {
			number1 = numberOperation();
			textArea.setText(Double.toString(Math.sin(number1)));
		}
		if (source == buttonCos) {
			number1 = numberOperation();
			textArea.setText(Double.toString(Math.cos(number1)));
		}
		if (source == buttonTan) {
			number1 = numberOperation();
			textArea.setText(Double.toString(Math.tan(number1)));
		}
		
		if (source == buttonAdd) {
			number1 = numberOperation();
			textArea.setText("");
			add = 1;
			sub = 0;
			mult = 0;
			div = 0;
			remain = 0 ;
	
		}
		if (source == buttonSub) {
			number1 = numberOperation();
			textArea.setText("");
			add = 0;
			sub = 1;
			mult = 0;
			div = 0;
			remain = 0 ;
			
		}
		if (source == buttonMult) {
			number1 = numberOperation();
			textArea.setText("");
			add = 0;
			sub = 0;
			mult = 1;
			div = 0;
			remain = 0 ;
		
		}
		if (source == buttonDiv) {
			number1 = numberOperation();
			textArea.setText("");
			add = 0;
			sub = 0;
			mult = 0;
			div = 1;
			remain = 0 ;
			
		}
		if (source == buttonRemn) {
			number1 = numberOperation();
			textArea.setText("");
			add = 0;
			sub = 0;
			mult = 0;
			div = 0;
			remain = 1 ;
		}
		
		
		if (source == buttonEqual) {
			number2 = numberOperation();
			
			if (add > 0) {
				result = number1 + number2 ;
				textArea.setText(Double.toString(result));
			}
			if (sub > 0 ) {
				result = number1 - number2 ;
				textArea.setText(Double.toString(result));
			}
			if (mult > 0) {
				result = number1 * number2 ;
				textArea.setText(Double.toString(result));
			}
			if (div > 0 ) {
				result = number1 / number2 ;
				textArea.setText(Double.toString(result));
			}
			if (remain > 0) {
				result = number1 % number2 ;
				textArea.setText(Double.toString(result));
			}
			
		}
		
		
	}
	

	public double numberOperation() {
		double num ;
		String s ;
		s = textArea.getText();
		num = Double.valueOf(s);
		return num ;
	}
	

}
