package teste.graphicswitheventandcontrolv4;

import java.awt.Graphics;

import javax.swing.JComponent;

public class GScreen extends JComponent implements CronometerListener  {
  private static final long serialVersionUID = 1568686912786473218L;
  private String arquivoImagem;
  private String arquivoImagem2;
  private String arquivoImagem3;
  private String arquivoImagem4;
  private GImage controledImg;
  private GImage randomImg;
  private GImage[] upImgArray;
  private GImage[] downImgArray;

  public GScreen(String dir) {
    arquivoImagem = dir + "dinov2.png";
    arquivoImagem2 = dir + "peixe.png";
    arquivoImagem3 = dir + "peixe2.png";
    arquivoImagem4 = dir + "peixe4.png";
    controledImg = new GImage(arquivoImagem, 7, 7);
    randomImg = new GImage(arquivoImagem4, 4, 5);
    upImgArray = new GImage[11];
    downImgArray = new GImage[11];
    for(int i = 0; i < 10; i++) {
      upImgArray[i] = new GImage(arquivoImagem2, i + 1, 0);
      downImgArray[i] = new GImage(arquivoImagem3, i + 1, 11);
    }
    new Cronometer(this, 500);
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);
    makeGrid(g);
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    makeUpAndDownImages(g);
    makeRandomImage(g);
    g.drawImage(randomImg.getImage(), randomImg.getX() * 50, randomImg.getY() * 50, this);
    g.drawImage(controledImg.getImage(), controledImg.getX() * 50, controledImg.getY() * 50, this);
  }

  private void makeGrid(Graphics g) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        g.drawRect(50 + i * 50, 50 + j * 50, 50, 50);
      }
    }
  }

  private void makeUpAndDownImages(Graphics g) {
    for (int i = 0; i < 10; i++) {
      g.drawImage(upImgArray[i].getImage(), upImgArray[i].getX() * 50, upImgArray[i].getY() * 50, this);
      g.drawImage(downImgArray[i].getImage(), downImgArray[i].getX() * 50, downImgArray[i].getY() * 50, this);
    }
  }

  private void makeRandomImage(Graphics g) {
  }

  public GImage getImageToMove() {
    return controledImg;
  }

  public void moveImage(GImage img, int x, int y) {
    img.setX(x);
    img.setY(y);
    repaint();
  }

  public void moveRandomImage(GImage img) {
    int randomX = img.getX() + getRandomNumber(-1, 1);
    int randomY = img.getY() + getRandomNumber(-1, 1);

    if(randomX > 0 && randomX < 11) {
      img.setX(randomX);
    }
    if(randomY > 0 && randomY < 11) {
      img.setY(randomY);
    }

    repaint();
  }

  public void moveDownImageInAColumn(GImage img) {
    if (img.getY() > 9) {
      img.setY(-1);
      img.setActive(false);
    }
    moveImage(img, img.getX(), img.getY() + 1);
  }

  public void moveUpImageInAColumn(GImage img) {
    if (img.getY() < 2) {
      img.setY(12);
      img.setActive(false);
    }
    moveImage(img, img.getX(), img.getY() - 1);
  }

  public void selectRandomImage(GImage[] imgArray) {
    int select = getRandomNumber(0, 1);
    int index = getRandomNumber(0, 9);

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
    // System.out.println("clock");
    selectRandomImage(upImgArray);
    selectRandomImage(downImgArray);
    for(int i = 0; i < 10; i++) {
      if(upImgArray[i].isActive()) {
        moveDownImageInAColumn(upImgArray[i]);
      }
      if (downImgArray[i].isActive()) {
        moveUpImageInAColumn(downImgArray[i]);
      }
    }
    moveRandomImage(randomImg);
    repaint();
  }
}
