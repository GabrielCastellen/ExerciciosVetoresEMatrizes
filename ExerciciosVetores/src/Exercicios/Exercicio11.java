package Exercicios;

public class Exercicio11 {

	public static void main(String[] args) {
		InfNum inf = new InfNum();
		MetComparar comp = new MetComparar();
		
		final int tamV = 3;
		
		String data = inf.infTexto("Informe uma data no formato dd/mm/aaaa: ");
		while(!comp.validarData(data)) {
			data = inf.infTexto("Data inválida, informe uma data no formato dd/mm/aaaa e tente novamente: ");
		}
		
		int vetorData[] = new int[tamV];
		
		vetorData[0] = Integer.parseInt(data.substring(0, 2));
		vetorData[1] = Integer.parseInt(data.substring(3, 5));
		vetorData[2] = Integer.parseInt(data.substring(6, 10));
		
		System.out.println(vetorData[0] + " | " + vetorData[1] + " | " + vetorData[2]);
	}

}
