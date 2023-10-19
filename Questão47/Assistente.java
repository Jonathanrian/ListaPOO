package Questão47;
/*Crie também a classe Assistente, que também é um funcionário e que possui um
número de matrícula (e seus métodos de acesso), além de um método toString. */
public class Assistente extends Funcionario{
    private String matricula;

    public Assistente(String nome, double salario, String matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "matricula = " + matricula;
    }

}
