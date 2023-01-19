package day06.Package02;
import day06.Package01.TestA02;
public class TestB02 {     
			//Extends allows static only.....
	public static void main(String[] args) {
	
		TestA02 a= new TestA02();
		
		a.add(10,10);
		
		/*a.mul(10,10);
		a.div(10, 10);
		a.sub(10, 10);  in non-static method protected cannot use from one package to another package.....
		*/

	}

}
