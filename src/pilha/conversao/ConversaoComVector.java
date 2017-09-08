package pilha.conversao;

import java.util.Vector;

/**
 * Created by Imildo Sitoe on 08-Sep-17.
 */
public class ConversaoComVector {

    private static Vector conversao(int n, Vector vector) {
        if (n == 0) {
            return vector;
        } else {
            vector.insertElementAt(n % 2, vector.size());
            return conversao(n / 2, vector);
        }
    }

    public static void main(String[] args) {
        String a = "";
        for (Object o : conversao(14, new Vector())) {
            a += o.toString();
        }
        System.out.println(new StringBuilder(a).reverse());
    }
}
