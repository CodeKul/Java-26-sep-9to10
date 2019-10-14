package constructor;

public class ConstructorDemo {
    int a;
    int b;
    ConstructorDemo(){
        System.out.println("Inside constructor body");
    }

    ConstructorDemo(int a){
        System.out.println("Inside constructor body "+a);
    }

    ConstructorDemo(int a,int b){
        this(10);
        this.a=a;
        this.b=b;

    }
    void showData(){

        System.out.println("a and b = "+a+" "+b);
        this.getData();
    }

    void getData(){

    }

    public static void main(String[] args) {

        ConstructorDemo demo=new ConstructorDemo(10,20);
        demo.showData();
    }

}
