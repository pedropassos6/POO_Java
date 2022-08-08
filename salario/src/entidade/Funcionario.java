package entidade;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido (){
		return salarioBruto - imposto;
	}
	
	public void aumentoSalario (double porcento) {
		salarioBruto += salarioBruto * porcento / 100;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
	}

}
