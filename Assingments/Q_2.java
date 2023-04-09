package Assingments;

import java.util.Scanner;

public class Q_2 {
	 
	public static void main(String[] args, Scanner in) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("input an alphabet");
		String input = in.next().toLowerCase();
		
		boolean uppercase=input.charAt(0)>=65 && input.charAt(0)<=90;
		boolean lowercase=input.charAt(0)>=97 && input.charAt(0)<=122;
		boolean vowels=input.equals("a")||input.equals("e")||input.equals("i")||input.equals("o")||input.equals("u");
		
		if(input.length()>1) {
			System.out.println("Error.not a single character");
		}
		else if (!(uppercase||lowercase)) {
			System.out.println("error not as letter enter uppercase or lowercase letter");}
		else if (vowels)
		{
			System.out.println("input letter is vowels");
		}
		else
		{
			System.out.println("input letter is constant");
		}
		}

}
