package it.polito.tdp.toto;

import java.util.LinkedList;
import java.util.List;

public class Espandi {
	
	
	private List<Schedina> soluzioni = new LinkedList<Schedina>();
	
	public List<Schedina> espandiPronostico(Pronostico p) {
		Schedina parziale = new Schedina(p.getN());
		espandi(p, parziale, 0);
		
		return soluzioni;
	}
	
	
	
	//Livello della ricorsione = singola partita
	//Livello =0 -> schedina con zero risultati
	//livello =1 -> schedina con 1 risultato
	
	public void espandi (Pronostico p, Schedina parziale, int livello) {
		//parziale contiene già (livello) valori nelle posizioni 0...livello-1
		//io devo determinare parziale[livello] (cioè la livello+1 esima riga) sulla base della previsione in p[livello]
		
		if(livello==p.getN()) {
			//System.out.println(parziale);
			this.soluzioni.add(new Schedina(parziale));
			return;
		}
		
		Previsione prev = p.get(livello);
		
		//prova le varie alternative
		for(Risultato r: prev.getValori()) {
			//provo ad aggiungere 'r'
			parziale.add(r);
			espandi(p,parziale,livello+1);
			
			//backtrack
			parziale.removeLast();
		}
		
	}

}
