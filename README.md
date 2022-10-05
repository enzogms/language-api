
<h1 align="center"><img src="https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png" alt="drawing" width="200"/> <br> API Language</h1>
<p align="center">
   <img src="http://img.shields.io/static/v1?label=STATUS&message=CONCLUIDO&color=GREEN&style=for-the-badge"/>
   <br>
   <a href="https://enzogms.github.io/language-api-frontend/">Ver demonstração</a>
   <br>
</p>

<details>
  <summary>Índice</summary>
  <ol>
    <li>
      <a href="#descrição-do-projeto">Descrição do projeto</a>
    </li>
    <li>
      <a href="#-desafios-realizados-durante-a-imers%C3%A3o-dev">Desafios cumpridos</a>
    </li>
    <li><a href="#%EF%B8%8F-funcionalidades">Funcionalidades</a></li>
    <li><a href="#-exemplo-de-uso">Exemplo de uso</a></li>
    <li><a href="#-endpoints">Endpoints</a></li>
    <li><a href="#%EF%B8%8F-técnicas-e-tecnologias-utilizadas">Técnicas e tecnologias utilizadas</a></li>
    <li><a href="#-acesso-ao-projeto">Acesso ao projeto</a></li>
    <li><a href="#-agradecimentos">Agradecimentos</a></li>
  </ol>
</details>

# Descrição do projeto
API REST para ranqueamento por voto popular de diversas linguagens de programação. Desenvolvida durante a Imersão Java da Alura.


## 😋 Desafios realizados durante a imersão dev
 - [x] a)  Aplicar modificações parciais no recurso através do método PATCH, por exemplo, modificando o número de votos ou de pessoas que utilizam cada linguagem de programação.
 - [x] b) Devolver a listagem ordenada pelo ranking.
 - [x] c) Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST.
 - [x] d) Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada.

## ⚙️ Funcionalidades
 Aplicando regras de segurança de forma básica:
 - Método get, put, post, patch e delete (autorização necessária para o CRUD completo de uma linguagem).
 - Método get com acesso público
 - Método patch (para alteração no rank) com acesso público.
 
## 🔨 Exemplo de uso

![](https://github.com/enzogms/language-api/blob/main/d32fca8d-3041-4273-99a5-b411ea559bf9.gif?raw=true)
<a href="https://enzogms.github.io/language-api-frontend/">Ver demonstração</a>

## 📥 Endpoints

|     Método     |                             URL                            |                                                                      Body                                                                      |
|:--------------:|:----------------------------------------------------------:|:----------------------------------------------------------------------------------------------------------------------------------------------:|
|       GET      |     https://enzo-linguagens-api.herokuapp.com/api/list     |                                    JSON contendo nome, image(url) e rank de todas as linguagens cadastradas.                                   |
|      POST      |    https://enzo-linguagens-api.herokuapp.com/linguagens    | {"title":"LUA","image":"https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/lua/lua_256x256.png","ranking":6} |
|      PATCH     | https://enzo-linguagens-api.herokuapp.com//linguagens/{id} | {"title":"C","image":"https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/c/c_256x256.png"}                   |
|     DELETE     | https://enzo-linguagens-api.herokuapp.com//linguagens/{id} |                                                                       NO                                                                       |
|       PUT      | https://enzo-linguagens-api.herokuapp.com//linguagens/{id} | { "title":"C Sharp" }                                                                                                                          |
| PATCH FOR VOTE | https://enzo-linguagens-api.herokuapp.com/api/vote&{title} |                                                                       NO                                                                       |
## ✔️ Técnicas e tecnologias utilizadas
- Java 18
- Spring Framework
- MongoDb
- Maven

## 📁 Acesso ao projeto
Você pode acessar os arquivos do projeto clicando [aqui](https://github.com/enzogms/language-api/tree/main/src/main/java/br/com/alura/linguagens/api).

## 🙏🏻 Agradecimentos
- [Tania Rascia](https://www.taniarascia.com/how-to-connect-to-an-api-with-javascript/)
- [Imersão Dev](https://imersao.dev/)
- [Baeldung](https://www.baeldung.com/)

