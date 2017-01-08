package finalProject;
/*
1.	No argument constructor
2.	Overloaded constructor that initializes the fields with the parameters
3.	Overloaded copy constructor that initializes the fields with a copy of another object’s fields
4.	A toString() method
 */
public class Sandwich extends Snack {

	// Data field
	private String length;
	
	// No args constructor
	public Sandwich(){
		this("Unknown", 0.0, 0, 0, "Unknown");
	}
	
	// Overloaded constructor that initializes
	public Sandwich(String name, double price, int quantity, int nutritionRating, String length){
		super(name, price, quantity, nutritionRating);
		this.length = length;
	}
	
	// Overloaded constructor that copies
	public Sandwich(Sandwich copy){
		Sandwich newSandwich = new Sandwich();
		name = newSandwich.name;
		price = newSandwich.price;
		quantity = newSandwich.quantity;
		nutritionRating = newSandwich.nutritionRating;
		length = newSandwich.length;
		// Cannot return in a constructor
	}
	
	// toString Method
	public String toString(){
		return length + " " + super.toString();
	}
	
	// Getter and Setter
	public String getLength(){
		return length;
	}
	public void setLength(String length){
		this.length = length;
	}
}
