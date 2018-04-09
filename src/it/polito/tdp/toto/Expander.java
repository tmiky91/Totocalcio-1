package it.polito.tdp.toto;

import java.util.List;

public class Expander {

	public List<Schedina> expand(Pronostico p) {
		return null;
	}

	private void cerca(Schedina parziale, Pronostico p, int livello) {
		
		Previsione mosse = p.get(livello) ;
		for( Risultato mossa : mosse.getValori() ) {
			parziale.add(mossa); // prova la soluzione
			cerca(parziale, p, livello+1) ;
			parziale.removeLast(); // backtrack
		}

	}
	
	/*
	Problema parziale: Schedina 1-X, livello 2
	Devo guardare pronostico p(2). Supponiamo sia X2
	Allora genererò le nuove soluzioni parziali 1-X-X, 1-X-2
	*/
}
