import iphone.aplicativos.Aplicativo;
import iphone.aplicativos.aparelhotelefonico.AparelhoTelefonico;
import iphone.aplicativos.navegadorinternet.NavegadorInternet;
import iphone.aplicativos.reprodutormusical.ReprodutorMusical;

public class Iphone {

    public static void main(String[] args) {

        String app = "Aparelho Telefonico";

        if(app == "Reprodutor Musical"){
            ReprodutorMusical aplicativo = new Aplicativo();
            System.out.println("Executando Reprodutor Musical");
            aplicativo.selecionarMusica("Faroeste Caboclo");
            aplicativo.tocar();
        }else if(app == "Navegador Internet"){
            NavegadorInternet aplicativo = new Aplicativo();
            System.out.println("Executando Navegador Internet");
            String url = "www.gooogle.com.br";
            aplicativo.exibirPagina(url);
        }else if( app == "Aparelho Telefonico"){
            AparelhoTelefonico aplicativo = new Aplicativo();
            System.out.println("Executando Telefone");
            String numero = "999999999";
            aplicativo.ligar(numero);
        }
    }
}
