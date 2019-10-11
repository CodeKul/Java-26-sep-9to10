package array;

public class OneDArray {
    //int[] array;
    void showData(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }

    }

    /*  void checkVariable(){
          System.out.println(array);
      }
  */
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

       /* int[] a1=new int[10];
        a1[0]=1;
        a1[1]=2;
        a1[2]=3;*/

        OneDArray array = new OneDArray();
        array.showData(a);


    }


}
