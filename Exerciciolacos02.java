package Aulas01;

import java.util.Scanner;

public class Exerciciolacos02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		
		int n1;
		int n2;
		int n3;
		
		System.out.println("Entre com um número: ");
		n1 = ler.nextInt();
		

		System.out.println("Entre com um número: ");
		n2 = ler.nextInt();
		

		System.out.println("Entre com um número: ");
		n3 = ler.nextInt();
		
		if (n1 < n2 && n2 < n3) {
			
			System.out.println(n1+" "+n2+" "+n3);
    	}
		
		else if (n1<n3 && n3<n2)
			
		{
			System.out.println(n1+" "+n3+" "+n2);
		}
		
		else if (n2 < n1 && n1 < n3) {

			System.out.println(n2+" "+n1+" "+n3);
    	}
		
		else if (n2 < n3 && n3 < n1) {

			System.out.println(n2+" "+n3+" "+n1);
    	}
		
		else if(n3 < n1 && n1 < n2) {
			System.out.println(n3+" "+n1+" "+n2);
		}
		
		else 
			System.out.println(n3+" "+n2+" "+n1);
		}
	
	}


