package finalProject;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.AbstractListModel;

public class VendingMachine extends JFrame{
	// Create card layout
	public static CardLayout card = new CardLayout();
	
	// Create panels
	public static JPanel container = new JPanel();
	public static JPanel homePanel = new JPanel();
	public static JPanel snackPanel = new JPanel();
	public static JPanel beveragePanel = new JPanel();
	public static JPanel productPanel = new JPanel();
	public static JPanel cartPanel	= new JPanel();
	
	// Images
	Icon juicePic = new ImageIcon(getClass().getResource("01juicePic.jpg"));
	Icon coffeePic = new ImageIcon(getClass().getResource("01coffeePic.jpg"));
	Icon sodaPic = new ImageIcon(getClass().getResource("01sodaPic.jpg"));
	Icon milkPic = new ImageIcon(getClass().getResource("01milkPic.jpg"));
	Icon waterPic = new ImageIcon(getClass().getResource("01waterPic.jpg"));
	Icon candyPic = new ImageIcon(getClass().getResource("01candyPic.gif"));
	Icon chipsPic = new ImageIcon(getClass(). getResource("01chipsPic.jpg"));
	Icon fruitPic = new ImageIcon(getClass().getResource("01fruitPic.gif"));
	Icon gumPic = new ImageIcon(getClass().getResource("01gumPic.png"));
	Icon sandwichPic = new ImageIcon(getClass().getResource("01sandwichPic.jpg"));
	
	// Create the buttons/labels/etc. we need
	private final JLabel welcome = new JLabel("Welcome: Beverly's Vending Machine");
	private final JLabel productHeader = new JLabel("");
	private final JLabel cartLabel = new JLabel("My Cart");
	private final JScrollPane scrollPane = new JScrollPane();
	private final JScrollPane cartScrollPane = new JScrollPane();
	public final JList list = new JList();
	public final JList cartList = new JList();
	private final JButton snacks = new JButton("Snacks");
	private final JButton beverages = new JButton("Beverages");
	private final JButton maintenance = new JButton("Maintenance");
	private final JButton beverageBack = new JButton("Back");
	private final JButton snackBack = new JButton("Back");
	private final JButton productBack = new JButton("Back");
	private final JButton coffee = new JButton("Coffee", coffeePic);
	private final JButton milk = new JButton("Milk", milkPic);
	private final JButton soda = new JButton("Soda", sodaPic);
	private final JButton water = new JButton("Water", waterPic);
	private final JButton juice = new JButton("Juice", juicePic);
	private final JButton chips = new JButton("Chips", chipsPic);
	private final JButton candy = new JButton("Candy", candyPic);
	private final JButton fruit = new JButton("Fruit", fruitPic);
	private final JButton sandwich = new JButton("Sandwich", sandwichPic);
	private final JButton gum = new JButton("Gum", gumPic);
	private final JButton addToCart = new JButton("Add to Cart");
	private final JButton viewCart	= new JButton("View Cart");
	private final JButton remove = new JButton("Remove");
	private final JButton cartBack = new JButton("Back");
	
