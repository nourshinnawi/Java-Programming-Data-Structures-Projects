
package lab.pkg2;

public class CesarSubstitutionCipher extends SubstitutionCipher
{
    protected static String encrypt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public CesarSubstitutionCipher(int shift)
    {
        super(encode(shift));
    }
    
    private static String encode(int shift)
    {
         if(shift < 0)
         {
            shift = 26+shift;
         }
         return encrypt.substring(shift, 26) + encrypt.substring(0, shift);
    }
}
