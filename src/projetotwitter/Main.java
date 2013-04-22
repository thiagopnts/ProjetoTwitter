/**
 * O programa visa a utilização das funções básicas do
 * site de relacionamento/micro-blog twitter.com, utilizando os métodos da
 * API twitter4j.
 */

package projetotwitter;

/**
 * Classe main, por onde o programa inicializa.
 * @author thiago
 */
public class Main {

    /**
     * Método por onde o programa é inicializado.
     * @param args
     */
    public static void main(String[] args) {      
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }   
}
