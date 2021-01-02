package br.com.infnet.animais;

public class Terrestre extends Mamifero {

	protected boolean possuiCalda;

	public void andar() {
		System.out.println(this.getClass().getName() + ": andando");
	}

	public void verificarCalda() {
		System.out.println(this.getClass().getName() + ": tem calda? " + possuiCalda);
	}
	
	public void correr() {
		System.out.println(this.getClass().getName() + ": correndo");
	}

}
