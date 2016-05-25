/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensagem;
import Comando.Comando;
import Controle.BD;
/**
 *
 * @author diego
 */
public class Mensagem {
    BD banco;
    private String mensagem;
    
    public Mensagem(String mensagem, BD banco){
        this.mensagem = mensagem;        
        this.banco = banco;
    }
    
    
    public String avaliarMensagem(){
        
        String m[] = this.mensagem.split(";");
        Comando cmd = new Comando(banco);
        String op = m[0];
        String respostaServidor = "";
        
        switch(op){
            case "01":
                if(cmd.login(m[1], m[2])){
                    respostaServidor = "02;1";
                }else{
                    respostaServidor = "02;2";
                }         
                break;
            case "11":
                if(cmd.cadastrarEvento(m[1], m[2], m[3], m[4], m[5])){
                    respostaServidor = "12;1";
                } else{
                    respostaServidor = "12;0";
                }  
                break;
            case "13":
                if(cmd.alterarEvento(Integer.parseInt(m[1]), m[2], m[3], m[4], m[5], m[6])){
                    respostaServidor = "14;1";
                } else {
                    respostaServidor = "14;0";
                }
                break;
            case "15":
                if(cmd.excluirEvento(Integer.parseInt(m[1]))){
                    System.out.println("sucesso na exclusao");
                    respostaServidor = "16;1";
                } else {
                    respostaServidor = "16;0";
                }
                break;
            case "17":
                 return cmd.getAllEventos();           
            
            default:
               respostaServidor = "00";        
        }      
        
        return respostaServidor;
    }    
    
}
