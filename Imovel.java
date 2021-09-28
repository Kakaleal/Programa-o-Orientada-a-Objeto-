package Exercicios;

public class Imovel {
	
		int codImovel;
		String bairro;
		String tipo;
		double valor;
		double valorReajuste;

		public void reajuste() {
			if(tipo == "casa") {
				valorReajuste = valor * 1.05;
				System.out.println(valorReajuste);
			}
			if(tipo == "apt") {
				valorReajuste = valor * 1.08;
				System.out.println(valorReajuste);
			}
		}
		
		public void categoria() {
			if(valorReajuste > 50000) {
				System.out.printf("Cateogoria A\n");
			}
			if(valorReajuste >= 10000 && valorReajuste <= 50000) {
				System.out.printf("Cateogoria B\n");
			}
			if(valorReajuste < 10000) {
				System.out.printf("Cateogoria C\n");
			}
		}
 }

