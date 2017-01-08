package finalProject;
/*
1.	No argument constructor
2.	Overloaded constructor that initializes the fields with the parameters
3.	Overloaded copy constructor that initializes the fields with a copy of another object’s fields
4.	A toString() method
 */
public class Juice extends Drink {

	// Data field
	// To tell between fruit juice, smoothie, or tea
	private String type;
	
	// No args constructor
	public Juice(){
		this("Unknown", 0.0, 0, 0.0, "Unknown");
	}
	
	// Overloaded constructor that initializes
	public Juice(String name, double price, int quantity, double fluidOunces, String type){
		super(name, price, quantity, fluidOunces);
		this.type = type;
	}
	
	// Overloaded constructor that copies
	public Juice(Juice copy) {
		Juice newJuice = new Juice();
		name = newJuice.name;
		price = newJuice.price;
		quantity = newJuice.quantity;
		type = newJuice.type;
		// Cannot return in a constructor
	}
	
	// toString method
	public String toString(){
		return type + "\n" + super.toString();
	}
	
	// method to determine type
	public void setType(String type){
		if (type.compareTo("Smoothie") == 0)
			this.type = type;
		else if (type.compareTo("Fruit Juice") == 0)
			this.type = type;
		else if (type.compareTo("Tea") == 0)
			this.type = type;
		else
			this.type = "That is not a valid entry";
	}
	
	
}
