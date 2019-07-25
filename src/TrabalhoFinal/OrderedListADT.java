package TrabalhoFinal;


public interface OrderedListADT<T> extends ListADT<T>{

	public void add (T element) throws NotComparableException;
	
	public String toString();

}
