package phwginfo.datenstrukturen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoComparable {
    public static void main(String[] args) {
        List words = Arrays.asList("wachsen", "brennen", "senken");
        System.out.println("Comparing wachsen and brennen.");
        System.out.println("wachsen".compareTo("brennen"));
        System.out.println();
        System.out.println("Before sorting: " + words);
        Collections.sort(words);
        System.out.println("After sorting: " + words);
    }
}
