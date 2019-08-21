package Exercicios;

public class Exercicio4 {

	public static void main(String[] args) {
		InfNum inf = new InfNum();
		final int Q_saltos = 5;
		int Q_atletas;
		do {
			Q_atletas = inf.infNumIntM("Informe quantos atletas vão competir: ");
		}while(Q_atletas < 1);	
		
		float saltos[][] = new float[Q_atletas][Q_saltos];
		int saltosDesp[] = new int[Q_atletas];
		float medias[] = new float[Q_atletas];
		
		int camp = 0;
		int ultimo = 0;
		
		
		int a,s;
		for(a = 0; a < Q_atletas; a++) {
			saltosDesp[a]=0;
			medias[a] = 0;
			System.out.printf("%d° atleta %n",(a+1));
			for(s = 0; s < Q_saltos; s++) {
				saltos[a][s] = inf.infFloat((s+1) + "° salto: ");
				if(saltos[a][s] < saltos[a][saltosDesp[a]]) {
					saltosDesp[a] = s;
				}
				
			}
			for(s = 0; s < Q_saltos; s++) {
				if(s != saltosDesp[a]) {
					medias[a] = medias[a] +saltos[a][s];
				}
			}
			medias[a] = medias[a]/(Q_saltos-1);
			System.out.printf("Média: %.2f %n",medias[a]);
			if(medias[a] > medias[camp]) {
				camp = a;
			}
			else {
				if(medias[a] < medias[ultimo])
					ultimo = a;
			}
		}
		
		
		System.out.println();
		for(a = 0; a < Q_atletas; a++) {
			System.out.print("Atleta " + (a+1) + ": | ");
			for(s = 0; s < Q_saltos; s++) {
				if(s == saltosDesp[a])
					System.out.print("X");
				System.out.print(saltos[a][s] + " | ");
			}
			System.out.printf("Média: %.2f %n",medias[a]);
		}
		System.out.println();
		System.out.printf("Média do campeão: %.2f %n",medias[camp]);
		System.out.printf("Média do último: %.2f %n",medias[ultimo]);
	}

}
