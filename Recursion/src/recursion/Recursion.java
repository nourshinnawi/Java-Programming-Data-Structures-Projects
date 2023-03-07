
package recursion;

public class Recursion 
{

    public static void main(String[] args) 
    {
        dieAHoribbleDeath(99);
    }
    
    public static int dieAHoribbleDeath(int x)
    {
        if (x > 100)
        {
            return x;
        }
        else
        {
            return dieAHoribbleDeath(++x);
        }
    }
}