package Java;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("123456789",64, 89);

        iphone.ligar();
        iphone.selecionarMusica();
        iphone.tocarMusica();
        iphone.pausarMusica();

        iphone.enviarMensagem("61988888888", "Olá, vou te ligar, me atenda por favor.");
        iphone.fazerChamada("61 988888888");

        iphone.navegarInternet("https://www.youtube.com/watch?v=9ou608QQRq8");

        iphone.desligar();

    }
}
