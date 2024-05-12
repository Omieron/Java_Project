package Is_aRelation;

import java.util.HashMap;


public class MeatBurger extends Hamburger{
	
	    private int grammage;
	    private String cookType;

	    public MeatBurger(String typeOfHam,String breadType, HashMap<String,Boolean> Ingredients, int grammage, String cookType, String bevName, Boolean ice, String Ftype, String fSize, String f1S, String f2S ,String [][] aSauce){
	    	
	    	super(typeOfHam,breadType,Ingredients, bevName, ice, Ftype, fSize, f1S, f2S, aSauce);
	    	this.grammage = grammage;
	    	this.cookType = cookType;
	    	
	    	
	    }

	    public String getName() {
	    	
	    	return "M E A T   B U R G E R";
	    	
	    }
	    
	    public int getGrammage() {
	        return grammage;
	    }

	    public void setGrammage(int grammage) {
	        this.grammage = grammage;
	    }

	    public String getCookType() {
	        return cookType;
	    }

	    public void setCookType(String cookType) {
	        this.cookType = cookType;
	    }
	    
	   @Override
	    public double addPrice() {
	    	
		   this.fries.addPrice();
		   
		   this.beverage.addPrice();
		   
	    	if(grammage == 80)
	    		
	    		 this.price = 10 + this.fries.getprice() + this.beverage.getPrice();
	    	
	    	else if (grammage == 100)
	    		
	    		 this.price = 11 + this.fries.getprice() + this.beverage.getPrice();
	    	
	    	else
	    		
	    		 this.price = 11.5 + this.fries.getprice() + this.beverage.getPrice();
	    	 
	    	return this.price;
	    	
	    }

	    @Override
	    public String toString() {
	        
	    	return "*****MEAT BURGER*****\n" + super.toString() + 
	                "\nGrammage: " + grammage +
	                "\nCooking Type: " + cookType + beverage.toString() + fries.toString() +
	                "\nTotal Price = " + this.price + "\n*********************************************************************************************************\n";
	    
	    }
	}
	
	


