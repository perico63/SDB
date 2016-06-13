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
        
        switch(m[0]){
            case "02":
                if(m[1].equals("1")){
                    return true;
                }else if (m[1].equals("0")){
                    return false;
                } 
            case "12": 
                if(m[1].equals("1")){
                    return true;
                }else if (m[1].equals("0")){
                    return false;
                } 
            case "14":
                if(m[1].equals("1")){
                    return true;
                } else if(m[1].equals("0")){
                    return false;
                }
            case "16":
                 if(m[1].equals("1")){
                    return true;
                } else if(m[1].equals("0")){
                    return false;
                }    
            case "22": 
                if(m[1].equals("1")){
                    return true;
                } else if(m[1].equals("0")){
                    return false;
                }
            case "24":
                if(m[1].equals("1")){
                    return true;
                } else if(m[1].equals("0")){
                    return false;
                }
            case "26":
                if(m[1].equals("1")){
                    return true;
                } else if(m[1].equals("0")){
                    return false;
                }
            case "32":
            if(m[1].equals("1")){
                return true;
            } else if(m[1].equals("0")){
                return false;
            }
            default :
                break;
        }
        return false;
    }
    
}
