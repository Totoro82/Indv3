package aed.individual3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Utils {
  public static boolean isArithmeticSequence(Iterable<Integer> list) {
    Iterator<Integer> iterador = list.iterator();
    Integer restaAnterior = null;
    Integer anterior = null;
    boolean resultado = true;

    while (iterador.hasNext() && resultado) {
        Integer next = iterador.next();
        if (next == null)
            continue;

        if (anterior == null)
            anterior = next;
        else {
            int resta = next - anterior; // resta es la diferencia entre el next y el anterior, es decir el numero que tiene que ser igual para cada par no null de la lista

            if (restaAnterior == null)
                restaAnterior = resta;
            else if (resta != restaAnterior)
                resultado = false;

            anterior = next;
        }
    }
      return resultado;
  }
}
