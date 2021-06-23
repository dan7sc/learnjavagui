package teste.graphics2d;

import java.awt.Container;
import java.awt.Canvas;
import java.awt.image.BufferStrategy;
// import java.awt.Dimension;
import java.io.BufferedInputStream;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.JPanel;

// import static javax.swing.GroupLayout.Alignment.TRAILING;
// import static javax.swing.GroupLayout.Alignment.LEADING;
// import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.CENTER;

// import static javax.swing.LayoutStyle.ComponentPlacement.RELATED;

public class Window extends JFrame {
  private static final long serialVersionUID = 1568786912786472224L;
  // private Dimension d;
  // private String arquivoImagem;
  public Canvas canvas = new Canvas();
  public BufferStrategy strategy = null;

  public Window(String dir) {
    super();
    setSize(800, 600);
    // setResizable(false);
    setLocation(250, 50);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    // arquivoImagem = dir + "dinov2.png";

    Container contentPane = getContentPane();

    // canvas = new Canvas();
		// canvas.setBounds(0, 0, 800, 600);
    contentPane.add(canvas);
    canvas.setIgnoreRepaint(true);

		// pack();
    // setResizable(false);
    setVisible(true);

    canvas.requestFocus();
    System.out.println("********");
    canvas.createBufferStrategy(2);
		strategy = canvas.getBufferStrategy();
    System.out.println(canvas.getBufferStrategy());

    Layout gl = new Layout(contentPane, dir, strategy);
    // contentPane.setLayout(gl);


    // pack();
    setVisible(true);
    System.out.println("########");
  }
}
