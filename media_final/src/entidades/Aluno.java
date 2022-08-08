package entidades;

public class Aluno {
	public String nome;
	public double a;
	public double b;
	public double c;
	
	public double mediaFinal() {
		return a + b +c;
	}
	
	public double faltou() {
		return 60 - mediaFinal();
	}

}
