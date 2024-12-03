package br.com.alura.literalura.principal;

import java.util.Scanner;

public class Principal {

    private Scanner scan = new Scanner(System.in);

    private String ENDERECO = "https://gutendex.com/books?search=";

    public void exibeMenu() {
        int i = 9;

        while (i != 0){
            System.out.println("""
                    --------------------------------
                    Digite um número para começar:
                    
                    1 - Buscar um livro pelo título
                    0 - Sair
                    """);
        }
        
        switch (i){
            case 1:
                buscaLivroPorTitulo();
                break;
        }
    }

    private void buscaLivroPorTitulo() {
        System.out.println("Insira o título do livro: ");
        var titulo = scan.nextLine();

    }
}
