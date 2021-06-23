package teste.graphics2d;

import java.awt.Container;
import java.awt.image.BufferStrategy;
// import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.JPanel;

// import static javax.swing.GroupLayout.Alignment.TRAILING;
// import static javax.swing.GroupLayout.Alignment.LEADING;
// import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.CENTER;

// import static javax.swing.LayoutStyle.ComponentPlacement.RELATED;

public class Layout {
  private static final long serialVersionUID = 1568786912786472224L;
  // private Dimension d;
  // private String arquivoImagem;

  public Layout(Container contentPane, String dir, BufferStrategy strategy) {
    // super();
    GroupLayout gl = new GroupLayout(contentPane);
    contentPane.setLayout(gl);

    // GScreen grid = new GScreen(dir);
    GCanvas grid = new GCanvas (dir, strategy);

    JLabel lb1 = new JLabel("label 1");

    // JPanel jp = new JPanel();

    // Make columns
    GroupLayout.SequentialGroup hg = gl.createSequentialGroup();
    // hg.addGap(10);

    GroupLayout.ParallelGroup pg = gl.createParallelGroup(CENTER);
    pg.addGap(150);
    pg.addComponent(grid);
    hg.addGroup(pg);

    pg = gl.createParallelGroup(CENTER);
    pg.addGap(150);
    pg.addComponent(lb1);
    hg.addGroup(pg);

    gl.setHorizontalGroup(hg);

    // Make lines
    GroupLayout.SequentialGroup vg = gl.createSequentialGroup();
    // vg.addGap(10);

    pg = gl.createParallelGroup(CENTER);
    pg.addGap(80);
    pg.addComponent(grid).addComponent(lb1);
    vg.addGroup(pg);

    gl.setVerticalGroup(vg);

    // grid.initialize();
    // grid.showScreen();

    // gl.setAutoCreateGaps(true);
    // gl.setAutoCreateContainerGaps(true);

    // pack();
  }
}
