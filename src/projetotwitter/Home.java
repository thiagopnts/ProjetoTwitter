//
package projetotwitter;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import twitter4j.*;
/**
 * Classe responsável pela interface do menu principal do programa, serve
 * de link para outras classes como a MensagemDireta e Login.
 * @author thiago
 */
public class Home extends javax.swing.JFrame {        

    
    /**
     * Construtor da classe, chama o método setUserButtonText(), para atribuir
     * um nome para o botão usuarioButton.
     * @param twitter
     */
    public Home(Twitter twitter) {
        super("Principal");
        this.twitter = twitter;
        initComponents();
        setUserButtonText("@"+this.twitter.getUserId());
        ImageIcon icon = new ImageIcon("/home/thiago/Imagens/twitter1.png");
        setIconImage(icon.getImage());
    }      
    /**
     * Retorna o conteúdo do campo de busca.
     * @return
     */
    public String getSearchFieldText(){
        return buscaField.getText();
    }     
    /**
     * Retorna a variável da API do Twitter que contem as informações do
     * usuario logado.
     * @return
     */
    public Twitter getTwitter(){
        return this.twitter;
    }    

    /**
     * Retorna o conteúdo do campo onde o usuário digita o que quer twittar.
     * @return
     */
    public String getUpdate(){
        return atualizarField.getText();
    }

    /**
     * Retorna o conteúdo do label contador.
     * @return
     */
    public String getContadorText(){
        return contador.getText();
    }

    /**
     * Modifica o conteúdo do label contador.
     * @param text
     */
    public void setContadorText(String text){
        contador.setText(text);
    }

    /**
     * Retorna o nome atual contido no botão usuarioButton.
     * @return
     */
    public String getUserButtonText(){
        return usuarioButton.getText();
    }

    /**
     * Modifica o nome do botão usuarioButton.
     * @param text
     */
    public void setUserButtonText(String text){
        usuarioButton.setText(text);
    }

    /**
     * Retorna o conteúdo do campo onde os usuários digitam o que vão twittar.
     * @return
     */
    public String getUpdateFieldText(){
        return atualizarField.getText();
    }

    /**
     * Altera o texto do campo onde os usuários digitam o que vão twittar.
     * @param text
     */
    public void setUpdateFieldText(String text){
        atualizarField.setText(text);
    }

