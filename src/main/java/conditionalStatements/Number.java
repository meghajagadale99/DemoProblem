package conditionalStatements;

import java.util.Scanner;

public
class Number {
    public static
    void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int a = input.nextInt();

        if ((a % 5 == 0) && (a % 11 == 0)){
            System.out.println("Number is Divisible By 5 & 11");
        }else{
            System.out.println("Not Divisible");
        }
    }
}
