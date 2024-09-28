package exercicio2;

import java.time.LocalDateTime;

public class ProdutoPerecivel extends Produto {
    
    private LocalDateTime validade;

    public ProdutoPerecivel(String nome, int quantidade, LocalDateTime validade) {
        super(nome, quantidade);
        this.validade = validade;
    }

    public LocalDateTime getValidade() {
        return validade;
    }

    public void setValidade(LocalDateTime validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel [validade=" + validade + "]";
    }

    @Override
    public void mainMercado() {
        System.out.println("validade de acordo com a embalagem");
        throw new UnsupportedOperationException("Unimplemented method 'mainMercado'");
    }
}
