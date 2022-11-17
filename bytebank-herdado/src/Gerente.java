public class Gerente extends FuncionarioAutenticavel {
    public double getBonificacao(){
        System.out.println("chamando a bonificação do gerente.");
        return super.getSalario();
    }
}
