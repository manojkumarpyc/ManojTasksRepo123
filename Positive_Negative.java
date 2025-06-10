package Tasks;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		Scanner pos= new Scanner(System.in);
		System.out.println("enter the number");
		int userinput=pos.nextInt();
		
		if(userinput<0) {
			System.out.println("the given number is negative");
		}
		else if(userinput>0){
			System.out.println("the given number is positive");
		}
		else {
			System.out.println("The number is zero");
		}
		
		
			

	}

}
