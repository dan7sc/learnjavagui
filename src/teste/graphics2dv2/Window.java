package teste.graphics2dv2;

import java.awt.Container;
import java.io.BufferedInputStream;

import javax.swing.JFrame;

// import static javax.swing.GroupLayout.Alignment.TRAILING;
// import static javax.swing.GroupLayout.Alignment.LEADING;
// import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.CENTER;

// import static javax.swing.LayoutStyle.ComponentPlacement.RELATED;

public class Window extends JFrame {
  private static final long serialVersionUID = 1568786912786472224L;
  // private Dimension d;
  // private String arquivoImagem;

  public Window(String dir) {
    super();
    setSize(800, 600);
    // setResizable(false);
    setLocation(250, 50);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    // arquivoImagem = dir + "dinov2.png";

    Container contentPane = getContentPane();

    // canvas = new Canvas();
		// canvas.setBounds(0, 0, 800, 600);
    // contentPane.add(canvas);

		// pack();
    // setResizable(false);

    Layout gl = new Layout(contentPane, dir);
    // contentPane.setLayout(gl);

    // pack();
    setVisible(true);
    System.out.println("########");
  }
}
