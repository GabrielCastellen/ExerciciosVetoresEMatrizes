package Exercicios;

public class Exercicio14 {

	public static void main(String[] args) {
		InfNum inf = new InfNum();
		
		final int tam = 10;
		int vetorA[] = new int[tam];
		int vetorB[] = new int[tam];
		
		int vetorAB[] = new int[tam*2];
		
		int k;
		
		for(k=0; k<tam; k++) {
			vetorA[k] = inf.infNumIntM("Informe o " + (k+1) + "° número do vetor A: ");
		}
		for(k=0; k<tam; k++) {
			vetorB[k] = inf.infNumIntM("Informe o " + (k+1) + "° número do vetor B: ");
		}
		int l = 0;
		for(k=0; k<(tam*2); k = k+2) {
			vetorAB[k] = vetorA[l];
			l++;
		}
		l = 0;
		for(k=1; k<(tam*2); k = k+2) {
			vetorAB[k] = vetorB[l];
			l++;
		}
		for(k=0; k<(tam*2); k++) {
			System.out.println(vetorAB[k]);
		}
	}

}
