package exercicio1;

import java.util.Scanner;

public class Principal extends Calculos {
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		Calculos calculos = new Calculos();
		
		System.out.print("Digite um valor: ");
		calculos.setV1(leia.nextDouble());
		System.out.print("Digite outro valor: ");
		calculos.setV2(leia.nextDouble());
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("A soma desses valores: " + calculos.soma(calculos.getV1(), calculos.getV2()));
		System.out.println("A subtração desses valores: " + calculos.subtracao(calculos.getV1(), calculos.getV2()));
		System.out.println("A multiplicação desses valores: " + calculos.multiplicacao(calculos.getV1(), calculos.getV2()));
		System.out.println("A divisão desses valores: " + calculos.divisao(calculos.getV1(), calculos.getV2()));
		System.out.println("------------------------------------------------------------------------------");
	}
	
	
}
