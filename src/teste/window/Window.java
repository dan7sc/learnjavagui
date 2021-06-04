package teste.window;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Window extends JFrame {
  private static final long serialVersionUID = 1568786912786472224L;
  private JTextArea texto;
  private JLabel label;
  private JButton button;
  private Dimension d;
  private JPanel mainPanel;
  private JPanel gridPanel;
  private JPanel buttonPanel;

  public Window(String arquivoImagem) {
    super();
    setSize(700, 600);
    // setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    Container mainPanel = getContentPane();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));

    JPanel leftPanel = new JPanel();
    JPanel rightPanel = new JPanel();
    rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

    gridPanel = new JPanel();
    gridPanel.setLayout(new GridLayout(8, 8));
    gridPanel.setSize(100, 100);
    gridPanel.setMaximumSize(new Dimension(100, 100));

    for (int i = 1; i < 65; i++) {
      ImageIcon imagem = new ImageIcon(arquivoImagem);
      JLabel campoImagem = new JLabel(imagem);
      // campoImagem.setMinimumSize(new Dimension(20, 20));
      campoImagem.setMaximumSize(new Dimension(20, 20));
      gridPanel.add(campoImagem);
    }
    // gridPanel.setMinimumSize(new Dimension(300, 400));

    leftPanel.add(gridPanel);

    button = new JButton("click here");
    label = new JLabel("label for testing");
    rightPanel.add(button);
    rightPanel.add(label);
    button = new JButton("click here again");
    label = new JLabel("label for testing again");
    texto = new JTextArea();
    texto.append("text for testing\n");
    rightPanel.add(button);
    rightPanel.add(label);
    rightPanel.add(texto);

    mainPanel.add(leftPanel);
    mainPanel.add(rightPanel);

    pack();
    setVisible(true);
  }
}
