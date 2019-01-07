package applicaiton;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = kb.nextInt();
		Product[] vect = new Product[n];
		
		for (int i=0; i<vect.length; i++) {
			kb.nextLine();
			String name = kb.nextLine();
			double price = kb.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.println("Averege Price  = " + String.format("%.2f", avg));
		
		kb.close();
	}

}
