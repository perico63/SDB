/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensagem;
import Comando.Comando;
import Servidor.BD;
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
                    respostaServidor = "16;1";
                } else {
                    respostaServidor = "16;0";
                }
                break;
            case "17":
                 return cmd.getAllEventos();
            case "21":
                if(cmd.cadastroAluno(m[1], m[2], m[3], m[4], m[5], m[6])){
                    respostaServidor = "22;1";
                } else {
                    respostaServidor = "22;0";
                }
                break;
            case "23":
                if(cmd.alterarAluno(Integer.parseInt(m[1]), m[2], m[3], m[4], m[5], m[6], m[7])){
                    respostaServidor = "24;1";
                } else{
                    respostaServidor = "24;0";
                }
                break;
            case "25":
                if(cmd.excluirAluno(Integer.parseInt(m[1]))){
                    respostaServidor = "26;1";
                } else {
                    respostaServidor = "26;0";
                }
                break;
            case "27": 
                return cmd.getAllAlunos();
            case "31":
                if(cmd.matricularAluno(m[1],m[2])){
                    respostaServidor = "32;1";
                } else {
                    respostaServidor = "32;0";
                }
                break;
            case "33":
                return cmd.getAlunosMatriculados(m[1]);
            default:
               respostaServidor = "00";        
        }      
        return respostaServidor;
    }    
    
}
