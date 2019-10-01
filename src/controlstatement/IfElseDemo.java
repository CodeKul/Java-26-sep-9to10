package controlstatement;

import java.util.Scanner;

public class IfElseDemo {

    //input percentage=40,50,80
    //first,second,dist,fail

    private void checkIFElse(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number : ");
        int number=scanner.nextInt();
        if (number%2==0){
            System.out.println(number+" Even NUmber");
        }
        else {
            System.out.println(number+" Odd Number");
        }
    }

    private void checkIFElseIf(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter percentage : ");
        int percentage=scanner.nextInt();
        if (percentage<35){
            System.out.println("fail");
        }
        else if (percentage>=35 && percentage<60){
            System.out.println("second class");
        }
        else if (percentage>=60 && percentage<75){
            System.out.println("first class");
        }
        else if (percentage>=75 && percentage<=100){
            System.out.println("distinction");
        }
        else {
            System.out.println("invalid");
        }
    }

    public static void main(String[] args) {
        IfElseDemo demo=new IfElseDemo();
        //demo.checkIFElse();
        demo.checkIFElseIf();
    }

}
