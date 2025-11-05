package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		String sep = System.getProperty("file.separator");
        String path = (mappe == null || mappe.isEmpty())
                ?filnavn
                : (mappe.endsWith(sep) ? mappe + filnavn : mappe + sep + filnavn);

	}
}
