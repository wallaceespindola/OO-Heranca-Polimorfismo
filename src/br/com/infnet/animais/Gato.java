package br.com.infnet.animais;

public class Gato extends Terrestre {
	
	public Gato() {
		som = "miau";
	}

	public void fugirCachorros() {
		System.out.println(this.getClass().getName() + ": fugindo de caes");
	}

}
