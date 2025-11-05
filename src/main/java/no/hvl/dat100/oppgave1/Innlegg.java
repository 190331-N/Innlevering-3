package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {

    public int id;
    public String bruker;
    public String dato;
    public int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

	    this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;
	}
	
	public String getBruker() {
        return bruker;
	}
	public void setBruker(String ny) {
		bruker = ny;
	}

	public String getDato() {
		return dato;
	}
	public void setDato(String ny) {
		dato = ny;
	}

	public int getId() {
		return id;
	}
    public void setId(int ny){
        id = ny;
    }

	public int getLikes() {
		return likes;
	}
	
	public void doLike () {
		likes += 1;
	}
	
	public boolean erLik(Innlegg innlegg) {
        if(this.id == innlegg.id){
            return true;
        }
        return false;
	}
	
	@Override
	public String toString() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
