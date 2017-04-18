/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert Ciprian
 */
public class SquareBoard {
    public static void main(String[] args) {
        int number = 5;
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                System.out.print("# ");
            }
            System.out.println("");
        }
    }
}
