package main;

import java.util.Scanner;

/*
2.      *
        **
        ***
        ****
        *****
*/
// run the outer for loop the no of rows you have
// identify for every row how many cols are there
public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pattern(scanner.nextInt());
    }
    static void pattern(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
