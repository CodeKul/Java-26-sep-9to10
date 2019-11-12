package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> set=new TreeSet<>();
        set.add("xyz");
        set.add("xyz");
        set.add("pqr");
        set.add("pqr");
        set.add("abc");
        set.add("abc");
        set.add("efg");
        set.add("efg");

        set.forEach(s ->{
            System.out.println(s);
        });

    }
}
