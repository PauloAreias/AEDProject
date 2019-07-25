package TrabalhoFinal;

public class Biblioteca {
    int nLivros = 0;

    public Biblioteca() {
        this.nLivros = 0;
    }
    
    public static void adicionar(Book livro) throws NotComparableException {
    	
			
			LinkedList llist = new LinkedList();
			
				 if (livro.getExemplares() >3) {
		                System.out.println("Maximo stock atingido do livro  "+ livro.getTitulo());
		        		
		        	}else if(livro.getExemplares()>=1) {
		        		llist.add(livro);
		        		livro.setExemplares(livro.getExemplares()+1);
		                System.out.println("Livro "+ livro.getTitulo() + " stock: " + livro.getExemplares());
		        	}else {
        	livro.setExemplares(1);
        	llist.add(livro);
            System.out.println("Livro "+ livro.getTitulo() + " adicionado");
    }
    }
}
    
