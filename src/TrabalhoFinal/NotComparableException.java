package TrabalhoFinal;

public class NotComparableException extends Exception {

	public  NotComparableException(String msg) {
		super("nao comparavel: "+ msg);
	}
}
