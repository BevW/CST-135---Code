package finalProject;
/*
import javax.swing.ListModel;

public class AClassForTrialCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Drinks
		// Coffee objects
		Coffee coffee1 = new Coffee("Starbucks Frapachino: Mocha", 4.25, 3, 14, 40);
		Coffee coffee2 = new Coffee("Starbucks Frapachino: Vanilla", 4.25, 5, 14, 40);
		Coffee coffee3 = new Coffee("Starbucks Frapachino: Smores", 4.25, 1, 14, 40);
		Coffee coffee4 = new Coffee("Dunkin Donuts Iced Coffee: Pumpkin Spice", 3.15, 5, 18, 40);
		Coffee coffee5 = new Coffee("Dunkin Donuts Cold Brew: Sweeetened", 2.25, 1, 18, 40);
		Coffee coffee6 = new Coffee("Dunkin Donuts Iced Latte: Vanilla", 4.00, 2, 14, 40);
		Coffee coffee7 = new Coffee("Starbucks Latte: Vanilla", 4.50, 2, 14, 155);
		Coffee coffee8 = new Coffee("Starbucks Latte: Caramel", 4.50, 1, 14, 155);
		Coffee coffee9 = new Coffee("Dunkin Donuts Capacchino: Vanilla", 4.50, 1, 18, 160);
		Coffee coffee10 = new Coffee("Dunkin Donut Capacchino: Cinnamon Dulce", 4.50, 5, 18, 160);
		
		// Coffee object array
		Object [] coffeeArray = {coffee1, coffee2, coffee3, coffee4, coffee5, coffee6, coffee7, coffee8,
				coffee9, coffee10};
		
		// Juice objects
		Juice juice1 = new Juice("Ocean Spray: Apple", 2.25, 5, 16, "Fruit Juice");
		Juice juice2 = new Juice("Ocean Spray: Orange", 2.25, 1, 16, "Fruit Juice");
		Juice juice3 = new Juice("Ocean Spray: Cranberry", 2.25, 6, 16, "Fruit Juice");
		Juice juice4 = new Juice("MinuteMaid: Lemonade", 2.25, 4, 12, "Tea");
		Juice juice5 = new Juice("MinuteMaid: Lemonade", 3.25, 2, 10, "Tea");
		Juice juice6 = new Juice("Naked: Green Machine", 2.99, 2, 12, "Smoothie");
		Juice juice7 = new Juice("Naked: Protein Zone", 2.99, 1, 12, "Smoothie");
		Juice juice8 = new Juice("Naked: Berry Blast", 2.99, 3, 12, "Smoothie");
		Juice juice9 = new Juice("Lipton: Iced Tea: Very Berry", 2.50, 1, 12, "Tea");
		Juice juice10 = new Juice("Lipton: Iced Tea: Citrus", 2.50, 3, 12, "Tea");
		
		// Juice object array (You can make an array like this...)
		Object [] juiceArray = new Object[10];
		juiceArray [0] = juice1;
		juiceArray [1] = juice2;
		juiceArray [2] = juice3;
		juiceArray [3] = juice4;
		juiceArray [4] = juice5;
		juiceArray [5] = juice6;
		juiceArray [6] = juice7;
		juiceArray [7] = juice8;
		juiceArray [8] = juice9;
		juiceArray [9] = juice10;
		
		// Milk object 
		Milk milk1 = new Milk("Horizon: Vanilla", 3.55, 3, 12, 4);
		Milk milk2 = new Milk("Horizon: Chocolate", 3.55, 6, 12, 4);
		Milk milk3 = new Milk("Horizon: Vanilla", 4.55, 1, 18, 4);
		Milk milk4 = new Milk("Horizon: Chocolate", 4.55, 4, 18, 4);
		Milk milk5 = new Milk("Horizon: Regular", 2.99, 2, 12, 1);
		Milk milk6 = new Milk("Horizon: Regular", 2.99, 1, 12, 2);
		Milk milk7 = new Milk("Horizon: Regular", 2.99, 3, 12, 4);
		Milk milk8 = new Milk("AE: Eggnog", 3.99, 0, 12, 4);
		Milk milk9 = new Milk("Silk: Vanilla", 4.99, 2, 12, 0);
		Milk milk10 = new Milk("Almond Breeze: Vanilla", 4.99, 1, 12, 0);
		
		// Milk object array (... or you can make an array like this.)
		Object [] milkArray = {milk1, milk2, milk3, milk4, milk5, milk6, milk7, milk8, milk9, milk10};
		
		// Soda object
		Soda soda1 = new Soda("Coke", 2.25, 6, 20, 180);
		Soda soda2 = new Soda("Coke: Zero", 2.25, 1, 20, 0);
		Soda soda3 = new Soda("Coke: Diet", 2.25, 3, 20, 60);
		Soda soda4 = new Soda("Coke: Cherry", 2.25, 1, 20, 200);
		Soda soda5 = new Soda("Sprite", 2.25, 4, 20, 160);
		Soda soda6 = new Soda("Sprite: Zero", 2.25, 1, 20, 0);
		Soda soda7 = new Soda("Fanta: Orange", 2.25, 4, 20, 170);
		Soda soda8 = new Soda("Fanta: Strawberry", 2.25, 1, 20, 160);
		Soda soda9 = new Soda("Bargs: Rootbeer", 2.25, 1, 20, 180);
		
		// Soda object array
		Object [] sodaArray = {soda2, soda2, soda3, soda4, soda4, soda6, soda7, soda8, soda9};
		
		// Water object
		Water water1 = new Water("Sparkling Ice",1.75, 4, 15, "Black Raspberry");
		Water water2 = new Water("Sparkling Ice", 1.75, 2, 17, "Cherry Lemonade");
		Water water3 = new Water("Sparkling Ice", 1.75, 2, 17, "Orange Mango");
		Water water4 = new Water("Sparkling Ice", 1.75, 2, 17, "Kiwi Strawberry");
		Water water5 = new Water("Voss", 2.99, 2, 20, "");
		Water water6 = new Water("Fiji", 2.00, 3, 12, "");
		Water water7 = new Water("Fiji", 3.00, 2, 24, "");
		Water water8 = new Water("Dasani", 1.50, 4, 20, "");
		Water water9 = new Water("Nestle", 1.50, 4, 20, "");
		
		// Water object array
		Object [] waterArray = {water1, water2, water3, water4, water5, water6, water7, water8, water9};
		
		// Candy object
		Candy candy1 = new Candy("Snickers", 1.69, 2, 10, 1);
		Candy candy2 = new Candy("Snickers", 2.25, 1, 10, 2);
		Candy candy3 = new Candy("Reeses's", 1.69, 4, 3, 2);
		Candy candy4 = new Candy("Reeses's", 2.25, 2, 3, 4);
		Candy candy5 = new Candy("Watchamacallit", 1.25, 5, 11, 1);
		Candy candy6 = new Candy("Mounds", 1.25, 4, 10, 2);
		Candy candy7 = new Candy("Twix", 1.50, 1, 7, 2);
		Candy candy8 = new Candy("Twix", 2.10, 3, 7, 4);
		Candy candy9 = new Candy("Payday", 1.50, 2, 9, 1);
		Candy candy10 = new Candy("KitKat", 1.69, 4, 11, 1);
		
		// Candy object array
		Object [] candyArray = {candy1, candy2, candy3, candy4, candy5, candy6, candy7, candy8, candy9, candy10};
		
		// Chips object
		Chips chips1 = new Chips("Daritos: Nacho", 1.25, 4, 15, 3);
		Chips chips2 = new Chips("Daritos: Nacho", 2.75, 2, 15, 7);
		Chips chips3 = new Chips("Daritos: Cool Ranch", 1.25, 1, 15, 3);
		Chips chips4 = new Chips("Daritos: Cool Ranch", 2.75, 4, 15, 7);
		Chips chips5 = new Chips("Lays: Classic", 1.25, 1, 17, 1);
		Chips chips6 = new Chips("Lays: Classic", 2.75, 3, 17, 3);
		Chips chips7 = new Chips("Pringles: Pizza", 2.00, 1, 14, 4.9);
		Chips chips8 = new Chips("Pringles: Sour Cream & Onion", 3.00, 2, 14, 4.9);
		Chips chips9 = new Chips("Chex Mix: Cheddar", 2.80, 2, 32, 7);
		Chips chips10 = new Chips("Chex Mix: Cinnomon Bun", 2.80, 1, 7, 7);
		
		// Chips object array
		Object [] chipsArray = {chips1, chips2, chips3, chips4, chips5, chips6, chips7, chips8, chips9, chips10};
		
		// Fruit object
		Fruit fruit1 = new Fruit("Apple: Granny Smith", .99, 3, 89, "Whole Fruit");
		Fruit fruit2 = new Fruit("Apple: Red", .99, 1, 84, "Whole Fruit");
		Fruit fruit3 = new Fruit("Orange", .99, 2, 80, "Whole Fruit");
		Fruit fruit4 = new Fruit("Banana", .50, 1, 85, "Whole Fruit");
		Fruit fruit5 = new Fruit("Pineapple", 2.25, 3, 85, "Fruit Cup");
		Fruit fruit6 = new Fruit("Grapes", 1.50, 1, 80, "Fruit Cup");
		Fruit fruit7 = new Fruit("Apple: Granny Smith", 2.00, 4, 89, "Fruit Cup");
		Fruit fruit8 = new Fruit("Apple: Red", 2.00, 2, 84, "Fruit Cup");
		Fruit fruit9 = new Fruit("Caramel", .75, 6, 26, "Fruit Dip");
		Fruit fruit10 = new Fruit("Yogurt Mix", .75, 7, 67, "Fruit Dip");
		
		// Fruit object Array
		Object [] fruitArray = {fruit1, fruit2, fruit3, fruit4, fruit5, fruit6, fruit7, fruit8, fruit9, fruit10};
		
		// Gum object
		Gum gum1 = new Gum("Orbit: PepperMint", 1.79, 6, 2, 14);
		Gum gum2 = new Gum("Orbit: Spearmint", 1.79, 1, 2, 14);
		Gum gum3 = new Gum("Orbit: Sweetmint", 1.79, 2, 2, 14);
		Gum gum4 = new Gum("Orbit: Bubbamint", 1.79, 4, 2, 14);
		Gum gum5 = new Gum("Orbit: Cinnamint", 1.79, 7, 2, 14);
		Gum gum6 = new Gum("Trident: Spearmint", 2.00, 6, 8, 18);
		Gum gum7 = new Gum("Trident: Perfect Peppermint", 2.00, 7, 8, 18);
		Gum gum8 = new Gum("Trident: Watermelon Twist", 2.00, 4, 8, 18);
		Gum gum9 = new Gum("Trident: Stawberry Twist", 2.00, 2, 8, 18);
		Gum gum10 = new Gum("Trident: Bubblegum", 2.00, 7, 8, 18);
		
		// Gum object Array
		Object [] gumArray = {gum1, gum2, gum3, gum4, gum5, gum6, gum7, gum8, gum9, gum10};
		
		// Sandwich object
		Sandwich sandwich1 = new Sandwich("Black Forest Ham", 3.50, 2, 78, "6 inch");
		Sandwich sandwich2 = new Sandwich("Black Forest Ham", 6.00, 1, 78, "1 foot");
		Sandwich sandwich3 = new Sandwich("Turkey Breast", 3.50, 4, 89, "6 inch");
		Sandwich sandwich4 = new Sandwich("Turkey Breast", 6.00, 2, 89, "1 foot");
		Sandwich sandwich5 = new Sandwich("Oven Roasted Chicken", 3.50, 3, 83, "6 inch");
		Sandwich sandwich6 = new Sandwich("Oven Roasted Chicken", 6.00, 1, 83, "1 foot");
		Sandwich sandwich7 = new Sandwich("Pickle Packet", .50, 15, 57, "Condiment");
		Sandwich sandwich8 = new Sandwich("Mayonaise Packet", .20, 23, 4, "Condiment");
		Sandwich sandwich9 = new Sandwich("Katchup Packet", .20, 25, 15, "Condiment");
		Sandwich sandwich10 = new Sandwich("Mustard Packet", .20, 14, 33, "Condiment");
		
		// Sandwich object array
		Object [] sandwichArray = {sandwich1, sandwich2, sandwich3, sandwich4, sandwich5, sandwich6, sandwich7, 
				sandwich8, sandwich9, sandwich10};

/* 		An array containing all items in the vending machine - but doesnt work - cannot get it to print
		Object [] allVendingMachineItems = {coffeeArray, juiceArray, milkArray, sodaArray, waterArray, candyArray, chipsArray,
				fruitArray, gumArray, sandwichArray};
*/	
		// Hand entered them all because I could not get the above to work
		// When a product is added I will have go make sure it is added to both this and it's 
		// own class' array
