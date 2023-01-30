package day06.Package01;

public class TestA01 {
	
	//Access specifier....
	//public,private,protected,default......
	//FOR STATIC MEMBERS......
	//from one class to another class.....
	
	public static void main(String[] args) {
		sub(10,10); //if the method is private it can be only used within the class for both static and non-static
		
	}


		
		public static  void add (int a,int b) {
	          System.out.println(a+b); 
			
			
		}
		private static void sub(int a , int b ) {

			System.out.println(a-b);
		}
		protected static  void mul (int a,int b) {
	        System.out.println(a*b);
			
			
		}
		static void  div(int a , int b ) {

			System.out.println(a/b);
		}
		
		

}
