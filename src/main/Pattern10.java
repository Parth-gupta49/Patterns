package main;
/*
10.      *           4,1,3
        * *          3,2,2
       * * *         2,3,1
      * * * *        1,4,0
     * * * * *       0,5,0
     last spaces :
     1 - 3 space = n - 1 - row
     2 - 2 space = 5 - 3
     3 - 1 space = 5 - 4
     4 - 0 space = 5 - 5
     5 - 0 space = -1

     first space :
     1 - 4 space = n - row
     2 - 3 space =
*/
public class Pattern10 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int firstSpaces = 1; firstSpaces <= n - i; firstSpaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("* ");
            }
            for (int lastSpaces = 1; lastSpaces <= n - 1 - i; lastSpaces++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
