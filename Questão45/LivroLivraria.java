package Questão45;

public class LivroLivraria{

    private Livro livro;
    private String nomeLivraria;
    private String ederecoLivraria;

    public LivroLivraria(Livro livro, String nomeLivraria, String ederecoLivraria) {
        this.livro = livro;
        this.nomeLivraria = nomeLivraria;
        this.ederecoLivraria = ederecoLivraria;
    }

    @Override
    public String toString() {
        return "LivroLivraria = " + livro + ", nomeLivraria = " + nomeLivraria + ", ederecoLivraria = "
        + ederecoLivraria;
    }


    
}
