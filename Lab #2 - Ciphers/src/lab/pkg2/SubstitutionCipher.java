
package lab.pkg2;

public class SubstitutionCipher 
{
    protected String encode;
    
    public SubstitutionCipher(String encode)
    {
        this.encode = encode;
    }
    
    public String encrypt(String message)
    {
        return transform(message, encode);
    }
    
    public String transform(String original, String code)
    {
        String text = "";
        original = original.toUpperCase();
        for(int i=0; i<original.length();i++)
        {
            char message = original.charAt(i);
            if (Character.isLetter(message))
            {
                message = code.charAt(message - 'A');
            }
            text += message;
        }
        return text;
    }
}
