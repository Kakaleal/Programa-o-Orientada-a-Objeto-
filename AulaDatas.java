package datas;

import  java.time.Duration ;
import  java.time.LocalDate ;
import  java.time.LocalDateTime ;
import  java.time.format.DateTimeFormatter ;
import  java.util.Date ;
public class AulaDatas {
private static final String DateTimeFormatter = null;

public  static  void  main ( String [] args ) {
		
		LocalDateTime  DiaHoje  =  LocalDateTime ();
		LocalDateTime  DataNasc  = localDataTime  ( 1993 , 6 , 18 , 6 , 28 );
		DateTimeFormatter  FormatoBr  =  DateTimeFormatter  ( " dd / MM / aaaa " );
		Object IntervaloDeDuracao = Duracao . entre ( DataNasc , DiaHoje );
		boolean  AnoBissexto  =  DataNasc . toLocalDate () . isLeapYear ();
		
		System.out.printf ( " Hoje: "  +  DateTimeFormatter +( FormatoBr ));
		String formatoDataNasc = null;
		System.out.println ( " Data de Nascimento: "  +  formatoDataNasc +( FormatoBr ));
		int idadeReal =  DataNasc . getYear () /  4 ;
		
		if ( AnoBissexto ) {
			
			
			System.out.println( " Sim, você nasceu em um ano bissexto, sua verdadeira idade é: "  + idadeReal);
			
		} else {
			
			System.out.println ( " Você não nasceu em um ano bissexto, sim, você é tão velho quanto imagina. " );

		}
		
		Duration intervalo = null;
		System.out.println( " Segundos decorridos do nasicmento até o dia de hoje: "  + intervalo . getSeconds () +  " segundos. " );
		
		
		

	}

private static java.time.LocalDateTime localDataTime(int i, int j, int k, int l, int m) {
	// TODO Auto-generated method stub
	return null;
}

private static LocalDateTime LocalDateTime() {
	// TODO Auto-generated method stub
	return null;
}

private static java.time.format.DateTimeFormatter DateTimeFormatter(String string) {
	// TODO Auto-generated method stub
	return null;
}


}
