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
public class Lampada {
    
    String marca;
    String modelo;
    String potencia;
    boolean estadoLampada;
    
        void ligar(){
            System.out.println("ligado");
        }
        void desligar(){
            System.out.println("desligado");
        }
}
