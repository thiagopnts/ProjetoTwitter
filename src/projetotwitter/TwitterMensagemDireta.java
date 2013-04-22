package projetotwitter;

import twitter4j.*;

/**
 * Classe usada para instanciar a classe abstrata, herda os métodos da classe
 * TwitterF.
 * @author thiago
 */
public class TwitterMensagemDireta extends TwitterF{

    /**
     * Contrutor da classe.
     * @param twitter
     */
    public TwitterMensagemDireta(Twitter twitter){
        super(twitter);
    }
}
