package br.com.empresa.bancocopy;

public class MainPrincipal {
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		Conta cc1 = new ContaCorrente();
		Conta cp1 = new ContaPoupanca();

		c1.deposita(1010);
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
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		adc.roda(c1);
		adc.roda(cc1);
		adc.roda(cp1);
		
		System.out.println("Saldo Total =" + adc.getSaldoTotal());		
		
	}
}
