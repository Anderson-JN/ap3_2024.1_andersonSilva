package exercicio2;

public class ProdutoVestuario extends Produto {
    private String tamanho;

    public ProdutoVestuario(String nome, int quantidade, String tamanho) {
        super(nome, quantidade);
        this.tamanho = tamanho;
    }
    

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "ProdutoVestuario [tamanho=" + tamanho + "]";
    }


    @Override
    public void mainMercado() {
        System.out.println("validade de 1 ano");
        throw new UnsupportedOperationException("Unimplemented method 'mainMercado'");
    }
}
