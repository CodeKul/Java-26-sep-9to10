package stringdemo;

public class StringDemo {

    public static void main(String[] args) {

        String s="Codekul";
        String s1="institute";
        System.out.println(s);
        System.out.print(s.hashCode());

        s=s.concat("institute");

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());


    }


}
