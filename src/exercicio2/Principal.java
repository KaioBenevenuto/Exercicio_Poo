package exercicio2;

import java.util.Scanner;

public class Principal extends Matematica {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		Scanner leia = new Scanner(System.in);
			
		//Recebe dois valores double e retorna um resultado double.
		System.out.print("Digite um valor: ");
		m.setValor1D(leia.nextDouble());
		System.out.print("Digite um valor: ");
		m.setValor2D(leia.nextDouble());
		System.out.println("Soma: "+m.soma(m.getValor1D(), m.getValor2D()));
		System.out.println("Subtração: "+m.subtracao(m.getValor1D(), m.getValor2D()));
		System.out.println("=========================================================");
		
		//Recebe dois valores inteiros e retorna um resultado inteiro.
		System.out.print("Digite um valor: ");
		m.setValor1I(leia.nextInt());
		System.out.print("Digite um valor: ");
		m.setValor2I(leia.nextInt());
		System.out.println("Soma: " + m.soma(m.getValor1I(), m.getValor2I()));
		System.out.println("Subtração: "+m.subtracao(m.getValor1I(), m.getValor2I()));
		System.out.println("=========================================================");
		
		//Recebe quatro valores inteiros e retorna um resultado inteiro(usando array).
		for (int cont = 0; cont < m.valor.length; cont++) {
			System.out.print("Digite um valor: ");
				m.valor[cont] = leia.nextInt();
		}
		System.out.println("Soma: "+m.soma(m.valor[0], m.valor[1], m.valor[2], m.valor[3]));
		System.out.println("Subtração: "+m.subtracao(m.valor[0], m.valor[1], m.valor[2], m.valor[3]));
		
	}

}
