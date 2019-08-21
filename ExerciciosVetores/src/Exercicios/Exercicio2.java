package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		InfNum inf  = new InfNum();
		
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 10;
		
		int vet[] = new int[TAM];
		int k;
		for(k = 0; k < TAM ; k++) {
			vet[k] = inf.infNumInt();
		}
		for(k = TAM-1; k>=0 ; k--) {
			System.out.print(vet[k] + " | ");
		}
		
		entrada.close();
		
	}

}
