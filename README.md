# Projeto iPhone - Simulação de Funcionalidades

Este projeto simula as principais funcionalidades de um **iPhone** utilizando o conceito de composição entre classes em Java. A classe `IPhone` serve como uma interface que permite o uso de um **Reprodutor Musical**, **Aparelho Telefônico** e **Navegador de Internet**, oferecendo métodos para executar as funcionalidades de cada um desses dispositivos.

## Funcionalidades

### Reprodutor Musical
A classe `ReprodutorMusical` permite controlar a reprodução de músicas:
- **tocar()**: Inicia a reprodução de uma música.
- **pausar()**: Pausa a música em reprodução.
- **selecionarMusica(String musica)**: Seleciona uma música específica para tocar.

### Aparelho Telefônico
A classe `AparelhoTelefonico` implementa funcionalidades de telefonia:
- **ligar(String numero)**: Faz uma ligação para o número especificado.
- **atender()**: Atende uma chamada recebida.
- **iniciarCorreioVoz()**: Inicia o correio de voz.

### Navegador de Internet
A classe `NavegadorInternet` simula as funcionalidades de navegação:
- **exibirPagina(String url)**: Exibe a página da web fornecida pela URL.
- **adicionarNovaAba()**: Adiciona uma nova aba ao navegador.
- **atualizarPagina()**: Atualiza a página atual.

## Estrutura do Projeto

O projeto é estruturado em três classes principais para cada funcionalidade, e uma classe `IPhone` que conecta todas essas funcionalidades. Abaixo está um exemplo básico de como o diagrama UML do projeto se apresenta:

```mermaid
classDiagram
    class IPhone {
        +tocarMusica()
        +pausarMusica()
        +selecionarMusica(String musica)
        +ligarPara(String numero)
        +atenderChamada()
        +iniciarCorreioDeVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    IPhone --> ReprodutorMusical
    IPhone --> AparelhoTelefonico
    IPhone --> NavegadorInternet

    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
