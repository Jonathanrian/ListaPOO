package concessionaria;

public class DemoAutomovel {
    public static void main(String[] args) {
        AutomovelLuxo auto = new AutomovelLuxo(1999, "Hilux", "Branca", true, true, true, true);

        System.out.println("Custo " + auto.quantoCusta());
        System.out.println(auto);
    }
}
