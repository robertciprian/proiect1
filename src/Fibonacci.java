/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert Ciprian
 */
public class Fibonacci {
    public static void main(String[] args) {
        int fibminus1 = 1;
        int fibminus2 = 1;
        int fib = fibminus1 + fibminus2;
        int sum = fib;
        System.out.println("Primele 20 de numere Fibonnaci sunt:");
        System.out.print(fibminus1 + " " + fibminus2 + " " + fib + " ");
        for(int i = 3; i <= 19; i++){
            fibminus2 = fibminus1;
            fibminus1 = fib;           
            fib = fibminus1 + fibminus2;
            sum = sum + fib;
            System.out.print(fib + " ");
        }
        double average = sum / (double)20;
        System.out.println(" ");
        System.out.println("The average is " + average);
                        
    }
}
