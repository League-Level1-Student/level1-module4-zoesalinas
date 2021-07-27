package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator {
public static void main(String[] args) {
	new Calculator().start();
}
private void start() {
	// TODO Auto-generated method stub
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton add2 = new JButton();
	JButton subtract = new JButton();
	JButton subtract2 = new JButton();
	JButton divide = new JButton();
	JButton divide2 = new JButton();
	JButton multiply = new JButton();
	JButton multiply2 = new JButton();
	frame.add(panel);
	panel.add(add);
	panel.add(add2);
	panel.add(subtract);
	panel.add(subtract2);
	panel.add(divide);
	panel.add(divide2);
	panel.add(multiply);
	panel.add(multiply2);
	frame.setVisible(true);	
}
void add() {
	
	
}

void subtract() {
	
}

void divide() {
	
}

void multiply() {
	
}

}
