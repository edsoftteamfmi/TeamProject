package com.ereader.utils;

import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class ImageUtils {

	public static BufferedImage resize(BufferedImage image, int width,
			int height) {
		BufferedImage bi = new BufferedImage(width, height,
				BufferedImage.TRANSLUCENT);
		Graphics2D g2d = (Graphics2D) bi.createGraphics();
		g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_QUALITY));
		g2d.drawImage(image, 0, 0, width, height, null);
		g2d.dispose();
		return bi;
	}

	public static ImageIcon createIcon(int num, int width, int height) {
		BufferedImage bufferedImage = new LoadImage(num).getImg();
		BufferedImage resizedBufferedImage = resize(bufferedImage, width,
				height);
		ImageIcon icon = new ImageIcon(resizedBufferedImage);
		return icon;
	}
	
	public static JLabel createBackground() {
		BufferedImage backgroundBufferedImage = new LoadImage(1).getImg();
		ImageIcon backgroundImage = new ImageIcon(backgroundBufferedImage);
		JLabel background = new JLabel(backgroundImage);
		background.setLayout(new GridBagLayout());
		return background;
	}
}
