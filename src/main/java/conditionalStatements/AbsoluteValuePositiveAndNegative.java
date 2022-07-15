package conditionalStatements;

import java.util.Scanner;

public
class AbsoluteValuePositiveAndNegative {
    public static
    void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number");
        float result = input.nextFloat();

        if (result > 0) {
            if (Math.abs(result) < 1) {
                System.out.println("positive small number");
            } else if (Math.abs(result) > 1000000) {
                System.out.println("positive large number");
            } else {
                System.out.println("positive");
            }
        }
        else if (result < 0) {
            if (result < 1) {
                System.out.println("negative small number");
            } else if (result < 1000000) {
                System.out.println("negative large number");
            } else {
                System.out.println("negative");
            }
        }
        else {
            System.out.println("zero");
        }
    }
}
