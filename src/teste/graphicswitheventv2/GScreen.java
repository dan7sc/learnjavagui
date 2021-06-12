package teste.graphicswitheventv2;

import java.awt.Graphics;

import javax.swing.JComponent;

import java.util.Random;

public class GScreen extends JComponent implements CronometerListener  {
  private static final long serialVersionUID = 1568686912786473218L;
  private String arquivoImagem;
  private String arquivoImagem2;
  private GImage img;
  private GImage[] imgArray;

  public GScreen(String dir) {
    arquivoImagem = dir + "dinov2.png";
    arquivoImagem2 = dir + "peixe.png";
    img = new GImage(arquivoImagem, 1, 1);
    imgArray = new GImage[11];
    for(int i = 0; i < 10; i++) {
      imgArray[i] = new GImage(arquivoImagem2, i + 1, 0);
    }
    new Cronometer(this, 800);
  }

  public void paint(Graphics g) {
    makeGridWithImage(g);
  }

  public void makeGridWithImage(Graphics g) {
    makeGrid(g);
    makeImage(g);
  }

  private void makeGrid(Graphics g) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        g.drawRect(50 + i * 50, 50 + j * 50, 50, 50);
      }
    }
  }

  private void makeImage(Graphics g) {
    g.drawImage(img.getImage(), img.getX() * 50, img.getY() * 50, this);
    for (int i = 0; i < 10; i++) {
      g.drawImage(imgArray[i].getImage(), imgArray[i].getX() * 50, imgArray[i].getY() * 50, this);
    }
  }

  public void moveImage(GImage img, int x, int y) {
    img.setX(x);
    img.setY(y);
    repaint();
  }

  public void moveImageInAColumn(GImage img) {
    if (img.getY() > 9) {
      img.setY(-1);
      img.setActive(false);
    }
    moveImage(img, img.getX(), img.getY() + 1);
  }

  public void selectRandomImage() {
    int select = getRandomNumber(0, 1);
    int index = getRandomNumber(0, 9);

    System.out.println("" + index + " s: " + select);
    if (select == 1) {
      if (imgArray[index].isActive() == false) {
        imgArray[index].setActive(true);
      }
    }
  }

  public int getRandomNumber(int min, int max) {
    return (int)Math.floor(Math.random() * (max - min + 1) + min);
  }

  public void clock() {
    System.out.println("clock");

    selectRandomImage();
    for(int i = 0; i < 10; i++) {
      if(imgArray[i].isActive()) {
        moveImageInAColumn(imgArray[i]);
      }
    }
    repaint();
  }
}
