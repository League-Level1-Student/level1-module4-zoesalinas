package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker implements ActionListener {
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
	button2.setText("punchline");
	button.addActionListener(this);
	button2.addActionListener(this);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed == button) {
		JOptionPane.showMessageDialog(null, "Yesterday I bought some powdered water...");
		
	}
	else {
		JOptionPane.showMessageDialog(null, "I spent the whole day trying to figure out what to add to it.");
	}
}
}
