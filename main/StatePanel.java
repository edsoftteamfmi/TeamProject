package com.ereader.main;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ereader.utils.ImageUtils;

public class StatePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel background;
	private JPanel basePanel;

	public StatePanel(ActionListener readingListener,
			ActionListener modelListener) {
		setLayout(new BorderLayout(5, 5));

		background = ImageUtils.createBackground();

		setButtons(readingListener, modelListener);

		background.setLayout(new GridBagLayout());
		background.add(basePanel);
		add(background, BorderLayout.CENTER);

		setVisible(true);
	}

	private void setButtons(ActionListener readingListener,
			ActionListener modelListener) {
		basePanel = new JPanel();
		JButton readingButton = new JButton("Да четем!");
		JButton modelButton = new JButton("Да познаем модела!");
		readingButton.addActionListener(readingListener);
		modelButton.addActionListener(modelListener);
		basePanel = new JPanel();
		basePanel.setOpaque(false);

		basePanel.add(readingButton);
		basePanel.add(modelButton);
	}

}
