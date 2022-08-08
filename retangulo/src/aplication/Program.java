package aplication;
import java.util.Scanner;
import entidade.Retangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo rect = new Retangulo();
		
		System.out.print("Digite a altura do retangulo: ");
		rect.altura = sc.nextDouble();
		System.out.print("Digite a largura do retangulo: ");
		rect.largura = sc.nextDouble();
		System.out.printf("%.2f%n", rect.area());
		System.out.printf("%.2f%n", rect.perimetro());
		System.out.printf("%.2f%n", rect.diagonal());
		
		sc.close();
		
		

	}

}
