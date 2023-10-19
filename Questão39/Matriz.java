package Questão39;

public class Matriz {
    private float matriz[][] = new float[2][2];

    public Matriz(float[][] matriz){
        this.matriz = matriz;
    }

    public float determinantes(){
        return (matriz[0][0] * matriz[1][1]) - (matriz[1][0] * matriz[0][1]);
    }

    public void imprimir(){
        String str = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                str += (matriz[i][j] + " ");
            }

            str += "\n";
        }

        System.out.println(str);
    }
}
