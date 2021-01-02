package br.com.infnet.animais;

public class Ave extends Animal {

	private int patas = 2;

	protected int tamanhoOvo = 0;

	public void voar() {
		System.out.println(this.getClass().getName() + ": voando com " + patas + " patas");
	}

	public void colocarOvo() {
		System.out.println(this.getClass().getName() + ": colocando ovo de tamanho " + tamanhoOvo);
	}

}
