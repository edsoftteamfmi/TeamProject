package com.ereader.readinglevel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.ereader.utils.Constants;

public class ReadingPanels {
	private Syllable syllable = new Syllable();

	private int selectedCombination;

	private CombinationsPanel combinationsContentPanel;

	private SyllablePanel syllableContentPanel;

	private LettersChoicePanel choiceContentPanel;

	public ReadingPanels() {

		choiceContentPanel = new LettersChoicePanel(
				createLetterChoiceListener());

		combinationsContentPanel = new CombinationsPanel(
				createCombinationListener());

		syllableContentPanel = new SyllablePanel();
	}

	private ActionListener createBackButtonListener() {
		final ActionListener backButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				syllableContentPanel.setVisible(!syllableContentPanel
						.isVisible());
				combinationsContentPanel.setVisible(!combinationsContentPanel
						.isVisible());
			}
		};
		return backButtonListener;
	}

	private ActionListener createCombinationListener() {
		ActionListener combinationListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				switch (combinationsContentPanel.getSelectedIndexOfList()) {
				case Constants.GLASNA_SYGLASNA:
					selectedCombination = Constants.GLASNA_SYGLASNA;
					break;
				case Constants.SYGLASNA_GLASNA:
					selectedCombination = Constants.SYGLASNA_GLASNA;
					break;
				case Constants.GLASNA_SYGLASNA_GLASNA:
					selectedCombination = Constants.GLASNA_SYGLASNA_GLASNA;
					break;
				case Constants.SYGLASNA_GLASNA_SYGLASNA:
					selectedCombination = Constants.SYGLASNA_GLASNA_SYGLASNA;
					break;
				case Constants.SYGLASNA_SYGLASNA_GLASNA:
					selectedCombination = Constants.SYGLASNA_SYGLASNA_GLASNA;
					break;
				case Constants.GLASNA_SYGLASNA_SYGLASNA:
					selectedCombination = Constants.GLASNA_SYGLASNA_SYGLASNA;
					break;
				case Constants.GLASNA_GLASNA_SYGLASNA:
					selectedCombination = Constants.GLASNA_GLASNA_SYGLASNA;
					break;
				case Constants.SYGLASNA_GLASNA_GLASNA:
					selectedCombination = Constants.SYGLASNA_GLASNA_GLASNA;
					break;
				default:
					System.out.println("No needed");
				}

				JPanel syllablePanel = syllable
						.generateSyllable(selectedCombination);
				JPanel buttonsPanel = syllableContentPanel
						.initializeAndAddSyllableButtons(
								createBackButtonListener(),
								createNewSyllableListener());
				combinationsContentPanel.setVisible(false);
				syllableContentPanel.setVisible(true);

				syllableContentPanel.recreateBasePanel(syllablePanel,
						buttonsPanel);

				syllableContentPanel.getSyllableBackground().add(
						syllableContentPanel.getSyllableBasePanel());
				syllableContentPanel.add(
						syllableContentPanel.getSyllableBackground(),
						BorderLayout.CENTER);
			}
		};
		return combinationListener;
	}

	private ActionListener createNewSyllableListener() {
		final ActionListener newSyllableListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				JPanel syllablePanel = syllable
						.generateSyllable(selectedCombination);
				JPanel buttonsPanel = syllableContentPanel
						.initializeAndAddSyllableButtons(
								createBackButtonListener(), this);
				syllableContentPanel.recreateBasePanel(syllablePanel,
						buttonsPanel);
			}

		};
		return newSyllableListener;
	}

	private ActionListener createLetterChoiceListener() {
		ActionListener lettersChoiceListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String letters = choiceContentPanel.getLetters();
				syllable.setConsonant(letters);
				choiceContentPanel.setVisible(false);
				combinationsContentPanel.setVisible(true);
			}
		};
		return lettersChoiceListener;
	}

	public CombinationsPanel getCombinationsContentPanel() {
		return combinationsContentPanel;
	}

	public SyllablePanel getSyllableContentPanel() {
		return syllableContentPanel;
	}

	public LettersChoicePanel getChoiceContentPanel() {
		return choiceContentPanel;
	}
}
