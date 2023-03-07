
package highscorelist;

public class Node 
{
    Integer data = null;
    Node next = null;
    Node prev = null;
    
    public Node(Integer data)
    {
        this.data = data;
    }
    
    public Node retrieve(Integer index)
    {
        if (index != 0)
        {
            return this.next.retrieve(--index);
        }
        else
        {
            return this;
        }
    }
    
    public void add(Node nodeToAdd)
    {
        if (this.next == null)
        {
            this.next = nodeToAdd;
        }
        else
        {
            this.next.add(nodeToAdd);
        }
    }
    // remove node from end
    public void remove()
    {
        if (this.next == null)
        {
            // I am in a single node linked list
            // delete me
            //throw new Exception("Cannot remove from single-node linked list");
            System.out.println("Nope");
        }
        else if (this.next.next == null)
        {
            // we know the next one is the tail
            // cut it off
            this.next = null;            
        }
        else
        {
            // we aren't the tail
            this.next.remove();
        }
    }
    public Node search(Integer intToFind)
    {
        if (this.data == intToFind)
        {
            return this;
        }
        else if (this.next == null)
        {
            return null;
        }
        else
        {
            return this.next.search(intToFind);
        }
    }
}
