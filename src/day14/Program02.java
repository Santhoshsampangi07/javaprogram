package day14;

import java.util.ArrayList;
import java.util.Arrays;

public class Program02 {

	public static void main(String[] args) {
		// ArrayList Declaration :
				ArrayList<Integer> x=new ArrayList<>();
				// To add single value :
				x.add(10);// index 0
				x.add(20);// index 1
				x.add(30);// index 2
		       // Set : Replacing the value 
				x.set(2, 40);
				System.out.println(x);
				Integer[] y= {50,60,70,80,90,100};
				// Converting array into list :
				//Adding multiple values :
				x.addAll(Arrays.asList(y));
				System.out.println(x);
				//Removing multiple values :
				Integer[] z= {10,20,30};
				x.removeAll(Arrays.asList(z));
				System.out.println(x);
				

	}

}
