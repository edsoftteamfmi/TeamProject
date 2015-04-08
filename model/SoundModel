package com.ereader.model;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.ereader.utils.LoadImage;

public class SoundModel {

	private ImageIcon image;
	private String word;
	private List<JLabel> model = new ArrayList<JLabel>();
	private List<String> vowels = new ArrayList<String>();

	public SoundModel(String word, ImageIcon img) {
		defineVowel();
		this.word = word;
		image = img;
		for (int i = 0; i < word.length(); i++) {
			String currentLetter = String.valueOf(word.charAt(i));
			if (vowels.contains(currentLetter)) {
				BufferedImage labelBufferedImage = new LoadImage(3).getImg();
				ImageIcon labelImage = new ImageIcon(labelBufferedImage);
				JLabel label = new JLabel(labelImage);
				label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

				model.add(label);
			} else {
				BufferedImage labelBufferedImage = new LoadImage(4).getImg();
				ImageIcon labelImage = new ImageIcon(labelBufferedImage);
				JLabel label = new JLabel(labelImage);
				label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

				model.add(label);
			}
		}
	}

	public int getWordLength() {
		return word.length();
	}

	private void defineVowel() {
		vowels.add("а");
		vowels.add("ъ");
		vowels.add("о");
		vowels.add("у");
		vowels.add("е");
		vowels.add("и");
	}

	public List<JLabel> getLabels() {
		return model;
	}

	public boolean isLonger(SoundModel otherModel) {
		return word.length() > otherModel.getWordLength();
	}

	public boolean areEqual(SoundModel otherModel) {
		String otherWord = otherModel.getWord();
		if (word.length() != otherModel.getWordLength()) {
			return false;
		} else {
			for (int i = 0; i < word.length(); i++) {
				if ((vowels.contains(String.valueOf(otherWord.charAt(i))) && !vowels
						.contains(String.valueOf(word.charAt(i))))
						|| (!vowels
								.contains(String.valueOf(otherWord.charAt(i))) && vowels
								.contains(String.valueOf(word.charAt(i))))) {
					return false;
				}
			}
			return true;
		}
	}

	public boolean hasEqualLength(SoundModel otherModel) {
		return word.length() == otherModel.getWordLength();
	}

	public ImageIcon getImage() {
		return image;
	}

	public String getWord() {
		return word;
	}
}
