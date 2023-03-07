
package numbers;

public class LinkedList 
{
    Node head;  
    class Node 
    { 
        int data; 
        
        Node next; 
        Node(int data) 
        { 
            this.data = data; 
            next = null; 
        } 
    }  
    void secondToLastNode() 
    {
        Node temp = head; 
        
        if(temp == null)
        {
            System.out.println("No node available");
        }
        else if(temp.next == null)
        {
            System.out.println("Only one node available");
        }
        else
        {
            while (temp.next.next != null) 
            { 
                temp = temp.next; 
            } 
            System.out.println(temp.data); 
        }
    } 
    public void push(int newData) 
    { 
        Node newNode = new Node(newData); 
        newNode.next = head; 

        head = newNode; 
    }     
}

int size() 
{
        int count = 0;
        Node<E> temp = new Node<>(0, null, header);
        while(temp.getNext() != null)
        { 
            count++;
            temp = temp.getNext();
        }
        return count;
}

void rotate(int i)
{
        if(size > 1 && i > 0)
        {
            for(int count = 1; count <= i; count++)
            {
                addLast(removeFirst());
            }
        }
}