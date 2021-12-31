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
/*
        int a = 5;
        int b = 3;
        System.out.println("Olá, Dio! " + (a+b));
*/
    }
}
