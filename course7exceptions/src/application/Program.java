package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		method2();
		System.out.println("End of Program.");
		
		
		
		
		

	}
	
	public static void method2() {
	Scanner kb = new Scanner(System.in);
		
		try {
			String[] vect = kb.nextLine().split(" ");
			int position = kb.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid position!");
			e.printStackTrace();
		}
		catch(InputMismatchException e){
			System.out.println("Invalid!");
			e.printStackTrace();
		}
		catch(NullPointerException e){
			System.out.println("Invalid!");
			e.printStackTrace();
		}
		
		kb.close();
		
	}

}
