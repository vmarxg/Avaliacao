package classeAbtratas_Interfaces_Heranca_Polimorfismo_Composicao;

public class CreditoImobiliario extends Credito implements Emprestimos{

	public CreditoImobiliario(Conta conta, double valorCredito, double jurosMes, int numMeses) {
		super(conta, valorCredito, jurosMes, numMeses);
	}

	@Override
	public void calculoJuros() {
		
	}

	@Override
	public String toString() {
		return "CreditoImobiliario [valorCredito=" + valorCredito + ", jurosMes=" + jurosMes + ", numMeses=" + numMeses
				+ "]\n";
	}	
	
}