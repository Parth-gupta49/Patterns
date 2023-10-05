package main;
/*
6.       *
        **
       ***
      ****
     *****
     1 - 4,1
     2 - 3,2
     3 - 2,3
     4 - 1,4
     5 - 0,5
*/

public class Pattern6 {
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int n){
        for (int i = 1 ;i <= n; i++) {
            for (int spaces = 0; spaces < n - i; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= i; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
