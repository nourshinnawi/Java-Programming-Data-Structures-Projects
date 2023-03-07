
package stacksandqueues;

import java.util.ArrayList;

public class ArrayStack implements IStack
{
    ArrayList<Object> myData;
    
    public ArrayStack()
    {
        myData = new ArrayList<Object>();
    }
    @Override
    public void push(Object , itemToPush ) 
    {
        myData.add(itemToPush);
    }

    @Override
    public Integer pop() 
    {
        return myData.remove(myData.size());
    }
    
    @Override
    public Integer size()
    {
        return myData.size();
    }
}
