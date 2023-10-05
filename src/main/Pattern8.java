package main;
/*
8.      *           1 - 4,1,4
       ***          2 - 3,3,3
      *****         3 - 2,5,2
     *******        4 - 1,7,1
    *********       5 - 0,9,0
    stars pattern :
    1 - 1  col = row * 2 -1
    2 - 3  col = 2 * 2 - 1
    3 - 5  col = 3 * 2 - 1
    4 - 7  col = 4 * 2 - 1
    space :
    1 - 4 space = n - row
    2 - 3 space = 5 - 2
*/
public class Pattern8 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= i * 2 - 1; col++) {
                System.out.print("*");
            }
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

