
package projetotwitter;


import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import twitter4j.Twitter;
import twitter4j.TwitterException;
/**
 *Classe responsável pela interface de Login.
 * @author thiago
 */
public class Login extends javax.swing.JFrame {
    /**
     * Construtor da classe.
     * @param usuario
     * @param senha
     */
    public Login(String usuario, String senha){
        initComponents();
        loginField.setText(usuario);
        passwordField.setText(senha);
        ImageIcon imagem = new ImageIcon("/home/thiago/Imagens/twitter1.png");
        setIconImage(imagem.getImage());
    }
    /**
     * Contrutor da classe sem parametros. Usado na classe de testes.
     */
    public Login() {
        initComponents();
        ImageIcon imagem = new ImageIcon("/home/thiago/Imagens/twitter1.png");
        setIconImage(imagem.getImage());
    }

    /**
     * Retorna a variável twitter, que contém todas as informações do usuario.
     * @return
     */
    public Twitter getTwitter(){
        return this.twitter;
    }

   /**
    * Retorna o conteúdo do campo de login.
    * @return
    */
    public String getUser(){
        return loginField.getText();
    }

    /**
     * retorna o conteúdo do campo de senha.
     * @return
     */
    public String getPassword(){
        return passwordField.getText();
    }

    /**
     * Apaga tudo o que estiver no campo de login e senha, caso
     * a autenticação tenha falhado.
     */
    public void zeraLogin(){
        loginField.setText("");
        passwordField.setText("");
    }

    /**
     * Código gerado pelo editor visual do netbeans, esta área só pode ser editada
     * através dele.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        okButton = new javax.swing.JButton();
        imagemLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cadastroButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        okButton.setText("Entrar");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        imagemLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotwitter/logo.png"))); // NOI18N

        jLabel2.setText("Usuário ou email");

        jLabel3.setText("Senha");

        cadastroButton.setText("Cadastre-se");
        cadastroButton.setToolTipText("Cadastre-se no Twitter");
        cadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(imagemLogo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cadastroButton)
                        .addGap(18, 18, 18)
                        .addComponent(okButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imagemLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cadastroButton))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que gera um evento para quando o ENTER for pressionado no campo
     * de password.
     * @param evt
     */
    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        if(evt.getKeyCode() == 10)
            okButton.doClick();
    }//GEN-LAST:event_passwordFieldKeyPressed

    /**
     * Evento para quando o botão de OK da tela de login for acionado.
     * Inicializa a variável da API do twitter e salva as informações de login
     * e senha em um arquivo.
     * @param evt
     */
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        twitter = new Twitter(getUser(),getPassword());
         try{
            SalvaNoArquivo arquivo = new SalvaNoArquivo();
            String anterior = arquivo.leArquivo("dados.txt");
            arquivo.salvaUsuarioEsenha(getUser(), getPassword()+anterior,"dados.txt");
            twitter.verifyCredentials();
            Home principal = new Home(twitter);
            principal.setLocationRelativeTo(null);
            setVisible(false);
            principal.setVisible(true);
         } catch(TwitterException e){
              JOptionPane.showMessageDialog(null, "Falha ao tentar logar.", "Erro", JOptionPane.ERROR_MESSAGE);
              zeraLogin();
          } catch(IOException e){
               e.getMessage();
    }
    }//GEN-LAST:event_okButtonActionPerformed

    /**
     * Evento para quando o botão de cadastro for acionado.
     * Tenta acessar o navegador do sistema com a dada URL para que o usuario
     * possa criar a sua conta no Twitter.
     * @param evt
     */
    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        Desktop desktop = null;
        if (!Desktop.isDesktopSupported())
        throw new IllegalStateException("Não foi possivel acessar o desktop");
        desktop = Desktop.getDesktop();
        if (!desktop.isSupported(Desktop.Action.BROWSE))
        throw new IllegalStateException("Não foi possivel acessar o navegador");
        URI uri = null;
        try {
            uri = new URI("http://www.twitter.com/signup");
        } catch (URISyntaxException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao se comunicar com o Navegador!","Erro",JOptionPane.ERROR_MESSAGE);
        }
        try {
            desktop.browse(uri);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao se comunicar com o Navegador!","Erro",JOptionPane.ERROR_MESSAGE);
        }

}//GEN-LAST:event_cadastroButtonActionPerformed
    
    /**
     * Declaração das variáveis.
     */
    Twitter twitter; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroButton;
    private javax.swing.JLabel imagemLogo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField loginField;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
