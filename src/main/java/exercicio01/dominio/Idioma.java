package exercicio01.dominio;

public class Idioma {
    String nomeDoIdioma;
    public void saudacao(String nomeDoIdioma){
        if ( nomeDoIdioma == "Português"){
            System.out.println("Óla Mundo");
        }else if( nomeDoIdioma == "Inglês") {
            System.out.println("Hello World");
        }else if( nomeDoIdioma == "Húngaro"){
            System.out.println("Helló Világ");
        }else if(nomeDoIdioma == "Tcheco"){
            System.out.println("Ahoj Svete");
        }else {
            System.out.println("Insira um idioma válido ou confira se escreveu corretamente");
        }
    }

}
