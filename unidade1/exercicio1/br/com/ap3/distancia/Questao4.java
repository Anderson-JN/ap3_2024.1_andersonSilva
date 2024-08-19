package br.com.ap3.distancia; //Xico - corrigindo: nome do pacote errado.

//Xico - corrigindo: faltou o seu codigo secreto.
//Xico - corrigindo: faltou o javadoc.

public class Questao4 { // Xico - corrigindo: Esse nome da classe não faz sentido. Devia ser Contato.
    String Nome;
    String Telefone;

    public Questao4(String Nome, String Telefone) {
        this.Nome = Nome;
        this.Telefone = Telefone;
    }

    public String getNomeMaiusculo() {
        return Nome.toUpperCase();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    @Override
    public String toString() {
        return "Questao4 [Nome=" + Nome + ", Telefone=" + Telefone + "]"; // Xico - corrigindo: o toString deve ter o
                                                                          // nome em maiúscula
    }
}
