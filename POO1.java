/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po1;

//acessor calsse + classe + nomeDaClasse
import java.util.Scanner;

public class POO1 { // inicio classe

    //metodo
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        //receita do bolo + bolo = criando o bolo

        Cachorro scooby = new Cachorro();
        scooby.idade = 10;
        scooby.nome = "Scooby";

        scooby.latir();
        scooby.rolar();
        scooby.uivar();
        scooby.deitar();

        System.out.println("-----------------------------------"
                + " \n ----------------------------------");

        Carro carro = new Carro();
        carro.chassi = "9BR45ag5f0278000160";
        carro.estadoVeiculo = true;
        carro.marca = "Ford";
        carro.modelo = "Onix 2021";
        carro.placa = "ALA2068";
        carro.velocimetro = 5000;

        carro.ligar();
        carro.acelerar();
        carro.frear();
        carro.desligar();

        System.out.println("-----------------------------------"
                + " \n ----------------------------------");

        Geladeira geladeira = new Geladeira();
        geladeira.ligado = true;
        geladeira.portaFechada();

        System.out.println("-----------------------------------"
                + " \n ----------------------------------");

        Lampada lampada = new Lampada();
        lampada.estadoLampada = true;
        lampada.marca = "Philips";
        lampada.modelo = "Bulbo";
        lampada.potencia = "16w";
        lampada.ligar();
        lampada.desligar();

        System.out.println("-----------------------------------"
                + " \n ----------------------------------");

        Telefone telefone = new Telefone();
        telefone.estadoTelefone = true;
        telefone.marca = "Apple";
        telefone.modelo = "Iphone 12";
        telefone.ligarTelefone();
        telefone.ligarParaContato();
        telefone.desligarChamada();
        telefone.desligarTelefone();

        System.out.println("-----------------------------------"
                + " \n ----------------------------------");

        Televisor tv = new Televisor();

        tv.canal = "TNT";
        tv.ligado = true;
        tv.numeroCanais = 10;
        tv.volumeMax = 50;
        tv.volume = 22;

        tv.ligar();
        tv.alterarCanalParaCima();
        tv.alterarCanalParaBaixo();
        tv.aumentarVolume();
        tv.abaixarVolume();
        tv.desligar();

        System.out.println("-----------------------------------"
                + " \n ----------------------------------");

        retangulo retangulo = new retangulo();
        retangulo.area = 2500;
        retangulo.comprimento = 50;
        retangulo.largura = 50;
        retangulo.perimetro = 200;

        retangulo.calcularArea();
        retangulo.calcularPerimetro();

    } // final classe

}
