package exerc1aula14;

import java.util.Locale;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exercicio1aula12 {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office Desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s, which price is $%.2f", product1, price1);
		System.out.printf("\n%s, which price is $%.2f", product2, price2);

		System.out.printf("\n\nRecord: %d years old, code %d and gerder: %c", age, code, gender);
		
		System.out.printf("\n\nMeasue with eight decimal places: %.8f", measure);
		System.out.printf("\nRouded (three decimal places): %.3f", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("\nUS decimal point: %.3f", measure);

	}

}
