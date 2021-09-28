package aulas;
import aulas.Medico;

public class TesteMedico {
public static void main(String[] args) {
		
		Medico medicos1 = new Medico(12345, "karina", 0, 250);	
		Medico medicos2 = new Medico(456789, "caio", 0, 300);

		medicos1.pagamentoDinheiro(250);
		medicos2.pagamentoPlano(300);
		;
		System.out.println(medicos1);
		System.out.println(medicos2);
		System.out.println("total de medicos: " + Medico.getTotalMedicos());
		
		
	}
}
