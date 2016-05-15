/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IU;

/**
 *
 * @author diego
 */
public class Evento {
    
    private String codEvento;
    private String nome;
    private String data;
    private String horaInicial;
    private String horaFinal;
    private String tipoEvento;
    
    public Evento(){}

    public Evento(String codEvento, String nome, String data, String horaInicial, String horaFinal, String tipoEvento) {
        this.codEvento = codEvento;
        this.nome = nome;
        this.data = data;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.tipoEvento = tipoEvento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }  
    
    public String getCodEvento() {
        return codEvento;
    }

    public void setCodEvento(String codEvento) {
        this.codEvento = codEvento;
    }
    
    
}
