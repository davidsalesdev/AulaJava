package POO;


import javax.swing.Spring;

public class HerancaEmpregado {
	 public static void main (Spring args[]){
		 
	 }
		 public static void main (String args []) { 
				Pessoa Pessoa = new Pessoa();
				Pessoa.setNome("João");
				Pessoa.setEndereco("Rua Sobe e desce, n 70");		
				Pessoa.setTelefone("13 99999-9999");
				
				Empregado pessoa1 = new Empregado();
				pessoa1.setSalarioBase(3500);		
				pessoa1.setPorcentagemImposto(10);
				
				System.out.print(pessoa1.salario());
				System.out.println(Pessoa.getNome());
				System.out.println(Pessoa.getEndereco());
				System.out.println(Pessoa.getTelefone());
			}
}
			
