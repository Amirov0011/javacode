package TreeSet;

import java.util.TreeSet;

public class subSet {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers.subSet(2,4));
        System.out.println(numbers.subSet(2,false,4,true));
        System.out.println(numbers.subSet(2,true,4,true));

    }
}
