public class EditorVideo extends Funcionario {
    public double getBonificacao(){
        System.out.println("chamando a bonificação do Editor de videos.");
        return super.getBonificacao() + 100;
    }

}
