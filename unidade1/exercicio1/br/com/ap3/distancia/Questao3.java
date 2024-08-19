package br.com.ap3.distancia;
import java.util.Scanner;
//Xico - corrigindo: faltou o seu codigo secreto.
//Xico - corrigindo: faltou o javadoc.
public class Questao3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos quilos de latão você quer produzir?: ");
        double quantidadeLatao = scanner.nextDouble(); 
        double porcentagemCobre = 0.70;  
        double porcentagemZinco = 0.30;  

        double quantidadeCobre = quantidadeLatao * porcentagemCobre;
        double quantidadeZinco = quantidadeLatao * porcentagemZinco;
 
        System.out.println("Para produzir "+ quantidadeLatao +  " quilos de latão, você precisa de: ");
        System.out.println(quantidadeCobre + " quilos de cobre. ");
        System.out.println(quantidadeZinco + " quilos de zinco. ");
        scanner.close();
    }
}
