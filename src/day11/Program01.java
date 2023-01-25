package day11;

public class Program01 {
	// Fibannoci series
	//Eg : 0,1,2,3,4,5,........=0+1=1 , 1+1=2 , 1+2=3 , 2+3=5

	public static void main(String[] args) {
		int x=0;
		int y=1;
		int a=1;
		while(a<=10)
		{
			int z=x+y;
			System.out.println(x);
			
			x=y;
			y=z;
			a++;
		}
		int x1=5;
		int y1=6;
		int a1=1;
		do
		{
			int z1=x1+y1;
			System.out.println(x1);
			
			x1=y1;
			y1=z1;
			a1++;
		}while(a1<=10);
		
		int x2=3;
		int y2=4;
		
		for(int a2=3;a2<=10;a2++)
		{
			int z2=x2+y2;
			System.out.println(x2);
			
			x2=y2;
			y2=z2;
			
		}

	}

}
