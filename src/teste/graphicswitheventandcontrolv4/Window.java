package teste.graphicswitheventandcontrolv4;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// import static javax.swing.GroupLayout.Alignment.TRAILING;
// import static javax.swing.GroupLayout.Alignment.LEADING;
// import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.CENTER;

public class Window extends JFrame {
  private static final long serialVersionUID = 1568786912786472224L;
  private String dir;

  public Window(String dir) {
    super();
    setSize(800, 600);
    setResizable(false);
    setLocation(250, 60);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.dir = dir;

    makeWindow();
  }

  public void makeWindow() {
    JPanel contentPane = (JPanel) getContentPane();
    GroupLayout gl = new GroupLayout(contentPane);
    contentPane.setLayout(gl);

    // JLabel lb1 = new JLabel("label 1");
    JLabel lb2 = new JLabel("label 2");

    // JPanel jp = new JPanel();

    GScreen grid = new GScreen(dir);
    GControl ctrl = new GControl();
    ctrl.connect(grid);
    addKeyListener(ctrl);

    // Make columns
    GroupLayout.SequentialGroup hg = gl.createSequentialGroup();
    // hg.addGap(10);

    GroupLayout.ParallelGroup pg = gl.createParallelGroup(CENTER);
    pg.addGap(150);
    pg.addComponent(grid);
    hg.addGroup(pg);

    pg = gl.createParallelGroup(CENTER);
    pg.addGap(150);
    pg.addComponent(lb2);
    hg.addGroup(pg);

    gl.setHorizontalGroup(hg);

    // Make lines
    GroupLayout.SequentialGroup vg = gl.createSequentialGroup();
    // vg.addGap(10);

    pg = gl.createParallelGroup(CENTER);
    pg.addGap(100);
    pg.addComponent(grid).addComponent(lb2);
    vg.addGroup(pg);

    gl.setVerticalGroup(vg);

    // gl.setAutoCreateGaps(true);
    // gl.setAutoCreateContainerGaps(true);

    // pack();
    setVisible(true);
  }
}
