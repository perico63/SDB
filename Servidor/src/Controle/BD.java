/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class BD {
        
    ArrayList<Evento> eventos = null;
    
    public BD(){
        this.eventos = eventos = new ArrayList();
    }
    
    public void cadastrarEvento(Evento evento){
        System.out.println("cadastrado com sucesso");
        this.eventos.add(evento);        
    }
    
    public void alterarEvento(Evento evento, int codigoEvento){
        this.eventos.set(codigoEvento, evento);
    } 
    
    public void excluirEvento(int codigoEvento){
        this.eventos.remove(codigoEvento);
    }
    
    public ArrayList<Evento> getBanco(){
        return eventos;
    }
    
}
