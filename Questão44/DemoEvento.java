package Questão44;

public class DemoEvento {
    public static void main(String[] args) {
        DataHora dh = new DataHora("10/dez/2012", 1345);
        System.out.println(dh);

        EvenetoDelegacao evd = new EvenetoDelegacao(dh, " Recebendo informações: ");
        System.out.println(evd);


    }
}
