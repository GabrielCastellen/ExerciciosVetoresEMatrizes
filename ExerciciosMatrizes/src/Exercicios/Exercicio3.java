package Exercicios;

public class Exercicio3 {

	public static void main(String[] args) {
		InfNum inf = new InfNum();
		int N = inf.infNumIntM("Informe a quantidade de alunos: ");
		while(N < 1) {
			N = inf.infNumIntM("Valor inválido, informe outro: ");
		}
		final int Qprov = 2;
		
		String nomes[] = new String[N];
		float notas[][] = new float[N][Qprov];
		
		int a,p;
		for(a = 0; a < N; a++) {
			nomes[a] = inf.infTexto("Nome: ");
			for(p = 0; p < Qprov; p++) {
				notas[a][p] = inf.infNotaNumerada(p+1);
			}
		}
		
		int MaiorNota1 = 0;
		int MaiorNota2 = 0;
		int MenorNota1 = 0;
		int MenorNota2 = 0;
		int maiorMedia = 0;
		int menorMedia = 0;
		
		float somaDaTurma = 0;
		
		System.out.println();
		float soma[] = new float[N];
		for(a = 0; a < N; a++) {
			System.out.print("Aluno: " + nomes[a] + ", Notas: ");
			soma[a] = 0;
			for(p = 0; p < Qprov; p++) {
				somaDaTurma = somaDaTurma + notas[a][p];
				System.out.printf("%.1f ",notas[a][p]);
				soma[a] = soma[a] + notas[a][p];
				if(notas[a][p] > notas[MaiorNota1][MaiorNota2]) {
					MaiorNota1 = a;
					MaiorNota2 = p;
				}
				else {
					if(notas[a][p] < notas[MenorNota1][MenorNota2]) {
						MenorNota1 = a;
						MenorNota2 = p;
					}
				}	
			}
			if(soma[a] > soma[maiorMedia])
				maiorMedia = a;
			else {
				if(soma[a] < soma[menorMedia])
					menorMedia = a;
			}
			System.out.printf(", média: %.1f %n",(soma[a]/Qprov));
		}
		
		System.out.printf("Maior nota: %s (%.1f) %n", nomes[MaiorNota1], notas[MaiorNota1][MaiorNota2]);
		System.out.printf("Menor nota: %s (%.1f) %n", nomes[MenorNota1], notas[MenorNota1][MenorNota2]);
		System.out.printf("Maior média:  %s (%.1f) %n", nomes[maiorMedia], soma[maiorMedia]/Qprov);
		System.out.printf("Menor média:  %s (%.1f) %n", nomes[menorMedia], soma[menorMedia]/Qprov);
		float mediaGeral = somaDaTurma/(N*Qprov);
		System.out.printf("Média da turma: %.1f %n", mediaGeral );
		System.out.print("Alunos acima da média geral: ");
		for(a = 0; a < N; a++) {
			if(soma[a]/Qprov > mediaGeral)
				System.out.print(nomes[a] + ", ");
		}
		System.out.println();
		System.out.print("Alunos abaixo da média geral: ");
		for(a = 0; a < N; a++) {
			if(soma[a]/Qprov < mediaGeral)
				System.out.print(nomes[a] + ", ");
		}
	}

}
