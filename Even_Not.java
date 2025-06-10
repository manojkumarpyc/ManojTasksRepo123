package Tasks;

import java.util.Scanner;

public class Even_Not {
    public static void main(String[] args) {
    	Scanner num=new Scanner(System.in);
    	System.out.println("Enter tha number");
    	int bee=num.nextInt();
    	if(bee%2==0) {
            System.out.println("yes correct this is even number");
    	}
    	else {
    		System.out.println("Not Even Number");
    	}
    }
}
