package innerclasses;

public class MemberInner {

    private String password ="1234567890";

    class CheckMember{

        void showData(){
            System.out.println("password : "+password);
        }

    }


    public static void main(String[] args) {

        MemberInner inner=new MemberInner();
        MemberInner.CheckMember checkMember=inner.new CheckMember();
        checkMember.showData();
    }

}
