package TrabalhoFinal;


public class LinkedList<T> {
    Node<T> head;
    public void add(T newData) throws NotComparableException {
        Node<T> newNode = new Node<T>(newData);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

   T delete(T element ) {
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
        Node tnode = head;
        while (tnode != null) {
            System.out.println(tnode.element);
            tnode = tnode.next;
            if (tnode == null) {
                System.out.println("  ");
            }
        }
    }
}
