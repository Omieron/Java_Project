package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

import MainandSystemClass.OrderSys;
import Has_aRelation.AdditionalSauce;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;


public class addFrame extends JFrame {
	private boolean flag = true;
	private JPanel contentPane;
	private JComboBox hmbrgTypeCBox;
	private JLabel friesImg;
	private JSpinner deneme = new JSpinner();
	private JTextArea txtrorder; 
	
	//BEVERAGES VARIABLES
	private String bevName = "Coca-Cola";
	private boolean ice;
	
	//FRIES VARIABLES
	private String ftype = "French Fries";
	private String fSize = "Small Size";
	private String f1S = "Ketchup";
	private String f2S = "Ketchup" ;
	private String [][] aSauce = new String[8][2];
	// Hamburger Images
	
	ImageIcon mbpng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\MeatBurger.png");
	ImageIcon cbpng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\ChickenBurger.png");
	ImageIcon vbpng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\VeganBurger.png");
	
	//Fries Images
	ImageIcon rfpng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\Fries\\fries.png");
	ImageIcon cfpng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\Fries\\curlyFries.png");
	ImageIcon mppng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\Fries\\mashedPatato.png");
	ImageIcon pwpng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\Fries\\patatoWedges.png");
	ImageIcon wfpng = new ImageIcon("C:\\Users\\asilo\\OneDrive\\Masaüstü\\TeamProject\\Images\\Fries\\waffleFries.png");

	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

    //Frames 
	addBeverageFrame abf = new addBeverageFrame(this);
	addFriesFrame aff = new addFriesFrame(this);
	Alert alrt;
	
	public JLabel getLabel() {
		
		return this.friesImg; 
		
	}

	public void whichFriesSelected(String type, JLabel frs) {
		
		if(type.equalsIgnoreCase("French Fries")) 
			frs.setIcon(rfpng);
		else if(type.equalsIgnoreCase("Curly Fries"))
			frs.setIcon(cfpng);
		else if(type.equalsIgnoreCase("Patato Wedges"))
			frs.setIcon(pwpng);
		else if(type.equalsIgnoreCase("Mashed Patato"))
			frs.setIcon(mppng);
		else
			frs.setIcon(wfpng);
				
	}
	
	public void setFlag() {
		
		this.flag = true;
		
	}
	
