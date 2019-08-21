package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int soma =0;
		int numMaior = 0;
		int numMenor = 0;
		int vet[] = new int[TAM];
		
		int k;
		
		for(k=0;k< TAM;k++) {
			vet[k] = entrada.nextInt();
			soma = soma + vet[k];
		}
		
		System.out.print("| ");
		for(k=0;k< TAM;k++) {
			if(vet[k] > vet[numMaior])
				numMaior = k;
			else {
				if(vet[k] < vet[numMenor])
					numMenor = k;
			}
			System.out.print(vet[k] + " | ");
		}

		float media = soma/TAM;
		
		System.out.println();
		System.out.println("Soma: " + soma);
		System.out.println("Média " + media);
		System.out.println("Maior: " + vet[numMaior]);
		System.out.println("Menor: " + vet[numMenor]);
		
		boolean temPar = false;
		for(k=0;k< TAM;k++) {
			if(vet[k]%2 ==0) {
				if(!temPar)
					System.out.print("Pares: | ");
				System.out.print(vet[k] + " | ");
				temPar = true;
			}
		}
		
		boolean temImpar = false;
		for(k=0;k< TAM;k++) {
			if(vet[k]%2 !=0) {
				if(!temImpar) {
					System.out.println();
					System.out.print("Impares: | ");
				}
				System.out.print(vet[k] + " | ");
				temImpar = true;
			}
		}
		
		boolean temAcima = false;
		for(k=0;k< TAM;k++) {
			if(vet[k] > media) {
				if(!temAcima) {
					System.out.println();
					System.out.print("Números acima da média: | ");
				}
				System.out.print(vet[k] + " | ");
				temAcima = true;
			}
		}
		

		boolean temAbaixo = false;
		for(k=0;k< TAM;k++) {
			if(vet[k] < media) {
				if(!temAbaixo) {
					System.out.println();
					System.out.print("Números abaixo da média: | ");
				}
				System.out.print(vet[k] + " | ");
				temAbaixo = true;
			}
		}
	
		entrada.close();
	
	}
	
}
