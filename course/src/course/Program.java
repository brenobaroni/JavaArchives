package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter you full name:");
		String fname = key.nextLine();
		
		System.out.println("How many badrooms are there in your house?");
		int badrooms = key.nextInt();
		
		System.out.println("Enter product price:");
		double price = key.nextDouble();
		
		System.out.println("Enter your last name, age and height (same line):");
		String lname = key.next();
		int age = key.nextInt();
		double height = key.nextDouble();
		
		System.out.println(fname);
		System.out.println(badrooms);
		System.out.printf("%.2f\n", price);
		System.out.println(lname);
		System.out.println(age);
		System.out.println(height);
		
		System.out.println("dfasdfdsafa");
		
		
		key.close();

	}

}
