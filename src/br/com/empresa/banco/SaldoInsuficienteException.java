package br.com.empresa.banco;
public class SaldoInsuficienteException extends RuntimeException {
	// para transformar essa Exception de unchecked para checked,
	// obrigando a quem chama esse m�todo a
	// dar try-catch, ou throws
	// usar --> public class SaldoInsuficienteException extends Exception {
	// sen�o --> public class SaldoInsuficienteException extends RuntimeException {
	// vide m�todo 'saca' na classe Conta
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SaldoInsuficienteException(String message) {
		super(message);
	}

}
