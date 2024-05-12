package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MainandSystemClass.OrderSys;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class removeFrame extends JFrame {

	private JPanel contentPane;
	private JTextField getNumber;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public removeFrame(SysFrame sysF) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Order #");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 82, 29);
		contentPane.add(lblNewLabel);
		
		getNumber = new JTextField();
		getNumber.setBounds(102, 11, 171, 29);
		contentPane.add(getNumber);
		getNumber.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 51, 481, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("First write an integer and Press Enter or Click Search\nFor exit Press ESC or click Close");
		textArea.setForeground(new Color(255, 255, 128));
		textArea.setBackground(new Color(0, 0, 0));
		textArea.setBounds(10, 11, 461, 46);
		panel.add(textArea);
		
		JButton removeBtn = new JButton("Remove");
		removeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check;
				String result = "";
				try {
					 check = OrderSys.removeOrder(Integer.parseInt(getNumber.getText().toString()));
					 
					 if(check == true)
						 
						 result = "The order " + getNumber.getText() + " was removed";
					 else
					 
						 result = "The order " + getNumber.getText() + " cannot found";
				 }
				 catch (NumberFormatException numberFormatException) {
	        		 result += "You must enter integers.\nPlease try again.\n";
	        	}
				
				textArea.setText(result);
			}
		});
		removeBtn.setBounds(294, 11, 89, 29);
		contentPane.add(removeBtn);
		
		JButton closeBtn = new JButton("Close");
		closeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sysF.setVisible(true);
				dispose();
				textArea.setText("");
				getNumber.setText("");
			}
		});
		closeBtn.setBounds(402, 11, 89, 29);
		contentPane.add(closeBtn);
		
		getNumber.addKeyListener(new KeyAdapter() {
			@Override
		    public void keyPressed(KeyEvent e) {
		        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		            removeBtn.doClick(); 
		        }
		        else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
		        	closeBtn.doClick();
		        }
		    }
		});
		
	}

}
