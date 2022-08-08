package aplication;

import java.util.Scanner;

import entidades.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.print("Digite a nota do primeiro trimestre: ");
		aluno.a = sc.nextDouble();
		System.out.print("Digite a nota do segundo trimestre: ");
		aluno.b = sc.nextDouble();
		System.out.print("Digite a nota do terceiro trimestre: ");
		aluno.c = sc.nextDouble();
		
		if(aluno.mediaFinal() > 60) {
			System.out.print("Passou " +aluno.mediaFinal());
		} else {
			System.out.println("Reprovado " +aluno.mediaFinal());
			System.out.print("Faltou: " +aluno.faltou());
		}
		
		sc.close();

	}

}
