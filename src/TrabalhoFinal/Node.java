package TrabalhoFinal;

public class Node<T> {
	
	public T element;
	public Node<T> next;
	
	public Node() {
		next=null;
		element= null;
	}
	
	
	//get and setter next
	public Node<T> getNext() {
		return next;
	}



	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	



	public T getElement() {
		return element;
	}



	public void setElement(T element) {
		this.element = element;
	}



	public Node(T elem) {
		this.element=elem;
		next=null;
		}


}
