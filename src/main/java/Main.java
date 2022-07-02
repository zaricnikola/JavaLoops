
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zaric
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Loops");
        
//        int age = 18; 
//        
//        System.out.println("Koliko imate godina");
//        Scanner in = new Scanner(System.in);
//        int age2 =  in.nextInt();
//        System.out.println("uneli ste broj: " + age2);
//        
//        if (age2 >= 0 || age2 > 150) {
//            System.out.println("invalid"); 
//        } else if (age <= 5) {
//            System.out.println("baby");   
//        } else if (age2 <= 11) {
//            System.out.println("kid");   
//        } else if (age2 <= 17) {
//            System.out.println("teen");
//        } else if (age2 >= 18) {
//            System.out.println("adult");
//        }

//        System.out.println("----------------------");
//        
//        System.out.println("unesi redni broj dana u nedelji 1-7");
//        
//        Scanner in2 = new Scanner(System.in);
//        int dayNumber = in2.nextInt();
//        
//        
//        String day = "";
//        switch (dayNumber) {
//            case 1:
//                day = "ponedeljak";
//                break;
//            case 2:
//                day = "utorak";
//                break;
//            case 3:
//                day = "sreda";
//                break;
//            case 4:
//                day = "cetvrtak";
//                break;
//                
//            case 5:
//                day = "petak";
//                break;
//                
//            case 6:
//                day = "subota";
//                break;
//                
//            case 7:
//                day = "nedelja";
//                break;
//                
//            default:
//                day = "nepoznat";
//                break;
//        }
//        
//        System.out.println("uneli ste " + day);
          
//          System.out.println("primer while petlje");
//          int x = 5;
//          
//          while (x < 10) {
//            System.out.println(x);
//            x = x + 1;
//          }
//          
//          while (x > 0) {
//            System.out.println(x);
//            x--;
//          }

             for (int i = 0; i < 10; i++) {
                 for (int j = 0; j <= i; j++) {        
                    System.out.print(" *");     
         
                 }
                 System.out.println();
        }
            
      
    }
    
    
    
}
