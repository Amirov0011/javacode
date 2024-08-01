package TreeSet;

import java.util.TreeSet;

public class tailSet {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers.tailSet(3));
        System.out.println(numbers.tailSet(3,false));
        System.out.println(numbers.tailSet(3,true));
    }
}
