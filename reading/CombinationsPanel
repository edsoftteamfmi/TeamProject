package com.ereader.readinglevel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import com.ereader.utils.Constants;
import com.ereader.utils.ImageUtils;
import com.ereader.utils.LoadImage;

public class CombinationsPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel basePanel;
	private JPanel topPanel;
	private JPanel bottomPanel;
	private JList<?> combinationsList;
	private JLabel combinationsBackground;
	private JLabel combinationsLabel;
	private JButton chooseButton;

	private static String[] combinations = { "Гласна - Съгласна",
			"Съгласна - Гласна", "Гласна - Съгласна - Гласна",
			"Съгласна - Гласна - Съгласна", "Съгласна - Съгласна - Гласна",
			"Гласна - Съгласна - Съгласна", "Гласна - Гласна - Съгласна",
			"Съгласна - Гласна - Гласна" };

	public CombinationsPanel(ActionListener listener) {
		setLayout(new BorderLayout(5, 5));

		combinationsBackground = ImageUtils.createBackground();

		// Initialize basePanel that contains panels with list, label and button
		initializeBasePanel();

		initializeCombinationsListAndLabel();
		// Initialize topPanel that contains list and label
		initializeTopPanel();

		initializeTheButton(listener);

		initializeBottomPanel();

		basePanel.add(topPanel, BorderLayout.CENTER);
		basePanel.add(bottomPanel, BorderLayout.PAGE_END);

		combinationsBackground.setLayout(new GridBagLayout());
		combinationsBackground.add(basePanel);
		add(combinationsBackground, BorderLayout.CENTER);

		setVisible(false);
	}

	public JPanel getBasePanel() {
		return basePanel;
	}

	private void initializeBasePanel() {
		basePanel = new JPanel();
		basePanel.setBackground(new Color(255, 255, 255, 123));
		basePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,
				Constants.BORDER_STROKE));
	}

	private void initializeTopPanel() {
		topPanel = new JPanel();
		topPanel.setOpaque(false);
		topPanel.setLayout(new GridLayout(0, 2));

		topPanel.add(combinationsLabel);
		topPanel.add(combinationsList);
	}

	private void initializeBottomPanel() {
		bottomPanel = new JPanel();
		bottomPanel.setOpaque(false);

		bottomPanel.add(chooseButton);
	}

	public JLabel getCombinationsBackground() {
		return combinationsBackground;
	}

	private void initializeCombinationsListAndLabel() {
		combinationsLabel = new JLabel("Изберете комбинация: ");
		combinationsLabel.setForeground(Color.BLACK);
		combinationsList = new JList<String>(combinations);
		combinationsList.setForeground(Color.BLACK);
		combinationsList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		combinationsList.setOpaque(false);
		combinationsList.setBackground(new Color(1f, 0.5f, 0.5f, 0.6f));
		combinationsList.setBorder(BorderFactory.createLineBorder(Color.BLACK,
				1));
	}

	private void initializeTheButton(ActionListener listener) {
		chooseButton = new JButton("Избери");
		chooseButton.setHorizontalTextPosition(AbstractButton.CENTER);
		chooseButton.setVerticalTextPosition(AbstractButton.BOTTOM);
		chooseButton.addActionListener(listener);
	}

	public int getSelectedIndexOfList() {
		return combinationsList.getSelectedIndex() + 1;
	}

}
