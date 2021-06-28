package teste.graphics2dv2;

import java.awt.Container;
import java.awt.Canvas;
import java.awt.image.BufferStrategy;
// import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// import static javax.swing.GroupLayout.Alignment.TRAILING;
// import static javax.swing.GroupLayout.Alignment.LEADING;
// import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.CENTER;

// import static javax.swing.LayoutStyle.ComponentPlacement.RELATED;

public class Layout {
  private static final long serialVersionUID = 1568786912786472224L;
  // private Dimension d;
  // private String arquivoImagem;
  public Canvas canvas = new Canvas();
  public BufferStrategy strategy = null;

  public Layout(Container contentPane, String dir) {
    // super();
    GroupLayout gl = new GroupLayout(contentPane);
    contentPane.setLayout(gl);

    Container jp = new JPanel();
    Container jp1 = new JPanel();

    jp.add(canvas);
    // contentPane.add(canvas);
    // contentPane.add(jp);
    // contentPane.add(jp1);

    canvas.setIgnoreRepaint(true);

    canvas.requestFocus();
    System.out.println("********");
    canvas.addNotify();
    canvas.createBufferStrategy(2);
    strategy = canvas.getBufferStrategy();
    System.out.println(canvas.getBufferStrategy());

    // GScreen grid = new GScreen(dir);
    GCanvas grid = new GCanvas (dir, strategy);

    JLabel lb1 = new JLabel("label 1");

    // JPanel jp = new JPanel();
    jp.add(grid);
    jp1.add(lb1);

    // Make columns
    GroupLayout.SequentialGroup hg = gl.createSequentialGroup();
    // hg.addGap(10);

    GroupLayout.ParallelGroup pg = gl.createParallelGroup(CENTER);
    pg.addGap(150);
    pg.addComponent(jp);
    hg.addGroup(pg);

    pg = gl.createParallelGroup(CENTER);
    pg.addGap(150);
    pg.addComponent(jp1);
    hg.addGroup(pg);

    gl.setHorizontalGroup(hg);

    // Make lines
    GroupLayout.SequentialGroup vg = gl.createSequentialGroup();
    // vg.addGap(10);

    pg = gl.createParallelGroup(CENTER);
    pg.addGap(80);
    pg.addComponent(jp).addComponent(jp1);
    vg.addGroup(pg);

    gl.setVerticalGroup(vg);

    // grid.initialize();
    // grid.showScreen();

    // gl.setAutoCreateGaps(true);
    // gl.setAutoCreateContainerGaps(true);

    // pack();
  }
}
