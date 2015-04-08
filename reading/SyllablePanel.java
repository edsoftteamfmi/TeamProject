package com.ereader.readinglevel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ereader.utils.ImageUtils;

public class SyllablePanel extends JPanel {

	private JPanel syllableBasePanel = new JPanel();
	private JLabel syllableBackground;

	public SyllablePanel() {
		setLayout(new BorderLayout(5, 5));

		syllableBackground = ImageUtils.createBackground();

		add(syllableBackground, BorderLayout.CENTER);

		setVisible(false);
	}

	public JPanel initializeAndAddSyllableButtons(
			ActionListener backButtonListener,
			ActionListener newSyllableListener) {
		JPanel syllableButtonPanel = new JPanel();
		JButton backButton = new JButton("Назад");
		backButton.setHorizontalTextPosition(AbstractButton.CENTER);
		backButton.setVerticalTextPosition(AbstractButton.BOTTOM);
		backButton.addActionListener(backButtonListener);

		JButton newSyllable = new JButton("Нова сричка");
		newSyllable.setHorizontalTextPosition(AbstractButton.CENTER);
		newSyllable.setVerticalTextPosition(AbstractButton.BOTTOM);
		newSyllable.addActionListener(newSyllableListener);
		syllableButtonPanel.add(backButton);
		syllableButtonPanel.add(newSyllable);
		syllableButtonPanel.setOpaque(false);
		return syllableButtonPanel;
	}

	public void recreateBasePanel(JPanel syllablePanel, JPanel buttonsPanel) {
		syllableBasePanel.removeAll();
		syllableBasePanel.setLayout(new GridLayout(2, 1));
		syllableBasePanel.setOpaque(false);
		syllableBasePanel.add(syllablePanel);
		syllableBasePanel.add(buttonsPanel);

		syllableBasePanel.revalidate();
		syllableBasePanel.repaint();

	}

	public JPanel getSyllableBasePanel() {
		return syllableBasePanel;
	}

	public JLabel getSyllableBackground() {
		return syllableBackground;
	}
}
