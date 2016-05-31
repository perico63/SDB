/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IU;

import Mensagem.Mensagem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author diego
 */
public class PAlterarEvento extends javax.swing.JPanel {
    String resultServidor = "";
    private Evento eventoSelecionado = null;
    private TPrincipal framePai= null;
    /**
     * Creates new form JAlterarAtividade
     */
    public PAlterarEvento() {
        initComponents();
    }
    
    public PAlterarEvento(TPrincipal framePai, Evento eventoSelecionado) {
        this.framePai = framePai;
        this.eventoSelecionado = eventoSelecionado;
        initComponents();
        camposNecessarios();
        System.out.println(eventoSelecionado.getCodEvento());
        System.out.println(eventoSelecionado.getNome());
        System.out.println(eventoSelecionado.getData());
        System.out.println(eventoSelecionado.getHoraInicial());
        System.out.println(eventoSelecionado.getHoraFinal());
        
        
        jCBTipoAtividade.setSelectedItem(eventoSelecionado.getTipoEvento());
        jTTitulo.setText(eventoSelecionado.getNome());
        jTData.setText(eventoSelecionado.getData());
        jTHoraInicial.setText(eventoSelecionado.getHoraInicial());
        jTHoraFinal.setText(eventoSelecionado.getHoraFinal());
       
    }
    
    public final void camposNecessarios(){
        jBAlterarAtividade.setEnabled(false);
        ArrayList<JTextField> arrayCamposNecessarios = new ArrayList();
        arrayCamposNecessarios.add(jTData);
        arrayCamposNecessarios.add(jTHoraFinal);
        arrayCamposNecessarios.add(jTHoraInicial);
        arrayCamposNecessarios.add(jTTitulo);
        CamposNecessarios documento = new CamposNecessarios(jBAlterarAtividade,arrayCamposNecessarios);
        jTData.getDocument().addDocumentListener(documento);
        jTHoraFinal.getDocument().addDocumentListener(documento);
        jTHoraInicial.getDocument().addDocumentListener(documento);
        jTTitulo.getDocument().addDocumentListener(documento);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTTitulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCBTipoAtividade = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLTituloPainelInterno = new javax.swing.JLabel();
        jLNotificacaoIntervaloInvalido = new javax.swing.JLabel();
        jBAlterarAtividade = new javax.swing.JButton();
        jTData = new javax.swing.JTextField();
        jTHoraInicial = new javax.swing.JTextField();
        jTHoraFinal = new javax.swing.JTextField();
        jLResultadoAlteracao = new javax.swing.JLabel();

        jLabel2.setText("Título:");

        jLabel1.setText("Tipo da atividade:");

        jCBTipoAtividade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Palestras", "Mesa redonda", "Mini-Curso", "Oficina", "Outros" }));
        jCBTipoAtividade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCBTipoAtividadeFocusGained(evt);
            }
        });
        jCBTipoAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoAtividadeActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Data:");

        jLabel6.setText("Hora Inicial:");

        jLabel7.setText("Hora Final:");

        jLTituloPainelInterno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLTituloPainelInterno.setText("Campo de Gerenciamento de Datas");

        jLNotificacaoIntervaloInvalido.setForeground(new java.awt.Color(255, 0, 0));

        jBAlterarAtividade.setText("Alterar");
        jBAlterarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarAtividadeActionPerformed(evt);
            }
        });

        jTData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLTituloPainelInterno)
                        .addGap(96, 96, 96)
                        .addComponent(jLNotificacaoIntervaloInvalido)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBAlterarAtividade)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTHoraInicial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(jTData, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTHoraFinal))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLNotificacaoIntervaloInvalido)
                        .addGap(179, 179, 179))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLTituloPainelInterno)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jBAlterarAtividade)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCBTipoAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jTTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLResultadoAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBTipoAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLResultadoAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCBTipoAtividadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCBTipoAtividadeFocusGained
        // atualizarBotaoSalvar();
    }//GEN-LAST:event_jCBTipoAtividadeFocusGained

    private void jCBTipoAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoAtividadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBTipoAtividadeActionPerformed

    private void jBAlterarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarAtividadeActionPerformed
        
        //13;código evento;nome;data;hora inicial;hora final;código tipo de evento
        
        System.out.println(jCBTipoAtividade.getModel().getSelectedItem().toString());
        String tipoAtividade = jCBTipoAtividade.getModel().getSelectedItem().toString();
        //int codAtividade = retornarCodigoTipoAtividade(jCBTipoAtividade.getModel().getSelectedItem().toString());
        String mensagem = " ";
        mensagem = "13;" + eventoSelecionado.getCodEvento() + ";" + jTTitulo.getText() + ";" + jTData.getText() + ";" + jTHoraInicial.getText() + ";" + jTHoraFinal.getText() + ";" + tipoAtividade;
        //System.out.println(mensagem);
     
        try {
            framePai.getOut().writeUTF(mensagem);
            resultServidor = framePai.getIn().readUTF();
            System.out.println(resultServidor);
            Mensagem msg = new Mensagem(resultServidor);

            jTTitulo.setText("");
            jTData.setText("");
            jTHoraInicial.setText("");
            jTHoraFinal.setText("");

            if(msg.avaliarMensagem()){
                jLResultadoAlteracao.setText("Evento Alterado");
            }else {
                jLResultadoAlteracao.setText("Evento Não Alterado");
            }
        } catch (IOException ex) {
            Logger.getLogger(PAlterarEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
            

       
        this.jBAlterarAtividade.setEnabled(false);
    }//GEN-LAST:event_jBAlterarAtividadeActionPerformed

    private void jTDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterarAtividade;
    private javax.swing.JComboBox jCBTipoAtividade;
    private javax.swing.JLabel jLNotificacaoIntervaloInvalido;
    private javax.swing.JLabel jLResultadoAlteracao;
    private javax.swing.JLabel jLTituloPainelInterno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTData;
    private javax.swing.JTextField jTHoraFinal;
    private javax.swing.JTextField jTHoraInicial;
    private javax.swing.JTextField jTTitulo;
    // End of variables declaration//GEN-END:variables
}
