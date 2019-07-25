package TrabalhoFinal;

import static TrabalhoFinal.Demo.menu;

import java.util.Scanner;

public class Menu {

	
	public static void criar() throws NotComparableException {
		
		  	LinkedList llist = new LinkedList();
		  	Book livro = new Book();
	        
	        Scanner read = new Scanner(System.in);
	        String t,n, g;
	        int e, s;
	        
		   System.out.println(" ");
           Scanner read1 = new Scanner(System.in);
           

           System.out.print("Tipo do Livro: ");
           g = read1.nextLine();
           livro.setTipolivro(g);
           System.out.print("Nome do Autor: ");
           n = read1.nextLine();
           livro.setNomeautor(n);
           System.out.print("Titulo do Livro: ");
           t = read1.nextLine();
           livro.setTitulo(t);
           System.out.print("Edicao do Livro: ");
           e = read1.nextInt();
           livro.setEdicao(e);
           
           
           
           boolean b = SortAndSearch.linearSearch2(llist.head, livro);
			 if (b== true) {
				 Biblioteca.adicionar(livro);
			 }else
           Biblioteca.adicionar(livro);

          
           
 
	}
	
	public static void Operacoes() throws NotComparableException {

        int opc;
        LinkedList<Book> llist = new LinkedList<Book>();
        OrderedList olist = new OrderedList();
        //Book livro = new Book();
        
        int nLT = 0;
        int nLR = 0;
        
        Scanner read = new Scanner(System.in);
        String n;
        int x;
        do {
            menu();
            SortAndSearch.selectionSort(olist.head);
            opc = read.nextInt();
            switch (opc) {

                case 1:
                	try {
                		
             	        String t,no, g;
             	        int e, s;
             	        
             		   System.out.println(" ");
                        Scanner read1 = new Scanner(System.in);
                        
                        
                        System.out.print("Tipo do Livro: ");
                        g = read1.nextLine();
                        //livro.setTipolivro(g);
                        System.out.print("Nome do Autor: ");
                        no = read1.nextLine();
                        //livro.setNomeautor(no);
                        System.out.print("Titulo do Livro: ");
                        t = read1.nextLine();
                        //livro.setTitulo(t);
                        System.out.print("Edicao do Livro: ");
                        e = read1.nextInt();
                        //livro.setEdicao(e);
                        
                        Book livro = new Book(g,no, t, e,0);
                        
                        boolean b = SortAndSearch.linearSearch2(llist.head, livro);
             			 if (b== true) {
             				if (livro.getExemplares() >=10) {
             					System.out.println("Maximo stock atingido do livro  "+ livro.getTitulo());
             			 }else {
     		        		llist.add(livro);
     		        		livro.setExemplares(livro.getExemplares()+1);
     		                System.out.println("Livro "+ livro.getTitulo() + " stock: " + livro.getExemplares());
     		                nLT++;
     		                System.out.println(nLT);
     		        	}
                        
                	}else {
                		llist.add(livro);
 		        		livro.setExemplares(1);
 		                System.out.println("Livro "+ livro.getTitulo() + " stock: " + livro.getExemplares());
 		                nLT++;
 		               System.out.println(nLT);
                	}
                	}
                	catch(ElementNotFoundException ex){
                		System.out.println("Error");
                	}
                    break;

                case 2:

                    System.out.println(" ");
                    Scanner read2 = new Scanner(System.in);

                    System.out.print("Tipo do Livro: ");
                    String g2 = read2.nextLine();
                    //livro.setTipolivro(n);
                    System.out.print("Nome do Autor: ");
                    String no2 = read2.nextLine();
                    //livro.setNomeautor(n);
                    System.out.print("Titulo do Livro: ");
                    String T = read2.nextLine();
                    //livro.setTitulo(n);
                    System.out.print("Edicao do Livro: ");
                    int x2 = read2.nextInt();
                    //livro.setEdicao(x);
                    
                    Book livro1 = new Book(g2,no2,T,x2,1);
                    boolean b1 = SortAndSearch.linearSearch2(llist.head, livro1);
                    if (b1 == true) {
                    	if (livro1.getExemplares() ==1) {
                    		llist.delete(livro1);
                    		System.out.println(livro1.getTitulo() + " Requisitado");
                    		nLR++;
                    		//System.out.println(nLR);
                            
                    	}else {
                    		livro1.setExemplares(livro1.getExemplares()-1);
                    		System.out.println("livro " +livro1.getTitulo() + " Requisitado");
                    		System.out.println("livro " +livro1.getTitulo() + " Stock: " + livro1.getExemplares());
                    		nLR++;
                    		//System.out.println(nLR);
                    	}
                        
                    } 
                    else {
                        System.out.println("Livro para requistar não existe");
                    }
                    //Delete();
                    break;

                case 3:
                    System.out.println(" ");
                    Scanner read3 = new Scanner(System.in);

                    System.out.print("Tipo do Livro: ");
                    String g = read3.nextLine();
                    
                    System.out.print("Nome do Autor: ");
                    String n2 = read3.nextLine();
                    
                    System.out.print("Titulo do Livro: ");
                    String T2 = read3.nextLine();
                    
                    System.out.print("Edicao do Livro: ");
                    int x1 = read3.nextInt();
                   
                    
                    Book livro2 = new Book(g,n2, T2, x1,1);

                    boolean b2 = SortAndSearch.linearSearch2(llist.head, livro2);

                    if (b2 == true) {
                    	System.out.println("-----------------------");
                        System.out.println("Livro  Encontrado");
                        System.out.println("Livro "+livro2.getTitulo());
                        System.out.println("Autor: " + livro2.getNomeautor());
                    } else {
                    	System.out.println("-----------------------");
                        System.out.println("Livro não encontrado");
                    }

                    //Pesquisar();
                    break;

               
                case 4:
                	float nLPR;
                	nLPR=(nLT-nLR) ;
                	//System.out.println(nLPR);
                	nLPR=nLPR/nLT;
                	//System.out.println(nLPR);
                	System.out.println("Podem ser reservados: "+ nLPR*100+"%");
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


