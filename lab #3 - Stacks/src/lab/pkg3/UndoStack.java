
package lab.pkg3;

import java.util.ArrayList;

public class UndoStack<E> implements ICommand<E>
{
    ArrayList<E> data;
    
    public UndoStack()
    {
        data = new ArrayList<>();
    }
    
    @Override
    public E pop()
    {
        return data.remove(data.size()-1);
    }
    
    @Override
    public void push(E item)
    {
        data.add(item);
    }

    @Override
    public Integer size()
    {
        return data.size();
    }
    
    @Override
    public boolean isEmpty()
    {
        return data.isEmpty();
    }
}
