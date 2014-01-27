package com.rhyme;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class RhymeRunner {
	public static void main(String bobby[]) {
		FigureOut instance = new FigureOut();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, "ERROR: COULDN'T SET LOOK AND FEEL!");
		}
		System.out
				.println("Welcome to Stefan's magical rhyme tester. \n You can only up in words greater than 3 letters in length to test if they rhyme! \n Write a word and press enter. After that, write the second word in the next line and press enter.");
		Scanner thing = new Scanner(System.in);
		while (JOptionPane.showConfirmDialog(null,
				"Would you like to continue?") == JOptionPane.YES_OPTION) {
			String firstWord = JOptionPane
					.showInputDialog("Enter a word you would like to find rhymes for!");

			while (firstWord.length() <= 3) {
				System.out
						.println("The word you typed is too small! Try again!");
				firstWord = JOptionPane
						.showInputDialog("Enter a word you would like to find rhymes for!");
			}

			JOptionPane.showMessageDialog(null, instance.getRhymes(firstWord));

		}
	}
}
