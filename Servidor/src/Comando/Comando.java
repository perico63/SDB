/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comando;

import Controle.BD;
import Controle.Evento;

/**
 *
 * @author diego
 */
public class Comando {
    
    BD banco = null;

    public Comando(BD banco) {
        this.banco = banco;
    }
        
    public boolean login(String user, String senha){
        //get do banco
        String userServidor = "usuario";
        String senhaServidor = "senha";
                
       if(user.equals(userServidor) && senha.equals(senhaServidor)){
           return true;
       }
       return false;      
    }
    
    public boolean cadastrarEvento(String nome, String data, String horaInicial, String horaFinal, String tipoEvento){
        Evento novoEvento = new Evento(nome, data, horaInicial, horaFinal, tipoEvento);  
        System.out.println("criou  obj evento");
        banco.cadastrarEvento(novoEvento);   
        return true;
    }
    
     public boolean alterarEvento(int codigoEvento, String nome, String data, String horaInicial, String horaFinal, String tipoEvento){
        Evento eventoAlterado = new Evento(nome, data, horaInicial, horaFinal, tipoEvento);
        banco.alterarEvento(eventoAlterado, codigoEvento);
        return true;
    }
     
    public boolean excluirEvento(int codigoEvento){
        banco.excluirEvento(codigoEvento);
        return true;
    }
    
    public String getAllEventos(){
        String todosEventos = "18|";
        for (int i = 0; i < banco.getBanco().size(); i++) {
            
            todosEventos = todosEventos.concat(i + ";" + banco.getBanco().get(i).getNome() + ";" + 
                    banco.getBanco().get(i).getData() + ";" + banco.getBanco().get(i).getHoraInicial() + ";" 
                    + banco.getBanco().get(i).getHoraFinal() + ";" + banco.getBanco().get(i).getTipoEvento());
            
            if(i != banco.getBanco().size()-1)
                todosEventos = todosEventos.concat("|");                
        }
        System.out.println(todosEventos);
        return todosEventos;
    }
    
    
}
