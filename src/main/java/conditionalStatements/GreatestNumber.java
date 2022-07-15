package conditionalStatements;

import java.util.Scanner;

public
class GreatestNumber {
    public static
    void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is Greater");
        } else if (b > a && b > c) {
            System.out.println(b + " is Greater");
        } else if (c > a && c > b) {
            System.out.println(c + " is Greater");
        } else {
            System.out.println("Nothing");
        }
    }
}
