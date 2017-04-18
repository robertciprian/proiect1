/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert Ciprian
 */
public class HarmonicSum {
    public static void main(String[] args) {
        // Calculeaza suma harmonica de la stanga la dreapta
        int number = 50000;
        double hsum = 0;
        for(int i = 1; i <= number; i++){
            hsum += 1 / (double)i;
        }
        System.out.println("Suma harmonica este " + hsum);
        
        // Calculeaza suma harmonica de la dreapta la stanga
        
        double hsum2 = 0;
        for(int i = number; i >= 1; i--){
            hsum2 += 1 / (double)i;
        }
        System.out.println("Suma harmanica2 este " + hsum2);
        System.out.println(hsum - hsum2);
    }
}
