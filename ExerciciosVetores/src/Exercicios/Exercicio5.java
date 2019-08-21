package Exercicios;

public class Exercicio5 {

	public static void main(String[] args) {
		InfNum inf = new InfNum();
		MetComparar compara = new MetComparar();
		final int TAM = 10;
		
		char vet[] = new char[TAM];
		
		int k;
		int contCons = 0;
		
		for(k = 0; k<TAM; k++) {
			vet[k] = inf.infChar("Informe uma letra: ");
		}
		for(k = 0; k<TAM; k++) {
			if(!compara.vogal(vet[k]))
				contCons++;
		}
		System.out.println("Número de consoantes: " + contCons);
		if(contCons > 0) {
			System.out.print("Consoantes: ");
			for(k = 0; k<TAM; k++) {
				if(!compara.vogal(vet[k]))
					System.out.print(vet[k] + " | ");
			}
		}
	}

}
