package main;

/*
3.      *****
        ****
        ***
        **
        *
*/

public class Pattern3 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
//        no of lines = no of times outer loop will run

        for (int i = 1; i <= n; i++) {
//            for every row how many cols are there
           /*
             1 - 5 n-rows+1
             2 - 4
             3 - 3
             4 - 2
             5 - 1    */
            /*for (int j = n; j >= i; j--) {
                System.out.print("*");
            }*/
            // this inner loop can also be implemented as :
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
