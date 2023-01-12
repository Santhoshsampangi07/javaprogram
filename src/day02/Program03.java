package day02;

public class Program03 {
	byte a=-128;
	static short b= 32767;
	int c=1234567;
	long d=67890898l;
	boolean x=true;
	char y='1';
	float ab=0.1f;
	static double bc=0.1d;
	
	//object creation... topic
	//for static method we don't want to create an object creation......

	public static void main(String[] args) {
		
		Program03 abc = new Program03();
	
		
		
		abc.fun();
		
		
		
		System.out.println("program");
		System.out.println(bc);
		

	}
	public void fun() {

		System.out.println("03");
	

	}
		
		

}
