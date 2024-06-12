package com.shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart 
{
	public static void main(String[] args) {
	    // Create a scanner object to read user input from the console
	    Scanner scanner = new Scanner(System.in);
	    
	    // Create a list to store available products
	    List<Product> products = new ArrayList<>();
	    // Add sample products to the list
	    products.add(new Product("Laptop", 10000));
	    products.add(new Product("Smartphone", 10000));
	    products.add(new Product("Headphone", 500));
	    products.add(new Product("Smartwatch", 50000));

	    // Display available products to the user
	    System.out.println("Available Products:");
	    // Loop through each product and print its details
	    for (int i = 0; i < products.size(); i++) {
	        System.out.println((i + 1) + ". " + products.get(i).getName() + " - $" + products.get(i).getPrice());
	    }

	    // Create a shopping cart to store selected products
	    ShoppingCart cart = new ShoppingCart();

	    // Prompt the user to add products to the cart
	    while (true) {
	        // Ask the user to enter the product number to add to the cart
	        System.out.print("Enter product number to add to cart (0 to checkout): ");
	        // Read the user's input
	        int choice = scanner.nextInt();
	        // If the user enters 0, exit the loop
	        if (choice < 1 || choice > products.size()) {
	            break;
	        }
	        // Add the selected product to the cart
	        cart.addItem(products.get(choice - 1));
	        // Print a message confirming the addition of the product to the cart
	        System.out.println(products.get(choice - 1).getName() + " added to cart.");
	    }

	    // Display the items in the cart along with their prices
	    System.out.println("\nCart Items:");
	    // Get the list of items in the cart
	    List<Product> cartItems = cart.getItems();
	    // Loop through each item in the cart and print its details
	    for (int i = 0; i < cartItems.size(); i++) {
	        System.out.println((i + 1) + ". " + cartItems.get(i).getName() + " - $" + cartItems.get(i).getPrice());
	    }
	    // Display the total cost of the items in the cart
	    System.out.println("Total: $" + cart.getTotal());

	    // Print a thank you message
	    System.out.println("\nThank you for shopping with us!");
	    
	    // Close the scanner to release system resources
	    scanner.close();
	}

	private String getTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	private List<Product> getItems() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addItem(Product product) {
		// TODO Auto-generated method stub
		
	}

}



