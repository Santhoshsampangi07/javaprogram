package day12;

public class Program02 {
	// Pattern printing : squaring numbers
	/* output :
	 * 1
	 * 2 4
	 * 3 9 3
	 * 4 16 4 16
	 * 5 25 5 25 5
	 */
// Toggling : T - F
//	          F - T
	public static void main(String[] args) {
		for (int a=1;a<=5;a++)
		{
			boolean x=true;
			for(int b=1;b<=a;b++)
			{
				if(x)
				{
					x=false;
					System.out.print(a+" ");
				}
				else
				{
					x=true;
					System.out.print(a*a+" ");
					
				}
				
			}
			System.out.println();
		}
	}
		
	}
	
		
		

	


