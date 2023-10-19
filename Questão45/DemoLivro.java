package Questão45;

public class DemoLivro {
    public static void main(String[] args) {
        Livro liv = new Livro("Pequeno Principe", "10/08/2023", "Jonathan", "As aventuras de POo");
        System.out.println(liv);

        LivroBiblioteca livB = new LivroBiblioteca(liv, "Ufersa");
        System.out.println(livB);

        LivroLivraria livV = new LivroLivraria(liv, "fulano", "Pau dos ferros");
        System.out.println(livV);
    }
}
