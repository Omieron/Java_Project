package Is_aRelation;
import java.util.HashMap;
import java.util.Map;
import Has_aRelation.Fries;
import Interfaces.priceInterface;
import Has_aRelation.Beverages;

public abstract class Hamburger implements priceInterface{
	
	 protected static int InitialNo = 100;
	    protected String breadType;
	    protected Beverages beverage;
	    protected Fries fries;
	    protected HashMap<String,Boolean> Ingredients = new HashMap<String,Boolean>();
	    protected int orderNo;
	    protected double price = 0;
	    

	    public Hamburger(String typeOfHam,String breadType, HashMap<String,Boolean> Ingredients, String bevName, Boolean ice, String Ftype, String fSize, String f1S, String f2S ,String [][] aSauce){
	        this.breadType = breadType;
	        this.Ingredients = Ingredients;
	    	this.beverage = new Beverages(bevName, ice);
	    	this.fries = new Fries(Ftype, fSize, f1S, f2S, aSauce);
	        orderNo = InitialNo;
	    	InitialNo++;
	    }

	    public int getOrderNo() {
	    	
	    	return this.orderNo; 
	    	
	    }
	    
	    public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		
		public HashMap<String, Boolean> getIngredients() {
			return Ingredients;
		}


		public void setIngredients(HashMap<String, Boolean> ingredients) {
			Ingredients = ingredients;
		}

	    public double addPrice() {
	    	
	    	return price;
	    	
	    }
	    
	   
	    public boolean checkOrderNo(int orderNo){
	        if(this.orderNo == orderNo)
	            return true;
	        return false;
	    }
	    
	    

	    public Beverages getBeverage() {
			
	    	return beverage;
		
	    }


		public void setBeverage(String name, boolean ice) {
			
			this.beverage = new Beverages(name, ice);
			
		}


		public Fries getFries() {
			return fries;
		}


		public void setFries(Fries fries) {
			this.fries = fries;
		}
		

		@Override
	    public String toString() {
	    	
			return "Order no = " + orderNo +
	                "\nBread Type: " + breadType +
	                "\n*-*-*-*-INGREDIENTS-*-*-*-*\n" + ingOutput(Ingredients) + "<----------------------------------->";               
	    
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
