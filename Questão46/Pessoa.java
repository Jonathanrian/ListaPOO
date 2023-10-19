package Questão46;
/* 
Escreva a classe Politico que herda de uma classe Pessoa e tem um campo adicional
para representar o partido do político. Escreva também as classes Prefeito e Governador
que herdem da classe Politico e que contenham campos para representar a cidade ou
estado governado. Escreva também uma aplicação que demonstre o uso de instâncias
destas classes.
*/

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String estadoCivil;

    public Pessoa(String nome, int idade, String cpf, String estadoCivil) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }



    @Override
    public String toString() {
        return nome + ", idade = " + idade + ", cpf = " + cpf + ", estadoCivil = " + estadoCivil;
    }

}
