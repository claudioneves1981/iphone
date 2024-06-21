import iphone.aplicativos.Aplicativo;
import iphone.aplicativos.aparelhotelefonico.Phone;
import iphone.aplicativos.navegadorinternet.Navigator;
import iphone.aplicativos.reprodutormusical.Ipad;

public class Iphone{

    public static void main(String[] args) {

        String app = "Reprodutor Musical";
        Aplicativo aplicativo;

        switch (app) {
            case "Reprodutor Musical" -> {
                aplicativo = new Ipad();
                aplicativo.selecionarMusica("Faroeste Caboclo");
                System.out.println("Executando Reprodutor Musical");
                aplicativo.tocar();
            }
            case "Navegador Internet" -> {
                aplicativo = new Navigator();
                System.out.println("Executando Navegador Internet");
                String url = "www.gooogle.com.br";
                aplicativo.exibirPagina(url);
            }
            case "Aparelho Telefonico" -> {
                aplicativo = new Phone();
                System.out.println("Executando Telefone");
                String numero = "999999999";
                aplicativo.ligar(numero);
            }
        }
    }
}
