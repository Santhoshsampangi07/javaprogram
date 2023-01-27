package day13;

public class Program02 {
	//To find length 

	public static void main(String[] args) {
		//1.Finding length:
		int y[]= {11,12,13,14,15,16};
		System.out.println("Length of y :"+y.length);
		//2.FOR loop:
			for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
		//3.WHILE loop:
		int a=0;
	    while(a<y.length)
		{
			System.out.println(y[a]);
			a++;
			
		}
	    //4.Enhanced FOR loop:
	    //SYNTAX : for (int variable name : )
	    for(int sun:y)
	    {
	    	System.out.println(sun);
	    }

	}

}