	public addFrame(SysFrame sysF) {
		
		alrt = new Alert(this, sysF);
		
		// for initilaizing
		deneme.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 893, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton bevBtn = new JButton("Beverage");
		bevBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abf.setVisible(true);
				setVisible(false);
			}
		});
		bevBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bevBtn.setBounds(622, 325, 115, 51);
		contentPane.add(bevBtn);
		
		JButton friesBtn = new JButton("Fries");
		friesBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aff.setVisible(true);
			    setVisible(false);
			}
		});
		friesBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		friesBtn.setBounds(751, 325, 115, 51);
		contentPane.add(friesBtn);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 2, 2, (Color) new Color(0, 0, 0)));
		panel.setBounds(622, 11, 244, 303);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 224, 281);
		panel.add(scrollPane);
		
		txtrorder = new JTextArea();
		scrollPane.setViewportView(txtrorder);
		txtrorder.setText("*****************ORDER*****************\r\n");
		txtrorder.setForeground(new Color(192, 192, 192));
		txtrorder.setBackground(new Color(0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Ingredients", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 212, 602, 237);
		contentPane.add(panel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setLayout(null);
		panel_4.setBounds(10, 21, 348, 205);
		panel_1.add(panel_4);
		
		JRadioButton lettuceRBtn = new JRadioButton("Lettuce");
		lettuceRBtn.setSelected(true);
		lettuceRBtn.setBounds(6, 17, 111, 23);
		panel_4.add(lettuceRBtn);
		
		JRadioButton tomatoRBtn = new JRadioButton("Tomato");
		tomatoRBtn.setBounds(6, 53, 111, 23);
		panel_4.add(tomatoRBtn);
		
		JRadioButton conionRBtn = new JRadioButton("Caramalized Onion");
		conionRBtn.setSelected(true);
		conionRBtn.setBounds(6, 88, 149, 23);
		panel_4.add(conionRBtn);
		
		JRadioButton pickleRBtn = new JRadioButton("Pickle");
		pickleRBtn.setSelected(true);
		pickleRBtn.setBounds(6, 123, 111, 23);
		panel_4.add(pickleRBtn);
		
		JRadioButton baconRBtn = new JRadioButton("Bacon");
		baconRBtn.setBounds(6, 160, 111, 23);
		panel_4.add(baconRBtn);
		
		JRadioButton cheeseRBtn = new JRadioButton("Cheese");
		cheeseRBtn.setBounds(177, 17, 111, 23);
		panel_4.add(cheeseRBtn);
		
		JRadioButton specialRBtn = new JRadioButton("Special Suace");
		specialRBtn.setBounds(177, 53, 111, 23);
		panel_4.add(specialRBtn);
		
		JRadioButton mustardRBtn = new JRadioButton("Mustard");
		mustardRBtn.setBounds(177, 88, 111, 23);
		panel_4.add(mustardRBtn);
		
		JRadioButton mayonnaiseRBtn = new JRadioButton("Mayonnaise");
		mayonnaiseRBtn.setSelected(true);
		mayonnaiseRBtn.setBounds(177, 123, 111, 23);
		panel_4.add(mayonnaiseRBtn);
		
		JRadioButton hotRBtn = new JRadioButton("Hot Sauce");
		hotRBtn.setBounds(177, 160, 111, 23);
		panel_4.add(hotRBtn);
		
		JPanel mbPanel = new JPanel();
		mbPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		mbPanel.setBounds(368, 21, 224, 205);
		panel_1.add(mbPanel);
		mbPanel.setLayout(null);
		
		JComboBox mbCBB = new JComboBox();
		mbCBB.setModel(new DefaultComboBoxModel(new String[] {"Medium rare", "Medium", "Medium well", "Well Done"}));
		mbCBB.setBounds(113, 35, 101, 22);
		mbPanel.add(mbCBB);
		
		JLabel mbLabel1 = new JLabel("Cooking degree:");
		mbLabel1.setFont(new Font("Tahoma", Font.BOLD, 11));
		mbLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
		mbLabel1.setBounds(2, 35, 101, 25);
		mbPanel.add(mbLabel1);
		
		JLabel mbLabel2 = new JLabel("Grammage");
		mbLabel2.setFont(new Font("Tahoma", Font.BOLD, 11));
		mbLabel2.setHorizontalAlignment(SwingConstants.LEFT);
		mbLabel2.setBounds(10, 78, 93, 22);
		mbPanel.add(mbLabel2);
		
		JRadioButton mbBtn1 = new JRadioButton("80");
		mbBtn1.setSelected(true);
		buttonGroup_1.add(mbBtn1);
		mbBtn1.setBounds(15, 107, 53, 23);
		mbPanel.add(mbBtn1);
		
		JRadioButton mbBtn2 = new JRadioButton("100");
		buttonGroup_1.add(mbBtn2);
		mbBtn2.setBounds(15, 134, 53, 23);
		mbPanel.add(mbBtn2);
		
		JRadioButton mbBtn3 = new JRadioButton("120");
		buttonGroup_1.add(mbBtn3);
		mbBtn3.setBounds(15, 160, 53, 23);
		mbPanel.add(mbBtn3);
		
		JLabel cbLabel1 = new JLabel("Cooking type:");
		cbLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		cbLabel1.setBounds(5, 35, 101, 25);
		mbPanel.add(cbLabel1);
		cbLabel1.setVisible(false);
		
		JComboBox cbBBB = new JComboBox();
		cbBBB.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBBB.setModel(new DefaultComboBoxModel(new String[] {"Traditional", "Crispy"}));
		cbBBB.setBounds(113, 35, 101, 22);
		mbPanel.add(cbBBB);
		
		JLabel vbLabel1 = new JLabel("Vegetable type:");
		vbLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
		vbLabel1.setBounds(5, 35, 101, 25);
		mbPanel.add(vbLabel1);
		vbLabel1.setVisible(false);
		
		JComboBox vbCBB = new JComboBox();
		vbCBB.setModel(new DefaultComboBoxModel(new String[] {"Patato", "Zucchini", "Eggplant"}));
		vbCBB.setBounds(113, 35, 101, 22);
		mbPanel.add(vbCBB);
		
		JLabel hmbrgP = new JLabel("");
		hmbrgP.setBounds(106, 84, 108, 110);
		mbPanel.add(hmbrgP);
		hmbrgP.setIcon(mbpng);
		vbCBB.setVisible(false);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(null, "Bread Type", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(382, 11, 230, 190);
		contentPane.add(panel_2);
		
		JRadioButton regularBreadBtn = new JRadioButton("Regular Bread");
		regularBreadBtn.setSelected(true);
		buttonGroup.add(regularBreadBtn);
		regularBreadBtn.setBounds(17, 44, 148, 23);
		panel_2.add(regularBreadBtn);
		
		JRadioButton wheatBreadBtn = new JRadioButton("Whole Wheat Bread");
		buttonGroup.add(wheatBreadBtn);
		wheatBreadBtn.setBounds(17, 95, 148, 23);
		panel_2.add(wheatBreadBtn);
		
		JRadioButton grainBreadBtn = new JRadioButton("Whole Grain Bread");
		buttonGroup.add(grainBreadBtn);
		grainBreadBtn.setBounds(17, 148, 148, 23);
		panel_2.add(grainBreadBtn);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "Hamburger Type", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 11, 362, 190);
		contentPane.add(panel_3);
		
		hmbrgTypeCBox = new JComboBox();
		hmbrgTypeCBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		hmbrgTypeCBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hmbrgTypeCBox.getSelectedItem().equals("Meat Burger")) {
					hmbrgP.setIcon(mbpng);
				    cbLabel1.setVisible(false);
				    cbBBB.setVisible(false);
				    mbCBB.setVisible(true);
				    mbLabel1.setVisible(true);
				    mbLabel2.setVisible(true);
				    mbBtn1.setVisible(true);
				    mbBtn2.setVisible(true);
				    mbBtn3.setVisible(true);
				    vbLabel1.setVisible(false);  
			        vbCBB.setVisible(false);
			        hmbrgP.setBounds(106, 84, 108, 110);
				}
				else if(hmbrgTypeCBox.getSelectedItem().equals("Chicken Burger")) {
					hmbrgP.setIcon(cbpng);
				    cbLabel1.setVisible(true);
				    cbBBB.setVisible(true);
				    mbCBB.setVisible(false);
				    mbLabel1.setVisible(false);
				    mbLabel2.setVisible(false);
				    mbBtn1.setVisible(false);
				    mbBtn2.setVisible(false);
				    mbBtn3.setVisible(false);
				    vbLabel1.setVisible(false);
			        vbCBB.setVisible(false);
			        hmbrgP.setBounds(61, 84, 108, 110);
				}
				else {
					hmbrgP.setIcon(vbpng);
			        vbLabel1.setVisible(true);
			        vbCBB.setVisible(true);
				    cbLabel1.setVisible(false);
				    cbBBB.setVisible(false);
				    mbCBB.setVisible(false);
				    mbLabel1.setVisible(false);
				    mbLabel2.setVisible(false);
				    mbBtn1.setVisible(false);
				    mbBtn2.setVisible(false);
				    mbBtn3.setVisible(false);
				    hmbrgP.setBounds(61, 84, 108, 110);
				
				}
				}
		});
		hmbrgTypeCBox.setModel(new DefaultComboBoxModel(new String[] {"Meat Burger", "Chicken Burger", "Vegan Burger"}));
		hmbrgTypeCBox.setBounds(184, 31, 160, 31);
		panel_3.add(hmbrgTypeCBox);
		
		JLabel hmbrgLbl = new JLabel("Hamburger Type:");
		hmbrgLbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		hmbrgLbl.setHorizontalAlignment(SwingConstants.CENTER);
		hmbrgLbl.setBounds(10, 25, 164, 37);
		panel_3.add(hmbrgLbl);
		
		friesImg = new JLabel("");
		whichFriesSelected(ftype ,friesImg);
		friesImg.setBounds(20, 73, 134, 106);
		panel_3.add(friesImg);
		
		JLabel bevLabel = new JLabel("");
		bevLabel.setBounds(210, 73, 134, 106);
		panel_3.add(bevLabel);
		
		JButton completeBtn = new JButton("Complete Order");
		completeBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		completeBtn.setBounds(622, 387, 244, 51);
		completeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					String output = "*****************ORDER******************\n";	
					String sau[][] = aff.asf.getSauce();
					HashMap<String,Boolean> ing = checkIng(lettuceRBtn, tomatoRBtn, conionRBtn, pickleRBtn, baconRBtn, cheeseRBtn, specialRBtn, mustardRBtn, mayonnaiseRBtn, hotRBtn);
					String iceOutput = "";
					if(ice == true)
						iceOutput = " with ice";
					if(hmbrgTypeCBox.getSelectedItem().equals("Meat Burger")) {
						String breadType = "Regular Bread", cookType = "Medium Rare";
						int grammage = 80;
				        if (mbBtn2.isSelected())
				        	grammage = 100;
				        else if (mbBtn1.isSelected())
				        	grammage = 80;
				        else
				        	grammage = 120;
				        if(wheatBreadBtn.isSelected())
				        	breadType = "Whole Wheat Bread";
				        else if(regularBreadBtn.isSelected())
				        	breadType = "Regular Bread";
				        else
				        	breadType = "Whole Grain Bread";
				        
				        cookType = mbCBB.getSelectedItem().toString();
				        
				        OrderSys.addOrder("Meat Burger", breadType, ing, cookType, grammage, null, null, bevName, ice, ftype, fSize, f1S, f2S, sau);
				        
				        txtrorder.setText(output + "Meat Burger\nBread Type => " + breadType + "\nCook type => " + cookType + "\nGrammage => " + grammage + "\n*-*-*-*-INGREDIENTS-*-*-*-*\n" + ingOutput(ing) + "-------------------------------------\nBeverage => " + bevName + iceOutput + "\nFries type => " + ftype + "\nFries Size => " + fSize + "\nFirst Sauce => " + f1S + "\nSecond Sauce => " + f2S + Sauceoutput(aff.asf.getSauce()));
						
					}
					
					else if(hmbrgTypeCBox.getSelectedItem().equals("Chicken Burger")){
						String breadType = "Regular Bread", meatType = "Traditional";
				        if(wheatBreadBtn.isSelected())
				        	breadType = "Whole Wheat Bread";
				        else if(regularBreadBtn.isSelected())
				        	breadType = "Regular Bread";
				        else
				        	breadType = "Whole Grain Bread";
						if(cbBBB.getSelectedItem().equals("Crispy"))
							meatType = "Crispy";
						OrderSys.addOrder("Chicken Burger", breadType, ing, null, 0, meatType, null, bevName, ice, ftype, fSize, f1S, f2S, sau);
						
						txtrorder.setText(output + "Chicken Burger\nBread Type => " + breadType + "\nMeat type => " + meatType + "\n" + "\n*-*-*-*-INGREDIENTS-*-*-*-*\n" + ingOutput(ing) + "------------------------------------\nBeverage => " + bevName + iceOutput + "\nFries type => " + ftype + "\nFries Size => " + fSize + "\nFirst Sauce => " + f1S + "\nSecond Sauce => " + f2S + Sauceoutput(aff.asf.getSauce()));
						
					}
					
					else {
						String vegiType = "Patato",  breadType = "Regular Bread";
				        if(wheatBreadBtn.isSelected())
				        	breadType = "Whole Wheat Bread";
				        else if(regularBreadBtn.isSelected())
				        	breadType = "Regular Bread";
				        else
				        	breadType = "Whole Grain Bread";
						if(vbCBB.getSelectedItem().equals("Zucchini"))
						    vegiType = "Zucchini";
						else if (vbCBB.getSelectedItem().equals("Patato"))
							vegiType = "Patato";
						else
							vegiType = "Eggplant";
						OrderSys.addOrder("Vegan Burger", breadType, ing, null, 0, null, vegiType, bevName, ice, ftype, fSize, f1S, f2S, sau);
						
						txtrorder.setText(output + "Vegan Burger\nBread Type => " + breadType  + "\nVegetable type => " + vegiType + "\n" + "\n*-*-*-*-INGREDIENTS-*-*-*-*\n" +ingOutput(ing) + "-------------------------------------\nBeverage => " + bevName + iceOutput + "\nFries type => " + ftype + "\nFries Size => " + fSize + "\nFirst Sauce => " + f1S + "\nSecond Sauce => " + f2S + Sauceoutput(aff.asf.getSauce()));
					}
						
					
					
					// INITIALIZING
					
					hmbrgTypeCBox.setSelectedItem("Meat Burger");
					regularBreadBtn.setSelected(true);
					lettuceRBtn.setSelected(true);
					tomatoRBtn.setSelected(false);
					conionRBtn.setSelected(true);
					pickleRBtn.setSelected(true);
					baconRBtn.setSelected(false);
					cheeseRBtn.setSelected(false);
					specialRBtn.setSelected(false);
					mustardRBtn.setSelected(false);
					mayonnaiseRBtn.setSelected(true);
					hotRBtn.setSelected(false);
					mbCBB.setSelectedItem("Medium Rare");
					mbBtn1.setSelected(true);
					cbBBB.setSelectedItem("Traditional");
					vbCBB.setSelectedItem("Patato");
					ftype = "French Fries";
					fSize = "Small Size";
					f1S = "Ketchup";
					f2S = "Ketchup" ;
					aff.asf.setZeroPSpin();
					aff.setZeroPoint();
			        abf.setZeroPoint();
			        whichFriesSelected(ftype ,friesImg);
					alrt.setVisible(true);
					flag = false;
				}
				
				else
					
					alrt.setVisible(true);
	
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(completeBtn);
	
	}
	

	
	public void setBevNameandIce(String name, boolean ice) {
		
		this.bevName = name;
		
		this.ice = ice;
		
	}
	
	public void setFriesVaroiables(String Ftype, String fSize, String f1S, String f2S) {
		
		this.ftype = Ftype;
		this.fSize = fSize;
		this.f1S = f1S;
		this.f2S = f2S;
		
	}
	
	public HashMap<String,Boolean> checkIng(JRadioButton lettuce, JRadioButton tomato, JRadioButton coinoin, JRadioButton pickle, JRadioButton bacon, JRadioButton cheese, JRadioButton special, JRadioButton mustard, JRadioButton mayo, JRadioButton hot) {
		
		HashMap<String, Boolean> ing = new HashMap<String,Boolean>();
		
		//LETTUCE RADIO BUTTON
		
		if(lettuce.isSelected())
			ing.put("Lettuce", true);
		else
			ing.put("lettuce", false);
		
		//TOMATO RADIO BUTTON
		
		if(tomato.isSelected())
			ing.put("Tomato", true);
		else
			ing.put("Tomato", false);
		
		//CARAMELIZED ONION RADIO BUTTON
		
		if(coinoin.isSelected())
			ing.put("Caramalized Onion", true);
		else
			ing.put("Caramalized Onion", false);
		
		//PICKLE RADIO BUTTON
		
		if(pickle.isSelected())
			ing.put("Pickle", true);
		else
			ing.put("Pickle", false);
		
		//BACON RADIO BUTTON
		
		if(bacon.isSelected())
			ing.put("Bacon", true);
		else
			ing.put("Bacon", false);
		
		//CHEESE RADIO BUTTON
		
		if(cheese.isSelected())
			ing.put("Cheese", true);
		else
			ing.put("Cheese", false);
		
		//SPECIAL SAUCE RADIO BUTTON
		
		if(special.isSelected())
			ing.put("Special Sauce", true);
		else
			ing.put("Special Sauce", false);
		
		//MUSTARD RADIO BUTTON
		
		if(mustard.isSelected())
			ing.put("Mustard", true);
		else
			ing.put("Mustard", false);
		
		//MAYONNAISE RADIO BUTTON
		
		if(mayo.isSelected())
			ing.put("Mayonnaise", true);
		else
			ing.put("Mayonnaise", false);
		
		//HOT SAUCE RADIO BUTTON
		
		if(hot.isSelected())
			ing.put("Hot Sauce", true);
		else
			ing.put("Hot Sauce", false);
		
		return ing;
			
	}
	
     public String Sauceoutput(String [][] aSauce) {
		
		String output = "";
		
		int flag = 0;
		
		   for(int i = 0; i < aSauce.length; i++) {
			
			if(!(aSauce[i][1].equalsIgnoreCase("0"))) {
			
				flag = 1;
				
				output += aSauce[i][0] + " -> " + aSauce[i][1] + "\n";
				
				}
		}
		if(flag == 1)
		
		   return "\nAdditional Sauces\n------------------------\n" + output;
	
		else
			
			return "";
		
	}
	
	public void setTxtrorder() {
		this.txtrorder.setText("*****************ORDER******************\\n\"");;
	}
	
	public static String ingOutput(HashMap<String, Boolean> ing) {
        StringBuilder trueIngredients = new StringBuilder();

        for (Map.Entry<String, Boolean> entry : ing.entrySet()) {
            if (entry.getValue()) {
                trueIngredients.append(entry.getKey()).append("\n");
            }
        }

        return trueIngredients.toString();
    }
	
}
