import java.io.File;
import java.io.IOException;
import junit.framework.TestCase;
import projetotwitter.Home;
import projetotwitter.Login;
import projetotwitter.SalvaNoArquivo;
import twitter4j.*;

/**
 * Classe de testes do programa.
 * @author thiago
 */
public class TestaTwitter extends TestCase {

    private Twitter twitter;

    /**
     * Construtor da classe.
     * @param testName
     */
    public TestaTwitter(String testName) {
        super(testName);
    }

    /**
     * Método de teste.
     * @throws java.lang.Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * Método de teste.
     * @throws java.lang.Exception
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Método responsável pelo teste da classe Login.
     * @throws java.lang.Exception
     */
    public void testaLogin() throws TwitterException{
        Login l = new Login("ProjetoJava","123meu");
        twitter = l.getTwitter();
        twitter = new Twitter ("ProjetoJava","123meu");        
        assertTrue(l.getUser().equals("ProjetoJava"));
        assertTrue(l.getPassword().equals("123meu"));
        assertTrue(twitter.getUserId().equals("ProjetoJava"));        
    }

    /**
     * Método responsável pelo teste da classe Home.
     * @throws twitter4j.TwitterException
     */
    public void testaHome() throws TwitterException{
        twitter = new Twitter("ProjetoJava","123meu");
        Home h = new Home(twitter);
        assertTrue(h.getContadorText().equals("140"));
        h.setContadorText("Projetojava");        
        assertFalse(h.getUserButtonText().equals("ProjetoJava"));
    }

    /**
     * Método responsável pelo teste da classe SalvaNoArquivo.
     * @throws java.io.IOException
     */
    public void testaSalvaNoArquivo() throws IOException{
        SalvaNoArquivo arquivoTeste = new SalvaNoArquivo();
        File f = new File("teste.txt");
        assertFalse(f.exists());
        arquivoTeste.salvaUsuarioEsenha("teste", "123456", "teste.txt");
        assertTrue(f.exists());        
        assertNotNull(arquivoTeste.leArquivo("teste.txt"));
        f.delete();
    }
}