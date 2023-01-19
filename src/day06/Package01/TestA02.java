package day06.Package01;

public class TestA02 {

		//Access specifier....
		//public,private,protected,default......
		//FOR NON-STATIC MEMBERS.....
		//from one class to another class.....
	
	
	
	public static void main(String[] args) {
		TestA02 a=new TestA02();
		a.sub(10,10);
	}
			public   void add (int a,int b) {
		          System.out.println(a+b);
				
				
			}
			
			private  void sub(int a , int b ) {

				System.out.println(a-b);
			}
			protected   void mul (int a,int b) {
		        System.out.println(a*b);
				
				
			}
			 void  div(int a , int b ) {

				System.out.println(a/b);
			}
			

}
