package conditionalStatements;

import java.util.Scanner;

public
class AddTwoNumber {
    public static
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

//        int sum = a+b;
//        System.out.println(sum);
        AddTwoNumber addTwoNumber = new AddTwoNumber();
        addTwoNumber.addition(a,b);
    }

    public void addition(int a,int b){
        System.out.println(a+b);
    }
}
