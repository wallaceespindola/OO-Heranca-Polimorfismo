package br.com.infnet.animais;

public class Baleia extends Aquatico {

	public Baleia() {
		idade = 50;
	}
	
	public void comerKrill() {
		System.out.println(this.getClass().getName() + ": comendo krill");
	}

}
