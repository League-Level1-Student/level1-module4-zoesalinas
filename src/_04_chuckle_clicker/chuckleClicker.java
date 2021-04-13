package _04_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();

chuckleClicker(){
	frame.setVisible(true);
	frame.add(panel);
	makeButtons();
	frame.pack();
}

private void makeButtons() {
	// TODO Auto-generated method stub
//JOptionPane.showMessageDialog(null, "Make Buttons");
	panel.add(button);
	panel.add(button2);
	button.setText("joke");
	button.setText("punchline");
	
}
}
