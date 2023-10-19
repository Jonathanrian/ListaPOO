package Questão46;

public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Jonathan", 21, "123456789", "Solteiro");
        Politico politico = new Politico(pessoa, "22");
        Prefeito prefeito = new Prefeito(pessoa, "22", "Ereré");
        Governador governador = new Governador(pessoa, "22", "Ceará");

        System.out.println(pessoa);
        System.out.println(politico);
        System.out.println(prefeito);
        System.out.println(governador);
    }
}
