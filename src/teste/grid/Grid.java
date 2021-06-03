package teste.grid;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Grid extends JFrame {
  private static final long serialVersionUID = 1568786912786472224L;
  private JTextArea texto;
  private Dimension d;

  public Grid(String arquivoImagem) {
    super();
    setSize(700, 600);
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(8, 8));

    for (int i = 1; i < 65; i++) {
      // texto = new JTextArea();
      // texto.append(i + "");
      ImageIcon imagem = new ImageIcon(arquivoImagem);
      JLabel campoImagem = new JLabel(imagem);
      contentPane.add(campoImagem);
    }

    setVisible(true);
  }
}
