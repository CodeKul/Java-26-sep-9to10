package stringdemo;

public class StringDemo {

    public static void main(String[] args) {
        String s3;
        String s4=null;
        String s5="";
        String s="Codekul";
        String s1="Codekul";
        System.out.println(s);
        System.out.print(s.hashCode());

        s=s.concat("institute");

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        String s2=new String("Codekul");

        if (s==s1){

        }

        if (s.equals(s2)){

        }


        StringBuffer buffer=new StringBuffer("Codekul");


        StringBuilder builder=new StringBuilder("Codekul");

    }


}
