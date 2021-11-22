package org.generation.italy.strings;
import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Inserire una parola: ");
		String word = scan.nextLine();
		char[] n = word.toCharArray(), pal = new char[n.length];
		for (int i = 0; i < n.length; i++ ) {
			pal[i] = n[n.length - i - 1];
		}
		
		System.out.println(word);
		System.out.println(String.valueOf(pal));
		
		if (word.equals(String.valueOf(pal))) {
			System.out.println("La parola è palindroma");
		} else {
			System.out.println("La parola non è palindroma");
		}
		
		scan.close();
	}

}
