package day10;

import java.util.Scanner;



public class Program01 {
	// printing tables using while , do while , for statements

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter the table ");
		
	 int table1=a.nextInt();
	 a.close();
	 
		int a1=1;
		while(a1<=30)
			{
			System.out.println(table1+"x"+a1+"="+table1*a1);
			a1++;
		}
		int table2=60;
		int a2=1;
		do
		{
		System.out.println(table2+"x"+a2+"="+table2*a2);
		a2++;
	}while(a2<=30);
		
		
		int table3=70;
		
		for(int a3=1;a3<=30;a3++)
		{
		System.out.println(table3+"x"+a3+"="+table3*a3);
		
	}

	}

}
