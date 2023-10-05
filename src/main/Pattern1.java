package main;
/*
1.      *****
        *****
        *****
        *****
        *****
*/

public class Pattern1 {
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int n){
        // no of lines = no of time outer loop will run
        // identify for every row how many cols are there
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
