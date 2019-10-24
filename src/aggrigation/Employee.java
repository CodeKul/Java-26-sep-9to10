package aggrigation;

public class Employee {

    int empId;
    String empName;
    Company company;    //entity reference

    public Employee(int empId, String empName, Company company) {
        this.empId = empId;
        this.empName = empName;
        this.company = company;
    }


    void display(){

        System.out.println("empId : "+empId+
                "\nempName : "+empName+
                "\ncompany Name : "+company.companyName+
                "\ncompany Id : "+company.companyId);
    }

    public static void main(String[] args) {
        Company company=new Company(1,"Infosys");
        Employee employee=new Employee(101,"ABCD",company);
        employee.display();
    }

}
