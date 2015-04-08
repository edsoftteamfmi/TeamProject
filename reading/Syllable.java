package com.ereader.readinglevel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ereader.utils.Constants;

public class Syllable {
	private static List<String> vowel = new ArrayList<String>();

	private static List<String> consonant = new ArrayList<String>();

	private JLabel firstLetterLabel = new JLabel();
	private JLabel secondLetterLabel = new JLabel();
	private JLabel thirdLetterLabel = new JLabel();

	public Syllable() {
		defineVowel();
	}

	private static void defineVowel() {
		vowel.add("а");
		vowel.add("ъ");
		vowel.add("о");
		vowel.add("у");
		vowel.add("е");
		vowel.add("и");
	}

	public void setConsonant(String letters) {
		for (int i = 0; i < letters.length(); i++) {
			char letter = letters.charAt(i);
			consonant.add(String.valueOf(letter));
		}
	}

	public JPanel generateSyllable(int selectedCombination) {

		System.out.println(selectedCombination);
		Random rand = new Random();
		int firstV = rand.nextInt(vowel.size()) + 0;
		int firstC = rand.nextInt(consonant.size()) + 0;

		int secondV = rand.nextInt(vowel.size()) + 0;
		int secondC = rand.nextInt(consonant.size()) + 0;

		JPanel syllablePanel = new JPanel();
		syllablePanel.setOpaque(false);
		syllablePanel.setLayout(new FlowLayout());

		switch (selectedCombination) {
		case Constants.GLASNA_SYGLASNA:
			System.out.println(vowel.get(firstV) + "    "
					+ consonant.get(firstC));
			firstLetterLabel = createLetterLabel(vowel.get(firstV));
			secondLetterLabel = createLetterLabel(consonant.get(firstC));

			syllablePanel.add(firstLetterLabel);
			syllablePanel.add(secondLetterLabel);

			break;
		case Constants.GLASNA_SYGLASNA_GLASNA:
			System.out.println(vowel.get(firstV) + "    "
					+ consonant.get(firstC) + "    " + vowel.get(secondV));
			firstLetterLabel = createLetterLabel(vowel.get(firstV));
			secondLetterLabel = createLetterLabel(consonant.get(firstC));
			thirdLetterLabel = createLetterLabel(vowel.get(secondV));

			syllablePanel.add(firstLetterLabel);
			syllablePanel.add(secondLetterLabel);
			syllablePanel.add(thirdLetterLabel);
			break;
		case Constants.SYGLASNA_GLASNA:
			System.out.println(consonant.get(firstC) + "    "
					+ vowel.get(firstV));
			firstLetterLabel = createLetterLabel(consonant.get(firstC));
			secondLetterLabel = createLetterLabel(vowel.get(firstV));

			syllablePanel.add(firstLetterLabel);
			syllablePanel.add(secondLetterLabel);
			break;
		case Constants.SYGLASNA_GLASNA_SYGLASNA:
			System.out.println(consonant.get(firstC) + "    "
					+ vowel.get(firstV) + "     " + consonant.get(secondC));
			firstLetterLabel = createLetterLabel(consonant.get(firstC));
			secondLetterLabel = createLetterLabel(vowel.get(firstV));
			thirdLetterLabel = createLetterLabel(consonant.get(secondC));

			syllablePanel.add(firstLetterLabel);
			syllablePanel.add(secondLetterLabel);
			syllablePanel.add(thirdLetterLabel);
			break;
		case Constants.SYGLASNA_SYGLASNA_GLASNA:
			firstLetterLabel = createLetterLabel(consonant.get(firstC));
			secondLetterLabel = createLetterLabel("р");
			thirdLetterLabel = createLetterLabel(vowel.get(firstV));
			
			syllablePanel.add(firstLetterLabel);
			syllablePanel.add(secondLetterLabel);
			syllablePanel.add(thirdLetterLabel);
			break;
		case Constants.GLASNA_SYGLASNA_SYGLASNA:
			firstLetterLabel = createLetterLabel(vowel.get(firstV));
			secondLetterLabel = createLetterLabel("р");
			thirdLetterLabel = createLetterLabel(consonant.get(secondC));
			
			syllablePanel.add(firstLetterLabel);
			syllablePanel.add(secondLetterLabel);
			syllablePanel.add(thirdLetterLabel);
			break;
		case Constants.GLASNA_GLASNA_SYGLASNA:
			firstLetterLabel = createLetterLabel(vowel.get(firstV));
			secondLetterLabel = createLetterLabel(vowel.get(secondV));
			thirdLetterLabel = createLetterLabel(consonant.get(firstC));
			
			syllablePanel.add(firstLetterLabel);
			syllablePanel.add(secondLetterLabel);
			syllablePanel.add(thirdLetterLabel);
			break;
		case Constants.SYGLASNA_GLASNA_GLASNA:
			firstLetterLabel = createLetterLabel(consonant.get(firstC));
			secondLetterLabel = createLetterLabel(vowel.get(firstV));
			thirdLetterLabel = createLetterLabel(vowel.get(secondV));
			
			syllablePanel.add(firstLetterLabel);
			syllablePanel.add(secondLetterLabel);
			syllablePanel.add(thirdLetterLabel);
			break;

		default:
			System.out.println("No needed");
		}
		syllablePanel.setBackground(new Color(1f, 1f, 1f, 0.3f));
		syllablePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

		return syllablePanel;
	}

	private JLabel createLetterLabel(String letter) {
		JLabel label = new JLabel(letter);
		label.setSize(200, 200);
		label.setForeground(Color.BLACK);
		label.setBackground(Color.WHITE);
		// label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

		Font labelFont = label.getFont();
		label.setFont(new Font(labelFont.getName(), Font.PLAIN, 150));

		return label;
	}

}
