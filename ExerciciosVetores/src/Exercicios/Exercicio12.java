package Exercicios;

public class Exercicio12 {

	public static void main(String[] args) {
		InfNum inf = new InfNum();
		
		String palavras = inf.infTexto("Informe as palavras: ");
		while(palavras.charAt(0) != '(' || palavras.charAt(palavras.length() - 1) != ')') {
			palavras = inf.infTexto("As palavras devem estar entre parênteses: ");
		}
	
		
		int ContPalavras = 1;
		int k;
		for(k = 0;k < palavras.length();k++) {
			if(palavras.charAt(k) == ';')
				ContPalavras++;
		}
		
		String vetorPalavras[] = new String[ContPalavras];
		
		int caractere = 0;
		
		
		for(k = 0;k<ContPalavras;k++) {
			caractere++;
			vetorPalavras[k] = "" + palavras.charAt(caractere);
			caractere++;
			while(palavras.charAt(caractere) != ';' && palavras.charAt(caractere) != ')'){
				vetorPalavras[k] = vetorPalavras[k] + palavras.charAt(caractere);
				caractere++;
			}
		}
		
		for(k = 0;k<ContPalavras;k++) {
			System.out.println(vetorPalavras[k]);
		}
	}

}
