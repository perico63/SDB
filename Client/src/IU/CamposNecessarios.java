

package IU;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

public class CamposNecessarios implements DocumentListener {

    JButton botao;
    public ArrayList<JTextField> array;
    ArrayList<JTextField> arrayMascara;
    ValidarMascara validarMascara = new ValidarMascara();
    boolean tabela = false;
    
    public CamposNecessarios(JButton botao,ArrayList<JTextField> array){
        this.botao = botao;
        this.array = array;
        }
    
    public CamposNecessarios(JButton botao,ArrayList<JTextField> array,ArrayList<JTextField> arrayMascara){
        this.botao = botao;
        this.array = array;
        this.arrayMascara = arrayMascara;
    }
    
    
    @Override
    public void changedUpdate(DocumentEvent e) {  
        try {
            atualizaEstado();
        } catch (BadLocationException ex) {
            Logger.getLogger(CamposNecessarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  

    @Override
    public void insertUpdate(DocumentEvent e) {  
        try {  
            atualizaEstado();
        } catch (BadLocationException ex) {
            Logger.getLogger(CamposNecessarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  

    @Override
    public void removeUpdate(DocumentEvent e) {  
        try {  
                atualizaEstado();
        } catch (BadLocationException ex) {
            Logger.getLogger(CamposNecessarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void atualizaEstado() throws BadLocationException {  
    // só habilita o botao se os 3 textfields tem conteudo
        boolean flag = true;
        if (!(array==null))
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getText().equals(""))
                flag = false;
        }
        if (!(arrayMascara==null))
        for (int i = 0; i < arrayMascara.size(); i++) {
                if(validarMascara.verificarVazio(arrayMascara.get(i)))
                    flag = false;
        }
    botao.setEnabled(flag);  
    } 
        
} 
