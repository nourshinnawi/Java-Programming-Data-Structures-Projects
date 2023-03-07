
package lab.pkg2;

import java.util.Scanner;

public class Lab2
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Cesar Cipher");
        CesarCipher cipher = new CesarCipher(8);
  
        System.out.print("Enter the message to code: ");
        String message = input.nextLine();

        String coded = cipher.encrypt(message);
        System.out.println("The coded message is: " + coded);
        System.out.printf("%n");
        //------------------------------
        System.out.println("Substitution Cipher");
        String encoder = "ZXCUIOPYTREWQASHGFDKJLMVNB";
        SubstitutionCipher cipher2 = new SubstitutionCipher(encoder);
        
        System.out.print("Enter the message to code: ");
        String message2 = input.nextLine();
        
        String coded2 = cipher2.encrypt(message2);
        System.out.println("The coded message is: " + coded2);
        System.out.printf("%n");
        //------------------------------
        System.out.println("Cesar Substitution Cipher");
        CesarSubstitutionCipher cipher3 = new CesarSubstitutionCipher(8);
        
        System.out.print("Enter the message to code: ");
        String message3 = input.nextLine();

        String coded3 = cipher3.encrypt(message3);
        System.out.println("The coded message is: " + coded3);
        System.out.printf("%n");
        //------------------------------
        System.out.println("Random Cipher");
        RandomCipher cipher4 = new RandomCipher(0);
        
        System.out.print("Enter the message to code: ");
        String message4 = input.nextLine();

        String coded4 = cipher4.encrypt(message4);
        System.out.println("The coded message is: " + coded4);
        System.out.printf("%n");
    }   
}
