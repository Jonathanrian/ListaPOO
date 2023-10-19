package ExemploArrayListe;
import java.util.ArrayList;
import java.util.Collections;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();

        cores.add("Vermelho");
        cores.add("Preto");
        cores.add("Verde");

        System.out.println("Lista inicial = " + cores);
        Collections.sort(cores);

        System.out.println("Lista ordenada = " + cores);

        
        

    }


    public static void estahNaColecao(String alvo, ArrayList<String> arrayl){
        int idx;
        if (arrayl.contains(alvo)) {
            idx = Collections.binarySearch(arrayl, alvo);
            System.out.println("O alvo esta na ArrayList e estar no index " + idx);
        }

        else{
            System.out.println("O alvo nao estar na ArrayList");
        }
    }
}
