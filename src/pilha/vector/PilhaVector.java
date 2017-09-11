package pilha.vector;

import pilha.arraylist.InterfacePilha;

import java.util.Vector;

/**
 * Created by Imildo Sitoe on 08-Sep-17.
 */
public class PilhaVector<E> implements InterfacePilha {
    Vector vector = new Vector();

    @Override
    public boolean inserir(Object object) {
        vector.add(object);
        return true;
    }



    @Override
    public E removerTopo(){
        if(estaVazio()) {
            throw new NullPointerException("Posicao inexistente");
        }else{
            return (E) vector.remove(vector.size() - 1);
        }
    }

    @Override
    public E verificarTopo() {
        if(estaVazio()) {
            throw new NullPointerException("Posicao inexistente");
        }else{
            return (E)vector.elementAt(vector.size() - 1);
        }
    }

    @Override
    public boolean estaVazio() {
        return vector.size() < 0;
    }

    @Override
    public int pesquisar(Object object) {
        if(estaVazio()) {
            throw new NullPointerException("Posicao inexistente");
        }else if(vector.contains(object)) {
            return vector.indexOf(object);
        }else{
            return -1;
        }
    }

    @Override
    public int tamanho() {
        return vector.size();
    }

    @Override
    public String toString() {
        return "PilhaVector{" +
                "vector=" + vector +
                '}';
    }
}
