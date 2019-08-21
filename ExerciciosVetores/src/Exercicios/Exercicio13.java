package Exercicios;

public class Exercicio13 {

	public static void main(String[] args) {
		InfNum inf = new InfNum();
		final int tam = 5;
		int idades[] = new int[tam];
		float alturas[] = new float[tam];
		int k;
		int maisVelho = 0;
		int maisNovo = 0;
		int maisAlto = 0;
		int maisBaixo = 0;
		for(k = 0;k<tam;k++) {
			idades[k] = inf.infNumIntM("Informe a idade da " + (k+1) + "ª pessoa: ");
			alturas[k] = inf.infFloat("Informe a altura da " + (k+1) + "ª pessoa: ");
			if(idades[k]> idades[maisVelho])
				maisVelho = k;
			else {
				if(idades[k] < idades[maisNovo])
					maisNovo = k;
			}
			if(alturas[k] > alturas[maisAlto])
				maisAlto = k;
			else {
				if(alturas[k] < alturas[maisBaixo])
					maisBaixo = k;
			}
		}
		for(k = tam-1;k>=0;k--) {
			System.out.println("Idade do " + (k+1) + "°: " +idades[k]);
			System.out.println("Altura do " + (k+1) + "°: " +alturas[k]);
		}
		System.out.println("Idade do mais velho: " + idades[maisVelho]);
		System.out.println("Altura do mais velho: " + alturas[maisVelho]);
		System.out.println("Idade do mais novo: " + idades[maisNovo]);
		System.out.println("Altura do mais novo: " + alturas[maisNovo]);
		System.out.println("Idade do mais alto: " + idades[maisAlto]);
		System.out.println("Altura do mais alto: " + alturas[maisAlto]);
		System.out.println("Idade do mais baixo: " + idades[maisBaixo]);
		System.out.println("Altura do mais baixo: " + alturas[maisBaixo]);
	}

}
