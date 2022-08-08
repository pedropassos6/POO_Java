package aplication;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		System.out.print("Quantidade: ");
		product.quantity = sc.nextInt();
		System.out.print("Preco: ");
		product.price = sc.nextDouble();
		
		//System.out.println("nome: " + product.name + ", quantidade: " + product.quantity + ", preco: " + product.price);
		
		System.out.println();
		System.out.println("Product data:  " + product);
		
		System.out.println("Entre com a quantidade de produtos adicionados: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Quantidade atualizada: " + product);
		
		System.out.println("Entre com a quantidade de produtos a serem removidas: ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		
		System.out.println();
		System.out.println("Quantidade atualizada: " + product);
		
		
		
		
		sc.close();
		

	}

}
