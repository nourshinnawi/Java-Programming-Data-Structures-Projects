
package lab.pkg3;

public class LeakyStack<E> implements ICommand<E>
{
    private final E[] data;
    private int f = 0;
    private int size = 0;
    
    public LeakyStack(int capacity)
    {
        data = (E[]) new Object[capacity];
    }
    
    @Override
    public Integer size()
    {
        return size;
    }
    
    @Override
    public boolean isEmpty( )
    { 
        return (size == 0); 
    }
    
    @Override
    public void push(E e)
    {
        if (size == data.length) 
        {
            size--;
        }
        int avail = (f + size) % data.length;
        data[avail] = e;
        size++;
    }
    
    @Override
    public E pop()
    {
        if (isEmpty( )) 
        {
            return null;
        }
        E answer = data[f];
        data[f] = null;
        f = (f + 1) % data.length;
        --size;
        return answer;
    }
}
