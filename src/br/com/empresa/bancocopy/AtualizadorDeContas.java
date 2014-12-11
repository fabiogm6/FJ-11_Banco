package br.com.empresa.bancocopy;


public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	// construtores
	public AtualizadorDeContas(double selic)
		{this.selic = selic;}

	public void roda(Conta c)
		{
		// aqui você imprime o saldo anterior, 
		System.out.println("Saldo Anterior:  " + c.getSaldo());

		// atualiza a conta,
		c.atualiza(this.selic);

		// e depois imprime o saldo final
		System.out.println("Saldo Final:  " + c.getSaldo());

		// lembrando de somar o saldo final ao atributo saldoTotal
			// this.saldoTotal = this.saldoTotal + c.getSaldo();
			this.saldoTotal += c.getSaldo();
		}

	// outros métodos, colocar o getter para saldoTotal!
	public double getSaldoTotal()
		{
		return this.saldoTotal;
		}
}
