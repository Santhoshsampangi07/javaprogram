package day12;

public class Program01 {
	// Pattern printing
	/* output:
	 * 1
	 * 22
	 * 333
	 * 4444
	 * 55555
	 */
// FOR LOOP:
	public static void main(String[] args) {
	
	/*      for (int a=1; a<=5; a++)
		{
			for(int b=1; b<=a; b++)
			{
				System.out.print(a+" ");
			}
			System.out.println();			
		}
			

		
		for (int a=5; a>=1; a--)
		{
			for(int b=1; b<=a; b++)
			{
				System.out.print(a);
			}
			System.out.println();			
		}*/
		// WHILE LOOP:
	/*	{
		int a=1;
		while(a<=5) {
			int b=1;
			while(b<=a)
			{
				System.out.print(a);
				b++;
			}
			System.out.println();
			a++;
		}
		}
		{	
		int a=5;
		while(a>=1) {
			int b=1;
			while(b<=a)
			{
				System.out.print(a);
				b++;
			}
			System.out.println();
			a--;
		}*/
// DO-WHILE LOOP:
			
			{
				int a=1;
				do {
					int b=1;
					do
					{
						System.out.print(a);
						b++;
					}while(b<=a);
					System.out.println();
					a++;
				}while(a<=5);
				}
				
				int a=5;
				do {
					int b=1;
					do
					{
						System.out.print(a);
						b++;
					}while(b<=a);
					System.out.println();
					a--;
					}while(a>=1);

	}
}

