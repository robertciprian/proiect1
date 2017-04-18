/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert Ciprian
 */
public class Tribonacci {
    public static void main(String[] args) {
        System.out.println("The first 20 tribonacci numbers are:");
        int fibminus1 = 2;
        int fibminus2 = 1;
        int fibminus3 = 1;
        int fib = fibminus1 + fibminus2 + fibminus3;
        System.out.print(fibminus3 + " " + fibminus2 + " " + fibminus1 + " ");
        for(int i = 4; i <= 20; i++){
            fib = fibminus1 + fibminus2 + fibminus3;
            System.out.print(fib + " ");
            fibminus3 = fibminus2;
            fibminus2 = fibminus1;
            fibminus1 = fib;
            //fib = fibminus1 + fibminus2 + fibminus3;
            //System.out.print(fib + " ");
        }
    }
}
