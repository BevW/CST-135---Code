package finalProject;
/*
1.	No argument constructor
2.	Overloaded constructor that initializes the fields with the parameters
3.	Overloaded copy constructor that initializes the fields with a copy of another object’s fields
4.	A toString() method
 */

// I chose to use <Product> so that all of Products's subclasses could be compared 
// against one another.
public abstract class Drink extends Product implements Comparable<Product>{

	final int AVAILABLE_DRINK_SPACE = 500;
	double fluidOunces;
	
	// No args constructor
	public Drink(){
		this("Unknown", 0.0, 0, 0.0);
	}
	
	// Overloaded constructor that initializes
	public Drink(String name, double price, int quantity, double ounces){
		super(name, price, quantity);
		this.fluidOunces = ounces;
	}
	
	// Overloaded constructor that copies
	/* I do not know how to make a copy in an abstract class or why we need to
	public Drink(Drink copy) {
		Drink newDrink;
		name = newDrink.name;
		price = newDrink.price;
		quantity = newDrink.quantity;
		size = newDrink.size;
		ounces = newDrink.ounces;
	}*/
	
	// toString method
	public String toString(){
		return super.toString() + String.format("\n" + getSize() + ": %s oz.", fluidOunces);
	}
	
	// Getters and Setters
	public String getSize() {
		if (fluidOunces <= 8)
			return "Small";
		else if (fluidOunces > 8 && fluidOunces <= 16)
			return "Medium";
		else if (fluidOunces > 16 && fluidOunces <= 32)
			return "Large";
		else
			return "It is an invalid size.";
	}
	public double getOunces(){
		return fluidOunces;
	}
	public void setOunces(double ounces){
		this.fluidOunces = ounces;
	}
	
	// This first compares the names, then if the names are equal it compares the price.
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
