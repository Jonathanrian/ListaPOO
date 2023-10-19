package Questão47;

public class Tecnicos extends Assistente {
    private double bonusSalarial = 70;

    

    public Tecnicos(String nome, double salario, String matricula, double bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    public double ganhoAnual(double salarioano){
        return (getSalario() + bonusSalarial ) * 13;
    }

    @Override
    public String toString() {
        return "bonusSalarial = " + bonusSalarial;
    }

    
}
