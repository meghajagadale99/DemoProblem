package conditionalStatements;

import java.util.Scanner;

public
class TwoFloatingPointNumbers {
    public static
    void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number");
        float a= input.nextFloat();
        float b= input.nextFloat();

        if(a==b){
            System.out.println("They are same");
        }else{
            System.out.println("They are Different");
        }
    }
}
