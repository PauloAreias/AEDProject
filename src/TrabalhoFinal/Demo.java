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
        System.out.println("4 - Percentagem de Livros que podem ser reservados");
        System.out.println("0 - Sair");

        System.out.print("Digite a opção pretendida: ");
    }



    public static void main(String[] args) throws NotComparableException {
        Menu.Operacoes();

    }
}
