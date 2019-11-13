package encapsulation;

import java.util.Scanner;

public class CheckEncapsulation {

    public static void main(String[] args) {

        Student student=new Student();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the name and address : ");
        student.setName(scanner.nextLine());
        student.setAddress(scanner.nextLine());

        System.out.println("name : "+student.getName()+"\n"+"address : "+student.getAddress());

    }
}
