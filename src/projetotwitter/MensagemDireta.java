package projetotwitter;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import twitter4j.Twitter;
import twitter4j.TwitterException;

/**
 * Classe responsável pela interface do menu de envio/recebimento de mensagens
 * diretas.
 * @author thiago
 */
public class MensagemDireta extends javax.swing.JFrame {

    
    /**
     * Construtor da classe, inicializa os componentes e configura o icone
     * da janela.
     * @param twitter
     */
    public MensagemDireta(Twitter twitter) {                
        initComponents();
        this.twitter = twitter;
        ImageIcon imagem = new ImageIcon("/home/thiago/Imagens/twitter1.png");
        setIconImage(imagem.getImage());
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
     * Código gerado pelo editor visual do NetBeans, só pode ser editado através
     * dele.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abas = new javax.swing.JTabbedPane();
        enviarPainel = new javax.swing.JPanel();
        enviarButton = new javax.swing.JButton();
        retornaButton = new javax.swing.JButton();
        destinoField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgField = new javax.swing.JTextPane();
        recebidosPainel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        msgsRecebidasList = new javax.swing.JList();
        enviadosPainel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        msgsEnviadasList = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mensagem Direta");
        setResizable(false);

        abas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                abasStateChanged(evt);
            }
        });

        enviarButton.setText("Enviar");
        enviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarButtonActionPerformed(evt);
            }
        });

        retornaButton.setText("Principal");
        retornaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornaButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("ID destino");

        msgField.setMaximumSize(new java.awt.Dimension(6, 20));
        jScrollPane1.setViewportView(msgField);

        javax.swing.GroupLayout enviarPainelLayout = new javax.swing.GroupLayout(enviarPainel);
        enviarPainel.setLayout(enviarPainelLayout);
        enviarPainelLayout.setHorizontalGroup(
            enviarPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enviarPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(enviarPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(enviarPainelLayout.createSequentialGroup()
                        .addComponent(retornaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                        .addComponent(enviarButton))
                    .addGroup(enviarPainelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(destinoField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        enviarPainelLayout.setVerticalGroup(
            enviarPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enviarPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(enviarPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(destinoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enviarPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retornaButton)
                    .addComponent(enviarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abas.addTab("Enviar", enviarPainel);

        jScrollPane2.setViewportView(msgsRecebidasList);

        javax.swing.GroupLayout recebidosPainelLayout = new javax.swing.GroupLayout(recebidosPainel);
        recebidosPainel.setLayout(recebidosPainelLayout);
        recebidosPainelLayout.setHorizontalGroup(
            recebidosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );
        recebidosPainelLayout.setVerticalGroup(
            recebidosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        );

        abas.addTab("Recebidos", recebidosPainel);

        jScrollPane3.setViewportView(msgsEnviadasList);

        javax.swing.GroupLayout enviadosPainelLayout = new javax.swing.GroupLayout(enviadosPainel);
        enviadosPainel.setLayout(enviadosPainelLayout);
        enviadosPainelLayout.setHorizontalGroup(
            enviadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );
        enviadosPainelLayout.setVerticalGroup(
            enviadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        );

        abas.addTab("Enviados", enviadosPainel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento para quando o botão retornaButton for acionado. Retorna para a tela
     * principal do programa.
     * @param evt
     */
    private void retornaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornaButtonActionPerformed
        JFrame home = new Home(twitter);
        home.setLocationRelativeTo(null);
        home.setVisible(true);
        setVisible(false);
}//GEN-LAST:event_retornaButtonActionPerformed

    /**
     * Evento para quando o botão de enviarButton for acionado. Envia um mensagem
     * direta para o ID destino, utilizando um método da API do twitter.
     * @param evt
     */
    private void enviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarButtonActionPerformed
        try{
            twitter.sendDirectMessage(destinoField.getText(), msgField.getText());
            destinoField.setText("");
            msgField.setText("");
        } catch(TwitterException erro){
            JOptionPane.showMessageDialog(null, "Falha ao enviar a mensagem", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_enviarButtonActionPerformed

    /**
     * Evento para quando houver mudança de aba no menu de mensagens diretas.
     * Na segunda aba exibe as mensagens recebidas, na terceira as recebidas.
     * @param evt
     */
    private void abasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_abasStateChanged
        try{
            twitterF = new TwitterMensagemDireta(twitter);
            msgsRecebidasList.setModel(twitterF.getMensagensDiretas());
            msgsEnviadasList.setModel(twitterF.getMensagensEnviadas());
        } catch(Exception e){
            e.getMessage();
        }
    }//GEN-LAST:event_abasStateChanged
    /**
     * Declaração das variáveis utilizadas.
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abas;
    private javax.swing.JTextField destinoField;
    private javax.swing.JPanel enviadosPainel;
    private javax.swing.JButton enviarButton;
    private javax.swing.JPanel enviarPainel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane msgField;
    private javax.swing.JList msgsEnviadasList;
    private javax.swing.JList msgsRecebidasList;
    private javax.swing.JPanel recebidosPainel;
    private javax.swing.JButton retornaButton;
    // End of variables declaration//GEN-END:variables
    private Twitter twitter; 
    private TwitterF twitterF;
}
