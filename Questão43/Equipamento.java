package Questão43;

public class Equipamento {
    private String mouse;
    private String teclado;

    public Equipamento(String mouse, String teclado) {
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public String getMouse() {
        return mouse;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "mouse=" + mouse + ", teclado=" + teclado;
    }
    
}
