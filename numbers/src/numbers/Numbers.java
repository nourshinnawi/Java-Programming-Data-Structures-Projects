
package numbers;

import java.util.Random;

public class Numbers 
{
    public static void main(String[] args) 
    {
        
    }
    
//    void removeEntry(int []array)
//    {
//        int delete;
//        Random rand = new Random();
//        rand.setSeed(System.currentTimeMillis());
//        
//        for (int i =0; i< array.length; i++)
//        {
//            delete = rand.nextInt(array.length-1);
//            
//            for (int j=delete; j<array.length-i-1; j++)
//            {
//                array[j] = array[j+1];
//            }
//            array[array.length-i-1] = 0;
//        }
//    }
    
public void putMark(int i, int j) throws IllegalArgumentException
{
    if ((i < 0) || (i > 2) || (j < 0) || (j > 2))
    {
        throw new IllegalArgumentException("Invalid board position");
    }
    if (board[i][j] != EMPTY)
    {
        throw new IllegalArgumentException("Board position occupied");
    }
    if (isWin(1))
    {
        throw new IllegalArgumentException("Player 1 has already won");
    }
    if (isWin(-1))
    {
        throw new IllegalArgumentException("Player 2 has already won");
    }
    board[i][j] = player; 
    player = -player;
}
    }
