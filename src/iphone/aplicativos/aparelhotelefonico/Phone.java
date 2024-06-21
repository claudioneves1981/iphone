package iphone.aplicativos.aparelhotelefonico;

import iphone.aplicativos.Aplicativo;

public class Phone extends Aplicativo{

    public Phone(){
    }

    public void ligar(String numero) {
        System.out.println("Iphone está ligando para: "+numero);

    }

    public void atender() {
        System.out.println("Iphone atendeu a chamada");

    }

    public void iniciarCorreioVoz() {
        System.out.println("Iphone está iniciando correio de voz");

    }
}
