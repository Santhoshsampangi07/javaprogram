package day15;

import java.util.HashSet;

public class Program01 {
	// HashSet :

	public static void main(String[] args) {
		
		//Declaration : HashSet<Datatype> variable name = new HasSet<>();
		// Doesn't read the duplicate value :
		// Index is not present
		// It shows value in random order
		HashSet<String>x=new HashSet<>();
		x.add("abc");
		x.add("def");
		x.add("ghi");
		x.add("abc");
		x.add("mno");
		System.out.println(x);
		//To check whether the string is present or not and gives boolean value : True or false
		System.out.println(x.contains("abc"));
		System.out.println(x.contains("abcd"));
	}

}