    /**
     * Código gerado pelo editor visual do NetBeans, só pode ser editado através
     * dele.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atualizarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        contador = new javax.swing.JLabel();
        msgDiretaButton = new javax.swing.JButton();
        usuarioButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tweetsList = new javax.swing.JList();
        sairButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tendenciasList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        buscaField = new javax.swing.JTextField();
        buscaButton = new javax.swing.JButton();
        maisTweetsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        atualizarField = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        atualizarButton.setText("atualizar");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("<html><big>O que está acontecendo?</html>");

        contador.setText("140");

        msgDiretaButton.setText("Mensagem Direta");
        msgDiretaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgDiretaButtonActionPerformed(evt);
            }
        });

        usuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioButtonActionPerformed(evt);
            }
        });

        try{
            twitterF = new TwitterHome(this.twitter);
            tweetsList.setModel(twitterF.updateTimePanel());
        } catch(TwitterException e){
            e.getMessage();
        }
        jScrollPane2.setViewportView(tweetsList);

        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        tendenciasList.setBackground(new java.awt.Color(226, 226, 226));
        tendenciasList.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        try{
            twitterF = new TwitterHome(this.twitter);
            tendenciasList.setModel(twitterF.updateTrendTopics());
        } catch(TwitterException e){
            e.getMessage();
        }
        jScrollPane3.setViewportView(tendenciasList);

        jLabel2.setText("<html> <big>Tendências");

        buscaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscaFieldKeyPressed(evt);
            }
        });

        buscaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotwitter/7715_64x64.png"))); // NOI18N
        buscaButton.setText("Busca");
        buscaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaButtonActionPerformed(evt);
            }
        });

        maisTweetsButton.setText("MAIS TWEETS");
        maisTweetsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisTweetsButtonActionPerformed(evt);
            }
        });

        atualizarField.setColumns(1);
        atualizarField.setRows(1);
        atualizarField.setTabSize(1);
        atualizarField.setAutoscrolls(false);
        atualizarField.setMaximumSize(new java.awt.Dimension(5, 23));
        atualizarField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                atualizarFieldKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(atualizarField);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotwitter/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                        .addComponent(contador))
                    .addComponent(atualizarButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                    .addComponent(maisTweetsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(sairButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usuarioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addComponent(buscaField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addComponent(buscaButton)
                        .addComponent(msgDiretaButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sairButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(msgDiretaButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atualizarButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(buscaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscaButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(501, Short.MAX_VALUE)
                .addComponent(maisTweetsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento para quando o botão atualizarButton é acionado, chama o método
     * da API para atualizar o status do usuário logado. Atualiza também o
     * conteúdo do timePanel.
     * @param evt
     */
    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
    try{
        getTwitter().updateStatus(getUpdate());
        twitterF = new TwitterHome(twitter);
        tweetsList.setModel(twitterF.updateTimePanel());
    }catch (TwitterException erro){
        JOptionPane.showMessageDialog(null,"Falha ao atualizar status.","Erro",JOptionPane.ERROR_MESSAGE);
    }
    setUpdateFieldText("");
    setContadorText("140");
    }//GEN-LAST:event_atualizarButtonActionPerformed

    /**
     * Evento para quando o botão msgDiretaButton for acionado. Faz a passagem
     * de uma janela para outra.
     * @param evt
     */
    private void msgDiretaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgDiretaButtonActionPerformed
        MensagemDireta mensagem = new MensagemDireta(twitter);
        mensagem.setLocationRelativeTo(null);
        setVisible(false);
        mensagem.setVisible(true);
    }//GEN-LAST:event_msgDiretaButtonActionPerformed

    /**
     * Evento para quando o botão sairButton for acionado. Faz a passagem da janela
     * principal para a janela de login.
     * @param evt
     */
    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        Login login = new Login();
        login.setLocationRelativeTo(this);
        setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_sairButtonActionPerformed

    /**
     * Evento para quando o usuarioButton for acionado. Atualiza a jList de linha
     * do tempo com as menções relacionadas ao usuário.
     * @param evt
     */
    private void usuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioButtonActionPerformed
        try{          
           twitterF = new TwitterHome(this.twitter);
           tweetsList.setModel(twitterF.getUserMentions());
        } catch(TwitterException e){
            e.getMessage();
        }
    }//GEN-LAST:event_usuarioButtonActionPerformed

    /**Evento para quando o botão buscaButton for acionado. Atualiza a jList do timePanel
     * com o resultado da busca.
     * @param evt
     */
    private void buscaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaButtonActionPerformed
      try{
          twitterF = new TwitterHome(this.twitter);
          tweetsList.setModel(twitterF.search(getSearchFieldText()));
          buscaField.setText("");
      } catch(TwitterException e){
          e.getMessage();
      }
    }//GEN-LAST:event_buscaButtonActionPerformed

    /**
     * Evento para quando o botão maisTweetsButton for acionado. Atualiza a jList
     * do timePanel com mais tweets dos usuarios que a conta logada segue.
     * @param evt
     */
    private void maisTweetsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisTweetsButtonActionPerformed
        twitterF = new TwitterHome(twitter);
        try{
        tweetsList.setModel(twitterF.updateTimePanel());
        }catch (TwitterException erro){
        JOptionPane.showMessageDialog(null,"Falha ao atualizar status.","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_maisTweetsButtonActionPerformed

    /**
     * Método que gera um evento para quando o ENTER for pressionado no campo
     * de busca.
     * @param evt
     */
    private void buscaFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaFieldKeyPressed
        if(evt.getKeyCode() == 10)
            buscaButton.doClick();
    }//GEN-LAST:event_buscaFieldKeyPressed

    /**
     * Evento acionado para toda tecla digitada no campo de atualização de status.
     * O valor do contador é decrementado a cada tecla digitada, e incrementado caso
     * essa tecla seja o BACK SPACE, desde que o seu valor seja diferente de 140.
     * @param evt
     */
    @SuppressWarnings("static-access")
    private void atualizarFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atualizarFieldKeyTyped
        if (evt.getKeyChar() == evt.VK_BACK_SPACE){            
            if(Integer.parseInt(getContadorText()) == 140 )
                return;
            int valor = Integer.parseInt(getContadorText());
            setContadorText(String.valueOf(valor+1));
        } else {
            int valor = Integer.parseInt(getContadorText());
            setContadorText(String.valueOf(valor-1));
        }
    }//GEN-LAST:event_atualizarFieldKeyTyped

    /**
     * Declaração das variáveis.
     */
    private TwitterF twitterF;
    private Twitter twitter; //Variável da API.
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButton;
    private javax.swing.JTextArea atualizarField;
    private javax.swing.JButton buscaButton;
    private javax.swing.JTextField buscaField;
    private javax.swing.JLabel contador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton maisTweetsButton;
    private javax.swing.JButton msgDiretaButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JList tendenciasList;
    private javax.swing.JList tweetsList;
    private javax.swing.JButton usuarioButton;
    // End of variables declaration//GEN-END:variables
                  
}

    


    
    

