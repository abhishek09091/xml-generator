package assignment;

import javax.xml.bind.annotation.XmlElement;


public class Food{

	private String name;
	private String description;
	private Integer calories;
	private String price;
	
	public Food(String name, String description, Integer calories, String price) {
		super();
		this.name = name;
		this.description = description;
		this.calories = calories;
		this.price = price;
	}
	
	

	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getCalories() {
		return calories;
	}
	
	@XmlElement
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	
	public String getPrice() {
		return price;
	}
	
	@XmlElement
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
