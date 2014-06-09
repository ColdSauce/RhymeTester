package com.rhyme;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FigureOut {
	private ArrayList<String> wordsThatRhyme = new ArrayList<String>();
	public boolean doTheTwoRhyme(String firstWord,String secondWord){
		String lastThreeLettersFirst = firstWord.substring(firstWord.length()-3);
		String lastThreeLettersSecond = secondWord.substring(secondWord.length()-3);
		return((lastThreeLetters).equalsIgnoreCase(lastThreeLettersSecond));
	}
	public ArrayList<String> getRhymes(String word){
		File file = new File("res/enable1.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader in = new BufferedReader(fr);
			String line;
			while((line = in.readLine()) != null  ){
				if(line.length() > 3)
					if(doTheTwoRhyme(line,word))
						wordsThatRhyme.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wordsThatRhyme;
	}
}
