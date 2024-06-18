package iphone.aplicativos;

import iphone.aplicativos.aparelhotelefonico.AparelhoTelefonico;
import iphone.aplicativos.navegadorinternet.NavegadorInternet;
import iphone.aplicativos.reprodutormusical.ReprodutorMusical;

public class Aplicativo implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    @Override
    public void tocar() {
        System.out.println("Iphone está tocando sua musica");
    }

    @Override
    public void pausar() {
        System.out.println("Iphone está pausando sua musica");
    }

    @Override
    public void selecionarMusica(String musica) {

        System.out.println("Iphone está selecionando a musica: "+musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Navegador está exibindo o site: "+url);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Navegador está abrindo uma nova aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Navegador está atualizando a pagina");

    }

    @Override
    public void ligar(String numero) {
        System.out.println("Iphone está ligando para: "+numero);

    }

    @Override
    public void atender() {
        System.out.println("Iphone atendeu a chamada");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iphone está iniciando correio de voz");

    }
}