package pilha.arraylist;

/**
 * Created by Imildo Sitoe on 07-Sep-17.
 */
public interface InterfacePilha<E> {

    public boolean inserir(E object);
    public E removerTopo();
    public E verificarTopo();
    public boolean estaVazio();
    public int pesquisar(E object);
    public int tamanho();


}
