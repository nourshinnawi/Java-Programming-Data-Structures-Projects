
package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<student> students = new ArrayList();
        HashMap<String, student> firstName = new HashMap();
        students.add(new student("John", "OConnor", 0, "K", 5));
        students.add(new student("Pizza", "Bagel", 2, "2", 6));
        students.add(new student("Peanut", "Butter", 4, "1", 6));
        students.add(new student("John", "OConnor", 0, "K", 5));
        students.add(new student("John", "OConnor", 0, "K", 5));
        
        System.out.println("Enter your student name to log in ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        boolean found = false;        
        for(student temp: students)
        {
            if (temp.getFirstName().equalsIgnoreCase(name))
            {
                found = true;
                System.out.println("Found student " + name + " is in the array");
                return;
            }
            if (!found)
            {
                
            }
        }
    }
    
}
