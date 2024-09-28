package exercicio2;

public class mainMercado {
    public static void main(String[] args) {
        semPolimorfismo()
    }

    public static void semPolimorfismo(){ 
    Produto produto = new Produto();
    ProdutoPerecivel perecivel = new ProdutoPerecivel();
    ProdutoPerecivel perecivel = new ProdutorEletronico();
    ProdutoVestuario vesturario = new ProdutoVestuario();

    boolean validadeProduto = produto.verificarValidade();
    boolean validadePerecivel = perecivel.verificarValidade();
    boolean validadeEletronico = eletronico.verificarValidade(); 
    boolean validadeVestuario = vestuario.verificarValidade();

        
    }


}
