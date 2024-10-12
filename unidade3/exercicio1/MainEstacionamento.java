package unidade3.exercicio1;

public class MainEstacionamento {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();

        Veiculo veiculo1 = new Veiculo(null, null)
        Veiculo veiculo2 = new Veiculo(null, null)
        Veiculo veiculo3 = new Veiculo(null, null)

        try {
            System.out.println("Adicionando...");
            estacionamento.adicionar(veiculo1);
            estacionamento.adicionar(veiculo2);
            estacionamento.adicionar(veiculo3);
            System.out.println("3 veículos adicionados. ");

            System.out.println("Removendo...");
            estacionamento.remover(null);
            estacionamento.remover(null);
            System.out.println("! veículo removido. ");
        }catch (VeiculoNaoEncontradoException e){

        }
    }

}