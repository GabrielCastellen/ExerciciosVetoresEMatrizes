package Exercicios;

import java.util.Random;

public class Exercicio5 {

	public static void main(String[] args) {
		Random randomico = new Random();
		InfNum inf = new InfNum();
		
		final int Q_Num = 6;
		
		int numeros[] = new int[Q_Num];
		
		int Q_Cartelas = inf.infNumIntM("Informe a quantidade de cartelas: ");
		while(Q_Cartelas < 1) {
			Q_Cartelas = inf.infNumIntM("A quantidade deve ser no mínimo uma: ");
		}
		
		int cartelas[][] = new int[Q_Cartelas][Q_Num];
		
		int k,h,i;
		for(k = 0; k < Q_Num; k++) {
				numeros[k] = randomico.nextInt(61);
				for(h = 0; h <k; h++) {
					while(numeros[k] == numeros[h]){
						numeros[k] = randomico.nextInt(61);
					}
				}
		}
		for(k = 0; k < Q_Cartelas; k++) {
			System.out.println((k+1) + "ª cartela ");
			for(h = 0; h < Q_Num; h++) {
				cartelas[k][h] = inf.infNumIntM((h+1) + "° número: ");
			}
		}
		int contAcertos[] = new int[Q_Cartelas];
		
		System.out.print("Números sorteados: ");
		
		for(k = 0; k < Q_Num; k++) {
			System.out.print(numeros[k] +" ");
		}
		
		System.out.println();
		
		for(k = 0; k < Q_Cartelas; k++) {
			contAcertos[k] = 0;
			for(h = 0; h < Q_Num; h++) {
				for(i = 0; i < Q_Num; i++) {
					if(cartelas[k][i] == numeros[h] )
						contAcertos[k]++;
				}
			}
		}
		for(k = 0; k < Q_Cartelas; k++) {
			System.out.println("Acertos " +(k+1) + "ª cartela: " + contAcertos[k]);
		}
		
	}

}
