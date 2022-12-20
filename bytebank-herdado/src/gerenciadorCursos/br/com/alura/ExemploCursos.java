package gerenciadorCursos.br.com.alura;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploCursos {
    public static void main(String[] args) {
        List<CursoExemplo> cursos = new ArrayList<CursoExemplo>();
        cursos.add(new CursoExemplo("Python", 45));
        cursos.add(new CursoExemplo("JavaScript", 150));
        cursos.add(new CursoExemplo("Java 8", 113));
        cursos.add(new CursoExemplo("C", 55));

        cursos.sort(Comparator.comparingInt(CursoExemplo::getAlunos));
        cursos.forEach(c -> System.out.println(c.getNome()));
        System.out.println("-------------------------------------------");
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .forEach(c -> System.out.println(c.getNome()));
        System.out.println("-------------------------------------------");
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .map(CursoExemplo::getAlunos)
                .forEach(System.out::println);
        System.out.println("-------------------------------------------");
        int sum = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(CursoExemplo::getAlunos)
                .sum();
        System.out.println(sum);

        Stream<String> nomes = cursos.stream().map(CursoExemplo::getNome);
        nomes.forEach(System.out::println);
        System.out.println("----------------------------------------------");

       // Optional<CursoExemplo> optionalCursoExemplocurso =
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

        //CursoExemplo curso = optionalCursoExemplocurso.orElse(null);
        //System.out.println(curso.getNome());
        //optionalCursoExemplocurso.ifPresent(c -> System.out.println(c.getNome()));
        System.out.println("----------------------------------------------");
        OptionalDouble media = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(CursoExemplo::getAlunos)
                .average();
        System.out.println("----------------------------------------------");
        cursos = cursos.stream()
                .filter(c->c.getAlunos() >= 100)
                .collect(Collectors.toList());
        cursos.forEach(cursoExemplo -> System.out.println(cursoExemplo.getNome()));
        System.out.println("----------------------------------------------");
        cursos.stream()
                .filter(c->c.getAlunos() >= 100)
                .collect(Collectors.toMap(c->c.getNome(),c->c.getAlunos()))
                .forEach((nome,alunos) -> System.out.println(nome + " tem "+alunos+" alunos"));

    }
}
class CursoExemplo {
    private String nome;
    private int alunos;

    public CursoExemplo(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}