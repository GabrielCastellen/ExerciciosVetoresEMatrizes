package Exercicios;

public class Exercicio10 {

	public static void main(String[] args) {
		InfNum inf = new InfNum();
		
		String texto = inf.infTexto("Informe um texto: ");
		
		final int tam = texto.length();

		char vetor[] = new char[tam];
		int k;
		for(k = 0; k<tam; k++) {
			vetor[k] = texto.charAt(k);
		}
		for(k = 0; k<tam; k++) {
			System.out.print(vetor[k] + " | ");
		}
	}

}
