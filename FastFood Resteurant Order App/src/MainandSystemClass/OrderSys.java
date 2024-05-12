package MainandSystemClass;

import java.util.ArrayList;
import java.util.HashMap;
import Is_aRelation.ChickenBurger;
import Is_aRelation.Hamburger;
import Is_aRelation.MeatBurger;
import Is_aRelation.VeganBurger;



public class OrderSys {
	
	private static ArrayList<Hamburger> hmbrg = new ArrayList<Hamburger>();
	
	public static void addOrder(String typeOfHam,String breadType, HashMap<String,Boolean> Ingredients, String cookType, int grammage, String meatType,  String vegiType, String bevName, Boolean ice, String Ftype, String fSize, String f1S, String f2S ,String [][] aSauce) {

		if(typeOfHam.equalsIgnoreCase("Meat Burger"))
			hmbrg.add(new MeatBurger(typeOfHam, breadType, Ingredients, grammage, cookType, bevName, ice, Ftype, fSize, f1S, f2S, aSauce));
		
		else if(typeOfHam.equalsIgnoreCase("Chicken Burger"))
			hmbrg.add(new ChickenBurger(typeOfHam, breadType, Ingredients, meatType, bevName, ice, Ftype, fSize, f1S, f2S, aSauce));
		
		else
			hmbrg.add(new VeganBurger(typeOfHam, breadType, Ingredients, vegiType, bevName, ice, Ftype, fSize, f1S, f2S, aSauce));

		
	}
	
	public static boolean removeOrder(int order) {
		
		boolean delete = false;
		
		for(Hamburger arr : hmbrg) {
			
			if(arr.checkOrderNo(order)) {
				
				delete = true;
				
				hmbrg.remove(arr);
				
				break;
			}
				
		}
		
		return delete;
		
	}
	
	public static String displayOrders() {
		
		String output = "";
		
		if(hmbrg != null) {
		
			for(int x = 0; x < hmbrg.size(); x++) {
				
				output += hmbrg.get(x).toString() + "\n";
				
			}
		}
		
		else
			
			output = "There is no order here";
		
		return output;
		
	}
	
	public static Hamburger searchOrder(int orderno) {
		
		Hamburger temp = null;
		
		for(Hamburger arr: hmbrg) {
			
			if(arr.checkOrderNo(orderno))
				 
				temp = arr; 
			
		}
		
		return temp;
		
	}
	
	public static void calculatePrice() {
		
		for(Hamburger arr: hmbrg) {
			
			if(arr instanceof MeatBurger) 
			    	
			    arr.setPrice(arr.addPrice());
			
			else if (arr instanceof ChickenBurger) {
				
				arr.setPrice(arr.addPrice());
				
			}
				
			else if (arr instanceof VeganBurger) {
				
				arr.setPrice(arr.addPrice());
					
			}
		}
		
	}
	
	public static String getAllOrderNo() {
		
		String output = "bos", type = "";
		
		int x, flag = 0;
			
		for(x = 0; x < hmbrg.size(); x++) {
			
			 if (hmbrg.get(x) instanceof MeatBurger) {
	                 type = ((MeatBurger) hmbrg.get(x)).getName();
	               
	            }
			 else if (hmbrg.get(x) instanceof ChickenBurger) {
	                 type = ((ChickenBurger) hmbrg.get(x)).getName();
	               
	            }
			 else if (hmbrg.get(x) instanceof VeganBurger) {
	                 type = ((VeganBurger) hmbrg.get(x)).getName();
	               
	            }
			
			if(flag == 0)
			
				output = "*********************************************O R D E R S*********************************************\n";			
			
			output += (x+1) +  "-) " + hmbrg.get(x).getOrderNo() + "  " +  type + "\n";
			
			flag = 1;

		}
		
		return output; 
		
	}
}
