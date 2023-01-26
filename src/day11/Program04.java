package day11;

public class Program04 {
	//Pattern
	// 3. output
/* 5 4 3 2 1 
   5 4 3 2 
   5 4 3 
   5 4 
   5 
   5 
   5 4 
   5 4 3 
   5 4 3 2 
   5 4 3 2 1 
   */	
// FOR loop:
	public static void main(String[] args) {
		/*for(int a=1;a<=5;a++)
		{
			for( int b=5;b>=a;b--)
			{
				System.out.print(b+" ");
				
			}
			System.out.println();
		}
		for(int a=5;a>=1;a--)
		{
			for( int b=5;b>=a;b--)
			{
				System.out.print(b+" ");
				
			}
			System.out.println();
			
			}*/
//WHILE loop:
		/*{	int a=1;
		
		while (a<=5)
		{
			int b=5;
			while (b>=a)
			{
				System.out.print(b);
				b--;
			}
			System.out.println();
			a++;
		}
		
		}
		
        int a=5;
		
		while (a>=1)
		{
			int b=5;
			while (b>=a)
			{
				System.out.print(b);
				b--;
			}
			System.out.println();
			a--;
		}
		*/
// DO-WHILE loop:		
		   
{	int a=1;
		
		do
		{
			int b=5;
			do
			{
				System.out.print(b);
				b--;
			}while (b>=a);
			System.out.println();
			a++;
		}while (a<=5);
		
		}
		
        int a=5;
		
		do
		{
			int b=5;
			do
			{
				System.out.print(b);
				b--;
			}while (b>=a);
			System.out.println();
			a--;
		}while (a>=1);		
		
	}

}
