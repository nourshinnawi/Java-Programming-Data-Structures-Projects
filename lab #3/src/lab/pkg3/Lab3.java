
package lab.pkg3;

public class Lab3 
{
    public static void main(String[] args) 
    {
        UndoStack<Integer> a = new UndoStack<>();
        a.push(5);
        a.push(4);
        a.push(3);
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println();
        
        LeakyStack b = new LeakyStack(5);
        b.push(1);
        b.push(2);
        b.push(6);
        
        System.out.println(b.pop());
        System.out.println(b.pop());
        System.out.println();
        
        
    }   
}
