package ituniroma3.DiaDia;




/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO
 * @see Stanza
 * @version base
 */

public class Partita {



	private boolean finita;
	private Labirinto labirinto=new Labirinto();
	private Giocatore giocatore=new Giocatore();

	public Partita(){
		labirinto.creaStanze();
		this.finita = false;

	}

	/**
	 * Crea tutte le stanze e le porte di collegamento
	 */


	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return this.labirinto.getStanzaCorrente()== this.labirinto.getStanzaVincente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		int cfu=giocatore.getCfu();
		return finita || vinta() || (cfu == 0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}


}
