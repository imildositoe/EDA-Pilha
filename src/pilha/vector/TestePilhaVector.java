package pilha.vector;

import java.util.Vector;

/**
 * Created by Imildo Sitoe on 08-Sep-17.
 */
public class TestePilhaVector {
    public static void main(String[] args) {
        PilhaVector pilha = new PilhaVector<>();

        pilha.inserir("Imildo");
        pilha.inserir("Poison");
        pilha.inserir("Sitoe");

        System.out.println(pilha.removerTopo());
        System.out.println(pilha.estaVazio());
        System.out.println(pilha.verificarTopo());
        System.out.println(pilha.pesquisar("Poison"));
    }
}
