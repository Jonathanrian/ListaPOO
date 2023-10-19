package Tabuleiro;

public class JogoDamas {
    private char[][] taboleiro;
    public static int NLIN = 8;
    public static int NCOL = 8;

    JogoDamas(){
        taboleiro = new char[NLIN][NCOL];
        for(int i = 0; i < taboleiro.length; i++){
            for(int j = 0; j < taboleiro.length; i++){
                taboleiro[i][j] = '.';
            }
        }
    }

    public String toString(){
        String rep = "";

        for(int i = 0; i < taboleiro.length; i++){
            for(int j = 0; j < taboleiro.length; i++){
                rep += taboleiro[i][j] + "  ";
            }

            rep +="\n";
        }

        return rep;
    }


}
