/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

/**
 *
 * @author Luiz
 */
public class EventoAluno {
    private String codAluno;
    private String codEvento;

    public EventoAluno(String codEvento, String codAluno) {
        this.codAluno = codAluno;
        this.codEvento = codEvento;
    }
   
    /**
     * @return the codAluno
     */
    public String getCodAluno() {
        return codAluno;
    }

    /**
     * @param codAluno the codAluno to set
     */
    public void setCodAluno(String codAluno) {
        this.codAluno = codAluno;
    }

    /**
     * @return the codEvento
     */
    public String getCodEvento() {
        return codEvento;
    }

    /**
     * @param codEvento the codEvento to set
     */
    public void setCodEvento(String codEvento) {
        this.codEvento = codEvento;
    }
}
