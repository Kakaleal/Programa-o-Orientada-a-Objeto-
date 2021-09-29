package Exercicios;

public class QuantidadeExercicio {
	
		public static void main(String[] args) {
			
			int qntPar= 0;
			int qntImpar=0;
		
			for(int i = 0;  i < 30; i++) {
			
			
			 if (i %2 == 0) {
				 
				 qntPar += 1;
			 }else {
				 qntImpar +=1;
			 
		}
			System.out.println("Total de n pares: "+ qntPar);
			
			System.out.println("Total de n impares: "+ qntImpar);
			
			
		}
		}
}

	


