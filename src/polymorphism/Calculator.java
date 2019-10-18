package polymorphism;

public class Calculator {

    //Method overloading

    int add(int a,int b){
        return (a+b);
    }

    int add(int a,int b,int c){
        return (a+b+c);
    }

    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println("Addition is : "+cal.add(10,20,30));
    }

}
