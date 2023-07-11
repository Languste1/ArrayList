package Comparator;

import java.util.Comparator;

public class NachnamenComparator implements Comparator<Kontakt> {

    @Override
    public int compare(Kontakt o1, Kontakt o2) {


        //Strings für zu vergleichende Variablen anlegen (WICHTIG, SONST FUNKTIONIERT ES NICHT)
        String nachName1 = o1.getNachName();
        String nachName2 = o2.getNachName();

        //System.out.println("Vergleiche " + nachName1 + " und " + o1.getName() + " mit "+ nachName2 + " und " + o2.getName());

        //
        int nachnamenVergleich = nachName1.compareTo((nachName2));
        if (nachnamenVergleich == 0){
            return o1.getName().compareTo(o2.getName());
        }

        return nachnamenVergleich;
    }
}
