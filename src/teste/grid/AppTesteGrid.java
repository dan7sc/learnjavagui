package teste.grid;

public class AppTesteGrid {
  public static String DIRETORIO =
    AppTesteGrid.class.getResource(".").getPath();

  public static void main(String[] args) {
    // new Grid(DIRETORIO + "dino.png");
    new Grid(DIRETORIO + "peixe.gif");
  }
}
