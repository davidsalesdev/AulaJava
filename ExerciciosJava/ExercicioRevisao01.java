package Aulas01;

import java.util.Scanner;

public class ExercicioRevisao01 {

	private static float valor;
	private static float parcelas;
	private static float formadepagamento;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Elabore um programa que calcule o que deve ser pago por um produto.*/
		
		try (Scanner ler = new Scanner (System.in)) {
		int op = 0;
		float valor;
		float parcelas;
		float formadepagamento;
			
			
				System.out.println("\n Entre com  o valor do produto aqui: ");
				valor = ler.nextFloat();
				
				System.out.println ("\n 1- Dinheiro digite, 2 -Cheque Digite, 3-Cart�o de Cr�dito Digite: ");
				formadepagamento = ler.nextFloat();
				
				System.out.println("\n Quantidade de parcelas: ");
				parcelas = ler.nextFloat();
				
			
				switch(op)
				{
				case 1:
					op = 1;
					valor = ( valor * 20) / 100;
					System.out.println("\n Voc� ganhou 20% de desconto PARAB�NS...");
					
					break;
				
				case 2: 
					op = 2;
					parcelas = ( valor * 15) / 100;
					System.out.println("\n Voc� ganhou 15% de desconto PARAB�NS....");
					
					break;
					
				case 3:
					op = 3;
					
					System.out.println("\n Voc� n�o conseguiu desconto nesta condi��o:");
				
					break;
					
				case 4: 
					op = 4;
					parcelas = valor /2;
					System.out.println("\n Voc� n�o conseguiu desconto nesta condi��o: ");
					break;
					
				case 5:
					op = 5;
					formadepagamento = (valor * 10 ) / 100;
					parcelas = (formadepagamento + valor) / 3;
					System.out.println ( " O pre�o do produto, dividido em tr�s vezes, com juros de 10% aplicado: "+parcelas+"Com um total de:" + "valor" +"formadepagamento");
					
					break;
					default:	
						
					System.out.println("\n Op��o INVALIDA....");
				}
		}
			
		
	}
}
