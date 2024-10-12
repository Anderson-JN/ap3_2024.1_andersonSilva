package unidade3.exercicio1;

public class VeiculoNaoEncontradoException extends Exception{
    public VeiculoNaoEncontradoException (String umaPlaca){
        super("ixi parceiro, Veiculo" + umaPlaca + "Nao encontrado!");
    }
    
}
