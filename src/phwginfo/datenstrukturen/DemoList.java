package phwginfo.datenstrukturen;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<String> l = new
                ArrayList<String>();
        l.add("Friedrich");
        l.add("der");
        l.add("Grosse");
        for(int i=0;i<3;i++) {
            String s= l.get(i);
            System.out.println(s);
        }


    }
}