	public VendingMachine(){
		
		// Set the layout for each panel and add color
		container.setLayout(card);
		container.setBackground(new Color(0, 102, 153));
		snackPanel.setLayout(null);
		snackPanel.setBackground(new Color(51, 102, 153));
		beveragePanel.setLayout(null);
		beveragePanel.setBackground(new Color(51, 102, 153));
		productPanel.setLayout(null);
		productPanel.setBackground(new Color(51, 102, 153));
		homePanel.setLayout(null);
		homePanel.setBackground(new Color(51, 102, 153));
		cartPanel.setLayout(null);
		cartPanel.setBackground(new Color(51, 102, 153));
		
		// Add buttons to the appropriate panels
		welcome.setForeground(Color.WHITE);
		welcome.setFont(new Font("Tahoma", Font.BOLD, 30));
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		homePanel.add(welcome);
		snacks.setBackground(Color.WHITE);
		snacks.setFont(new Font("Tahoma", Font.PLAIN, 29));
		homePanel.add(snacks);
		beverages.setBackground(Color.WHITE);
		beverages.setFont(new Font("Tahoma", Font.PLAIN, 29));
		homePanel.add(beverages);
		maintenance.setFont(new Font("Tahoma", Font.PLAIN, 18));
		homePanel.add(maintenance);
		
		coffee.setFont(new Font("Tahoma", Font.PLAIN, 29));		
		coffee.setBackground(Color.WHITE);
		beveragePanel.add(coffee);
		juice.setFont(new Font("Tahoma", Font.PLAIN, 29));
		juice.setBackground(Color.WHITE);
		beveragePanel.add(juice);
		soda.setFont(new Font("Tahoma", Font.PLAIN, 29));
		soda.setBackground(Color.WHITE);
		beveragePanel.add(soda);
		water.setFont(new Font("Tahoma", Font.PLAIN, 29));
		water.setBackground(Color.WHITE);
		beveragePanel.add(water);
		milk.setFont(new Font("Tahoma", Font.PLAIN, 29));
		milk.setBackground(Color.WHITE);
		beveragePanel.add(milk);
		beverageBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
		beverageBack.setBackground(Color.WHITE);
		beveragePanel.add(beverageBack);
		
		chips.setFont(new Font("Tahoma", Font.PLAIN, 29));
		chips.setBackground(Color.WHITE);
		snackPanel.add(chips);
		candy.setFont(new Font("Tahoma", Font.PLAIN, 29));
		candy.setBackground(Color.WHITE);
		snackPanel.add(candy);
		fruit.setFont(new Font("Tahoma", Font.PLAIN, 29));
		fruit.setBackground(Color.WHITE);
		snackPanel.add(fruit);
		sandwich.setFont(new Font("Tahoma", Font.PLAIN, 29));
		sandwich.setBackground(Color.WHITE);
		snackPanel.add(sandwich);
		gum.setFont(new Font("Tahoma", Font.PLAIN, 29));
		gum.setBackground(Color.WHITE);
		snackPanel.add(gum);
		snackBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
		snackBack.setBackground(Color.WHITE);
		snackPanel.add(snackBack);
		
		productHeader.setForeground(Color.WHITE);
		productHeader.setFont(new Font("Tahoma", Font.BOLD, 30));
		productHeader.setHorizontalAlignment(SwingConstants.CENTER);
		productPanel.add(productHeader);
		productBack.setBackground(Color.WHITE);
		productBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
		productPanel.add(productBack);
		addToCart.setBackground(Color.WHITE);
		addToCart.setFont(new Font("Tahoma", Font.PLAIN, 28));
		productPanel.add(addToCart);
		viewCart.setBackground(Color.WHITE);
		viewCart.setFont(new Font("Tahoma", Font.PLAIN, 28));
		productPanel.add(viewCart);
		
		cartLabel.setForeground(Color.WHITE);
		cartLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		cartLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productPanel.add(cartLabel);
		cartPanel.add(cartLabel);
		remove.setBackground(Color.WHITE);
		remove.setFont(new Font("Tahoma", Font.PLAIN, 28));
		cartPanel.add(remove);
		cartBack.setBackground(Color.WHITE);
		cartBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
		cartPanel.add(cartBack);
		
		// Give buttons a location: Home screen
		welcome.setBounds(75, 56, 582, 66);
		snacks.setBounds(160, 150, 170, 46);
		beverages.setBounds(402, 150, 170, 46);
		maintenance.setBounds(441, 238, 131, 36);
		
		// Beverage Screen
		juice.setBounds(30, 60, 195, 100);
		coffee.setBounds(250, 60, 195, 100);
		milk.setBounds(30, 220, 195, 100);
		soda.setBounds(470, 60, 195, 100);
		water.setBounds(250, 220, 195, 100);
		beverageBack.setBounds(470, 220, 170, 46);
		
		// Snack screen
		chips.setBounds(30, 60, 195, 100);
		candy.setBounds(250, 60, 195, 100);
		fruit.setBounds(30, 220, 195, 100);
		sandwich.setBounds(470, 60, 215, 100);
		gum.setBounds(250, 220, 195, 100);
		snackBack.setBounds(470, 220, 170, 46);
		
		// Product screen
		productHeader.setBounds(150, 28, 250, 66);
		productBack.setBounds(543, 393, 170, 46);
		addToCart.setBounds(541, 138, 180, 46);
		viewCart.setBounds(543, 213, 180, 46);
		
		// Cart Screen
		remove.setBounds(541, 138, 180, 46);
		cartBack.setBounds(543, 213, 180, 46);
		cartLabel.setBounds(150, 28, 250, 66);
		
		// Setting up my action listeners
		eventSnacks esnacks = new eventSnacks();
		snacks.addActionListener(esnacks);
		
		eventBeverages ebeverages = new eventBeverages();
		beverages.addActionListener(ebeverages);
		
		eventMaintenance em = new eventMaintenance();
		maintenance.addActionListener(em);
		
		eventBeverageBack eBeverageBack = new eventBeverageBack();
		beverageBack.addActionListener(eBeverageBack);
		
		eventSnackBack eSnackBack = new eventSnackBack();
		snackBack.addActionListener(eSnackBack);
		
		eventProductBack eProductBack = new eventProductBack();
		productBack.addActionListener(eProductBack);
		
		eventChips echips = new eventChips();
		chips.addActionListener(echips);
		
		eventCandy ecandy = new eventCandy();
		candy.addActionListener(ecandy);
		
		eventFruit efruit = new eventFruit();
		fruit.addActionListener(efruit);
		
		eventGum egum = new eventGum();
		gum.addActionListener(egum);
		
		eventSandwich esandwich = new eventSandwich();
		sandwich.addActionListener(esandwich);
		
		eventCoffee ecoffee = new eventCoffee();
		coffee.addActionListener(ecoffee);
		
		eventJuice ejuice = new eventJuice();
		juice.addActionListener(ejuice);
		
		eventMilk emilk = new eventMilk();
		milk.addActionListener(emilk);
		
		eventSoda esoda = new eventSoda();
		soda.addActionListener(esoda);
		
		eventWater ewater = new eventWater();
		water.addActionListener(ewater);
		
		eventAddToCart eAddToCart = new eventAddToCart();
		addToCart.addActionListener(eAddToCart);
		
		eventViewCart eViewCart = new eventViewCart();
		viewCart.addActionListener(eViewCart);
		
		eventCartBack eCartBack = new eventCartBack();
		cartBack.addActionListener(eCartBack);
		
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Add Panels to the container
		container.add(homePanel, "home");
		container.add(beveragePanel, "beveragePanel");
		container.add(snackPanel, "snackPanel");
		container.add(productPanel, "productPanel");
		container.add(cartPanel, "cart");
		
		// To list products
		scrollPane.setBounds(26, 100, 491, 363);
		productPanel.add(scrollPane);
		
		cartScrollPane.setBounds(26, 100, 491, 363);
		cartPanel.add(cartScrollPane);
		}
	public static void main(String[] args){
		VendingMachine vm = new VendingMachine();
		// Add container to the frame and make visible
		vm.getContentPane().add(container);
		vm.setVisible(true);
	}
		public class eventSnacks implements ActionListener{
			public void actionPerformed (ActionEvent esnacks){
				card.show(container, "snackPanel");
			}
		}
		public class eventBeverages implements ActionListener{
			public void actionPerformed(ActionEvent ebeverages){
				card.show(container, "beveragePanel");
			}
		}
		
