package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
	
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rect.width = kb.nextDouble();
		rect.height = kb.nextDouble();
		
		System.out.printf("\nAREA: %.2f", rect.area());
		System.out.printf("\nPERIMETER: %.2f", rect.perimeter());
		System.out.printf("\nDIAGONAL: %.2f", rect.diagonal());
		
		kb.close();
		
		
	}

}
