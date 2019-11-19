package demo;

import java.util.Scanner;

public class Plaindrome {
	public static void main(String[] args) {
		
		// Il s'agit d'écrire un programme qui, prend une chaîne de caractères et calcule la chaîne inverse 
		//puis indique s'il s'agit ou non d'un palindrome 
				
			
		Scanner scan = new Scanner(System.in);
		String input1,input2="";
		System.out.println("type a string: ");
		input1 = scan.nextLine();
		int a = input1.length();
		
		for(int i = a-1;i>=0;i--) {
			input2+=input1.charAt(i);
		}
		
		if(input1.equalsIgnoreCase(input2)) {
			System.out.println("your string - " + input1 + " - is palindrome");
		}else {
			System.out.println("your string - " + input1 + " - is not palindrome");
		}
		
		
	}

}
