package com.ereader.main;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.ereader.model.ModelPanel;
import com.ereader.model.SoundModel;
import com.ereader.readinglevel.ReadingPanels;
import com.ereader.utils.Constants;
import com.ereader.utils.ImageUtils;

public class Main {

	private ReadingPanels readindPanels;

	private ModelPanel modelPanel;

	private StatePanel statePanel;

	private List<SoundModel> models = new ArrayList<SoundModel>();

	public static void main(String... args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main().displayGUI();
			}
		});
	}

	private void createList() {
		SoundModel angelModel = new SoundModel("ангел", ImageUtils.createIcon(
				Constants.ANGEL, 200, 200));
		SoundModel armModel = new SoundModel("ръка", ImageUtils.createIcon(
				Constants.ARM, 200, 200));
		SoundModel bananaModel = new SoundModel("банан", ImageUtils.createIcon(
				Constants.BANANA, 200, 200));
		SoundModel bedModel = new SoundModel("легло", ImageUtils.createIcon(
				Constants.BED, 200, 200));
		SoundModel blouseModel = new SoundModel("блуза", ImageUtils.createIcon(
				Constants.BLOUSE, 200, 200));
		SoundModel bookModel = new SoundModel("книга", ImageUtils.createIcon(
				Constants.BOOK, 200, 200));
		SoundModel catModel = new SoundModel("котка", ImageUtils.createIcon(
				Constants.CAT, 200, 200));
		SoundModel chairModel = new SoundModel("стол", ImageUtils.createIcon(
				Constants.CHAIR, 200, 200));
		SoundModel cloudModel = new SoundModel("облак", ImageUtils.createIcon(
				Constants.CLOUD, 200, 200));
		SoundModel cockModel = new SoundModel("петел", ImageUtils.createIcon(
				Constants.COCK, 200, 200));
		SoundModel cowModel = new SoundModel("крава", ImageUtils.createIcon(
				Constants.COW, 200, 200));
		SoundModel dogModel = new SoundModel("куче", ImageUtils.createIcon(
				Constants.DOG, 200, 200));
		SoundModel dollModel = new SoundModel("кукла", ImageUtils.createIcon(
				Constants.DOLL, 200, 200));
		SoundModel earModel = new SoundModel("ухо", ImageUtils.createIcon(
				Constants.EAR, 200, 200));
		SoundModel elephantModel = new SoundModel("слон",
				ImageUtils.createIcon(Constants.ELEPHANT, 200, 200));
		SoundModel eyeModel = new SoundModel("око", ImageUtils.createIcon(
				Constants.EYE, 200, 200));
		SoundModel featherModel = new SoundModel("перо", ImageUtils.createIcon(
				Constants.FEATHER, 200, 200));
		SoundModel fishModel = new SoundModel("риба", ImageUtils.createIcon(
				Constants.FISH, 200, 200));
		SoundModel flowerModel = new SoundModel("цвете", ImageUtils.createIcon(
				Constants.FLOWER, 200, 200));
		SoundModel frogModel = new SoundModel("жаба", ImageUtils.createIcon(
				Constants.FROG, 200, 200));
		SoundModel heartModel = new SoundModel("сърце", ImageUtils.createIcon(
				Constants.HEART, 200, 200));
		SoundModel honeyModel = new SoundModel("мед", ImageUtils.createIcon(
				Constants.HONEY, 200, 200));
		SoundModel horseModel = new SoundModel("кон", ImageUtils.createIcon(
				Constants.HORSE, 200, 200));
		SoundModel iglooModel = new SoundModel("иглу", ImageUtils.createIcon(
				Constants.IGLOO, 200, 200));
		SoundModel legModel = new SoundModel("крак", ImageUtils.createIcon(
				Constants.LEG, 200, 200));
		SoundModel lionModel = new SoundModel("лъв", ImageUtils.createIcon(
				Constants.LION, 200, 200));
		SoundModel moonModel = new SoundModel("луна", ImageUtils.createIcon(
				Constants.MOON, 200, 200));
		SoundModel noseModel = new SoundModel("нос", ImageUtils.createIcon(
				Constants.NOSE, 200, 200));
		SoundModel pawModel = new SoundModel("лапа", ImageUtils.createIcon(
				Constants.PAW, 200, 200));
		SoundModel pumpkinModel = new SoundModel("тиква",
				ImageUtils.createIcon(Constants.PUMPKIN, 200, 200));
		SoundModel purseModel = new SoundModel("чанта", ImageUtils.createIcon(
				Constants.PURSE, 200, 200));
		SoundModel rabbitModel = new SoundModel("заек", ImageUtils.createIcon(
				Constants.RABBIT, 200, 200));
		SoundModel scarfModel = new SoundModel("шал", ImageUtils.createIcon(
				Constants.SCARF, 200, 200));
		SoundModel shipModel = new SoundModel("кораб", ImageUtils.createIcon(
				Constants.SHIP, 200, 200));
		SoundModel sunModel = new SoundModel("слънце", ImageUtils.createIcon(
				Constants.SUN, 200, 200));
		SoundModel tableModel = new SoundModel("маса", ImageUtils.createIcon(
				Constants.TABLE, 200, 200));
		SoundModel threeModel = new SoundModel("три", ImageUtils.createIcon(
				Constants.THREE, 200, 200));
		SoundModel tigerModel = new SoundModel("тигър", ImageUtils.createIcon(
				Constants.TIGER, 200, 200));
		SoundModel toothModel = new SoundModel("зъб", ImageUtils.createIcon(
				Constants.TOOTH, 200, 200));
		SoundModel treeModel = new SoundModel("дърво", ImageUtils.createIcon(
				Constants.TREE, 200, 200));
		SoundModel walnutModel = new SoundModel("орех", ImageUtils.createIcon(
				Constants.WALNUT, 200, 200));
		SoundModel waterModel = new SoundModel("вода", ImageUtils.createIcon(
				Constants.WATER, 200, 200));

		models.add(angelModel);
		models.add(armModel);
		models.add(bananaModel);
		models.add(bedModel);
		models.add(blouseModel);
		models.add(bookModel);
		models.add(catModel);
		models.add(chairModel);
		models.add(cloudModel);
		models.add(cockModel);
		models.add(cowModel);
		models.add(dogModel);
		models.add(dollModel);
		models.add(earModel);
		models.add(elephantModel);
		models.add(eyeModel);
		models.add(featherModel);
		models.add(fishModel);
		models.add(flowerModel);
		models.add(frogModel);
		models.add(heartModel);
		models.add(honeyModel);
		models.add(horseModel);
		models.add(iglooModel);
		models.add(legModel);
		models.add(lionModel);
		models.add(moonModel);
		models.add(noseModel);
		models.add(pawModel);
		models.add(pumpkinModel);
		models.add(purseModel);
		models.add(rabbitModel);
		models.add(scarfModel);
		models.add(shipModel);
		models.add(sunModel);
		models.add(tableModel);
		models.add(threeModel);
		models.add(tigerModel);
		models.add(toothModel);
		models.add(treeModel);
		models.add(walnutModel);
		models.add(waterModel);
	}

	private ActionListener getReadingButtonListener() {
		ActionListener readingButtonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				statePanel.setVisible(false);
				readindPanels.getChoiceContentPanel().setVisible(true);
			}
		};
		return readingButtonListener;
	}

	private ActionListener getModelButtonListener() {
		ActionListener modelButtonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				statePanel.setVisible(false);
				modelPanel.setVisible(true);

			}
		};
		return modelButtonListener;
	}

	public void displayGUI() {

		final JFrame guiFrame = new JFrame();
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Четало");

		readindPanels = new ReadingPanels();
		Random rand = new Random();
		int index;
		createList();
		index = rand.nextInt(models.size() - 1) + 0;

		modelPanel = new ModelPanel(index, models);
		statePanel = new StatePanel(getReadingButtonListener(),
				getModelButtonListener());
		guiFrame.add(readindPanels.getSyllableContentPanel(), BorderLayout.WEST);
		guiFrame.add(readindPanels.getCombinationsContentPanel(),
				BorderLayout.NORTH);
		guiFrame.add(readindPanels.getChoiceContentPanel(), BorderLayout.CENTER);
		guiFrame.add(modelPanel, BorderLayout.SOUTH);
		guiFrame.add(statePanel, BorderLayout.EAST);
		guiFrame.pack();
		guiFrame.setLocationByPlatform(true);
		guiFrame.setVisible(true);

	}
} 
