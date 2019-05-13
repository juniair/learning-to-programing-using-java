
public class MyQueue<T> {
	private Node<T> top = null;
	
	
	public void add(T data) {
		Node<T> node = new Node<T>(data);
		if(isEmpty()) {
			top = node;
		}
		else {
			getLastNode().setNext(node);
		}
	}
	
	public T remove() {
		if(top == null) {
			throw new NullPointerException();
		}
		
		Node<T> node = top;
		
		top = top.getNext();
		
		return node.getData();
	}
	
	public T peek() {
		if(top == null) {
			throw new NullPointerException();
		}
		
		return node.getData();
		
	}
	
	private Node<T> getLastNode() {
		
		if(top == null && top.getNext() == null) {
			return top.getNext();
		}
		
		throw new NullPointerException();
	}
	
	
	public boolean isEmpty() {
		return top == null;
	}
}
