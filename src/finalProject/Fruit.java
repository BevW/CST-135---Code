package finalProject;
/*
1.	No argument constructor
2.	Overloaded constructor that initializes the fields with the parameters
3.	Overloaded copy constructor that initializes the fields with a copy of another object’s fields
4.	A toString() method
 */
public class Fruit extends Snack {

	// Data field
	// Tells if the fruit is a cut and in a cup
	// or a whole fruit
	private String fruitCupOrWhole;
	
	// No args constructor
	public Fruit(){
		this("Unknown", 0.0, 0, 0, "Unknown");
	}
	
	// Overloaded constructor that initializes
	public Fruit(String name, double price, int quantity, int nutritionRating, String fruitCupOrWhole){
		super(name, price, quantity, nutritionRating);
		this.fruitCupOrWhole = fruitCupOrWhole;
	}
	
	// Overloaded constructor that copies
	public Fruit(Fruit copy){
		Fruit newFruit = new Fruit();
		name = newFruit.name;
		price = newFruit.price;
		quantity = newFruit.quantity;
		nutritionRating = newFruit.nutritionRating;
		fruitCupOrWhole = newFruit.fruitCupOrWhole;
		// Cannot return in a constructor
	}
	
	// toString Method
	public String toString(){
		return fruitCupOrWhole + " " + name + "\nNutritional Rating: " + nutritionRating + "\nPrice: " + price + "\nQuantity: " + quantity;
	}
	
	// Getter and Setter
	public String getFruitCupOrWhole(){
		if (fruitCupOrWhole.compareTo("Fruit Cup") == 0)
			return "Fruit Cup";
		if (fruitCupOrWhole.compareTo("Whole Fruit") == 0)
			return "Whole Fruit";
		if (fruitCupOrWhole.compareTo("Fruit Dip") == 0)
			return "Fruit Dip";
		else
			return "Must be a Whole Fruit, Fruit Cup, or Fruit Dip";
	}
	public void setFruitCupOrWhole(String fruitCupOrWhole){
		this.fruitCupOrWhole = fruitCupOrWhole;
	}
}
