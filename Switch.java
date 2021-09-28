package Exercicios;

public class Switch {
	public static void main(String[] args) {
		int avaliacao=0;
		switch (avaliacao) {
		case 5:
			System.out.println("Excelente!");
			break;
			
		case 4:
			System.out.println("bom!");
			break;
			
		case 3:
		    System.out.println("Regular!");
		    break;
		    
		case 2:
		      System.out.println("ruim");
		      break;
		      
		case 1:
			System.out.println(" pessimo!");
		    break;
		    
		default:
			System.out.println("sem resposta");
			break;
		}
		
	}

}
