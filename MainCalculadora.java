package Exercicios;
import Exercicios.Calculadora;

public class MainCalculadora {
public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		c.question();
		while(c.op != 5) {
		c.numeros();
		c.operacao();
		c.result();
		c.question();
		}
		
		
	}
}	
	


