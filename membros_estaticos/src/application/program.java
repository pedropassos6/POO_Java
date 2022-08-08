package application;
import java.util.Scanner;

import util.Calculadora;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculadora.circunferencia(raio);
		
		double v = Calculadora.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", Calculadora.PI);
		
		
		
		
		sc.close();

	}

}
