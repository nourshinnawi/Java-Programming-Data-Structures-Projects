
package highscorelist;

import java.util.LinkedList;


public class HighScoreList 
{
    public static void main(String[] args)
    {
        Node head = new Node(5);
        head.add(new Node(10));
        head.add(new Node(15));
        head.add(new Node(20));
        head.add(new Node(25));
        System.out.println(head.retrieve(2).data);
        System.out.println(head.search(20));
//        head.add(new Node());
//        head.add(new Node());
//        head.add(new Node());
        head.remove();
        System.out.println(head.search(25));
        
        LinkedList<Integer> l1 = new LinkedList();
        l1.add(5);
        l1.add(10);
        l1.add(15);
        System.out.println(l1.get(2));
        LinkedList<Integer> l2 = new LinkedList();
        l2.add(5);
        l2.add(10);
        l2.add(15);
        System.out.println(l1 == l2);
     
//        int i = 0;
//        for (int i = 0; i < 100; i++) // ++i skips the first iteration
//        while (i < 100)
//        {
//            myValues[i];
//            i++;
//        }
        
        
        //        Integer[] scoresList = new Integer[10];
//    
////        for (int i=scoresList.length - 1; i >= 0; i--)
////        {
////            scoresList[i] = i * 100;
////            System.out.printf("%d%n",scoresList[i]);
////        }
    }
}
