package main;
/*
7.   *****
      ****
       ***
        **
         *
    0 - 5,0
    1 - 4,1
    2 - 3,2
    3 - 2,3
    4 - 1,4
*/
public class Pattern7 {
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int space = 0; space <= i; space++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < n-i; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
