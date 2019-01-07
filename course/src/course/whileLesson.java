package course;

import java.util.Locale;
import java.util.Scanner;

public class whileLesson {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner keyb = new Scanner(System.in);
		
		
		System.out.println("Enter a number: ");
		double n = keyb.nextDouble();
		
		while(n >= 0.0) {
			double sqrt = Math.sqrt(n);
			System.out.printf("The sqrt of " + n +" is: %.3f\n", sqrt);
			System.out.println("Enter another number: ");
			n = keyb.nextDouble();
					
		}
		System.out.println("Negative number");
		
		
		keyb.close();
		
		
		
	}

}
