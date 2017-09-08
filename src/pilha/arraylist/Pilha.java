package pilha.arraylist;

import java.util.ArrayList;

/**
 * Created by Imildo Sitoe on 08-Sep-17.
 */
public class Pilha<T> implements InterfacePilha {
    ArrayList arrayList = new ArrayList(10);

    @Override
    public boolean inserir(Object object) {
        arrayList.add(object);
        return true;
    }

    @Override
    public Object removerTopo() throws NullPointerException {
        if (!estaVazio()) {
            Object obj = arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            return obj;
        } else {
            throw new NullPointerException("Posicao inexistente");
        }
    }

    @Override
    public Object verificarTopo() throws NullPointerException {
        if (estaVazio()) {
            throw new NullPointerException("Posicao inexistente");
        } else {
            return arrayList.get(arrayList.size() - 1);
        }
    }

    @Override
    public boolean estaVazio() {
        return arrayList.size() < 0;
    }

    @Override
    public int pesquisar(Object object) throws NullPointerException {
        if (estaVazio()) {
            throw new NullPointerException("Posicao inexistente");
        } else if (arrayList.contains(object)) {
            return arrayList.indexOf(object) + 1;
        } else {
            return -1;
        }
    }

    @Override
    public int tamanho() {
        return arrayList.size();
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "arrayList=" + arrayList +
                '}';
    }
}
