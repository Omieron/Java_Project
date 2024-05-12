package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alert extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Alert(addFrame adf, SysFrame sfy) {
		
		
		
		setTitle("Order Alert");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Order was created!!!");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(100, 22, 289, 84);
		contentPane.add(lblNewLabel);
		
		JButton okBtn = new JButton("Ok");
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adf.dispose();
				sfy.setVisible(true);
				dispose();
				adf.setTxtrorder();
				adf.setFlag();
			}
		});
		okBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		okBtn.setBounds(151, 103, 154, 36);
		contentPane.add(okBtn);
	}
}
