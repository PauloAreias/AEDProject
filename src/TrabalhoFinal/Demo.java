package TrabalhoFinal;

public class Demo {

	public static void main(String[] args) {
		
		LinkedList llist = new LinkedList();
		
		llist.add(1);
		llist.add(2);
		llist.add(3);
		
		llist.print();
		
		//llist.add("ola");
		
		//System.out.println(" ");
		//llist.print();
		
		llist.delete(2);
		System.out.println(" ");
		llist.print();
		
		System.out.println(" ");
		
		System.out.println(llist.linearSearch2(llist.head,1));
	
	}

}
