package exercicio2;

public class ProdutoEletronico extends Produto {
    
    private VOLTAGEM voltagem;

    public ProdutoEletronico(String nome, int quantidade, VOLTAGEM voltagem) {
        super(nome, quantidade);
        this.voltagem = voltagem;
    }

    public VOLTAGEM getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(VOLTAGEM voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return "produtoEletronico [voltagem=" + voltagem + "]";
    }

    @Override
    public void mainMercado() {
        System.out.println("Validade infinita");
    }
}
