package ituniroma3.DiaDia;
public class StanzaTest1 {
	public static void main(String[] argc) {
		Stanza stanzaTest= new Stanza("bar");
		Stanza stanzaTest2= new Stanza("mensa");
		Attrezzo primoattrezzo= new Attrezzo("spada", 10);
		Attrezzo primoattrezzo2= new Attrezzo("tazzina", 5);
		stanzaTest.impostaStanzaAdiacente("nord", stanzaTest2);
		stanzaTest2.impostaStanzaAdiacente("sud", stanzaTest2);
		System.out.print("test metodo get " + stanzaTest.getStanzaAdiacente("nord")+ "\n");
		System.out.print("test metodo get " + stanzaTest.getStanzaAdiacente("nord")+ "\n");
		stanzaTest.addAttrezzo(primoattrezzo);
		stanzaTest2.addAttrezzo(primoattrezzo2);
		if(stanzaTest.hasAttrezzo("spada"))
			System.out.print("attrezzo trovato\n\n");
		else
			System.out.print("attrezzo non trovato\n\n");
		System.out.print("riferimento array attrezzo" + stanzaTest.getAttrezzi() + "\n\n");
		System.out.print("riferimento arry direzioni" + stanzaTest.getDirezioni() + "\n\n");
		System.out.print(stanzaTest.getDescrizione());
		System.out.print(stanzaTest2.getDescrizione());
		
		
		
	}
}

