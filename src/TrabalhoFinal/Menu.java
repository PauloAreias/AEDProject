package TrabalhoFinal;

import static TrabalhoFinal.Demo.menu;

import java.util.Scanner;

public class Menu {
	
	public static void Operacoes() {

        int opc;
        LinkedList llist = new LinkedList();
        
        Scanner read = new Scanner(System.in);
        String n;
        int x;
        do {
            menu();
            SortAndSearch.selectionSort(llist.head);
            opc = read.nextInt();
            switch (opc) {

                case 1:
                    System.out.println(" ");
                    Scanner read1 = new Scanner(System.in);
                    Book livro = new Book();

                    System.out.print("Tipo do Livro: ");
                    n = read1.nextLine();
                    livro.setTipolivro(n);
                    System.out.print("Nome do Autor: ");
                    n = read1.nextLine();
                    livro.setNomeautor(n);
                    System.out.print("Titulo do Livro: ");
                    n = read1.nextLine();
                    livro.setTitulo(n);
                    System.out.print("Edicao do Livro: ");
                    x = read1.nextInt();
                    livro.setEdicao(x);

                    livro.setTitulo(n);
                    
                    boolean b = SortAndSearch.linearSearch2(llist.head, livro);
                    if (b == true) {
                    	
                    	//if (livro.quantidade >=10) {
                            System.out.println("Maximo stock atingido do livro  "+ livro.getTitulo());
                    		
                    	//}else {
                    		llist.add(livro);
                            System.out.println("Livro "+ livro.getTitulo() + "adicionado");
                    	//}
                        
                    } else {
                    	llist.add(livro);
                        System.out.println("Livro "+ livro.getTitulo() + "adicionado");
                    }


                    //Criar();
                    break;

                case 2:
                    Book livro2 = new Book();

                    System.out.println(" ");
                    Scanner read2 = new Scanner(System.in);

                    System.out.print("Tipo do Livro: ");
                    n = read2.nextLine();
                    livro2.setTipolivro(n);
                    System.out.print("Nome do Autor: ");
                    n = read2.nextLine();
                    livro2.setNomeautor(n);
                    System.out.print("Titulo do Livro: ");
                    n = read2.nextLine();
                    livro2.setTitulo(n);
                    System.out.print("Edicao do Livro: ");
                    x = read2.nextInt();
                    livro2.setEdicao(x);

                    boolean b1 = SortAndSearch.linearSearch2(llist.head, livro2);
                    if (b1 == true) {
                    	//if (livro2.quantidade=1) {
                    		
                    	//}else {
                    		System.out.println(livro2.getTitulo() + " Requisitado");
                            llist.delete(llist.head ,livro2);
                    	}
                        
                    //} 
                    else {
                        System.out.println("Livro para requistar não existe");
                    }
                    //Delete();
                    break;

                case 3:
                    System.out.println(" ");
                    Scanner read3 = new Scanner(System.in);
                    Book livro3 = new Book();

                    System.out.print("Tipo do Livro: ");
                    n = read3.nextLine();
                    livro3.setTipolivro(n);
                    System.out.print("Nome do Autor: ");
                    n = read3.nextLine();
                    livro3.setNomeautor(n);
                    System.out.print("Titulo do Livro: ");
                    n = read3.nextLine();
                    livro3.setTitulo(n);
                    System.out.print("Edicao do Livro: ");
                    x = read3.nextInt();
                    livro3.setEdicao(x);

                    boolean b2 = SortAndSearch.linearSearch2(llist.head, livro3);

                    if (b2 == true) {
                        System.out.println(" Existem xs exmplares do Livro " + livro3.getTitulo());
                    } else {
                        System.out.println("Livro não encontrado");
                    }

                    //Pesquisar();
                    break;

                case 4:
                    System.out.println(" ");
                    System.out.println("Livros: ");
                    llist.print();
                    break;

                case 0:
                    break;

                default:
                    System.out.println(" ");
                    System.out.println("Erro! Opção escolhida não existe!");
                    System.out.println(" ");
                    break;
            }
        } while (opc != 0);

    }

}

