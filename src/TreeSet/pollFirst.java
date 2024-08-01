package TreeSet;

import java.util.TreeSet;

public class pollFirst {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Daniel");
        names.add("Adams");
        names.add("Jack");
        names.add("Bob");
        System.out.println( " Names : " + names );

        String pollFirst = names.pollFirst();
        System.out.println( " PollFirst : " + pollFirst );
        System.out.println( " Names : " + names );
    }
}
