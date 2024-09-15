public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Usando funcionalidades do IPhone
        iphone.tocarMusica();
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.pausarMusica();

        iphone.ligarPara("123456789");
        iphone.atenderChamada();
        iphone.iniciarCorreioDeVoz();

        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
