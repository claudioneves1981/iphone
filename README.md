
## POO - Desafio

### LAB - Modelagem e Diagramação de um Componente iPhone
"
#### Funcionalidades
1. **Reprodutor Musical**
    - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
    - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
    - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

```mermaid
classDiagram
    Iphone --|> Aplicativo

    Aplicativo <|-- Phone 
    Aplicativo <|-- Navigator  
    Aplicativo <|-- Ipad  
    
    Phone <|--  AparelhoTelefonico 
    Navigator <|--  NavegadorInternet
    Ipad <|-- ReprodutorMusical    

    class Ipad{
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
    }
    class Phone{
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
    }
    class Navigator{
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }
```