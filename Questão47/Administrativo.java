package Questão47;

public class Administrativo  extends Assistente{
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, String matricula, String turno, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public double ganhoAnual(){
        if (turno.equals("noite")) {
            return (getSalario() + adicionalNoturno * 12 + getSalario());
        }
        else{
            return getSalario() * 13;
        }
    }

    @Override
    public String toString() {
        return "Administrativo [turno=" + turno + ", adicionalNoturno=" + adicionalNoturno + "]";
    }

    
}
