/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import Mensagem.Mensagem;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author diego
 */
public class Servidor extends Thread {
    private static final BD banco = new BD();
    private Socket clientSocket;
    
    public Servidor(Socket clientSocket){
        this.clientSocket = clientSocket;
        start();
    }
    
    public static void main(String[] args) {
       
        int porta = 4321;        
        try {            
            ServerSocket serverSocket = new ServerSocket(porta);
            while(true){    
                 try{
                    System.out.println("Esperando CONEXOES...");
                    Socket client = serverSocket.accept();
                    new Servidor(client);
                } catch (IOException e) {
                    System.err.println("Falha na Conexao!");
                }
            }   
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public void run(){
        try{
            System.out.println("Novo Cliente Conectado!");
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            DataInputStream in = new DataInputStream(clientSocket.getInputStream()); 
            while(true) {                              
                Mensagem msg = new Mensagem(in.readUTF(), banco);
                String result = msg.avaliarMensagem();            
                out.writeUTF(result); 
            }            
        } catch(IOException e){
            
        }
    }
}
