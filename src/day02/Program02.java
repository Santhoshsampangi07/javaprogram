package day02;

public class Program02 {
	byte a=-128;
	short b= 32767;
	int c=1234567;
	long d=67890898l;
	boolean x=true;
	char y='1';
	float ab=0.1f;
	double bc=0.1d;
	
	//static and not static topic

	//?? access specifier 
	public static void main(String[] args) {
		int a =10;
		fun();
		
		System.out.println(a);
		
		/*System.out.println("a");
		it shows a */
	
		
		
		System.out.println("program");
		fun();
		fun();
		fun();
		fun();
		fun();
		fun();
		fun();
		fun();
		fun();
		fun();
	}
	
	public static void fun() {

		System.out.println("02");
	

	}
	
	
	

}
