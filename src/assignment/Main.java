package assignment;

import java.util.List;

public class Main {
	
	
	public static void main(String args[]) {
		 
		  List<Food> list = Utility.readFoodFromCSV("foods.txt");
		  Breakfast breakfast =  new Breakfast(list);
		   
		  Utility.jaxbObjectToXML(breakfast);
	}
	
	
}
