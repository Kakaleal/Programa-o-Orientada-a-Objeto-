package aula9;

import java.util.ArrayList;
import java.util.List;

public class ListaDeAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno("kaka", 9.0, 10.0);
		Aluno aluno2 = new Aluno("mariaa", -5.0, -1.0);
		Aluno aluno3 = new Aluno("rosangela", 5.0, 8.0);
		Aluno aluno4 = new Aluno("Tadeu", 11.0, 12.0);
		Aluno aluno5 = new Aluno("vt", 10.0, 10.0);
		Aluno aluno6 = new Aluno("bruno ", 7.0, 8.5);
		Aluno aluno7 = new Aluno("lucas", 7.5, 7.5);
		Aluno aluno8 = new Aluno("leal", 9.5, 6.5);
		
		List<Aluno> Aluno = new ArrayList<Aluno>();
		Aluno.add(aluno1);
		Aluno.add(aluno2);
		Aluno.add(aluno3);
		Aluno.add(aluno4);
		Aluno.add(aluno5);
		Aluno.add(aluno6);
		Aluno.add(aluno7);
		Aluno.add(aluno8);
		
		for (Integer i = 0; i < Aluno.size(); i++) {
    		try{
          		Aluno aluno = (Aluno) Aluno.get(i);
          		aluno.calcularMedia();
            		System.out.println(aluno.toString());
         	}
         	catch(AlunoException e){
                	System.err.println(e.getMessage());
         	}
	}
}



	}


