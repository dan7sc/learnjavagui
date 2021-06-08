package teste.graphicscontrol;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GControl extends KeyAdapter {
  private int x;
  private int y;
  private GScreen screen;

  public GControl() {
    this.x = 1;
    this.y = 1;
  }

  public void connect(GScreen screen) {
    this.screen = screen;
  }

  @Override
  public void keyPressed(KeyEvent e) {
    if(e.getKeyCode() == KeyEvent.VK_UP){
      System.out.println("up");
      y -= 1;
      // screen.moveImage(x, y);
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      System.out.println("right");
      x += 1;
      // screen.moveImage(x, y);
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      System.out.println("left");
      x -= 1;
      // screen.moveImage(x, y);
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      System.out.println("down");
      y += 1;
      // screen.moveImage(x, y);
    }

    if(x > 0 && x < 11 && y > 0 && y < 11) {
      screen.moveImage(x, y);
    } else {
      if(x <= 0) {
        x++;
      } else if (x > 10) {
        x--;
      } else if (y <= 0) {
        y++;
      } else if (y > 10) {
        y--;
      }
    }
  }
}
