package exercicio1;

public class Calculos {
	
	protected double v1, v2, resultado;

	//---------------------------------------------------------------------------------------
	
	public double soma(double v1, double v2) {
		this.resultado = v1 + v2;
		return this.resultado;
	}
	
	public double subtracao(double v1, double v2) {
		this.resultado = v1 - v2;
		return this.resultado;
	}
	
	public double divisao(double v1, double v2) {
		this.resultado = v1 / v2;
		return this.resultado;
	}
	
	public double multiplicacao(double v1, double v2) {
		this.resultado = v1 * v2;
		return this.resultado;
	}
	
	//---------------------------------------------------------------------------------------

	public double getV1(){
		return this.v1;
	}
	public void setV1(double v) {
		this.v1 = v;
	}
	
	
	public double getV2(){
		return this.v2;
	}
	public void setV2(double v) {
		this.v2 = v;
	}
	
	
	public double getResultado(){
		return this.v1;
	}
	public void setResultado(double r) {
		this.resultado = r;
	}

	
}
