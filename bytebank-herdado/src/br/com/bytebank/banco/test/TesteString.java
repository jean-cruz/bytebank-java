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
        System.out.println("indexOf :"+nome.indexOf("ur"));
        System.out.println("substring :"+nome.substring(1));
        System.out.println("substring :"+nome.length());

        for (int i=0;i<nome.length();i++){
            System.out.print(nome.charAt(i));
        }
        System.out.println("");

        String vazio = "";
        System.out.println("isEmpty :"+vazio.isEmpty());
        System.out.println("isEmpty espaço:"+" ".isEmpty());
        System.out.println("Trim :"+" Jean Vinicius Santos da Cruz ".trim());
        System.out.println("contains :"+nome.contains("Alu"));
    }
}
