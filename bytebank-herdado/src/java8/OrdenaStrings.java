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

        Comparator<String> comparador = new ComparadorPorTamanho();
        palavras.sort(comparador);
        //Collections.sort(palavras,comparador);
        System.out.println(palavras);

        //for (String p: palavras) {
        //   System.out.println(p);
        //}

        Consumer<String> consumidor = new ImprimeNalinha();
        palavras.forEach(consumidor);
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
