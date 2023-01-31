package day15;

import java.util.Hashtable;

public class Program03 {
	//Hashtable - In table 't' should be small letter 
	// It is slow process
	//we cannot store null key and null value.

	public static void main(String[] args) {
	//	Declaration : Hashtable<key,value> variable name= new Hashtable<>();
		Hashtable<Integer,String> x= new Hashtable<>();
		x.put(1,"a");
		System.out.println(x);
		
		}

}
