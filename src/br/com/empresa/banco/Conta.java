package br.com.empresa.banco;
/**
* Classe responsável por moldar as Contas do Banco
* @author Fábio GM
* @version 1
* @category xyz
*/

public class Conta {
	protected double saldo;

	// getter setter
	public double getSaldo() {
		return this.saldo;
	}

	// lang methods
	public boolean equals(Object object) {
		Conta outraConta = (Conta) object;
		if (this.saldo == outraConta.saldo) {
		return true;
		}
		return false;
		}	
	
	public String toString() {
		return "toString - Uma conta com valor: " + this.saldo;
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
