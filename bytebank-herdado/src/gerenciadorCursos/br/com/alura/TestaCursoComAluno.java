package gerenciadorCursos.br.com.alura;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

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
        System.out.println("O aluno "+a1+" está matriculado ?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini",34672);
        System.out.println("E esse Turini, está matriculado ?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println("o a1 é igual ao turini ?"+(a1 == turini));
        System.out.println("equals ?"+a1.equals(turini));

        System.out.println(a1.hashCode() == turini.hashCode());

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while(iterador.hasNext()){
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }

        //Vector<Aluno> vetor = new Vector<>();
    }

}
