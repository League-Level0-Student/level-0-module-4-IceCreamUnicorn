package _08_string_methods;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to whatever you want
		String Bob = "supercalifragilisticexpialidocious";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		 Bob.charAt(2);
		// 3. Print the length of your String to the console.
		//    HINT: .length()
		 Bob.length();
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		 //for(int i = 0; i < Bob.length(); i++)
		 //{
			// System.out.println(Bob.charAt(i));
		 //}
		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		for(int i = 0;i < Bob.length(); i++) 
		{
		if(Bob.charAt(i) == 'a')
		{
		JOptionPane.showMessageDialog(null, "The position in the String a is located is:" + i);
		}
		}
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}


