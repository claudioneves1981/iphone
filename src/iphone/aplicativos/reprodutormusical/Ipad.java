package iphone.aplicativos.reprodutormusical;

import iphone.aplicativos.Aplicativo;

public class Ipad extends Aplicativo {

     public Ipad(){

     }

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


}
