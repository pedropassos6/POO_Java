package aplication;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.print("Entre com as medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.print("Digite as medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		
		
		double areaY = y.area();
		
		System.out.printf("Área do Triangulo X: %.4f%n", areaX);
		System.out.printf("Área do Triangulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Área do Triangulo X maior");
		} else {
			System.out.println("Área do Triangulo Y maior");
		}
		sc.close();

	}

}
