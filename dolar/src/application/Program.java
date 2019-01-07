package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;


public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Whats os the dollar price ?");
		CurrencyConverter.dollar = kb.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		CurrencyConverter.buyAmon = kb.nextDouble();
		
		System.out.printf("Amount to be paid in reias = %.2f ", CurrencyConverter.convertPay());
		
		kb.close();
	}

}
