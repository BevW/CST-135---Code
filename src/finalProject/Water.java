package finalProject;
/*
1.	No argument constructor
2.	Overloaded constructor that initializes the fields with the parameters
3.	Overloaded copy constructor that initializes the fields with a copy of another object’s fields
4.	A toString() method
 */
public class Water extends Drink {

	// Data fields
	// To enter the flavor of drink(ex: strawberry, orange, etc)
	private String flavored;
	
	// No args constructor
	public Water(){
		this("Unknown", 0.0, 0, 0.0, "Unknown");
	}
	
	// Overloaded constructor that initializes
	public Water(String name, double price, int quantity, double fluidOunces, String flavored){
		super(name, price, quantity, fluidOunces);
		this.flavored = flavored;
	}
	
	// Overloaded constructor that copies
	public Water(Water cope){
		Water newWater = new Water();
		name = newWater.name;
		price = newWater.price;
		quantity = newWater.quantity;
		fluidOunces = newWater.fluidOunces;
		// Cannot return in a constructor
	}
	
	// toString method
	public String toString(){
		return getFlavored() + " " + super.toString();
	}
	
	// getters and setters
	public String getFlavored(){
		return flavored;
	}
	public void setFlavored(String flavored){
		this.flavored = flavored;
	}
}
