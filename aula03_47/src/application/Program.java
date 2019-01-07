package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter the product data: ");
		System.out.println("Name: ");
		product.name = kb.nextLine();
		System.out.println("Price: ");
		product.price = kb.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = kb.nextInt();
		
		
		System.out.println("Product data: " + product);
		
		
		System.out.println();
		System.out.printf("Enter the number of products to be added in stock: ");
		int quantity = kb.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.printf("Enter the number of products to be removed from stock: ");
		quantity = kb.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
			
		
		
		
		
		
		
		
		kb.close();
		
	}

}
