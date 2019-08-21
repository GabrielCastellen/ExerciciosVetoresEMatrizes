package Exercicios;

public class Exercicio7 {

	public static void main(String[] args) {
		InfNum inf = new InfNum();
		
		final int TamVet = 10;
		final int Q_notas = 4;
		final int media = 7;
		
		float medias[] = new float[10];
		float nota;
		float soma;
		
		int k,l;
		for(k = 0; k<TamVet; k++) {
			System.out.println(k+1 + "° aluno:");
			soma =0;
			for(l = 0; l < Q_notas; l++) {
				nota = inf.infNotaNumerada(l+1);
				soma = soma + nota;
			}
			medias[k] = soma/Q_notas;
		}
		
		int contAcima = 0;
		for(k = 0; k<TamVet; k++) {
			if(medias[k] >= media) {
				contAcima++;
			}
		}
		
		if(contAcima > 0) {
			System.out.println(contAcima + " alunos com média maior ou igual a " + media);
		}
	}

}
