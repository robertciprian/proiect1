/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert Ciprian
 */
public class CheckerBoard {
    public static void main(String[] args) {
        int number = 7;
        for(int row = 1; row <= number; row++){
            if(row % 2 == 0){
                for(int col = 1; col <= number; col++){
                    System.out.print(" #");
                }
                
            }
            else{
                for(int col = 1; col <= number; col++){
                System.out.print("# ");
                }
            }            
            System.out.println("");
        }
    }
}
