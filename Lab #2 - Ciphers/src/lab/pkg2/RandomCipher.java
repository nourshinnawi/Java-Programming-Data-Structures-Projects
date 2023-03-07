
package lab.pkg2;

import java.util.ArrayList;
import java.util.List;

public class RandomCipher extends SubstitutionCipher 
{
    protected static String encrypt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     
    public RandomCipher(int shift)
    {
        super(random(encrypt));
    }
    
    private static String random(String input)
    {
        List<Character> text = new ArrayList<>();
        
        for (char code:input.toCharArray())
        {
            text.add(code);
        }
        
        StringBuilder string = new StringBuilder(input.length());
        
        while(!text.isEmpty())
        {
            int number = (int)(Math.random()*text.size());
            string.append(text.remove(number));
        }
        
        return string.toString();
    }
}
