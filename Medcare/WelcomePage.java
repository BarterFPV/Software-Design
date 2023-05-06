package Medcare;

import java.awt.*;
import javax.swing.*;

public class WelcomePage {

	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("");
	JLabel heightlabel = new JLabel("");
	JLabel weightlabel = new JLabel("");
	JLabel ilnesslabel = new JLabel("");
	
	WelcomePage(DLLNodeSD p_info){
		
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
		welcomeLabel.setText("Hello "+ p_info.getName());
		
		heightlabel.setBounds(0,40,200,35);
		heightlabel.setFont(new Font(null,Font.PLAIN,25));
		heightlabel.setText("Height:  "+ p_info.getHeight());
		
		weightlabel.setBounds(0,80,200,35);
		weightlabel.setFont(new Font(null,Font.PLAIN,25));
		weightlabel.setText("Weight:  "+ p_info.getWeight());
		
		ilnesslabel.setBounds(0,120,200,35);
		ilnesslabel.setFont(new Font(null,Font.PLAIN,25));
		ilnesslabel.setText("Illnes:  "+ p_info.getIllnes());
		
		frame.add(welcomeLabel);
		frame.add(heightlabel);
		frame.add(weightlabel);
		frame.add(ilnesslabel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}

