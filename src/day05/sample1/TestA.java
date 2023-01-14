package day05.sample1;

	//single level inheritance.....

public class TestA {
	
	public static void add(int a , int b ) {

		System.out.println(a+b);
		
		//Non-static means need to create object because extends only run on static member
	}
	public void sub(int a , int b ) {

		System.out.println(a-b);
	}
}
