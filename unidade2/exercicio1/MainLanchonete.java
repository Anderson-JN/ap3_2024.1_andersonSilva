package exercicio1;

public class MainLanchonete {

    public static void main(String[] args) {
        Produto hamburgao = new Produto("Hamhurgao", 15.00);
        Bebida refrigerante = new Bebida("Refrigerante", 5.00, 0.5);
        System.out.println(hamburgao);
        System.out.println(refrigerante);
    }
}
