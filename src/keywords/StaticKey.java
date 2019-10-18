package keywords;

public class StaticKey {

    static int a=10;
    int b=20;


    static {
        System.out.println("Inside static block.");
    }

   public void showData(){
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }

   public static void display(){
        System.out.println("a :"+a);
        System.out.println("b :"+new StaticKey().b);
    }

    public static void main(String[] args) {
        StaticKey key=new StaticKey();
        key.showData();
        display();
        System.out.println("a : "+a);
    }

}
