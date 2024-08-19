package br.com.ap3.distancia;

public class Questao4 {
        String Nome;
        String Telefone;
        
        public Questao4(String Nome, String Telefone){
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
            return "Questao4 [Nome=" + Nome + ", Telefone=" + Telefone + "]";
        }       
}
