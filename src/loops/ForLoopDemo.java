package loops;

public class ForLoopDemo {

    /*
    * int a=10;
    * int b=a++;
    * int c=(++b)+(a++);
    * int d=(a++)+(++b)+(c++);
    *
    * a=?
    * b=?
    * c=?
    * d=?
    *
    *
    * */

    private void forLoop(){

        for (int i=0;i<10;i++) {
            System.out.println("Codekul");
        }
    }

    private void nestedForLoop(){

        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        new ForLoopDemo().nestedForLoop();
    }

}



