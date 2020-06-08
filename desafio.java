import java.util.Scanner;

public class exdesa {

public static void main (String[]arg) {
	
	
	Scanner leitor = new Scanner(System.in);
	
	int c;
	int l;
	
	System.out.println("Escreva uma coluna e uma linha respectivamente");
	System.out.println("o tabuleiro tem tamanho 8x8");
	c = leitor.nextInt();
	l = leitor.nextInt();
	
	
	
	int l1=1,l2=2,l3=3,l4=4,l5=5,l6=6,l7=7,l8=8;
	
	int coordenadaY = c;
	switch(coordenadaY) {
	case 1:
		if(l==l1) {
			System.out.println("/////////////////");
			System.out.println("  1 2 3 4 5 6 7 8");
			System.out.println("1|x x x x x x x x");
			System.out.println("2|x - - - - - - -");
			System.out.println("3|x - - - - - - -");
			System.out.println("4|x - - - - - - -");        
			System.out.println("5|x - - - - - - -");
			System.out.println("6|x - - - - - - -");
			System.out.println("7|x - - - - - - -");
			System.out.println("8|x - - - - - - -");
			System.out.println("/////////////////");
		}		
			if(l==l2) {
				System.out.println("/////////////////");
				System.out.println("  1 2 3 4 5 6 7 8");
				System.out.println("1|x - - - - - - -");
				System.out.println("2|x x x x x x x -");
				System.out.println("3|x - - - - - - -");
				System.out.println("4|x - - - - - - -");       
				System.out.println("5|x - - - - - - -");
				System.out.println("6|x - - - - - - -");
				System.out.println("7|x - - - - - - -");
				System.out.println("8|x - - - - - - -");
				System.out.println("/////////////////");				
			}
			if(l==l3) {				
				System.out.println("/////////////////");
				System.out.println("  1 2 3 4 5 6 7 8");
				System.out.println("1|x - - - - - - -");
				System.out.println("2|x - - - - - - -");
				System.out.println("3|x x x x x x x x");
				System.out.println("4|x - - - - - - -");        
				System.out.println("5|x - - - - - - -");
				System.out.println("6|x - - - - - - -");
				System.out.println("7|x - - - - - - -");
				System.out.println("8|x - - - - - - -");
				System.out.println("/////////////////");			
			}			
			if(l==l4) {
				System.out.println("/////////////////");
				System.out.println("  1 2 3 4 5 6 7 8");
				System.out.println("1|x - - - - - - -");
				System.out.println("2|x - - - - - - -");
				System.out.println("3|x - - - - - - -");
				System.out.println("4|x x x x x x x x");       
				System.out.println("5|x - - - - - - -");
				System.out.println("6|x - - - - - - -");
				System.out.println("7|x - - - - - - -");
				System.out.println("8|x - - - - - - -");
				System.out.println("/////////////////");
		}			
			if(l==l5) {
System.out.println("/////////////////");
System.out.println("  1 2 3 4 5 6 7 8");
System.out.println("1|x - - - - - - -");
System.out.println("2|x - - - - - - -");
System.out.println("3|x - - - - - - -");
System.out.println("4|x - - - - - - -");        
System.out.println("5|x x x x x x x x");
System.out.println("6|x - - - - - - -");
System.out.println("7|x - - - - - - -");
System.out.println("8|x - - - - - - -");
System.out.println("/////////////////");
}
			if(l==l6) {				
System.out.println("/////////////////");
System.out.println("  1 2 3 4 5 6 7 8");
System.out.println("1|x - - - - - - -");
System.out.println("2|x - - - - - - -");
System.out.println("3|x - - - - - - -");
System.out.println("4|x - - - - - - -");       
System.out.println("5|x - - - - - - -");
System.out.println("6|x x x x x x x x");
System.out.println("7|x - - - - - - -");
System.out.println("8|x - - - - - - -");
System.out.println("/////////////////");				
			}	
			if(l==l7) {
				System.out.println("/////////////////");
				System.out.println("  1 2 3 4 5 6 7 8");
				System.out.println("1|x - - - - - - -");
				System.out.println("2|x - - - - - - -");
				System.out.println("3|x - - - - - - -");
				System.out.println("4|x - - - - - - -");        
				System.out.println("5|x - - - - - - -");
				System.out.println("6|x - - - - - - -");
				System.out.println("7|x x x x x x x x");
				System.out.println("8|x - - - - - - -");
				System.out.println("/////////////////");
			}
			if(l==l8) {
				System.out.println("/////////////////");
				System.out.println("  1 2 3 4 5 6 7 8");
				System.out.println("1|x - - - - - - -");
				System.out.println("2|x - - - - - - -");
				System.out.println("3|x - - - - - - -");
				System.out.println("4|x - - - - - - -");      
				System.out.println("5|x - - - - - - -");
				System.out.println("6|x - - - - - - -");
				System.out.println("7|x - - - - - - -");
				System.out.println("8|x x x x x x x x");
				System.out.println("/////////////////");

			}
			if(l>8) {
				System.out.println("Esta opção esta invalida pois só existem 8 linhas horizontais");
			}
			
			
			break;
	case 2:
		if(l==l1) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|x x x x x x x x");
		System.out.println("2|- x - - - - - -");
		System.out.println("3|- x - - - - - -");
		System.out.println("4|- x - - - - - -");        
		System.out.println("5|- x - - - - - -");
		System.out.println("6|- x - - - - - -");
		System.out.println("7|- x - - - - - -");
		System.out.println("8|- x - - - - - -");
		System.out.println("/////////////////");
	}
	if(l==l2) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- x - - - - - -");
		System.out.println("2|x x x x x x x -");
		System.out.println("3|- x - - - - - -");
		System.out.println("4|- x - - - - - -");        
		System.out.println("5|- x - - - - - -");
		System.out.println("6|- x - - - - - -");
		System.out.println("7|- x - - - - - -");
		System.out.println("8|- x - - - - - -");
		System.out.println("/////////////////");
	}
if(l==l3) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- x - - - - - -");
		System.out.println("2|- x - - - - - -");
		System.out.println("3|x x x x x x x x");
		System.out.println("4|- x - - - - - -");        
		System.out.println("5|- x - - - - - -");
		System.out.println("6|- x - - - - - -");
		System.out.println("7|- x - - - - - -");
		System.out.println("8|- x - - - - - -");
		System.out.println("/////////////////");
}
if(l==l4) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- x - - - - - -");
		System.out.println("2|- x - - - - - -");
		System.out.println("3|- x - - - - - -");
		System.out.println("4|x x x x x x x x");        
		System.out.println("5|- x - - - - - -");
		System.out.println("6|- x - - - - - -");
		System.out.println("7|- x - - - - - -");
		System.out.println("8|- x - - - - - -");
		System.out.println("/////////////////");
}
if(l==l5) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- x - - - - - -");
		System.out.println("2|- x - - - - - -");
		System.out.println("3|- x - - - - - -");
		System.out.println("4|- x - - - - - -");       
		System.out.println("5|x x x x x x x x");
		System.out.println("6|- x - - - - - -");
		System.out.println("7|- x - - - - - -");
		System.out.println("8|- x - - - - - -");
		System.out.println("/////////////////");
}
if(l==l6) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- x - - - - - -");
		System.out.println("2|- x - - - - - -");
		System.out.println("3|- x - - - - - -");
		System.out.println("4|- x - - - - - -");       
		System.out.println("5|- x - - - - - -");
		System.out.println("6|x x x x x x x x");
		System.out.println("7|- x - - - - - -");
		System.out.println("8|- x - - - - - -");
		System.out.println("/////////////////");
}
if(l==l7) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- x - - - - - -");
		System.out.println("2|- x - - - - - -");
		System.out.println("3|- x - - - - - -");
		System.out.println("4|- x - - - - - -");        
		System.out.println("5|- x - - - - - -");
		System.out.println("6|- x - - - - - -");
		System.out.println("7|x x x x x x x x");
		System.out.println("8|- x - - - - - -");
		System.out.println("/////////////////");
}
if(l==l8) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- x - - - - - -");
		System.out.println("2|- x - - - - - -");
		System.out.println("3|- x - - - - - -");
		System.out.println("4|- x - - - - - -");      
		System.out.println("5|- x - - - - - -");
		System.out.println("6|- x - - - - - -");
		System.out.println("7|- x - - - - - -");
		System.out.println("8|x x x x x x x x");
		System.out.println("/////////////////");
}
if(l>8) {
	System.out.println("Esta opção esta invalida pois só existem 8 linhas horizontais");
}
break;
case 3:
	if(l==l1) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|x x x x x x x x");
		System.out.println("2|- - x - - - - -");
		System.out.println("3|- - x - - - - -"); 
		System.out.println("4|- - x - - - - -");        
		System.out.println("5|- - x - - - - -");
		System.out.println("6|- - x - - - - -");
		System.out.println("7|- - x - - - - -");
		System.out.println("8|- - x - - - - -");
		System.out.println("/////////////////");
	}
	if(l==l2) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - x - - - - -");
		System.out.println("2|x x x x x x x -");
		System.out.println("3|- - x - - - - -");   
		System.out.println("4|- - x - - - - -");        
		System.out.println("5|- - x - - - - -");
		System.out.println("6|- - x - - - - -");
		System.out.println("7|- - x - - - - - ");
		System.out.println("8|- - x - - - - -");
		System.out.println("/////////////////");
	}
