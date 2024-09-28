package exercicio3;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreveArquivoGigante {
    public static void main(String[] args) {
        String nomeDoArquivo = "Funcionario.csv";

        String[] nomes = { "cleiton rasta", "bob marley"};
        String[] departamento = { "jamaica" };
		
        Random random = new Random();
        boolean append = false;

        try {
            BufferedWriter arquivoCSV = new BufferedWriter(new FileWriter(nomeDoArquivo, append));
            for (int controle = 1; controle <= 8987411; controle++) {
                
                long idFuncionario = controle;
                String umNome = nomes [random.nextInt(nomes.length)];
                String umDepatarmento = departamento[random.nextInt(departamento.length)];
                double salario = 2000 + (20000 - 2000) * random.nextDouble()

                Funcionario funcionario = new Funcionario(idFuncionario, umNome, umDepatarmento, salario);
                arquivoCSV.write(funcionario.toString());
                arquivoCSV.newLine();

                if (controle % 1000 == 0) {
                    System.out.println("Progresso: " + controle + " nomes escritos.");
                }
            }
            arquivoCSV.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nAcabou!");
    }
}  
    

