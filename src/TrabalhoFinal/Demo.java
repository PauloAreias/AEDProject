package TrabalhoFinal;

import java.util.Scanner;

public class Demo {

    public static void menu() {
        System.out.print("   ");
        System.out.println("========== BIBLIOTECA ==========");
        System.out.println("Menu: ");
        System.out.println("1 - Registar Livro");
        System.out.println("2 - Requisitar Livro ");
        System.out.println("3 - Pesquisar Livro");
        System.out.println("4 - Mostrar todos os Livros");
        System.out.println("0 - Sair");

        System.out.print("Digite a opção pretendida: ");
    }

    public static void Criar() {
        LinkedList llist = new LinkedList();
        Scanner read = new Scanner(System.in);
        int n;
        System.out.print("Nome do Livro: ");
        n = read.nextInt();
        llist.add(n);
        SortAndSearch.selectionSort(llist.head);
    }

    public static void Delete() {

    }

    public static void Pesquisar() {
        //boolean b1 = SortAndSearch.linearSearch2(llist.head,1);
        //System.out.println(b1);
    }

    public static void main(String[] args) {

        Biblioteca.Operacoes();

    }
}
