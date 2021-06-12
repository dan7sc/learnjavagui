package teste.graphicswithevent;

import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import java.io.File;

public class GImage extends BufferedImage {
  private String imagePath;
  private int x;
  private int y;
  private Image image;

  public GImage(String imagePath, int x, int y) {
    super(50, 50, BufferedImage.TYPE_INT_ARGB);
    this.imagePath = imagePath;
    this.x = x;
    this.y = y;
    createImage();
  }

  private void createImage() {
    try {
      image = ImageIO.read(new File(imagePath));
    } catch(Exception e) {
      System.out.println(e);
    }
  }

  public Image getImage() {
    return this.image;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }
}
