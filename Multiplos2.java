package Exercicios;

public class Multiplos2 {
	public static void main(String[] args) {
		int total=0;
		
		for(int i=1; i <= 22; i++) {
			int resto = i%2;
			if(resto==0) {
				System.out.println("java.");
				total +=1;
			}
		}
		System.out.println("Total é : " + total);
	}

}