if(l==l3) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - x - - - - -");
		System.out.println("2|- - x - - - - -");
		System.out.println("3|x x x x x x x x");
		System.out.println("4|- - x - - - - -");        
		System.out.println("5|- - x - - - - -");     
		System.out.println("6|- - x - - - - -");
		System.out.println("7|- - x - - - - -");
		System.out.println("8|- - x - - - - -");
		System.out.println("/////////////////");
}
if(l==l4) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - x - - - - -");
		System.out.println("2|- - x - - - - -");
		System.out.println("3|- - x - - - - -");
		System.out.println("4|x x x x x x x x");        
		System.out.println("5|- - x - - - - -");
		System.out.println("6|- - x - - - - -");           
		System.out.println("7|- - x - - - - -");
		System.out.println("8|- - x - - - - -");
		System.out.println("/////////////////");
}
if(l==l5) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - x - - - - -");
		System.out.println("2|- - x - - - - -");
		System.out.println("3|- - x - - - - -");          
		System.out.println("4|- - x - - - - -");       
		System.out.println("5|x x x x x x x x");
		System.out.println("6|- - x - - - - -");
		System.out.println("7|- - x - - - - -");
		System.out.println("8|- - x - - - - -");
		System.out.println("/////////////////");
}
if(l==l6) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- x - - - - - -");
		System.out.println("2|- x - - - - - -");           
		System.out.println("3|- x - - - - - -");
		System.out.println("4|- x - - - - - -");       
		System.out.println("5|- x - - - - - -");
		System.out.println("6|x x x x x x x x");
		System.out.println("7|- x - - - - - -");
		System.out.println("8|- x - - - - - -");
		System.out.println("/////////////////");
}
if(l==l7) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - x - - - - -");
		System.out.println("2|- - x - - - - -");
		System.out.println("3|- - x - - - - -");
		System.out.println("4|-  -x - - - - -");        
		System.out.println("5|- - x - - - - -");
		System.out.println("6|- - x - - - - -");
		System.out.println("7|x x x x x x x x");      
		System.out.println("8|- - x - - - - -");
		System.out.println("/////////////////");
}
if(l==l8) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - x - - - - -");
		System.out.println("2|- - x - - - - -");
		System.out.println("3|- - x - - - - -");
		System.out.println("4|- - x - - - - -");             
		System.out.println("5|- - x - - - - -");
		System.out.println("6|- - x - - - - -");
		System.out.println("7|- - x - - - - -");
		System.out.println("8|x x x x x x x x");
		System.out.println("/////////////////");
}
if(l>8) {
	System.out.println("Esta opção esta invalida pois só existem 8 linhas horizontais");
}
break;
case 4:
	if(l==l1) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|x x x x x x x x");
		System.out.println("2|- - - x - - - -");
		System.out.println("3|- - - x - - - -"); 
		System.out.println("4|- - - x - - - -");        
		System.out.println("5|- - - x - - - -");
		System.out.println("6|- - - x - - - -");
		System.out.println("7|- - - x - - - -");
		System.out.println("8|- - - x - - - -");
		System.out.println("/////////////////");
	}
	if(l==l2) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - x - - - -");
		System.out.println("2|x x x x x x x -");
		System.out.println("3|- - - x - - - -");   
		System.out.println("4|- - - x - - - -");        
		System.out.println("5|- - - x - - - -");
		System.out.println("6|- - - x - - - -");
		System.out.println("7|- - - x - - - -");
		System.out.println("8|- - - x - - - -");
		System.out.println("/////////////////");
	}
