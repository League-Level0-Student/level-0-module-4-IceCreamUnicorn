package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		// Ask the user how many nickels they have
		String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int memes =Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
		String diems = JOptionPane.showInputDialog("How many dimes do you have?");
		int mememes =Integer.parseInt(diems);
		// Ask the user how many quarters they have, and convert their answer
		String quaarters = JOptionPane.showInputDialog("How many quarters do you have?");
		int memememes =Integer.parseInt(quaarters);
		// Calculate how much money the user has and save it in a double variable 
		 x =memes*0.05;
		 y =mememes*0.10;
		 z =memememes*0.25;
		 double mememememes = x+y+z;
		// Tell the user how much money they have
		 JOptionPane.showMessageDialog(null,"The amount of money you have is:$" + mememememes);

	}
}

