package Exercicios;

public class Exercicio2 {

	public static void main(String[] args) {
		InfNum inf = new InfNum();
		final int Mercad = 5;
		final int prod = 5;
		
		float precos[][] = new float[Mercad][prod];
		
		float somaProd[] = new float[prod];
		float somaMerc[] = new float[Mercad];
		
		int m,p;
		for(p = 0; p < prod; p++) {
			somaProd[p] = 0;
		}
		for(m = 0; m < Mercad; m++) {
			somaMerc[m] = 0;
		}
		
		for(m = 0; m < Mercad; m++) {
			for(p = 0; p < prod; p++) {
				precos[m][p] = inf.infFloat("Informe o preço do " + (p+1) + "° produto no " + (m+1) + "° mercado: ");
				somaProd[p] = somaProd[p] + precos[m][p];
				somaMerc[m] = somaMerc[m] + precos[m][p];
			}
		}
		System.out.println("          Produto1  Produto2  Produto3  Produto4  Produto5");
		for(m = 0; m < Mercad; m++) {
			System.out.print("mercado" + (m+1) + "  ");
			for(p = 0; p < prod; p++) {
				System.out.printf("R$: %.2f  ", precos[m][p]);
			}
			System.out.println();
		}
		for(p = 0; p < prod; p++) {
			System.out.println("Média " +(p+1) + "° produto: " + somaProd[p]/Mercad);
		}
		int maisCaro = 0;
		int maisBarato = 0;
		for(m = 0; m < Mercad; m++) {
			if(somaMerc[m] > somaMerc[maisCaro]) {
				maisCaro = m;
			}
			else {
				if(somaMerc[m] < somaMerc[maisBarato]) {
					maisBarato = m;
				}
			}
			System.out.println("Soma de preços do " + (m+1) + "° mercado: " + somaMerc[m]);
		}
		
		System.out.println("Valor total no supermercado mais caro: " + somaMerc[maisCaro]);
		System.out.println("Valor total no supermercado mais barato: " + somaMerc[maisBarato]);
	}

}
