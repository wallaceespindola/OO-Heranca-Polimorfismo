package br.com.infnet.animais;

public class Cachorro extends Terrestre {
	
	public Cachorro() {
		som = "au au";
	}

	public void atacarGatos() {
		System.out.println(this.getClass().getName() + ": atacando gatos ");
	}

}
