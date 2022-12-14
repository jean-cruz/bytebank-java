package gerenciadorCursos.br.com.alura;

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>(); //TreeSet<>(); //HashSet<>(); //LinkedHashSet<>();
    private Map<Integer,Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        super();
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas(){
        return Collections.unmodifiableList(aulas);
    }
    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }
    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }
    public int getTempoTotal(){
        /*
        int tempoTotal = 0;
        for (Aula aula: aulas){
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
        */
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso:"+this.nome+", tempo total: "+this.getTempoTotal()+",aulas: "+this.aulas +" ]";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        matriculaParaAluno.put(aluno.getNumeroMatricula(),aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int numero) {
        /*
        for (Aluno aluno:alunos){
            if(aluno.getNumeroMatricula() == numero){
                return aluno;
            }
        }
        throw new NoSuchElementException("Matricula não encontrada");
         */
        if(!matriculaParaAluno.containsKey(numero)){
            throw new NoSuchElementException();
        }
        return matriculaParaAluno.get(numero);
    }
}
