package Aulas01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		
		Scanner leitura = new Scanner(System.in);
		
		
		
		
		
		//Informa��es de entrada do usuario
		
		System.out.printf("Digite o ano de nascimento: ");
		int anoNascimento = leitura.nextInt();
		
		System.out.printf("Digite seu m�s: ");
		int mesNascimento = leitura.nextInt();
		
		System.out.printf("Digite seu dia:");
		int diaNascimento = leitura.nextInt();
		
		int diasDoMes = 30; 
		int mesesDoAno = 12;
		int diasDoAno = diasDoMes*mesesDoAno;
		
		// Informa��es do ano atual
		
		 int anoAtual = 2020;
		 int mesAtual = 07;
	     int diaAtual = 06;
		
	    //Informa��es da idade do usuario
	     
	     
		 int anos = anoAtual - anoNascimento;
		 int meses = mesAtual - mesNascimento; 
		 int dias = diaAtual - diaNascimento;
		
		//Transformando anos e meses em dias
		 
		 int anosEmDias = anos * diasDoAno;
		 int mesesEmDias = meses * diasDoMes;
		 int resultado = anosEmDias + mesesEmDias + dias;
		 System.out.println(resultado);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	     
		 
		
		
		 
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
		  
		
	}

}
