
package trees;

public class Tree<T extends Comparable> {
    treeNode<T> root;
    
    public void add(T data) {
        if (root == null) {
            root = new treeNode();
            root.data = data;
        } else {
            root.add(data);
        }
    }
    
    public treeNode search(treeNode n, T termToSearch) {
        
        if (n == null)
        {
            return null;
            //if node is null, return null
        }
        if (termToSearch == n)
        {
            return n;
            //if term to search is in n, return n
        }
        if (termToSearch.compareTo(n) < 0)
        {
            search(n.left, termToSearch);
            // if termToSearch is less than value at n, search left
        }
        if (termToSearch.compareTo(n) > 0)
        {
            search(n.right, termToSearch);
            // if termToSearch is greater than value at n, search right
        }
        return n;
    }
    
    // prints all of the nodes of the tree using in-order traversal.
    public void printInOrder(treeNode n) {
        if (n == null) {
            return;
        }
        // Go down the left until you get to the end and print
        printInOrder(n.left);
        // output yourself
        System.out.println(n);        
        // go down the right until you get to the end and print
        printInOrder(n.right);
    }
    
//    @Override
//    public String toString() {
//        // do in-order traversal and print it out.
//    }
}