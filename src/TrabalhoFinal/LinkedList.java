package TrabalhoFinal;


public class LinkedList<T> {
    Node<T> head;
    
    
    public void add(T newData) {
        Node<T> newNode = new Node<T>(newData);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    void delete(T element) {
		if (head==null) {
			return ;
		}
		
		Node<T> current=head;
		Node<T> previous= null;
			
		while (current!=null && !current.getElement().equals(element)){
			previous = current;
			current = current.getNext();
		}
		
		if (current==null) {
			return ;
		}
		
		if (current == head) {
			head = current.getNext();
			current.setNext(null);
			
			}
		else if (current.getNext()==null){
				previous.setNext(null);
				
			}
		else 
		{
				previous.setNext(current.getNext());
				current.setNext(null);
			}
		
		//return current.getElement();
		
				
			
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
