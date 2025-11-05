package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        String sep = System.getProperty("file.separator");

        String path;
        if (mappe == null || mappe.isEmpty()) {
            path = filnavn;                           // e.g. "blogg.dat"
        } else if (mappe.endsWith(sep)) {
            path = mappe + filnavn;                   // e.g. "out/" + "blogg.dat"
        } else {
            path = mappe + sep + filnavn;             // e.g. "out" + "/" + "blogg.dat"
        }

        try (PrintWriter pw = new PrintWriter(path)) {
            pw.print(samling.toString());
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }
}
