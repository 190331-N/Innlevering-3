package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import org.w3c.dom.ls.LSOutput;

public class Blogg {

    private Innlegg[] innleggtabell;
    private int nesteledig;

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
        this.nesteledig = 0;
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
        this.nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < nesteledig; i++) {
            if(innleggtabell[i].erLik(innlegg)){
                return i;
            }
        }
        return -1;
	}

	public boolean finnes(Innlegg innlegg) {
        return finnInnlegg(innlegg) != -1;
    }


	public boolean ledigPlass() {
        if(nesteledig < innleggtabell.length) {
            return true;
        }
        return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
        if(!ledigPlass()) {
            return false;
        }
        if(!finnes(innlegg)){
            innleggtabell[nesteledig] = innlegg;
            nesteledig++;
            return true;
        }
        return false;
	}

    @Override
    public String toString() {
        String resultat = nesteledig + "\n";
        for (int i = 0; i < nesteledig; i++) {
            resultat = resultat + innleggtabell[i].toString();
        }

        return resultat;
    }

}