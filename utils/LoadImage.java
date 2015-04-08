package com.ereader.utils;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


/**
 * This class loads an Image from an external file
 */
public class LoadImage extends Component {

	private static final long serialVersionUID = 1L;
	BufferedImage img;

	public LoadImage(int x) {
		try {
			switch (x) {
			case 1: {
				img = ImageIO.read(new File("pic\\back.jpg"));
				break;
			}
			case 2: {
				img = ImageIO.read(new File("pic\\EReaderIcon.png"));
				break;
			}
			case 3: {
				img = ImageIO.read(new File("pic\\red.png"));
				break;
			}
			case 4: {
				img = ImageIO.read(new File("pic\\blue.png"));
				break;
			}
			case Constants.ANGEL: {
				img = ImageIO.read(new File("pic\\angel.png"));
				break;
			}
			case Constants.ARM: {
				img = ImageIO.read(new File("pic\\arm.png"));
				break;
			}
			case Constants.BANANA: {
				img = ImageIO.read(new File("pic\\banana.png"));
				break;
			}
			case Constants.BED: {
				img = ImageIO.read(new File("pic\\bed.png"));
				break;
			}
			case Constants.BLOUSE: {
				img = ImageIO.read(new File("pic\\blause.png"));
				break;
			}
			case Constants.BOOK: {
				img = ImageIO.read(new File("pic\\book.png"));
				break;
			}
			case Constants.CAT: {
				img = ImageIO.read(new File("pic\\cat.png"));
				break;
			}
			case Constants.CHAIR: {
				img = ImageIO.read(new File("pic\\chair.png"));
				break;
			}
			case Constants.CLOUD: {
				img = ImageIO.read(new File("pic\\cloud.png"));
				break;
			}
			case Constants.COCK: {
				img = ImageIO.read(new File("pic\\cock.png"));
				break;
			}
			case Constants.COW: {
				img = ImageIO.read(new File("pic\\cow.png"));
				break;
			}
			case Constants.DOG: {
				img = ImageIO.read(new File("pic\\dog.png"));
				break;
			}
			case Constants.DOLL: {
				img = ImageIO.read(new File("pic\\doll.png"));
				break;
			}
			case Constants.EAR: {
				img = ImageIO.read(new File("pic\\ear.png"));
				break;
			}
			case Constants.ELEPHANT: {
				img = ImageIO.read(new File("pic\\elephant.png"));
				break;
			}
			case Constants.EYE: {
				img = ImageIO.read(new File("pic\\eye.png"));
				break;
			}
			case Constants.FEATHER: {
				img = ImageIO.read(new File("pic\\feather.png"));
				break;
			}
			case Constants.FISH: {
				img = ImageIO.read(new File("pic\\fish.png"));
				break;
			}
			case Constants.FLOWER: {
				img = ImageIO.read(new File("pic\\flower.png"));
				break;
			}
			case Constants.FROG: {
				img = ImageIO.read(new File("pic\\frog.png"));
				break;
			}
			case Constants.HEART: {
				img = ImageIO.read(new File("pic\\heart.png"));
				break;
			}
			case Constants.HONEY: {
				img = ImageIO.read(new File("pic\\honey.png"));
				break;
			}
			case Constants.HORSE: {
				img = ImageIO.read(new File("pic\\horse.png"));
				break;
			}
			case Constants.IGLOO: {
				img = ImageIO.read(new File("pic\\igloo.png"));
				break;
			}
			case Constants.LEG: {
				img = ImageIO.read(new File("pic\\leg.png"));
				break;
			}
			case Constants.LION: {
				img = ImageIO.read(new File("pic\\lion.png"));
				break;
			}
			case Constants.MOON: {
				img = ImageIO.read(new File("pic\\moon.png"));
				break;
			}
			case Constants.NOSE: {
				img = ImageIO.read(new File("pic\\nose.png"));
				break;
			}
			case Constants.PAW: {
				img = ImageIO.read(new File("pic\\paw.png"));
				break;
			}
			case Constants.PUMPKIN: {
				img = ImageIO.read(new File("pic\\pumpkin.png"));
				break;
			}
			case Constants.PURSE: {
				img = ImageIO.read(new File("pic\\purse.png"));
				break;
			}
			case Constants.RABBIT: {
				img = ImageIO.read(new File("pic\\rabbit.png"));
				break;
			}
			case Constants.SCARF: {
				img = ImageIO.read(new File("pic\\scarf.png"));
				break;
			}
			case Constants.SHIP: {
				img = ImageIO.read(new File("pic\\ship.png"));
				break;
			}
			case Constants.SUN: {
				img = ImageIO.read(new File("pic\\sun.png"));
				break;
			}
			case Constants.TABLE: {
				img = ImageIO.read(new File("pic\\table.png"));
				break;
			}
			case Constants.THREE: {
				img = ImageIO.read(new File("pic\\three.png"));
				break;
			}
			case Constants.TIGER: {
				img = ImageIO.read(new File("pic\\tiger.png"));
				break;
			}
			case Constants.TOOTH: {
				img = ImageIO.read(new File("pic\\tooth.png"));
				break;
			}
			case Constants.TREE: {
				img = ImageIO.read(new File("pic\\tree.png"));
				break;
			}
			case Constants.WALNUT: {
				img = ImageIO.read(new File("pic\\walnut.png"));
				break;
			}
			case Constants.WATER: {
				img = ImageIO.read(new File("pic\\water.png"));
				break;
			}
			case Constants.SMILE: {
				img = ImageIO.read(new File("pic\\smile.png"));
				break;
			}
			case Constants.SAD: {
				img = ImageIO.read(new File("pic\\sad.png"));
				break;
			}
			}
		} catch (IOException e) {
		}

	}

	public BufferedImage getImg() {
		return img;
	}

	public void setImg(BufferedImage img) {
		this.img = img;
	}

	
}
