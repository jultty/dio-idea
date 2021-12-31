package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Gato neguinha = new Gato("Neguinha", "preta", 2);
        Gato bethania = new Gato("Bethânia","preta",11);

        System.out.println(gato);
        System.out.println(neguinha);
        System.out.println(bethania);

        Livro livro1 = new Livro("O Problema dos 3 Copos", 300);

        System.out.println(livro1);

        /*
        int a = 5;
        int b = 3;
        System.out.println("Olá, Dio! " + (a+b));
        */
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}