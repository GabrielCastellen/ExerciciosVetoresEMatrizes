package Exercicios;

public class Exercicio15 {

	public static void main(String[] args) {
		InfNum inf = new InfNum();
		final int tam = 30;
		int idades[] = new int[tam];
		float alturas[] = new float[tam];
		float somaAlturas = 0;
		int k;
		for(k = 0;k<tam;k++) {
			idades[k] = inf.infNumIntM("Informe a idade do " + (k+1) + "° aluno: ");
			alturas[k] = inf.infFloat("Informe a altura do " + (k+1) + "° aluno: ");
			somaAlturas = somaAlturas + alturas[k];
		}
		float mediaAlturas = somaAlturas/tam;
		int contAluMedInf = 0;
		for(k = 0;k<tam;k++) {
			if(idades[k] > 13) {
				if(alturas[k] < mediaAlturas)
					contAluMedInf++;
			}
		}
		System.out.println("Alunos acima de 13 anos com altura inferior á média: " + contAluMedInf);
	}

}
