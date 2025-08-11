public class Main {
    public static void main(String[] args) {
        // Cria uma nova instância da classe iPhone
        Iphone meuIPhone = new Iphone();

        System.out.println("--- Testando Funcionalidades do Reprodutor Musical ---");
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica();
        System.out.println();

        System.out.println("--- Testando Funcionalidades do Aparelho Telefonico ---");
        meuIPhone.ligar();
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        System.out.println();

        System.out.println("--- Testando Funcionalidades do Navegador de Internet ---");
        meuIPhone.exibirPagina();
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}