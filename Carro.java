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
public class Carro {
    
        boolean estadoVeiculo;
        String marca;
        String modelo;
        String placa;
        String nomeDoDono;
        String chassi;
        float velocimetro;
        
        void ligar(){
            boolean estadoVeiculo = true; 
            System.out.println("ligado");
        }
        void desligar(){
            boolean estadoVeiculo = false;
            System.out.println("desligado");
        }
        void acelerar(){
            System.out.println("acelerando");
        }
        void frear(){
            System.out.println("freiando");
        }
    
}