if(l==l3) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - x - - - -");
		System.out.println("2|- - - x - - - -");
		System.out.println("3|x x x x x x x x");
		System.out.println("4|- - - x - - - -");        
		System.out.println("5|- - - x - - - -");       
		System.out.println("6|- - - x - - - -");
		System.out.println("7|- - - x - - - -");
		System.out.println("8|- - - x - - - -");
		System.out.println("/////////////////");
}
if(l==l4) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - x - - - -");
		System.out.println("2|- - - x - - - -");
		System.out.println("3|- - - x - - - -");
		System.out.println("4|x x x x x x x x");        
		System.out.println("5|- - - x - - - -");
		System.out.println("6|- - - x - - - -");          
		System.out.println("7|- - - x - - - -");
		System.out.println("8|- - - x - - - -");
		System.out.println("/////////////////");
}
if(l==l5) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - x - - - -");
		System.out.println("2|- - - x - - - -");
		System.out.println("3|- - - x - - - -");       
		System.out.println("4|- - - x - - - -");       
		System.out.println("5|x x x x x x x x");
		System.out.println("6|- - - x - - - -");
		System.out.println("7|- - - x - - - -");
		System.out.println("8|- - - x - - - -");
		System.out.println("/////////////////");
}
if(l==l6) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - x - - - -");
		System.out.println("2|- - - x - - - -");         
		System.out.println("3|- - - x - - - -");
		System.out.println("4|- - - x - - - -");       
		System.out.println("5|- - - x - - - -");
		System.out.println("6|x x x x x x x x");
		System.out.println("7|- - - x - - - -");
		System.out.println("8|- - - x - - - -");
		System.out.println("/////////////////");
}
if(l==l7) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - x - - - -");
		System.out.println("2|- - - x - - - -");
		System.out.println("3|- - - x - - - -");
		System.out.println("4|-  -- x - - - -");        
		System.out.println("5|- - - x - - - -");
		System.out.println("6|- - - x - - - -");
		System.out.println("7|x x x x x x x x");      
		System.out.println("8|- - - - - - - -");
		System.out.println("/////////////////");
}
if(l==l8) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - x - - - -");
		System.out.println("2|- - - x - - - -");
		System.out.println("3|- - - x - - - -");
		System.out.println("4|- - - x - - - -");              
		System.out.println("5|- - - x - - - -");
		System.out.println("6|- - - x - - - -");
		System.out.println("7|- - - x - - - -");
		System.out.println("8|x x x x x x x x");
		System.out.println("/////////////////");
}
if(l>8) {
	System.out.println("Esta opção esta invalida pois só existem 8 linhas horizontais");
}

	break;
