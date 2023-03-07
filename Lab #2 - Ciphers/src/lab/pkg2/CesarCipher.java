
package lab.pkg2;

public class CesarCipher 
{
    private final char[] encoder = new char [26];
    
    public CesarCipher(int shift)
    {
        for (int i=0; i<26; i++)
        {
            encoder[i] = (char) ('A' + (i+shift) %26);
        }
    }
    public String encrypt(String message)
    {
        return transform(message, encoder);
    }
    
    private String transform(String original, char[] code)
    {
        char[] message = original.toCharArray();
        
        for(int i=0; i<message.length;i++)
        {
            if(Character.isUpperCase(message[i]))
            {
                int x = message[i] - 'A';
                message[i] = code[x];
            }
            else if (Character.isLowerCase(message[i]))
            {
                    int x = message[i] - 'a';
                    message[i] = code[x];
            }
        }
        return new String(message);
    }
}
