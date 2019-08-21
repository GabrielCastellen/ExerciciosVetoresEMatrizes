package Exercicios;

import java.util.Random;

public class Exercicio9 {

	public static void main(String[] args) {
		InfNum inf = new InfNum();
		
		final int tam = 26;
		char letras[] = {'a','e','i','o','u','b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		
		int tamanho_senha = inf.infNumIntM("Informe o tamanho da senha: ");
		while(tamanho_senha > tam || tamanho_senha < 1) {
			tamanho_senha = inf.infNumIntM("Tamanho inválido, informe outro: ");
		}
		
		int i;
		
		Random aleatorio = new Random();
		
		for(i = 0; i < tamanho_senha; i++ ) {
			if(i%2 == 0) {
				System.out.print(letras[aleatorio.nextInt(21) +5]);
			}
			else {
				System.out.print(letras[aleatorio.nextInt(5)]);
			}
		}
		
	}

}
