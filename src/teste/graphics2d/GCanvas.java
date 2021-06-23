package teste.graphics2d;

import java.awt.Container;
import java.awt.image.BufferStrategy;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.BufferStrategy;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.GraphicsConfiguration;
import java.awt.Toolkit;
import java.awt.Transparency;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JComponent;

import java.io.File;

public class GCanvas extends JComponent {
  private BufferStrategy bs;
  JTextArea texto;
  private String arquivoImagem;
  JTextArea[][] m = new JTextArea[8][8];
  private Graphics g;
  private Graphics gbi;
  BufferedImage bi = null;
  Image image = null;

  public GCanvas(String dir, BufferStrategy strategy) {
    bs = strategy;
    arquivoImagem = dir + "dinov2.png";
    try {
      bi = ImageIO.read(new File(arquivoImagem));
      image = bi;
      // gbi = bi.getGraphics();
      gbi = bi.createGraphics();
      System.out.println(bi.getGraphics());
    } catch(Exception e) {
      System.out.println(e);
    }

    showScreen();
  }

  public void initialize() {
    System.out.println("********");
    showScreen();
  }

  public void showScreen() {
    System.out.println("@@@@@@@@");
    while(true) {
			Graphics2D g2 = (Graphics2D) bs.getDrawGraphics();
			// Graphics g2 = bi.getGraphics();
      // Graphics g2 = bi.createGraphics();
      // Graphics g2 = gbi;
			// Graphics g2 = bs.getDrawGraphics();
      // g2.setColor(Color.black);
      // g2.fillRect(0, 0, 800, 600);

      doDrawing(g2);

			g2.dispose();
      bs.show();
    }
  }

  public void paint(Graphics g) {
    doDrawing(g);
  }

  private void doDrawing(Graphics g) {
    g.drawImage(image, 1 * 50, 1 * 50, this);
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        g.drawRect(50 + i * 50, 50 + j * 50, 50, 50);
      }
    }
  }
}
