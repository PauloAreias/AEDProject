package TrabalhoFinal;

public class SortAndSearch {

    public static <T extends Comparable<? super T>> boolean linearSearch2(Node<T> head, T target) {

        Node<T> current = head;

        boolean found = false;
        while (!found && current != null) {
            if (current.getElement().compareTo(target) == 0) {
                found = true;
            }
            current = current.getNext();
        }
        return found;

    }

    public static <T extends Comparable<? super T>> void selectionSort(Node<T> head) {
        Node<T> temp;

        for (Node<T> current = head; current.getNext() != null; current.getNext()) {
            Node<T> min = current;

            for (Node<T> scan = current.getNext(); scan != null; scan = scan.getNext()) {
                if (scan.getElement().compareTo(min.getElement()) < 0) {
                    min = scan;
                }
            }
            if (min != current) {
                temp = new Node<T>(min.getElement());
                min.setElement(current.getElement());
                current.setElement(temp.getElement());
            }

        }
    }

}
