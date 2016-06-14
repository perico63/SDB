

package IU;

import Mensagem.Mensagem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public final class PConsultarPresenca extends javax.swing.JPanel {
    String resultServidor = "";
    private TPrincipal framePai;
    private int linha;    
    private ArrayList<Evento> arrayEventos;
    private ArrayList<Aluno> arrayAlunosMatriculados;
    
    public PConsultarPresenca() {
        initComponents();
    }
    
    public PConsultarPresenca(TPrincipal framePai) throws IOException {
       
        initComponents();
        
        adicionaListner();        
        this.framePai = framePai;
                
        String mensagem = "17";
        framePai.getOut().writeUTF(mensagem);           
        String resultServidor = framePai.getIn().readUTF();
        System.out.println(resultServidor);
        resultServidor.trim();
        String conteudo[] = resultServidor.split("\\|");
        //popula array
        Evento evt;
        arrayEventos = new ArrayList<>();
        
        for (int i = 1; i < conteudo.length; i++) { 
            String descEvento[] = conteudo[i].split(";");            
            evt = new Evento();
            evt.setCodEvento(descEvento[0]);
            System.out.println(evt.getCodEvento());
            evt.setNome(descEvento[1]);
            evt.setData(descEvento[2]);
            evt.setHoraInicial(descEvento[3]);
            evt.setHoraFinal(descEvento[4]); 
            evt.setTipoEvento(descEvento[5]);
            arrayEventos.add(evt);
        }
        
        popularTabela();
    }
    
    public void adicionaListner(){
        jTableEventos.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    JTable target = (JTable)e.getSource();
                    linha = target.getSelectedRow();
                }
            }
        });
    }
    
    public void popularTabela(){
       for (int i = 0; i < arrayEventos.size() ; i++) {
            DefaultTableModel model = (DefaultTableModel)jTableEventos.getModel();
            model.insertRow(model.getRowCount(), new Object[]{arrayEventos.get(i).getCodEvento(),arrayEventos.get(i).getNome(), arrayEventos.get(i).getData(),
                arrayEventos.get(i).getHoraInicial(), arrayEventos.get(i).getHoraFinal(), arrayEventos.get(i).getTipoEvento()}); 
        }
    }
    
    public void popularTabelaAlunosMatriculados(){
       for (int i = 0; i < arrayAlunosMatriculados.size() ; i++) {
            DefaultTableModel model = (DefaultTableModel)jTableAlunosMatriculados.getModel();
            model.insertRow(model.getRowCount(), new Object[]{arrayAlunosMatriculados.get(i).getCodAluno(),arrayAlunosMatriculados.get(i).getRa(), arrayAlunosMatriculados.get(i).getNome(),
                arrayAlunosMatriculados.get(i).getCurso(), arrayAlunosMatriculados.get(i).getPeriodo(), arrayAlunosMatriculados.get(i).getEmail(), arrayAlunosMatriculados.get(i).getTelefone()}); 
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEventos = new javax.swing.JTable();
        jBSelecionarAtividade = new javax.swing.JButton();
        jLResultadoExclusao = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAlunosMatriculados = new javax.swing.JTable();

        jTableEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Título", "Data", "Hora Inicial", "Hora Final", "Tipo Evento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEventosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableEventos);

        jBSelecionarAtividade.setText("Selecionar");
        jBSelecionarAtividade.setEnabled(false);
        jBSelecionarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSelecionarAtividadeActionPerformed(evt);
            }
        });

        jTableAlunosMatriculados.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableAlunosMatriculados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunosMatriculadosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableAlunosMatriculados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLResultadoExclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSelecionarAtividade)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSelecionarAtividade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLResultadoExclusao))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBSelecionarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelecionarAtividadeActionPerformed
        
        //popular table de alunos matriculados
        String mensagem = "33;"+arrayEventos.get(linha).getCodEvento();
        try {
            framePai.getOut().writeUTF(mensagem);
            String resultServidor = null;
            resultServidor = framePai.getIn().readUTF();
            System.out.println(resultServidor);
            resultServidor.trim();
            String conteudo[] = resultServidor.split("\\|");

            //popula array
            System.out.println("Conteudo retorno 33" + conteudo[0]);
            Aluno evt2;
            ArrayList<Aluno> arrayAlunosMatriculados = new ArrayList<>();

            for (int i = 1; i < conteudo.length; i++) {
                String descAluno[] = conteudo[i].split(";");
                evt2 = new Aluno();
                evt2.setCodAluno(descAluno[0]);
                evt2.setRa(descAluno[1]);
                evt2.setNome(descAluno[2]);
                evt2.setCurso(descAluno[3]);
                evt2.setPeriodo((descAluno[4]));
                evt2.setEmail(descAluno[5]);
                evt2.setTelefone(descAluno[6]);
                arrayAlunosMatriculados.add(evt2);
            }
            popularTabelaAlunosMatriculados();
        } catch (IOException ex) {
            Logger.getLogger(PRegistrarPresenca.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jBSelecionarAtividadeActionPerformed

    private void jTableEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEventosMouseClicked
        JTable target = (JTable)evt.getSource();
        linha = target.getSelectedRow(); 
        boolean flag = false;
        for (int i = 0; i < jTableEventos.getRowCount(); i++) 
            if (linha!=-1) 
                flag=true;
        jBSelecionarAtividade.setEnabled(flag);
    }//GEN-LAST:event_jTableEventosMouseClicked

    private void jTableAlunosMatriculadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMatriculadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableAlunosMatriculadosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSelecionarAtividade;
    private javax.swing.JLabel jLResultadoExclusao;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAlunosMatriculados;
    private javax.swing.JTable jTableEventos;
    // End of variables declaration//GEN-END:variables
}
