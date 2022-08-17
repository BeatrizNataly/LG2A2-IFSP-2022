package Calc;

public class Soma implements Operacao{

	private double resultado, num1, num2 = 0;

	public Soma(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public double calcular() {
		resultado = num1 + num2;
		return resultado;
	}

}
