/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comando;

/**
 *
 * @author diego
 */
public class Comando {

    public boolean login(String user, String senha){
        //get do banco
        String userServidor = "perico";
        String senhaServidor = "abc";
                
       if(user.equals(userServidor) && senha.equals(senhaServidor)){
           return true;
       }
       return false;      
    }
    
    
}
