package Exercicios;

public class PessoaFisica {
public static void main(String[] args) {
		
		Empregadoo e1 = new Empregadoo ("KAKA", "LEAL", 3500);
		e1.status();
		e1.calculaimpostorenda();
		
		Empregadoo  e2 = new Empregadoo ("MARIA ","CRISTINA", 5600);
		e2.status();
		e2.calculaimpostorenda();
		
		System.out.println("Professor " + e2.getNome() + "bom salario");

	}

}
