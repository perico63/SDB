/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensagem;
import Comando.Comando;
/**
 *
 * @author diego
 */
public class Mensagem {
    
    private String mensagem;
    
    public Mensagem(String mensagem){
        this.mensagem = mensagem;        
    }
    
    
    public String avaliarMensagem(){
        String m[] = this.mensagem.split(";");
        Comando cmd = new Comando();
        
        if(m[0].equals("01")){      
           if(cmd.login(m[1], m[2])){
               return "02;1";
           }else{
               return "02;2";
           }           
        }       
        return "00";
    }    
    
}
