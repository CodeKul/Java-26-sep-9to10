package array;

public class TwoDArray {

    void twoDArray(){

        int[][]  array={{1,2,3},{4,5,6},{7,8,9}};
       /* int[][] array1=new int[3][3];
        array1[0][0]=1;
        array1[0][1]=1;
        array1[0][2]=1;*/
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        new TwoDArray().twoDArray();
    }
}

/*
 9 8 7
 6 5 4
 3 2 1*/

/*
 1
   5
     9
 */
/*
7 8 9
4 5 6
1 2 3*/

/*3 2 1
6 5 4
9 8 7*/

/*1 2 3     3 2 1
  4 5 6     4 5 6
  7 8 9     7 8 9*/
