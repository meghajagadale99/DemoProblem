package conditionalStatements;

import java.util.Scanner;

public
class WeekDays {
    public static
    void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number");
        int days = input.nextInt();

        String dayName = " ";

        switch (days) {
            case 1:
                dayName = "Monday";
                System.out.println(dayName);
                break;
            case 2:
                dayName = "Tuesday";
                System.out.println(dayName);
                break;
            case 3:
                dayName = "Wednesday";
                System.out.println(dayName);
                break;
            case 4:
                dayName = "Thursday";
                System.out.println(dayName);
                break;
            case 5:
                dayName = "Friday";
                System.out.println(dayName);
                break;
            case 6:
                dayName = "Saturday";
                System.out.println(dayName);
                break;
            case 7:
                dayName = "Sunday";
                System.out.println(dayName);
                break;
            default:
                System.out.println("Nothing");
        }
    }
}
