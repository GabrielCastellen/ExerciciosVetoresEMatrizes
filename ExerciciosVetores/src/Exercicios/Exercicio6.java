package Exercicios;

public class Exercicio6 {

	public static void main(String[] args) {
		InfNum inf = new InfNum();
		
		final int TAM = 20;
		
		int vetor[] = new int[TAM];
		
		int k;
		int contPar = 0;
		int contImpar = 0;
		
		for(k = 0; k < TAM; k++) {
			vetor[k] = inf.infNumInt();
			if(vetor[k]%2 == 0)
				contPar++;
			else
				contImpar++;
		}
		
		final int TamPar = contPar;
		final int TamImpar = contImpar;
		
		int PARES[] = new int[TamPar];
		int IMPARES[] = new int[TamImpar];
		
		System.out.print("Números Informados: ");
		for(k = 0; k < TAM; k++) {
			System.out.print(vetor[k] + " | ");
		}
		System.out.println();
		
		int auxEntrada;
		
		if(TamPar > 0) {
			auxEntrada = 0;
			for(k = 0; k < TAM; k++) {
				if(vetor[k]%2 == 0) {
					PARES[auxEntrada] = vetor[k];
					auxEntrada++;
				}
			}
			System.out.print("Pares: ");
			for(k = 0; k < TamPar; k++) 
				System.out.print(PARES[k] + " | ");
			
			System.out.println();
		}
		
		if(TamImpar > 0) {
			auxEntrada = 0;
			for(k = 0; k < TAM; k++) {
				if(vetor[k]%2 != 0) {
					IMPARES[auxEntrada] = vetor[k];
					auxEntrada++;
				}
			}
			System.out.print("Ímpares: ");
			for(k = 0; k < TamImpar; k++) 
				System.out.print(IMPARES[k] + " | ");
		}
	}

}
