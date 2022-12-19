package java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

import static java.util.Comparator.comparing;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("JeAn");
        palavras.add("CArlos");
        palavras.add("Ana");
        palavras.add("JoSé");

        System.out.println("original="+palavras);
        System.out.println("-----------------------------------------------------");
        palavras.sort((s1,s2) -> Integer.compare(s1.length(),s2.length()));
        System.out.println("sort pelo tamanho com lambda="+palavras);
        System.out.println("-----------------------------------------------------");
        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(comparing(String::length));
        System.out.println("sort pelo tamanho com method references="+palavras);
        System.out.println("-----------------------------------------------------");

        //Function<String,Integer> funcao = String::length;
        //Function<String,Integer> funcao2 = s -> s.length();

        Function<String,Integer> funcao3 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        Comparator<String> comparator = comparing(funcao3);
        palavras.sort(comparator);
        System.out.println("sort pelo tamanho com função anonima="+palavras);
        System.out.println("-----------------------------------------------------");

        Consumer<String> impressor = s -> System.out.println(s);
        palavras.forEach(s -> System.out.println(s));

        System.out.println("-----------------------------------------------------");
        System.out.println("Method references");
        palavras.forEach(System.out::println);
        System.out.println("-----------------------------------------------------");
        palavras.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("sort pelo case="+palavras);
        System.out.println("-----------------------------------------------------");
    }
}
class ImprimeNalinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
class ComparadorPorTamanho implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length())
                return -1;
        if(s1.length() > s2.length())
            return 1;
        return 0;
    }
}
