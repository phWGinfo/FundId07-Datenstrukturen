package phwginfo.datenstrukturen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoComparable {
    public static void main(String[] args) {
        Comparable
                a = "wachsen"
                  //new Gebauede(500, "Doggenried", 23)
                , b = "brennen"
                  //new Gebauede(800, "Lazarett",   35)
                , c = "lenken"
                  //new Gebauede(100, "Leibnitz",    6)
                        ;
        List things = Arrays.asList(a, b, c);
        System.out.println("Vergleiche " + a + " und " + b + ".");
        System.out.println(a.compareTo(b));
        if(a.compareTo(b)>0)
            System.out.println(a + " ist grösser als " + b);
        else
            System.out.println(b + " ist grösser als " + a);
        System.out.println();
        System.out.println("Vor Sortierung: " + things);
        Collections.sort(things);
        System.out.println("Nach Sortierung: " + things);
    }
}

class Gebauede implements Comparable {

    int groesse, strassenNummer;
    String strasse;
    Gebauede(int groesse, String strasse, int strassenNummer) {
        this.groesse = groesse;
        this.strasse = strasse;
        this.strassenNummer = strassenNummer;
    }

    public int compareTo(Object o) {
        return Integer.compare(this.groesse, ((Gebauede) o).groesse);
    }

    public String toString() {
        return strasse + " " + strassenNummer + " (" + groesse + ")";
    }
}
