public class FirstDemo {


    float showData(int a,int b){
        System.out.println("a:"+a+" b: "+b);
        return 1.1F;
    }

    int add(int a,int b){
        int result=a+b;
        return result;
    }

    public static void main(String[] args) {

        FirstDemo demo=new FirstDemo();
        //System.out.println("Hello codekul");

        //demo.showData(20,30);

        System.out.println("addition : "+demo.add(10,20));

    }


}
