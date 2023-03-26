package ituniroma3.DiaDia;

public class testpartita {
	public static void main(String[] argc) {
	Partita partitatest = new Partita();
	Stanza stanzaTest= new Stanza("bar");
	Stanza stanzaTest2= new Stanza("mensa");
	Attrezzo primoattrezzo= new Attrezzo("spada", 10);
	Attrezzo primoattrezzo2= new Attrezzo("tazzina", 5);
	stanzaTest.impostaStanzaAdiacente("nord", stanzaTest2);
	stanzaTest2.impostaStanzaAdiacente("sud", stanzaTest2);
	stanzaTest.addAttrezzo(primoattrezzo);
	stanzaTest2.addAttrezzo(primoattrezzo2);
	partitatest.setStanzaCorrente(stanzaTest);
	partitatest.setStanzaVincente(stanzaTest);
	System.out.print(partitatest.getStanzaCorrente()+"\n\n");
	System.out.print(partitatest.getStanzaVincente()+"\n\n");
	if(partitatest.vinta())
		System.out.print("partita vinta");
	}
}
