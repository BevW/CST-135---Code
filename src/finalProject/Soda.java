package finalProject;
/*
1.	No argument constructor
2.	Overloaded constructor that initializes the fields with the parameters
3.	Overloaded copy constructor that initializes the fields with a copy of another object’s fields
4.	A toString() method
 */
public class Soda extends Drink {

	// Data fields
	private int caloriesPerServing;
	
	// No args constructor
	public Soda(){
		this("Unknown", 0.0, 0, 0.0, 0);
	}
	
	// Overloaded constructor that initializes
	public Soda(String name, double price, int quantity, double fluidOunces, int caloriesPerServing){
		super(name, price, quantity, fluidOunces);
		this.caloriesPerServing = caloriesPerServing;
	}
	
	// Overloaded constructor that copies
	public Soda(Soda copy){
		Soda newSoda = new Soda();
		name = newSoda.name;
		price = newSoda.price;
		quantity = newSoda.quantity;
		fluidOunces = newSoda.fluidOunces;
		// Cannot return in a constructor
	}
	
	// toString method
	public String toString(){
		return getCalorieGroup() + super.toString() + "\nCalories Per Serving: " + caloriesPerServing;
	}
	
	// Getters and setters
	public String getCalorieGroup(){
		if (caloriesPerServing == 0)
			return "Zero Calorie ";
		else if (caloriesPerServing > 0 && caloriesPerServing <= 80)
			return "Lite ";
		else if (caloriesPerServing > 80)
			return ""; // Returns nothing but wont give and error
		else
			return "Unknown or invalid entry";
	}
	public int getCaloriesPerServing(){
		return caloriesPerServing;
	}
	public void setCaloriesPerServing(int caloriesPerServing){
		this.caloriesPerServing = caloriesPerServing;
	}
}
