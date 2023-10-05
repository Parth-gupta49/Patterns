package main;
/*
9.  *********       0 - 0,9,0
     *******        1 - 1,7,1
      *****         2 - 2,5,2
       ***          3 - 3,3,3
        *           4 - 4,1,4
   stars :
   0 - 9 stars = 2 * n - 1 - 2*i
   1 - 7 stars = 2 * 5 - 1 - 2*1
   2 - 5 stars = 2*5 - 1 - 2*2
   3 - 3 stars = 10-1-2*3

*/
public class Pattern9 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n ){
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < 2*n - 2*i - 1; stars++) {
                System.out.print("*");
            }
            for (int space = 0; space <i; space++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
