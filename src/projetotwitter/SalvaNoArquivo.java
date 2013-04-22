package projetotwitter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Classe responsável pelo salvamento em arquivo 
 * das informações de usuário e senha.
 * @author thiago
 */
public class SalvaNoArquivo {
    /**
     * Método para a leitura de um determinado arquivo.
     * @param nomeDoArquivo
     * @return
     * @throws java.io.IOException
     */
    public String leArquivo(String nomeDoArquivo) throws IOException{
        ObjectInputStream in = null;
        String idsEsenhas = new String();
        try{
            in = new ObjectInputStream(new FileInputStream(nomeDoArquivo));
            idsEsenhas = (String) in.readObject();
            return idsEsenhas;
        } catch(FileNotFoundException e){
            e.getMessage();
        } catch(IOException e){
            e.getMessage();
        } catch(ClassNotFoundException e){
            e.getMessage();
        } finally {
            if (in != null)
                in.close();
        }
        return null;
    }

    /**
     * Salva o usuário e a senha digitados na hora do login em um arquivo.
     * @param usuario
     * @param senha
     * @param nomeDoArquivo
     * @throws java.io.IOException
     */
    public void salvaUsuarioEsenha(String usuario, String senha, String nomeDoArquivo) throws IOException{
        ObjectOutputStream out = null;
        String dados = new String();
        dados = "\n Usuario: "+usuario+" "+" Senha: "+senha;
        try{
            out = new ObjectOutputStream(new FileOutputStream(nomeDoArquivo));
            out.writeObject(dados);
        } catch(IOException e){
            e.getMessage();
        } finally{
            if (out != null)
               out.close();
        }
    }
}
