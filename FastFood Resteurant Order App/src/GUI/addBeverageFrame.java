package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class addBeverageFrame extends JFrame {

	private JPanel contentPane;
	
	private JRadioButton cokeLbl;
	
	private JCheckBox iceCheckBox; 
	

	private String output = "Coca-Cola";
	
	ImageIcon ccpng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\Drinks\\cocacola.jpg");
	ImageIcon cczpng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\Drinks\\cocacolazero.jpg");
	ImageIcon cclpng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\Drinks\\cocacolalight.jpg");
	ImageIcon spng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\Drinks\\sprite.jpg");
	ImageIcon fbpng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\Drinks\\fanta.jpg");
	ImageIcon mpng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\Drinks\\sadesoda.jpg");
	ImageIcon wbpng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\Drinks\\Su.jpg");
	ImageIcon apng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\Drinks\\ayran.jpg");
	ImageIcon ipng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\Drinks\\fusetea.jpg");
	ImageIcon jpng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\Drinks\\cappy.jpg");
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the frame.
	 */
	public addBeverageFrame(addFrame adf) {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Beverages", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 438, 309);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel imgLbl = new JLabel("");
		imgLbl.setIcon(ccpng);
		imgLbl.setBounds(44, 338, 157, 139);
		contentPane.add(imgLbl);
		
		cokeLbl = new JRadioButton("Coca-Cola");
		cokeLbl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cokeLbl.isSelected()) {
					imgLbl.setIcon(ccpng);
					output = "Coca-Cola";
				}			}
		});
		cokeLbl.setSelected(true);
		buttonGroup.add(cokeLbl);
		cokeLbl.setBounds(32, 38, 111, 23);
		panel.add(cokeLbl);
		
		JRadioButton fantaLbl = new JRadioButton("Fanta");
		fantaLbl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fantaLbl.isSelected()) {
					imgLbl.setIcon(fbpng);
					output = "Fanta";	
				}
			}
		});
		buttonGroup.add(fantaLbl);
		fantaLbl.setBounds(32, 93, 111, 23);
		panel.add(fantaLbl);
		
		JRadioButton spriteLbl = new JRadioButton("Sprite");
		spriteLbl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(spriteLbl.isSelected()) {
					imgLbl.setIcon(spng);
					output = "Sprite";
				}
			}
		});
		buttonGroup.add(spriteLbl);
		spriteLbl.setBounds(32, 148, 111, 23);
		panel.add(spriteLbl);
		
		JRadioButton juiceLabel = new JRadioButton("Fruit Juice");
		juiceLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(juiceLabel.isSelected()) {
					imgLbl.setIcon(jpng);
					output = "Fruit Juice";
				    
				}
			}
		});
		buttonGroup.add(juiceLabel);
		juiceLabel.setBounds(32, 205, 111, 23);
		panel.add(juiceLabel);
		
		JRadioButton iceteaPLabel = new JRadioButton("Ice Tea (Peach)");
		iceteaPLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(iceteaPLabel.isSelected()) {
					imgLbl.setIcon(ipng);
					output = "Ice Tea (Peach)";
				}
			}
		});
		buttonGroup.add(iceteaPLabel);
		iceteaPLabel.setBounds(32, 261, 160, 23);
		panel.add(iceteaPLabel);
		
		JRadioButton cokeZLabel = new JRadioButton("Coca-Cola Zero");
		cokeZLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cokeZLabel.isSelected()){
					imgLbl.setIcon(cczpng);
					output = "Coca-Cola Zero";
				}
			}
		});
		buttonGroup.add(cokeZLabel);
		cokeZLabel.setBounds(256, 38, 141, 23);
		panel.add(cokeZLabel);
		
		JRadioButton cokeLLabel = new JRadioButton("Coca-Cola Light");
		cokeLLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cokeLLabel.isSelected()) {
					imgLbl.setIcon(cclpng);
					output = "Coca-Cola Light";
				}
			}
		});
		buttonGroup.add(cokeLLabel);
		cokeLLabel.setBounds(256, 93, 141, 23);
		panel.add(cokeLLabel);
		
		JRadioButton ayranLbl = new JRadioButton("Ayran");
		ayranLbl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ayranLbl.isSelected()) {
					imgLbl.setIcon(apng);
					output = "Ayran";
				}}
		});
		buttonGroup.add(ayranLbl);
		ayranLbl.setBounds(256, 148, 141, 23);
		panel.add(ayranLbl);
		
		JRadioButton sodaLabel = new JRadioButton("Plain Soda");
		sodaLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sodaLabel.isSelected()) {
					imgLbl.setIcon(mpng);
					output = "Plain Soda";
				}
			}
		});
		buttonGroup.add(sodaLabel);
		sodaLabel.setBounds(256, 205, 141, 23);
		panel.add(sodaLabel);
		
		JRadioButton waterLabel = new JRadioButton("Water");
		waterLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(waterLabel.isSelected()) {
					imgLbl.setIcon(wbpng);
					output = "Water";
				}
			}
		});
		buttonGroup.add(waterLabel);
		waterLabel.setBounds(256, 261, 111, 23);
		panel.add(waterLabel);
		
		iceCheckBox = new JCheckBox("Ice");
		iceCheckBox.setBounds(321, 364, 65, 23);
		contentPane.add(iceCheckBox);
		
		JButton completeBtn = new JButton("Complete");
		completeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                adf.setBevNameandIce(output, iceCheckBox.isSelected());
				adf.setVisible(true);
				dispose();
			}
		});
		completeBtn.setBounds(273, 420, 128, 42);
		contentPane.add(completeBtn);

		
	}
	
	public void setZeroPoint() {
		
		this.cokeLbl.setSelected(true);
		this.iceCheckBox.setSelected(false);
		
	}
}
