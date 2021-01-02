package br.com.infnet.teste;

import br.com.infnet.animais.Animal;
import br.com.infnet.animais.Avestruz;
import br.com.infnet.animais.Cachorro;
import br.com.infnet.animais.Gato;
import br.com.infnet.animais.Homem;
import br.com.infnet.animais.Terrestre;

public class TestaAnimais {

	public static void main(String[] args) {

		Animal an = new Animal();
		an.getIdade();
		an.getNome();
		an.nascer();
		an.respirar();
		an.morrer();
		an.emitirSom();
		//an.correr(); ==> nao possui

		System.out.println("###################################################################");
		
		Avestruz av = new Avestruz();
		av.getIdade();
		av.getNome();
		av.nascer();
		av.respirar();
		av.morrer();
		av.emitirSom();
		av.voar();
		av.colocarOvo();
		av.correr();
		
		System.out.println("###################################################################");
		
		Cachorro cachorro = new Cachorro();
		cachorro.getIdade();
		cachorro.getNome();
		cachorro.nascer();
		cachorro.respirar();
		cachorro.morrer();
		cachorro.emitirSom();
		cachorro.atacarGatos();
		cachorro.correr();
		//cachorro.voar(); ==> nao possui
		//cachorro.colocarOvo(); ==> nao possui
		cachorro.correr();
		
		System.out.println("###################################################################");
		
		Gato gato = new Gato();
		gato.getIdade();
		gato.getNome();
		gato.nascer();
		gato.respirar();
		gato.morrer();
		gato.emitirSom();
		gato.fugirCachorros();
		gato.correr();
		//gato.voar(); ==> nao possui
		//gato.colocarOvo(); ==> nao possui
		gato.correr();
		
		System.out.println("###################################################################");
		
		Homem homem = new Homem();
		homem.getIdade();
		homem.getNome();
		homem.nascer();
		homem.respirar();
		homem.morrer();
		homem.emitirSom();
		//homem.fugirCachorros();
		//homem.voar(); ==> nao possui
		//homem.colocarOvo(); ==> nao possui
		homem.correr();
		homem.falarSalario();
		
		System.out.println("###################################################################");
		
		Animal poliCachorro = new Cachorro();
		poliCachorro.getIdade();
		poliCachorro.getNome();
		poliCachorro.nascer();
		poliCachorro.respirar();
		poliCachorro.morrer();
		poliCachorro.emitirSom();
		//poliCachorro.atacarGatos(); ==> nao possui
		//poliCachorro.correr(); ==> nao possui
		//poliCachorro.voar(); ==> nao possui
		//poliCachorro.colocarOvo(); ==> nao possui
		
		System.out.println("###################################################################");
		
		Animal poliGato = new Gato();
		poliGato.getIdade();
		poliGato.getNome();
		poliGato.nascer();
		poliGato.respirar();
		poliGato.morrer();
		poliGato.emitirSom();
		//poliGato.correr(); ==> nao possui
		//poliGato.fugirCachorros(); ==> nao possui
		//poliGato.voar(); ==> nao possui
		//poliGato.colocarOvo(); ==> nao possui
		
		System.out.println("###################################################################");
		
		Terrestre poliGato2 = new Gato();
		poliGato2.getIdade();
		poliGato2.getNome();
		poliGato2.nascer();
		poliGato2.respirar();
		poliGato2.morrer();
		poliGato2.emitirSom();
		poliGato2.correr();
		//poliGato2.fugirCachorros(); ==> nao possui
		//poliGato.voar(); ==> nao possui
		//poliGato.colocarOvo(); ==> nao possui
	}

}
