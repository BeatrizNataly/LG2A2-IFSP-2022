package Calc;

public class Calculadora{
	private double result;
	private int operacao;
	
	public Calculadora(int operacao) {
		super();
		this.operacao = operacao;
		doOperation();
	}

	private void doOperation() {
		switch(operacao) {
		case 1: result = new Soma(SolicitacaoScanner.getDecimal1(), SolicitacaoScanner.getDecimal2()).calcular();
			break;
		case 2: result = new Subtracao(SolicitacaoScanner.getDecimal1(), SolicitacaoScanner.getDecimal2()).calcular();
			break;
		case 3: result = new Multiplicacao(SolicitacaoScanner.getDecimal1(), SolicitacaoScanner.getDecimal2()).calcular();
			break;
		case 4: result = new Divisao(SolicitacaoScanner.getDecimal1(), SolicitacaoScanner.getDecimal2()).calcular();
			break;
			default: System.out.println("Erro ao realizar a operação.");
		}
	}
	
	public double getResult() {
		return result;
	}
	
}
