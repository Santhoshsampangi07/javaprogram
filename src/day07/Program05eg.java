package day07;

import java.util.Scanner;

public class Program05eg {
	//Using Scanner class :

	public static void main(String[] args) {
		/*int a =120;
	    int b=120;  */   // Instead of giving value in main body we using Scanner .
		
		Scanner z= new Scanner(System.in);
		
		System.out.println("give value of a");
		int a=z.nextInt();
		System.out.println("give value of b");
		int b=z.nextInt();
		z.close();
	    if(a>b)
	    {
	    	System.out.println("a is greater");
	    }
	    else if(b>a)
	    {
	    	System.out.println("b is greater");
	    }
	    else if(a==b)
	    {
	    	System.out.println("a & b is equal");
	    }
	    System.out.println("GO HOME");

		
	}
	

}
