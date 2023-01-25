package day11;

public class Program03 {
	//Pattern
	// 2. output
/*	1 2 3 4 5 
2 3 4 5 
3 4 5 
4 5 
5 
5 
4 5 
3 4 5 
2 3 4 5 
1 2 3 4 5 

*/


	public static void main(String[] args) {
		for(int a=1;a<=5;a++)
		{
			for( int b=a;b<=5;b++)
			{
				System.out.print(b+" ");
				
			}
			System.out.println();
		}
		
		for(int a=5;a>=1;a--)
		{
			for( int b=a;b<=5;b++)
			{
				System.out.print(b+" ");
				
			}
			System.out.println();
		}



	}

}
