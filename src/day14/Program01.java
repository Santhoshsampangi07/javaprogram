package day14;

import java.util.ArrayList;

public class Program01 {
	// COLLECTIONS 
	// i) ArrayList :
	

	public static void main(String[] args) {
		// ArrayList Declaration :
		//ArrayList<Datatype> x=new ArrayList<>();
		ArrayList<Integer> x=new ArrayList<>(); // In this datatype should start with capital letter eg: int - Integer , float - Float ... etc 
		// To add single value :
		x.add(10);// index 0
		x.add(20);// index 1
		x.add(30);// index 2
		System.out.println(x);
		//To remove single value :
		x.remove(1);
		System.out.println(x);
		// Adding value without index number :
		x.add(20);
		System.out.println(x);
		// Adding value with index number :
		x.add(1,20);
		System.out.println(x);
        // To check size :
		System.out.println(x.size());
		// To check whether the value is present or not : ( If present - True or if not present - False )
		System.out.println(x.contains(30));
		System.out.println(x.contains(40));
		// To check list is empty or not : ( if empty -True or if not - False)
		System.out.println(x.isEmpty());
		//To clear the values in arraylist:
		x.clear();
		System.out.println(x);
		System.out.println(x.isEmpty());
	}

}
