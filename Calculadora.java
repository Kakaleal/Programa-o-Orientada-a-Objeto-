package Exercicios;
import java.util.Scanner;

public class Calculadora {
	

	int op;
	double a, b, resultado;
	String sinal;
	
	Scanner entrada = new Scanner(System.in);
	
	public void operacao() {
	
		if(op == 1) {
		resultado = a + b;	
		sinal = "+";
		}
		
		if(op == 2) {
		resultado = a - b;
		sinal = "-";
		}
		
		if(op == 3) {
		resultado = a * b;
		sinal = "*";
		}
		
		if(op == 4) {
		resultado = a / b;
		sinal = "/";
		}
	}
	
	public void question() {
						
		System.out.println("Que opera��o deseja fazer:\n1: soma\n2: subtra��o\n3: multiplica��o\n4: divis�o\n5: sair");
		op = entrada.nextInt();
				
	}
	
	public void numeros() {
					
		System.out.println("Informe o primeiro n�mero: ");
		a = entrada.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		b = entrada.nextInt();
								
	}
	
	public void result() {
		
		System.out.printf(
				"O resultado da conta %s %s %s �: %s\n",
				a,
				sinal,
				b,
				resultado);
		
	}
}
