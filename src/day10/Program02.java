package day10;

public class Program02 {
	
	//Factorial number
	// example: 1*2*3*4*5..........n

	public static void main(String[] args) {
		
			
		/*	whileLoop();
			forLoop();
			doLoop();
		}
		
		public static void whileLoop()
		{*/
			int fact=20;
			int x=1;
			long temp=1;
			while(x<=fact)
			{
				temp=temp*x;			
				x++;
			}
			System.out.println(fact+"   "+temp);
			
		
		
		/*public static void doLoop()
		{*/{
			int fact1=8;
			int x1=1;
			int temp1=1;
			do
			{
				temp1=temp1*x1;			
				x1++;
			}while(x1<=fact1);
			System.out.println(fact1+"   "+temp1);
			
		}
		
	/*public static void forLoop()
		{*/
		{
			int fact3=8;
			int temp3=1;
			
			for(int x3=1;x<=fact3;x3++)
			{
				temp3=temp3*x3;			
			}
			System.out.println(fact3+"   "+temp3);
		}
		
		
	}
	
	}
