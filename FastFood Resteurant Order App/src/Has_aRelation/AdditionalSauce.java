package Has_aRelation;

public class AdditionalSauce {
	
	private String[][] addSauces; 
	
	private double price = 0;
	
	public AdditionalSauce(String [][] aSauce) {
		
		this.addSauces = aSauce;
		
	}
	
	public String[][] getAddSauces() {
		
		return addSauces;
	
	}


	public double getPrice() { return price;}
	
	public void addPrice() {
		
		for(String[] arr : addSauces) {
			
			if(arr[1].equalsIgnoreCase("0") == false)
				
				price += 0.5;
			
		}
		
	}

	public String toString() {
	
        String output = "";
		
		int flag = 0;
		
		for(int i = 0; i < addSauces.length; i++) {
			
			if(!(addSauces[i][1].equalsIgnoreCase("0"))) {
			
				flag = 1;
				
				output += addSauces[i][0] + " -> " + addSauces[i][1] + "\n";
				
			}	
		}
		
		if(flag == 1)
		
		   return "\nAdditional Sauces\n------------------------\n" + output;
	
		else
			
			return "";
		  
			
	}

}
