package teste.groupv3;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import static javax.swing.GroupLayout.Alignment.LEADING;
import static javax.swing.LayoutStyle.ComponentPlacement.RELATED;

public class Group extends JFrame {
  private static final long serialVersionUID = 1568786912786472224L;
  private JTextArea texto;
  private Dimension d;

  public Group(String arquivoImagem) {
    super();
    setSize(700, 600);
    // setResizable(false);
    setLocation(250, 50);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    Container contentPane = getContentPane();
    GroupLayout gl = new GroupLayout(contentPane);
    contentPane.setLayout(gl);

    JLabel lb1 = new JLabel("label 1");
    // JLabel lb2 = new JLabel("label 2");
    // JLabel lb3 = new JLabel("label 3");
    // JLabel lb4 = new JLabel("label 4");
    JLabel lb5 = new JLabel("label 5");
    // JLabel lb6 = new JLabel("label 6");
    // JLabel lb7 = new JLabel("label 7");
    // JLabel lb8 = new JLabel("label 8");
    JLabel lb9 = new JLabel("label 9");

    // Make columns
    GroupLayout.SequentialGroup hg = gl.createSequentialGroup();
    hg.addGroup(gl.createParallelGroup().addComponent(lb1));
    hg.addGroup(gl.createParallelGroup().addComponent(lb5));
    hg.addGroup(gl.createParallelGroup().addComponent(lb9));
    gl.setHorizontalGroup(hg);

    // Make lines
    GroupLayout.SequentialGroup vg = gl.createSequentialGroup();
    vg.addGroup(gl.createParallelGroup().addComponent(lb1));
    vg.addGroup(gl.createParallelGroup().addComponent(lb5));
    vg.addGroup(gl.createParallelGroup().addComponent(lb9));
    gl.setVerticalGroup(vg);

    gl.setAutoCreateGaps(true);
    gl.setAutoCreateContainerGaps(true);

    // pack();
    setVisible(true);
  }
}
