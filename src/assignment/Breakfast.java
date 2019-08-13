package assignment;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "breakfast_menu")
public class Breakfast {
	
	private List<Food> food;
	
	public Breakfast() {
		super();
	}

	public Breakfast(List<Food> food) {
		super();
		this.food = food;
	}

	public List<Food> getFood() {
		return food;
	}

	public void setFood(List<Food> food) {
		this.food = food;
	}
	
	
}
