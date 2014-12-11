package br.com.empresa.banco;
public class SaldoInsuficienteException extends RuntimeException {
	// para transformar essa Exception de unchecked para checked,
	// obrigando a quem chama esse método a
	// dar try-catch, ou throws
	// usar --> public class SaldoInsuficienteException extends Exception {
	// senão --> public class SaldoInsuficienteException extends RuntimeException {
	// vide método 'saca' na classe Conta
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SaldoInsuficienteException(String message) {
		super(message);
	}

}
