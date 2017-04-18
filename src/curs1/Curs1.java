/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs1;

/**
 *
 * @author Robert Ciprian
 */
public class Curs1 {
    //static int nrApelari = 0;
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int z = (((x++) + (++y)) > 5 && ((++x) + y) < 10) ? 1 : 0;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
       
}
    

