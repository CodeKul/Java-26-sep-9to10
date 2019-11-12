package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer>  list= new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> list1=new ArrayList<>();
        list1.addAll(list);
        list1.add(1);
        list1.add(2);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        for (Integer i:list1)
        {
            System.out.println(i);
        }

        list1.forEach(i -> {
            System.out.println(i);
        });
    }

}
