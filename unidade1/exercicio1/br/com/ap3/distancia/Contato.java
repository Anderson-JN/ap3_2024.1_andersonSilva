package br.com.ap3.distancia;

public class Contato {
    public static void main(String[] args) {
        Questao4 info1 = new Questao4("Leonardo da Vinci", "+55(84)99999-9999");
        Questao4 info2 = new Questao4("Michelangelo", "+55(84)98888-8888");
        Questao4 info3 = new Questao4("Rafael", "+55(84)97777-7777");

        System.out.println("O pintor renascetista 1 é: "+info1.getNome() + ", O seu numero é: "+info1.getTelefone());
        System.out.println("O pintor renascetista 2 é: "+info2.getNome() + ", O seu numero é "+info2.getTelefone());
        System.out.println("O pintor renascetista 3 é: "+info3.getNome() +", O seu numero é "+info3.getTelefone());

    }
}
