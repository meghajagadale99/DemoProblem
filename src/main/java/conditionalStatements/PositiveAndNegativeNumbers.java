package conditionalStatements;

import java.util.Scanner;

public
class PositiveAndNegativeNumbers {
    public static
    void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The number:");
        int a = input.nextInt();

        if (a > 0) {
            System.out.println("positive number");
        } else if (a < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("nothing");
        }
    }
}
