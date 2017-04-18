/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert Ciprian
 */
public class PrintDayInWord {
    public static void main(String[] args) {
        int number = 7;
        /*if(number == 0){
            System.out.println("SUNDAY");
        }
        else if(number == 1){
            System.out.println("MONDAY");
        }
        else if(number == 2){
            System.out.println("TUESDAY");
        }
        else if(number == 3){
            System.out.println("WEDNESDAY");
        }
        else if(number == 4){
            System.out.println("THURSDAY");
        }
        else if(number == 5){
            System.out.println("FRIDAY");
        }
        else if(number == 6){
            System.out.println("SATURDAY");
        }
        else{
            System.out.println("NOT A VALID DAY");
        }
        */
        switch(number){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid day");
        }
    }
}
