package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		x.a = kb.nextDouble();
		x.b = kb.nextDouble();
		x.c = kb.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		y.a = kb.nextDouble();
		y.b = kb.nextDouble();
		y.c = kb.nextDouble();

		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("\nThe area of triangle X is: %.3f", areaX);
		System.out.printf("\nThe area of triangle Y is: %.3f", areaY);
		
		if( areaX > areaY) {
			System.out.println("\nX is Greater. ");
		}else {
			System.out.println("\nY is Greater. ");
		}
		
		

	}

}
