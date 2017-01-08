package finalProject;
/*
1.	No argument constructor
2.	Overloaded constructor that initializes the fields with the parameters
3.	Overloaded copy constructor that initializes the fields with a copy of another object’s fields
4.	A toString() method
 */
public class Coffee extends Drink {

	// Data fields
	private double tempuratureDegrees;
	
	// No args constructor
	public Coffee(){
		this("Unknown", 0.0, 0, 0.0, 0.0);
	}
	
	// Overloaded constructor that initializes
	public Coffee(String name, double price, int quantity, double fluidOunces, double tempuratureDegrees){
		super(name, price, quantity, fluidOunces);
		this.tempuratureDegrees = tempuratureDegrees;
	}
	
	// Overloaded constructor that copies
	public Coffee(Coffee copy) {
		Coffee newCoffee = new Coffee();
		name = newCoffee.name;
		price = newCoffee.price;
		quantity = newCoffee.quantity;
		fluidOunces = newCoffee.fluidOunces;
		// Cannot return in a constructor
	}
	
	// toString method
	public String toString(){
		return super.toString() + String.format("\n" + getTempuratureDisplay() + ": %s degrees", tempuratureDegrees);
	}
	
	// Getters and Setters
	public String getTempuratureDisplay(){
		if (tempuratureDegrees > 25 && tempuratureDegrees <= 31)
			return "Frozen";
		else if (tempuratureDegrees > 31 && tempuratureDegrees <= 41)
			return "Cold";
		else if (tempuratureDegrees >= 130 && tempuratureDegrees <= 140)
			return "Warm, for kids the drink should be around 130.";
		else if (tempuratureDegrees >= 155 && tempuratureDegrees <= 190)
			return "Hot";
		else if (tempuratureDegrees > 190 && tempuratureDegrees < 212)
			return "Extra Hot!";
		else
			return "Unsafe tempurature for drinking beverages.";
	}
	public double getTempuratureDegrees(){
		return tempuratureDegrees;
	}
	public void setTempuratureDegrees(double tempuratureDegrees){
		this.tempuratureDegrees = tempuratureDegrees;
	}
}
