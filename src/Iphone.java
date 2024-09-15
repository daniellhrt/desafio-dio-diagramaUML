public class Iphone {
    // Instâncias das funcionalidades
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    // Construtor que inicializa as funcionalidades
    public Iphone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    // Métodos para acessar as funcionalidades

    // Métodos relacionados ao ReprodutorMusical
    public void tocarMusica() {
        reprodutorMusical.tocar();
    }

    public void pausarMusica() {
        reprodutorMusical.pausar();
    }

    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    // Métodos relacionados ao AparelhoTelefonico
    public void ligarPara(String numero) {
        aparelhoTelefonico.ligar(numero);
    }

    public void atenderChamada() {
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioDeVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    // Métodos relacionados ao NavegadorInternet
    public void exibirPagina(String url) {
        navegadorInternet.exibirPagina(url);
    }

    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }
}
