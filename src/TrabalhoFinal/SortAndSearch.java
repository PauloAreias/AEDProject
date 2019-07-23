package TrabalhoFinal;

public class SortAndSearch {
	
	public static <T extends Comparable<? super T>> boolean linearSearch2(Node<T> head, T target) {

		Node<T> current = head; 
		
		boolean found = false;
		while (!found && current != null) {
			if (current.getElement().compareTo(target) == 0)
				found = true;
			current = current.getNext();
		}
		return found;

	}

}
