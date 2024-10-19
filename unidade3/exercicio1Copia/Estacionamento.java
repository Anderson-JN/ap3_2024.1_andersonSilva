package unidade3.exercicio1Copia;

public class Estacionamento {
    
    private int capacidade = 12;
    private Veiculo[] osVeiculos = new Veiculo[capacidade];
    private int contador = 0;

    public synchronized void adicionar(Veiculo umVeiculo){
        if (contador < capacidade){
            osVeiculos[contador] = umVeiculo;
            contador++;
            System.out.println("Veiculo adicionado: "  + umVeiculo.getModelo());
        } else {
            System.out.println("Capacidade máxima atingida. Não é possivel adicionar mais livros. ");
        }
    }

    public synchronized void remover (String umaPlaca) throws VeiculoNaoEncontradoException{
        for (int i = 0; i < contador; i++) {
            if (osVeiculos[i].getModelo().equals(umaPlaca)){
                osVeiculos[i] = osVeiculos[contador - 1];
                osVeiculos[contador - 1] = null;
                contador--;
                System.out.println("Veiculo removido " + umaPlaca);
                return;
            }
            
        }
        throw new VeiculoNaoEncontradoException(umaPlaca);
    }

    
}
