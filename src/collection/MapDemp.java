package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemp {

    public static void main(String[] args) {


        Map<String,Object> map=new HashMap<>();
        Map<String,Object> map1=new HashMap<>();

        Demo demo=new Demo();
        demo.setAddress("pune");
        demo.setName("codekul");
        demo.setPincode("411038");

        CompanyDetails details=new CompanyDetails();
        details.setCompany("Melayer");
        details.setCompanyAddress("Kothrud");

        demo.setCompanyDetails(details);

        map.put("demo",demo);
        map.put("state","maharashtra");


     /*   map.put("name","codekul");
        map.put("address","pune");
        map.put("pincode","411038");

        map1.put("company","Melayer");
        map1.put("company address","Kothrud");

        map.put("company details",map1);*/

        System.out.println(map);

    }

}


class Demo {
    String pincode;
    String address;
    String name;
    CompanyDetails companyDetails;

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public CompanyDetails getCompanyDetails() {
        return companyDetails;
    }

    public void setCompanyDetails(CompanyDetails companyDetails) {
        this.companyDetails = companyDetails;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "pincode='" + pincode + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", companyDetails=" + companyDetails +
                '}';
    }
}

 class CompanyDetails{

    String companyAddress;
    String company;

     public String getCompanyAddress() {
         return companyAddress;
     }

     public void setCompanyAddress(String companyAddress) {
         this.companyAddress = companyAddress;
     }

     public String getCompany() {
         return company;
     }

     public void setCompany(String company) {
         this.company = company;
     }

     @Override
     public String toString() {
         return "CompanyDetails{" +
                 "companyAddress='" + companyAddress + '\'' +
                 ", company='" + company + '\'' +
                 '}';
     }
 }
