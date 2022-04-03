/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po1;

public class Televisor {

    boolean ligado = true;
    String canal;
    int volume ;
    int numeroCanais;
    int volumeMax;
    
        void aumentarVolume(){
            System.out.println("voce aumentou o volume");
        }
        void abaixarVolume(){
            System.out.println("voce abaixou o volume");
        }
        void ligar(){
            boolean ligado = true; 
            System.out.println("ligado");
        }
        void desligar(){
            boolean ligado = false;
            System.out.println("desligado");
        }
        void alterarCanalParaCima(){
            System.out.println("voce avançou para o proximo canal");
        }
        void alterarCanalParaBaixo(){
            System.out.println("voce retrocedeu o canal");
        }
        
}    
