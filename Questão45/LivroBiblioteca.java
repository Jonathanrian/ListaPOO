package Questão45;

public class LivroBiblioteca {
    private Livro livro;
    private String enderecoBiblioteca;

    public LivroBiblioteca(Livro livro, String enderecoBiblioteca) {
        this.livro = livro;
        this.enderecoBiblioteca = enderecoBiblioteca;
    }

    @Override
    public String toString() {
        return "LivroBiblioteca = " + livro + ", enderecoBiblioteca = " + enderecoBiblioteca;
    }

    
}
