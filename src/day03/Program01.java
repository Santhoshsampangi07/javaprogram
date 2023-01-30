package day03;

public class Program01 {
	
	//method overloading....topic

	public static void main(String[] args) {
		
		Program01 x= new Program01();
		
		x.addfunction(1,2);
	
		/*int m=1; for non-static
		int n=2;
		System.out.println(m+n);*/

		addfunction(5,5,5);
		
		/*int m=5;
		int n=4;
		int o=4;
		System.out.println(m+n-o);*/
		
		addfunction(5.5,6.5);
		
		/*double m=5.5;
		double n=6.5;
		System.out.println(m+n);*/
		
		
		
		

	}
	
	public  void addfunction(int m, int n) {
		
	System.out.println(m+n);	
	}
	public static void addfunction(int m, int n , int o) {
		
		System.out.println(m+n-o);	
	}
	public static void addfunction(double m, double n) {
		
		System.out.println(m+n);	
	}

}
