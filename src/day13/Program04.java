package day13;

public class Program04 {
	// To check PRIME or NOT-PRIME :

	public static void main(String[] args) {
		int n=18;
		boolean x=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				x=false;
			    break;	
			}
		}
		if(x)
		{
			System.out.println("prime");
		}
			else
			{
				System.out.println("not-prime");
				
			} 
		}

	}


