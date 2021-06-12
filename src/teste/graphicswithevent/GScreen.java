package teste.graphicswithevent;

import java.awt.Graphics;

import javax.swing.JComponent;

public class GScreen extends JComponent implements CronometerListener  {
  private static final long serialVersionUID = 1568686912786473218L;
  private String arquivoImagem;
  private String arquivoImagem2;
  private GImage img;
  private GImage img2;

  public GScreen(String dir) {
    arquivoImagem = dir + "dinov2.png";
    arquivoImagem2 = dir + "peixe.png";
    img = new GImage(arquivoImagem, 1, 1);
    img2 = new GImage(arquivoImagem2, 10, 1);
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
    g.drawImage(img2.getImage(), img2.getX() * 50, img2.getY() * 50, this);
  }

  public void moveImage(int x, int y) {
    img.setX(x);
    img.setY(y);
    repaint();
  }

  public void clock() {
    System.out.println("clock");
    if(img2.getY() > 9) {
      img2.setY(0);
    }
    img2.setY(img2.getY() + 1);
    repaint();
  }
}
