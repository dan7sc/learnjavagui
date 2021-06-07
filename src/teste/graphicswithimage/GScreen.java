package teste.graphicswithimage;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JComponent;

public class GScreen extends JComponent {
  // JLabel texto;
  JTextArea texto;
  // private Dimension d;
  private String arquivoImagem;
  // JLabel[][] m = new JLabel[8][8];
  JTextArea[][] m = new JTextArea[8][8];
  private Graphics g;

  public GScreen(String dir) {
    super();
    arquivoImagem = dir + "dinov2.png";

    paintComponent(g);
  }

  public void paint(Graphics g) {
    super.paint(g);
    doGrid(g);
    doImage(g);
  }

  private void doGrid(Graphics g) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        g.drawRect(50 + i * 50, 50 + j * 50, 50, 50);
      }
    }
  }

  private void doImage(Graphics g) {
    Image img = Toolkit.getDefaultToolkit().getImage(arquivoImagem);
    g.drawImage(img, 1 * 50, 1 * 50, this);
  }
}
