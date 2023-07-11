package Comparator;

import java.util.Comparator;

public class VornamenComparator implements Comparator<Kontakt> {

    @Override
    public int compare(Kontakt o1, Kontakt o2) {
        String vorname1 = o1.getName();
        String vorname2 = o2.getName();

        int vornamenVergleich = vorname1.compareTo(vorname2);
        //System.out.println(o1.getNachName().compareTo(o2.getNachName()));

        if (vornamenVergleich == 0){
            return o1.getNachName().compareTo(o2.getNachName());
        }

        return vornamenVergleich;
    }


}
