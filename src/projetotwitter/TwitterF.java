
package projetotwitter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import twitter4j.*;

/**
 * Classe abstrata que serve como base para suas classes filhas, possui
 * os principais métodos de comunicação com a API.
 * @author thiago
 */
public abstract class TwitterF implements TwitterInterface{
    
    protected Twitter twitter;

    /**
     * Contrutor da classe.
     * @param twitter
     */
    protected TwitterF(Twitter twitter){
        this.twitter = twitter;
    }
    
   /**
    * Retorna um modelo de jList preenchido com as menções
    * ao usuário logado.
    * @return
    * @throws twitter4j.TwitterException
    */
    public DefaultListModel getUserMentions() throws TwitterException{
        List<Status> mentions = this.twitter.getMentions(); 
        DefaultListModel model = new DefaultListModel();
        for(int i = 0; i < mentions.size(); i++){
            Date tweetDate = mentions.get(i).getCreatedAt();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy HH:mm");
            User user = mentions.get(i).getUser();
            model.addElement(formatter.format(tweetDate) + " - " + user.getName()
                    + " " + mentions.get(i).getText());
        }
        return model;
    }
        
    /**
     * Retorna um modelo de jList preenchido com o resultado da busca realizada.
     * @param conteudoDaBusca
     * @return
     * @throws twitter4j.TwitterException
     */
    public DefaultListModel search(String conteudoDaBusca) throws TwitterException{
        DefaultListModel model;
        QueryResult q = this.twitter.search(new Query(conteudoDaBusca));
        List<Tweet>tweets = q.getTweets();
        model = new DefaultListModel();
        for(int i = 0; i < tweets.size(); i++){
            model.addElement(tweets.get(i).getFromUser() + " - " + tweets.get(i).getText());
        }
        return model;
    }

    /**
     * Retorna um modelo de jList preenchido com os tweets da home do usuário logado.
     * @return
     * @throws twitter4j.TwitterException
     */
    public DefaultListModel updateTimePanel() throws TwitterException {
          List<Status> statusList = this.twitter.getHomeTimeline(); 
          DefaultListModel model = new DefaultListModel();
          for (int i = 0; i < statusList.size(); i++) {
              Date tweetDate = statusList.get(i).getCreatedAt();
              SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy HH:mm");
              User user = statusList.get(i).getUser();
              model.addElement(user.getName()+" - "+formatter.format(tweetDate) + " - " + statusList.get(i).getText());
          }
              return model;
          }

    /**
     * Retorna um model de jList que contem as mensagens diretas recebidas
     * pelo usuário.
     * @return
     * @throws twitter4j.TwitterException
     */
    public DefaultListModel getMensagensDiretas() throws TwitterException{
        DefaultListModel model = new DefaultListModel();
        for(DirectMessage d : twitter.getDirectMessages()){
            model.addElement("De: " + d.getSenderScreenName() + " - " + d.getText());
        }
        return model;
    }

    /**
     * Retorna um model de jList que contem as mensagens diretas enviadas
     * pelo usuario.
     * @return
     * @throws twitter4j.TwitterException
     */
   public DefaultListModel getMensagensEnviadas() throws TwitterException{
        DefaultListModel model = new DefaultListModel();
        for(DirectMessage d : twitter.getSentDirectMessages()){
            model.addElement("Para: "+d.getRecipientScreenName() + " - " + d.getText());
        }
        return model;
    }
   
   /**
     * Retorna um modelo de jList preenchido com as ultimas têndencias do
     * twitter.com.
     * @return
     * @throws twitter4j.TwitterException
     */    
    public DefaultListModel updateTrendTopics () throws TwitterException {
        Trends trends = this.twitter.getTrends(); 
        DefaultListModel model = new DefaultListModel();
        for(int i = 0; i < trends.getTrends().length; i++){
            model.addElement(trends.getTrends()[i].getName());
        }
        return model;
    }
}
