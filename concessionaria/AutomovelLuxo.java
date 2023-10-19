package concessionaria;

public class AutomovelLuxo extends AutomovelBasico {
    private boolean arCondicionado;
    private boolean direcaoHidraulica;


    public AutomovelLuxo(int ano, String modelo, String cor, boolean airbag, boolean radio, boolean arCondicionado,
        boolean direcaoHidraulica) {
        super(ano, modelo, cor, airbag, radio);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public double quantoCusta(){
        double custo = super.quantoCusta();

        if (arCondicionado) {
            custo += 3438.34;
        }

        if (direcaoHidraulica) {
            custo += 5690.22;
        }

        return custo;
    }

    @Override
    public String toString() {
        String res = "";
        res += "ano = " + super.getAno();
        res += ", modelo = " + super.getModelo();
        res += ", cor = " + super.getCor();
        res += ", airbag = " + (airbag? "sim":"não");
        res += ", radio = " + (radio?"sim": "não");
        res += ", arCordicionado = " + (arCondicionado? "sim": "não");
        res += ", direcaoHidraulica = " + (direcaoHidraulica? "sim":"não");
        res += ", custo = " + quantoCusta();
        
        return res;
    }

}
