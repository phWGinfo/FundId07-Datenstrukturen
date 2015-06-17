package phwginfo.datenstrukturen;

import java.util.ArrayList;
import java.util.List;

public class DemoHash {
    public static void main(String[] args) {
        List<String> l = new
                ArrayList<String>();
        l.add("Friedrich");
        l.add("der");
        l.add("Grosse");
        // durch die Liste mit Zahlen
        for(int i=0;i<3;i++) {
            String s= l.get(i);
            System.out.println(s);
        }

        // durch die Liste mit Iterator
        for(String s: l) {
            System.out.println(s);
        }

    }
}
