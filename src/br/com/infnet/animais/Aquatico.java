package br.com.infnet.animais;

public class Aquatico extends Mamifero {

	private int quantNadadeiras = 2;

	public void nadar() {
		System.out.println(this.getClass().getName() + ": nadando com " + quantNadadeiras + " nadadeiras");
	}

}
