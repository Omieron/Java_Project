package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addFriesFrame extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	private JComboBox friesName;
	private JComboBox fsCBB;
	private JComboBox ssCBB;
	private JRadioButton smallBtn;
	
	addSauceFrame asf;
	
	private String [][] Sauce = new String[8][2];

	/**
	 * Create the frame.
	 */
	public addFriesFrame(addFrame adf) {
		
		asf = new addSauceFrame(adf, this);
		
		setTitle("Fries");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel typeFLabel = new JLabel("Fries Type:");
		typeFLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		typeFLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		typeFLabel.setBounds(10, 28, 113, 22);
		contentPane.add(typeFLabel);
		
		friesName = new JComboBox();
		friesName.setModel(new DefaultComboBoxModel(new String[] {"French Fries", "Curly Fries", "Patato Wedges", "Mashed Patato", "Waffle Fries"}));
		friesName.setBounds(133, 28, 148, 22);
		contentPane.add(friesName);
		
		JLabel firstSLabel = new JLabel("Fisrt Sauce:");
		firstSLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		firstSLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		firstSLabel.setBounds(10, 88, 113, 22);
		contentPane.add(firstSLabel);
		
		fsCBB = new JComboBox();
		fsCBB.setModel(new DefaultComboBoxModel(new String[] {"Ketchup", "Mayonnaise", "Garlic Mayonnaise", "Hot Sauce"}));
		fsCBB.setBounds(133, 88, 148, 22);
		contentPane.add(fsCBB);
		
		JLabel secondSLabel = new JLabel("Second Sauce:");
		secondSLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		secondSLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		secondSLabel.setBounds(10, 148, 113, 22);
		contentPane.add(secondSLabel);
		
		ssCBB = new JComboBox();
		ssCBB.setModel(new DefaultComboBoxModel(new String[] {"Ketchup", "Mayonnaise", "Garlic Mayonnaise", "Hot Sauce"}));
		ssCBB.setBounds(133, 148, 148, 22);
		contentPane.add(ssCBB);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Size", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 207, 161, 207);
		contentPane.add(panel);
		panel.setLayout(null);
		
		smallBtn = new JRadioButton("Small        1$");
		smallBtn.setSelected(true);
		buttonGroup.add(smallBtn);
		smallBtn.setBounds(18, 36, 111, 23);
		panel.add(smallBtn);
		
		JRadioButton mediumBtn = new JRadioButton("Medium    1.9$");
		buttonGroup.add(mediumBtn);
		mediumBtn.setBounds(18, 96, 111, 23);
		panel.add(mediumBtn);
		
		JRadioButton bigBtn = new JRadioButton("Big           2.5$");
		buttonGroup.add(bigBtn);
		bigBtn.setBounds(18, 156, 111, 23);
		panel.add(bigBtn);
		
		JButton addBtn = new JButton("Add Sauce");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asf.setVisible(true);
				setVisible(false);
			}
		});
		addBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		addBtn.setBounds(181, 239, 127, 43);
		contentPane.add(addBtn);
		
		JButton completeBtn = new JButton("Back");
		completeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    String choice = "";
			    if(smallBtn.isSelected())
			    	choice = "Small Size";
			    else if (mediumBtn.isSelected())
			    	choice = "Medium Size";
			    else if(bigBtn.isSelected())
			    	choice = "Big Size";
			    adf.setFriesVaroiables(friesName.getSelectedItem().toString(), choice, fsCBB.getSelectedItem().toString(), ssCBB.getSelectedItem().toString());
				adf.whichFriesSelected(friesName.getSelectedItem().toString() , adf.getLabel());
			    adf.setVisible(true);
			    dispose();
			}
		});
		completeBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		completeBtn.setBounds(181, 335, 127, 43);
		contentPane.add(completeBtn);
		
		
	}
	
	public void setZeroPoint() {
		
		this.friesName.setSelectedItem("French Fries");
		this.fsCBB.setSelectedItem("Ketchup");
		this.ssCBB.setSelectedItem("Ketchup");
		this.smallBtn.setSelected(true);
		
	}

	public void setFriesName(JComboBox friesName) {
		this.friesName = friesName;
	}

	public void setFsCBB(JComboBox fsCBB) {
		this.fsCBB = fsCBB;
	}

	public void setSsCBB(JComboBox ssCBB) {
		this.ssCBB = ssCBB;
	}

	public void setSmallBtn(JRadioButton smallBtn) {
		this.smallBtn = smallBtn;
	}
	
	
	
}
