package Questão43;

public class Computador extends Equipamento{
    private  String modelo;
    private String sistemaOperacional;


    public Computador(String mouse, String teclado, String modelo, String sistemaOperacional) {
        super(mouse, teclado);
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getModelo() {
        return modelo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Mouse = " + getMouse();
        res += ", teclado = " + getTeclado();
        res += ", Modelo = " + modelo;
        res += ", SistemaOperacional = " + sistemaOperacional;

        return res;
        
    }
    
}
