package finalProject;
/*
1.	No argument constructor
2.	Overloaded constructor that initializes the fields with the parameters
3.	Overloaded copy constructor that initializes the fields with a copy of another object’s fields
4.	A toString() method
 */

// I chose to use <Product> so that all of Products's subclasses could be compared 
// against one another.
public abstract class Snack extends Product implements Comparable<Product>{

	// Data field
	final int AVAILAVBLE_SNACK_SPACE = 500;
	// Integer between 1 and 100, 1 being very unhealthy and 
	// 100 by very healthy. Used to help people make healthy choices
	int nutritionRating;
	
	
	
	// No args constructor
	public Snack(){
		this("Unknown", 0.0, 0, 0);
	}
	
	// Overloaded constructor that initializes
	public Snack(String name, double price, int quantity, int nutritionRating){
		super(name, price, quantity);
		this.nutritionRating = nutritionRating;
	}
	
	// Overloaded constructor that copies
	/* I do not know how to make a copy in an abstract class or why we need to
	public Snack(Snack copy) {
		Snack newSnack;
		newSnack.name = name;
		newSnack.price = price;
		newSnack.quantity = quantity;
	}*/
	
	// toString method
	public String toString(){
		return name + " Nutritional Rating: " + nutritionRating + " Price: " + price + " Quantity: " + quantity;
	}
	
	// Setter and getter
	public int getNutritionRating(){
		return nutritionRating;
	}
	public void setNutritonRating(int nutritionRating){
		if (nutritionRating >= 1 && nutritionRating <= 100)
			this.nutritionRating = nutritionRating;
		else
			this.nutritionRating = 0; // 0 rating means it is unknown
	}
	
	// This first compares the names and then compare the price.
	public int compareTo(Product o) {
		if (getName().compareToIgnoreCase(o.getName()) < 0)
			return -1;
		else if (getName().compareToIgnoreCase(o.getName()) == 0){
			if (getPrice() > o.getPrice())
				return 1;
			else if(getPrice() < o.getPrice())
				return -1;
			else
				return 0;	
		}
		else
			return 1;
	}
}
