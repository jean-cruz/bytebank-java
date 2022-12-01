package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {
    public static void main(String[] args) {
        int idade1 = 29;
        int idade2 = 39;
        int idade3 = 49;
        int idade4 = 59;
        int idade5 = 69;
        //Array []
        int[] idades = new int[5];

        idades[0] = idade1;
        idades[1] = idade2;
        idades[2] = idade3;
        idades[3] = idade4;
        idades[4] = idade5;

        System.out.println(idades[4]);
        System.out.println(idades.length);

        for (int i=0;i<idades.length;i++){
            idades[i] = i * i;
        }
        for (int i=0;i<idades.length;i++){
            System.out.println(idades[i]);
        }

    }
}
