package teste.graphicscontrol;

import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Image;

import javax.swing.JComponent;

public class GScreen extends JComponent {
  private String arquivoImagem;
  Graphics g;
  public int x;
  public int y;

  public GScreen(String dir) {
    // super();
    arquivoImagem = dir + "dinov2.png";
    x = 1;
    y = 1;
  }

  public void paint(Graphics g) {
    // super.paint(g);
    makeGridWithImage(g);
  }

  public void makeGridWithImage(Graphics g) {
    makeGrid(g);
    makeImage(g, x, y);
  }

  private void makeGrid(Graphics g) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        g.drawRect(50 + i * 50, 50 + j * 50, 50, 50);
      }
    }
  }

  private void makeImage(Graphics g, int x, int y) {
    Image img = Toolkit.getDefaultToolkit().getImage(arquivoImagem);
    g.drawImage(img, x * 50, y * 50, this);
  }

  public void moveImage(int x, int y) {
    this.x = x;
    this.y = y;
    repaint();
  }
}
