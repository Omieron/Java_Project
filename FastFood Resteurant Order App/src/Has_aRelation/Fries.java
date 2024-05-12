package Has_aRelation;

import Interfaces.priceInterface;

public class Fries {
	
	private String friesType;
	
	private String friesSize;

	private AdditionalSauce sauce;
	
	private String firstSauce;
	
	private String secondSauce;
	
	private double price = 0;
	
	public Fries(String fT, String fS, String f1S, String f2S, String [][] aSauce) {
		
		this.friesType = fT;
		this.friesSize = fS;
		this.firstSauce = f1S;
		this.secondSauce = f2S;
		this.sauce = new AdditionalSauce(aSauce);

	}

	public double getprice() {
		
		return price;
		
	}

	public void addPrice() {  // this size prices come from priceInterface
		
		sauce.addPrice();
		
		if(friesSize.equalsIgnoreCase("Big Size"))
		
			price = priceInterface.bigSize + sauce.getPrice();
		
		else if(friesSize.equalsIgnoreCase("Medium Size"))
			
			price = priceInterface.mediumSize + sauce.getPrice();
		
		else
			
			price = priceInterface.smallSize + sauce.getPrice();
		
	}
	
	public String toString() {
			
		
		
		
			return(    "\nFries type: " + friesType + 
				       "\nFries size: " + friesSize +
				       "\nFirst Sauce: " + firstSauce +
				       "\nSecond Sauce: " + secondSauce +
				       "\n" + this.sauce.toString());
		
	}

}
