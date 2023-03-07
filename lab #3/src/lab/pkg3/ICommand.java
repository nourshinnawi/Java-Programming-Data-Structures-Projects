
package lab.pkg3;

public interface ICommand <E>
{
    public void push(E item);
    public E pop();
    public Integer size();
    public boolean isEmpty();
}
