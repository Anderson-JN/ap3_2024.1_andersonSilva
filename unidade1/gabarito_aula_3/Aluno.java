package gabarito_aula_3;

public class Aluno {

    String nomeDoAluno = "SemNome";
    double nota1;
    double nota2;
    double nota3;
    
    public String getNomeDoAlunoMaiusculo() {
        return nomeDoAluno.toUpperCase();
    }
    
    public String getNomeDoAlunoMinusculo() {
        return nomeDoAluno.toLowerCase();
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    @Override
    public String toString() {
        return "Aluno [nomeDoAluno=" + nomeDoAluno + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + "]";
    }

    

}
