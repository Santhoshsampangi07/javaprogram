package day09;

public class Program03 {

	// PRE/POST INCREMENT AND DECREMENT OPERATORS 
	// ++A ---> PRE-INCREMENT   
	// A++ ---> POST-INCREMENT
	// --A ---> PRE-DECREMENT
	// A-- ---> POST-DECREMENT
	public static void main(String[] args) {//a=a+1 for incrementing, a=a-1 for decrementing......
		int a=20;
		
	    int b=++a;{
		System.out.println(a+"    "+b);
		}
		
	    int c=a++;{
		System.out.println(a+"    "+c);
		}
	    
	    int d=--a;{
		System.out.println(a+"    "+d);
		}
			
		int e=a--;{
		System.out.println(a+"    "+e);
		}
	}

}
