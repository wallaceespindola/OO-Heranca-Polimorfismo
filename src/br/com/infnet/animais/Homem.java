package br.com.infnet.animais;

public class Homem extends Terrestre {
	
	public Homem() {
		idade = 30;
		nome = "Pedro";
		possuiCalda = false;
		som = "Oi, tudo bem?";
	}

	private double salario = 7.500d;
	
	public void falarSalario() {
		System.out.println("Meu salario é --> " + salario);
	}

}
