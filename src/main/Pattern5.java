package main;
/*

5.      *                   1 - 1
        **                  2 - 2
        ***                 3 - 3
        ****                4 - 4
        *****               5 - 5
                    rows < n => col = 1 ; col <= rows
        ****                6 - 4    6 - col = 2 * n - i
        ***                 7 - 3    7 - col = 2 * 5 - 7
        **                  8 - 2
        *                   9 - 1
*/

public class Pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
//        no of lines = no of times the outer loop will run
//        2 * n - 1

        for (int rows = 1; rows <= 2 * n - 1; rows++) {
             int condition = rows>n?2 * n - rows:rows;
             for (int cols = 1; cols <= condition; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
