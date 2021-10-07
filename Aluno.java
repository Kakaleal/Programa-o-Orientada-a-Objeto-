package aula9;

public class Aluno {
    private String nome;
    private double n1,n2;
    
    public Aluno(String nome, double nota1, double nota2) {
		super();
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
	}
	public String getNome() {
		return nome;
	}
	public Double getNota1() {
		return n1;
	}
	public Double getNota2() {
		return n2;
	}
	
	public double calcularMedia() throws AlunoException{
		if (n1 < 0.0 || n1 > 10.0 || n2 < 0.0 || n2 > 10.0) {
			 throw new AlunoException("A nota precisa ser entre 0 e 10");
		}else {
		return ((getNota1() + getNota2())/2);
	}
	}
	
	public String toString() {
		try {
			return String.format("Aluno: " + getNome() + " Nota 1: " + getNota1() + " Nota 2: " + getNota2() + " Média: " + calcularMedia());
		} catch (AlunoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nome;
	}
	
}
     
     
     

