package innerclasses;

public class MethodInner {

    private String password="1234567890";


    void display(){

        class CheckMethodInner{

            void showData(){

                System.out.println("password : "+password);
            }

        }

        CheckMethodInner methodInner=new CheckMethodInner();
        methodInner.showData();
    }


    public static void main(String[] args) {
        MethodInner methodInner=new MethodInner();
        methodInner.display();
    }
}
