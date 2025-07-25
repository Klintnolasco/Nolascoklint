
package nolascoklint;

import java.util.Scanner;



public class NolascoKlint {
 
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int byear;
        
        System.out.print("Enter Your Name: ");
        name = sc.nextLine();
        System.out.print("Enter your birth year: ");
        byear = sc.nextInt();
        System.out.print("hello "+name+"your age is "+(2025-byear));
        
    }
}
