package inheritancedemo;

public class Company extends Employee{

    String getCompanyName(){
        return "Melayer Softwares";
    }


    public static void main(String[] args) {
        Company c=new Company();
        System.out.println("NAme OF the Employee===>"+c.getEmpolyeeName());

    }

}
