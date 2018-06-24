
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Carlos Henrique Ponciano da Silva && Vinicius Luis da Silva
 */
public class ContadorMap extends Corretor implements IContador {

    @Override
    public String contar(String frase) {
        System.out.println("Contador Map");
        return contar(removerPontuacao(frase).split(" "));
    }

    private String contar(String[] palavras) {
        SortedMap<String, Integer> mapa = new TreeMap<String, Integer>();
        for (String p : palavras) {
            if (mapa.containsKey(p)) {
                mapa.replace(p, mapa.get(p) + 1);
            } else {
                mapa.put(p, 1);
            }
        }

        String saida = "[";
        for (Map.Entry<String, Integer> palavra : mapa.entrySet()) {
            saida += palavra.getKey() + "-" + palavra.getValue() + "; ";
        }

        return saida.substring(0, saida.length() - 2) + "]";
    }
}
