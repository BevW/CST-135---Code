package finalProject;
/*
1.	No argument constructor
2.	Overloaded constructor that initializes the fields with the parameters
3.	Overloaded copy constructor that initializes the fields with a copy of another object’s fields
4.	A toString() method
 */
public abstract class Product {

	// Data fields
	String name;
	double price;
	int quantity;
	
	// No args constructor
	Product(){
		this("Unknown", 0.0, 0);
	}

	// Overloaded constructor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Overloaded constructor that copies
	/* I do not know how to make a copy in an abstract class or why we need to
	public Product(Product copy) {
		Product newProduct;
		newProduct.name = name;
		newProduct.price = price;
		newProduct.quantity = quantity;
	}*/
	
	// To string
	public String toString(){
		return name + "\nPrice: " + price + "\nAvailable to Purchase: " + quantity;
	}
	
	// Getters and Setters
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	public int getQuantity(){
		// Will need to somehow calculate
		return quantity;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
}
