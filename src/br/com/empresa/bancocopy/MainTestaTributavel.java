package br.com.empresa.bancocopy;

public class MainTestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());

		Tributavel t = cc;
		System.out.println(t.calculaTributos());
	}

}
