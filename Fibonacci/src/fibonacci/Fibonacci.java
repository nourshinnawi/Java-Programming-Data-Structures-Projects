
package fibonacci;

public class Fibonacci 
{
    public static void main(String[] args) 
    {
       fib(0,1, 0);
    }
    
    public static long fib(int x, int y, int count)
    {
        if (y > 10000000000000L)
        {
            return y;
        }
        else
        {
            System.out.println(count);
            return fib(y, x+y, ++count);
        }
    }
}
