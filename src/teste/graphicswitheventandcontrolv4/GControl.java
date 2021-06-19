package teste.graphicswitheventandcontrolv4;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GControl extends KeyAdapter {
  private int x;
  private int y;
  private GScreen screen;

  public GControl() {
    this.x = 7;
    this.y = 7;
  }

  public void connect(GScreen screen) {
    this.screen = screen;
  }

  public void keyPressed(KeyEvent e) {
    if(e.getKeyCode() == KeyEvent.VK_W){
      System.out.println("up");
      y -= 1;
    } else if(e.getKeyCode() == KeyEvent.VK_D) {
      System.out.println("right");
      x += 1;
    } else if(e.getKeyCode() == KeyEvent.VK_A) {
      System.out.println("left");
      x -= 1;
    } else if(e.getKeyCode() == KeyEvent.VK_S) {
      System.out.println("down");
      y += 1;
    }

    if(x > 0 && x < 11 && y > 0 && y < 11) {
      screen.moveImage(screen.getImageToMove(), x, y);
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