		public class eventMaintenance implements ActionListener{
			public void actionPerformed(ActionEvent em){
				card.show(container, "Not Ready Yet");
			}
		}
		
		public class eventChips implements ActionListener{
			public void actionPerformed(ActionEvent echips){
				productHeader.setText("Chips");
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
				
				list.setModel(new AbstractListModel() {
					String[] chipsString = new String[] {chips1.toString(), chips2.toString(), chips3.toString(),
							chips4.toString(), chips5.toString(), chips6.toString(), chips7.toString(),
							chips8.toString(), chips9.toString(), chips10.toString()};
					public int getSize() {
						return chipsString.length;
					}
					public Object getElementAt(int index) {
						return chipsString[index];
					}
				});
				scrollPane.setViewportView(list);
				card.show(container, "productPanel");
			}
		}
		public class eventJuice implements ActionListener{
			public void actionPerformed(ActionEvent ejuice){
				productHeader.setText("Juice");
				card.show(container, "productPanel");
			}
		}
		public class eventCandy implements ActionListener{
			public void actionPerformed(ActionEvent ecandy){
				productHeader.setText("Candy");
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
				
				list.setModel(new AbstractListModel() {
					String[] chipsString = new String[] {candy1.toString(), candy2.toString(), candy3.toString(),
							candy4.toString(), candy5.toString(), candy6.toString(), candy7.toString(), candy8.toString(),
							candy9.toString(), candy10.toString()};
					public int getSize() {
						return chipsString.length;
					}
					public Object getElementAt(int index) {
						return chipsString[index];
					}
				});
				scrollPane.setViewportView(list);
				card.show(container, "productPanel");	
			}
		}
		public class eventFruit implements ActionListener{
			public void actionPerformed(ActionEvent efruit){
				productHeader.setText("Fruit");
				card.show(container, "productPanel");
			}
		}
		public class eventGum implements ActionListener{
			public void actionPerformed(ActionEvent egum){
				productHeader.setText("Gum");
				card.show(container, "productPanel");
			}
		}
		public class eventSandwich implements ActionListener{
			public void actionPerformed(ActionEvent esandwich){
				productHeader.setText("Sandwiches");
				card.show(container, "productPanel");
			}
		}
		public class eventSnackBack implements ActionListener{
			public void actionPerformed(ActionEvent eSnackBack){
				card.show(container, "home");
			}
		}
		public class eventCoffee implements ActionListener{
			public void actionPerformed(ActionEvent ecoffee){
				productHeader.setText("Coffee");
				card.show(container, "productPanel");
			}
		}
		public class eventMilk implements ActionListener{
			public void actionPerformed(ActionEvent emilk){
				productHeader.setText("Milk");
				card.show(container, "productPanel");
			}
		}
		public class eventSoda implements ActionListener{
			public void actionPerformed(ActionEvent esoda){
				productHeader.setText("Soda");
				card.show(container, "productPanel");
			}
		}
		public class eventWater implements ActionListener{
			public void actionPerformed(ActionEvent ewater){
				productHeader.setText("Water");
				card.show(container, "productPanel");
			}
		}
		public class eventBeverageBack implements ActionListener{
			public void actionPerformed(ActionEvent eBeverageBack){
				card.show(container, "home");
			}
		}
		public class eventProductBack implements ActionListener{
			public void actionPerformed(ActionEvent eProductBack){
				card.show(container, "home");
			}
		}
		public class eventAddToCart implements ActionListener{
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent eAddToCart){
				cartList.setListData(list.getSelectedValues());
			}
		}
		public class eventViewCart implements ActionListener{
			public void actionPerformed(ActionEvent eViewCart){
				card.show(container, "cart");
			}
		}
		public class eventCartBack implements ActionListener{
			public void actionPerformed(ActionEvent eCartBack){
				card.show(container, "productPanel");
			}
		}
}