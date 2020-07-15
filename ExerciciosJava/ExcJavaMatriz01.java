package Aulas01;

import java.util.Scanner;

public class ExcJavaMatriz01 
{
		//Leia uma matriz 3x3, conte e escreva quantos valores maiores que 10 ela possui.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			try (Scanner ler = new Scanner (System.in)) {
				int [][] matriz = new int [3][3];
				
				for ( int l = 0 ; l < 3 ; l ++ ) // lê uma linha
				{
					for ( int c = 0 ; c < 3 ; c ++ ) // lê uma coluna
					{
						
						System.out.println("Entre com um valor: ");
						matriz [l] [c] = ler.nextInt();
						
					}
				}
			}
}
	
}