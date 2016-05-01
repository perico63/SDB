/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensagem;

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
        
        switch(m[0]){
            case "02":
                if(m[1].equals("1")){
                    return "Sucesso";
                }else if (m[1].equals("2")){
                    return "Erro";
                }                
                break;
                
            default :
                break;
        }
    
        
        return "";
    }
    
}
