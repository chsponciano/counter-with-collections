
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Carlos Henrique Ponciano da Silva && Vinicius Luis da Silva
 */
public class ContadorCollection extends Corretor implements IContador {

    @Override
    public String contar(String frase) {
        System.out.println("Contador Collection");
        return contar(removerPontuacao(frase).split(" "));
    }

    private String contar(String[] palavras) {
        List<String> lista = new ArrayList<String>(); //Cria List
        lista.addAll(Arrays.asList(palavras)); //Separa
        Collections.sort(lista); //Ordena

        String aux = "", saida = "[";
        int contador = 0;

        for (String palavra : lista) {
            if (contador == 0) {
                aux = palavra;
                contador++;
            } else if (aux.equals(palavra)) {
                contador++;
            } else {
                saida += aux + "-" + contador + "; ";
                aux = palavra;
                contador = 1;
            }
        }

        return saida + aux + "-" + contador + "]";
    }
}
