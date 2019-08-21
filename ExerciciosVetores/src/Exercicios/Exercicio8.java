package Exercicios;

public class Exercicio8 {

	public static void main(String[] args) {
		InfNum inf = new InfNum();
		
		final int tam = 5;
		int vet[] = new int[tam];
		
		int soma = 0;
		
		int k;
		for(k = 0; k<tam; k++) {
			vet[k] = inf.infNumInt();
			soma = soma + vet[k];
		}
		int multi = vet[0];
		for(k = 1; k<tam; k++) {
			multi = multi * vet[k];
		}
		
		System.out.println("Soma dos números: " + soma);
		System.out.println("Multiplicação dos números: " + multi);
		System.out.println("Números: ");
		for(k = 0; k<tam; k++) {
			System.out.print(vet[k] + " | ");
		}
	}

}
