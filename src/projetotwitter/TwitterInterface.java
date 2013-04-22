    package projetotwitter;

import javax.swing.DefaultListModel;
import twitter4j.TwitterException;
/**
 * Interface com os métodos que se comunicam com a API.
 * @author thiago
 */
public interface TwitterInterface {

    public DefaultListModel getMensagensDiretas() throws TwitterException;

    public DefaultListModel getMensagensEnviadas() throws TwitterException;

    public DefaultListModel getUserMentions() throws TwitterException;

    public DefaultListModel search(String conteudoDaBusca) throws TwitterException;

    public DefaultListModel updateTimePanel() throws TwitterException;

    public DefaultListModel updateTrendTopics() throws TwitterException;    
}