case 5:
	
	if(l==l1) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|x x x x x x x x");
		System.out.println("2|- - - - x - - -");
		System.out.println("3|- - - - x - - -"); 
		System.out.println("4|- - - - x - - -");        
		System.out.println("5|- - - - x - - -");
		System.out.println("6|- - - - x - - -");
		System.out.println("7|- - - - x - - -");
		System.out.println("8|- - - - x - - -");
		System.out.println("/////////////////");
	}
	if(l==l2) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - x - - -");
		System.out.println("2|x x x x x x x -");
		System.out.println("3|- - - - x - - -");    
		System.out.println("4|- - - - x - - -");        
		System.out.println("5|- - - - x - - -");
		System.out.println("6|- - - - x - - -");
		System.out.println("7|- - - - x - - -");
		System.out.println("8|- - - - x - - -");
		System.out.println("/////////////////");
	}
if(l==l3) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - x - - -");
		System.out.println("2|- - - - x - - -");
		System.out.println("3|x x x x x x x x");
		System.out.println("4|- - - - x - - -");        
		System.out.println("5|- - - - x - - -");        
		System.out.println("6|- - - - x - - -");
		System.out.println("7|- - - - x - - -");
		System.out.println("8|- - - - x - - -");
		System.out.println("/////////////////");
}
if(l==l4) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - x - - -");
		System.out.println("2|- - - - x - - -");
		System.out.println("3|- - - - x - - -");
		System.out.println("4|x x x x x x x x");        
		System.out.println("5|- - - - x - - -");
		System.out.println("6|- - - - x - - -");            
		System.out.println("7|- - - - x - - -");
		System.out.println("8|- - - - x - - -");
		System.out.println("/////////////////");
}
if(l==l5) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - x - - -");
		System.out.println("2|- - - - x - - -");
		System.out.println("3|- - - - x - - -");           
		System.out.println("4|- - - - x - - -");       
		System.out.println("5|x x x x x x x x");
		System.out.println("6|- - - - x - - -");
		System.out.println("7|- - - - x - - -");
		System.out.println("8|- - - - x - - -");
		System.out.println("/////////////////");
}
if(l==l6) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - x - - -");
		System.out.println("2|- - - - x - - -");          
		System.out.println("3|- - - - x - - -");
		System.out.println("4|- - - - x - - -");       
		System.out.println("5|- - - - x - - -");
		System.out.println("6|x x x x x x x x");
		System.out.println("7|- - - - x - - -");
		System.out.println("8|- - - - x - - -");
		System.out.println("/////////////////");
}
if(l==l7) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - x - - -");
		System.out.println("2|- - - - x - - -");
		System.out.println("3|- - - - x - - -");
		System.out.println("4|- - - - x - - -");        
		System.out.println("5|- - - - x - - -");
		System.out.println("6|- - - - x - - -");
		System.out.println("7|x x x x x x x x");        
		System.out.println("8|- - - - x - - -");
		System.out.println("/////////////////");
}
if(l==l8) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - x - - -");
		System.out.println("2|- - - - x - - -");
		System.out.println("3|- - - - x - - -");
		System.out.println("4|- - - - x - - -");              
		System.out.println("5|- - - - x - - -");
		System.out.println("6|- - - - x - - -");
		System.out.println("7|- - - - x - - -");
		System.out.println("8|x x x x x x x x");
		System.out.println("/////////////////");
}
if(l>8) {
	System.out.println("Esta opção esta invalida pois só existem 8 linhas horizontais");
}

