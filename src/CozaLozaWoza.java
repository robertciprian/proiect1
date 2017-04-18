/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert Ciprian
 */
public class CozaLozaWoza {
    public static void main(String[] args) {
        int value = 1;
        boolean printed = false;
        for(int i = 1; i <= 110; i++){
            if(i % 3 == 0){
                System.out.print("Coza");
                printed = true;
            }
            if(i % 5 == 0){
                System.out.print("Loza");
                printed = true;
            }
            if(i % 7 == 0){
                System.out.print("Woza");
                printed = true;
            }
            if(i % 7 !=0 & i % 5 != 0 & i % 3 != 0){
                System.out.print(value + " ");
            }
            if(i % 11 == 0){
                System.out.print("\n");
            }
            else {
                System.out.print(" ");
            }
            value++;
        }
    }
}
