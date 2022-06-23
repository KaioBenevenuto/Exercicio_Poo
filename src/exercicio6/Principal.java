package exercicio6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		p1.nome = leia.next();
		System.out.print("Digite sua idade: ");
		p1.idade = leia.nextInt();
		System.out.print("Digite seu sexo: ");
		p1.sexo = leia.next();
		System.out.println("-------------------------------");
		System.out.print("Digite seu nome: ");
		p2.nome = leia.next();
		System.out.print("Digite sua idade: ");
		p2.idade = leia.nextInt();
		System.out.print("Digite seu sexo: ");
		p2.sexo = leia.next();
		System.out.println("-------------------------------");
		System.out.print("Digite seu nome: ");
		p3.nome = leia.next();
		System.out.print("Digite sua idade: ");
		p3.idade = leia.nextInt();
		System.out.print("Digite seu sexo: ");
		p3.sexo = leia.next();
		
		System.out.println("===============================");
		System.out.println("1-Pessoa");
		System.out.println("Nome: " + p1.nome);
		System.out.println("Idade: " + p1.idade);
		System.out.println("Sexo: " + p1.sexo);
		System.out.println("-------------------------------");
		System.out.println("2-Pessoa");
		System.out.println("Nome: " + p2.nome);
		System.out.println("Idade: " + p2.idade);
		System.out.println("Sexo: " + p2.sexo);
		System.out.println("-------------------------------");
		System.out.println("3-Pessoa");
		System.out.println("Nome: " + p3.nome);
		System.out.println("Idade: " + p3.idade);
		
		System.out.println("Sexo: " + p3.sexo);
	}

}