break;
case 6:
	
	if(l==l1) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|x x x x x x x x");
		System.out.println("2|- - - - - x - -");
		System.out.println("3|- - - - - x - -"); 
		System.out.println("4|- - - - - x - -");        
		System.out.println("5|- - - - - x - -");
		System.out.println("6|- - - - - x - -");
		System.out.println("7|- - - - - x - -");
		System.out.println("8|- - - - - x - -");
		System.out.println("/////////////////");
	}
	if(l==l2) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - x - -");
		System.out.println("2|x x x x x x x x");
		System.out.println("3|- - - - - x - -");    
		System.out.println("4|- - - - - x - -");        
		System.out.println("5|- - - - - x - -");
		System.out.println("6|- - - - - x - -");
		System.out.println("7|- - - - - x - -");
		System.out.println("8|- - - - - x - -");
		System.out.println("/////////////////");
	}
if(l==l3) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - x - -");
		System.out.println("2|- - - - - x - -");
		System.out.println("3|x x x x x x x x");
		System.out.println("4|- - - - - x - -");        
		System.out.println("5|- - - - - x - -");        
		System.out.println("6|- - - - - x - -");
		System.out.println("7|- - - - - x - -");
		System.out.println("8|- - - - - x - -");
		System.out.println("/////////////////");
}
if(l==l4) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - x - -");
		System.out.println("2|- - - - - x - -");
		System.out.println("3|- - - - - x - -");
		System.out.println("4|x x x x x x x x");        
		System.out.println("5|- - - - - x - -");
		System.out.println("6|- - - - - x - -");           
		System.out.println("7|- - - - - x - -");
		System.out.println("8|- - - - - x - -");
		System.out.println("/////////////////");
}
if(l==l5) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - x - -");
		System.out.println("2|- - - - - x - -");
		System.out.println("3|- - - - - x - -");           
		System.out.println("4|- - - - - x - -");       
		System.out.println("5|x x x x x x x x");
		System.out.println("6|- - - - - x - -");
		System.out.println("7|- - - - - x - -");
		System.out.println("8|- - - - - x - -");
		System.out.println("/////////////////");
}
if(l==l6) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - x - -");
		System.out.println("2|- - - - - x - -");           
		System.out.println("3|- - - - - x - -");
		System.out.println("4|- - - - - x - -");       
		System.out.println("5|- - - - - x - -");
		System.out.println("6|x x x x x x x x");
		System.out.println("7|- - - - - x - -");
		System.out.println("8|- - - - - x - -");
		System.out.println("/////////////////");
}
if(l==l7) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - x - -");
		System.out.println("2|- - - - - x - -");
		System.out.println("3|- - - - - x - -");
		System.out.println("4|- - - - - x - -");        
		System.out.println("5|- - - - - x - -");
		System.out.println("6|- - - - - x - -");
		System.out.println("7|x x x x x x x x"); 
		System.out.println("8|- - - - - x - -");
		System.out.println("/////////////////");
}
if(l==l8) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - x - -");
		System.out.println("2|- - - - - x - -");
		System.out.println("3|- - - - - x - -");
		System.out.println("4|- - - - - x - -");           
		System.out.println("5|- - - - - x - -");
		System.out.println("6|- - - - - x - -");
		System.out.println("7|- - - - - x - -");
		System.out.println("8|x x x x x x x x");
		System.out.println("/////////////////");
}
if(l>8) {
	System.out.println("Esta opção esta invalida pois só existem 8 linhas horizontais");
}
break;
case 7:
	
	if(l==l1) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|x x x x x x x x");
		System.out.println("2|- - - - - - x -");
		System.out.println("3|- - - - - - x -"); 
		System.out.println("4|- - - - - - x -");        
		System.out.println("5|- - - - - - x -");
		System.out.println("6|- - - - - - x -");
		System.out.println("7|- - - - - - x -");
		System.out.println("8|- - - - - - x -");
		System.out.println("/////////////////");
	}
	if(l==l2) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - - x -");
		System.out.println("2|x x x x x x x x");
		System.out.println("3|- - - - - - x -");    
		System.out.println("4|- - - - - - x -");        
		System.out.println("5|- - - - - - x -");
		System.out.println("6|- - - - - - x -");
		System.out.println("7|- - - - - - x -");
		System.out.println("8|- - - - - - x -");
		System.out.println("/////////////////");
	}
