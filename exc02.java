package Aulas01;

import java.util.Scanner;

public class exc02 {

	public static void main(String[] args) {
		
		

		Scanner leia = new Scanner(System.in) ;
		
			
			float n1,n2,n3, mediadeNota;
		
			System.out.printf("Entre com o valor de n1:");
			n1 = leia.nextInt();
			System.out.printf("Entre com o valor de n2:");
			n2 = leia.nextInt();
			System.out.printf("Entre com o valor de n3:");
			n3 = leia.nextInt();
		
			  mediadeNota = ((n1))+ ((n2)) + (n3*5)/3;

		        System.out.println("A média é:" + mediadeNota);
			
		
		
		
	}

}
