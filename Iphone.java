public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("O aparelho telefonico esta ligando");
    }

    @Override
    public void atender() {
        System.out.println("O aparelho telefonico esta atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("O aparelho telefonico esta iniciando o correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("O navegador de internet esta exibindo uma pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("O navegador de internet esta adicionando uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("O navegador de internet esta atualizando a pagina");
    }

    @Override
    public void tocar() {
        System.out.println("O reprodutor musical esta tocando");
    }

    @Override
    public void pausar() {
        System.out.println("O reprodutor musical esta pausado");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("O reprodutor musical esta selecionando uma musica");
    }
}
