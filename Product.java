package com.shopping;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product
{
	// Declare a private variable to store the name of the product
	private String name;

	// Declare a private variable to store the price of the product
	private double price;

	// Constructor to initialize the name and price of the product
	public Product(String name, double price) {
	    // Initialize the name of the product with the provided value
	    this.name = name;
	    // Initialize the price of the product with the provided value
	    this.price = price;
	}

	// Getter method to retrieve the name of the product
	public String getName() {
	    // Return the name of the product
	    return name;
	}

	// Getter method to retrieve the price of the product
	public double getPrice() {
	    // Return the price of the product
	    return price;
	}


class ShoppingCart
{
	// Declare a private list to store the items in the shopping cart
	private List<Product> items;

	// Constructor to initialize the shopping cart with an empty list of items
	public ShoppingCart() {
	    // Initialize the list of items as an empty ArrayList
	    items = new ArrayList<>();
	}

	// Method to add a product to the shopping cart
	public void addItem(Product product) {
	    // Add the specified product to the list of items in the shopping cart
	    items.add(product);
	}

	// Method to retrieve the list of items in the shopping cart
	public List<Product> getItems() {
	    // Return the list of items in the shopping cart
	    return items;
	}

	// Method to calculate the total cost of all items in the shopping cart
	public double getTotal() {
	    // Initialize a variable to store the total cost
	    double total = 0;
	    // Iterate through each item in the shopping cart
	    for (Product item : items) {
	        // Add the price of the current item to the total cost
	        total += item.getPrice();
	    }
	    // Return the total cost of all items in the shopping cart
	    return total;
	}
}
}