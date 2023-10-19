package Questão47;

public class Funcionario {
    private String nome;
    public double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
       
    }

    public double aumentoSalario(double aumento){
        salario += aumento;
        return salario;
    }

    public double ganhoAnual(){
        return salario * 13;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + " Salario = " +  salario;
    }
    
}
