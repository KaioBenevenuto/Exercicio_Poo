package exercicio2;

public class Matematica {
	
	protected double valor1D, valor2D, resultadoD;
	protected int valor1I, valor2I, resultadoI;
	protected int[] valor = new int [4];
	
	//--------------------------------------------------------------------------------------------

	public double soma(double v1, double v2) {
		this.setResultadoD(v1 + v2);
		return this.getResultadoD();
	}
	
	public int soma(int v1, int v2) {
		this.setResultadoI(v1 + v2);
		return this.getResultadoI();
	}
	
	public int soma(int v1, int v2, int v3, int v4) {
		this.setResultadoI(v1 + v2 + v3 + v4);
		return this.getResultadoI();
	}
	
	
	
	public double subtracao(double v1, double v2) {
		this.setResultadoD(v1 - v2);
		return this.getResultadoD();
	}
	
	public int subtracao(int v1, int v2) {
		this.setResultadoI(v1 - v2);
		return this.getResultadoI();
	}
	
	public int subtracao(int v1, int v2, int v3, int v4) {
		this.setResultadoI(v1 - v2 - v3 - v4);
		return this.getResultadoI();
	}
	
	//--------------------------------------------------------------------------------------------
	
	public double getValor1D() {
		return this.valor1D;
	}
	public void setValor1D(double v) {
		this.valor1D = v;
	}
	
	public double getValor2D() {
		return this.valor2D;
	}
	public void setValor2D(double v) {
		this.valor2D = v;
	}
	
	public double getResultadoD() {
		return this.resultadoD;
	}
	public void setResultadoD(double r) {
		this.resultadoD = r;
	}
	
	
	
	public int getValor1I() {
		return this.valor1I;
	}
	public void setValor1I(int v) {
		this.valor1I = v;
	}
	
	public int getValor2I() {
		return this.valor2I;
	}
	public void setValor2I(int v) {
		this.valor2I = v;
	}
	
	public int getResultadoI() {
		return this.resultadoI;
	}
	public void setResultadoI(int r) {
		this.resultadoI = r;
	}

}
