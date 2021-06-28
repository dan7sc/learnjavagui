package teste.graphicswithimagev2;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JComponent;

import java.io.File;

public class GScreen extends JComponent {
  JTextArea texto;
  private String arquivoImagem;
  JTextArea[][] m = new JTextArea[8][8];
  // private Graphics g;
  private Graphics gbi;
  BufferedImage bi;
  BufferedImage img;
  Image image;

  public GScreen(String dir) {
    super();
    arquivoImagem = dir + "dinov2.png";

    try {
      img = ImageIO.read(new File(arquivoImagem));
      image = img;
      bi = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
      gbi = bi.getGraphics();
      // gbi = bi.createGraphics();
      System.out.println(gbi);
    } catch (Exception e) {
      System.out.println(e);
    }

    repaint();
    // paintComponent(g);
  }

  public void paint(Graphics g) {
    System.out.println("paint");
    System.out.println(g);
    // super.paint(g);
    doGrid();
    doImage();
  }

  // private void doGrid(Graphics g) {
  private void doGrid() {
    // Graphics g = bi.getGraphics();
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        gbi.drawRect(50 + i * 50, 50 + j * 50, 50, 50);
      }
    }
  }

  // private void doImage(Graphics g) {
  private void doImage() {
    // Graphics g = bi.getGraphics();
    gbi.drawImage(image, 1 * 50, 1 * 50, this);
  }
}
