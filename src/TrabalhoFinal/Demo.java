package TrabalhoFinal;

import java.util.Scanner;

public class Demo {
	
public static void menu() {
	
		System.out.print( "   " );
		System.out.println( "========== BIBLIOTECA ==========" ) ;  
        System.out.println( "Menu: " ) ;  
        System.out.println( "1 - Registar Livro" ) ;  
        System.out.println( "2 - Requisitar Livro " ) ;  
        System.out.println( "3 - Pesquisar Livro" ) ; 
        System.out.println( "0 - Sair" ) ; 
       
        
        
        System.out.print( "Digite a opção pretendida: " );
		
	}

public static void Criar() {
	
	LinkedList llist = new LinkedList();
	Scanner read = new Scanner(System.in);
	
	int n;
	
	
	System.out.print("Nome do Livro: "); n = read.nextInt();
	
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
		
		int opc;
		LinkedList llist = new LinkedList();
		Scanner read = new Scanner(System.in);

		
		do {
			
			menu();
			opc = read.nextInt();
			
			switch (opc) {
			case 1:	
				System.out.println(" "); 
				Scanner read1 = new Scanner(System.in);
				
				String n;
				
				System.out.print("Nome do Livro: "); 
				n = read1.nextLine();
				
				llist.add(n);
				SortAndSearch.selectionSort(llist.head);
				//Criar();
				break;
			case 2:
				System.out.println(" "); 
				Scanner read2 = new Scanner(System.in);
				
				System.out.print("Nome do Livro: "); n = read2.nextLine();
				llist.delete(n);
				System.out.println (n+ " Requisitado");
				//Delete();
				break;
			case 3:
				System.out.println(" "); 
				Scanner read3 = new Scanner(System.in);
				
				System.out.print("Nome do Livro: "); n = read3.nextLine();
				boolean b = SortAndSearch.linearSearch2(llist.head,n);
				
				if (b==true) {
					
					System.out.println(" Existem xs exmplares do Livro "+n);
				}
				else {
					System.out.println("Livro não encontrado");
				}
				
				//Pesquisar();
				break;
			case 0:
				break;
			default:		
				
				System.out.println( " " ) ;
                System.out.println( "Erro! Opção escolhida não existe!" ) ;  
                System.out.println( " " ) ;
                break ;  
			}
			
		}while(opc!=0);
		
	}
		
		
	
	}
