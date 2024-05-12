package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import MainandSystemClass.OrderSys;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class SysFrame extends JFrame {

	private JPanel contentPane;
	
	addFrame adf = new addFrame(this);
	searchFrame sfr = new searchFrame(this);
	removeFrame rfr = new removeFrame(this);

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public SysFrame() {
		setTitle("Order System Interface");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(244, 36, 514, 487);
		contentPane.add(scrollPane_1);
		
		JPanel textPanel = new JPanel();
		scrollPane_1.setViewportView(textPanel);
		textPanel.setBorder(new MatteBorder(3, 3, 2, 2, (Color) new Color(0, 0, 0)));
		textPanel.setLayout(null);		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 494, 465);
		textPanel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("Click to see all orders");
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String output;
				output = OrderSys.getAllOrderNo();
			    if(output.equalsIgnoreCase("bos"))
			    	textArea.setText("There is no order yet!\nFirst take order!");
			    else
			    	textArea.setText(output);
			}
		});
		scrollPane.setViewportView(textArea);
		textArea.setForeground(new Color(192, 192, 192));
		textArea.setBackground(new Color(0, 0, 0));
		scrollPane.setViewportView(textArea);
		
		JButton addButton = new JButton("Add Order");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adf.setVisible(true);
				setVisible(false);

			}
		});
		addButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		addButton.setBounds(30, 44, 174, 54);
		contentPane.add(addButton);
		
		JButton btnNewButton_1 = new JButton("Display Order");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(OrderSys.displayOrders());
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(30, 144, 174, 54);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Search Order");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sfr.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2.setBounds(30, 356, 174, 54);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Remove Order");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rfr.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_3.setBounds(30, 457, 174, 54);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2_1 = new JButton("Calculate Order");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderSys.calculatePrice();
				textArea.setText("All orders calculated");
			}
		});
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2_1.setBounds(30, 249, 174, 54);
		contentPane.add(btnNewButton_2_1);
	}
}
