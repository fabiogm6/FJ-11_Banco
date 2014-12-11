package br.com.empresa.banco;

public class MainPrincipal {
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		Conta cc1 = new ContaCorrente();
		Conta cp1 = new ContaPoupanca();

		c1.deposita(1010);
		System.out.println(c1); // O toString na classe conta é chamado pela classe PrintStream
		//		c1.saca(1020);
		// teste de tratamento de erro
 		try {
			//c1.saca(0);
			c1.saca(1020);
		}
//		catch (IllegalArgumentException e) {
//			System.out.println(e.getMessage());
// ou eu criei minha exceção
 		catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());		
		}
 	// ou pode ter vários catchs:
 		// catch (IOException ex) {
 		//  bloco catch 1
 		// } catch (SQLException sqlex) {
 		//  bloco catch 2
 		// } finally {
 		//  bloco que será sempre executado, independente
 		//  se houve ou não exception e se ela foi tratada ou não
 		//}

		cc1.deposita(1000);
		cp1.deposita(1000);
		if (cc1.equals(cp1)) {System.out.println("cc1 igual a cp1 " + cc1.saldo + " " + cp1.saldo);}
		else {System.out.println("cc1 diferente cp1 "+ cc1.saldo + " " + cp1.saldo);}
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		adc.roda(c1);
		adc.roda(cc1);
		adc.roda(cp1);
		
		System.out.println("Saldo Total =" + adc.getSaldoTotal());		
		
	}
}
