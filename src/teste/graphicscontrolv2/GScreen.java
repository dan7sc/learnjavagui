package teste.graphicscontrolv2;

import java.awt.Graphics;

import javax.swing.JComponent;

public class GScreen extends JComponent {
  private static final long serialVersionUID = 1568686912786473218L;
  private String arquivoImagem;
  private GImage img;

  public GScreen(String dir) {
    arquivoImagem = dir + "dinov2.png";
    img = new GImage(arquivoImagem, 1, 1);
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
  }

  public void moveImage(int x, int y) {
    img.setX(x);
    img.setY(y);
    repaint();
  }
}
