package com.ereader.readinglevel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ereader.utils.LoadImage;

public class LettersChoicePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel basePanel = new JPanel();
	private JButton readyButton;
	private TextField letters = new TextField();
	private JLabel background;

	public LettersChoicePanel(ActionListener listener) {
		setLayout(new BorderLayout(5, 5));
		setBackround();
		initializeButton(listener);
		initializeTestFied();
		initializeBasePanel();
		background.add(basePanel);
		add(background, BorderLayout.CENTER);
		setVisible(false);
	}

	private void initializeButton(ActionListener listener) {
		readyButton = new JButton("Избери");
		readyButton.setHorizontalTextPosition(AbstractButton.CENTER);
		readyButton.setVerticalTextPosition(AbstractButton.BOTTOM);
		readyButton.addActionListener(listener);
	}
	
	private void initializeTestFied()
	{
		letters.setName("letters");
		letters.setColumns(30);
	}

	private void initializeBasePanel() {
		basePanel.setOpaque(false);
		basePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		basePanel.add(letters);
		basePanel.add(readyButton);
	}

	private void setBackround() {
		BufferedImage backgroundBufferedImage = new LoadImage(1).getImg();
		ImageIcon backgroundImage = new ImageIcon(backgroundBufferedImage);
		background = new JLabel(backgroundImage);
		background.setLayout(new GridBagLayout());
	}
	
	public String getLetters()
	{
		System.out.println(letters.getText());
		return letters.getText();
	}

	public JLabel getChoiceBackground() {
		return background;
	}
}
