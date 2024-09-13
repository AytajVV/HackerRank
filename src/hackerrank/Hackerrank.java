/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author aytaj.veyisli
 */
public class Hackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        for (int i = 0; i < t; i++) {
//
//            try {
//                long x = sc.nextLong();
//                System.out.println(x + " can be fitted in:");
//                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
//                    System.out.println("* byte");
//                }
//                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
//                    System.out.println("* short");
//                }
//                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
//                    System.out.println("* int");
//                }
//                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
//                    System.out.println("* long");
//                }
//                //Complete the code
//            } catch (Exception e) {
//                System.out.println(sc.next() + " can't be fitted anywhere.");
//            }
//        }





        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc = new Scanner(System.in);
        int h = sc.nextInt();
        
        if (a>0 && h>0) {
            int s = a*h;
            System.out.println(s);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }
}
