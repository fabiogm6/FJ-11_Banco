package br.com.empresa.banco;

public class ContaCorrente extends Conta implements Tributavel {

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	};

	public void atualiza(double taxa) {
		// TODO Auto-generated method stub
		super.atualiza(taxa * 2);
	}
	
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	} 

}