if(l==l3) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - - x -");
		System.out.println("2|- - - - - - x -");
		System.out.println("3|x x x x x x x x");
		System.out.println("4|- - - - - - x -");        
		System.out.println("5|- - - - - - x -");        
		System.out.println("6|- - - - - - x -");
		System.out.println("7|- - - - - - x -");
		System.out.println("8|- - - - - - x -");
		System.out.println("/////////////////");
}
if(l==l4) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - - x -");
		System.out.println("2|- - - - - - x -");
		System.out.println("3|- - - - - - x -");
		System.out.println("4|x x x x x x x x");        
		System.out.println("5|- - - - - - x -");
		System.out.println("6|- - - - - - x -");             
		System.out.println("7|- - - - - - x -");
		System.out.println("8|- - - - - - x -");
		System.out.println("/////////////////");
}
if(l==l5) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - - x -");
		System.out.println("2|- - - - - - x -");
		System.out.println("3|- - - - - - x -");           
		System.out.println("4|- - - - - - x -");       
		System.out.println("5|x x x x x x x x");
		System.out.println("6|- - - - - - x -");
		System.out.println("7|- - - - - - x -");
		System.out.println("8|- - - - - - x -");
		System.out.println("/////////////////");
}
if(l==l6) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - - x -");
		System.out.println("2|- - - - - - x -");          
		System.out.println("3|- - - - - - x -");
		System.out.println("4|- - - - - - x -");       
		System.out.println("5|- - - - - - x -");
		System.out.println("6|x x x x x x x x");
		System.out.println("7|- - - - - - x -");
		System.out.println("8|- - - - - - x -");
		System.out.println("/////////////////");
}
if(l==l7) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - - x -");
		System.out.println("2|- - - - - - x -");
		System.out.println("3|- - - - - - x -");
		System.out.println("4|- - - - - - x -");        
		System.out.println("5|- - - - - - x -");
		System.out.println("6|- - - - - - x -");
		System.out.println("7|x x x x x x x x");        
		System.out.println("8|- - - - - - - -");
		System.out.println("/////////////////");
}
if(l==l8) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - - x -");
		System.out.println("2|- - - - - - x -");
		System.out.println("3|- - - - - - x -");
		System.out.println("4|- - - - - - x -");              
		System.out.println("5|- - - - - - x -");
		System.out.println("6|- - - - - - x -");
		System.out.println("7|- - - - - - x -");
		System.out.println("8|x x x x x x x x");
		System.out.println("/////////////////");
}
if(l>8) {
	System.out.println("Esta opção esta invalida pois só existem 8 linhas horizontais");
}
break;
case 8:
	if(l==l1) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|x x x x x x x x");
		System.out.println("2|- - - - - - - x");
		System.out.println("3|- - - - - - - x"); 
		System.out.println("4|- - - - - - - x");        
		System.out.println("5|- - - - - - - x");
		System.out.println("6|- - - - - - - x");
		System.out.println("7|- - - - - - - x");
		System.out.println("8|- - - - - - - x");
		System.out.println("/////////////////");
	}
	if(l==l2) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - - - x");
		System.out.println("2|x x x x x x x x");
		System.out.println("3|- - - - - - - x");    
		System.out.println("4|- - - - - - - x");        
		System.out.println("5|- - - - - - - x");
		System.out.println("6|- - - - - - - x");
		System.out.println("7|- - - - - - - x");
		System.out.println("8|- - - - - - - x");
		System.out.println("/////////////////");
	}
