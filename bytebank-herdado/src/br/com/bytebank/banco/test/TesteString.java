package br.com.bytebank.banco.test;

public class TesteString {
    public static void main(String[] args) {

        int a = 3;
        String nome = "Alura"; //object literal
        //String outro = new String("Alura");
        String novaStringReplace = nome.replace("A","a");
        String novaStringLowerCase = nome.toLowerCase();
        String novaStringUpperCase = nome.toUpperCase();

        char c = 'A';
        char d = 'A';

        String outro = nome.replace("A","a");

        System.out.println("String :"+nome);
        System.out.println("replace char:"+nome.replace(c,d));
        System.out.println("replace string"+nome.replace("A","a"));
        System.out.println("toLowerCase:"+nome.toLowerCase());
        System.out.println("toUpperCase:"+nome.toUpperCase());
        System.out.println("charAt :"+nome.charAt(2));
    }
}
