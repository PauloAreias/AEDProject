package TrabalhoFinal;

import java.util.Iterator;

public class OrderedList<T> extends LinkedList<T>  implements OrderedListADT<T> {
	
	public OrderedList() {
		super();
	}

	@Override
	public void add(T element) throws NotComparableException {
		// TODO Auto-generated method stub
		
		if(!(element instanceof Comparable)) {
			throw new NotComparableException("Error");
		}
		
		Node<T> newNode = new Node<T>(element);
		
		
		
		if ( head == null) {
			head = newNode;
		}else {
			Comparable<T> e = (Comparable<T>) element;
			Node <T> previous = null;
			Node <T> current = head;
			
			while( current!= null && e.compareTo(current.getElement())>0) {
				current = head;
				current= current.getNext();
			}
			
			if (current== head) {
				newNode.setNext(head);
				head= newNode;
			}else if(current == null) {
				previous.setNext(newNode);
				newNode.setNext(null);
				
			}else {
				previous.setNext(newNode);
				newNode.setNext(current);
			}
			
			int count=0;
			count++;
		}
		
	}

	public String toString() {
		return super.toString();
	}

	@Override
	public T removeFirst() throws EmptyCollectionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T removeLast() throws EmptyCollectionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T remove(T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T first() throws EmptyCollectionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T last() throws EmptyCollectionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(T target) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
