
/**
 *
 * @author Carlos Henrique Ponciano da Silva && Vinicius Luis da Silva
 */
public abstract class Corretor {
    public String removerPontuacao(String frase) {
        frase = frase.replace( "." , ""); 
        frase = frase.replace( "/" , ""); 
        frase = frase.replace( "-" , ""); 
        frase = frase.replace( "." , ""); 
        frase = frase.replace( "," , ""); 
        frase = frase.replace( ";" , ""); 
        frase = frase.replace( "!" , ""); 
        frase = frase.replace( "?" , ""); 
        frase = frase.toLowerCase();
        
        return frase;
    }
}
