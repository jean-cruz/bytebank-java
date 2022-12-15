package java8;

import java.util.*;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Jean");
        palavras.add("Carlos");
        palavras.add("Ana");
        palavras.add("José");

        palavras.sort((s1,s2) -> Integer.compare(s1.length(),s2.length()));

        System.out.println(palavras);
        Consumer<String> impressor = s -> System.out.println(s);
        palavras.forEach(s -> System.out.println(s));
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
