package br.com.infnet.animais;

public class Avestruz extends Ave {
	
	public Avestruz() {
		tamanhoOvo = 10;
	}

	public void correr() {
		System.out.println(this.getClass().getName() + ": correndo");
	}

	public void colocarOvo() {
		System.out.println(this.getClass().getName() + ": colocando ovo de tamanho " + tamanhoOvo);
	}
}
