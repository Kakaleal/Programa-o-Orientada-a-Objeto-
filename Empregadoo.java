package impostoDeRenda;

public class Empregadoo {
	private String nome, sobrenome;
	private double salario;
	private double desconto;
	
	public Empregadoo(String m, String g, double p) {
		this.nome = m;
		this.sobrenome = g;
		this.salario = p;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String john) {
		this.nome = john;
	}
	
	public String getSobrenome() {
		return this.nome;
	}
	public void setSobrenome(String doe) {
		this.nome = doe;
	}
	
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double m) {
		this.salario = m;
	}
	
	public void calculaimpostorenda() {
		if(salario < 1903.98) {
			this.desconto = salario;
			System.out.printf("Salário liquido: %.2f\n", this.desconto);
		}
		if(salario >= 1903.98 && salario <= 2826.65) {
			this.desconto = salario * 0.925;
			System.out.printf("Salário liquido: %.2f\n", this.desconto);
		}
		if(salario >= 2826.66 && salario <= 3751.05) {
			this.desconto = salario * 0.85;
			System.out.printf("Salário liquido: %.2f\n", this.desconto);
		}
		if(salario >= 3751.06 && salario <= 4664.68) {
			this.desconto = salario * 0.775;
			System.out.printf("Salário liquido: %.2f\n", this.desconto);
		}
		if(salario > 4664.68) {
			this.desconto = salario * 0.725;
			System.out.printf("Salário liquido: %.2f\n", this.desconto);
		}
	}
	
	public void status() {
		System.out.printf("Nome Completo: %s %s\n", nome, sobrenome);
		System.out.printf("Salário bruto: %.2f\n", salario);
	}
	

}
