/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert Ciprian
 */
public class TimeTable {
    public static void main(String[] args) {
        // Afiseaza tabla inmultirii de la 1 la 9
        int number = 9;
        for(int row = 1; row <= 9; row++){
            for(int col = 1; col <= 9; col++){
                System.out.print(row * col + " ");
            }
            System.out.println("");
        }
        // Afiseaza tabla inmultirii de la 1 la 12
        System.out.println("");
        int number2 = 12;
        for(int row = 1; row <= 12; row++){
            for(int col = 1; col <= 12; col++){
                System.out.print(row * col + " ");
            }
            System.out.println("");
        }
    }
}
