package pilha.arraylist;

/**
 * Created by Imildo Sitoe on 07-Sep-17.
 */
public interface InterfacePilha {

    public boolean inserir(Object object);
    public Object removerTopo();
    public Object verificarTopo();
    public boolean estaVazio();
    public int pesquisar(Object object);
    public int tamanho();


}
