package pilha.arraylist;

/**
 * Created by Imildo Sitoe on 08-Sep-17.
 */
public class TestePilha {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha();

        pilha.inserir("Imildo");
        pilha.inserir("Poison");
        pilha.inserir("Sitoe");

        System.out.println(pilha.removerTopo());
        System.out.println(pilha.estaVazio());
        System.out.println(pilha.verificarTopo());
        System.out.println(pilha.pesquisar("Poison"));
    }
}
