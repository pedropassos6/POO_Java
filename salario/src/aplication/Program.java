package aplication;

import java.util.Scanner;
import entidade.Funcionario;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario fun = new Funcionario();
		System.out.print("Digite o nome do funcionario: ");
		fun.nome = sc.nextLine();
		System.out.print("Digite o salario do funcionario: ");
		fun.salarioBruto = sc.nextDouble();
		System.out.print("Digite o imposto: ");
		fun.imposto = sc.nextDouble();
		System.out.printf("Nome:  " + fun.nome + ", $: %.2f", fun.salarioLiquido());
		
		System.out.println();
		System.out.println("Digite a porcentagem de aumento de salario: ");
		double porcento = sc.nextDouble();
		fun.aumentoSalario(porcento);
		
		
		
		
		System.out.println();
		System.out.print(fun);
		
		sc.close();
		
		
	}

}
