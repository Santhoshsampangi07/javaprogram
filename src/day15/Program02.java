package day15;

import java.util.HashMap;

public class Program02 {
	//HashMap: in Map 'M'- should be capital letter .
	// It is fast process .
	public static void main(String[] args) {
		//Declaration:HashMap<key,value> variable name=new HashMap<>();
		HashMap<Integer,String>x=new HashMap<>();
		// To give input for key and value:
		x.put(1, "a"); // here - key = 1 , value = a
		x.put(2, "b");
		x.put(3, "c");
		x.put(4, "d");
		System.out.println(x);
		//example for same key and different value:
		x.put(11, "aa");
		x.put(12, "bb");
		x.put(13, "bb");
		x.put(11, "dd");
		System.out.println(x);
		//To remove the value using key:
		x.remove(2);
		System.out.println(x);
		//To remove  value and key:
				x.remove(11,"dd");
				System.out.println(x);
		// To check the size :
		System.out.println(x.size());
		//To print only key  variable name.KeySet();  :
		System.out.println(x.keySet());
		//To print only value variable name.values();  :
		System.out.println(x.values());
		// To print both key and value variable name.entrySet();  :
		System.out.println(x.entrySet());
		//To replace
		// If we add new key means it will not add and it does only on existing key.
		x.replace(3, "e");
		System.out.println(x);
		// In put if we add new key it will add newly and if exists it will replace the value.
		x.put(14,"ccc");
		x.put(12,"ccc");
		System.out.println(x);
		//In  HashMap we can store null key and null value :
		x.put(null, null);
		System.out.println(x);
	}

}
