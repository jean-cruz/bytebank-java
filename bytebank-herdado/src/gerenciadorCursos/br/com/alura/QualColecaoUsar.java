package gerenciadorCursos.br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class QualColecaoUsar {
    public static void main(String[] args) {
        Collection<Aluno> alunos = new HashSet<>();
        alunos.add(new Aluno("Jean",28));
        alunos.size();
        //System.out.println(alunos.get(0));
    }
}
