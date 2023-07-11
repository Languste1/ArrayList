import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> listA = Arrays.asList (1,2,3,4,5,6);
        List<Integer> listB = Arrays.asList (4,5,6,7,8,9);

        List <Integer> vereinigung = new ArrayList<>();
        List <Integer> symmetrischeDiff = new ArrayList<>();


        //Vereinigung
        for (Integer integer : listA){
            vereinigung.add(integer);
        }
        for (Integer integer : listB){
            if (vereinigung.contains(integer)){
                continue;
            }
            vereinigung.add(integer);
        }
        System.out.println(vereinigung);

        //Schnittmenge
        List <Integer> schnittmenge = new ArrayList<>(vereinigung);
        schnittmenge.retainAll(listA);
        schnittmenge.retainAll(listB);
        System.out.println(schnittmenge);

        //Symmetrische Differenz
        for (Integer integer : listA){
            symmetrischeDiff.add(integer);

        }

        for (Integer integer : listB){

            if (symmetrischeDiff.contains(integer)){
                symmetrischeDiff.remove(integer);

            } else {
                symmetrischeDiff.add(integer);

            }


        }
        System.out.println(symmetrischeDiff);









    }
}