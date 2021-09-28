package Exercicios;

public class MainImovel {
	
		public static void main(String[] args) {
			
			Imovel novo = new Imovel();
			novo.codImovel = 1;
			novo.bairro = "centro";
			novo.tipo = "apt";
			novo.valor = 25000;
			novo.reajuste();
			novo.categoria();

			Imovel novo2 = new Imovel();
			novo2.codImovel = 2;
			novo2.bairro = "Quitandinha";
			novo2.tipo = "casa";
			novo2.valor = 98900;
			novo2.reajuste();
			novo2.categoria();					
		}
}

