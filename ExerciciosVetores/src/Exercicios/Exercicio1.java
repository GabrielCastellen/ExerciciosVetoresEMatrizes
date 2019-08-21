package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		
		int vet[] = new int[TAM];
		
		int k;
		
		for(k=0;k< TAM;k++) {
			vet[k] = entrada.nextInt();
		}
		
		for(k=0;k< TAM;k++) {
			
			System.out.print(vet[k] + " | ");
		}

		entrada.close();
		
	}
	
}