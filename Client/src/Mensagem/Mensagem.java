/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensagem;

import IU.TPrincipal;

/**
 *
 * @author diego
 */
public class Mensagem {
    
    private String mensagem;
    
    public Mensagem(String mensagem){
        this.mensagem = mensagem;
    }
    
    public boolean avaliarMensagem(){    
        String m[] = this.mensagem.split(";");        
        if(m[0].equals("02") || m[0].equals("12") || m[0].equals("14") || m[0].equals("16") || m[0].equals("22") ||
                m[0].equals("24") || m[0].equals("26") || m[0].equals("32")){
            if(m[1].equals("1")){
                    return true;
                }else if (m[1].equals("0")){
                    return false;
                } 
        }
        return false;
    }
    
}
