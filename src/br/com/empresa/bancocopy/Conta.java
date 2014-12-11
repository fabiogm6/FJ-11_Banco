package br.com.empresa.bancocopy;

public class Conta {
	protected double saldo;

	// getter setter
	public double getSaldo() {
		return this.saldo;
	}

	// methods
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	boolean saca(double valor) {
		if (this.saldo < valor) {
			// return false;
			// throw new IllegalArgumentException("Saldo Insuficiente na conta - Nada realizado");
			throw new SaldoInsuficienteException("Saldo Insuficiente - Nada realizado");
		} else {
			this.saldo -= valor;
		}
		return true;
	}

}
