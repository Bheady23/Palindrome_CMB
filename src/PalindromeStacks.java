import java.util.Arrays;
/**
 *  A class that instantiates an Array Stack using the ArrayStack and StackInterface by @author Frank M. Carrano @author Timothy M. Henry
 *  This class takes a user inputed String and compares it to itself using an Array Stack to see in the String is a palindrome. 
    @author Chris Burkhead
    @version 1.0
    CS215-ON
    Assignment 2.2
    Fall 2022
 */
public class PalindromeStacks {
	
	/**
	 *  @param userEntry1 accepting the userEntry from the application into a new variable 
	 * instantiating an ArrayStack @param palindromeOut 
	 * and an Char[] palindromeIn whose size is based on the length of the users entry
	 */
	ArrayStack<Character> palindromeOut=new ArrayStack<>();
	String userEntry1=PalindromeApplication.userEntry;
	char[] palindromeIn = new char[userEntry1.length()];
	
	/**
	 * This method fills the array palindromeIn with the 
	 * separated characters from userEntry1
	 */
	public void arrayofCharacters() {
		int length = userEntry1.length();
		for (int i=0;i<length;i++){
			palindromeIn[i] = userEntry1.charAt(i);
		}//end for loop
	}//end arrayofCharacters
	
	/**
	 * This method first invokes the arrayofCharacters()
	 * It then uses a for loop to fill the ArrayStack palindromeOut
	 * with the characters entered in array palindromeIn
	 */
	public void arraySwap() {
		arrayofCharacters();
		System.out.println("Copying your entry into a stack, printing the inputs side by side to show how they are entered");
		for (int i=0;i<palindromeIn.length;i++) {
			palindromeOut.push(palindromeIn[i]);
			System.out.print(palindromeIn[i]);
			System.out.println(palindromeOut.peek());
		}//end for loop
	}//end arraySwap
	
	/**
	 * This method first invokes the arraySwap()
	 * It then uses a for loop to compare the entries of array palindromeIn to ArrayStack palindromeOut. 
	 * If the entries are the same then the counter iterates by 1, if they are not the same then it iterates by -1. 
	 * It then pops the stack and the loop begins again. Once the for loop has completed the counter is then compared
	 * to the length of the array palindromeIn. If they are equal then we have a palindrome, if they are not equal then we do not.  
	 * This works because a stack is filled by placing one entry on top of the next one, so the top of stack of palindromeOut is actually the
	 * bottom of array palindromeIn. So by comparing them side by side, if every entry matches, we have a palindrome.   
	 */
	public void compare() {
		arraySwap();
		System.out.println();
		System.out.println("Comparing your entry versus the stack, top to bottom to check for palindrome validitaty");
		System.out.println("Printing them side by side to show how they are being compared");
		int count=0;
		
		//for loop that compares the array and ArrayStack
		
		for (int e=0;e<palindromeIn.length;e++) { 
			if (palindromeIn[e]==palindromeOut.peek())//peek() allows us to see the entry ontop of the stack 
				count++;	
			else 
				count--;
		
		System.out.print(palindromeIn[e]);
		System.out.println(palindromeOut.peek());
		palindromeOut.pop();//pop() pops the top entry off the stack and discards it
		}//end for loop
	
	if (count!=palindromeIn.length)
		System.out.println("Conclusion: Your entry "+userEntry1+" is not a Palindrome!");
		
	if (count==palindromeIn.length) 
		System.out.println("Conclusion: Your entry "+userEntry1+" is a Palindrome!");
	}//end compare
	
	@Override
	public String toString() {
		return "PalindromeStacks  palindromeOut=" + palindromeOut + ", palin2="
				+ Arrays.toString(palindromeIn) + "]";
	}//end toString
		
}//end class
