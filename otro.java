package ejercicios;

import java.util.Scanner;

public class otro {
	


	public static void main(String[] args) {
		
		  
		int[] n = new int[20];


	    for (int i = 0; i < 20; i++){
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print (n[i] + " ");
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    Scanner myObj = new Scanner(System.in);
	    int opcion = myObj.nextInt();

	    int multiplo = 0;
	    
	    if(opcion == 1) {
	    	multiplo = 5;
	    } else {
	    	multiplo = 7;
	    }
	    
	    for(int p = 0; p < 20 - 1 ; p++){
	      if ((p % multiplo) == 0){
		      System.out.print("[" + n[p] + "] ");
	      }else {
			  System.out.print(p + " ");
	      }
	  
	    }
	}
}
