package Aulas01;

public class Patinete {
	
	
	private String marcaDoPatinete;
	private String corDoPatinete;
	private String rodasDoPatinete;
	private String rolamentoDoPatinete;
	
	
	public Patinete (String Xiaomi, String azul, String oxelo, String abec5) {
		
		
		this.marcaDoPatinete = Xiaomi;
		this.corDoPatinete = azul;
		this.rodasDoPatinete = oxelo;
		this.rolamentoDoPatinete= abec5;
	}
	
	
	public String getmarcaDoPatinete() {
		 return marcaDoPatinete; 
		
	}

	public String getcor() {
		 return corDoPatinete; 
		
	}
	
	public String getrodasDoPatinete() {
		 return rodasDoPatinete; 
		
	}
	
	public String getrolamentoDoPatinete() {
		 return rolamentoDoPatinete; 
		
	}
	   
	   @Override
	   public String toString() {
		return "Patinete\n"+ 
				"\nmarcaDoPatinete = " + marcaDoPatinete + "\ncorDoPatinete = " + corDoPatinete
				+ "\nrodasDoPatinete = " + rodasDoPatinete + "\nrolamentoDoPatinete = " + rolamentoDoPatinete + "";
	}
	
	
	
	
}
