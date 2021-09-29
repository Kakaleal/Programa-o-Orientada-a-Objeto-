package impostoDeRenda;

public class Program {
	public static void main(String[] args) {
		
		Empregadoo e1 = new Empregadoo("Guilherme", "Gusman", 3500);
		e1.status();
		e1.calculaimpostorenda();
		
		Empregadoo e2 = new Empregadoo("Leonardo","Pimenta", 5600);
		e2.status();
		e2.calculaimpostorenda();
		
		System.out.println("Professor " + e2.getNome() + ", não entendi pra que criar set n' get mas usei aqui");

	}

}

