package polymorphism;

public class CheckMethodOverriding extends Calculator{

    //Method overriding

    int add(int a,int b){
        return (a+b+10);
    }


    int add(int a,int b,int c){
        return (a+b+c+10);
    }

    public static void main(String[] args) {
        CheckMethodOverriding overriding=new CheckMethodOverriding();
        System.out.println("Addition : "+ overriding.add(10,20));
    }

}
