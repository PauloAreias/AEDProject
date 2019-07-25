package TrabalhoFinal;

import static TrabalhoFinal.Demo.menu;
import java.util.Scanner;

public class Biblioteca {
    private LinkedList<Book> Livros;
    int nLivros = 0;

    public Biblioteca() {
        this.Livros = new LinkedList();
        this.nLivros = 0;
    }

}