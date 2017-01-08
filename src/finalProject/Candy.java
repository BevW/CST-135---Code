package finalProject;
/*
1.	No argument constructor
2.	Overloaded constructor that initializes the fields with the parameters
3.	Overloaded copy constructor that initializes the fields with a copy of another object’s fields
4.	A toString() method
 */
public class Candy extends Snack {
	
	// Data fields
	// How many come in a package
	private int count;

	// No args constructor
	public Candy(){
		this("Unknown", 0.0, 0, 0, 0);
	}
	
	// Overloaded constructor that initializes
	public Candy(String name, double price, int quantity, int nutritionRating, int count){
		super(name, price, quantity, nutritionRating);
		this.count = count;
	}
	
	// Overloaded constructor that copies
	public Candy(Candy copy){
		Candy newCandy = new Candy();
		name = newCandy.name;
		price = newCandy.price;
		quantity = newCandy.quantity;
		nutritionRating = newCandy.nutritionRating;
		count = newCandy.count;
		// Cannot return in a constructor
	}
	
	// toString Method
	public String toString(){
		return super.toString() + "\n" + count + " Per Package";
	}
	
	// Getter and setter
	public int getCount(){
		return count;
	}
	public void setCount(int count){
		this.count = count;
	}
}