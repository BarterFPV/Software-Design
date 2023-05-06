package Medcare;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PatientPage implements ActionListener{

	JFrame frame = new JFrame();
	JLabel title = new JLabel("");
	JLabel patient = new JLabel("");
	JLabel Look = new JLabel("");
	JTextField lookfield = new JTextField("");
	JButton go = new JButton("Go");
	static DEQueueSD<String> PInfo = new DEQueueSD<String>();

	
	
	PatientPage(DEQueueSD<String> patientInfoOriginal){
		
		PInfo = patientInfoOriginal;
		
		
		title.setBounds(0,0,200,35);
		title.setFont(new Font(null,Font.PLAIN,25));
		title.setText("Patient's list");
		
		patient.setBounds(0,45,420,35);
		patient.setFont(new Font(null,Font.PLAIN,15));
		patient.setText(PInfo.AllString());
		
		Look.setBounds(0,350,100,25);
		Look.setFont(new Font(null,Font.PLAIN,20));
		Look.setText("Look up");
		
		lookfield.setBounds(110,350,200,25);
		lookfield.setFont(new Font(null,Font.PLAIN,20));
		
		go.setBounds(320,350,80,25);
		go.setFocusable(false);
		go.addActionListener(this);
		
		
		
		frame.add(title);
		frame.add(patient);
		frame.add(Look);
		frame.add(lookfield);
		frame.add(go);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==go) {
			
			String userID = lookfield.getText();
			
			if(PInfo.lookup(userID)) {
				DLLNodeSD<String> tempNode = PInfo.getnode(userID);
				WelcomePage welcomePage = new WelcomePage(tempNode);
				frame.dispose();
			}
		}
					
				
		
	}
}
