/**
 * 
 */
package java_calc;

/**
 * @author Nirav
 *
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class calculator {


	double number1 = 0.0;
	double number2 = 0.0;
	double result;
	int addc, subc, mulc, divc;
	//initiation
	JFrame fj = new JFrame();
	//JPanel pj = new JPanel();
	TextArea tj = new TextArea();
	JButton bclr = new JButton();
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
	JButton buttonadd = new JButton();
	JButton buttonsub = new JButton();
	JButton buttonmul = new JButton();
	JButton buttondiv = new JButton();
	JButton buttondot = new JButton();
	JButton buttoneqa = new JButton();

	public calculator() {
		//frame parameters
		fj.setTitle("New Calculator");
		fj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fj.add(tj);
		fj.setSize(350, 350);
		fj.setLayout(null);
		fj.setVisible(true);
		fj.setResizable(false);

		//text field parameters
		tj.setBounds(15, 15, 280, 40);

		//buttons parameters
		fj.add(bclr);
		bclr.setBounds(15, 70, 90, 30);
		bclr.setText("Clr");
		fj.add(button7);
		button7.setBounds(15, 115, 60, 30);
		button7.setText("7");
		fj.add(button8);
		button8.setBounds(90, 115, 60, 30);
		button8.setText("8");
		fj.add(button9);
		button9.setBounds(165, 115, 60, 30);
		button9.setText("9");
		fj.add(buttonadd);
		buttonadd.setBounds(240, 115, 60, 30);
		buttonadd.setText("+");
		fj.add(button4);
		button4.setBounds(15, 160, 60, 30);
		button4.setText("4");
		fj.add(button5);
		button5.setBounds(90, 160, 60, 30);
		button5.setText("5");
		fj.add(button6);
		button6.setBounds(165, 160, 60, 30);
		button6.setText("6");
		fj.add(buttonsub);
		buttonsub.setBounds(240, 160, 60, 30);
		buttonsub.setText("-");
		fj.add(button1);
		button1.setBounds(15, 205, 60, 30);
		button1.setText("1");
		fj.add(button2);
		button2.setBounds(90, 205, 60, 30);
		button2.setText("2");
		fj.add(button3);
		button3.setBounds(165, 205, 60, 30);
		button3.setText("3");
		fj.add(buttonmul);
		buttonmul.setBounds(240, 205, 60, 30);
		buttonmul.setText("x");
		fj.add(buttondot);
		buttondot.setBounds(15, 250, 60, 30);
		buttondot.setText(".");
		fj.add(button0);
		button0.setBounds(90, 250, 60, 30);
		button0.setText("0");
		fj.add(buttoneqa);
		buttoneqa.setBounds(165, 250, 60, 30);
		buttoneqa.setText("=");
		fj.add(buttondiv);
		buttondiv.setBounds(240, 250, 60, 30);
		buttondiv.setText("/");


		bclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tj.setText("");
				number1 = 0.0;
				number2 = 0.0;
			}
		});
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tj.append("0");
			}
		});
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tj.append("1");
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tj.append("2");
			}
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tj.append("3");
			}
		});
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tj.append("4");
			}
		});
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tj.append("5");
			}
		});
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tj.append("6");
			}
		});
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tj.append("7");
			}
		});
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tj.append("8");
			}
		});
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tj.append("9");
			}
		});
		buttondot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tj.append(".");
			}
		});
		buttonadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = number_reader();
				addc = 1;
				subc = divc = mulc = 0;
			}
		});
		buttonsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = number_reader();
				subc = 1;
				addc = divc = mulc = 0;
			}
		});
		buttonmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = number_reader();
				mulc = 1;
				subc = divc = addc = 0;
			}
		});
		buttondiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = number_reader();
				divc = 1;
				subc = addc = mulc = 0;
			}
		});
		buttoneqa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number2 = number_reader();
				if(addc>0) {
					result = number1+number2;
					tj.setText(Double.toString(result));
				}
				if(subc>0) {
					result = number1-number2;
					tj.setText(Double.toString(result));
				}
				if(mulc>0) {
					result = number1*number2;
					tj.setText(Double.toString(result));
				}
				if(divc>0) {
					result = number1/number2;
					tj.setText(Double.toString(result));
				}
			}
		});
	}
	
	public double number_reader() {
		double num1;
		String s;
		s = tj.getText();
		num1 = Double.valueOf(s);
		tj.setText("");
		return num1;
	}
}
