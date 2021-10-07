package Slide7;

public class Proprietario {
private String nome;
	
	public Proprietario(String n) {
		super();
		this.nome = n;
	}
	
	public String toString() {
		return "Nome do proprietário: " + nome;
	}
	
	public String getNome() {
		return nome;
	}

}
