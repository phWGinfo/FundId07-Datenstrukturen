package phwginfo.datenstrukturen;

import java.util.ArrayList;
import java.util.List;

public class DemoBigList {

    public static void main(String[] args) {

        int maxSize = 1000*1000*50;

        // eine riesige Liste gestalten
        System.out.println(System.currentTimeMillis());
        System.out.println("Baue Liste.");
        List bigList = new ArrayList(maxSize);
        System.out.println(System.currentTimeMillis());

        System.out.println(System.currentTimeMillis());
        System.out.println("Befülle.");
        for(int i=0; i<maxSize; i++) {
            bigList.add(Math.random());
        }

        System.out.println(System.currentTimeMillis());
        System.out.println("Lese zehn zufällig.");
        for(int i=0; i<10; i++) {
            System.out.println(bigList.get((int) (maxSize*Math.random())));
        }

        System.out.println(System.currentTimeMillis());
        System.out.println("Fertig.");


    }
}
