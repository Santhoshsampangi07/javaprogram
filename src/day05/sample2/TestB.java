package day05.sample2;

public class TestB extends TestA{

	public static  void mul (int a,int b) {
        System.out.println(a*b);
		
		//Non-static means need to create object because extends only run on static member
	}
	public void div(int a , int b ) {

		System.out.println(a/b);
	}
		

}
