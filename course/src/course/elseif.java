package course;

import java.util.Scanner;

public class elseif {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Digite o numero A:");
		int a = key.nextInt(); // 4
		System.out.println("Digite o numero B:");
		int b = key.nextInt(); // 10
		System.out.println("Digite o numero C:");
		int c = key.nextInt(); // 7
		int maior;
		
		if(a >= b && a >= c) {
			maior = a;
		}else if(b >= a && b >=c  ) {
			maior = b;
		}else {
			maior = c;
		}
		
		key.close();
		
		
		System.out.printf("O numero maior e: %d", maior);
		
		
	}
		

}
