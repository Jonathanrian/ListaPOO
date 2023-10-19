package Questão45;

public class Livro {
    private String nome;
    private String anoPublicacao;
    private String autor;
    private String titulo;

    public Livro(String nome, String anoPublicacao, String autor, String titulo) {
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getNome() {
        return nome;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro = "+ nome + ", anoPublicacao = " + anoPublicacao + ", autor = " + autor + ", titulo = " + titulo;
    }
    
}
