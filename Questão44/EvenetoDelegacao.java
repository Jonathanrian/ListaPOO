package Questão44;

public class EvenetoDelegacao{
    
    private DataHora data;
    private String evento;

    public EvenetoDelegacao(DataHora data, String evento) {
        this.data = data;
        this.evento = evento;
    }

    public DataHora getData() {
        return data;
    }

    public String getEvento() {
        return evento;
    }

    public void setData(DataHora data) {
        this.data = data;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return data + evento + "";
    }

    
}
