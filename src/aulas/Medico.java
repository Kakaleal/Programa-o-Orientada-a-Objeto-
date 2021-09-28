package aulas;

public class Medico {
	private int crm, salario, consulta;
	private String nome;
	private static int totalMedicos;
	
	public Medico(int A, String B, int C, int D) {
		this.crm = A;
		this.nome = B;
		this.salario = C;
		this.consulta = D;
		Medico.totalMedicos +=1;
	}
		public static int getTotalMedicos() {
			return totalMedicos;
		}
	public void pagamentoDinheiro(double consulta) {
		double pgtdinheiro = this.consulta;
		System.out.printf("Dinheiro: %s\n", pgtdinheiro);
	}
	
	public void pagamentoPlano(double consulta) {
		double pgtplano = this.consulta * 0.7;
		System.out.printf("Plano: %s\n", pgtplano);
	}
	
	public void totalMedicos() {
		this.totalMedicos = 2;
		System.out.printf("Número total de médicos: %s", totalMedicos);
	}
	
	public void status() {
		System.out.printf("CRM: %s\n", crm);
		System.out.printf("Nome: %s\n", nome);
		System.out.printf("Salário: %s\n", salario);
		System.out.printf("Preço consulta: %s\n", consulta);
	}
	

}
