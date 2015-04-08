package com.ereader.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ereader.utils.Constants;
import com.ereader.utils.ImageUtils;
import com.ereader.utils.LoadImage;

public class ModelPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel background;
	private JPanel basePanel;
	private JPanel topPanel;
	private JPanel bottomPanel;
	private JPanel firstWrongModelPanel;
	private JPanel secondWrongModelPanel;
	private JPanel rightModelPanel;
	private JPanel imagePanel;
	private JPanel allModelsPanel;
	private JPanel middlePanel;
	private JPanel buttonPanel;

	private JButton anotherModelButton;
	private List<SoundModel> models = new ArrayList<SoundModel>();
	private int index;

	public ModelPanel(int index, List<SoundModel> models) {
		setLayout(new BorderLayout(5, 5));
		this.index = index;

		this.models = models;
		sortList();
		background = ImageUtils.createBackground();

		createBasePanel();
		background.add(basePanel);

		add(background, BorderLayout.CENTER);

		setVisible(false);
	}

	private void createBasePanel() {
		basePanel = new JPanel();
		basePanel.setOpaque(false);
		basePanel.setLayout(new BoxLayout(basePanel, BoxLayout.Y_AXIS));
		basePanel.add(Box.createHorizontalGlue());
		createTopPanel();
		createMiddlePanel();
		createBottomPanel();

		basePanel.add(topPanel);
		basePanel.add(middlePanel);
		basePanel.add(bottomPanel);
	}

	private void createBottomPanel() {
		bottomPanel = new JPanel();
		bottomPanel.setOpaque(false);

		initializeButton();
		bottomPanel.add(buttonPanel);
	}

	public void createMiddlePanel() {
		middlePanel = new JPanel();
		createImagePanel();
		createModelsPanel();

		FlowLayout middlePanelLayout = new FlowLayout();

		middlePanel.setLayout(middlePanelLayout);
		middlePanel.setOpaque(false);

		middlePanel.add(imagePanel);
		middlePanel.add(allModelsPanel);
		middlePanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		middlePanel.invalidate();
	}

	private void createTopPanel() {
		topPanel = new JPanel();
		topPanel.setOpaque(false);
		JLabel title = new JLabel("Кой е звуковият модел?");
		topPanel.add(title);
	}

	private void initializeButton() {
		anotherModelButton = new JButton("Следващ модел");

		anotherModelButton.setHorizontalTextPosition(AbstractButton.CENTER);
		anotherModelButton.setVerticalTextPosition(AbstractButton.BOTTOM);
		anotherModelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				int index;
				index = rand.nextInt(models.size() - 1);

				setVisible(true);

				setIndex(index);
				recreateBasePanel();
				getModelBackground().add(getBasePanel());
				add(getModelBackground(), BorderLayout.CENTER);

			}
		});

		buttonPanel = new JPanel();
		buttonPanel.setOpaque(false);
		buttonPanel.add(anotherModelButton);
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void recreateBasePanel() {
		basePanel.removeAll();

		basePanel.setOpaque(false);
		basePanel.setLayout(new BoxLayout(basePanel, BoxLayout.Y_AXIS));
		basePanel.add(Box.createHorizontalGlue());

		basePanel.add(topPanel);
		createMiddlePanel();
		basePanel.add(middlePanel);
		basePanel.add(bottomPanel);
		basePanel.revalidate();
		basePanel.repaint();
	}

	public JLabel getModelBackground() {
		return background;
	}

	public JPanel getBasePanel() {
		return basePanel;
	}

	private JPanel createPanel(int position) {
		JPanel panel = new JPanel();
		SoundModel rightModel = models.get(position);
		List<JLabel> labels = rightModel.getLabels();
		for (JLabel label : labels) {
			label.setVisible(true);
			panel.add(label);
		}
		panel.setLayout(new FlowLayout());
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		// panel.setOpaque(false);
		panel.setBackground(Color.white);
		panel.setVisible(true);
		return panel;
	}

	private void rowModels() {
		Random rand = new Random();
		int panelNumb = rand.nextInt(6);

		if (panelNumb == 0) {
			allModelsPanel.add(rightModelPanel);
			allModelsPanel.add(firstWrongModelPanel);
			allModelsPanel.add(secondWrongModelPanel);
		}
		if (panelNumb == 1) {
			allModelsPanel.add(rightModelPanel);
			allModelsPanel.add(secondWrongModelPanel);
			allModelsPanel.add(firstWrongModelPanel);
		}
		if (panelNumb == 2) {
			allModelsPanel.add(firstWrongModelPanel);
			allModelsPanel.add(rightModelPanel);
			allModelsPanel.add(secondWrongModelPanel);
		}
		if (panelNumb == 3) {
			allModelsPanel.add(firstWrongModelPanel);
			allModelsPanel.add(secondWrongModelPanel);
			allModelsPanel.add(rightModelPanel);
		}
		if (panelNumb == 4) {
			allModelsPanel.add(secondWrongModelPanel);
			allModelsPanel.add(firstWrongModelPanel);
			allModelsPanel.add(rightModelPanel);
		}
		if (panelNumb == 5) {
			allModelsPanel.add(secondWrongModelPanel);
			allModelsPanel.add(rightModelPanel);
			allModelsPanel.add(firstWrongModelPanel);
		}
	}

	private void addModelPanelsListeners() {
		rightModelPanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("mouseReleased");
				rightModelPanel.removeAll();
				rightModelPanel.setBackground(Color.green);

				rightModelPanel.setPreferredSize(new Dimension(rightModelPanel
						.getWidth(), allModelsPanel.getHeight() / 3));
				JLabel imageLabel = new JLabel(ImageUtils.createIcon(
						Constants.SMILE, allModelsPanel.getHeight() / 3,
						allModelsPanel.getHeight() / 3));
				rightModelPanel.add(imageLabel);
				rightModelPanel.revalidate();
				rightModelPanel.repaint();

			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("mousePressed");
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("mousePressed");
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("mousePressed");

			}
		});
		firstWrongModelPanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("mouseReleased");
				firstWrongModelPanel.removeAll();
				firstWrongModelPanel.setBackground(Color.red);

				firstWrongModelPanel.setPreferredSize(new Dimension(
						firstWrongModelPanel.getWidth(), allModelsPanel
								.getHeight() / 3));
				JLabel imageLabel = new JLabel(ImageUtils.createIcon(
						Constants.SAD, allModelsPanel.getHeight() / 3,
						allModelsPanel.getHeight() / 3));
				firstWrongModelPanel.add(imageLabel);
				firstWrongModelPanel.revalidate();
				firstWrongModelPanel.repaint();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		secondWrongModelPanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("mouseReleased");
				secondWrongModelPanel.removeAll();
				secondWrongModelPanel.setBackground(Color.red);

				secondWrongModelPanel.setPreferredSize(new Dimension(
						secondWrongModelPanel.getWidth(), allModelsPanel
								.getHeight() / 3));
				JLabel imageLabel = new JLabel(ImageUtils.createIcon(
						Constants.SAD, allModelsPanel.getHeight() / 3,
						allModelsPanel.getHeight() / 3));
				secondWrongModelPanel.add(imageLabel);
				secondWrongModelPanel.revalidate();
				secondWrongModelPanel.repaint();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	private void createModelsPanel() {
		allModelsPanel = new JPanel();

		rightModelPanel = createPanel(index);

		int firstIndex = -1;
		int secondIndex = -1;
		for (int i = 0; i < models.size(); i++) {
			SoundModel model = models.get(i);
			if (firstIndex == -1 && model.hasEqualLength(models.get(index))) {
				firstIndex = i;
			}
			if (firstIndex != -1 && model.hasEqualLength(models.get(index))) {
				secondIndex = i;
			}
		}
		if (firstIndex == -1) {
			firstIndex = 0;
			secondIndex = models.size() - 1;
		}
		secondIndex++;
		Random rand = new Random();
		int R;
		int x;
		do {
			R = rand.nextInt(secondIndex - firstIndex) + firstIndex;
		} while (R == index || models.get(index).areEqual(models.get(R)));

		firstWrongModelPanel = createPanel(R);
		x = R;
		do {
			R = rand.nextInt(secondIndex - firstIndex) + firstIndex;
		} while (R == index || R == x
				|| models.get(index).areEqual(models.get(R))
				|| models.get(x).areEqual(models.get(R)));
		secondWrongModelPanel = createPanel(R);
		rowModels();

		addModelPanelsListeners();

		allModelsPanel
				.setLayout(new BoxLayout(allModelsPanel, BoxLayout.Y_AXIS));
		allModelsPanel.add(Box.createHorizontalGlue());
		allModelsPanel.setOpaque(false);
		allModelsPanel.invalidate();

	}

	private void createImagePanel() {
		imagePanel = new JPanel();
		imagePanel.setOpaque(false);
		JLabel imageLabel = new JLabel(models.get(index).getImage());
		imagePanel.add(imageLabel);
	}

	private void sortList() {
		for (int i = 0; i < models.size(); i++) {
			int position = i;
			SoundModel min = models.get(i);
			for (int j = i + 1; j < models.size(); j++) {
				if (min.isLonger(models.get(j))) {
					min = models.get(j);
					position = j;
				}
			}
			if (position != i) {
				SoundModel temp = models.get(i);
				models.remove(models.get(i));
				models.remove(min);
				models.add(i, min);
				models.add(position, temp);
			}
		}
	}
}
