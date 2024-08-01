package TreeSet;

import java.util.TreeSet;

public class pollLast {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Daniel");
        names.add("Adams");
        names.add("Jack");
        names.add("Bob");
        System.out.println( " Names : " + names );
        String pollLast = names.pollLast();
        System.out.println( " PollLast : " + pollLast );
        System.out.println(" Names : " + names );
    }
}
