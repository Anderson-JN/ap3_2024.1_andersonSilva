package br.com.ap3.distancia;
import java.util.Random;
import java.util.LinkedList;

public class Questao2 {
    public static void main(String[] args){
        LinkedList<Integer> valorAleatorio = new LinkedList<>();
        Random numeRandom = new Random();

        for (int i = 0; i < 9999; i++) {
            int random = numeRandom.nextInt();
            valorAleatorio.add(random);
        }
        int menorPositivo=Integer.MAX_VALUE;
        for(int nume:valorAleatorio){
            if ((nume > 0) && (nume < menorPositivo)){
                menorPositivo = nume;
            }
        }
        System.out.println("O menor numero positivo é: " +menorPositivo);
    }
        
}
