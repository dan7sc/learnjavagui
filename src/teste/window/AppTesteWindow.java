package teste.window;

public class AppTesteWindow {
  public static String DIRETORIO =
    AppTesteWindow.class.getResource(".").getPath();

  public static void main(String[] args) {
    new Window(DIRETORIO + "dinov2.png");
    // new Window(DIRETORIO + "peixe.png");
  }
}
