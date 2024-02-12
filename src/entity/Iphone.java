package entity;


import interfaces.ReprodutorMusical;
import interfaces.NavegadorInternet;
import interfaces.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    public void ligar(){
        System.out.println("Ligando para contato");
    }

    public void atender(){
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina(){
        System.out.println("Mostrando página");
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página");
    }

    public void tocar(){
        System.out.println("Tocando música");
    }

    public void pausar(){
        System.out.println("Pausando música");
    }

    public void selecionarMusica(){
        System.out.println("Selecionando música");
    }
}
