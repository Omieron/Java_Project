package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import MainandSystemClass.OrderSys;
import Is_aRelation.Hamburger;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class searchFrame extends JFrame {

	private JPanel contentPane;
	private JTextField getNumber;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public searchFrame(SysFrame sysF) {
		
		setTitle("Search Order");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Order #:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 27, 99, 30);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(10, 85, 567, 153);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 547, 131);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setText("First write an integer and Press Enter or Click Search\nFor exit Press ESC or click Close");
		textArea.setForeground(new Color(255, 255, 128));
		textArea.setBackground(new Color(0, 0, 0));
		
		JButton closeBtn = new JButton("Close");
		closeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sysF.setVisible(true);
				dispose();
				textArea.setText("");
				getNumber.setText("");
			}
		});
		closeBtn.setBounds(478, 27, 89, 30);
		contentPane.add(closeBtn);
		
		JButton searchBtn = new JButton("Search");
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String result = "";
				Hamburger temp;
				
				try {
					 temp = OrderSys.searchOrder(Integer.parseInt(getNumber.getText().toString()));
					 
					 if(temp == null)
						 
						 result = "There is no order whose number " + getNumber.getText();
					 else
					 
						 result = temp.toString();
				 }
				 catch (NumberFormatException numberFormatException) {
	        		 result += "\nYou must enter integers.\nPlease try again.\n";
	        	}
				
				textArea.setText(result);
			}
		});
		searchBtn.setBounds(369, 27, 99, 30);
		contentPane.add(searchBtn);
		
		getNumber = new JTextField();
		getNumber.addKeyListener(new KeyAdapter() {
			@Override
		    public void keyPressed(KeyEvent e) {
		        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		            searchBtn.doClick(); 
		        }
		        else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
		        	closeBtn.doClick();
		        }
		    }
		});
		getNumber.setBounds(119, 27, 240, 30);
		contentPane.add(getNumber);
		getNumber.setColumns(10);
		
		
		
		
	}
}
