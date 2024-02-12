import entity.Iphone;

public class App {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

        iphone.atualizarPagina();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

    }
    
}
