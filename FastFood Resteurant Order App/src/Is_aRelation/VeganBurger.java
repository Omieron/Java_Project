package Is_aRelation;

import java.util.HashMap;

public class VeganBurger extends Hamburger{

	 private String vegetableType;

	    public VeganBurger(String typeOfHam,String breadType, HashMap<String,Boolean> Ingredients, String vegiType, String bevName, Boolean ice, String Ftype, String fSize, String f1S, String f2S ,String [][] aSauce){
	    	
	    	super(typeOfHam,breadType,Ingredients, bevName, ice, Ftype, fSize, f1S, f2S, aSauce);
	    	this.vegetableType = vegiType;
	    	
	    }

        public String getName() {
	    	
	    	return "V E G A N   B U R G E R";
	    	
	    }

		public String getVegetableType() {
			return vegetableType;
		}

		@Override
	    public double addPrice() {
	     
			this.fries.addPrice();
			
			this.beverage.addPrice();
			
			this.price = 8 + this.fries.getprice() + this.beverage.getPrice();
	     
	     return this.price;
	     
	    }

	    @Override
	    public String toString() {
	        return "*****VEGAN BURGER*****\n" + super.toString() +
	        		"\nVegetable name: " + vegetableType + beverage.toString() + fries.toString() +
	        		"\nTotal Price = " + this.price + "\n*********************************************************************************************************\n";
	                
	    }
	
}
