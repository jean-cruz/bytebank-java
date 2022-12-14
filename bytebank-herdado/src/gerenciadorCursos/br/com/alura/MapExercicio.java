package gerenciadorCursos.br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExercicio {
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

        pessoas.keySet().forEach(idade -> System.out.println(pessoas.get(idade)));

        Set<Integer> chaves = pessoas.keySet();
        for (Integer idade : chaves) {
            System.out.println(idade);
        }
        Collection<String> valores = pessoas.values();
        for (String nomes : valores) {
            System.out.println(nomes);
        }

        Set<Map.Entry<Integer,String>> associacoes = pessoas.entrySet();
        for (Map.Entry<Integer,String> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
    }
}
