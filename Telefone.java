/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po1;

/**
 *
 * @author User
 */
public class Telefone {
    
       String marca;
       String modelo;
       boolean estadoTelefone;
       
       void ligarTelefone(){
           System.out.println("ligado");
       }
       void desligarTelefone(){
           System.out.println("desligado");
       }
       void ligarParaContato(){
           System.out.println("ligando para X contato");
       }
       void desligarChamada(){
           System.out.println("desligando chamada");
       }
}
