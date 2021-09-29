package Exercicios;

public class SituacaoAluno {
	public static void main(String[] args ) {
		
		double nota1= 8, nota2= 6;
		double media= ((double)nota1+ (double)nota2)/2;
		
		if (media== 10) {
			
			System.out.println("Aprovado(a)!");
			
		}else if (media >= 7 && media <10) {
			
			System.out.println("Aprovado(a)!");
			
		}else {
			
			System.out.println(" Reprovado(a).");
		}
		
	}

}
