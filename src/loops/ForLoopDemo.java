package loops;

public class ForLoopDemo {

    /*
     * int a=10;
     * int b=a++;a=11 b=10
     * int c=(++b)+(a++);b=11 a=12 c=22
     * int d=(a++)+(++b)+(c++);d=46 c=23 b=12 a=13
     *
     * a=?
     * b=?
     * c=?
     * d=?
     *
     *
     * */

    private void forLoop() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Codekul");
        }
    }

    private void nestedForLoop() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }





    public static void main(String[] args) {
       // new ForLoopDemo().nestedForLoop();


     /*   int a = 10;
        int b = a++;//a=11 b=10
        int c = (++b) + (a++);//b=11 a=12 c=22
        int d = (a++) + (++b) + (c++);//d=46 c=23 b=12 a=13

        System.out.println(a+" "+b+" "+c+" "+d);
*/

     new ForLoopDemo().nestedForLoop();
    }

}



