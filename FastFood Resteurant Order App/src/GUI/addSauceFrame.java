package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addSauceFrame extends JFrame {

	private JPanel contentPane;
	private JSpinner ketSpin;
	private JSpinner mayoSpin;
	private JSpinner gmayoSpin;
	private JSpinner hsauSpin;
	private JSpinner bufSpin;
	private JSpinner bbqSpin;
	private JSpinner ranSpin;
	private JSpinner hmusSpin;
	

	private String [][] Sauce = {{"Ketchup", "0"},{"Mayonnaise","0"},{"Garlic Mayonnaise","0"},{"Hot Sauce","0"},{"Buffalo","0"},{"Barbeque","0"},{"Ranch","0"},{"Honey Mustard","0"}};

	/**
	 * Create the frame.
	 */
	
	public addSauceFrame(addFrame adf ,addFriesFrame aff) {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ketSpin = new JSpinner();
		ketSpin.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		ketSpin.setBounds(210, 42, 45, 20);
		contentPane.add(ketSpin);
		
		mayoSpin = new JSpinner();
		mayoSpin.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		mayoSpin.setBounds(210, 103, 45, 20);
		contentPane.add(mayoSpin);
		
		gmayoSpin = new JSpinner();
		gmayoSpin.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		gmayoSpin.setBounds(210, 168, 45, 20);
		contentPane.add(gmayoSpin);
		
		hsauSpin = new JSpinner();
		hsauSpin.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		hsauSpin.setBounds(210, 232, 45, 20);
		contentPane.add(hsauSpin);
		
		bufSpin = new JSpinner();
		bufSpin.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		bufSpin.setBounds(492, 42, 45, 20);
		contentPane.add(bufSpin);
		
		bbqSpin = new JSpinner();
		bbqSpin.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		bbqSpin.setBounds(492, 103, 45, 20);
		contentPane.add(bbqSpin);
		
		ranSpin = new JSpinner();
		ranSpin.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		ranSpin.setBounds(492, 168, 45, 20);
		contentPane.add(ranSpin);
		
		hmusSpin = new JSpinner();
		hmusSpin.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		hmusSpin.setBounds(492, 232, 45, 20);
		contentPane.add(hmusSpin);
		
		JLabel lblNewLabel = new JLabel("+0.5$ for each");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(225, 290, 111, 23);
		contentPane.add(lblNewLabel);
		
		JButton backBtn = new JButton("Add Sauce");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setZero();
				Sauce[0][1] = ketSpin.getValue().toString();
				Sauce[1][1] = mayoSpin.getValue().toString();
				Sauce[2][1] = gmayoSpin.getValue().toString();
				Sauce[3][1] = hsauSpin.getValue().toString();
				Sauce[4][1] = bufSpin.getValue().toString();
				Sauce[5][1] = bbqSpin.getValue().toString();
				Sauce[6][1] = ranSpin.getValue().toString();
				Sauce[7][1] = hmusSpin.getValue().toString();
				aff.setVisible(true);
				dispose();
			}
		});
		backBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		backBtn.setBounds(210, 324, 137, 41);
		contentPane.add(backBtn);
		
		JLabel ketLabel = new JLabel("Ketchup");
		ketLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		ketLabel.setBounds(23, 41, 153, 23);
		contentPane.add(ketLabel);
		
		JLabel mayoLabel = new JLabel("Mayonnaise");
		mayoLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		mayoLabel.setBounds(23, 106, 153, 23);
		contentPane.add(mayoLabel);
		
		JLabel gmayoLabel = new JLabel("Garlic Mayonnaise");
		gmayoLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		gmayoLabel.setBounds(23, 171, 177, 23);
		contentPane.add(gmayoLabel);
		
		JLabel hSauceLabel = new JLabel("Hot Sauce");
		hSauceLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		hSauceLabel.setBounds(23, 231, 153, 23);
		contentPane.add(hSauceLabel);
		
		JLabel hmustardLabel = new JLabel("Honey Mustard");
		hmustardLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		hmustardLabel.setBounds(298, 231, 153, 23);
		contentPane.add(hmustardLabel);
		
		JLabel ranLabel = new JLabel("Ranch");
		ranLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		ranLabel.setBounds(298, 171, 153, 23);
		contentPane.add(ranLabel);
		
		JLabel bbqLabel = new JLabel("Barbeque");
		bbqLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		bbqLabel.setBounds(298, 106, 153, 23);
		contentPane.add(bbqLabel);
		
		JLabel bufLabel = new JLabel("Buffalo");
		bufLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		bufLabel.setBounds(298, 45, 153, 23);
		contentPane.add(bufLabel);
		
	}
	
	

	public String[][] getSauce() {
		return Sauce;
	}

	public void setZeroPSpin() {
		
		ketSpin.setValue(0);
	    mayoSpin.setValue(0);
	    gmayoSpin.setValue(0);
	    hsauSpin.setValue(0);
	    bufSpin.setValue(0);
	    bbqSpin.setValue(0);
	    ranSpin.setValue(0);
	    hmusSpin.setValue(0);
	}
	
    public void setZero() {
    	
    	for(int x = 0; x<Sauce.length; x++)
    		Sauce[x][1] = "0";
    	
    }

	
}