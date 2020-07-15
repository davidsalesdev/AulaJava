package Aulas01;

import java.util.Scanner;

public class lacosderepeticaodowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		int num,somanum=0;
		
		do {
			
			System.out.println("Digite um numero: ");
			num = ler.nextInt();
			
			somanum = somanum+num;
			
		} while(num!=0);
			System.out.println("Soma dos numeros: "+somanum);
	}
	
	

}
