package day09;

public class Program01 {

	
	//iii) DO - WHILE  ----> first action after checks the condition , Should give semicolon in while;
	//even though the condition is not satisfied it prints at-least one time.....
	public static void main(String[] args) {
		int x=6;
		do
		{
		System.out.println("case1-day 08");
		x=x+4;
	    }while (x<=5);
		
		
		int y=2;
		do
		{
		System.out.println("case2-day 09");	
		y=y-1;	
		}while (y>=3);
		

}
}