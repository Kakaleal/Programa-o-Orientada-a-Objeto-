package Atividade;

import  java.util.Scanner ;

public class Main_ {
	private  int lerNumero;

	public  static  void  main ( String [] args ) {
		
		Main m =  novo  Main ();
		System.out.println( " Digite um numero inteiro " );
		   while {
			int num = m . lerNumero;
		System.out.println( " Você digitou "  + num);
		} catch  {
			System.out.println( " Falha ao ler seu numero " );
		}
		
	}
	

	public  int  lerNumero () throws  Exception {
	Scanner in =  novo  Scanner ( System . In);
	int num = in . nextInt ();
	no . fechar();
	return num;
	}
}

