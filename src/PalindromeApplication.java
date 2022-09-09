
import java.util.Scanner;
/**
 *  An application class that tests the methods of the PalindromeStacks class. 
 *  This class accepts a user inputed String that possibly could be a palindrome. 
 *  It then instantiates a new PalindromeStacks so that it can implement its methods using the users entry to execute those methods. 
    @author Chris Burkhead
    @version 1.0
    CS215-ON
    Assignment 2.2
    Fall 2022
 */
public class PalindromeApplication {
	
	
	static String userEntry = null;
	
	
	public static void main(String[] args) {
		
		
		Scanner P = new Scanner(System.in);
		
		System.out.print("Please enter a potential Palindrome, numers and letters are acceptable: ");
		userEntry=P.nextLine();
		
		PalindromeStacks palindromeStacks = new PalindromeStacks();
		palindromeStacks.compare();
		
		P.close();
	}//end main

}//end class
