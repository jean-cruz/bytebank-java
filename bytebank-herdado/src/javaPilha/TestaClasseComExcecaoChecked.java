package javaPilha;

public class TestaClasseComExcecaoChecked {
    public static void main(String[] args) {
        try{
            Vazio v = new Vazio();
            v.emBranco();
        }catch (MinhaExcecao ex) {
            System.out.println("tratamento....."+ex.getMessage());
        }
    }
}
