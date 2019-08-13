package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Utility {
	
public static List<Food> readFoodFromCSV(String filename){
		
		List<Food> breakfastList = new ArrayList<Food>();
		
		Path pathToFile = Paths.get(filename);
		
		try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            // read the first line from the text file
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");

                Food food = includeFood(attributes);

                // adding book into ArrayList
                breakfastList.add(food);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
		
		return breakfastList;
	}
	
	
	 public static void jaxbObjectToXML(Breakfast list){
	        try {
	        	
	            JAXBContext jaxbContext = JAXBContext.newInstance(Breakfast.class);
	            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	 
	            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML
	 
	            //Print XML String to Console
	            jaxbMarshaller.marshal(list, System.out);
	            
	        }catch(JAXBException e){
	            e.printStackTrace();
	        }
	    }

	 private static Food includeFood(String [] attributes) {
			
			String name = attributes[0];
			String description = attributes[1];
			Integer calories = Integer.parseInt(attributes[3]);
			String price = attributes[2] ;
			
			return new Food(name,description,calories,price);
		}
}
