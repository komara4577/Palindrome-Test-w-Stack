//By Kevin O'Mara

import java.util.Scanner;
import java.util.Stack;


public class PalindromeTestStack{
   public static void main (String []args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter any string: ");
      String inputString = input.nextLine();
      
      Stack<Character> stack = new Stack<Character>();
      
      for (int i = 0; i < inputString.length(); i++){
         stack.push(inputString.charAt(i));
      }
      
      String reverseString = "";
      
      while(!stack.isEmpty()){
         reverseString = reverseString + stack.pop();
      }
      
      if (inputString.equals(reverseString))
         System.out.print("The input string is a palindrome.");
      else
         System.out.print("The input String is not a palindrome.");
         
   }
}