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
    ArrayList<Aluno> alunos = null;
    ArrayList<EventoAluno> eventoAluno = null;
    ArrayList<Aluno> alunosMatriculados = null;
            
    public BD(){
        this.eventos = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.alunosMatriculados = new ArrayList<>();
        this.eventoAluno = new ArrayList<>();
    }
    
    public void cadastrarEvento(Evento evento){
        System.out.println("Vento Cadastrado com Sucesso");
        this.eventos.add(evento);        
    }
    
    public void alterarEvento(Evento evento, int codigoEvento){
        System.out.println("Evento alterado com Sucesso");
        this.eventos.set(codigoEvento, evento);
    } 
    
    public void excluirEvento(int codigoEvento){
        System.out.println("Evento Excluído com Sucesso");
        this.eventos.remove(codigoEvento);
    }
    
    public ArrayList<Evento> getEventos(){
        return eventos;
    }
    
    public void cadastrarAluno(Aluno aluno){
        System.out.println("Aluno Cadastrado com Sucesso");
        this.alunos.add(aluno);
    } 
    
    public void alterarAluno(Aluno aluno, int codigoAluno){
        System.out.println("Aluno Alterado com Sucesso");
        this.alunos.set(codigoAluno, aluno);
    }  
    
    public void excluirAluno(int codigoAluno){
        System.out.println("Aluno Excluído com Sucesso");
        this.alunos.remove(codigoAluno);
    }
    
    public ArrayList<Aluno> getAlunos(){
        return alunos;
    }
    
    public ArrayList<Aluno> getAlunosMtriculados(String codEvento){
        alunosMatriculados.clear();
        for (int i = 0; i < eventoAluno.size(); i++) {
            if(eventoAluno.get(i).getCodEvento().equals(codEvento)){
                System.out.println(alunos.get(Integer.parseInt(eventoAluno.get(i).getCodAluno())).getNome());
                alunosMatriculados.add(alunos.get(Integer.parseInt(eventoAluno.get(i).getCodAluno())));
            }
        }
        return alunosMatriculados;
    }
    
    public void matriculaAluno(EventoAluno eventoAluno){
        System.out.println("Aluno matriculado com sucesso");
        this.eventoAluno.add(eventoAluno);
    }
    
}
