package day05;

public class Program02 {
	
	//how to use return function......

	public static void main(String[] args) {
	int x=addfunction(10,10);
	System.out.println(x*x);
	
	int y=addfunction(20,20);
	System.out.println(y*y);

	}
	public static int addfunction(int a,int b) {
		return (a+b);

	}

}
