package Exercicios;

public class Exercicio1 {
	
	public static void main(String[] args) {
		InfNum inf = new InfNum();
		
		int valEnt = inf.infNumIntM("Informe um número ímpar entre 3 e 11: ");
		while(valEnt%2 == 0 || valEnt<3 || valEnt >11) {
			valEnt = inf.infNumIntM("O valor deve ser ímpar entre 3 e 11: ");
		}
		
		int matriz[][] = new int[valEnt][valEnt];
		
		int MaiorK = 0;
		int MaiorJ = 0;
		int MenorK = 0;
		int MenorJ = 0;
		
		int contPar = 0;
		int contImpar = 0;
		
		int k,j;
		float soma = 0;
		int somaDP = 0;
		int somaDS = 0;
		
		for(k=0; k< valEnt; k++) {
			for(j=0; j< valEnt; j++) {
				matriz[k][j] = inf.infNumIntM("Informe o número na " +(k+1) +"ª linha e " + (j+1) +"ª coluna: ");
				soma = soma + matriz[k][j];
				if(matriz[k][j] > matriz[MaiorK][MaiorJ]) {
					MaiorK = k;
					MaiorJ = j;
				}
				else {
					if(matriz[k][j] < matriz[MenorK][MenorJ]) {
						MenorK = k;
						MenorJ = j;
					}
				}
				if(matriz[k][j]%2 == 0)
					contPar++;
				else
					contImpar++;
				
				if(k == j) {
					somaDP = somaDP + matriz[k][j];
				}
				if(((k+1)+(j+1)) == (valEnt+1)) {
					somaDS = somaDS + matriz[k][j];
				}
			}
		}
		System.out.println("Soma dos valores: " + (int)soma);
		System.out.printf("Média dos valores: %.2f %n",(soma/(valEnt*valEnt)));
		System.out.println("Maior valor: " + matriz[MaiorK][MaiorJ]);
		System.out.println("Menor valor: " + matriz[MenorK][MenorJ]);
		System.out.println("Pares: " + contPar);
		System.out.println("Ímpares: " + contImpar);
		System.out.println("Soma da diagonal principal: " + somaDP);
		System.out.println("Soma da diagonal secundária: " + somaDS);
		for(k=0; k< valEnt; k++) {
			for(j=0; j< valEnt; j++) {
				System.out.print("[" + matriz[k][j] + "]");
			}
			System.out.println();
		}
	}
}
