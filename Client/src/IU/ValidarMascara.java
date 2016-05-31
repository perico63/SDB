
package IU;

import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class ValidarMascara {
    
     public ValidarMascara(){
         
     }

    public boolean verificarVazio(JTextField campo) throws BadLocationException{
        boolean verificar = false;
        for(int aux = 0 ; aux < campo.getText().length() ; aux++){
            verificar = verificar || (campo.getText(aux,1).equals(" "));
            if (verificar)
                    return verificar;
        }
        return verificar;
    }
    
}
