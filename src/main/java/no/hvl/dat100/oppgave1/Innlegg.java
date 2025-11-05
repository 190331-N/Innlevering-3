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
		throw new UnsupportedOperationException(TODO.method());

	}
	
	@Override
	public String toString() {
        return id + "\n" + bruker + "\n" + dato + "\n" + likes;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
