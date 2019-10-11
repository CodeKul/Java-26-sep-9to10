package loops;

public class WhileLoopDemo {

    void checkWhile(){
        int i=0;
        while (i<5){
            System.out.println("while loop "+i);
            i++;
        }
        checkDoWhile(i);
    }

    void checkDoWhile(int i){

       do {
            System.out.println("do while : "+i);
            i++;
        }while (i<5);

        System.out.println("final value : "+i);

    }


    public static void main(String[] args) {
        new WhileLoopDemo().checkWhile();
    }
}
