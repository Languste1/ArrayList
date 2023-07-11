import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTreeSet {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(9);
        hashSet.add(4);
        hashSet.add(8);
        hashSet.add(7);

        for (Integer i : hashSet) {
            System.out.print(i + " ");
        }

        System.out.println();
        Set<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(10);
        hashSet2.add(19);
        hashSet2.add(44);
        hashSet2.add(8);
        hashSet2.add(7);

        for (Integer i : hashSet2) {
            System.out.print(i + " ");
        }

        System.out.println();

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        treeSet.add(9);
        treeSet.add(4);
        treeSet.add(8);
        treeSet.add(7);

        for (Integer i : treeSet) {
            System.out.print(i + " ");
        }
        System.out.println();

        Set<Integer> treeSet2 = new TreeSet<>();

        treeSet2.add(10);
        treeSet2.add(19);
        treeSet2.add(45);
        treeSet2.add(38);
        treeSet2.add(7);

        for (Integer i : treeSet2) {
            System.out.print(i + " ");
        }


    }
}
