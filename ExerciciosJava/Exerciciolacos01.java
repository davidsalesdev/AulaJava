package Aulas01;

import java.util.Scanner;

public class Exerciciolacos01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Scanner ler = new Scanner (System.in);
		
		int n1;
		int n2;
		int n3;
		
		System.out.println("Digite um número1:");
		n1 = ler.nextInt();
		
		System.out.println("Digite um número2:");
		n2 = ler.nextInt();
		
		System.out.println("Digite um número3:");
		n3 =  ler.nextInt();
		
		if (n1 > n2 && n1 > n3) { 
			
			System.out.println("\n O maior numero é"+n1);
			
		}

		if (n2 > n3 && n2 > n1) { 
			
			System.out.println("\n O maior numero é"+n2);
		
		}
		
		if (n3 > n2 && n3 > n1) { 
			
			System.out.println("\n O maior numero é"+n3);
			
		}
	}
}
