package teste.graphicswitheventandcontrolv5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Cronometer implements ActionListener {
  CronometerListener notified;
  Timer timer;

  public Cronometer(CronometerListener notified, int step) {
    this.notified = notified;
    timer = new Timer(step, this);
    start();
  }

  public void start() {
    timer.start();
  }

  public void stop() {
    timer.stop();
  }

  public void actionPerformed(ActionEvent evt) {
    notified.clock();
  }
}