if(l==l3) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - - - x");
		System.out.println("2|- - - - - - - x");
		System.out.println("3|x x x x x x x x");
		System.out.println("4|- - - - - - - x");        
		System.out.println("5|- - - - - - - x");        
		System.out.println("6|- - - - - - - x");
		System.out.println("7|- - - - - - - x");
		System.out.println("8|- - - - - - - x");
		System.out.println("/////////////////");
}
if(l==l4) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - - - x");
		System.out.println("2|- - - - - - - x");
		System.out.println("3|- - - - - - - x");
		System.out.println("4|x x x x x x x x");        
		System.out.println("5|- - - - - - - x");
		System.out.println("6|- - - - - - - x");             
		System.out.println("7|- - - - - - - x");
		System.out.println("8|- - - - - - - x");
		System.out.println("/////////////////");
}
if(l==l5) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - - - x");
		System.out.println("2|- - - - - - - x");
		System.out.println("3|- - - - - - - x");          
		System.out.println("4|- - - - - - - x");       
		System.out.println("5|x x x x x x x x");
		System.out.println("6|- - - - - - - x");
		System.out.println("7|- - - - - - - x");
		System.out.println("8|- - - - - - - x");
		System.out.println("/////////////////");
}
if(l==l6) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - - - x");
		System.out.println("2|- - - - - - - x");           
		System.out.println("3|- - - - - - - x");
		System.out.println("4|- - - - - - - x");       
		System.out.println("5|- - - - - - - x");
		System.out.println("6|x x x x x x x x");
		System.out.println("7|- - - - - - - x");
		System.out.println("8|- - - - - - - x");
		System.out.println("/////////////////");
}
if(l==l7) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - - - x");
		System.out.println("2|- - - - - - - x");
		System.out.println("3|- - - - - - - x");
		System.out.println("4|- - - - - - - x");        
		System.out.println("5|- - - - - - - x");
		System.out.println("6|- - - - - - - x");
		System.out.println("7|x x x x x x x x");        
		System.out.println("8|- - - - - - - x");
		System.out.println("/////////////////");
}
if(l==l8) {
		System.out.println("/////////////////");
		System.out.println("  1 2 3 4 5 6 7 8");
		System.out.println("1|- - - - - - - x");
		System.out.println("2|- - - - - - - x");
		System.out.println("3|- - - - - - - x");
		System.out.println("4|- - - - - - - x");              
		System.out.println("5|- - - - - - - x");
		System.out.println("6|- - - - - - - x");
		System.out.println("7|- - - - - - - x");
		System.out.println("8|x x x x x x x x");
		System.out.println("/////////////////");
}
if(l>8) {
	System.out.println("Esta opção esta invalida pois só existem 8 linhas horizontais");
}
break;
default:
	System.out.println("Esta opção é invalida");
	
}
	
	
		
		
		
		
		
		}			
	}	

