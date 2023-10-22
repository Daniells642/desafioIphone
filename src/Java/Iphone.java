package Java;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String numeroDeSerie;
    private int capacidadeArmazenamento;
    private int bateria;

    public Iphone(String numeroDeSerie, int capacidadeArmazenamento, int bateria) {
        this.numeroDeSerie = numeroDeSerie;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.bateria = bateria;
    }

    public void ligar() {
        if (bateria > 0) {
            System.out.println("Ligando iPhone.");
        } else {
            System.out.println("O iPhone está sem bateria. Por favor, recarregue-o.");
        }
    }

    public void desligar() {
        System.out.println("Desligando iPhone.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para o número: " + numero);
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para o número " + numero + ": " + mensagem);
    }

    @Override
    public void navegarInternet(String url) {
        System.out.println("Navegando na internet em " + url);
    }
}
