/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert Ciprian
 */
public class Product1toN {
    public static void main(String[] args) {
        int produs = 1;
        for(int i = 1; i <= 10; i++){
            produs *= i;
        }
        System.out.println("Produsul numerelor de la 1 la 10 este " + produs);
        long produs2 = produs * 11;
        long produs3 = produs2 * 12;
        long produs4 = produs3 * 13;
        long produs5 = produs4 * 14;
        System.out.println("Produsul numerelor de la 1 la 11 este " + produs2);
        System.out.println("Produsul numerelor de la 1 la 12 este " + produs3);
        System.out.println("Produsul numerelor de la 1 la 13 este " + produs4);
        System.out.println("Produsul numerelor de la 1 la 14 este " + produs5);
    }
}
