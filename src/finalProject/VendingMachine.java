package finalProject;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

public class VendingMachine extends JFrame{
	// Create card layout
	public static CardLayout card = new CardLayout();
	
	// Create panels
	public static JPanel container = new JPanel();
	public static JPanel homePanel = new JPanel();
	public static JPanel snackPanel = new JPanel();
	public static JPanel beveragePanel = new JPanel();
	public static JPanel productPanel = new JPanel();
	
	// Create the buttons/textfields/etc. we need
	private final JTextField welcome = new JTextField("Welcome: Beverly's Vending Machine");
	private final JTextField productHeader = new JTextField("");
	private final JScrollPane scrollPane = new JScrollPane();
	private final JButton snacks = new JButton("Snacks");
	private final JButton beverages = new JButton("Beverages");
	private final JButton maintenance = new JButton("Maintenance");
	private final JButton juice = new JButton("Juice");
	private final JButton chips = new JButton("Chips");
	private final JButton coffee = new JButton("Coffee");
	private final JButton milk = new JButton("Milk");
	private final JButton soda = new JButton("Soda");
	private final JButton water = new JButton("Water");
	private final JButton beverageBack = new JButton("Back");
	private final JButton candy = new JButton("Candy");
	private final JButton fruit = new JButton("Fruit");
	private final JButton sandwich = new JButton("Sandwich");
	private final JButton gum = new JButton("Gum");
	private final JButton snackBack = new JButton("Back");
	private final JButton productBack = new JButton("Back");
	
	public VendingMachine(){
		// Set the layout for each panel
		container.setLayout(card);
		snackPanel.setLayout(null);
		beveragePanel.setLayout(null);
		productPanel.setLayout(null);
		homePanel.setLayout(null);
		welcome.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		// Add buttons to the appropriate panels
		homePanel.add(welcome);
		snacks.setFont(new Font("Tahoma", Font.PLAIN, 29));
		homePanel.add(snacks);
		beverages.setFont(new Font("Tahoma", Font.PLAIN, 29));
		homePanel.add(beverages);
		homePanel.add(maintenance);
		
		chips.setFont(new Font("Tahoma", Font.PLAIN, 29));
		snackPanel.add(chips);
		candy.setFont(new Font("Tahoma", Font.PLAIN, 29));
		snackPanel.add(candy);
		fruit.setFont(new Font("Tahoma", Font.PLAIN, 29));
		snackPanel.add(fruit);
		sandwich.setFont(new Font("Tahoma", Font.PLAIN, 29));
		snackPanel.add(sandwich);
		gum.setFont(new Font("Tahoma", Font.PLAIN, 29));
		snackPanel.add(gum);
		snackBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
		snackPanel.add(snackBack);
		
		coffee.setFont(new Font("Tahoma", Font.PLAIN, 29));		
		beveragePanel.add(coffee);
		juice.setFont(new Font("Tahoma", Font.PLAIN, 29));
		beveragePanel.add(juice);
		soda.setFont(new Font("Tahoma", Font.PLAIN, 29));
		beveragePanel.add(soda);
		water.setFont(new Font("Tahoma", Font.PLAIN, 29));
		beveragePanel.add(water);
		milk.setFont(new Font("Tahoma", Font.PLAIN, 29));
		beveragePanel.add(milk);
		beverageBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
		beveragePanel.add(beverageBack);
		productHeader.setFont(new Font("Tahoma", Font.BOLD, 30));
		productHeader.setHorizontalAlignment(SwingConstants.CENTER);
		
		productPanel.add(productHeader);
		productBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
		productPanel.add(productBack);
		
		// Give buttons a location: Home screen
		welcome.setBounds(75, 56, 582, 66);
		snacks.setBounds(160, 150, 170, 46);
		beverages.setBounds(402, 150, 170, 46);
		maintenance.setBounds(441, 238, 131, 36);
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		maintenance.setFont(new Font("Tahoma", Font.PLAIN, 18));
		// Beverage Screen
		juice.setBounds(75, 170, 170, 46);
		coffee.setBounds(275, 170, 170, 46);
		milk.setBounds(75, 275, 170, 46);
		soda.setBounds(475, 170, 170, 46);
		water.setBounds(275, 275, 170, 46);
		beverageBack.setBounds(475, 275, 170, 46);
		// Snack screen
		chips.setBounds(75, 75, 170, 46);
		candy.setBounds(75, 170, 170,  46);
		fruit.setBounds(275, 75, 170, 46);
		sandwich.setBounds(475, 75, 170, 46);
		gum.setBounds(275, 170, 170, 46);
		snackBack.setBounds(475, 170, 170, 46);
		//Product screen
		productHeader.setBounds(53, 28, 250, 66);
		productBack.setBounds(525, 400, 170, 46);
		
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
		
		setSize(800, 570);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Add Panels to the container
		container.add(homePanel, "home");
		container.add(snackPanel, "snackPanel");
		container.add(beveragePanel, "beveragePanel");
		container.add(productPanel, "productPanel");
		
		// To list products
		scrollPane.setBounds(53, 137, 464, 326);
		productPanel.add(scrollPane);
		
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
				// Chips object array
				Chips[] chipsArray = {chips1, chips2, chips3, chips4, chips5, chips6, chips7, chips8, chips9, chips10};
				//JList<String> chipsList = new JList<String>(chips.toString());
				
				final DefaultListModel<Object> chipsDefaultList = new DefaultListModel<Object>();
				chipsDefaultList.addElement(chipsArray);
				JList<Object> chipsList = new JList<Object>(chipsDefaultList);
				chipsList.setVisibleRowCount(2);
				chipsList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
				scrollPane.add(chipsList, chips.getName());
				
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
}