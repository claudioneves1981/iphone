package iphone.aplicativos.navegadorinternet;

import iphone.aplicativos.Aplicativo;

public class Navigator extends Aplicativo{

    public Navigator(){

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
}
