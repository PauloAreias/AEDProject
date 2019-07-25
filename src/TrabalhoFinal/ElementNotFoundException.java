package TrabalhoFinal;

public class ElementNotFoundException extends RuntimeException {
	
	 public ElementNotFoundException (String collection)
	   {
	      super ("O elemento não existe na " + collection);
	   }

}
