package java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Jean");
        palavras.add("Carlos");
        palavras.add("Ana");
        palavras.add("José");

        //palavras.sort((s1,s2) -> Integer.compare(s1.length(),s2.length()));

        //palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));

        Function<String,Integer> funcao = String::length;
        Function<String,Integer> funcao2 = s -> s.length();

        Function<String,Integer> funcao3 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        Comparator<String> comparator = Comparator.comparing(funcao3);
        palavras.sort(comparator);

        System.out.println(palavras);
        Consumer<String> impressor = s -> System.out.println(s);
        palavras.forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------------------------");
        palavras.forEach(System.out::println);
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
