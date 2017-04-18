/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert Ciprian
 */
public class ComputePI {
    public static void main(String[] args) {
        int number = 1000;
        double pi = 0;
        
        for(int i = 1; i <= 10000000; i = i + 4){
            pi = pi + 1 / (double)i;
        }
        System.out.println(pi);
        for(int j = 3; j <= 10000000; j = j + 4){
            pi = pi - 1 / (double)j;
        }
        pi = pi * 4;
        System.out.println("Valoarea lui pi este " + pi);
        System.out.println(pi - Math.PI);
    }
}
