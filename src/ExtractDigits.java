/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert Ciprian
 */
public class ExtractDigits {
    public static void main(String[] args) {
        int number = 251489;
        for(; number > 0; ){
            int digit = number % 10;
            number = number / 10;
            
            System.out.print(digit + " ");
        }

        
    }
}
