package iphone.aplicativos;

import iphone.aplicativos.aparelhotelefonico.AparelhoTelefonico;
import iphone.aplicativos.navegadorinternet.NavegadorInternet;
import iphone.aplicativos.reprodutormusical.ReprodutorMusical;

public abstract class Aplicativo implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    public Aplicativo() {

    }

    @Override
    public void ligar(String numero) {

    }

    @Override
    public void atender() {

    }

    @Override
    public void iniciarCorreioVoz() {

    }

    @Override
    public void exibirPagina(String url) {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica(String musica) {

    }
}