package teste.graphicswithimagev2;

public class AppTestGraphic {
  public static String DIRETORIO =
    AppTestGraphic.class.getResource(".").getPath();

  public static void main(String[] args) {
    new Window(DIRETORIO);
    // new Group(DIRETORIO + "peixe.gif");
  }
}
