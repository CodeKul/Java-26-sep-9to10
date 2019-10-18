package keywords;

public class CheckStaticKey {

    void getData(){
        System.out.println("inside get data");
    }

    public static void main(String[] args) {


        StaticKey.display();
        System.out.println("a : "+StaticKey.a);
        StaticKey key=new StaticKey();
        key.showData();

    }

}
