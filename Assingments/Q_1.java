package Assingments;

import java.util.Scanner;
public class Q_1 {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("input the 1st number");
		int num1=in.nextInt();
		
		 System.out.println("input the 2nd number");
		 int num2=in.nextInt();
		 
		 System.out.println("input 3rd number");
		 int num3= in.nextInt();
		 
		 if (num1>num2)
		 if (num1>num3)
			 System.out.println("the gretest number"+num1);
		 
		 if(num2>num1)
		if(num2>num3)
			System.out.println("the gretest number "+num2);
		 
		 if(num3>num1)
		 if(num3>num1)
			 System.out.println("the gretest number"+num3);
	}
}


	


