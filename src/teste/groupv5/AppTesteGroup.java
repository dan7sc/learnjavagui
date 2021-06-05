package teste.groupv5;

public class AppTesteGroup {
  public static String DIRETORIO =
    AppTesteGroup.class.getResource(".").getPath();

  public static void main(String[] args) {
    new Group(DIRETORIO + "dinov2.png");
    // new Group(DIRETORIO + "peixe.gif");
  }
}
