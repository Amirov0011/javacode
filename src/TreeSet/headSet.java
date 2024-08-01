package TreeSet;

import java.util.TreeSet;

public class headSet {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers.headSet(3));
        System.out.println(numbers.headSet(3,true));
        System.out.println(numbers.headSet(3,false));

    }

}
