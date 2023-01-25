package day11;

public class Program02 {
	//Patterns
	// 1. output
 /* 1
    1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
	
	1 2 3 4 5 
	1 2 3 4 
	1 2 3 
	1 2 
	1 */

	public static void main(String[] args) {
		
		for(int a=1;a<=5;a++)
		{
			for( int b=1;b<=a;b++)
			{
				System.out.print(b+" ");
				
			}
			System.out.println();
		}
		
		for(int a=5;a>=1;a--)
		{
			for( int b=1;b<=a;b++)
			{
				System.out.print(b+" ");
				
			}
			System.out.println();
		}

	}
	
}