/*		Object [] allVendingMachineItems = {coffee1, coffee2, coffee3, coffee4, coffee5, coffee6, coffee7, coffee8,
				coffee9, coffee10, juice1, juice2, juice3, juice4, juice5, juice6, juice7, juice8, juice9, juice10, 
				milk1, milk2, milk3, milk4, milk5, milk6, milk7, milk8, milk9, milk10, soda2, soda2, soda3, soda4,
				soda4, soda6, soda7, soda8, soda9, water1, water2, water3, water4, water5, water6, water7, water8,
				water9, candy1, candy2, candy3, candy4, candy5, candy6, candy7, candy8, candy9, candy10, chips1,
				chips2, chips3, chips4, chips5, chips6, chips7, chips8, chips9, chips10, fruit1, fruit2, fruit3,
				fruit4, fruit5, fruit6, fruit7, fruit8, fruit9, fruit10, gum1, gum2, gum3, gum4, gum5, gum6, gum7,
				gum8, gum9, gum10, sandwich1, sandwich2, sandwich3, sandwich4, sandwich5, sandwich6, sandwich7, 
				sandwich8, sandwich9, sandwich10};
		
		// Comparing juice1 and juice2
		System.out.println(milk1.compareTo(milk2));
		System.out.println(milk3.compareTo(milk4));
		System.out.println(milk1.compareTo(milk3));
		System.out.println(milk2.compareTo(milk4));
		
/*		// Put milk objects in order
		java.util.Arrays.sort(milkArray);
		
		// Prints milk objects out in order
		for (Object milk : milkArray)
			System.out.println(milk + " \n");
*/
		// Put all items in machine in alphabetical order (according to name and then price)
/*		java.util.Arrays.sort(allVendingMachineItems);
		
		// Prints all items in order
		for (Object item : allVendingMachineItems)
			System.out.println(item + " \n");
	}
}
*/
