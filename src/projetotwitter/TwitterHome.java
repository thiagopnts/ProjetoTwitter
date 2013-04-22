
package projetotwitter;

import twitter4j.*;

/**
 * Classe usada para instanciar a classe abstrata, herda os métodos da classe
 * TwitterF.
 * @author thiago
 */
public class TwitterHome extends TwitterF{
    /**
     * Contrutor da classe.
     * @param twitter
     */
    public TwitterHome(Twitter twitter){
        super(twitter);
    }
}

