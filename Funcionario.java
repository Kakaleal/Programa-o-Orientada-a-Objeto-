package aula9;

public class Funcionario {
	private  String nome;
	private String carga ;
	private double salario ;
	
	public  Funcionario ( String  nome , String  cargo , double  salario ) {
		this . nome = nome;
		this . carga = carga;
		this . salario = salario;
	}

	public  String  getNome () {
		return nome;
	}

	public  void  setNome ( String  nome ) {
		this . nome = nome;
	}

	public  String  getCarga () {
		return carga;
	}

	public  void  setCargo ( String  cargo ) {
		this . carga = carga;
	}

	public  double  getSalario () {
		return salario;
	}

	public  void  setSalario ( double  salario ) {
		this . salario = salario;
	}
	
	public  double  abonoSalario ( double  abono ) {
		return  this .salario + = abono;
	}

}


