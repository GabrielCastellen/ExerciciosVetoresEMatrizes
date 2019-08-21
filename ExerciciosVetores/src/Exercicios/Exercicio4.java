package Exercicios;

public class Exercicio4 {

	public static void main(String[] args) {
		InfNum inf = new InfNum();
		
		final int TAM = 4;
		float vet[] = new float[TAM];

		int k;
		float soma = 0;
		
		for(k = 0; k<TAM; k++) {
			vet[k] = inf.infNota();
			soma = soma + vet[k];
		}
		
		for(k = 0; k<TAM; k++) {
			System.out.print(vet[k] + " | ");
		}
		
		float media = soma/TAM;
		System.out.println("Média: " + media);
	}

}
