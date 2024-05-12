package Is_aRelation;

import java.util.HashMap;


public class ChickenBurger extends Hamburger{
	
	    private String meatType;

	    public ChickenBurger(String typeOfHam,String breadType, HashMap<String,Boolean> Ingredients, String meatType, String bevName, Boolean ice, String Ftype, String fSize, String f1S, String f2S ,String [][] aSauce){
	    	
	    	super(typeOfHam,breadType,Ingredients,bevName, ice, Ftype, fSize, f1S, f2S, aSauce);
	    	this.meatType = meatType;
	    	
	    }

        public String getName() {
	    	
	    	return "C H I C K E N   B U R G E R";
	    	
	    }
	    
	    public String getMeatType() {
			return meatType;
		}
	    
		@Override
	    public double addPrice() {
	    	
		   this.price = super.addPrice();
		   
		   fries.addPrice();
	    	
	       beverage.addPrice();
			
	       if(meatType.equalsIgnoreCase("Crispy"))
	    	   
	    	   this.price = 8 + fries.getprice() + + beverage.getPrice();
	       
	       else
	    	   
	    	   this.price = 9 + fries.getprice() + + beverage.getPrice();
  
	       return this.price;
	       
	    }

	    @Override
	    public String toString() {
	        return "*****CHICKEN BURGER*****\n" + super.toString() +
	        		"\nChicken type: " + meatType + beverage.toString() + fries.toString() +
	        		"\nTotal Price = " + this.price + "\n*********************************************************************************************************\n";
	                
	    }
	}
	
	


