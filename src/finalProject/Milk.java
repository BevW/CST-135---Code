package finalProject;
/*
1.	No argument constructor
2.	Overloaded constructor that initializes the fields with the parameters
3.	Overloaded copy constructor that initializes the fields with a copy of another object’s fields
4.	A toString() method
 */
public class Milk extends Drink {

	// Data field
	private int percentage;
	
	// No args constructor
	public Milk(){
		this("Unknown", 0.0, 0, 0.0, 0);
	}
	
	// Overloaded constructor that initializes
	public Milk(String name, double price, int quantity, double fluidOunces, int percentage){
		super(name, price, quantity, fluidOunces);
		this.percentage = percentage;
	}
	
	// Overloaded constructor that copies
	public Milk(Milk copy){
		Milk newMilk = new Milk();
		name = newMilk.name;
		price = newMilk.price;
		quantity = newMilk.quantity;
		fluidOunces = newMilk.fluidOunces;
		// Cannot return in a constructor
	}
	
	// toString Method
	public String toString(){
		return name + " " + percentage + "%" + "\nPrice: " + price + "\nAvailable to Purchase: " + 
				quantity + "\n" + getSize() + ": " + fluidOunces + " oz.";
	}
	
	// Setter and getter
	public int getPercentage(){
		return percentage;
	}
	public void setPercentage(int percentage){
		this.percentage = percentage;
	}
}
