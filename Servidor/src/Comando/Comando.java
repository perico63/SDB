/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comando;

import Controle.Aluno;
import Controle.BD;
import Controle.Evento;
import Controle.EventoAluno;
import java.util.ArrayList;

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
        for (int i = 0; i < banco.getEventos().size(); i++) {            
            todosEventos = todosEventos.concat(i + ";" + banco.getEventos().get(i).getNome() + ";" + 
                    banco.getEventos().get(i).getData() + ";" + banco.getEventos().get(i).getHoraInicial() + ";" 
                    + banco.getEventos().get(i).getHoraFinal() + ";" + banco.getEventos().get(i).getTipoEvento());
            
            if(i != banco.getEventos().size()-1)
                todosEventos = todosEventos.concat("|");                
        }
        System.out.println(todosEventos);
        return todosEventos;
    }
    
    public boolean cadastroAluno(String ra, String nome, String curso, String periodo, String email, String telefone){
        Aluno novoaluno = new Aluno(ra, nome, curso, periodo, email, telefone);
        System.out.println("Obj Aluno Criado");
        banco.cadastrarAluno(novoaluno);
        return true;
    }
    
    public boolean alterarAluno(int codigoAluno, String ra, String nome, String curso, String periodo, 
            String email, String telefone){        
         Aluno novoaluno = new Aluno(ra, nome, curso, periodo, email, telefone);
         banco.alterarAluno(novoaluno, codigoAluno);
         return true;
    }
    
    public boolean excluirAluno(int codigoAluno){
        banco.excluirAluno(codigoAluno);
        return true;
    }
    
    public boolean matricularAluno(String codAluno, String codEvento){        
        for (int i = 0; i < banco.getEventoAluno().size(); ++i){
            if(banco.getEventoAluno().get(i).getCodEvento().equals(codEvento) && 
                    banco.getEventoAluno().get(i).getCodAluno().equals(codAluno)){
                return false;
            }
        }
        EventoAluno novoEventoAluno = new EventoAluno(codEvento, codAluno);
        System.out.println("Obj MATRICULA EventoAluno Criado");
        banco.matriculaAluno(novoEventoAluno);
        return true;
    }
    
    public String getAllAlunos(){
        String todosAlunos = "28|";
        for (int i = 0; i < banco.getAlunos().size(); i++) {            
            todosAlunos = todosAlunos.concat(i + ";" + banco.getAlunos().get(i).getRa()+ ";" + 
                    banco.getAlunos().get(i).getNome() + ";" + banco.getAlunos().get(i).getCurso() + ";" 
                    + banco.getAlunos().get(i).getPeriodo() + ";" + banco.getAlunos().get(i).getEmail() 
                    + ";" + banco.getAlunos().get(i).getTelefone());            
            if(i != banco.getAlunos().size()-1)
                todosAlunos = todosAlunos.concat("|");                
        }
        System.out.println(todosAlunos);
        return todosAlunos;
    }
    
    public String getAlunosMatriculados(String codEvento){
        String alunosMatriculados = "34|";
        ArrayList<Aluno> arrayAlunosMatriculados = banco.getAlunosMtriculados(codEvento);
        System.out.println("QUANTIDADE DE ALUNOS MATRICULADOS " + arrayAlunosMatriculados.size());                
        for (int i = 0; i < arrayAlunosMatriculados.size(); i++) {            
            alunosMatriculados = alunosMatriculados.concat(i + ";" + arrayAlunosMatriculados.get(i).getRa()+ ";" + 
                    arrayAlunosMatriculados.get(i).getNome() + ";" + arrayAlunosMatriculados.get(i).getCurso() + ";" 
                    + arrayAlunosMatriculados.get(i).getPeriodo() + ";" + arrayAlunosMatriculados.get(i).getEmail() 
                    + ";" + arrayAlunosMatriculados.get(i).getTelefone());            
            if(i != arrayAlunosMatriculados.size()-1)
                alunosMatriculados = alunosMatriculados.concat("|");          
            System.out.println("valor do I " + i);
        }
        System.out.println("STRING " + alunosMatriculados);
        return alunosMatriculados;
    }
}
