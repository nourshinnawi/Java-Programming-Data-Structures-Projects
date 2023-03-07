
package highscorelist;

public class CircularNode 
{
    Integer data = null;
    CircularNode next = null;
    CircularNode prev = null;
    
    public CircularNode(Integer data)
    {
        this.data = data;
    }
    
    public CircularNode retrieve(Integer index, CircularNode head)
    {
        if (index != 0)
        {
            return this.next.retrieve(--index, head);
        }
        else
        {
            return this;
        }
    }
    
    public void add(CircularNode nodeToAdd, CircularNode head)
    {
//        if (this.next == null)
//        {
//            this.next = nodeToAdd;
//        }
//        else
//        {
//            this.next.add(nodeToAdd, head);
//        }
//        if (this.next == head)
//        {
//            this.next = nodeToAdd;
//            nodeToAdd.next = head;
//        }
//        else
//        {
//            this.next.add(nodeToAdd, head);
//        }
        if (this.next.next == head)
        {
            // we found the tail - let's remove it
            this.next = head;
        }
        
    }
    // remove node from end
    public void remove(CircularNode head)
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
            this.next.remove(head);
        }
    }
    public CircularNode search(Integer intToFind, CircularNode head)
    {
        if (this.data.equals(intToFind))
        {
            return this;
        }
        else if (this.next == null)
        {
            return null;
        }
        else
        {
            return this.next.search(intToFind, head);
        }
    }
}
