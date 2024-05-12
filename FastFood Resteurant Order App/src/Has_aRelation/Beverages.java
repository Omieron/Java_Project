package Has_aRelation;

public class Beverages {
	
	private String typeOfBeverages;
	private Boolean ice;
	private double price = 0;
	
	public Beverages(String typeOfBeverages, boolean ice) {
		
		this.typeOfBeverages = typeOfBeverages;
		this.ice = ice;
		
	}
	
	public double getPrice() { return this.price;}
	
	public void addPrice() {
		
		price = 1;
		
	}

	public String toString() {
		
		if(ice == false)
		 return ("\nBeverage: " + typeOfBeverages);
		else
			return ("\nBeverage: " + typeOfBeverages + " with ice");	
		
	}

}
