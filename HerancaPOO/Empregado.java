package POO;

public class Empregado extends Pessoa{

	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	private double porcentagemImposto; 

	public void setCodigoSetor(int codigoSetor){this.codigoSetor = codigoSetor;}
	public void setSalarioBase(float salarioBase){this.salarioBase = salarioBase;}
	public void setImposto(float imposto){this.imposto = imposto;}
	public void setPorcentagemImposto(double porcentagemImposto){this.porcentagemImposto = porcentagemImposto;}
	public double getPorcentagemImposto(){return (porcentagemImposto);}
	public int   getCodigoSetor(){return(codigoSetor);}
	public float getSalarioBase(){return(salarioBase);}
	public float getImposto    (){return(imposto);}

	public double salario () {
		double salario = salarioBase - ((salarioBase/100)*porcentagemImposto);
		return salario;
	}
	}
