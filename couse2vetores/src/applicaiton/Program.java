package applicaiton;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = kb.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = kb.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum = +vect[i];
		}

		double avg = sum / n;
		
		System.out.println("Average height: " + String.format("%.2f", avg));
		
		kb.close();
	}

}
