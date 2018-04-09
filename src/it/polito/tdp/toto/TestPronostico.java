package it.polito.tdp.toto;

public class TestPronostico {

	public static void main(String[] args) {
		Pronostico p = new Pronostico(3) ;
		p.add(new Previsione(Risultato.DUE));
		p.add(new Previsione(Risultato.UNO, Risultato.ICS)) ;
		p.add(new Previsione(Risultato.UNO, Risultato.ICS, Risultato.DUE));
		
		System.out.println(p) ;

	}

}
