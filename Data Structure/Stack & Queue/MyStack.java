
public class MyStack<T> {
	
	
	private Node<T> top = null;
	
	
	
	public void push(T data) {

		
		Node<T> node = new Node<T>(data);
		if(isEmpty()) {
			top = node;
		}
		else {
			node.setNext(top);
			top = node;
		}
		
	}
	
	public T pop() {
		if(isEmpty()) {
			throw new NullPointerException();
		}
		
		return top.getData();
	}
	
	
	public T seek() {
		if(isEmpty()) {
			throw new NullPointerException();
		}
		
		return top.getData();
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	
	
}
