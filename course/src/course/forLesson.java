package course;

import java.util.Scanner;

public class forLesson {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		System.out.println("How many integer numbers are you goint to enter: ");
		int n = kb.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("Value #" + i + ": ");
			int x = kb.nextInt();
			sum += x;
		}
		
		System.out.println("Sum = " + sum);

		kb.close();
	}

}
