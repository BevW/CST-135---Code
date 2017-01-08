package finalProject;
/*
1.	No argument constructor
2.	Overloaded constructor that initializes the fields with the parameters
3.	Overloaded copy constructor that initializes the fields with a copy of another object’s fields
4.	A toString() method
 */
public class Gum extends Snack {

	// Data field
	private int unitsPerPackage;
	
	// No args constructor
	public Gum(){
		this("Unknown", 0.0, 0, 0, 0);
	}
	
	// Overloaded constructor that initializes
	public Gum(String name, double price, int quantity, int nutritionRating, int unitsPerPackage){
		super(name, price, quantity, nutritionRating);
		this.unitsPerPackage = unitsPerPackage;
	}
	
	// Overloaded constructor that copies
	public Gum(Gum copy){
		Gum newGum = new Gum();
		name = newGum.name;
		price = newGum.price;
		quantity = newGum.quantity;
		nutritionRating = newGum.nutritionRating;
		unitsPerPackage = newGum.unitsPerPackage;
		// Cannot return in a constructor
	}
	
	// toString Method
	public String toString(){
		return super.toString() + "\nAmount in package: " + unitsPerPackage;
	}
	
	// Getter and Setter
	public int getUnitsPerPackage(){
		return unitsPerPackage;
	}
	public void setUnitsPerPackage(int unitsPerPackage){
		this.unitsPerPackage = unitsPerPackage;
	}
}
