package br.com.infnet.animais;

public class Animal {

	protected String nome = "nome de animal generico";

	protected int idade = 0;
	
	protected String som = "som generico";

	public void nascer() {
		System.out.println(this.getClass().getName() + ": nasce");
	}

	public void morrer() {
		System.out.println(this.getClass().getName() + ": morre");
	}

	public void respirar() {
		System.out.println(this.getClass().getName() + ": respira");
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public void emitirSom() {
		System.out.println(this.getClass().getName() + ": faz --> " + som);
	}

}
