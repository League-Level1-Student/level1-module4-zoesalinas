import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nasty implements ActionListener {
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	JButton leftbutton = new JButton();
	JButton rightbutton = new JButton();
	nasty(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		leftbutton.setText("Trick");
		rightbutton.setText("Treat");
		panel.add(leftbutton);
		panel.add(rightbutton);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		rightbutton.addActionListener(this);
		leftbutton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == leftbutton) {
			showPictureFromTheInternet("https://i.pinimg.com/736x/f4/19/6d/f4196d2e5b8ee7730ead8d38cffc58d2.jpg");
		}
		else if(e.getSource() == rightbutton) {
			showPictureFromTheInternet("https://1writeronthemove.files.wordpress.com/2014/02/picture-1.png");
		}
		}
	}
	
