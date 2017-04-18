/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert Ciprian
 */
public class SumAndAverage {
    public static void main(String[] args) {
        // Calculeaza suma si media folosing bucla for
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        double average = sum / (double)100;
        System.out.println(sum + "\n");
        System.out.println(average + "\n");
        
        // Calculeaza suma si media folosing bucla while/do
        int sum2 = 0;
        int i = 1;
        while(i <= 100){
            sum2 += i;
            i++;
        }
        double average2 = sum2 / (double)100;
        System.out.println(sum2 + "\n");
        System.out.println(average2 + "\n");
        
        // Calculeaza suma si media folosing bucla do/while
        int sum3 = 0;
        int j = 1;
        do {
            sum3 += j;
            j++;
        }while(j <= 100);
        double average3 = sum3 / (double)100;
        
        System.out.println(sum3 + "\n");
        System.out.println(average3 + "\n");
        
        // Calculeaza suma de la 111 la 8899
        int sum4 = 0;
        int count = 0;
        for(int k = 111; k <= 8899; k++){
            sum4 += k;
            count++;
        }
        //System.out.println(count);
        //System.out.println(sum4);
        double average4 = sum4 / (double)count;
        System.out.println(average4);
        
        // Calculeaza doar numerele impare de la 1 la 100
        int sum5 = 0;
        int contor = 0;
        for(int k = 1; k <= 100; k++){
            if(k % 2 != 0){
                sum5 += k;
                contor++;
            }
        }
        double average5 = sum5 / (double)contor;
        System.out.println(average5);
        
        // Calculeaza media nr de la 1 la 100, divizibile cu 7
        
        int sum6 = 0;
        int count2 = 0;
        for(int a = 1; a <= 100; a++){
            if(a % 7 == 0){
                sum6 += a;
                count2++;
            }
        }
        System.out.println(sum6);
        System.out.println(count2);
        double average6 = sum6 / (double)count2;
        System.out.println(average6);
        
        // Calculeaza suma patratelor tuturor numerelor de la 1 la 100
        
        int sum7 = 0;
        for(int b = 1; b <= 7; b++){
            sum7 = sum7 + b*b;
        }
        System.out.println("Suma patratelor numerelor este " + sum7);
    }
}
