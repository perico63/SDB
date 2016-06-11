

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

public final class PSelecionarEvento extends javax.swing.JPanel {
    String resultServidor = "";
    private TPrincipal framePai;
    private int linha;    
    private ArrayList<Evento> arrayEventos;
    private boolean tela;
    
    public PSelecionarEvento() {
        initComponents();
    }
    //tela  0 - alterar evento
    //tela 1 - registrar presenca
    public PSelecionarEvento(TPrincipal framePai, boolean tela) throws IOException {
       
        initComponents();
        
        if(tela){
            this.jBExcluirAtividade.setVisible(false);
        }
        
        adicionaListner();        
        this.framePai = framePai;           
        this.tela = tela;
                
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEventos = new javax.swing.JTable();
        jBSelecionarAtividade = new javax.swing.JButton();
        jBExcluirAtividade = new javax.swing.JButton();
        jLResultadoExclusao = new javax.swing.JLabel();

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
        
        if(!tela){
            Evento eventoSelecionado = new Evento(arrayEventos.get(linha).getCodEvento(), arrayEventos.get(linha).getNome(),
            arrayEventos.get(linha).getData(), arrayEventos.get(linha).getHoraInicial(), arrayEventos.get(linha).getHoraFinal(),
            arrayEventos.get(linha).getTipoEvento());

            PAlterarEvento proximoPainel = new PAlterarEvento(framePai, eventoSelecionado);
            framePai.mudarPainel(proximoPainel,"Alterar Evento");
        } else {
            //lancar presenca
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
        jBExcluirAtividade.setEnabled(flag);
    }//GEN-LAST:event_jTableEventosMouseClicked

    private void jBExcluirAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirAtividadeActionPerformed
        // TODO add your handling code here:
        Evento eventoSelecionado = new Evento();
        eventoSelecionado.setCodEvento(arrayEventos.get(linha).getCodEvento());     
        
        String mensagem = "15;" + eventoSelecionado.getCodEvento() ;
        System.out.println(mensagem);
     
        try {
            framePai.getOut().writeUTF(mensagem);
            resultServidor = framePai.getIn().readUTF();
            System.out.println(resultServidor);
            Mensagem msg = new Mensagem(resultServidor);

            if(msg.avaliarMensagem()){
                jLResultadoExclusao.setText("Evento Excluido");
            }else {
                jLResultadoExclusao.setText("Evento Não Excluido");
            }
        } catch (IOException ex) {
            Logger.getLogger(PAlterarEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jBExcluirAtividade.setEnabled(false);
        this.jBSelecionarAtividade.setEnabled(false);
        PSelecionarEvento painel = null;
        try {
            painel = new PSelecionarEvento(framePai, this.tela);
        } catch (IOException ex) {
            Logger.getLogger(PSelecionarEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
        framePai.mudarPainel(painel, "Selecionar Evento");
    }//GEN-LAST:event_jBExcluirAtividadeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExcluirAtividade;
    private javax.swing.JButton jBSelecionarAtividade;
    private javax.swing.JLabel jLResultadoExclusao;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableEventos;
    // End of variables declaration//GEN-END:variables
}
