package Questão39;

public class DemoMatriz {
    public static void main(String[] args) {
        float matriz1[][] = {{5F, 3F}, {4F, 2F}};
        Matriz matriz = new Matriz(matriz1);

        float determinante = matriz.determinantes();

        System.out.printf("%.2f\n\n", determinante);

        matriz.imprimir();
    }
}
