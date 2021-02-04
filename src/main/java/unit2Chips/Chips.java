package unit2Chips;
/*
 * Noah Hobbs
 * 1/4/2021
 * CIS 175
 */
public class Chips {

	private String flavor;
	private int calories;
	private double price;
	private String type;
	// no arg constructor
	public Chips() {}
	//constructor with everything but calories
	public Chips(String flavor, double price, String type) {
		super();
		this.flavor = flavor;
		this.price = price;
		this.type = type;
		
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
