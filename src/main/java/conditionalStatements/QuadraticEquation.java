package conditionalStatements;

import java.util.Scanner;

public
class QuadraticEquation {
    public static
    void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double result = (b * b - 4.0 * a * c);

        if (result > 0.0) {
            double r1 = (-b + Math.pow(result,0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result,0.5)) / (2.0 * a);
            System.out.println("The Roots Are:" + r1 + " " + r2);
        } else if (result == 0.0) {
            double r3 = -b / (2.0 * a);
            System.out.println("The root Are" + r3);
        }else{
            System.out.println("There is no Quadratic Equation");
        }
    }
}
