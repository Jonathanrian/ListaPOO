package Questão44;

public class DataHora {
    private String data;
    private double hora;

    public DataHora(String data, double hora) {
        this.data = data;
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public double getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return "data=" + data + ", hora=" + hora;
    }

    
    
}
