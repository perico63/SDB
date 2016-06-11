

package IU;

import Mensagem.Mensagem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public final class PSelecionarAluno extends javax.swing.JPanel {
    String resultServidor = "";
    private TPrincipal framePai;
    private int linha;    
    private ArrayList<Aluno> arrayAlunos;
    
    public PSelecionarAluno() {
        initComponents();
    }
    
    public PSelecionarAluno(TPrincipal framePai) throws IOException {
       
        initComponents();
        adicionaListner();        
        this.framePai = framePai;           
        
        String mensagem = "27";
        framePai.getOut().writeUTF(mensagem);           
        String resultServidor = framePai.getIn().readUTF();
        System.out.println(resultServidor);
        resultServidor.trim();
        String conteudo[] = resultServidor.split("\\|");
        //popula array
        Aluno evt;
        arrayAlunos = new ArrayList<>();
        
        for (int i = 1; i < conteudo.length; i++) { 
            String descAluno[] = conteudo[i].split(";");            
            evt = new Aluno();
            evt.setCodAluno(descAluno[0]);
            evt.setRa(descAluno[1]);
            evt.setNome(descAluno[2]);
            evt.setCurso(descAluno[3]);
            evt.setPeriodo((descAluno[4])); 
            evt.setEmail(descAluno[5]);
            evt.setTelefone(descAluno[6]);
            arrayAlunos.add(evt);
        }
        
        popularTabela();
    }
    
    public void adicionaListner(){
        jTableAlunos.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    JTable target = (JTable)e.getSource();
                    linha = target.getSelectedRow();
                }
            }
        });
    }

    public void popularTabela(){
       for (int i = 0; i < arrayAlunos.size() ; i++) {
            DefaultTableModel model = (DefaultTableModel)jTableAlunos.getModel();
            model.insertRow(model.getRowCount(), new Object[]{arrayAlunos.get(i).getCodAluno(),arrayAlunos.get(i).getRa(), arrayAlunos.get(i).getNome(),
                arrayAlunos.get(i).getCurso(), arrayAlunos.get(i).getPeriodo(), arrayAlunos.get(i).getEmail(), arrayAlunos.get(i).getTelefone()}); 
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        jBSelecionarAtividade = new javax.swing.JButton();
        jBExcluirAtividade = new javax.swing.JButton();
        jLResultadoExclusao = new javax.swing.JLabel();

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "RA", "Nome", "Curso", "Periodo", "E-mail", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableAlunos);

        jBSelecionarAtividade.setText("Selecionar");
        jBSelecionarAtividade.setEnabled(false);
        jBSelecionarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSelecionarAtividadeActionPerformed(evt);
            }
        });

        jBExcluirAtividade.setText("Excluir");
        jBExcluirAtividade.setEnabled(false);
        jBExcluirAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirAtividadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLResultadoExclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBExcluirAtividade)
                        .addGap(26, 26, 26)
                        .addComponent(jBSelecionarAtividade)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBSelecionarAtividade)
                        .addComponent(jBExcluirAtividade))
                    .addComponent(jLResultadoExclusao))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBSelecionarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelecionarAtividadeActionPerformed
       
        Aluno alunoSelecionado = new Aluno(arrayAlunos.get(linha).getCodAluno(), arrayAlunos.get(linha).getRa(),
        arrayAlunos.get(linha).getNome(), arrayAlunos.get(linha).getCurso(), arrayAlunos.get(linha).getPeriodo(),
        arrayAlunos.get(linha).getEmail(), arrayAlunos.get(linha).getTelefone());
       
        PAlterarAluno proximoPainel = new PAlterarAluno(framePai, alunoSelecionado);
        framePai.mudarPainel(proximoPainel,"Alterar Aluno");
    }//GEN-LAST:event_jBSelecionarAtividadeActionPerformed

    private void jTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMouseClicked
        JTable target = (JTable)evt.getSource();
        linha = target.getSelectedRow(); 
        boolean flag = false;
        for (int i = 0; i < jTableAlunos.getRowCount(); i++) 
            if (linha!=-1) 
                flag=true;
        jBSelecionarAtividade.setEnabled(flag);
        jBExcluirAtividade.setEnabled(flag);
    }//GEN-LAST:event_jTableAlunosMouseClicked

    private void jBExcluirAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirAtividadeActionPerformed
        // TODO add your handling code here:
        Aluno alunoSelecionado = new Aluno();
        alunoSelecionado.setCodAluno(arrayAlunos.get(linha).getCodAluno());     
        
        String mensagem = "25;" + alunoSelecionado.getCodAluno() ;
        System.out.println(mensagem);
     
        try {
            framePai.getOut().writeUTF(mensagem);
            resultServidor = framePai.getIn().readUTF();
            System.out.println(resultServidor);
            Mensagem msg = new Mensagem(resultServidor);

            if(msg.avaliarMensagem()){
                jLResultadoExclusao.setText("Aluno Excluido");
            }else {
                jLResultadoExclusao.setText("Aluno Não Excluido");
            }
        } catch (IOException ex) {
            Logger.getLogger(PAlterarEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jBExcluirAtividade.setEnabled(false);
        this.jBSelecionarAtividade.setEnabled(false);
        PSelecionarAluno painel = null;
        try {
            painel = new PSelecionarAluno(framePai);
        } catch (IOException ex) {
            Logger.getLogger(PSelecionarAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        framePai.mudarPainel(painel, "Selecionar Aluno");
    }//GEN-LAST:event_jBExcluirAtividadeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExcluirAtividade;
    private javax.swing.JButton jBSelecionarAtividade;
    private javax.swing.JLabel jLResultadoExclusao;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAlunos;
    // End of variables declaration//GEN-END:variables
}
