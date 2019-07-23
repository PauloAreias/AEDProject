package TrabalhoFinal;


public class LinkedList<T> {
	
	Node<T> head;
	
	class Node<T>{
		T data;
		T element;
		Node<T> next;
		
		
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



		Node(T element) {
			this.element=element;
			next=null;
			}
	}
	
	
	public LinkedList() {
		head = null;
		
	}
	
	
	
	
	
	

	public void add(T newData) {
		Node<T> newNode= new Node<T>(newData);
		if (head==null) {
			head=newNode;
		}else {
			newNode.setNext(head);
			head=newNode;
		}
	}
	
	T delete(T element) {
		if (head==null) {
			return null;
		}
		
		Node<T> current=head;
		Node<T> previous= null;
			
		while (current!=null && !current.getElement().equals(element)){
			previous = current;
			current = current.getNext();
		}
		
		if (current==null) {
			return null;
		}
		
		if (current == head) {
			head = current.getNext();
			current.setNext(null);
			}else if (current.getNext()==null){
				previous.setNext(null);
			}else {
				previous.setNext(current.getNext());
				current.setNext(null);
			}
		return current.getElement();
				
			
	}
	
	public void print() {
		Node<T> tnode=head;
		while (tnode !=null) {
			System.out.print(tnode.element);
			tnode= tnode.next;
			if(tnode !=null) {
				System.out.print(" -> ");
			}
		}
	}
	
	public <T extends Comparable<? super T>> T linearSearch2(Node<T> head, T target) {

		Node<T> current = head; 
		
		boolean found = false;
		while (!found && current != null) {
			if (current.getElement().compareTo(target) == 0) {
				found = true;
				current = current.getNext();
				
				target= (T) (target +" " + "Existe");
				
				return target;
				
			}
			{
				target=(T)(target + " "+ "Não Existe");
				
				return target ;
			}
				
		}
		
		return target;
		
		

	}
}

