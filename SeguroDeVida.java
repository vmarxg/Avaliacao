package classeAbtratas_Interfaces_Heranca_Polimorfismo_Composicao;

public class SeguroDeVida {
	private double valorSeguro; 
	
	public SeguroDeVida(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	public double getValorSeguro() {
		return valorSeguro;
	}

	@Override
	public String toString() {
		return "SeguroDeVida [valorSeguro=" + valorSeguro + "]";
	}

	
}
