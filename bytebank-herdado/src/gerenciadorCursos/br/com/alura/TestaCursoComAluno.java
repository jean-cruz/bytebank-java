package gerenciadorCursos.br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java","Paulo Silveira");

        //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",20));
        javaColecoes.adiciona(new Aula("Criando uma Aula",21));
        javaColecoes.adiciona(new Aula("Modelando comcoleções",24));

        Aluno a1 = new Aluno("Rodrigo Turini",34672);
        Aluno a2 = new Aluno("Guilherme Silverira",5617);
        Aluno a3 = new Aluno("Mauricio Aniche",17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> System.out.println(a));

        //javaColecoes.getAlunos().add(new Aluno("suheila",4445));
        //Set<String> nomes = Collections.emptySet();
        //nomes.add("Paulo"); //o que acontece aqui?
        //System.out.println(nomes);
        //Set<Aluno> alunosSincronizados = Collections.synchronizedSet(javaColecoes.getAlunos());
        //alunosSincronizados.forEach(a -> System.out.println(a));
    }

}
