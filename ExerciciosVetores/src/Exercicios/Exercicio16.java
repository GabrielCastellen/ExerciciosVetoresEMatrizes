package Exercicios;

public class Exercicio16 {

	public static void main(String[] args) {
		InfNum inf = new InfNum();
		
		int val = inf.infNumIntM("Informe o tamanho do gráfico: ");
		while(val <= 0) {
			val = inf.infNumIntM("O valor deve ser maior que zero: ");
		}
		final int N = val;
		
		int vetor[] = new int[N];
		int k;
		for(k = 0; k < N; k++) {
			vetor[k] = inf.infNumIntM("Informe o " + (k+1) + "° valor: ");
			while(vetor[k] < 0 || vetor[k] > 20) {
				vetor[k] = inf.infNumIntM("O valor deve ser entre 0 e 20: ");
			}
		}
		int j;
		for(k = 0; k < N; k++) {
			System.out.print(vetor[k] + ": ");
			for(j = 0; j < vetor[k]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
	}

}
