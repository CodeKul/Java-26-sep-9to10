package abstration;

public abstract class AbstractClass {

    abstract void showData();

    void getData(){

        System.out.println("inside get data");

    }

    public static void main(String[] args) {
        AbstractClass abstractClass=new AbstractClass() {
            @Override
            void showData() {

            }
        };
    }

}
