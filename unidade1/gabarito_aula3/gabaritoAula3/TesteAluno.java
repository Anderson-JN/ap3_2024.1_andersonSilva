package gabarito_aula3.gabaritoAula3;

public class TesteAluno {

    public static void main(String[] args) {

        Aluno anderson = new Aluno();
        anderson.setNome("Anderson Rodrigues");
        anderson.setNota1(10);
        anderson.setNota2(0);
        anderson.setNota3(5);
        System.out.println();
        System.out.println(anderson);

        if (anderson.aprovadoMedia())
            System.out.println("Passou por média");
        else
            System.out.println("Não passou por média "  + anderson.getMedia());
}
}
