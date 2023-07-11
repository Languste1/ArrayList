package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Adressbuch {
    public static void main(String[] args) {
        List<Kontakt> kontakte = new ArrayList<>();

        System.out.println("\n_______Ausgabe unsortiert_______\n");

        kontakte.add(new Kontakt("Daniel", "Vergien"));
        kontakte.add(new Kontakt("Erik", "Hoelzel"));
        kontakte.add(new Kontakt("Benjamin", "Vergien"));
        kontakte.add(new Kontakt("Dieter", "Vergien"));
        kontakte.add(new Kontakt("Sven", "Müller"));
        kontakte.add(new Kontakt("Julia", "Bremer"));
        kontakte.add(new Kontakt("Horst Ludwig", "Bremer"));
        kontakte.add(new Kontakt("Dieter", "Vergien"));
        kontakte.add(new Kontakt("Horst Zorg", "Bremer"));

        //Ausgabeloop für unsortierte Namen
        for (Kontakt kontakt : kontakte) {
            System.out.println(kontakt.getNachName() + ", " + kontakt.getName());
        }
        System.out.println("\n_______Ausgabe nach Nachnamen sortiert_______\n");


        //AUSWAHL DER RICHTIGEN COMPARATORKLASSE!
        Comparator<Kontakt> comparator = new NachnamenComparator();

        //Kontakte mit dem jeweiligen Comparator sorten
        kontakte.sort(comparator);


        //Ausgabe für Nachnamen
        for (Kontakt kontakt : kontakte) {
            System.out.println(kontakt.getName() + ", " + kontakt.getNachName());

        }
        System.out.println("\n_______Ausgabe nach Vornamen sortiert_______\n");

        //AUSWAHL DER RICHTIGEN COMPARATORKLASSE!
        Comparator<Kontakt> comparator2 = new VornamenComparator();
        kontakte.sort(comparator2);

        //Ausgabeloop für Vornamen
        for (Kontakt kontakt : kontakte) {
            System.out.println(kontakt.getName() + ", " + kontakt.getNachName());

        }

        //Erstellung einer neuen Kontaktliste zur Abfrage von doppelten Namen
        List<Kontakt> newContacts = new ArrayList<>(kontakte);

        List<Kontakt> doubleNames = new ArrayList<>();
        for (Kontakt kontakt : kontakte) {
            for (Kontakt kontakt1 : newContacts){
                if (kontakt.getName().equals(kontakt1.getName())){
                    doubleNames.add(kontakt);
                }
            }
        }



        //Ausgabeloop für Doppelte Kontakte
        System.out.println("\n_______Doppelte Kontakte_______\n");
        for (Kontakt kontakt : doubleNames) {
            System.out.println(kontakt.getName() + ", " + kontakt.getNachName());

        }
    }
}
