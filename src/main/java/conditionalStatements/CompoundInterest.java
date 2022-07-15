package conditionalStatements;

import java.util.Scanner;

public
class CompoundInterest {
    public static
    void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount");
        double principalAmount = sc.nextDouble();
        System.out.println("Enter the Rate of Interest");
        double rateOfInterest = sc.nextDouble();
        System.out.println("Enter The Number of years ");
        double numberOfYears = sc.nextDouble();

        double futureCompoundInterest = principalAmount * (Math.pow((1 + rateOfInterest / 100), numberOfYears));
        double compoundInterest = futureCompoundInterest - principalAmount;

        System.out.println("The Future Compound Interest of Principal Amount " + principalAmount + " is = " + futureCompoundInterest);
        System.out.println("The Compound Interest Of Principal Amount " + principalAmount + " is = " + compoundInterest);

    }
}
