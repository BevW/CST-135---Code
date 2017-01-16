package finalProject;
/*
1.	No argument constructor
2.	Overloaded constructor that initializes the fields with the parameters
3.	Overloaded copy constructor that initializes the fields with a copy of another object’s fields
4.	A toString() method
 */
public class Chips extends Snack {

	// Data field
	private double weight;
	
	// No args constructor
	public Chips(){
		this("Unknown", 0.0, 0, 0, 0.0);
	}
	
	// Overloaded constructor that initializes
	public Chips(String name, double price, int quantity, int nutritionRating, double weight){
		super(name, price, quantity, nutritionRating);
		this.weight = weight;
	}
	
	// Overloaded constructor that copies
	public Chips(Chips copy){
		Chips newChips = new Chips();
		name = newChips.name;
		price = newChips.price;
		quantity = newChips.quantity;
		nutritionRating = newChips.nutritionRating;
		weight = newChips.weight;
		// Cannot return in a constructor
	}
	
	// toString Method
	public String toString(){
		return super.toString() + " " + "Weight: " + weight + " oz";
	}
	
	// Getter and Setter
	public double getWeight(){
		return weight;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
}
