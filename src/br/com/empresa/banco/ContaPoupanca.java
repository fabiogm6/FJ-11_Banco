package br.com.empresa.banco;

public class ContaPoupanca extends Conta {

	public void atualiza(double taxa) {
		super.atualiza(taxa * 3);
	}

}
