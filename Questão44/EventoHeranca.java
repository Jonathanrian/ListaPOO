package Questão44;

public class EventoHeranca extends DataHora {

    private String evento;

    public EventoHeranca(String data, double hora, String evento) {
        super(data, hora);
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "evento=" + evento + "";
    }

       
    
}