package trees;

public class treeNode<T extends Comparable> {
    treeNode<T> left;
    treeNode<T> right;
    treeNode<T> parent;
    T data;
    
    public void add(T data) {
        if (data.compareTo(this.data) < 0) {
            // check the left side
            if (left == null) {
                // add a new tree node to the left.
                left = new treeNode();
                // add the data to that new tree node
                left.data = data;
                left.parent = this;                
            } else {
                left.add(data);
            }
        } else {
            // check the right side            
            if (right == null) {
                // add a new tree node to the right.
                right = new treeNode();
                // add the data to that new tree node.
                right.data = data;
                // Who's your daddy?
                right.parent = this;
            } else {
                right.add(data);
            }
        }
    }
    
    @Override
    public String toString() {
        return data.toString();
    }
}
