/*
Kullanicidan  aldigimiz iki sayinin yerini degistirecegiz
birinci sayi ikinci sayi olacak
ikici sayi da birinci sayi olacak
 */
package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {


    public static void main(String[] args) {
    
        Scanner scanner = new Scanner (System.in);
        int x1;
        int x2;
        System.out.print("Birinci sayiyi giriniz = ");
        x1 = scanner.nextInt();
        System.out.print("Birinci sayiyi giriniz = ");
        x2 = scanner.nextInt();
        System.out.println("Degistirmeden Once ...");
        System.out.println("Birinci sayi = " + x1);
        System.out.println("Ikinci sayi = " + x2 );
        int g1 = x1;
        x1 = x2;
        x2 = g1;
        System.out.println("Degistirmeden Sonra ...");
        System.out.println("Birinci sayi = " + x1);
        System.out.println("Ikinci sayi = " + x2 );
   
    }
    
}
