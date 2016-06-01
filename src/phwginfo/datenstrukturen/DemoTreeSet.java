package phwginfo.datenstrukturen;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoTreeSet {
    public static void main(String[] ags) {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("bbc");
        tree.add("acd");
        tree.add("ccd");

        for(String s : tree) {
            System.out.println("Eintrag: " + s);
        }


    }

}
