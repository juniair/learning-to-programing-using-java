package project;

public class Node<T> {
    
    T data;
    Node<T> node;
    
    public Node(T data) {
        this.data = data;
        this.node = null;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    public Node<T> getNode() {
        return node;
    }
    
    public void setNode(Node<T> node) {
        this.node = node;
    }
    
}
