package Questão52;

interface ItemDeBiblioteca {
    int maximoDeDiasParaEmprestimo = 14;

    boolean estaEmprestado();
    void empresta();
    void devolver();

    String localizacao();
    String descricao();
}
