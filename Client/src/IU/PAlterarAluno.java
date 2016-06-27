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
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JTextField;

/**
 *
 * @author diego
 */
public class PAlterarAluno extends javax.swing.JPanel {
    
    TPrincipal framepai = null;
    private Aluno alunoSelecionado = null;
    String resultServidor = "";
    
    /**
     * Creates new form PCadastrarAluno
     */
    
    public PAlterarAluno() {
        initComponents();
    }
    
    public PAlterarAluno(TPrincipal framepai, Aluno alunoSelecionado){
        this.framepai = framepai;
        this.alunoSelecionado = alunoSelecionado;
        initComponents();
        camposNecessarios();
        
        jTRA.setText(alunoSelecionado.getRa());
        jTNome.setText(alunoSelecionado.getNome());
        jTCurso.setText(alunoSelecionado.getCurso());
        jTPeriodo.setText(alunoSelecionado.getPeriodo());
        jTEmail.setText(alunoSelecionado.getEmail());
        jTTelefone.setText(alunoSelecionado.getTelefone());
        
    }
    
    public final void camposNecessarios(){
        jBAlterarAluno.setEnabled(false);
        ArrayList<JTextField> arrayCamposNecessarios = new ArrayList();
        arrayCamposNecessarios.add(jTCurso);
        arrayCamposNecessarios.add(jTEmail);
        arrayCamposNecessarios.add(jTNome);
        arrayCamposNecessarios.add(jTPeriodo);
        arrayCamposNecessarios.add(jTRA);
        arrayCamposNecessarios.add(jTTelefone);
        CamposNecessarios documento = new CamposNecessarios(jBAlterarAluno,arrayCamposNecessarios);
        jTCurso.getDocument().addDocumentListener(documento);
        jTEmail.getDocument().addDocumentListener(documento);
        jTNome.getDocument().addDocumentListener(documento);
        jTPeriodo.getDocument().addDocumentListener(documento);
        jTRA.getDocument().addDocumentListener(documento);
        jTTelefone.getDocument().addDocumentListener(documento);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTRA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTPeriodo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTTelefone = new javax.swing.JTextField();
        jBAlterarAluno = new javax.swing.JButton();
        jTCurso = new javax.swing.JTextField();

        jLabel1.setText("RA: ");

        jLabel2.setText("Nome: ");

        jLabel3.setText("Curso:");

        jLabel4.setText("Perido:");

        jLabel5.setText("Email: ");

        jLabel6.setText("Telefone:");

        jBAlterarAluno.setText("Alterar");
        jBAlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarAlunoActionPerformed(evt);
            }
        });

        jTCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBAlterarAluno)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTRA, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(jTNome)
                                    .addComponent(jTCurso)
                                    .addComponent(jTPeriodo)
                                    .addComponent(jTEmail)
                                    .addComponent(jTTelefone))))
                        .addContainerGap(44, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jBAlterarAluno)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCursoActionPerformed

    private void jBAlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarAlunoActionPerformed
        // TODO add your handling code here:
        String mensagem = " ";
        mensagem = "23;" + alunoSelecionado.getCodAluno() + ";" + jTRA.getText() + ";" + jTNome.getText() + ";" + jTCurso.getText() 
                + ";" + jTPeriodo.getText() + ";" + jTEmail.getText() + ";" + jTTelefone.getText();
        System.out.println(mensagem);
        
        try{
            framepai.getOut().writeUTF(mensagem);
            resultServidor = framepai.getIn().readUTF();
            System.out.println(resultServidor);
            Mensagem msg = new Mensagem(resultServidor);
            
            jTRA.setText("");
            jTNome.setText("");
            jTCurso.setText("");
            jTPeriodo.setText("");
            jTEmail.setText("");
            jTTelefone.setText("");
            
            if(msg.avaliarMensagem()){
                JOptionPane.showMessageDialog(null, "Aluno Alterado!"); 
            } else {
                JOptionPane.showMessageDialog(null, "Aluno não Alterado!", "Erro", ERROR_MESSAGE); 
            }
        } catch(IOException ex){
            Logger.getLogger(PAlterarAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBAlterarAlunoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterarAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTCurso;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTPeriodo;
    private javax.swing.JTextField jTRA;
    private javax.swing.JTextField jTTelefone;
    // End of variables declaration//GEN-END:variables
}
