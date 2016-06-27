/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

/**
 *
 * @author diego
 */
public class Aluno {
    
    private String ra;
    private String nome;
    private String curso;
    private String periodo;
    private String email;
    private String telefone;

    public Aluno(String ra, String nome, String curso, String periodo, String email, String telefone){
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.periodo = periodo;
        this.email = email;
        this.telefone = telefone;
    }
    
    public Aluno(){}
    
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
