package gerenciadorCursos.br.com.alura;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Carlos",35);
        Funcionario f2 = new Funcionario("José",25);
        Funcionario f3 = new Funcionario("Jean",28);

        Set<Funcionario> funcionarioSet = new TreeSet<>(new OrdenaPorIdade());
        funcionarioSet.add(f1);
        funcionarioSet.add(f2);
        funcionarioSet.add(f3);

        Iterator<Funcionario> iterator = funcionarioSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getNome());
        }
    }
}
class OrdenaPorIdade implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario o1, Funcionario o2) {
       return  (o1.getIdade() - o2.getIdade());
    }
}
